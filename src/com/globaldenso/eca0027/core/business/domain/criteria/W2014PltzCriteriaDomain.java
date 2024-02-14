/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain.criteria;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * The domain class that holds the criteria information of X-tag
 * <br />X-tagの検索条件情報を保持するドメインクラスです。
 *
 * @author $Author: 400616000304 $
 * @version $Revision: 10993 $
 */
public class W2014PltzCriteriaDomain extends AbstractDomain {

    /**
     * Serial version
     * <br />シリアルバージョン
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * CUR WAREHOUSE CODE
     * <br />現在倉庫コード
     */
    private String curWhCd;
    
    /**
     * OUTER PACKAGE COM CODE
     * <br />外装会社コード
     */
    private String outerPkgComCd;
    
    /**
     * OUTER CODE
     * <br />外装記号
     */
    private String outerPkgCd;
    
    /**
     * X-TAG
     * <br />まとめメインマーク
     */
    private String xmainMark;
    
    /**
     * TAG
     * <br />メインマーク
     */
    private String mainMark;
    
    /**
     * constructor.
     */
    public W2014PltzCriteriaDomain() {
        super();
    }

    /**
     * Getter method for curWhCd.
     *
     * @return the curWhCd
     */
    public String getCurWhCd() {
        return curWhCd;
    }

    /**
     * Setter method for curWhCd.
     *
     * @param curWhCd Set for curWhCd
     */
    public void setCurWhCd(String curWhCd) {
        this.curWhCd = curWhCd;
    }

    /**
     * Getter method for outerPkgComCd.
     *
     * @return the outerPkgComCd
     */
    public String getOuterPkgComCd() {
        return outerPkgComCd;
    }

    /**
     * Setter method for outerPkgComCd.
     *
     * @param outerPkgComCd Set for outerPkgComCd
     */
    public void setOuterPkgComCd(String outerPkgComCd) {
        this.outerPkgComCd = outerPkgComCd;
    }

    /**
     * Getter method for outerPkgCd.
     *
     * @return the outerPkgCd
     */
    public String getOuterPkgCd() {
        return outerPkgCd;
    }

    /**
     * Setter method for outerPkgCd.
     *
     * @param outerPkgCd Set for outerPkgCd
     */
    public void setOuterPkgCd(String outerPkgCd) {
        this.outerPkgCd = outerPkgCd;
    }
    
    /**
     * Getter method for xmainMark.
     *
     * @return the xmainMark
     */
    public String getXmainMark() {
        return xmainMark;
    }

    /**
     * Setter method for xmainMark.
     *
     * @param xmainMark Set for xmainMark
     */
    public void setXmainMark(String xmainMark) {
        this.xmainMark = xmainMark;
    }

    /**
     * Getter method for mainMark.
     *
     * @return the mainMark
     */
    public String getMainMark() {
        return mainMark;
    }

    /**
     * Setter method for mainMark.
     *
     * @param mainMark Set for mainMark
     */
    public void setMainMark(String mainMark) {
        this.mainMark = mainMark;
    }
}
