/*
 * PROJECT：GSCM 共通機能群
 * PROJECT：GSCM Common Functions
 *
 * ActionUtilクラス
 * ActionUtil Class
 *
 * Version.
 * 1.0.1
 *
 * Copyright (c) 2013 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.gscm.framework.util;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.lang.reflect.InvocationTargetException;
import java.net.URLEncoder;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.BeanUtilsBean;
import org.apache.commons.beanutils.ConvertUtilsBean;
import org.apache.commons.beanutils.converters.SqlTimestampConverter;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.upload.MultipartRequestHandler;

import com.globaldenso.ai.common.core.context.DensoContext;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.ai.common.core.exception.SystemException;
import com.globaldenso.gscm.framework.business.domain.AbstractDomain;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.domain.criteria.TmColumnSizeCriteriaDomain;
import com.globaldenso.gscm.framework.business.domain.TmColumnSizeDomain;
import com.globaldenso.gscm.framework.business.service.TmColumnSizeService;
import com.globaldenso.gscm.framework.constants.Constants;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.presentation.AbstractActionForm;
import com.globaldenso.gscm.framework.presentation.PageInfo;
import com.globaldenso.gscm.framework.presentation.WindowInfoManager;

/**
 * <p>
 * PL層の共通処理を行うクラス。
 * Common function for presentation layer
 * </p>
 *
 * @author $Author: G453S402002 $
 */
public final class ActionUtil {
    /**
     * <p>
     * メッセージプロパティキー：デフォルト文字コード
     * Message Proper Key：Default Character Code
     * </p>
     */
    public static final String PROP_KEY_DEFAULT_ENCODE = "encode";

    /**
     * デフォルトコンストラクタ。
     * Default Constractor
     */
    public ActionUtil() {
        super();
    }

    /**
     * 共通列項目設定。
     * Setting for common fields 
     * <p>
     * ドメインに必要な共通項目の値を設定する。
     * Set the value for common fields of domain
     * </p>
     *
     * @param outputDomain 出力先ドメイン
     * @param outputDomain Output domain
     * @param screenId 画面ID
     * @param screenId Screen ID
     */
    public static void setCommonField(AbstractDomain outputDomain, String screenId) {
        outputDomain.setComCreateUserId(DensoContext.get().getDscId());
        outputDomain.setComCreateFuncId(screenId);
        outputDomain.setComUpdateUserId(DensoContext.get().getDscId());
        outputDomain.setComUpdateFuncId(screenId);
    }

    /**
     * <p>
     * page情報beanを作成します。
     * Create the page information bean
     * </p>
     *
     * @param form ActionFormBase
     * @param totalCount 検索結果の総件数
     * @param totalCount Number of records for select result
     * @param domain ページ情報を計算した結果を設定する対象
     * @param domain Domain of page information
     * @param mapping ActionMapping
     * @param request HttpServletRequest
     * @return PageInfo 計算したページ情報
     * @return PageInfo Calculated pages
     * @throws GscmApplicationException 表示する頁Noが不正な場合
     * @throws GscmApplicationException Invalid page No.
     */
    public static PageInfo createPageInfo(AbstractActionForm form, int totalCount,
        AbstractDomain domain, ActionMapping mapping, HttpServletRequest request)
        throws GscmApplicationException {

        PageInfo page = new PageInfo();

        // 1ページに表示する件数を取得
        // Get the display records for one page
        int countPerPage = form.getCountPerPage();
        // 遷移先ページNoを取得
        // Get the next page No.
        int curPage = Integer.valueOf(form.getCurrentPageNo());
        // フォームの現在のページを初期化
        // Initialize the current page of form
        form.setCurrentPageNo("1");

        // 総ページ数を算出
        // Calculation of total pages
        int maxPage = (int)Math.ceil((double)totalCount / (double)countPerPage);

        // 最小頁飛び越え防止
        // Min. page check
        if (curPage <= 0) {
            curPage = 1;
        }
        // 最終頁飛び越え防止
        // Max. page check
        if (maxPage < curPage) {
            curPage = maxPage;
        }

        // 現在の情報
        // Start and end page information
        int from = (curPage - 1) * countPerPage + 1;
        int to = curPage * countPerPage;

        if (totalCount < to) {
            to = totalCount;
        }

        if (domain != null) {
            domain.setRowNumFrom(from);
            domain.setRowNumTo(to);
        }

        // ページ情報をセット
        // Set the page information
        page.setFromCount(from);
        page.setToCount(to);
        page.setTotalCount(totalCount);
        page.setFirstPage(1);
        page.setCurPage(curPage);
        page.setPrevPage(curPage - 1);
        page.setNextPage(curPage + 1);
        page.setLastPage(maxPage);

        // 退避用ページ情報をセット
        // Set the page information for backup
        try {
            BeanUtils.copyProperties(form, page);
        } catch (IllegalAccessException e) {
            // メソッドへのアクセス権限がない場合
            // No access privileges to the method
            throw new SystemException(e);
        } catch (InvocationTargetException e) {
            // メソッドを実行した結果例外が発生した場合
            // Another Exception
            throw new SystemException(e);
        }

        // 画面表示用の設定
        // Setting for display
        form.setPageInfo(page);
        page.setSearchPath(mapping.getPath());
        page.setFormName(mapping.getName());

        return page;
    }

