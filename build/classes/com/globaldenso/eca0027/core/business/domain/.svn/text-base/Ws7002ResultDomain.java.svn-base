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
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;


/**
 * The result for domain class of Ws7002Resource.
 * <br />Ws7002Resourceの結果用ドメインクラスです。
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Ws7002result")
public class Ws7002ResultDomain extends ResultDomain {

    /**
     * Serial version ID
     * <br />シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * Status Flag
     */
    @XmlElementWrapper(name = "statusHeader")
    @XmlElement(name = "statusFlg")
    private List<String> statusFlgList;

    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public Ws7002ResultDomain() {
        super();
    }

    /**
     * The constructor for creating an instance by specifying the CD results.
     * <br />結果コードを指定してインスタンスを生成するためのコンストラクタです。（正常用）
     * @param resultCode Result code<br />結果コード
     */
    public Ws7002ResultDomain(String resultCode) {
        super(resultCode);
    }

    /**
     * The constructor for creating an instance by specifying the error list and CD results.
     * <br />結果コードとエラーリストを指定してインスタンスを生成するためのコンストラクタです。（エラー用）
     * @param resultCode Result code<br />結果コード
     * @param errorList Error list<br />エラーリスト
     */
    public Ws7002ResultDomain(String resultCode, List<ErrorListItemDomain> errorList) {
        super(resultCode, errorList);
    }

    /**
     * Getter method for statusFlgList.
     *
     * @return the statusFlgList
     */
    public List<String> getStatusFlgList() {
        return statusFlgList;
    }

    /**
     * Setter method for statusFlgList.
     *
     * @param statusFlgList Set for statusFlgList
     */
    public void setStatusFlgList(List<String> statusFlgList) {
        this.statusFlgList = statusFlgList;
    }
}
