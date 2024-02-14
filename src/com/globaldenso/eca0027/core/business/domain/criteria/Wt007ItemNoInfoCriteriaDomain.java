
/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain.criteria;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;


/**
 * The PL layer domain class that holds the criteria information of Item No. Info Sub Screen.
 * <br/>品番情報表示子画面一覧部の検索条件を保持するPL層用のドメインクラスです。
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class Wt007ItemNoInfoCriteriaDomain extends AbstractDomain {

    /**
     * SERIAL VERSION ID/シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;

    /**
     * MAIN MARK/メインマーク
     */
    private String mainMark;

    /**
     * MIX TAG NO/MIXタグNO
     */
    private String mixTagNo;


    /**
     * Default constructor/デフォルトコンストラクタ。
     */
    public Wt007ItemNoInfoCriteriaDomain() {
    }

    /**
     * <p>Getter method for mainMark.</p>
     * mainMark のゲッターメソッドです。
     * 
     * @return the mainMark
     */
    public String getMainMark() {
        return mainMark;
    }

    /**
     * <p>Setter method for mainMark.</p>
     * mainMark のセッターメソッドです。
     * 
     * @param mainMark Set for mainMark
     */
    public void setMainMark(String mainMark) {
        this.mainMark = mainMark;
    }

    /**
     * <p>Getter method for mixTagNo.</p>
     * mixTagNo のゲッターメソッドです。
     * 
     * @return the mixTagNo
     */
    public String getMixTagNo() {
        return mixTagNo;
    }

    /**
     * <p>Setter method for mixTagNo.</p>
     * mixTagNo のセッターメソッドです。
     * 
     @param mixTagNo Set for mixTagNo
     */
    public void setMixTagNo(String mixTagNo) {
        this.mixTagNo = mixTagNo;
    }

}

