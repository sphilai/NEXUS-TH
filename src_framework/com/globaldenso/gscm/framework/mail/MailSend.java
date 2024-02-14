/*
 * PROJECT：GSCM 共通機能群
 * PROJECT：GSCM Common Functions
 *
 * GSCM共通のメール送信クラス
 * GSCM Mail Sending Common Class
 *
 * Version.
 * 1.0.0
 *
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.gscm.framework.mail;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.ai.common.core.mailsend.AiMailSend;
import com.globaldenso.ai.common.core.util.Props;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;

/**
 * メール送信クラス
 * Mail sending class
 *
 * @author $Author: 400616000304 $
 * @version $Revision: 10885 $
 */
public class MailSend {

    /** 送信可能ファイルサイズ上限（デフォルト値） */
    /** Limit size for mail sending (Default value) */
    private static final long DEFAULT_LIMIT_MAIL_SIZE = 1024 * 1024;

    /** 送信間隔（デフォルト値 */
    /** Sending intervals(Default value */
    private static final int DEFAULT_SEND_INTERVAL = 1;

    /** プロパティファイル名 */
    /** Name of property file */
    private static final String DEFAULT_PROP_FILE_NAME = "AiMail";

    /** 送信可能ファイルサイズのプロパティファイルのキー */
    /** Property file key of limit size for mail sending */
    private static final String LIMIT_MAIL_SIZE_KEY = "limitMailSize";

    /** 送信間隔のプロパティファイルのキー */
    /** Property file key of sending intervals */
    private static final String SEND_INTERVAL_KEY = "sendInterval";

    /** 送信可能ファイルサイズのチェックでエラーになったときにコード */
    /** Error Code for excessing the limit mail size */
    private static final String LIMIT_MAIL_SIZE_ERROR_CODE = "GSCM-E0-0006";

    /** 前回送信日時 全インスタンスで共有する */
    /** Last sending time(Share for all instance)*/
    private static Calendar lastSendDatetime = new GregorianCalendar(0, Calendar.JANUARY, 1);

    /** ログクラス */
    /** Log class */
    private static Logger LOG = Logger.getLogger(MailSend.class);

    /** AI-Commonのメール送信クラス */
    /** Mail sending class of AI-Common */
    private AiMailSend aiMailSend = null;

    /** 送信可能ファイルサイズ上限 */
    /** Limit size for mail sending */
    private long limitMailSize = 0;

    /** 送信間隔 */
    /** Sending intervals */
    private int sendInterval = 0;

    /**
     *
     * デフォルトコンストラクタ。
     * Default constructor
     *
     */
    public MailSend() {
        aiMailSend = new AiMailSend();
        loadProperties(DEFAULT_PROP_FILE_NAME);
    }

    /**
     *
     * 送信設定用プロパティファイル指定コンストラクタ。
     * Specified constructor for sending mail property file
     *
     * @param propFileName プロパティファイル名
     * @param propFileName Name of property file
     */
    public MailSend(String propFileName) {
        aiMailSend = new AiMailSend(propFileName);
        loadProperties(propFileName);
    }

    /**
     *
     * メール送信
     * Send mail
     *
     * <p>
     * メールを送信する。
     * Send mail
     * 送信可能ファイルサイズはプロパティファイルのサイズ
     * Limit file size for mail sending is specified at property file
     * 送信間隔はプロパティファイルの間隔
     * Sending intervals is specified at property file
     * </p>
     *
     * @param mailInfoDomain メール送信用Domain
     * @param mailInfoDomain Domain for sending mail
     * @throws GscmApplicationException メールサイズエラー
     * @throws GscmApplicationException Exception of mail size
     * @throws ApplicationException 送信エラー
     * @throws ApplicationException ApplicationException
     */
    public void mailSend(MailInfoDomain mailInfoDomain) throws GscmApplicationException, ApplicationException {
        mailSend(mailInfoDomain, this.limitMailSize, this.sendInterval);
    }

    /**
     *
     * メール送信
     * Send mail
     *
     * <p>
     * メールを送信する。
     * Send mail
     * 送信可能ファイルサイズは指定のサイズ
     * Limit file size for mail sending is a specified size
     * 送信間隔は指定の間隔
     * Sending interval is a specified interval
     * </p>
     *
     * @param mailInfoDomain メール送信用Domain
     * @param mailInfoDomain Domain for sending mail
     * @param limitMailSize 送信可能ファイルサイズ(KB)
     * @param limitMailSize Limit file size for mail sending(KB)
     * @param sendInterval 送信間隔(秒)
     * @param sendInterval Sending intervals(second)
     * @throws GscmApplicationException メールサイズエラー
     * @throws GscmApplicationException Exception of mail size
     * @throws ApplicationException 送信エラー
     * @throws ApplicationException ApplicationException
     */
    public void mailSend(MailInfoDomain mailInfoDomain, Long limitMailSize, Integer sendInterval) throws GscmApplicationException, ApplicationException {

        // サイズチェック
        // Size check
        if (limitMailSize == null) {
            limitMailSize = this.limitMailSize;
        }
        if (sendInterval == null) {
            sendInterval = this.sendInterval;
        }
        checkMailSize(mailInfoDomain, limitMailSize);

        synchronized (lastSendDatetime) {
            // 送信間隔チェック
            // Sending intervals check
            waitInterval(sendInterval);

            aiMailSend.mailSend(mailInfoDomain);


            lastSendDatetime = GregorianCalendar.getInstance();
            if (LOG.isDebugEnabled()) {
                LOG.debug(String.format("Send mail = %s", SimpleDateFormat.getDateTimeInstance().format(lastSendDatetime.getTime())));
            }
        }
    }

