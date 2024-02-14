/*
 * PROJECT：eca0027
 * 
 * TtExpRequest のDomainクラス
 * テーブル概要：Export Request/????  Table to hold the header information of the export request/???????????????????
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2558/04/27  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import java.util.List;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * 
 * @author $Author$
 * @version $Revision$
 */
public class L1003ReportDomain extends AbstractDomain {

    /**
     * シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * DETAIL LIST/????
     */
    private List<L1003ReportDetailDomain> detailList;
    /**
     * Constructor。
     */
    public L1003ReportDomain() {
    }
    /**
     * <p>Getter method for detailList.</p>
     *
     * @return the detailList
     */
    public List<L1003ReportDetailDomain> getDetailList() {
        return detailList;
    }

    /**
     * <p>Setter method for detailList.</p>
     *
     * @param detailList Set for detailList
     */
    public void setDetailList(List<L1003ReportDetailDomain> detailList) {
        this.detailList = detailList;
    }
    
    
}
