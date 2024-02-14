/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * The result of ECA0027_WS_2504 is a domain.
 * <br />ECA0027_WS_2504の結果ドメインです。
 *
 * @author $Author: 400616000304 $
 * @version $Revision: 12091 $
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "ws2504result")
public class Ws2504ResultDomain extends ResultDomain {

    /**
     * Serial version
     * <br />シリアルバージョン
     */
    private static final long serialVersionUID = 1L;

    /**
     * The error report result domain of ECA0027_WS_2504
     * <br />ECA0027_WS_2504のエラーレポート結果ドメイン
     */
    private Ws2504ErrorReportDomain errorReport;

    /**
     * The list of CML list item result domains
     * <br />CMLリスト項目結果ドメインのリスト
     */
    @XmlElementWrapper(name = "registCmlList")
    @XmlElement(name = "registCmlListItem")
    private List<? extends Ws2504RegistCmlListItemDomain> registCmlList;
    
    /**
     * Number of Print
     * <br />印刷部数
     */
    @XmlElement(name = "cmlPrintNum")
    private int cmlPrintNum;
    
    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     *
     */
    public Ws2504ResultDomain() {
        super();
        registCmlList = new ArrayList<Ws2504RegistCmlListItemDomain>();
    }

    /**
     * the constructor for specifying a result CD and generating an instance.(For normal)
     * <br />結果コードを指定してインスタンスを生成するためのコンストラクタです。（正常用）
     *
     * @param resultCode result CD<br />結果コード
     */
    public Ws2504ResultDomain(String resultCode) {
        super(resultCode);
    }

    /**
     * the constructor for specifying a result CD and an error list and generating an instance.(For an error)
     * <br />結果コードとエラーリストを指定してインスタンスを生成するためのコンストラクタです。（エラー用）
     *
     * @param resultCode result CD<br />結果コード
     * @param errorList error list<br />エラーリスト
     */
    public Ws2504ResultDomain(String resultCode, List<ErrorListItemDomain> errorList) {
        super(resultCode, errorList);
    }

    /**
     * Getter method for errorReport.
     *
     * @return the errorReport
     */
    public Ws2504ErrorReportDomain getErrorReport() {
        return errorReport;
    }

    /**
     * Setter method for errorReport.
     *
     * @param errorReport Set for errorReport
     */
    public void setErrorReport(Ws2504ErrorReportDomain errorReport) {
        this.errorReport = errorReport;
    }

    /**
     * Getter method for registCmlList.
     *
     * @return the registCmlList
     */
    public List<? extends Ws2504RegistCmlListItemDomain> getRegistCmlList() {
        return registCmlList;
    }

    /**
     * Setter method for registCmlList.
     *
     * @param registCmlList Set for registCmlList
     */
    public void setRegistCmlList(
        List<? extends Ws2504RegistCmlListItemDomain> registCmlList) {
        this.registCmlList = registCmlList;
    }

    /**
     * <p>cmlPrintNum のゲッターメソッドです。</p>
     *
     * @return the cmlPrintNum
     */
    public int getCmlPrintNum() {
        return cmlPrintNum;
    }

    /**
     * <p>cmlPrintNum のセッターメソッドです。</p>
     *
     * @param cmlPrintNum cmlPrintNum に設定する
     */
    public void setCmlPrintNum(int cmlPrintNum) {
        this.cmlPrintNum = cmlPrintNum;
    }

}
