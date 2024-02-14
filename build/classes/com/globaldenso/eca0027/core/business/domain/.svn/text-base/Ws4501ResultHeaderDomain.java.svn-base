package com.globaldenso.eca0027.core.business.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * <p>
 * Domain to be applied to the Ws4501SearchFacadeServiceResultDomain
 * Ws4501SearchFacadeServiceResultDomainに付属するdomainです
 * </p>
 *
 * @version 1.00
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Ws4501ResultHeaderDomain {
    /**
     * Serial ID シリアルID
     */
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * Staging Instruction No. 荷揃え指示No.です。
     * </p>
     */
    @XmlElement(name = "stagingInstructionNo")
    private String stgInstrNo = "";
    /**
     * <p>
     * Ws4501ResultMainMarkDomain
     * </p>
     */
    @XmlElement(name = "stagingDetail")
    private Ws4501ResultMainMarkDomain ws4501ResultMainMarkDomain = new Ws4501ResultMainMarkDomain();
    
    /**
     * 
     * <p>Defoult Constractor  デフォルトコンストラクタ</p>
     *
     */
    public Ws4501ResultHeaderDomain(){}
    
    /**
     * <p>Getter method for Ws4501ResultMainMarkDomain</p>
     *
     * @return the Ws4501ResultMainMarkDomain
     */
    public Ws4501ResultMainMarkDomain getWs4501ResultMainMarkDomain() {
        return this.ws4501ResultMainMarkDomain;
    }
    
    /**
     * <p>Setter method for Ws4501ResultMainMarkDomain</p>
     *
     * @param ws4501ResultMainMarkDomain Set for Ws4501ResultMainMarkDomain
     */
    public void setWs4501ResultMainMarkDomain(Ws4501ResultMainMarkDomain ws4501ResultMainMarkDomain) {
        this.ws4501ResultMainMarkDomain = ws4501ResultMainMarkDomain;
    }

    /**
     * <p>Setter method for StgInstrNo</p>
     *
     * @param stgInstrNo Set for StgInstrNo
     */
    public void setStgInstrNo(String stgInstrNo) {
        this.stgInstrNo = stgInstrNo;
    }

    /**
     * <p>
     * Getter method for setStagingInstruvtionNo
     * </p>
     * 
     * @return the setStagingInstruvtionNo
     */
    public String getstgInstrNo() {
        return stgInstrNo;
    }

    /**
     * <p>
     * Setter method for setStagingInstruvtionNo
     * </p>
     * 
     * @param stgInstrNo Set for setStagingInstruvtionNo
     */
    public void setstgInstrNo(String stgInstrNo) {
        this.stgInstrNo = stgInstrNo;
    }
}
