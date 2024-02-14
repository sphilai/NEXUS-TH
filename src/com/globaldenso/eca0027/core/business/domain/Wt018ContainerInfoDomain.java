/*
 * Project : NEXUS_EXPORT
 * 
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * The BL layer domain class that holds the detail information of 
 * Container No. Info Sub Screen List section.
 * <br/>コンテナNo.情報表示子画面一覧部の明細情報を保持するBL層用のドメインクラスです。
 *
 * @author $Author$
 * @version $Revision$
 */
public class Wt018ContainerInfoDomain extends AbstractDomain {

    /**
     * SERIAL VERSION ID/シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;

    /**
     * CONTAINER NO/コンテナNo.
     */
    private String containerNo;

    /**
     * Default constructor/デフォルトコンストラクタ。
     */
    public Wt018ContainerInfoDomain() {
    }

    /**
     * <p>containerNo のゲッターメソッドです。</p>
     *
     * @return the containerNo
     */
    public String getContainerNo() {
        return containerNo;
    }

    /**
     * <p>containerNo のセッターメソッドです。</p>
     *
     * @param containerNo containerNo に設定する
     */
    public void setContainerNo(String containerNo) {
        this.containerNo = containerNo;
    }
    
}
