/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.common.business.domain;

/**
 * The domain class that used to display a list box on the screen
 * <br />画面のリストボックス表示に使用するクラスです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class SelectListItemDomain {

    /**
     * serial version UID <br />
     * シリアルバージョンUID。
     */
    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    private String id;

    /**
     * name <br />
     * 名称
     */
    private String name;

    /**
     * constructor. 
     * <br />デフォルトコンストラクタです。
     */
    public SelectListItemDomain() {
    }

    /**
     * Getter method for id.
     *
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * Setter method for id.
     *
     * @param id Set for id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Getter method for name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter method for name.
     *
     * @param name Set for name
     */
    public void setName(String name) {
        this.name = name;
    }
}
