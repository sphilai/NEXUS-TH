 /*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Results for domain class of customer information service check presence of CIGMA.
 * <br />CIGMAの得意先情報存在チェックサービスの結果用ドメインクラスです。
 *
 * @author $Author: 10088DS50272 $
 * @version $Revision: 7884 $
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "ws9003result")
public class Ws9003ResultDomain extends ResultDomain {

    /**
     * SERIAL VERSION / シリアルバージョン
     */
    private static final long serialVersionUID = 1L;

    /**
     * Customer information / 得意先情報
     */
    @XmlElement(name = "customerInfo")
    private Ws9003ResultItemDomain customerInfo;

    /**
     * Default constructor./デフォルトコンストラクタ。
     */
    public Ws9003ResultDomain() {
        super();
    }

    /**
     * The constructor for creating an instance by specifying the code results. (Normal use)
     * 結果コードを指定してインスタンスを生成するためのコンストラクタです。（正常用）
     *
     * @param resultCode 結果コード
     */
    public Ws9003ResultDomain(String resultCode) {
        super(resultCode);
    }

    /**
     * The constructor for creating an instance by specifying 
     * the error code list and results. (Errors)
     * 結果コードとエラーリストを指定してインスタンスを生成するためのコンストラクタです。（エラー用）
     *
     * @param resultCode 結果コード
     * @param errorList エラーリスト
     */
    public Ws9003ResultDomain(String resultCode, List<ErrorListItemDomain> errorList) {
        super(resultCode, errorList);
    }

    /**
     * Getter method for customerInfo.
     *
     * @return the customerInfo
     */
    public Ws9003ResultItemDomain getCustomerInfo() {
        return customerInfo;
    }

    /**
     * Setter method for customerInfo.
     *
     * @param customerInfo Set for customerInfo
     */
    public void setCustomerInfo(Ws9003ResultItemDomain customerInfo) {
        this.customerInfo = customerInfo;
    }

}