    /**
     * <p>
     * page情報beanを作成します。
     * Create the page information bean
     * </p>
     *
     * @param form ActionFormBase
     * @param totalCount 検索結果の総件数
     * @param totalCount Number of records for select result
     * @param mapping ActionMapping
     * @param request HttpServletRequest
     * @return PageInfo 計算したページ情報
     * @return PageInfo Calculated pages
     * @throws GscmApplicationException 表示する頁Noが不正な場合
     * @throws GscmApplicationException Invalid page No.
     */
    public static PageInfo createPageInfo(AbstractActionForm form, int totalCount,
        ActionMapping mapping, HttpServletRequest request) throws GscmApplicationException {

        return createPageInfo(form, totalCount, null, mapping, request);
    }

    /**
     * <p>
     * page情報beanを復元します。
     * Restore the page information bean
     * </p>
     *
     * @param request HttpServletRequest
     * @return PageInfo 復元したページ情報
     * @return PageInfo Restored page information
     */
    public static PageInfo restorePageInfo(HttpServletRequest request) {

        PageInfo page = new PageInfo();

        // 退避用ページ情報をセット
        // Set the page information from backup
        page.setFromCount(Integer.valueOf(request.getParameter("fromCount")));
        page.setToCount(Integer.valueOf(request.getParameter("toCount")));
        page.setTotalCount(Integer.valueOf(request.getParameter("totalCount")));
        page.setCurPage(Integer.valueOf(request.getParameter("curPage")));
        page.setFirstPage(Integer.valueOf(request.getParameter("firstPage")));
        page.setPrevPage(Integer.valueOf(request.getParameter("prevPage")));
        page.setNextPage(Integer.valueOf(request.getParameter("nextPage")));
        page.setLastPage(Integer.valueOf(request.getParameter("lastPage")));

        return page;
    }

    /**
     * <p>
     * ファイルサイズチェック機能
     * File size check function
     * </p>
     *
     * @param request HttpServletRequest リクエスト
     * @param request HttpServletRequest Request
     * @param tagName String ファイルアップロードタグ名
     * @param tagName String File upload tag name
     * @throws ValidationException 例外
     * @throws ValidationException Exception
     */
    public static void checkUploadFileSize(HttpServletRequest request, String tagName)
        throws ValidationException {

        // Struts-Config.xmlで指定されたサイズを超える場合例外を発生させる。
        // Throw the exception, in case of the file size bigger than specified in the Struts-Config.xml
        if (request.getAttribute(MultipartRequestHandler.ATTRIBUTE_MAX_LENGTH_EXCEEDED) != null) {

            List<MessageDomain> errList = new ArrayList<MessageDomain>();
            errList.add(new MessageDomain(tagName, "GSCM-E0-0005", null));
            throw new ValidationException(errList);
        }

    }