    /**
     *
     * メールサイズのチェック
     * Mail size check
     *
     * <p>
     * 本文＋添付ファイルのサイズが上限を超えていないかチェック
     * validate whether size of body and attachment is over limit size
     * </p>
     *
     * @param mailInfoDomain メール送信用Domain
     * @param mailInfoDomain Domain for sending mail
     * @param limitMailSize 送信可能ファイルサイズ(KB)
     * @param limitMailSize Limit file size for mail sending(KB)
     * @throws GscmApplicationException ファイルサイズエラー
     * @throws GscmApplicationException Exception of file size
     */
    private void checkMailSize(MailInfoDomain mailInfoDomain, long limitMailSize) throws GscmApplicationException {
        String contents = mailInfoDomain.getContents();

        // マイナスが指定されている場合はチェックなし
        // If value of minus is specified,check process is not executed
        if (limitMailSize < 0) {
            return;
        }

        long mailSize = 0L;

        // 本文のバイト数
        // Bytes size of body
        if (contents != null) {
            mailSize = contents.getBytes().length;
            if (LOG.isDebugEnabled()) {
                LOG.debug(String.format("Contents size = %d", mailSize));
            }
        }

        // 添付ファイルのバイト数
        // Bytes size of attachment
        List<String> attachFiles = mailInfoDomain.getAttachFile();
        if (attachFiles != null) {
            long fileSize = 0L;
            for(String attachFilePath : attachFiles) {
                File attachFile = new File(attachFilePath);
                if (attachFile.isFile()) {
                    fileSize = fileSize + attachFile.length();
                }
            }
            if (LOG.isDebugEnabled()) {
                LOG.debug(String.format("File size = %d", fileSize));
            }
            mailSize = mailSize + fileSize;
        }
        if (LOG.isDebugEnabled()) {
            LOG.debug(String.format("mailSize = %d", mailSize));
            LOG.debug(String.format("limitMailSize - mailSize = %d", limitMailSize - mailSize));
        }

        // チェック
        // Validate mail size
        if (mailSize > limitMailSize) {
            Object[] args = new Object[]{limitMailSize, mailSize};
            throw new GscmApplicationException(LIMIT_MAIL_SIZE_ERROR_CODE, args);
        }
    }

    /**
     *
     * 指定時間送信を待つ
     * Wait sending mail for specified time
     *
     * <p>
     * 前回の送信時間から指定された送信間隔の時間待つ
     * Wait for sending intervals from last sending time
     * </p>
     *
     * @param sendInterval 送信間隔
     * @param sendInterval Sending intervals
     */
    private synchronized void waitInterval(int sendInterval) {

        // マイナスが指定されている場合はチェックなし
        // If value of minus is specified,check process is not executed
        if (sendInterval < 0) {
            return;
        }

        Calendar now = GregorianCalendar.getInstance();
        now.add(Calendar.SECOND, sendInterval * -1);

        if (LOG.isDebugEnabled()) {
            LOG.debug(String.format("lastSendDatetime = %s", SimpleDateFormat.getDateTimeInstance().format(lastSendDatetime.getTime())));
            LOG.debug(String.format("now = %s", SimpleDateFormat.getDateTimeInstance().format(now.getTime())));
        }

        if (now.before(lastSendDatetime)) {

            long waitTime = lastSendDatetime.getTimeInMillis() - now.getTimeInMillis();

            if (LOG.isDebugEnabled()) {
                LOG.debug(String.format("waitTime = %d", waitTime));
            }

            try {
                TimeUnit.MILLISECONDS.sleep(waitTime);
            } catch (InterruptedException e) {
                // スレッドに割り込みが入ったら、インフォメーションログを出力する
                // If InterruptedException occurs,write information message into log.
                if (LOG.isInfoEnabled()) {
                    LOG.info(e.getMessage(), e);
                }
                return;
            }

        }

    }

    /**
     *
     * プロパティファイルの読み込み
     * Read property file
     *
     * <p>
     * プロパティファイルから送信可能ファイルサイズと送信間隔を取得する
     * Get limit file size for mail sending and sending intervals from property file
     * </p>
     *
     * @param propFileName プロパティファイル名
     * @param propFileName Name of property file
     */
    private void loadProperties(String propFileName) {
        Properties prop = Props.getProperties(propFileName);

        String limitSizeStr = prop.getProperty(LIMIT_MAIL_SIZE_KEY);
        String sendIntervalStr = prop.getProperty(SEND_INTERVAL_KEY);

        if (StringUtils.isNotBlank(limitSizeStr)) {
            limitMailSize = Long.parseLong(limitSizeStr);
        } else {
            limitMailSize = DEFAULT_LIMIT_MAIL_SIZE;
        }
        if (StringUtils.isNotBlank(sendIntervalStr)) {
            sendInterval = Integer.parseInt(sendIntervalStr);
        } else {
            sendInterval = DEFAULT_SEND_INTERVAL;
        }

        if (LOG.isDebugEnabled()) {
            LOG.debug(String.format("limitMailSize = %d", limitMailSize));
            LOG.debug(String.format("sendInterval  = %d", sendInterval));
        }
    }


}
