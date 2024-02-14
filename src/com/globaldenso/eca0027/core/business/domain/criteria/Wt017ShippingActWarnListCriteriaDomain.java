/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain.criteria;

import java.util.List;

import com.globaldenso.eca0027.core.business.domain.Wt017ShippingActWarnListBorderDateDomain;
import com.globaldenso.eca0027.core.common.business.domain.UserAuthDomain;
import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * The BL layer domain class that holds the criteria information of Shipping Actuality Warning List Sub Screen.
 * <br/>船積実績ワーニングリスト表示子画面一覧部の検索条件を保持するBL層用のドメインクラスです。
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */

public class Wt017ShippingActWarnListCriteriaDomain extends AbstractDomain{

    /**
     * SERIAL VERSION ID/シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;

    /**
     * ETD border date list/ETD基準日リスト
     */
    private List<Wt017ShippingActWarnListBorderDateDomain> etdBorderDateList;

    /**
     * User function use authority/ユーザ機能利用権限
     */
    private List<? extends UserAuthDomain> userAuthList;

    /**
     * Default constructor.
     */
    public Wt017ShippingActWarnListCriteriaDomain() {
    }

    /**
     * <p>Getter method for etdBorderDateList.</p>
     *
     * @return the etdBorderDateList
     */
    public List<Wt017ShippingActWarnListBorderDateDomain> getEtdBorderDateList() {
        return etdBorderDateList;
    }

    /**
     * <p>Setter method for etdBorderDateList.</p>
     *
     * @param etdBorderDateList Set for etdBorderDateList
     */
    public void setEtdBorderDateList(
        List<Wt017ShippingActWarnListBorderDateDomain> etdBorderDateList) {
        this.etdBorderDateList = etdBorderDateList;
    }

    /**
     * <p>Getter method for userAuthList.</p>
     *
     * @return the userAuthList
     */
    public List<? extends UserAuthDomain> getUserAuthList() {
        return userAuthList;
    }

    /**
     * <p>Setter method for userAuthList.</p>
     *
     * @param userAuthList Set for userAuthList
     */
    public void setUserAuthList(List<? extends UserAuthDomain> userAuthList) {
        this.userAuthList = userAuthList;
    }

}