    /**
     * <p>
     * ダウンロードファイル名チェック機能
     * Download file name check function
     * </p>
     *
     * @param filename String ファイル名
     * @param filename String File name for the checking
     * @return String ファイル名
     * @return String File name of result
     */
    public static String checkDownLoadFileName(String filename) {

        // 置換結果が0バイトになった場合の、固定ファイル名
        // Default file name for 0 byte string
        final String DEFAULT_FILE_NAME = "default";

        // 下記の文字を0バイト文字に置換する \ / : * ? " < > |
        // Replace following character to 0 byte string
        final String[] REPLACE_CHAR = {"\\", "/", ":", "*", "?", "\"", "<", ">", "|"};

        // 入力のファイル名がnullの場合は、固定文字を返却する
        // Return the default file name, in case of the file name is null
        if (filename == null) {
            filename = DEFAULT_FILE_NAME;
        }

        // 禁止文字を置換
        // Replace the prohibited characters
        for (int i = 0; i < REPLACE_CHAR.length; i++ ) {
            filename = filename.replace(REPLACE_CHAR[i], "");
        }

        // 置換の結果文字長が0になった場合には、固定文字をセット
        // Default file name for 0 byte string
        if (filename.length() == 0) {
            filename = DEFAULT_FILE_NAME;
        }

        return filename;

    }

    /**
     * <p>
     * ダウンロード処理を行うメソッドです(Text、CSV用)。
     * Download method for Text file and CSV file
     * </p>
     *
     * @param data ダウンロードデータ
     * @param data Download data
     * @param filename ファイル名
     * @param filename File name
     * @param res HttpServletResponse
     * @param commonInfo CommonInfoDomain
     * @throws Exception 例外処理
     * @throws Exception Exception
     */
    public static void downloadAscii(String data, String filename, HttpServletResponse res,
        CommonInfoDomain commonInfo) throws Exception {

        String outFileName;
        // コンテキストからの、文字コード取得
        // Get the character code from context
        String encord = commonInfo.getCharCd();

        // Windows利用不可文字を削除
        // Delete the prohibited character of Windows
        filename = checkDownLoadFileName(filename);
        outFileName = URLEncoder.encode(filename, "UTF-8").replace("+", "%20");

        Writer outputWriter = null;
        try {
            // レスポンスリセット
            // Reset the response
            res.reset();

            // HTTPヘッダの出力
            // Set the HTTP header
            res.setContentType(Constants.CONTENT_TYPE);

            if (!"".equals(StringUtil.getEmptyToBlank(encord))) {
                res.setCharacterEncoding(encord);
            }

            res.setHeader(Constants.CONTENT_DISPOSITION_KEY, "attachment; filename=\""
                + outFileName + "\"");
            res.setHeader("Cache-Control", "no-cache");

            // BufferedWriterオブジェクトを生成
            // Create the BufferedWriter object
            outputWriter = new BufferedWriter(new OutputStreamWriter(res.getOutputStream(), encord));

            // 書込み処理
            // Write Process
            outputWriter.write(data);

        } catch (IOException e) {
            if (res.isCommitted()) {
                // キャンセルボタンが押されたときの処理
                // Process when the cancel button is pressed
                // キャンセルボタンが押されたときにエラーにならないように何もしない。
                // Nothing to do when the cancel button is pressed
            } else {
                throw e;
            }
        } finally {
            if (outputWriter != null) {
                // ストリームを閉じる
                // Close the stream
                try {
                    outputWriter.close();
                } catch (Exception e) {
                    if (res.isCommitted()) {
                        // キャンセルボタンが押されたときの処理
                        // Process when the cancel button is pressed
                        // キャンセルボタンが押されたときにエラーにならないように何もしない。
                        // Nothing to do when the cancel button is pressed
                    } else {
                        throw e;
                    }
                }
            }
        }

    }

