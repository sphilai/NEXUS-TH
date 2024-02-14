/*
 * PROJECT：NEXUS
 *
 * TtPltz の検索結果Domainクラス
 *
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/10  DNSI  新規作成
 *
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain.criteria;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * <p>
 * The domain of the result data of selecting update data for Ws3503.<BR>
 * </p>
 *
 * @version 1.00
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Ws3503CmlDomain extends AbstractDomain implements
    Serializable {

    /**
     * Serial version ID<BR>
     * シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;

    /**
     * CML(Mainmark)
     */
    @XmlElement(name = "mainMark")
    private String mainMark;
    
    /**
     * CML(errCd)
     */
    @XmlElement(name = "errCd")
    private String errCd;

    /**
     * Default Constructor.
     */
    public Ws3503CmlDomain() {
    }

    /**
     * <p>mainMark のゲッターメソッドです。</p>
     *
     * @return the mainMark
     */
    public String getMainMark() {
        return mainMark;
    }

    /**
     * <p>mainMark のセッターメソッドです。</p>
     *
     * @param mainMark mainMark に設定する
     */
    public void setMainMark(String mainMark) {
        this.mainMark = mainMark;
    }

    /**
     * <p>errCd のゲッターメソッドです。</p>
     *
     * @return the errCd
     */
    public String getErrCd() {
        return errCd;
    }

    /**
     * <p>errCd のセッターメソッドです。</p>
     *
     * @param errCd errCd に設定する
     */
    public void setErrCd(String errCd) {
        this.errCd = errCd;
    }
}
