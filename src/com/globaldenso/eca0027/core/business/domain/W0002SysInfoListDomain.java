/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * The Domain Class For PL Layer That Holds The System Information
 * <br />お知らせ情報を保持するPL層のドメインクラスです。
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 10410 $
 */
public class W0002SysInfoListDomain extends AbstractDomain {

    /**
     * Serial Version <br />
     * シリアルバージョン
     */
    private static final long serialVersionUID = 1L;

    /**
     * SUBJECT
     * <br />件名
     */
    private String subject;

    /**
     * CONTENTS
     * <br />お知らせ内容
     */
    private String contents;
    
    /**
     * PUBLISH START DATE
     * <br />掲載開始日
     */
    private String pubStrtDt;
   
    /**
     * Constructor
     * <br />デフォルトコンストラクタです。
     */
    public W0002SysInfoListDomain() {
    }

    /**
     * Getter method for subject.
     *
     * @return the subject
     */
    public String getSubject() {
        return subject;
    }

    /**
     * Setter method for subject.
     *
     * @param subject Set for subject
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * Getter method for contents.
     *
     * @return the content
     */
    public String getContents() {
        return contents;
    }

    /**
     * Setter method for contents.
     *
     * @param contents Set for contents
     */
    public void setContents(String contents) {
        this.contents = contents;
    }

    /**
     * Getter method for pubStrtDt.
     *
     * @return the pubStrtDt
     */
    public String getPubStrtDt() {
        return pubStrtDt;
    }

    /**
     * Setter method for pubStrtDt.
     *
     * @param pubStrtDt Set for pubStrtDt
     */
    public void setPubStrtDt(String pubStrtDt) {
        this.pubStrtDt = pubStrtDt;
    }

}
