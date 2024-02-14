package com.globaldenso.eca0027.core.business.domain;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
/**
 * 
 * <p>
 * Domain to be applied to the Ws4501SearchFacadeServiceResultDomain
 * Ws4501SearchFacadeServiceResultDomainに付属するdomainです
 * </p>
 *
 * @version 1.00
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Ws4501ResultMainMarkDomain {
    /**
     * <p>
     * mainMark List
     * メインマークのリスト
     * </p>
     */
    @XmlElementWrapper(name = "stagingDetailItem")
    @XmlElement(name = "mainMark")
    private List<String> mainMark = new ArrayList<String>();
    /**
     * 
     * <p>Defoult Constractor  デフォルトコンストラクタ</p>
     *
     */
    public Ws4501ResultMainMarkDomain(){}
    /**
     * <p>Getter method for MainMark</p>
     *
     * @return the MainMark
     */
    public List<String> getMainMark() {
        return mainMark;
    }
    /**
     * <p>Setter method for MainMark</p>
     *
     * @param mainMark Set for MainMark
     */
    public void setMainMark(List<String> mainMark) {
        this.mainMark = mainMark;
    }
    
}