    /**
     * <p>
     * ダウンロード処理を行うメソッドです(バイナリ用)。
     * Download method for binary file
     * </p>
     *
     * @param data ダウンロードデータ
     * @param data Download data
     * @param filename ファイル名
     * @param filename File name
     * @param res HttpServletResponse
     * @throws Exception 例外処理
     * @throws Exception Exception
     */
    public static void downloadBinary(byte[] data, String filename, HttpServletResponse res)
        throws Exception {

        OutputStream output = null;
        try {
            if (data != null) {

                // Windows利用不可文字を削除
                // Delete the prohibited character of Windows
                filename = checkDownLoadFileName(filename);
                filename = URLEncoder.encode(filename, "UTF-8").replace("+", "%20");

                // 画面にファイル名と属性をセット
                // Set the file name and content type
                res.setContentType(Constants.CONTENT_TYPE);
                res
                    .setHeader(Constants.CONTENT_DISPOSITION_KEY, "attachment; filename="
                        + filename);

                // アウトプットストリームを取得
                // Get the output stream
                output = res.getOutputStream();
                // 書き込み
                // Write
                output.write(data, 0, data.length);
                // ファイルデータを画面に渡す
                // Flush
                output.flush();
            }

        } catch (Exception e) {
            if (res.isCommitted()) {
                // キャンセルボタンが押されたときの処理
                // Process when the cancel button is pressed
                // キャンセルボタンが押されたときにエラーにならないように何もしない。
                // Nothing to do when the cancel button is pressed
            } else {
                throw e;
            }
        } finally {
            if (output != null) {
                // ストリームを閉じる
                // Close the stream
                try {
                    output.close();
                } catch (Exception e) {
                    if (res.isCommitted()) {
                        // キャンセルボタンが押されたときの処理
                        // Process when the cancel button is pressed
                        // キャンセルボタンが押されたときにエラーにならないように何もしない。
                        // Nothing to do when the cancel button is pressed
                    } else {
                        throw e;
                    }
                }
            }

        }

    }

    /**
     * ワーニングダイアログ情報設定処理
     * Warning dialog setting process
     * <p>
     * ワーニングダイアログ表示に関する情報の設定処理です。
     * Warning dialog setting process
     * </p>
     *
     * @param mapping ActionMapping
     * @param request HttpServletRequest
     * @param domain ドメイン
     * @param domain Domain
     */
    public static void prepareWarnDlg(ActionMapping mapping, HttpServletRequest request,
        AbstractDomain domain) {
        // ワーニングダイアログで「OK」押下時にサブミットするフォーム名称をマッピング情報より取得しリクエストパラメータへ設定する。
        // When the OK button is pressed on warning dialog, set the submitting form name in the request parameter from mapping information
        request.setAttribute("gscmWarningDialogToSubmitFormName", mapping.getName());
        // ワーニングダイアログで「OK」押下時に実行されるアクションパスをマッピング情報より取得しリクエストパラメータへ設定する。
        // When the OK button is pressed on warning dialog, set the action path in the request parameter from mapping information
        request.setAttribute("gscmWarningDialogToSubmitActionPath", mapping.getPath());

        if (CheckUtil.isBlankOrNull(request.getParameter("gscmWarningDialogOKFlg"))) {
            // リクエストパラメータに情報が無い場合は、ワーニングチェック処理を実施させるため、チェックフラグを「true」で設定する。
            // In case of request parameter is nothing, set true into check flag to process warning check
            domain.setCheckValidateWarning(true);
        } else {
            // ワーニングダイアログで「OK」押下時、ワーニングチェック処理をさせないため、チェックフラグを「false」で設定する。
            // When the OK button is pressed on warning dialog, set false into check flag to omit warning check process
            domain.setCheckValidateWarning(false);
        }
    }

    /**
     * 業務ドメインクラス初期設定処理
     * Initialize process for business domain class
     * <p>
     * 業務用のドメインクラスに、CommonInfoDomainに保持する画面共通情報を初期設定する。
     * Set the initial value to business domain from CommonInfoDomain
     * </p>
     *
     * @param businessDomain 業務ドメインクラス
     * @param businessDomain Business domain class
     * @param windowId ウィンドウID
     * @param windowId Window ID
     * @param screenId 画面ID
     * @param screenId Screen ID
     * @return 業務ドメインクラス
     * @return Business domain class
     */
    public static AbstractDomain prepareBusinessDomain(AbstractDomain businessDomain, String windowId,
        String screenId) {
        // WindowInfoManagerより画面共通情報取得
        // Get the common information of screens from WindowInfoManager
        WindowInfoManager windowInfo = new WindowInfoManager(windowId);
        CommonInfoDomain commonInfo = windowInfo.getCommonInfo();
        try {
            // 業務用のドメインクラスにCommonInfoDomainよりAbstractDomainの情報をコピーする。
            // Copy the value of CommonInfoDomain to business domain
            BeanUtilsBean beanUtilsBean = new BeanUtilsBean(
                new ConvertUtilsBean(),
                BeanUtilsBean.getInstance().getPropertyUtils());

            beanUtilsBean.getConvertUtils().register(new SqlTimestampConverter(null), Timestamp.class);
            beanUtilsBean.copyProperties(businessDomain, commonInfo);
            beanUtilsBean.getConvertUtils().deregister();
        } catch (Exception e) {
            throw new SystemException(e);
        }
        // 画面ID設定
        // Screen ID setting
        businessDomain.setScreenId(screenId);

        return businessDomain;
    }

