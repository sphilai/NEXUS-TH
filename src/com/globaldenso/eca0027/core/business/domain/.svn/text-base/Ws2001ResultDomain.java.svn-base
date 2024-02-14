/*
 * Project : NEXUS_CIGMA
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;


/**
 * The result for domain class work week information retrieval services.
 * <br />稼働日情報取得サービスの結果用ドメインクラスです。
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Ws2001result")
public class Ws2001ResultDomain extends ResultDomain {

    /**
     * Serial version
     * <br />シリアルバージョン
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * List of working days information
     * <br />稼働日情報のリスト
     */
    @XmlElementWrapper(name = "workingDayList")
    @XmlElement(name = "workingDay")
    private List<String> workingDayList;
    
    /**
     * Constructor
     * <br />コンストラクタ
     */
    public Ws2001ResultDomain() {
        super();
    }
    
    /**
     * The constructor for creating an instance by specifying the code results.
     * <br />結果コードを指定してインスタンスを生成するためのコンストラクタです。（正常用）
     *
     * @param resultCode Result code<br/>結果コード
     */
    public Ws2001ResultDomain(String resultCode) {
        super(resultCode);
    }

    /**
     * The constructor for creating an instance by specifying the error code list and results.
     * <br />結果コードとエラーリストを指定してインスタンスを生成するためのコンストラクタです。（エラー用）
     *
     * @param resultCode Result code<br/>結果コード
     * @param errorList error list<br/>エラーリスト
     */
    public Ws2001ResultDomain(String resultCode, List<ErrorListItemDomain> errorList) {
        super(resultCode, errorList);
    }

    /**
     * Getter method for workingDayList.
     *
     * @return the workingDayList
     */
    public List<String> getWorkingDayList() {
        return workingDayList;
    }

    /**
     * Setter method for workingDayList.
     *
     * @param workingDayList Set for workingDayList
     */
    public void setWorkingDayList(List<String> workingDayList) {
        this.workingDayList = workingDayList;
    }
}
