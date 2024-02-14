/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.common.util;

import java.util.Comparator;

import com.globaldenso.eca0027.core.auto.business.domain.TmCdDomain;

/**
 * The domain class that rearranges TmCdDomain
 * <br />TmCdDomainの並び替えを行うクラス。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5107 $
 */
public class TmCdDomainComparator implements Comparator<TmCdDomain> {

    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public TmCdDomainComparator() {
        super();
    }

    /**
     * {@inheritDoc}
     * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
     */
    public int compare(TmCdDomain p1, TmCdDomain p2) {
        if (p1.getSortOdr().intValue() < p2.getSortOdr().intValue()) {
            return -1;
        } else {
            return 1;
        }
    }

}