    /**
     * <p>
     * カラムサイズ取得を行うメソッドです。
     * The method for getting the column size
     * </p>
     *
     * @param id キーID
     * @param id Key ID
     * @param screenId 画面ID
     * @param screenId Screen ID
     * @param columnId カラムID
     * @param columnId Column ID
     * @return サイズドメイン
     * @return Size domain
     * @throws ApplicationException 例外
     * @throws ApplicationException Exception
     */
    public static ArrayList<TmColumnSizeDomain> getColumnSize(String id, String screenId,
        String[] columnId) throws ApplicationException {
        TmColumnSizeService tmColumnSizeService = (TmColumnSizeService)SpringUtil
            .getBean("gscmTmColumnSizeService");
        TmColumnSizeCriteriaDomain criteria = new TmColumnSizeCriteriaDomain();

        ArrayList<TmColumnSizeDomain> ret = new ArrayList<TmColumnSizeDomain>();

        // カラムごとに照会を実行
        // Get the column size by each column
        for (int i = 0; i < columnId.length; i++ ) {

            criteria.setId(id);
            criteria.setScreenId(screenId);
            criteria.setColumnId(columnId[i]);

            TmColumnSizeDomain dom = null;

            // DB照会優先順位１：ID、画面ID、カラムIDで照会
            // DB Search Priority 1：ID, Screen ID, Column ID
            dom = tmColumnSizeService.searchByKey(criteria);

            // DB照会優先順位２：ID、カラムIDで再検索
            // DB Search Priority 2：ID, Column ID
            if (dom == null) {
                // 画面IDはデフォルトを設定
                // Set the default screen ID
                criteria.setScreenId("default");

                // 画面IDとカラムIDで照会
                // Search by Screen ID and column ID
                dom = tmColumnSizeService.searchByKey(criteria);

            }

            // DB照会優先順位３：画面ID、カラムIDで再検索
            // DB Search Priority 3：Screen ID, Column ID
            if (dom == null) {
                // IDはデフォルトを設定
                // Set the default ID
                criteria.setId("default");
                // 画面IDは指定値を設定
                // Set the specified Screen ID
                criteria.setScreenId(screenId);

                dom = tmColumnSizeService.searchByKey(criteria);

            }

            // DB照会優先順位４：カラムIDで再検索
            // DB Search Priority 4：Column ID
            if (dom == null) {
                // ID、画面ID共にはデフォルトを設定
                // Set the default ID and default screen ID
                criteria.setId("default");
                criteria.setScreenId("default");

                dom = tmColumnSizeService.searchByKey(criteria);

            }

            if (dom != null) {
                ret.add(dom);
            }

        }

        return ret;
    }

    /**
     * <p>
     * TmColumnSizeDomainドメインのリストをJSON形式に変換して返却します。
     * Return the list of TmColumnSizeDomain converted by JSON format
     * </p>
     *
     * @param inputList サイズドメインの配列
     * @param inputList The array of size domain
     * @return JSON形式のサイズデータ
     * @return The size data by JSON format
     */
    public static String getColumnSizeJson(ArrayList<TmColumnSizeDomain> inputList) {
        // 取得した値をJSON形式に編集
        // The value convert to JSON format
        StringBuffer sb = new StringBuffer();
        sb.append("{");
        for (TmColumnSizeDomain sizeDomain : inputList) {
            sb.append("\"").append(sizeDomain.getColumnId()).append("\":").append(
                sizeDomain.getColumnWidth()).append(",");
        }

        if (sb.length() > 1) {
            sb.delete(sb.length() - 1, sb.length());
        }
        sb.append("}");

        return sb.toString();
    }
}
