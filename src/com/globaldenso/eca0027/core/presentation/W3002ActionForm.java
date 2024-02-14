/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import com.globaldenso.eca0027.core.business.domain.W3002CriteriaDomain;
import com.globaldenso.gscm.framework.presentation.AbstractActionForm;

/**
 * <p>W3002 ActionForm</p>
 *
 * @author DIAT Chaiporn
 * @version 1.00
 */
public class W3002ActionForm extends AbstractActionForm {

    /**
     * Serial version   
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * Domain of W3002CriteriaDomain search criteria
     */
    private W3002CriteriaDomain criteriaDomain;
    
    /**
     * Constructor method
     *
     */
    public W3002ActionForm(){
        criteriaDomain = new W3002CriteriaDomain();
    }

    /**
     * <p>Getter method for criteriaDomain.</p>
     *
     * @return the criteriaDomain
     */
    public W3002CriteriaDomain getCriteriaDomain() {
        return criteriaDomain;
    }

    /**
     * <p>Setter method for criteriaDomain.</p>
     *
     * @param criteriaDomain Set for criteriaDomain
     */
    public void setCriteriaDomain(W3002CriteriaDomain criteriaDomain) {
        this.criteriaDomain = criteriaDomain;
    }
}