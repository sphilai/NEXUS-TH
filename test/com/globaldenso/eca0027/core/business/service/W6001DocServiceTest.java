package com.globaldenso.eca0027.core.business.service;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W9018;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import jp.co.dgic.testing.common.virtualmock.MockObjectManager;

import org.junit.Before;
import org.junit.Test;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.ai.library.filemanagerstream.business.FileManagementException;
import com.globaldenso.ai.library.filemanagerstream.business.domain.FileManagementDomain;
import com.globaldenso.ai.library.filemanagerstream.business.service.FileManagementService;
import com.globaldenso.ai.library.filemanagerstream.business.service.FileManagementServiceImpl;
import com.globaldenso.eca0027.core.AbstractEca0027Test;
import com.globaldenso.eca0027.core.auto.business.domain.TmCancelInvSeqTypDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmCigmaCustomerXrefDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmInvAmountChkDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmInvFreeItemDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmInvSeqDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmInvTplDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmNxsCompDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtExpRcvOdrDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtInvoiceAttachedDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtInvoiceDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtInvoiceHeaderDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtPackAtchItemNoDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtPackingAttachedCmlDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtPackingHeadDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtPltzDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtTmpStockDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TwInvDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TwInvItemDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TwInvPltzDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TwInvoiceDomain;
import com.globaldenso.eca0027.core.auto.business.service.TmCancelInvSeqTypService;
import com.globaldenso.eca0027.core.auto.business.service.TmCdServiceImpl;
import com.globaldenso.eca0027.core.auto.business.service.TmCntryService;
import com.globaldenso.eca0027.core.auto.business.service.TmInvAmountChkServiceImpl;
import com.globaldenso.eca0027.core.auto.business.service.TmInvFreeItemServiceImpl;
import com.globaldenso.eca0027.core.auto.business.service.TmInvSeqService;
import com.globaldenso.eca0027.core.auto.business.service.TmInvSeqServiceImpl;
import com.globaldenso.eca0027.core.auto.business.service.TmNxsCompServiceImpl;
import com.globaldenso.eca0027.core.auto.business.service.TtExpRcvOdrService;
import com.globaldenso.eca0027.core.auto.business.service.TtExpRcvOdrServiceImpl;
import com.globaldenso.eca0027.core.auto.business.service.TtInvoiceAttachedService;
import com.globaldenso.eca0027.core.auto.business.service.TtInvoiceAttachedServiceImpl;
import com.globaldenso.eca0027.core.auto.business.service.TtInvoiceHeaderService;
import com.globaldenso.eca0027.core.auto.business.service.TtInvoiceHeaderServiceImpl;
import com.globaldenso.eca0027.core.auto.business.service.TtInvoiceService;
import com.globaldenso.eca0027.core.auto.business.service.TtInvoiceServiceImpl;
import com.globaldenso.eca0027.core.auto.business.service.TtPackAtchItemNoService;
import com.globaldenso.eca0027.core.auto.business.service.TtPackAtchItemNoServiceImpl;
import com.globaldenso.eca0027.core.auto.business.service.TtPackingAttachedCmlService;
import com.globaldenso.eca0027.core.auto.business.service.TtPackingAttachedCmlServiceImpl;
import com.globaldenso.eca0027.core.auto.business.service.TtPackingHeadService;
import com.globaldenso.eca0027.core.auto.business.service.TtPackingHeadServiceImpl;
import com.globaldenso.eca0027.core.auto.business.service.TtPltzService;
import com.globaldenso.eca0027.core.auto.business.service.TtPltzServiceImpl;
import com.globaldenso.eca0027.core.auto.business.service.TtScAttachedService;
import com.globaldenso.eca0027.core.auto.business.service.TtScAttachedServiceImpl;
import com.globaldenso.eca0027.core.auto.business.service.TtScHeaderServiceImpl;
import com.globaldenso.eca0027.core.auto.business.service.TtTmpStockService;
import com.globaldenso.eca0027.core.auto.business.service.TtTmpStockServiceImpl;
import com.globaldenso.eca0027.core.auto.business.service.TwInvItemService;
import com.globaldenso.eca0027.core.auto.business.service.TwInvItemServiceImpl;
import com.globaldenso.eca0027.core.auto.business.service.TwInvPltzService;
import com.globaldenso.eca0027.core.auto.business.service.TwInvPltzServiceImpl;
import com.globaldenso.eca0027.core.auto.business.service.TwInvService;
import com.globaldenso.eca0027.core.auto.business.service.TwInvServiceImpl;
import com.globaldenso.eca0027.core.auto.business.service.TwInvoiceService;
import com.globaldenso.eca0027.core.auto.business.service.TwInvoiceServiceImpl;
import com.globaldenso.eca0027.core.business.dao.W6001DocDao;
import com.globaldenso.eca0027.core.business.domain.ResultDomain;
import com.globaldenso.eca0027.core.business.domain.W6001DocDomain;
import com.globaldenso.eca0027.core.business.domain.W6001DocInvoiceDomain;
import com.globaldenso.eca0027.core.business.domain.W6001DocPltzDomain;
import com.globaldenso.eca0027.core.business.domain.W6001DocPltzItemDomain;
import com.globaldenso.eca0027.core.business.domain.W6001DocPltzItemOdrDomain;
import com.globaldenso.eca0027.core.business.domain.W6008CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.Ws6001ParamDomain;
import com.globaldenso.eca0027.core.business.domain.Ws6003ResultDomain;
import com.globaldenso.eca0027.core.business.domain.Ws6003ResultItemDomain;
import com.globaldenso.eca0027.core.business.domain.Ws6004ResultDomain;
import com.globaldenso.eca0027.core.business.domain.Ws6004ResultItemDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W6001DocCriteriaDomain;
import com.globaldenso.eca0027.core.business.ws.Ws6001RestService;
import com.globaldenso.eca0027.core.business.ws.Ws6001RestServiceMockImpl;
import com.globaldenso.eca0027.core.business.ws.Ws6002RestService;
import com.globaldenso.eca0027.core.business.ws.Ws6002RestServiceMockImpl;
import com.globaldenso.eca0027.core.business.ws.Ws6003RestService;
import com.globaldenso.eca0027.core.business.ws.Ws6003RestServiceImpl;
import com.globaldenso.eca0027.core.business.ws.Ws6004RestServiceImpl;
import com.globaldenso.eca0027.core.common.business.domain.UserAuthDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.eca0027.core.common.business.service.CommonServiceImpl;
import com.globaldenso.eca0027.core.common.business.service.UserAuthServiceImpl;
import com.globaldenso.eca0027.core.integration.W6001DocDaoImpl;
import com.globaldenso.gscm.framework.business.domain.TmUserDomain;
import com.globaldenso.gscm.framework.business.service.TmUserServiceImpl;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.presentation.ActionPageInfoCreator;
import com.globaldenso.gscm.framework.util.DateUtil;
import com.globaldenso.gscm.framework.util.PageInfoCreator;
import com.globaldenso.gscm.framework.util.PageInfoData;

/**
 * W6001DocServiceTest
 *
 * @author $Author: 10088DS50908 $
 * @version $Revision: 14031 $
 */
public class W6001DocServiceTest extends AbstractEca0027Test  {
    
    /**
     * Protected関数を直接コールするためのテスト用サブクラス
     */
    class TestW6001 extends W6001DocServiceImpl {

        /**
         * コンストラクタ
         */
        public TestW6001() {
            super();
            this.setCommonService((CommonService) getContext().getBean("commonService"));
            this.setFileManagerServiceForStream(new FileManagementServiceImpl());
            this.setTmCancelInvSeqTypService((TmCancelInvSeqTypService) getContext().getBean("tmCancelInvSeqTypService"));
            this.setTmCntryService((TmCntryService) getContext().getBean("tmCntryService"));
            
            this.setTmInvSeqService((TmInvSeqService) getContext().getBean("tmInvSeqService"));
            this.setTmUserService(new TmUserServiceImpl());
            this.setTtExpRcvOdrService((TtExpRcvOdrService) getContext().getBean("ttExpRcvOdrService"));
            this.setTtInvoiceAttachedService((TtInvoiceAttachedService) getContext().getBean("ttInvoiceAttachedService"));
            this.setTtInvoiceHeaderService((TtInvoiceHeaderService) getContext().getBean("ttInvoiceHeaderService"));
            this.setTtInvoiceService((TtInvoiceService) getContext().getBean("ttInvoiceService"));
            this.setTtPackAtchItemNoService((TtPackAtchItemNoService) getContext().getBean("ttPackAtchItemNoService"));
            this.setTtPackingAttachedCmlService((TtPackingAttachedCmlService) getContext().getBean("ttPackingAttachedCmlService"));
            this.setTtPackingHeadService((TtPackingHeadService) getContext().getBean("ttPackingHeadService"));
            this.setTtPltzService((TtPltzService) getContext().getBean("ttPltzService"));
            
            this.setTtScAttachedService((TtScAttachedService) getContext().getBean("ttScAttachedService"));
            this.setTtTmpStockService((TtTmpStockService) getContext().getBean("ttTmpStockService"));
            this.setTwInvoiceService((TwInvoiceService) getContext().getBean("twInvoiceService"));
            this.setTwInvItemService((TwInvItemService) getContext().getBean("twInvItemService"));
            this.setTwInvService((TwInvService) getContext().getBean("twInvService"));
            this.setTwInvPltzService((TwInvPltzService) getContext().getBean("twInvPltzService"));
            this.setW6001DocDao((W6001DocDao) getContext().getBean("w6001DocDao"));
            
            this.setWs6001RestService((Ws6001RestService) getContext().getBean("ws6001RestService"));
            this.setWs6002RestService((Ws6002RestService) getContext().getBean("ws6002RestService"));
            this.setWs6003RestService((Ws6003RestService) getContext().getBean("ws6003RestService"));
            
            this.setL6001ReportService((L6001ReportService) getContext().getBean("l6001ReportService"));
            this.setL6002ReportService((L6002ReportService) getContext().getBean("l6002ReportService"));
            this.setL6003ReportService((L6003ReportService) getContext().getBean("l6003ReportService"));
            this.setL6004ReportService((L6004ReportService) getContext().getBean("l6004ReportService"));
            this.setL6005ReportService((L6005ReportService) getContext().getBean("l6005ReportService"));
            this.setL6006ReportService((L6006ReportService) getContext().getBean("l6006ReportService"));
            this.setL6007ReportService((L6007ReportService) getContext().getBean("l6007ReportService"));
            this.setL6008ReportService((L6008ReportService) getContext().getBean("l6008ReportService"));
            this.setL6009ReportService((L6009ReportService) getContext().getBean("l6009ReportService"));
            this.setL6010ReportService((L6010ReportService) getContext().getBean("l6010ReportService"));
            this.setL6011ReportService((L6011ReportService) getContext().getBean("l6011ReportService"));
            this.setL6012ReportService((L6012ReportService) getContext().getBean("l6012ReportService"));
            this.setL6013ReportService((L6013ReportService) getContext().getBean("l6013ReportService"));
            this.setL6014ReportService((L6014ReportService) getContext().getBean("l6014ReportService"));
            this.setL6015ReportService((L6015ReportService) getContext().getBean("l6015ReportService"));

            this.setTtScHeaderService(new TtScHeaderServiceImpl());
            
            
            
        }

        /**
         * 
         * tp_searchTtInvoiceOnRegisterByPrintDoc
         * 
         * @param shipperCd shipperCd
         * @param invoiceNo invoiceNo
         * @param invoiceIssueDt invoiceIssueDt
         */
        public void tp_searchTtInvoiceOnRegisterByPrintDoc(String shipperCd, String invoiceNo, Date invoiceIssueDt) {
            try {
//                this.searchTtInvoiceOnRegisterByPrintDoc(shipperCd, invoiceNo, invoiceIssueDt);
            } catch (Exception e) {
            }
        }
        
        /**
         * 
         * tp_createFileUpload01
         * 
         * @param fileData fileData
         * @param fileName fileName
         * @param dscId dscId
         * @return String
         */
        public String tp_createFileUpload01(InputStream fileData, String fileName, String dscId) {
            try {
                return this.createFileUpload(fileData, fileName, dscId);
            } catch (Exception e) {
            }
            return "";
        }
        
        /**
         * 
         * tp_createFileUpload02
         * 
         * @param fileData fileData
         * @param dscId dscId
         * @return String
         */
        public String tp_createFileUpload02(File fileData, String dscId) {
            try {
                return this.createFileUpload(fileData, "", "1");
            } catch (Exception e) {
            }
            return "";
        }
        
        /**
         * 
         * tp_transactOnRegisterByRegistTwInvoice
         * 
         * @param criteria criteria
         * @return W6001DocInvoiceDomain
         */
        public W6001DocInvoiceDomain tp_transactOnRegisterByRegistTwInvoice(W6001DocCriteriaDomain criteria) {
            try {
                return this.transactOnRegisterByRegistTwInvoice(criteria);
            } catch (Exception e) {
            }
            return null;
        }
        
        /**
         * 
         * tp_searchTmNxsComp
         * 
         * @param compCd compCd
         * @return TmNxsCompDomain
         */
        public TmNxsCompDomain tp_searchTmNxsComp(String compCd) {
            try {
                return this.searchTmNxsComp(compCd);
            } catch (Exception e) {
            }
            return null;
        }
        
        /**
         * 
         * tp_searchTmCigmaCusXref
         * 
         * @param lgcyLibCompCd lgcyLibCompCd
         * @param customerCd customerCd
         * @return TmCigmaCustomerXrefDomain
         * @throws ApplicationException ApplicationException
         */
        public TmCigmaCustomerXrefDomain tp_searchTmCigmaCusXref(String lgcyLibCompCd, String customerCd) throws ApplicationException {
            try {
                return this.searchTmCigmaCusXref(lgcyLibCompCd, customerCd);
            } catch (Exception e) {
            }
            return null;
        }
        
        /**
         * 
         * tp_getTempInvoiceNo
         * 
         * @param reInvoiceFlg reInvoiceFlg
         * @param shipperCd shipperCd
         * @param grpNo1 grpNo1
         * @param grpNo2 grpNo2
         * @return String[]
         */
        public String[] tp_getTempInvoiceNo(String reInvoiceFlg, String shipperCd, String grpNo1, String grpNo2) {
            try {
                return this.getTempInvoiceNo(reInvoiceFlg, shipperCd, grpNo1, grpNo2);
            } catch (Exception e) {
            }
            return null;
        }
        
        /**
         * 
         * tp_searchTwInvOnRegisterByFree
         * 
         * @param shipperCd shipperCd
         * @return W6001DocDomain
         * @throws ApplicationException ApplicationException
         */
        public W6001DocDomain tp_searchTwInvOnRegisterByFree(String shipperCd) throws ApplicationException {
            try {
                return this.searchTwInvOnRegisterByFree(shipperCd);
            } catch (Exception e) {
            }
            return null;
        }
        
        /**
         * 
         * tp_searchTmInvTplByKey
         * 
         * @param shipperCd shipperCd
         * @param invTempNo invTempNo
         * @return TmInvTplDomain
         * @throws ApplicationException ApplicationException
         */
        public TmInvTplDomain tp_searchTmInvTplByKey(String shipperCd, String invTempNo) throws ApplicationException {
            try {
                return this.searchTmInvTplByKey(shipperCd, invTempNo);
            } catch (Exception e) {
            }
            return null;
        }
        
        /**
         * 
         * tp_updateTwInvItemOnRegisterForTempInvoiceNo
         * 
         * @param tempInvoiceNo tempInvoiceNo
         * @param dscId dscId
         * @param grpNo1 grpNo1
         * @param grpNo2 grpNo2
         * @return result
         * @throws ApplicationException ApplicationException
         */
        public int tp_updateTwInvItemOnRegisterForTempInvoiceNo (String tempInvoiceNo, String dscId, String grpNo1, String grpNo2) throws ApplicationException {
            try {
//                return this.updateTwInvItemOnRegisterForTempInvoiceNo (tempInvoiceNo, dscId, grpNo1, grpNo2);
            } catch (Exception e) {
            }
            return 0;
        }
        
        /**
         * 
         * tp_updateTwInvItemOnRegisterForNormInvoiceNo
         * 
         * @param invoiceNo invoiceNo
         * @param dscId dscId
         * @param tempInvoiceNo tempInvoiceNo
         * @return result
         * @throws ApplicationException ApplicationException
         */
        public int tp_updateTwInvItemOnRegisterForNormInvoiceNo(String invoiceNo, String dscId, String tempInvoiceNo) throws ApplicationException {
            try {
                return this.updateTwInvItemOnRegisterForNormInvoiceNo(invoiceNo, dscId, tempInvoiceNo);
            } catch (Exception e) {
            }
            return 0;
        }
        
        /**
         * 
         * tp_updateIwInvOnRegisterForTempInvoiceNo
         * 
         * @param tempInvoiceNo tempInvoiceNo
         * @param reInvoiceFlg reInvoiceFlg
         * @param consigneeCd consigneeCd
         * @param salesContractFlg salesContractFlg
         * @param dscId dscId
         * @param grpNo1 grpNo1
         * @param grpNo2 grpNo2
         * @return result
         * @throws ApplicationException ApplicationException
         */
        public int tp_updateIwInvOnRegisterForTempInvoiceNo (String tempInvoiceNo, String reInvoiceFlg, String consigneeCd
        , String salesContractFlg, String dscId, String grpNo1, String grpNo2) throws ApplicationException {
            try {
//                return this.updateIwInvOnRegisterForTempInvoiceNo (tempInvoiceNo, reInvoiceFlg, consigneeCd
//                    , salesContractFlg, dscId, grpNo1, grpNo2);
            } catch (Exception e) {
            }
            return 0;
        }
        
        /**
         * 
         * tp_updateTwInvOnRegisterForNormInvoiceNo
         * 
         * @param invoiceNo invoiceNo
         * @param dscId dscId
         * @param tempInvoiceNo tempInvoiceNo
         * @return result
         * @throws ApplicationException ApplicationException
         */
        public int tp_updateTwInvOnRegisterForNormInvoiceNo(String invoiceNo, String dscId, String tempInvoiceNo) throws ApplicationException {
            try {
                return this.updateTwInvOnRegisterForNormInvoiceNo(invoiceNo, dscId, tempInvoiceNo);
            } catch (Exception e) {
            }
            return 0;
        }
        
        /**
         * 
         * tp_updateTwInvoiceOnRegisterForNormInvoiceNo
         * 
         * @param invoiceNo invoiceNo
         * @param dscId dscId
         * @param tempInvoiceNo tempInvoiceNo
         * @param updateParInv updateParInv
         * @param updateReInv updateReInv
         * @return result
         * @throws ApplicationException ApplicationException
         */
        public int tp_updateTwInvoiceOnRegisterForNormInvoiceNo(String invoiceNo, String dscId, String tempInvoiceNo, boolean updateParInv, boolean updateReInv) throws ApplicationException {
            try {
                return this.updateTwInvoiceOnRegisterForNormInvoiceNo(invoiceNo, dscId, tempInvoiceNo, updateParInv, updateReInv);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return 0;
        }
        
        /**
         * 
         * tp_createTwInvoiceOnRegister
         * 
         * @param criteria criteria
         * @param reInvFlg reInvFlg
         * @param tempInvoiceNoArr tempInvoiceNoArr
         * @param freeColDomain freeColDomain
         * @param tmInvTplDomain tmInvTplDomain
         * @param containerLst containerLst
         * @throws ApplicationException ApplicationException
         */
        public void tp_createTwInvoiceOnRegister (W6001DocCriteriaDomain criteria, String reInvFlg, String[] tempInvoiceNoArr
            , W6001DocDomain freeColDomain, TmInvTplDomain tmInvTplDomain, String[] containerLst)  throws ApplicationException {
            try {
                this.createTwInvoiceOnRegister (criteria, reInvFlg, tempInvoiceNoArr
                    , freeColDomain, tmInvTplDomain, containerLst);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        
        /**
         * 
         * tp_prepareTwInvoiceDomainOnRegisterByCmlTyp
         * 
         * @param twInvoiceDomain twInvoiceDomain
         * @param criteria criteria
         * @param docInvDomain docInvDomain
         * @param docPltzDomain docPltzDomain
         * @throws ApplicationException ApplicationException
         */
        public void tp_prepareTwInvoiceDomainOnRegisterByCmlTyp (TwInvoiceDomain twInvoiceDomain
            , W6001DocCriteriaDomain criteria, W6001DocInvoiceDomain docInvDomain, W6001DocPltzDomain docPltzDomain) throws ApplicationException {
            try {
                this.prepareTwInvoiceDomainOnRegisterByCmlTyp (twInvoiceDomain
                    , criteria, docInvDomain, docPltzDomain);
            } catch (Exception e) {
            }
        }
        
        /**
         * 
         * tp_prepareTwInvoiceDomainOnRegisterByCommon
         * 
         * @param twInvoiceDomain twInvoiceDomain
         * @param criteria criteria
         * @param docInvDomain docInvDomain
         * @param docPltzDomain docPltzDomain
         * @param tempInvoiceNo tempInvoiceNo
         * @param freeColDomain freeColDomain
         * @param tmInvTplDomain tmInvTplDomain
         * @param containerLst containerLst
         * @throws ApplicationException ApplicationException
         */
        public void tp_prepareTwInvoiceDomainOnRegisterByCommon (TwInvoiceDomain twInvoiceDomain
            , W6001DocCriteriaDomain criteria, W6001DocInvoiceDomain docInvDomain, W6001DocPltzDomain docPltzDomain
            , String tempInvoiceNo, W6001DocDomain freeColDomain, TmInvTplDomain tmInvTplDomain, String[] containerLst)
            throws ApplicationException {
            try {
                this.prepareTwInvoiceDomainOnRegisterByCommon (twInvoiceDomain
                    , criteria, docInvDomain, docPltzDomain
                    , tempInvoiceNo, freeColDomain, tmInvTplDomain, containerLst);
            } catch (Exception e) {
            }
        }
        
        /**
         * 
         * tp_prepareTwInvoiceDomainOnRegisterForDBase
         * 
         * @param twInvoiceDomain twInvoiceDomain
         * @param criteria criteria
         * @param docInvDomain docInvDomain
         * @param tempInvoiceNoArr tempInvoiceNoArr
         */
        /**
         * 
         * Type in the functional overview of the method.
         * 
         * @param twInvoiceDomain twInvoiceDomain
         * @param criteria criteria
         * @param docInvDomain docInvDomain
         * @param tempInvoiceNoArr tempInvoiceNoArr
         * @param reInvFlg reInvFlg
         */
        public void tp_prepareTwInvoiceDomainOnRegisterForDBase (TwInvoiceDomain twInvoiceDomain
            , W6001DocCriteriaDomain criteria, W6001DocInvoiceDomain docInvDomain, String[] tempInvoiceNoArr, String reInvFlg) {
            try {
                this.prepareTwInvoiceDomainOnRegisterForDBase (twInvoiceDomain
                    , criteria, docInvDomain, tempInvoiceNoArr, reInvFlg);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        
        /**
         * 
         * tp_prepareTwInvoiceDomainOnRegisterForReInvoice
         * 
         * @param twInvoiceDomain twInvoiceDomain
         * @param criteria criteria
         * @param docInvDomain docInvDomain
         * @param tempInvoiceNoArr tempInvoiceNoArr
         */
        public void tp_prepareTwInvoiceDomainOnRegisterForReInvoice (TwInvoiceDomain twInvoiceDomain
            , W6001DocCriteriaDomain criteria, W6001DocInvoiceDomain docInvDomain, String[] tempInvoiceNoArr) {
            try {
                this.prepareTwInvoiceDomainOnRegisterForReInvoice (twInvoiceDomain
                    , criteria, docInvDomain, tempInvoiceNoArr);
            } catch (Exception e) {
            }
        }
        
        /**
         * 
         * tp_checkCreateInvoiceNoOnRegister
         * 
         * @param dscId dscId
         * @param shipperCd shipperCd
         * @param grpNo1 grpNo1
         * @return boolean
         * @throws ApplicationException ApplicationException
         */
        public boolean tp_checkCreateInvoiceNoOnRegister (String dscId, String shipperCd, String grpNo1) throws ApplicationException {
            try {
                return this.checkCreateInvoiceNoOnRegister (dscId, shipperCd, grpNo1);
            } catch (Exception e) {
            }
            return true;
        }
        
        /**
         * 
         * tp_transactOnRegisterByRegistTtInvoice
         * 
         * @param criteria criteria
         * @return W6001DocInvoiceDomain
         * @throws ApplicationException ApplicationException
         */
        public W6001DocInvoiceDomain tp_transactOnRegisterByRegistTtInvoice(W6001DocCriteriaDomain criteria) throws ApplicationException {
            try {
                return this.transactOnRegisterByRegistTtInvoice(criteria);
            } catch (Exception e) {
            }
            return null;
        }
        
        /**
         * 
         * tp_sequenceNormalInvoiceNo
         * 
         * @param twInvList twInvList
         * @param shipperCd shipperCd
         * @param dscId dscId
         * @return List<String>
         * @throws ApplicationException ApplicationException
         */
        public List<String> tp_sequenceNormalInvoiceNo (List<? extends TwInvDomain> twInvList, String shipperCd, String dscId) throws ApplicationException {
            try {
                return this.sequenceNormalInvoiceNo (twInvList, shipperCd, dscId);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }
        
        /**
         * 
         * tp_sequenceReInvoiceNo
         * 
         * @param twInvList twInvList
         * @param shipperCd shipperCd
         * @param dscId dscId
         * @throws ApplicationException ApplicationException
         */
        public void tp_sequenceReInvoiceNo (List<? extends TwInvDomain> twInvList, String shipperCd, String dscId) throws ApplicationException {
            try {
                this.sequenceReInvoiceNo (twInvList, shipperCd, dscId);
            } catch (Exception e) {
            }
        }
        
        /**
         * 
         * tp_searchTwInvOnRegisterForNormInv
         * 
         * @param dscId dscId
         * @param shipperCd shipperCd
         * @param grpNo1 grpNo1
         * @return List<? extends TwInvDomain>
         * @throws ApplicationException ApplicationException
         */
        public List<? extends TwInvDomain> tp_searchTwInvOnRegisterForNormInv (String dscId, String shipperCd, String grpNo1) throws ApplicationException {
            try {
                return this.searchTwInvOnRegisterForNormInv (dscId, shipperCd, grpNo1);
            } catch (Exception e) {
            }
            return null;
        }
        
        /**
         * 
         * tp_transactSequenceNormalInv
         * 
         * @param shipperCd shipperCd
         * @param cmlTyp cmlTyp
         * @return String
         * @throws ApplicationException ApplicationException
         */
        public String tp_transactSequenceNormalInv (String shipperCd, String cmlTyp) throws ApplicationException {
            try {
                return this.transactSequenceNormalInv (shipperCd, cmlTyp);
            } catch (Exception e) {
            }
            return "";
        }
        
        /**
         * 
         * tp_searchTmInvSeqOnRegister
         * 
         * @param seqKey seqKey
         * @param compCd compCd
         * @return String
         * @throws ApplicationException ApplicationException
         */
        public String tp_searchTmInvSeqOnRegister(String seqKey, String compCd) throws ApplicationException {
            try {
                return this.searchTmInvSeqOnRegister(seqKey, compCd);
            } catch (Exception e) {
            }
            return "";
        }
        
        /**
         * 
         * tp_createNormalInvoiceNoOnRegister
         * 
         * @param twInvList twInvList
         * @param criteria criteria
         * @param normInvNoList normInvNoList
         * @param invIssueDt invIssueDt
         * @param mnInvIssueDt mnInvIssueDt
         * @return List<? extends TtInvoiceDomain>
         * @throws ApplicationException ApplicationException
         */
        public List<? extends TtInvoiceDomain> tp_createNormalInvoiceNoOnRegister(List<? extends TwInvDomain> twInvList, W6001DocCriteriaDomain criteria, List<String> normInvNoList, Date invIssueDt, Date mnInvIssueDt) throws ApplicationException {
            try {
                return this.createNormalInvoiceNoOnRegister(twInvList, criteria, normInvNoList, invIssueDt, mnInvIssueDt);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }
        
        /**
         * 
         * tp_getDscName
         * 
         * @param dscId dscId
         * @return String
         * @throws ApplicationException ApplicationException
         */
        public String tp_getDscName(String dscId) throws ApplicationException {
            try {
                return this.getDscName(dscId);
            } catch (Exception e) {
            }
            return "";
        }
//        
//        /**
//         * 
//         * tp_searchTwInvoiceDomainOnRegisterForCreate
//         * 
//         * @param dscId dscId
//         * @param invoiceNo invoiceNo
//         * @param shipperCd shipperCd
//         * @param grpNo2 grpNo2
//         * @param normInv normInv
//         * @return List<? extends TwInvoiceDomain>
//         * @throws ApplicationException ApplicationException
//         */
//        public List<? extends TwInvoiceDomain> tp_searchTwInvoiceDomainOnRegisterForCreate (String dscId, String invoiceNo, String shipperCd, String grpNo2, boolean normInv) throws ApplicationException {
//            try {
//                return this.searchTwInvoiceDomainOnRegisterForCreate (dscId, invoiceNo, shipperCd, grpNo2, normInv);
//            } catch (Exception e) {
//            }
//            return null;
//        }
//        
        /**
         * 
         * tp_searchTwInvPltzOnRegister
         * 
         * @param dscId dscId
         * @param shipperCd shipperCd
         * @param grpNo1 grpNo1
         * @return List<? extends TwInvPltzDomain>
         * @throws ApplicationException ApplicationException
         */
        public List<? extends TwInvPltzDomain> tp_searchTwInvPltzOnRegister(String dscId, String shipperCd, String grpNo1) throws ApplicationException {
            try {
                return this.searchTwInvPltzOnRegister (dscId, shipperCd, grpNo1);
            } catch (Exception e) {
            }
            return null;
        }
        
//        /**
//         * 
//         * tp_searchTwInvItemOnRegister
//         * 
//         * @param dscId dscId
//         * @param shipperCd shipperCd
//         * @param grpNo1 grpNo1
//         * @param grpNo2 grpNo2
//         * @return List<? extends TwInvItemDomain>
//         * @throws ApplicationException ApplicationException
//         */
//        public List<? extends TwInvItemDomain> tp_searchTwInvItemOnRegister(String dscId, String shipperCd, String grpNo1, String grpNo2) throws ApplicationException {
//            try {
//                return this.searchTwInvItemOnRegister(dscId, shipperCd, grpNo1, grpNo2);
//            } catch (Exception e) {
//            }
//            return null;
//        }
        
//        /**
//         * 
//         * tp_createTtInvoiceHeaderOnRegister
//         * 
//         * @param twInvoiceList twInvoiceList
//         * @param dscId dscId
//         * @param dscNm dscNm
//         * @param grpNo2 grpNo2
//         * @param invoiceIssueDt invoiceIssueDt
//         * @return List<TtInvoiceHeaderDomain>
//         * @throws ApplicationException ApplicationException
//         */
//        public List<TtInvoiceHeaderDomain> tp_createTtInvoiceHeaderOnRegister (List<? extends TwInvoiceDomain> twInvoiceList, String dscId, String dscNm, String grpNo2, Date invoiceIssueDt)throws ApplicationException {
//            try {
//                return this.createTtInvoiceHeaderOnRegister(twInvoiceList, dscId, dscNm, grpNo2, invoiceIssueDt);
//            } catch (Exception e) {
//            }
//            return null;
//        }
        
//        /**
//         * 
//         * tp_createTtInvoiceAttachedOnRegister
//         * 
//         * @param twInvoiceList twInvoiceList
//         * @param grpNo2 grpNo2
//         * @param invoiceIssueDt invoiceIssueDt
//         * @param twInvItemList twInvItemList
//         * @return List<TtInvoiceAttachedDomain>
//         * @throws ApplicationException ApplicationException
//         */
//        public List<TtInvoiceAttachedDomain> tp_createTtInvoiceAttachedOnRegister (List<? extends TwInvoiceDomain> twInvoiceList, String grpNo2, Date invoiceIssueDt, List<? extends TwInvItemDomain> twInvItemList) throws ApplicationException {
//            try {
//                return this.createTtInvoiceAttachedOnRegister(twInvoiceList, grpNo2, invoiceIssueDt, twInvItemList);
//            } catch (Exception e) {
//            }
//            return null;
//        }
        
//        /**
//         * 
//         * tp_getOriginCntryNm
//         * 
//         * @param twInvoiceDomain twInvoiceDomain
//         * @param twInvItemDomain twInvItemDomain
//         * @return String
//         * @throws ApplicationException ApplicationException
//         */
//        public String tp_getOriginCntryNm(TwInvoiceDomain twInvoiceDomain, TwInvItemDomain twInvItemDomain) throws ApplicationException {
//            try {
//                return this.getOriginCntryNm(twInvoiceDomain, twInvItemDomain);
//            } catch (Exception e) {
//            }
//            return "";
//        }
//        /**
//         * 
//         * tp_createTtPackingHeadOnRegister
//         * 
//         * @param twInvoiceList twInvoiceList
//         * @param grpNo2 grpNo2
//         * @param invoiceIssueDt invoiceIssueDt
//         * @throws ApplicationException ApplicationException
//         */
//        public void tp_createTtPackingHeadOnRegister(List<? extends TwInvoiceDomain> twInvoiceList, String grpNo2, Date invoiceIssueDt) throws ApplicationException {
//            try {
//                this.createTtPackingHeadOnRegister(twInvoiceList, grpNo2, invoiceIssueDt);
//            } catch (Exception e) {
//            }
//        }
        
//        /**
//         * 
//         * tp_createTtPackingAttachedCmlOnRegister
//         * 
//         * @param twInvoiceList twInvoiceList
//         * @param twInvPltzList twInvPltzList
//         * @param grpNo2 grpNo2
//         * @param invoiceIssueDt invoiceIssueDt
//         * @throws ApplicationException ApplicationException
//         */
//        public void tp_createTtPackingAttachedCmlOnRegister (List<? extends TwInvoiceDomain> twInvoiceList, List<? extends TwInvPltzDomain> twInvPltzList, String grpNo2,  Date invoiceIssueDt) throws ApplicationException {
//            try {
//                this.createTtPackingAttachedCmlOnRegister (twInvoiceList, twInvPltzList, grpNo2,  invoiceIssueDt);
//            } catch (Exception e) {
//            }
//        }
        
//        /**
//         * 
//         * tp_createTtPackAtchItemNoOnRegister
//         * 
//         * @param twInvoiceList twInvoiceList
//         * @param twInvPltzList twInvPltzList
//         * @param twInvItemList twInvItemList
//         * @param grpNo2 grpNo2
//         * @param invoiceIssueDt invoiceIssueDt
//         * @throws ApplicationException ApplicationException
//         */
//        public void tp_createTtPackAtchItemNoOnRegister (List<? extends TwInvoiceDomain> twInvoiceList, List<? extends TwInvPltzDomain> twInvPltzList, List<? extends TwInvItemDomain> twInvItemList, String grpNo2, Date invoiceIssueDt) throws ApplicationException {
//            try {
//                this.createTtPackAtchItemNoOnRegister (twInvoiceList, twInvPltzList, twInvItemList, grpNo2, invoiceIssueDt);
//            } catch (Exception e) {
//            }
//        }
        
//        /**
//         * 
//         * tp_createTtScHeaderOnRegister
//         * 
//         * @param ttInvoiceHeaderList ttInvoiceHeaderList
//         * @throws ApplicationException ApplicationException
//         */
//        public void tp_createTtScHeaderOnRegister (List<? extends TtInvoiceHeaderDomain> ttInvoiceHeaderList) throws ApplicationException {
//            try {
//                this.createTtScHeaderOnRegister (ttInvoiceHeaderList);
//            } catch (Exception e) {
//            }
//        }
        
        /**
         * 
         * tp_createTtScAttachedOnRegister
         * 
         * @param ttInvoiceAttachedList ttInvoiceAttachedList
         * @throws ApplicationException ApplicationException
         */
        public void tp_createTtScAttachedOnRegister (List<? extends TtInvoiceAttachedDomain> ttInvoiceAttachedList) throws ApplicationException {
            try {
                this.createTtScAttachedOnRegister (ttInvoiceAttachedList);
            } catch (Exception e) {
            }
        }
        
        /**
         * 
         * tp_createPdfFileOnRegister
         * 
         * @param shipperCd shipperCd
         * @param invoiceNo invoiceNo
         * @param invoiceIssueDt invoiceIssueDt
         * @param invTplNo invTplNo
         * @param dscId dscId
         * @param cmlTyp cmlTyp
         * @param invCtgry invCtgry
         * @param invClass invClass
         * @param dateFormat dateFormat
         * @param charCd charCd
         * @param reportSc reportSc
         * @throws ApplicationException ApplicationException
         */
        public void tp_createPdfFileOnRegister(String shipperCd, String invoiceNo, Date invoiceIssueDt, String invTplNo, String dscId, String cmlTyp, String invCtgry, String invClass, String dateFormat, String charCd, boolean reportSc) throws ApplicationException {
            try {
                this.createPdfFileOnRegister(shipperCd, invoiceNo, invoiceIssueDt, invTplNo, dscId, cmlTyp, invCtgry, invClass, dateFormat, charCd, reportSc) ;
            } catch (Exception e) {
            }
        }
        
        /**
         * 
         * tp_updateTtInvoiceHeaderByFileId
         * 
         * @param fileId fileId
         * @param shipperCd shipperCd
         * @param invoiceNo invoiceNo
         * @param invoiceIssueDt invoiceIssueDt
         * @param screenId screenId
         * @return int
         * @throws ApplicationException ApplicationException
         */
        public int tp_updateTtInvoiceHeaderByFileId(String fileId, String shipperCd, String invoiceNo, Date invoiceIssueDt, String screenId) throws ApplicationException {
            try {
                return this.updateTtInvoiceHeaderByFileId(fileId, shipperCd, invoiceNo, invoiceIssueDt, screenId);
            } catch (Exception e) {
            }
            return 0;
        }
        
        /**
         * 
         * tp_updateTtPackingHeadByFileId
         * 
         * @param fileId fileId
         * @param shipperCd shipperCd
         * @param invoiceNo invoiceNo
         * @param invoiceIssueDt invoiceIssueDt
         * @param screenId screenId
         * @return int
         * @throws ApplicationException ApplicationException
         */
        public int tp_updateTtPackingHeadByFileId(String fileId, String shipperCd, String invoiceNo, Date invoiceIssueDt, String screenId) throws ApplicationException {
            try {
                return this.updateTtPackingHeadByFileId(fileId, shipperCd, invoiceNo, invoiceIssueDt, screenId);
            } catch (Exception e) {
            }
            return 0;
        }
        
        /**
         * 
         * tp_updateTtScHeaderByFileId
         * 
         * @param fileId fileId
         * @param shipperCd shipperCd
         * @param invoiceNo invoiceNo
         * @param invoiceIssueDt invoiceIssueDt
         * @param screenId screenId
         * @return int
         * @throws ApplicationException ApplicationException
         */
        public int tp_updateTtScHeaderByFileId(String fileId, String shipperCd, String invoiceNo, Date invoiceIssueDt, String screenId) throws ApplicationException {
            try {
                return this.updateTtScHeaderByFileId(fileId, shipperCd, invoiceNo, invoiceIssueDt, screenId);
            } catch (Exception e) {
            }
            return 0;
        }
        
        /**
         * 
         * tp_updateTtPltzOnRegisterForMainInvoice
         * 
         * @param twInvList twInvList
         * @param normInvNoList normInvNoList
         * @param criteria criteria
         * @param invoiceIssueDt invoiceIssueDt
         * @return int
         * @throws ApplicationException ApplicationException
         */
        public int tp_updateTtPltzOnRegisterForMainInvoice (List<? extends TwInvDomain> twInvList, List<String> normInvNoList, W6001DocCriteriaDomain criteria, Date invoiceIssueDt) throws ApplicationException {
            try {
                return this.updateTtPltzOnRegisterForMainInvoice(twInvList, normInvNoList, criteria, invoiceIssueDt);
            } catch (Exception e) {
            }
            return 0;
        }
        
        /**
         * 
         * tp_updateTtTmpStockOnRegisterByQty
         * 
         * @param ttInvoiceList ttInvoiceList
         * @return int
         * @throws ApplicationException ApplicationException
         */
        public int tp_updateTtTmpStockOnRegisterByQty(List<? extends TtInvoiceDomain> ttInvoiceList) throws ApplicationException {
            try {
                return this.updateTtTmpStockOnRegisterByQty(ttInvoiceList);
            } catch (Exception e) {
            }
            return 0;
        }
        
        /**
         * 
         * tp_updateTtExpRcvOdrOnRegister
         * 
         * @param ttInvoiceList ttInvoiceList
         * @return int
         * @throws ApplicationException ApplicationException
         */
        public int tp_updateTtExpRcvOdrOnRegister (List<? extends TtInvoiceDomain> ttInvoiceList) throws ApplicationException {
            try {
                return this.updateTtExpRcvOdrOnRegister (ttInvoiceList);
            } catch (Exception e) {
            }
            return 0;
        }
        
        /**
         * 
         * tp_callWebService6001
         * 
         * @param compCd compCd
         * @param ttInvoiceList ttInvoiceList
         * @throws ApplicationException ApplicationException
         */
        public void tp_callWebService6001(String compCd, List<? extends TtInvoiceDomain> ttInvoiceList) throws ApplicationException {
            try {
                this.callWebService6001(compCd, ttInvoiceList);
            } catch (Exception e) {
            }
        }
   
        //---------------------------------ここから下、坂井作成分---------------------------------//
        /**
         * 
         * tp_prepareWs6001ParamDomain
         * 
         * @param shipperCd shipperCd
         * @param invoiceNo invoiceNo
         * @param invoiceIssueDt invoiceIssueDt
         */
        public void tp_prepareWs6001ParamDomain(String shipperCd, String invoiceNo, Date invoiceIssueDt) {
            try {
                this.prepareWs6001ParamDomain(shipperCd, invoiceNo, invoiceIssueDt);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        
        /**
         * 
         * tp_searchTtInvoiceByHeaderRegister
         * 
         * @param shipperCd shipperCd
         * @param invoiceNo invoiceNo
         * @param invoiceIssueDt invoiceIssueDt
         */
        public void tp_searchTtInvoiceByHeaderRegister(String shipperCd, String invoiceNo, Date invoiceIssueDt) {
            try {
                this.searchTtInvoiceByHeaderRegister(shipperCd, invoiceNo, invoiceIssueDt);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        
        /**
         * 
         * tp_transactSequenceCancelInvNo
         * 
         * @param criteria criteria
         * @param ttInvoiceList ttInvoiceList
         */
        public void tp_transactSequenceCancelInvNo(W6001DocCriteriaDomain criteria, List<? extends TtInvoiceDomain> ttInvoiceList) {
            try {
                this.transactSequenceCancelInvNo(criteria, ttInvoiceList);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        
        /**
         * 
         * tp_searchTmCancelInvSeqTyp
         * 
         * @param shipperCd shipperCd
         */
        public void tp_searchTmCancelInvSeqTyp(String shipperCd) {
            try {
                this.searchTmCancelInvSeqTyp(shipperCd);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        
        /**
         * 
         * tp_createCancelInvoiceNoOnRegister
         * 
         * @param cancelList cancelList
         * @param cancelInvNoList cancelInvNoList
         * @param criteria criteria
         */
        public void tp_createCancelInvoiceNoOnRegister(List<? extends TtInvoiceDomain> cancelList, List<String> cancelInvNoList, W6001DocCriteriaDomain criteria) {
            try {
                this.createCancelInvoiceNoOnRegister(cancelList, cancelInvNoList, criteria);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        
        /**
         * 
         * tp_createTtInvoiceOnRegisterByCancel
         * 
         * @param cancelList cancelList
         * @param cancelInvNoList cancelInvNoList
         * @param invIssueDt invIssueDt
         * @param dscId dscId
         * @param dscNm dscNm
         */
        public void tp_createTtInvoiceOnRegisterByCancel(List<? extends TtInvoiceDomain> cancelList, List<String> cancelInvNoList, Date invIssueDt, String dscId, String dscNm) {
            try {
                this.createTtInvoiceOnRegisterByCancel(cancelList, cancelInvNoList, invIssueDt, dscId, dscNm);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        
        /**
         * 
         * tp_createTtInvoiceHeaderOnRegisterByCancel
         * 
         * @param cancelList cancelList
         * @param cancelInvNoList cancelInvNoList
         * @param createInvoiceList createInvoiceList
         * @param invIssueDt invIssueDt
         */
        public void tp_createTtInvoiceHeaderOnRegisterByCancel(List<? extends TtInvoiceDomain> cancelList, List<String> cancelInvNoList, List<? extends TtInvoiceDomain> createInvoiceList, Date invIssueDt) {
            try {
                this.createTtInvoiceHeaderOnRegisterByCancel(cancelList, cancelInvNoList, createInvoiceList, invIssueDt);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        
        /**
         * 
         * tp_createTtPackingHeadOnRegisterByCancel
         * 
         * @param cancelList cancelList
         * @param cancelInvNoList cancelInvNoList
         * @param createInvoiceList createInvoiceList
         * @param invIssueDt invIssueDt
         */
        public void tp_createTtPackingHeadOnRegisterByCancel(List<? extends TtInvoiceDomain> cancelList, List<String> cancelInvNoList, List<? extends TtInvoiceDomain> createInvoiceList, Date invIssueDt) {
            try {
                this.createTtPackingHeadOnRegisterByCancel(cancelList, cancelInvNoList, createInvoiceList, invIssueDt);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        
        /**
         * 
         * tp_createTtInvoiceAttachedOnRegisterByCancel
         * 
         * @param cancelList cancelList
         * @param cancelInvNoList cancelInvNoList
         * @param createInvoiceList createInvoiceList
         * @param invIssueDt invIssueDt
         */
        public void tp_createTtInvoiceAttachedOnRegisterByCancel(List<? extends TtInvoiceDomain> cancelList, List<String> cancelInvNoList, List<? extends TtInvoiceDomain> createInvoiceList, Date invIssueDt) {
            try {
                this.createTtInvoiceAttachedOnRegisterByCancel(cancelList, cancelInvNoList, createInvoiceList, invIssueDt);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        
        /**
         * 
         * tp_createTtPackingAttachedCmlOnRegisterByCancel
         * 
         * @param cancelList cancelList
         * @param cancelInvNoList cancelInvNoList
         * @param createInvoiceList createInvoiceList
         * @param invIssueDt invIssueDt
         */
        public void tp_createTtPackingAttachedCmlOnRegisterByCancel(List<? extends TtInvoiceDomain> cancelList, List<String> cancelInvNoList, List<? extends TtInvoiceDomain> createInvoiceList, Date invIssueDt) {
            try {
                this.createTtPackingAttachedCmlOnRegisterByCancel(cancelList, cancelInvNoList, createInvoiceList, invIssueDt);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        
        /**
         * 
         * tp_createTtPackAtchItemNoOnRegisterByCancel
         * 
         * @param cancelList cancelList
         * @param cancelInvNoList cancelInvNoList
         * @param createInvoiceList createInvoiceList
         * @param invIssueDt invIssueDt
         */
        public void tp_createTtPackAtchItemNoOnRegisterByCancel(List<? extends TtInvoiceDomain> cancelList, List<String> cancelInvNoList, List<? extends TtInvoiceDomain> createInvoiceList, Date invIssueDt) {
            try {
                this.createTtPackAtchItemNoOnRegisterByCancel(cancelList, cancelInvNoList, createInvoiceList, invIssueDt);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        
        /**
         * 
         * tp_updateTtInvoiceOnRegisterbyCancel
         * 
         * @param cancelList cancelList
         */
        public void tp_updateTtInvoiceOnRegisterbyCancel(List<? extends TtInvoiceDomain> cancelList) {
            try {
                this.updateTtInvoiceOnRegisterbyCancel(cancelList);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        
        /**
         * 
         * tp_updateTtPltzOnRegisterbyCancel
         * 
         * @param ttInvoiceDomain ttInvoiceDomain
         * @param criteria criteria
         */
        public void tp_updateTtPltzOnRegisterbyCancel(TtInvoiceDomain ttInvoiceDomain, W6001DocCriteriaDomain criteria) {
            try {
                this.updateTtPltzOnRegisterbyCancel(ttInvoiceDomain, criteria);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        
        /**
         * 
         * tp_updateTtTmpStockOnRegisterByQtyAdd
         * 
         * @param ttInvoiceDomain ttInvoiceDomain
         * @param criteria criteria
         */
        public void tp_updateTtTmpStockOnRegisterByQtyAdd(TtInvoiceDomain ttInvoiceDomain, W6001DocCriteriaDomain criteria) {
            try {
                this.updateTtTmpStockOnRegisterByQtyAdd(ttInvoiceDomain, criteria);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        
        /**
         * 
         * tp_updateTtExpRcvOdrOnRegisterSubtract
         * 
         * @param ttInvoiceDomain ttInvoiceDomain
         * @param criteria criteria
         */
        public void tp_updateTtExpRcvOdrOnRegisterSubtract(TtInvoiceDomain ttInvoiceDomain, W6001DocCriteriaDomain criteria) {
            try {
                this.updateTtExpRcvOdrOnRegisterSubtract(ttInvoiceDomain, criteria);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        
        /**
         * 
         * tp_callWebService6002
         * 
         * @param compCd compCd
         * @param ttInvoiceList ttInvoiceList
         */
        public void tp_callWebService6002(String compCd, List<? extends TtInvoiceDomain> ttInvoiceList) {
            try {
                this.callWebService6002(compCd, ttInvoiceList);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        
        /**
         * 
         * tp_createTwInvItemOnInvoiceGroupingBySearch
         * 
         * @param firstTimeFlg firstTimeFlg
         * @param dscId dscId
         * @param shipperCd shipperCd
         * @return List<? extends W6001DocPltzDomain>
         */
        public List<? extends W6001DocPltzDomain> tp_createTwInvItemOnInvoiceGroupingBySearch(String firstTimeFlg, String dscId, String shipperCd) {
            try {
                return this.createTwInvItemOnInvoiceGroupingBySearch(firstTimeFlg, dscId, shipperCd);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }
        
        /**
         * 
         * tp_updateTwInvPltzOnInvoiceGroupingBySearchForCigma
         * 
         * @param firstTimeFlg firstTimeFlg
         * @param dscId dscId
         * @param shipperCd shipperCd
         * @param docInvPltzList docInvPltzList
         * @return int
         */
        public int tp_updateTwInvPltzOnInvoiceGroupingBySearchForCigma(String firstTimeFlg, String dscId, String shipperCd, List<? extends W6001DocPltzDomain> docInvPltzList) {
            try {
                return this.updateTwInvPltzOnInvoiceGroupingBySearchForCigma(firstTimeFlg, dscId, shipperCd, docInvPltzList);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return 0;
        }
        
        /**
         * 
         * tp_callWebService6003
         * 
         * @param shipperCd shipperCd
         * @param docPltzList docPltzList
         * @return Ws6003ResultDomain
         */
        public Ws6003ResultDomain tp_callWebService6003(String shipperCd, List<? extends W6001DocPltzDomain> docPltzList) {
            try {
                return this.callWebService6003(shipperCd, docPltzList);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }
        
        /**
         * 
         * tp_updateTwInvPltzOnInvoiceGroupingBySearchForRt
         * 
         * @param firstTimeFlg firstTimeFlg
         * @param dscId dscId
         * @param shipperCd shipperCd
         * @return int
         */
        public int tp_updateTwInvPltzOnInvoiceGroupingBySearchForRt(String firstTimeFlg, String dscId, String shipperCd) {
            try {
                return this.updateTwInvPltzOnInvoiceGroupingBySearchForRt(firstTimeFlg, dscId, shipperCd);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return 0;
        }
        
        /**
         * 
         * tp_updateTwInvPltzOnInvoiceGroupingBySearchForGrpNo1
         * 
         * @param firstTimeFlg firstTimeFlg
         * @param dscId dscId
         * @param shipperCd shipperCd
         * @return int
         */
        public int tp_updateTwInvPltzOnInvoiceGroupingBySearchForGrpNo1(String firstTimeFlg, String dscId, String shipperCd) {
            try {
                return this.updateTwInvPltzOnInvoiceGroupingBySearchForGrpNo1(firstTimeFlg, dscId, shipperCd);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return 0;
        }
        
        /**
         * 
         * tp_updateTwInvItemOnInvoiceGroupingBySearchForGrpNo1
         * 
         * @param firstTimeFlg firstTimeFlg
         * @param dscId dscId
         * @param shipperCd shipperCd
         * @return int
         */
        public int tp_updateTwInvItemOnInvoiceGroupingBySearchForGrpNo1(String firstTimeFlg, String dscId, String shipperCd) {
            try {
                return this.updateTwInvItemOnInvoiceGroupingBySearchForGrpNo1 (firstTimeFlg, dscId, shipperCd);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return 0;
        }
        
        /**
         * 
         * tp_searchTwInvItemOnInvoiceGroupingForMaxGrpNo2
         * 
         * @param dscId dscId
         * @param mainMark mainMark
         * @param currCd currCd
         * @param grpNo1 grpNo1
         * @return int
         */
        public int tp_searchTwInvItemOnInvoiceGroupingForMaxGrpNo2(String dscId, String mainMark, String currCd, String grpNo1) {
            try {
//                return this.searchTwInvItemOnInvoiceGroupingForMaxGrpNo2 (dscId, currCd, grpNo1);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return 0;
        }
        
    }
    
    
    /**
     * w6001DocService
     */
    private W6001DocService w6001DocService;
    
    
    /**
     * testW6001DocService
     */
    private TestW6001 testW6001DocService;
    
    /**
     * デフォルトコンストラクタ。
     */
    public W6001DocServiceTest() {
    }
    
    /**
     * 前処理
     * 
     * @throws Exception 例外発生した場合
     */
    @Before
    public void setUp() throws Exception {
        w6001DocService = (W6001DocService) getContext().getBean("w6001DocService");
        testW6001DocService = new TestW6001();
    }
    
    /**
     * 更新系の処理をMOCにより無効とするための処理集合
     * 
     */
    @Test
    public void testtp_updateMocInvaludate()  {
        
        MockObjectManager.setReturnNullAtAllTimes(TtInvoiceAttachedServiceImpl.class, "create");
        MockObjectManager.setReturnNullAtAllTimes(TtInvoiceHeaderServiceImpl.class, "create");
        MockObjectManager.setReturnNullAtAllTimes(TtInvoiceServiceImpl.class, "create");
        MockObjectManager.setReturnNullAtAllTimes(TtPackAtchItemNoServiceImpl.class, "create");
        MockObjectManager.setReturnNullAtAllTimes(TtPackingAttachedCmlServiceImpl.class, "create");
        MockObjectManager.setReturnNullAtAllTimes(TtPackingHeadServiceImpl.class, "create");
        MockObjectManager.setReturnNullAtAllTimes(TwInvoiceServiceImpl.class, "create");
        
        
        MockObjectManager.setReturnNullAtAllTimes(TwInvItemServiceImpl.class, "updateByCondition"); 
        MockObjectManager.setReturnValueAtAllTimes(TtInvoiceAttachedServiceImpl.class, "updateByCondition", 1);
        MockObjectManager.setReturnValueAtAllTimes(TtPackAtchItemNoServiceImpl.class, "updateByCondition", 1);
        MockObjectManager.setReturnValueAtAllTimes(TtPackingAttachedCmlServiceImpl.class, "updateByCondition", 1);
        MockObjectManager.setReturnValueAtAllTimes(TtPackingHeadServiceImpl.class, "updateByCondition", 1);
        MockObjectManager.setReturnValueAtAllTimes(TtPltzServiceImpl.class, "updateByCondition", 1);
        MockObjectManager.setReturnValueAtAllTimes(TwInvItemServiceImpl.class, "updateByCondition", 1);
        MockObjectManager.setReturnValueAtAllTimes(TwInvPltzServiceImpl.class, "updateByCondition", 1);
        MockObjectManager.setReturnValueAtAllTimes(TwInvServiceImpl.class, "updateByCondition", 1);
        MockObjectManager.setReturnValueAtAllTimes(W6001DocDaoImpl.class, "updateClearPriceByTwInvItem", 1);
        MockObjectManager.setReturnValueAtAllTimes(W6001DocDaoImpl.class, "updateTtInvoiceByKey", 1);
        MockObjectManager.setReturnValueAtAllTimes(W6001DocDaoImpl.class, "updateTtInvoiceHeaderByKey", 1);
        MockObjectManager.setReturnValueAtAllTimes(W6001DocDaoImpl.class, "updateTtPltzByPltzStatus", 1);

    }
    /**
     * 正常ケース
     * 
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testtp_createFileUpload01() throws Exception  {
        
        testtp_updateMocInvaludate();
        
        InputStream invoiceFileData = new ByteArrayInputStream("HelloInvoice".getBytes());
        
        MockObjectManager.setReturnValueAtAllTimes(FileManagementServiceImpl.class, "createFileUpload", "Test");
        testW6001DocService.tp_createFileUpload01(invoiceFileData, "1", "2");
        MockObjectManager.setReturnValueAtAllTimes(FileManagementServiceImpl.class, "createFileUpload", new FileManagementException("F"));
        testW6001DocService.tp_createFileUpload01(invoiceFileData, "1", "2");
        MockObjectManager.setReturnValueAtAllTimes(FileManagementServiceImpl.class, "createFileUpload", new GscmApplicationException("F"));
        testW6001DocService.tp_createFileUpload01(invoiceFileData, "1", "2");
        MockObjectManager.setReturnValueAtAllTimes(FileManagementServiceImpl.class, "createFileUpload", new IOException("F"));
        testW6001DocService.tp_createFileUpload01(invoiceFileData, "1", "2");
    
    }

    /**
     * 正常ケース
     * 
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testtp_createFileUpload02() throws Exception  {
        
        testtp_updateMocInvaludate();
        
        // ここはいいのでなんでも実在するファイル（小サイズ）を記載すればよい
        File invoiceFileData = new File("c:/windows/notepad.exe");
        
        MockObjectManager.setReturnValueAtAllTimes(FileManagementServiceImpl.class, "createFileUpload", new FileNotFoundException("F"));
        testW6001DocService.tp_createFileUpload02(invoiceFileData, "1");
        MockObjectManager.setReturnValueAtAllTimes(FileManagementServiceImpl.class, "createFileUpload", new FileManagementException("F"));
        testW6001DocService.tp_createFileUpload02(invoiceFileData, "1");
        MockObjectManager.setReturnValueAtAllTimes(FileManagementServiceImpl.class, "createFileUpload", new UnsupportedEncodingException("F"));
        testW6001DocService.tp_createFileUpload02(invoiceFileData, "1");
        MockObjectManager.setReturnValueAtAllTimes(FileManagementServiceImpl.class, "createFileUpload", new IOException("F"));
        MockObjectManager.addReturnValue(InputStream.class, "close", new IOException("F"));
        testW6001DocService.tp_createFileUpload02(invoiceFileData, "1");
        MockObjectManager.setReturnValueAtAllTimes(FileManagementServiceImpl.class, "createFileUpload", "Test");
        testW6001DocService.tp_createFileUpload02(invoiceFileData, "1");
    
    }

    /**
     * 正常ケース
     * 
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testtp_transactOnRegisterByRegistTwInvoice() throws Exception  {

        testtp_updateMocInvaludate();
        
        W6001DocCriteriaDomain criteria = new W6001DocCriteriaDomain();
        criteria.setGrpNo2("0");
        criteria.setCmlTyp("1");
        TmNxsCompDomain tmNxsCompDomainShipper = new TmNxsCompDomain();
        tmNxsCompDomainShipper.setDnBaseFlg("Y");
        MockObjectManager.setReturnValueAtAllTimes(W6001DocServiceImpl.class, "searchTmNxsComp", tmNxsCompDomainShipper);
        TmCigmaCustomerXrefDomain tmCigmaCusXrefDomain = new TmCigmaCustomerXrefDomain();
        MockObjectManager.setReturnValueAtAllTimes(W6001DocServiceImpl.class, "searchTmCigmaCusXref", tmCigmaCusXrefDomain);
        
        String[] tmpInvoiceNoArr = {"1"};
        MockObjectManager.setReturnValueAtAllTimes(W6001DocServiceImpl.class, "getTempInvoiceNo", tmpInvoiceNoArr);
        W6001DocDomain docDomainForFreeCol = new W6001DocDomain();
        MockObjectManager.setReturnValueAtAllTimes(W6001DocServiceImpl.class, "searchTwInvOnRegisterByFree", docDomainForFreeCol);
        
        TmInvTplDomain tmInvTplDomain = new TmInvTplDomain();
        MockObjectManager.setReturnValueAtAllTimes(W6001DocServiceImpl.class, "searchTmInvTplByKey", tmInvTplDomain);
        MockObjectManager.setReturnValueAtAllTimes(W6001DocServiceImpl.class, "updateTwInvItemOnRegisterForTempInvoiceNo", 1);
        MockObjectManager.setReturnValueAtAllTimes(W6001DocServiceImpl.class, "updateIwInvOnRegisterForTempInvoiceNo", 1);
        MockObjectManager.setReturnNullAtAllTimes(W6001DocServiceImpl.class, "createTwInvoiceOnRegister");
        MockObjectManager.setReturnValueAtAllTimes(W6001DocServiceImpl.class, "checkCreateInvoiceNoOnRegister", true);
        MockObjectManager.setReturnValueAtAllTimes(W6001DocDaoImpl.class, "searchTwInvoiceByRegister", tmCigmaCusXrefDomain);
        try {
            testW6001DocService.tp_transactOnRegisterByRegistTwInvoice(criteria);
        } catch (Exception e) {
            e.printStackTrace();
        }
        MockObjectManager.setReturnValueAtAllTimes(W6001DocServiceImpl.class, "checkCreateInvoiceNoOnRegister", false);
        try {
            testW6001DocService.tp_transactOnRegisterByRegistTwInvoice(criteria);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 正常ケース
     * 
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testtp_searchTmNxsComp() throws Exception  {
        testtp_updateMocInvaludate();
        
        String compCd = "";
        testW6001DocService.tp_searchTmNxsComp(compCd);
    }

    /**
     * 正常ケース
     * 
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testtp_searchTmCigmaCusXref() throws Exception  {
        testtp_updateMocInvaludate();
        
        String lgcyLibCompCd = "";
        String customerCd = "";
        testW6001DocService.tp_searchTmCigmaCusXref(lgcyLibCompCd, customerCd);
    }

    /**
     * 正常ケース
     * 
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testtp_getTempInvoiceNo() throws Exception  {
        testtp_updateMocInvaludate();
        
        String reInvoiceFlg = "";
        String shipperCd = "";
        String grpNo1 = "";
        String grpNo2 = "";
        testW6001DocService.tp_getTempInvoiceNo(reInvoiceFlg, shipperCd, grpNo1, grpNo2);;
        reInvoiceFlg = "Y";
        testW6001DocService.tp_getTempInvoiceNo(reInvoiceFlg, shipperCd, grpNo1, grpNo2);;
    }

    /**
     * 正常ケース
     * 
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testtp_searchTwInvOnRegisterByFree() throws Exception  {
        testtp_updateMocInvaludate();
        
        String shipperCd = "";
        testW6001DocService.tp_searchTwInvOnRegisterByFree(shipperCd);
    }

   /**
     * 正常ケース
     * 
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testtp_searchTmInvTplByKey() throws Exception  {
        testtp_updateMocInvaludate();
        
        String shipperCd = "";
        String invTempNo = "";
        testW6001DocService.tp_searchTmInvTplByKey(shipperCd, invTempNo);
    }

    /**
     * 正常ケース
     * 
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testtp_updateTwInvItemOnRegisterForTempInvoiceNo() throws Exception  {
        testtp_updateMocInvaludate();
        
        String tempInvoiceNo = "";
        String dscId = "";
        String grpNo1 = "";
        String grpNo2 = "";
        testW6001DocService.tp_updateTwInvItemOnRegisterForTempInvoiceNo (tempInvoiceNo, dscId, grpNo1, grpNo2);
    }

    /**
     * 正常ケース
     * 
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testtp_updateTwInvItemOnRegisterForNormInvoiceNo() throws Exception  {
        testtp_updateMocInvaludate();
        
        String invoiceNo = "";
        String dscId = "";
        String tempInvoiceNo = "";
        testW6001DocService.tp_updateTwInvItemOnRegisterForNormInvoiceNo(invoiceNo, dscId, tempInvoiceNo);
    }

    /**
     * 正常ケース
     * 
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testtp_updateIwInvOnRegisterForTempInvoiceNo() throws Exception  {
        testtp_updateMocInvaludate();
        
        String tempInvoiceNo = "";
        String reInvoiceFlg = "";
        String consigneeCd = "";
        String salesContractFlg = "";
        String dscId = "";
        String grpNo1 = "";
        String grpNo2 = "";
        testW6001DocService.tp_updateIwInvOnRegisterForTempInvoiceNo (tempInvoiceNo, reInvoiceFlg, consigneeCd, salesContractFlg, dscId, grpNo1, grpNo2);
        grpNo2 = "0";
        testW6001DocService.tp_updateIwInvOnRegisterForTempInvoiceNo (tempInvoiceNo, reInvoiceFlg, consigneeCd, salesContractFlg, dscId, grpNo1, grpNo2);
    }

    /**
     * 正常ケース
     * 
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testtp_updateTwInvOnRegisterForNormInvoiceNo() throws Exception  {
        testtp_updateMocInvaludate();
        
        String invoiceNo = "";
        String dscId = "";
        String tempInvoiceNo = "";
        testW6001DocService.tp_updateTwInvOnRegisterForNormInvoiceNo(invoiceNo, dscId, tempInvoiceNo);
    }

    /**
     * 正常ケース
     * 
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testtp_updateTwInvoiceOnRegisterForNormInvoiceNo() throws Exception  {
        testtp_updateMocInvaludate();
        
        String invoiceNo = "";
        String dscId = "";
        String tempInvoiceNo = "";
        boolean updateParInv = true;
        boolean updateReInv = true;
        MockObjectManager.setReturnValueAtAllTimes(TwInvoiceServiceImpl.class, "searchCount", 1);
        MockObjectManager.setReturnValueAtAllTimes(TwInvoiceServiceImpl.class, "updateByCondition", 1);
        testW6001DocService.tp_updateTwInvoiceOnRegisterForNormInvoiceNo(invoiceNo, dscId, tempInvoiceNo, updateParInv, updateReInv);
    }

    /**
     * 正常ケース
     * 
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testtp_createTwInvoiceOnRegister() throws Exception  {
        testtp_updateMocInvaludate();
        
        W6001DocCriteriaDomain criteria = new W6001DocCriteriaDomain();
        String reInvFlg = "Y";
        String[] tempInvoiceNoArr = {"1", "2"};
        W6001DocDomain freeColDomain = new W6001DocDomain();
        TmInvTplDomain tmInvTplDomain = new TmInvTplDomain();
        String[] containerLst = {"1"};
        
        W6001DocInvoiceDomain docInvDomain = new W6001DocInvoiceDomain();
        List<W6001DocPltzDomain> docPltzList = new ArrayList<W6001DocPltzDomain>();
        W6001DocPltzDomain docPltzData = new W6001DocPltzDomain();
        docPltzList.add(docPltzData);
        docInvDomain.setDocPltzList(docPltzList);
        
        List<W6001DocInvoiceDomain> docInvList = new ArrayList<W6001DocInvoiceDomain>();
        docInvList.add(docInvDomain);
        
        MockObjectManager.setReturnValueAtAllTimes(W6001DocServiceImpl.class, "searchOnRegisterInitByFromDetail", docInvList);
        MockObjectManager.setReturnNullAtAllTimes(W6001DocServiceImpl.class, "prepareTwInvoiceDomainOnRegisterByCommon");
        MockObjectManager.setReturnNullAtAllTimes(W6001DocServiceImpl.class, "prepareTwInvoiceDomainOnRegisterForDBase");
        MockObjectManager.setReturnNullAtAllTimes(W6001DocServiceImpl.class, "prepareTwInvoiceDomainOnRegisterForReInvoice");

        testW6001DocService.tp_createTwInvoiceOnRegister (criteria, reInvFlg, tempInvoiceNoArr, freeColDomain, tmInvTplDomain, containerLst);
    }
    /**
     * 正常ケース
     * 
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testtp_prepareTwInvoiceDomainOnRegisterByCmlTyp() throws Exception  {
        testtp_updateMocInvaludate();
        
        TwInvoiceDomain twInvoiceDomain = new TwInvoiceDomain();
        W6001DocCriteriaDomain criteria = new W6001DocCriteriaDomain();
        W6001DocInvoiceDomain docInvDomain = new W6001DocInvoiceDomain();
        W6001DocPltzDomain docPltzDomain = new W6001DocPltzDomain();
        TmNxsCompDomain tmNxsShipeer = new TmNxsCompDomain();
        MockObjectManager.setReturnValueAtAllTimes(W6001DocServiceImpl.class, "searchTmNxsComp", tmNxsShipeer);
        criteria.setGrpNo2("0");
        criteria.setCmlTyp("3");
        testW6001DocService.tp_prepareTwInvoiceDomainOnRegisterByCmlTyp(twInvoiceDomain, criteria, docInvDomain, docPltzDomain);
        criteria.setCmlTyp("1");
        testW6001DocService.tp_prepareTwInvoiceDomainOnRegisterByCmlTyp(twInvoiceDomain, criteria, docInvDomain, docPltzDomain);
        criteria.setCmlTyp("2");
        testW6001DocService.tp_prepareTwInvoiceDomainOnRegisterByCmlTyp(twInvoiceDomain, criteria, docInvDomain, docPltzDomain);
        criteria.setGrpNo2("1");
        testW6001DocService.tp_prepareTwInvoiceDomainOnRegisterByCmlTyp(twInvoiceDomain, criteria, docInvDomain, docPltzDomain);
    }
    /**
     * 正常ケース
     * 
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testtp_prepareTwInvoiceDomainOnRegisterByCommon() throws Exception  {
        testtp_updateMocInvaludate();
        
        TwInvoiceDomain twInvoiceDomain = new TwInvoiceDomain();
        W6001DocCriteriaDomain criteria = new W6001DocCriteriaDomain();
        W6001DocInvoiceDomain docInvDomain = new W6001DocInvoiceDomain();
        W6001DocPltzDomain docPltzDomain = new W6001DocPltzDomain();
        String tempInvoiceNo = "";
        W6001DocDomain freeColDomain = new W6001DocDomain();
        TmInvTplDomain tmInvTplDomain = new TmInvTplDomain();
        String[] containerLst = {"1", "2", "3"};
        MockObjectManager.setReturnNullAtAllTimes(W6001DocServiceImpl.class, "prepareTwInvoiceDomainOnRegisterByCmlTyp");
        testW6001DocService.tp_prepareTwInvoiceDomainOnRegisterByCommon (twInvoiceDomain
            , criteria, docInvDomain, docPltzDomain
            , tempInvoiceNo, freeColDomain, tmInvTplDomain, containerLst);
    }
    /**
     * 正常ケース
     * 
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testtp_prepareTwInvoiceDomainOnRegisterForDBase() throws Exception  {
        testtp_updateMocInvaludate();
        
        TwInvoiceDomain twInvoiceDomain = new TwInvoiceDomain();
        W6001DocCriteriaDomain criteria = new W6001DocCriteriaDomain();
        W6001DocInvoiceDomain docInvDomain = new W6001DocInvoiceDomain();
        String[] tempInvoiceNoArr = {"1", "2", "3"};
        criteria.setGrpNo2("0");
        criteria.setSubTotal(new BigDecimal(1));
        criteria.setVat(new BigDecimal(2));
        criteria.setHandlingCharge(new BigDecimal(3));
        criteria.setAdditionalCharge(new BigDecimal(4));
        
        
        testW6001DocService.tp_prepareTwInvoiceDomainOnRegisterForDBase (twInvoiceDomain
            , criteria, docInvDomain, tempInvoiceNoArr, "N");
        criteria.setGrpNo2("1");
        testW6001DocService.tp_prepareTwInvoiceDomainOnRegisterForDBase (twInvoiceDomain
            , criteria, docInvDomain, tempInvoiceNoArr, "N");
    }
    
    /**
     * 正常ケース
     * 
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testtp_prepareTwInvoiceDomainOnRegisterForReInvoice() throws Exception  {
        testtp_updateMocInvaludate();
        
        TwInvoiceDomain twInvoiceDomain = new TwInvoiceDomain();
        W6001DocCriteriaDomain criteria = new W6001DocCriteriaDomain();
        W6001DocInvoiceDomain docInvDomain = new W6001DocInvoiceDomain();
        String[] tempInvoiceNoArr = {"1"};
        criteria.setGrpNo2("0");
        criteria.setSubTotal(new BigDecimal(1));
        criteria.setVat(new BigDecimal(2));
        criteria.setHandlingCharge(new BigDecimal(3));
        criteria.setAdditionalCharge(new BigDecimal(4));
        testW6001DocService.tp_prepareTwInvoiceDomainOnRegisterForReInvoice (twInvoiceDomain
            , criteria, docInvDomain, tempInvoiceNoArr);
        criteria.setGrpNo2("1");
        testW6001DocService.tp_prepareTwInvoiceDomainOnRegisterForReInvoice (twInvoiceDomain
            , criteria, docInvDomain, tempInvoiceNoArr);
    }
    /**
     * 正常ケース
     * 
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testtp_checkCreateInvoiceNoOnRegister() throws Exception  {
        testtp_updateMocInvaludate();
        
        String dscId = "";
        String shipperCd = "";
        String grpNo1 = "";
        MockObjectManager.setReturnValueAtAllTimes(TwInvServiceImpl.class, "searchCount", 1);
        MockObjectManager.setReturnValueAtAllTimes(W6001DocDaoImpl.class, "searchCountTwInvByTempInvoiceNo", 1);
        testW6001DocService.tp_checkCreateInvoiceNoOnRegister (dscId, shipperCd, grpNo1);
    }
    /**
     * 正常ケース
     * 
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testtp_transactOnRegisterByRegistTtInvoice() throws Exception {
        testtp_updateMocInvaludate();
        
        W6001DocCriteriaDomain criteria = new W6001DocCriteriaDomain();
        
        MockObjectManager.setReturnValueAtAllTimes(CommonServiceImpl.class, "searchTimezone", "JST");
        List<TwInvDomain> twInvList = new ArrayList<TwInvDomain>();
        MockObjectManager.setReturnValueAtAllTimes(W6001DocServiceImpl.class, "searchTwInvOnRegisterForNormInv", twInvList);
        List<String> normInvNoList = new ArrayList<String>();
        normInvNoList.add("A");
        MockObjectManager.setReturnValueAtAllTimes(W6001DocServiceImpl.class, "sequenceNormalInvoiceNo", normInvNoList);
        MockObjectManager.setReturnNullAtAllTimes(W6001DocServiceImpl.class, "sequenceReInvoiceNo");
        List<TtInvoiceDomain> ttInvoiceList = new ArrayList<TtInvoiceDomain>();
        MockObjectManager.setReturnValueAtAllTimes(W6001DocServiceImpl.class, "createNormalInvoiceNoOnRegister", ttInvoiceList);
        MockObjectManager.setReturnNullAtAllTimes(W6001DocServiceImpl.class, "updateTtPltzOnRegisterForMainInvoice");
        MockObjectManager.setReturnNullAtAllTimes(W6001DocServiceImpl.class, "updateTtTmpStockOnRegisterByQty");
        MockObjectManager.setReturnNullAtAllTimes(W6001DocServiceImpl.class, "updateTtExpRcvOdrOnRegister");
        MockObjectManager.setReturnNullAtAllTimes(W6001DocServiceImpl.class, "callWebService6001");
        W6001DocInvoiceDomain docInv = new W6001DocInvoiceDomain();
        MockObjectManager.setReturnValueAtAllTimes(W6001DocServiceImpl.class, "searchOnRegisterInitByFromMain", docInv);
        testW6001DocService.tp_transactOnRegisterByRegistTtInvoice(criteria);
    }
    /**
     * 正常ケース
     * 
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testtp_sequenceNormalInvoiceNo () throws Exception {
        testtp_updateMocInvaludate();
        
        MockObjectManager.setReturnValueAtAllTimes(W6001DocServiceImpl.class, "transactSequenceNormalInv", "1");
        MockObjectManager.setReturnNullAtAllTimes(W6001DocServiceImpl.class, "updateTwInvItemOnRegisterForNormInvoiceNo");
        MockObjectManager.setReturnNullAtAllTimes(W6001DocServiceImpl.class, "updateTwInvOnRegisterForNormInvoiceNo");
        MockObjectManager.setReturnNullAtAllTimes(W6001DocServiceImpl.class, "updateTwInvoiceOnRegisterForNormInvoiceNo");
        List<TwInvDomain> twInvList = new ArrayList<TwInvDomain>();
        String shipperCd = "";
        String dscId = "";
        TwInvDomain twInvDat = new TwInvDomain();
        twInvList.add(twInvDat);
        testW6001DocService.tp_sequenceNormalInvoiceNo (twInvList, shipperCd, dscId);
        twInvDat.setSupplierInvoiceNo("1");
        testW6001DocService.tp_sequenceNormalInvoiceNo (twInvList, shipperCd, dscId);
        twInvDat.setGrpNo2("0");
        testW6001DocService.tp_sequenceNormalInvoiceNo (twInvList, shipperCd, dscId);
        twInvDat.setSupplierInvoiceNo("");
        testW6001DocService.tp_sequenceNormalInvoiceNo (twInvList, shipperCd, dscId);
    }
    /**
     * 正常ケース
     * 
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testtp_sequenceReInvoiceNo () throws Exception {
        testtp_updateMocInvaludate();
        
        MockObjectManager.setReturnNullAtAllTimes(W6001DocServiceImpl.class, "updateTwInvoiceOnRegisterForNormInvoiceNo");
        List<TwInvDomain> twInvList = new ArrayList<TwInvDomain>();
        String shipperCd = "";
        String dscId = "";
        TwInvDomain twInvDat = new TwInvDomain();
        twInvDat.setReInvoiceFlg("Y");
        twInvList.add(twInvDat);
        MockObjectManager.setReturnValueAtAllTimes(W6001DocServiceImpl.class, "searchTmInvSeqOnRegister", "1");
        testW6001DocService.tp_sequenceReInvoiceNo (twInvList, shipperCd, dscId);
        MockObjectManager.setReturnValueAtAllTimes(W6001DocServiceImpl.class, "searchTmInvSeqOnRegister", new GscmApplicationException("E"));
        testW6001DocService.tp_sequenceReInvoiceNo (twInvList, shipperCd, dscId);
    }
    /**
     * 正常ケース
     * 
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testtp_searchTwInvOnRegisterForNormInv () throws Exception {
        testtp_updateMocInvaludate();

        String dscId = "";
        String shipperCd = "";
        String grpNo1 = "";
        testW6001DocService.tp_searchTwInvOnRegisterForNormInv (dscId, shipperCd, grpNo1);
    }
    /**
     * 正常ケース
     * 
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testtp_transactSequenceNormalInv () throws Exception {
        testtp_updateMocInvaludate();

        String shipperCd = "";
        String cmlTyp = "";
        testW6001DocService.tp_transactSequenceNormalInv (shipperCd, cmlTyp);
    }
    /**
     * 正常ケース
     * 
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testtp_searchTmInvSeqOnRegister() throws Exception {
        testtp_updateMocInvaludate();

        String seqKey = "";
        String compCd = "";

        
        MockObjectManager.setReturnValueAtAllTimes(TmInvSeqServiceImpl.class, "lockByKeyNoWait", new ApplicationException("E"));
        testW6001DocService.tp_searchTmInvSeqOnRegister(seqKey, compCd);
        MockObjectManager.setReturnNullAtAllTimes(TmInvSeqServiceImpl.class, "lockByKeyNoWait");
        testW6001DocService.tp_searchTmInvSeqOnRegister(seqKey, compCd);
        TmInvSeqDomain tmInvSeqDomain = new TmInvSeqDomain();
        tmInvSeqDomain.setNowNo("1");
        tmInvSeqDomain.setStarNo("1");
        tmInvSeqDomain.setEndNo("1");
        MockObjectManager.setReturnValueAtAllTimes(TmInvSeqServiceImpl.class, "lockByKeyNoWait", tmInvSeqDomain);
        testW6001DocService.tp_searchTmInvSeqOnRegister(seqKey, compCd);
        tmInvSeqDomain.setEndNo("5");
        testW6001DocService.tp_searchTmInvSeqOnRegister(seqKey, compCd);
        tmInvSeqDomain.setStarNo("3");
        testW6001DocService.tp_searchTmInvSeqOnRegister(seqKey, compCd);
        
    }
    /**
     * 正常ケース
     * 
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testtp_createNormalInvoiceNoOnRegister() throws Exception {
        testtp_updateMocInvaludate();

        List<TwInvDomain> twInvList = new ArrayList<TwInvDomain>();
        W6001DocCriteriaDomain criteria = new W6001DocCriteriaDomain();
        List<String> normInvNoList = new ArrayList<String>();
        normInvNoList.add("1");
        Date invIssueDt = new Date();
        Date mnInvIssueDt = new Date();
        criteria.setDscId("maeTest01");
        TwInvDomain twInvDat = new TwInvDomain();
        twInvDat.setGrpNo2("0");
        twInvDat.setCmlTyp("1");
        twInvDat.setSalesContractFlg("Y");
        twInvDat.setReInvoiceFlg("Y");
        twInvList.add(twInvDat);
        TmUserDomain docUserDom = new TmUserDomain();
        MockObjectManager.setReturnValueAtAllTimes(TmUserServiceImpl.class, "searchByKey", docUserDom);
        List<TwInvoiceDomain> twInvoiceList = new ArrayList<TwInvoiceDomain>();
        TwInvoiceDomain twInvoiceDat = new TwInvoiceDomain();
        twInvoiceList.add(twInvoiceDat);
        MockObjectManager.setReturnValueAtAllTimes(W6001DocServiceImpl.class, "searchTwInvoiceDomainOnRegisterForCreate", twInvoiceList);
        List<TtInvoiceAttachedDomain> ttInvliceAttachedList = new ArrayList<TtInvoiceAttachedDomain>();
        MockObjectManager.setReturnValueAtAllTimes(W6001DocServiceImpl.class, "createTtInvoiceAttachedOnRegister", ttInvliceAttachedList);
        MockObjectManager.setReturnNullAtAllTimes(TtScHeaderServiceImpl.class, "create");
        MockObjectManager.setReturnNullAtAllTimes(W6001DocServiceImpl.class, "createTtPackAtchItemNoOnRegister");
        
        
        testW6001DocService.tp_createNormalInvoiceNoOnRegister(twInvList, criteria, normInvNoList, invIssueDt, mnInvIssueDt);
    }
    /**
     * 正常ケース
     * 
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testtp_getDscName() throws Exception {
        testtp_updateMocInvaludate();

        String dscId = "maeTest01";
        TmUserDomain docUserDom = new TmUserDomain();
        MockObjectManager.setReturnValueAtAllTimes(TmUserServiceImpl.class, "searchByKey", docUserDom);
        testW6001DocService.tp_getDscName(dscId);
    }
//    /**
//     * 正常ケース
//     * 
//     *  @throws Exception 例外発生した場合
//     */
//    @Test
//    public void testtp_searchTwInvoiceDomainOnRegisterForCreate () throws Exception {
//        testtp_updateMocInvaludate();
//
//        String dscId = "";
//        String invoiceNo = "";
//        String shipperCd = "";
//        String grpNo2 = "";
//        boolean normInv = true;
//        testW6001DocService.tp_searchTwInvoiceDomainOnRegisterForCreate (dscId, invoiceNo, shipperCd, grpNo2, normInv);
//        normInv = false;
//        grpNo2 = "0";
//        testW6001DocService.tp_searchTwInvoiceDomainOnRegisterForCreate (dscId, invoiceNo, shipperCd, grpNo2, normInv);
//    }
    /**
     * 正常ケース
     * 
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testtp_searchTwInvPltzOnRegister() throws Exception {
        testtp_updateMocInvaludate();

        String dscId = "";
        String shipperCd = "";
        String grpNo1 = "";
        testW6001DocService.tp_searchTwInvPltzOnRegister (dscId, shipperCd, grpNo1);
    }
//    /**
//     * 正常ケース
//     * 
//     *  @throws Exception 例外発生した場合
//     */
//    @Test
//    public void testtp_searchTwInvItemOnRegister() throws Exception {
//        testtp_updateMocInvaludate();
//
//        String dscId = "";;
//        String shipperCd = "";
//        String grpNo1 = "";
//        String grpNo2 = "";
//        testW6001DocService.tp_searchTwInvItemOnRegister(dscId, shipperCd, grpNo1, grpNo2);
//    }
//    /**
//     * 正常ケース
//     * 
//     *  @throws Exception 例外発生した場合
//     */
//    @Test
//    public void testtp_createTtInvoiceHeaderOnRegister ()throws Exception {
//        testtp_updateMocInvaludate();
//
//        List<TwInvoiceDomain> twInvoiceList = new ArrayList<TwInvoiceDomain>();
//        String dscId = "";
//        String dscNm = "";
//        String grpNo2 = "";
//        Date invoiceIssueDt = new Date();
//        testW6001DocService.tp_createTtInvoiceHeaderOnRegister(twInvoiceList, dscId, dscNm, grpNo2, invoiceIssueDt);
//    }
//    /**
//     * 正常ケース
//     * 
//     *  @throws Exception 例外発生した場合
//     */
//    @Test
//    public void testtp_createTtInvoiceAttachedOnRegister () throws Exception {
//        testtp_updateMocInvaludate();
//
//        List<TwInvoiceDomain> twInvoiceList = new ArrayList<TwInvoiceDomain>();
//        TwInvoiceDomain twInvoiceDat = new TwInvoiceDomain();
//        twInvoiceList.add(twInvoiceDat);
//        String grpNo2 = "";
//        Date invoiceIssueDt = new Date();
//        List<TwInvItemDomain> twInvItemList = new ArrayList<TwInvItemDomain>();
//        TwInvItemDomain twInvItemDat = new TwInvItemDomain();
//        twInvItemList.add(twInvItemDat);
//        twInvItemDat.setUnitPrice(new BigDecimal(1));
//        twInvItemDat.setQty(new BigDecimal(1));
//        twInvItemDat.setItemWeight(new BigDecimal(1));
//
//        
//        
//        
//        MockObjectManager.setReturnValueAtAllTimes(W6001DocServiceImpl.class, "getOriginCntryNm", "Test");
//        
//        
//        
//        grpNo2 = "0";
//        twInvoiceDat.setFree1DispFlg("0");
//        twInvoiceDat.setFree2DispFlg("0");
//        twInvoiceDat.setFree3DispFlg("0");
//        twInvoiceDat.setFree4DispFlg("0");
//        testW6001DocService.tp_createTtInvoiceAttachedOnRegister(twInvoiceList, grpNo2, invoiceIssueDt, twInvItemList);
//        grpNo2 = "1";
//        twInvoiceDat.setFree4DispFlg("1");
//        testW6001DocService.tp_createTtInvoiceAttachedOnRegister(twInvoiceList, grpNo2, invoiceIssueDt, twInvItemList);
//    }
//    /**
//     * 下のテスト用
//     *
//     *  @param twInvoiceDomain twInvItemDomain
//     *  @param twInvItemDomain twInvItemDomain
//     *  
//     */
//    private void setFlg(TwInvoiceDomain twInvoiceDomain, TwInvItemDomain twInvItemDomain) {
//        
//        twInvoiceDomain.setFree1DispFlg("1");
//        twInvoiceDomain.setFree2DispFlg("1");
//        twInvoiceDomain.setFree3DispFlg("1");
//        twInvItemDomain.setFree1OriginCntryFlg("N");
//        twInvItemDomain.setFree2OriginCntryFlg("N");
//        twInvItemDomain.setFree3OriginCntryFlg("N");
//    }
//    /**
//     * 正常ケース
//     * 
//     *  @throws Exception 例外発生した場合
//     */
//    @Test
//    public void testtp_getOriginCntryNm() throws Exception {
//        testtp_updateMocInvaludate();
//
//
//        TwInvoiceDomain twInvoiceDomain = new TwInvoiceDomain();
//        TwInvItemDomain twInvItemDomain = new  TwInvItemDomain();
//        
//        TmCntryDomain domain = new TmCntryDomain();
//        MockObjectManager.setReturnValueAtAllTimes(TmCntryServiceImpl.class, "searchByKey", domain);
//            
//        //dispOrginCntry＝False
//        setFlg(twInvoiceDomain, twInvItemDomain);
//        twInvItemDomain.setFree1OriginCntryFlg("Y");
//        testW6001DocService.tp_getOriginCntryNm(twInvoiceDomain, twInvItemDomain);
//        //全OK
//        setFlg(twInvoiceDomain, twInvItemDomain);
//        testW6001DocService.tp_getOriginCntryNm(twInvoiceDomain, twInvItemDomain);
//        //D3
//        setFlg(twInvoiceDomain, twInvItemDomain);
//        twInvoiceDomain.setFree3DispFlg("0");
//        testW6001DocService.tp_getOriginCntryNm(twInvoiceDomain, twInvItemDomain);
//        //D2
//        setFlg(twInvoiceDomain, twInvItemDomain);
//        twInvoiceDomain.setFree2DispFlg("0");
//        testW6001DocService.tp_getOriginCntryNm(twInvoiceDomain, twInvItemDomain);
//        //D2D3
//        setFlg(twInvoiceDomain, twInvItemDomain);
//        twInvoiceDomain.setFree2DispFlg("0");
//        twInvoiceDomain.setFree3DispFlg("0");
//        testW6001DocService.tp_getOriginCntryNm(twInvoiceDomain, twInvItemDomain);
//        //D1
//        setFlg(twInvoiceDomain, twInvItemDomain);
//        twInvoiceDomain.setFree1DispFlg("0");
//        testW6001DocService.tp_getOriginCntryNm(twInvoiceDomain, twInvItemDomain);
//        //D1D3
//        setFlg(twInvoiceDomain, twInvItemDomain);
//        twInvoiceDomain.setFree1DispFlg("0");
//        twInvoiceDomain.setFree3DispFlg("0");
//        testW6001DocService.tp_getOriginCntryNm(twInvoiceDomain, twInvItemDomain);
//        //D1D2
//        setFlg(twInvoiceDomain, twInvItemDomain);
//        twInvoiceDomain.setFree1DispFlg("0");
//        twInvoiceDomain.setFree2DispFlg("0");
//        testW6001DocService.tp_getOriginCntryNm(twInvoiceDomain, twInvItemDomain);
//        //D1D2D3
//        setFlg(twInvoiceDomain, twInvItemDomain);
//        twInvoiceDomain.setFree1DispFlg("0");
//        twInvoiceDomain.setFree2DispFlg("0");
//        twInvoiceDomain.setFree3DispFlg("0");
//        testW6001DocService.tp_getOriginCntryNm(twInvoiceDomain, twInvItemDomain);
//    }
//    /**
//     * 正常ケース
//     * 
//     *  @throws Exception 例外発生した場合
//     */
//    @Test
//    public void testtp_createTtPackingHeadOnRegister() throws Exception {
//        testtp_updateMocInvaludate();
//
//        List<TwInvoiceDomain> twInvoiceList = new ArrayList<TwInvoiceDomain>();
//        String grpNo2 = "";
//        Date invoiceIssueDt = new Date();
//        testW6001DocService.tp_createTtPackingHeadOnRegister(twInvoiceList, grpNo2, invoiceIssueDt);
//    }
//    /**
//     * 正常ケース
//     * 
//     *  @throws Exception 例外発生した場合
//     */
//    @Test
//    public void testtp_createTtPackingAttachedCmlOnRegister () throws Exception {
//        testtp_updateMocInvaludate();
//        List<TwInvoiceDomain> twInvoiceList = new ArrayList<TwInvoiceDomain>();
//        TwInvoiceDomain twInvoiceDat = new TwInvoiceDomain();
//        twInvoiceList.add(twInvoiceDat);
//        List<TwInvPltzDomain> twInvPltzList = new ArrayList<TwInvPltzDomain>();
//        TwInvPltzDomain twInvPltzDat = new TwInvPltzDomain();
//        twInvPltzList.add(twInvPltzDat);
//        List<TwInvItemDomain> twInvItemList = new ArrayList<TwInvItemDomain>();
//        TwInvItemDomain twInvItemDat = new TwInvItemDomain();
//        twInvItemList.add(twInvItemDat);
//        String grpNo2 = "1";
//        Date invoiceIssueDt = new Date();
//        testW6001DocService.tp_createTtPackingAttachedCmlOnRegister (twInvoiceList, twInvPltzList, grpNo2,  invoiceIssueDt);
//        grpNo2 = "0";
//        testW6001DocService.tp_createTtPackingAttachedCmlOnRegister (twInvoiceList, twInvPltzList, grpNo2,  invoiceIssueDt);
//    }
//    /**
//     * 正常ケース
//     * 
//     *  @throws Exception 例外発生した場合
//     */
//    @Test
//    public void testtp_createTtPackAtchItemNoOnRegister () throws Exception {
//        testtp_updateMocInvaludate();
//
//        List<TwInvoiceDomain> twInvoiceList = new ArrayList<TwInvoiceDomain>();
//        TwInvoiceDomain twInvoiceDat = new TwInvoiceDomain();
//        twInvoiceList.add(twInvoiceDat);
//        List<TwInvPltzDomain> twInvPltzList = new ArrayList<TwInvPltzDomain>();
//        TwInvPltzDomain twInvPltzDat = new TwInvPltzDomain();
//        twInvPltzList.add(twInvPltzDat);
//        List<TwInvItemDomain> twInvItemList = new ArrayList<TwInvItemDomain>();
//        TwInvItemDomain twInvItemDat = new TwInvItemDomain();
//        twInvItemDat.setItemWeight(new BigDecimal(1));
//        twInvItemDat.setQty(new BigDecimal(1));
//        twInvItemList.add(twInvItemDat);
//        String grpNo2 = "1";
//        Date invoiceIssueDt = new Date();
//        testW6001DocService.tp_createTtPackAtchItemNoOnRegister (twInvoiceList, twInvPltzList, twInvItemList, grpNo2, invoiceIssueDt);
//        grpNo2 = "0";
//        testW6001DocService.tp_createTtPackAtchItemNoOnRegister (twInvoiceList, twInvPltzList, twInvItemList, grpNo2, invoiceIssueDt);
//    }
//    /**
//     * 正常ケース
//     * 
//     *  @throws Exception 例外発生した場合
//     */
//    @Test
//    public void testtp_createTtScHeaderOnRegister () throws Exception {
//        testtp_updateMocInvaludate();
//
//        List<TtInvoiceHeaderDomain> ttInvoiceHeaderList = new ArrayList<TtInvoiceHeaderDomain>();
//        testW6001DocService.tp_createTtScHeaderOnRegister (ttInvoiceHeaderList);
//    }
    /**
     * 正常ケース
     * 
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testtp_createTtScAttachedOnRegister () throws Exception {
        testtp_updateMocInvaludate();

        List<TtInvoiceAttachedDomain> ttInvoiceAttachedList = new ArrayList<TtInvoiceAttachedDomain>();
        TtInvoiceAttachedDomain ttInvoiceAttachedDat = new TtInvoiceAttachedDomain();
        ttInvoiceAttachedList.add(ttInvoiceAttachedDat);
        
        MockObjectManager.setReturnNullAtAllTimes(TtScAttachedServiceImpl.class, "create");
        testW6001DocService.tp_createTtScAttachedOnRegister (ttInvoiceAttachedList);
    }
    /**
     * 正常ケース
     * 
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testtp_createPdfFileOnRegister() throws Exception {
        testtp_updateMocInvaludate();
        String shipperCd = "";
        String invoiceNo = "";
        Date invoiceIssueDt = new Date();
        String invTplNo = "";
        String dscId = "";
        String cmlTyp = "1";
        String invCtgry = "C";
        String invClass = "Z";
        String dateFormat = "";
        String charCd = "";
        boolean reportSc = true;
        MockObjectManager.setReturnValueAtAllTimes(W6001DocServiceImpl.class, "createFileUpload", "1");
        MockObjectManager.setReturnValueAtAllTimes(W6001DocServiceImpl.class, "updateTtInvoiceHeaderByFileId", 1);
        MockObjectManager.setReturnValueAtAllTimes(W6001DocServiceImpl.class, "updateTtPackingHeadByFileId", 1);
        MockObjectManager.setReturnValueAtAllTimes(W6001DocServiceImpl.class, "updateTtScHeaderByFileId", 1);
        
        MockObjectManager.setReturnNullAtAllTimes(L6001ReportServiceImpl.class, "searchInvHdrForCmrclIntang");
        MockObjectManager.setReturnNullAtAllTimes(L6002ReportServiceImpl.class, "searchInvHdrForNonCmrcl");
        MockObjectManager.setReturnNullAtAllTimes(L6003ReportServiceImpl.class, "searchIvnHdrForFrt");
        MockObjectManager.setReturnNullAtAllTimes(L6004ReportServiceImpl.class, "searchInvAtchedForMain");
        MockObjectManager.setReturnNullAtAllTimes(L6005ReportServiceImpl.class, "searchInvAtchedForRt");
        MockObjectManager.setReturnNullAtAllTimes(L6006ReportServiceImpl.class, "searchPackHdrForMain");
        MockObjectManager.setReturnNullAtAllTimes(L6007ReportServiceImpl.class, "searchPackHdrForFrt");
        MockObjectManager.setReturnNullAtAllTimes(L6008ReportServiceImpl.class, "searchPackAtchedForMain");
        MockObjectManager.setReturnNullAtAllTimes(L6009ReportServiceImpl.class, "searchPackAtchedForFrt");
        MockObjectManager.setReturnNullAtAllTimes(L6010ReportServiceImpl.class, "searchPackAtchedForErt");
        MockObjectManager.setReturnNullAtAllTimes(L6011ReportServiceImpl.class, "searchSalesCntrctHdrForCmrclIntang");
        MockObjectManager.setReturnNullAtAllTimes(L6012ReportServiceImpl.class, "searchSalesCntrctHdrForNonCmrcl");
        MockObjectManager.setReturnNullAtAllTimes(L6013ReportServiceImpl.class, "searchSalesCntrctHdrForFrt");
        MockObjectManager.setReturnNullAtAllTimes(L6014ReportServiceImpl.class, "searchSalesCntrctAtchedForMain");
        MockObjectManager.setReturnNullAtAllTimes(L6015ReportServiceImpl.class, "searchSalesCntrctAtchedForRt");
        
        testW6001DocService.tp_createPdfFileOnRegister(shipperCd, invoiceNo, invoiceIssueDt, invTplNo, dscId, cmlTyp, invCtgry, invClass, dateFormat, charCd, reportSc) ;
        invClass = "F";
        testW6001DocService.tp_createPdfFileOnRegister(shipperCd, invoiceNo, invoiceIssueDt, invTplNo, dscId, cmlTyp, invCtgry, invClass, dateFormat, charCd, reportSc) ;
        cmlTyp = "2";
        invCtgry = "N";
        testW6001DocService.tp_createPdfFileOnRegister(shipperCd, invoiceNo, invoiceIssueDt, invTplNo, dscId, cmlTyp, invCtgry, invClass, dateFormat, charCd, reportSc) ;
        cmlTyp = "3";
        invClass = "Z";
        testW6001DocService.tp_createPdfFileOnRegister(shipperCd, invoiceNo, invoiceIssueDt, invTplNo, dscId, cmlTyp, invCtgry, invClass, dateFormat, charCd, reportSc) ;
        invCtgry = "I";
        testW6001DocService.tp_createPdfFileOnRegister(shipperCd, invoiceNo, invoiceIssueDt, invTplNo, dscId, cmlTyp, invCtgry, invClass, dateFormat, charCd, reportSc) ;
        invClass = "F";
        testW6001DocService.tp_createPdfFileOnRegister(shipperCd, invoiceNo, invoiceIssueDt, invTplNo, dscId, cmlTyp, invCtgry, invClass, dateFormat, charCd, reportSc) ;
        reportSc = false;
        testW6001DocService.tp_createPdfFileOnRegister(shipperCd, invoiceNo, invoiceIssueDt, invTplNo, dscId, cmlTyp, invCtgry, invClass, dateFormat, charCd, reportSc) ;
    }
    
    /**
     * 正常ケース
     * 
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testtp_updateTtInvoiceHeaderByFileId() throws Exception {
        testtp_updateMocInvaludate();

        String fileId = "";
        String shipperCd = "";
        String invoiceNo = "";
        Date invoiceIssueDt = new Date();
        String screenId = "";
        testW6001DocService.tp_updateTtInvoiceHeaderByFileId(fileId, shipperCd, invoiceNo, invoiceIssueDt, screenId);
    }
    /**
     * 正常ケース
     * 
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testtp_updateTtPackingHeadByFileId() throws Exception {
        testtp_updateMocInvaludate();

        String fileId = "";
        String shipperCd = "";
        String invoiceNo = "";
        Date invoiceIssueDt = new Date();
        String screenId = "";
        testW6001DocService.tp_updateTtPackingHeadByFileId(fileId, shipperCd, invoiceNo, invoiceIssueDt, screenId);
    }
    /**
     * 正常ケース
     * 
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testtp_updateTtScHeaderByFileId() throws Exception {
        testtp_updateMocInvaludate();

        String fileId = "";
        String shipperCd = "";
        String invoiceNo = "";
        Date invoiceIssueDt = new Date();
        String screenId = "";
        testW6001DocService.tp_updateTtScHeaderByFileId(fileId, shipperCd, invoiceNo, invoiceIssueDt, screenId);
    }
    /**
     * 正常ケース
     * 
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testtp_updateTtPltzOnRegisterForMainInvoice () throws Exception {
        testtp_updateMocInvaludate();

        List<TwInvDomain> twInvList = new ArrayList<TwInvDomain>();
        TwInvDomain twInvDat = new TwInvDomain();
        twInvList.add(twInvDat);
        List<String> normInvNoList = new ArrayList<String>();
        normInvNoList.add("A");
        W6001DocCriteriaDomain criteria = new W6001DocCriteriaDomain();
        Date invoiceIssueDt = new Date();
        
        
        List<TwInvPltzDomain> twInvPltzList = new ArrayList<TwInvPltzDomain>();
        TwInvPltzDomain twInvPltzDat = new TwInvPltzDomain();
        twInvPltzList.add(twInvPltzDat);
        MockObjectManager.setReturnValueAtAllTimes(W6001DocServiceImpl.class, "searchTwInvPltzOnRegister", twInvPltzList);
        //nullでException返却のパターン
        MockObjectManager.setReturnNullAtAllTimes(TtPltzServiceImpl.class, "lockByKeyNoWait");
        twInvDat.setGrpNo2("0");
        try {
            testW6001DocService.tp_updateTtPltzOnRegisterForMainInvoice(twInvList, normInvNoList, criteria, invoiceIssueDt);
        } catch (Exception e) {
        }
        
        TtPltzDomain ttPltzDomain = new TtPltzDomain();
        MockObjectManager.setReturnValueAtAllTimes(TtPltzServiceImpl.class, "lockByKeyNoWait", ttPltzDomain);
        //TimingType-A
        //Exception
        ttPltzDomain.setCustomTimingTyp("A");
        try {
            testW6001DocService.tp_updateTtPltzOnRegisterForMainInvoice(twInvList, normInvNoList, criteria, invoiceIssueDt);
        } catch (Exception e) {
        }
        //No Exception
        ttPltzDomain.setPltzStatus("80");
        testW6001DocService.tp_updateTtPltzOnRegisterForMainInvoice(twInvList, normInvNoList, criteria, invoiceIssueDt);
        
        //TimingType-B
        //Exception
        ttPltzDomain.setCustomTimingTyp("B");
        try {
            testW6001DocService.tp_updateTtPltzOnRegisterForMainInvoice(twInvList, normInvNoList, criteria, invoiceIssueDt);
        } catch (Exception e) {
        }
        //No Exception
        ttPltzDomain.setPltzStatus("50");
        testW6001DocService.tp_updateTtPltzOnRegisterForMainInvoice(twInvList, normInvNoList, criteria, invoiceIssueDt);
        
        //TimingType-Z
        //Exception
        ttPltzDomain.setCustomTimingTyp("Z");
        try {
            testW6001DocService.tp_updateTtPltzOnRegisterForMainInvoice(twInvList, normInvNoList, criteria, invoiceIssueDt);
        } catch (Exception e) {
        }
        //No Exception
        ttPltzDomain.setPltzStatus("30");
        testW6001DocService.tp_updateTtPltzOnRegisterForMainInvoice(twInvList, normInvNoList, criteria, invoiceIssueDt);
        
    }
    /**
     * 正常ケース
     * 
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testtp_updateTtTmpStockOnRegisterByQty() throws Exception {
        testtp_updateMocInvaludate();

        List<TtInvoiceDomain> ttInvoiceList = new ArrayList<TtInvoiceDomain>();
        TtInvoiceDomain ttInvoiceDat = new TtInvoiceDomain();
        ttInvoiceList.add(ttInvoiceDat);
        
        
        List<W6001DocPltzItemDomain> docPltzItemList = new ArrayList<W6001DocPltzItemDomain>();
        W6001DocPltzItemDomain docPltzItemDat = new W6001DocPltzItemDomain();
        docPltzItemDat.setSumQty(new BigDecimal(1));
        docPltzItemList.add(docPltzItemDat);
        
        List<W6001DocPltzDomain> docPltzList = new ArrayList<W6001DocPltzDomain>();
        W6001DocPltzDomain docPltzDat = new W6001DocPltzDomain();
        docPltzDat.setDocPltzItemList(docPltzItemList);
        docPltzList.add(docPltzDat);

        MockObjectManager.setReturnValueAtAllTimes(W6001DocServiceImpl.class, "searchTtPltzOnRegisterForTtTmpStock", docPltzList);
        
        //nullでException返却のパターン
        MockObjectManager.setReturnNullAtAllTimes(TtTmpStockServiceImpl.class, "lockByKeyNoWait");
        try {
            testW6001DocService.tp_updateTtTmpStockOnRegisterByQty(ttInvoiceList);
        } catch (Exception e) {
        }
        //正常に最後まで流れるパターン
        TtTmpStockDomain ttTmpStockDomain = new TtTmpStockDomain();
        ttTmpStockDomain.setQty(new BigDecimal(1));
        MockObjectManager.setReturnValueAtAllTimes(TtTmpStockServiceImpl.class, "lockByKeyNoWait", ttTmpStockDomain);
        testW6001DocService.tp_updateTtTmpStockOnRegisterByQty(ttInvoiceList);
    }
    /**
     * 正常ケース
     * 
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testtp_updateTtExpRcvOdrOnRegister () throws Exception {
        testtp_updateMocInvaludate();

        List<TtInvoiceDomain> ttInvoiceList = new ArrayList<TtInvoiceDomain>();
        TtInvoiceDomain ttInvoiceDat = new TtInvoiceDomain();
        ttInvoiceList.add(ttInvoiceDat);
        
        List<W6001DocPltzItemOdrDomain> pltzOdrList = new ArrayList<W6001DocPltzItemOdrDomain>();
        W6001DocPltzItemOdrDomain pltzOdrDat = new W6001DocPltzItemOdrDomain();
        pltzOdrDat.setSumAllocQty(new BigDecimal(1));
        pltzOdrList.add(pltzOdrDat);
        MockObjectManager.setReturnValueAtAllTimes(W6001DocServiceImpl.class, "searchTtPltzOnRegisterForTtExpRcvOdr", pltzOdrList);
        
        // ロック対象データなし
        MockObjectManager.setReturnNullAtAllTimes(TtExpRcvOdrServiceImpl.class, "lockByKeyNoWait");
        try {
            testW6001DocService.tp_updateTtExpRcvOdrOnRegister (ttInvoiceList);
        } catch (Exception e) {
        }
        
        // 出荷ステータスチェック
        TtExpRcvOdrDomain ttExpRcvOdrDomain = new TtExpRcvOdrDomain();
        ttExpRcvOdrDomain.setShippedTyp("3");
        MockObjectManager.setReturnValueAtAllTimes(TtExpRcvOdrServiceImpl.class, "lockByKeyNoWait", ttExpRcvOdrDomain);
        try {
            testW6001DocService.tp_updateTtExpRcvOdrOnRegister (ttInvoiceList);
        } catch (Exception e) {
        }
        
        // 注文数量超過チェック
        ttExpRcvOdrDomain.setShippedTyp("1");
        ttExpRcvOdrDomain.setOdrQty(new BigDecimal(3));
        ttExpRcvOdrDomain.setShippedQty(new BigDecimal(3));
        ttExpRcvOdrDomain.setPartialDelivCnt(new BigDecimal(3));
        try {
            testW6001DocService.tp_updateTtExpRcvOdrOnRegister (ttInvoiceList);
        } catch (Exception e) {
        }

        ttExpRcvOdrDomain.setOdrQty(new BigDecimal(5));
        testW6001DocService.tp_updateTtExpRcvOdrOnRegister (ttInvoiceList);
    }
    /**
     * 正常ケース
     * 
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testtp_callWebService6001() throws Exception {
        testtp_updateMocInvaludate();

        String compCd = "";
        List<TtInvoiceDomain> ttInvoiceList = new ArrayList<TtInvoiceDomain>();
        TtInvoiceDomain ttInvoiceDat = new TtInvoiceDomain();
        ttInvoiceList.add(ttInvoiceDat);
        
        Ws6001ParamDomain paramDomain = new Ws6001ParamDomain();
        MockObjectManager.setReturnValueAtAllTimes(W6001DocServiceImpl.class, "prepareWs6001ParamDomain", paramDomain);
        ResultDomain resultDomain = new ResultDomain();
        resultDomain.setResultCode("1");
        MockObjectManager.setReturnValueAtAllTimes(Ws6001RestServiceMockImpl.class, "registSalesOdrInvntry", resultDomain);
        try {
            testW6001DocService.tp_callWebService6001(compCd, ttInvoiceList);
        } catch (Exception e) {
        }
        resultDomain.setResultCode("0");
        testW6001DocService.tp_callWebService6001(compCd, ttInvoiceList);
    }
    //↑前中作業分（Protected検証）
    
    /**
     * 正常ケース
     * 
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testTransactOnUploadRegister() throws Exception  {
        
        W6001DocCriteriaDomain invoiceDomain = new W6001DocCriteriaDomain();
        invoiceDomain.setDscId("maeTest01");
        invoiceDomain.setShipperCd("MAT01");
        MockObjectManager.setReturnValueAtAllTimes(CommonServiceImpl.class, "searchTimezone", "MYT");

        //★★序盤のNULLケースをすべて（2-1～2-11）
        MockObjectManager.addReturnNull(TmNxsCompServiceImpl.class, "searchByKey"); //2-1
        MockObjectManager.addReturnNull(TmNxsCompServiceImpl.class, "searchByKey"); //2-2
        MockObjectManager.addReturnNull(W6001DocDaoImpl.class, "searchByKey");      //2-3
        MockObjectManager.addReturnNull(TmCdServiceImpl.class, "searchByKey");      //2-4
        MockObjectManager.addReturnNull(TmCdServiceImpl.class, "searchByKey");      //2-5
        MockObjectManager.addReturnNull(TmNxsCompServiceImpl.class, "searchByKey"); //2-8
        MockObjectManager.addReturnNull(TmUserServiceImpl.class, "searchByKey");    //2-9
        MockObjectManager.addReturnNull(TmCdServiceImpl.class, "searchByKey");      //2-10
        MockObjectManager.addReturnNull(TmCdServiceImpl.class, "searchByKey");      //2-11
        // 3-
        MockObjectManager.setReturnValueAtAllTimes(FileManagementService.class, "createFileUpload", "Test");
        invoiceDomain.setInvoiceFileData(new ByteArrayInputStream("HelloInvoice".getBytes()));      // 3-1
        invoiceDomain.setInvoiceFileNm("InvoiceFile");
        invoiceDomain.setPackinglistFileData(new ByteArrayInputStream("HelloPacking".getBytes()));  // 3-2
        invoiceDomain.setPackinglistFileNm("PackinglistFile");
        // 4-
        invoiceDomain.setNetAmount(new BigDecimal(0));
        invoiceDomain.setFreight(new BigDecimal(0));
        invoiceDomain.setInsurance(new BigDecimal(0));
        invoiceDomain.setVatAfter(new BigDecimal(0));
        invoiceDomain.setHandlingCharge(new BigDecimal(0));
        invoiceDomain.setAdditionalCharge(new BigDecimal(0));
        w6001DocService.transactOnUploadRegister(invoiceDomain);
        
        //上記までで、４と５のケース（個別関数）を除いて最後まで抜ける
        
        //以降の共通
        MockObjectManager.setReturnNullAtAllTimes(TtInvoiceServiceImpl.class, "create");
        MockObjectManager.setReturnNullAtAllTimes(TtInvoiceHeaderServiceImpl.class, "create");
        MockObjectManager.setReturnNullAtAllTimes(TtInvoiceAttachedServiceImpl.class, "create");
        MockObjectManager.setReturnNullAtAllTimes(TtPackingHeadServiceImpl.class, "create");
        MockObjectManager.setReturnNullAtAllTimes(TtPackingAttachedCmlServiceImpl.class, "create");
        MockObjectManager.setReturnNullAtAllTimes(TtPackAtchItemNoServiceImpl.class, "create");
        MockObjectManager.setReturnValueAtAllTimes(W6001DocDaoImpl.class, "updateTtInvoiceByKey", 1);
        MockObjectManager.setReturnValueAtAllTimes(W6001DocDaoImpl.class, "updateTtInvoiceHeaderByKey", 1);
        MockObjectManager.setReturnValueAtAllTimes(TtInvoiceAttachedServiceImpl.class, "updateByCondition", 1);
        MockObjectManager.setReturnValueAtAllTimes(TtPackingHeadServiceImpl.class, "updateByCondition", 1);
        MockObjectManager.setReturnValueAtAllTimes(TtPackingAttachedCmlServiceImpl.class, "updateByCondition", 1);
        MockObjectManager.setReturnValueAtAllTimes(TtPackAtchItemNoServiceImpl.class, "updateByCondition", 1);
        MockObjectManager.setReturnNullAtAllTimes(CommonServiceImpl.class, "setCommonPropertyForUpdate");
        MockObjectManager.setReturnValueAtAllTimes(TtPltzServiceImpl.class, "updateByCondition", 1);
        MockObjectManager.setReturnValueAtAllTimes(W6001DocDaoImpl.class, "updateTtInvoiceByKey", 1);
        MockObjectManager.setReturnValueAtAllTimes(W6001DocDaoImpl.class, "updateTtInvoiceHeaderByKey", 1);
        MockObjectManager.setReturnValueAtAllTimes(TtPackingHeadServiceImpl.class, "updateByCondition", 1);
        MockObjectManager.setReturnValueAtAllTimes(FileManagementServiceImpl.class, "searchFileDownload", new FileManagementDomain());
        invoiceDomain.setLoadingPortCd("NGO");      //TM_PORTに、PORT_CD=設定値が必要
        invoiceDomain.setDischargePortCd("NGO");    //TM_PORTに、PORT_CD=設定値が必要
        
        //★★FUNCTION=5のケース
        invoiceDomain.setFunctionNo("5");
        w6001DocService.transactOnUploadRegister(invoiceDomain);

        //★★FUNCTION=1のケース
        invoiceDomain.setFunctionNo("1");
        w6001DocService.transactOnUploadRegister(invoiceDomain);
        //以下Private関数のF1ケースをクリアしていく
        //createTtInvoice2_4142、createTtInvoiceHeader2_4143
        invoiceDomain.setRemLcTyp("R");
        w6001DocService.transactOnUploadRegister(invoiceDomain);
        //w6001DocService.transactOnUploadRegister(invoiceDomain);
        
        //★★FUNCTION=2のケース
        //以下Private関数ののF2ケースをクリアしていく
        //createTtInvoice2_4142、createTtInvoiceHeader2_4143
        invoiceDomain.setFunctionNo("2");
        w6001DocService.transactOnUploadRegister(invoiceDomain);

        //★★FUNCTION=3のケース
        invoiceDomain.setFunctionNo("3");
        invoiceDomain.setInvoiceNo("A");
        invoiceDomain.setTakeOverInvoiceNo("B");
        invoiceDomain.setTakeOverFrtContainFlg("N");
        invoiceDomain.setClassOfInv("M");
        
        List<TtInvoiceHeaderDomain> ttInvoiceHeaderList = new ArrayList<TtInvoiceHeaderDomain>();
        TtInvoiceHeaderDomain ttInvoiceHeaderDat = new TtInvoiceHeaderDomain();
        ttInvoiceHeaderDat.setFileId("F");
        ttInvoiceHeaderList.add(ttInvoiceHeaderDat);
        MockObjectManager.setReturnValueAtAllTimes(TtInvoiceHeaderServiceImpl.class, "searchByCondition", ttInvoiceHeaderList);
        
        List<TtPackingHeadDomain> ttPackingHeadList = new ArrayList<TtPackingHeadDomain>();
        TtPackingHeadDomain ttPackingHeadDat = new TtPackingHeadDomain();
        ttPackingHeadDat.setFileId("F");
        ttPackingHeadList.add(ttPackingHeadDat);
        MockObjectManager.setReturnValueAtAllTimes(TtPackingHeadServiceImpl.class, "searchByCondition", ttPackingHeadList);
        //ここはあえてAdd、以下でExceptionをそれぞれ確認したいため
        MockObjectManager.addReturnValue(FileManagementServiceImpl.class, "deleteFile", 1);
        MockObjectManager.addReturnValue(FileManagementServiceImpl.class, "deleteFile", 1);
        w6001DocService.transactOnUploadRegister(invoiceDomain);
        //以下Private関数の内部ケースをクリアしていく
        //deletePdfFile2_412、updateTtInvoice2_4123
        //Exception確認
        MockObjectManager.addReturnValue(FileManagementServiceImpl.class, "deleteFile", new FileManagementException("E"));
        try {
            w6001DocService.transactOnUploadRegister(invoiceDomain);
        } catch (Exception e) {
        }
        MockObjectManager.addReturnValue(FileManagementServiceImpl.class, "deleteFile", new IOException("E"));
        try {
            w6001DocService.transactOnUploadRegister(invoiceDomain);
        } catch (Exception e) {
        }
        //2回目のコールでException
        MockObjectManager.addReturnValue(FileManagementServiceImpl.class, "deleteFile", 1);
        MockObjectManager.addReturnValue(FileManagementServiceImpl.class, "deleteFile", new FileManagementException("E"));
        try {
            w6001DocService.transactOnUploadRegister(invoiceDomain);
        } catch (Exception e) {
        }
        MockObjectManager.addReturnValue(FileManagementServiceImpl.class, "deleteFile", 1);
        MockObjectManager.addReturnValue(FileManagementServiceImpl.class, "deleteFile", new IOException("E"));
        try {
            w6001DocService.transactOnUploadRegister(invoiceDomain);
        } catch (Exception e) {
        }
        invoiceDomain.setClassOfInv("F");
        MockObjectManager.addReturnValue(FileManagementServiceImpl.class, "deleteFile", 1);
        MockObjectManager.addReturnValue(FileManagementServiceImpl.class, "deleteFile", 1);
        w6001DocService.transactOnUploadRegister(invoiceDomain);
        //★ TakeOverInvoiceNo = InvoiceNo
        invoiceDomain.setTakeOverInvoiceNo("A");
        invoiceDomain.setTakeOverFrtContainFlg("Y");
        w6001DocService.transactOnUploadRegister(invoiceDomain);
        List<TtInvoiceDomain> ttInvoiceList =  new ArrayList<TtInvoiceDomain>();
        TtInvoiceDomain ttInvoiceDat = new TtInvoiceDomain();
        MockObjectManager.setReturnValueAtAllTimes(TtInvoiceServiceImpl.class, "searchByCondition", ttInvoiceList);
        ttInvoiceList.add(ttInvoiceDat);
        w6001DocService.transactOnUploadRegister(invoiceDomain);
       
        //★★FUNCTION=4のケース
        W6001DocInvoiceDomain w6001DocInvoiceDomain = new W6001DocInvoiceDomain();
        invoiceDomain.setFunctionNo("4");
        invoiceDomain.setClassOfInv("M");
        w6001DocInvoiceDomain.setCountMainMark(1);
        w6001DocInvoiceDomain.setCustomTimingTyp("A");
        MockObjectManager.setReturnValueAtAllTimes(W6001DocDaoImpl.class, "searchTtPltz", w6001DocInvoiceDomain);
        MockObjectManager.setReturnValueAtAllTimes(W6001DocDaoImpl.class, "updateTtPltzByPltzStatus", 1);
        //
        ttInvoiceDat.setNetAmount(new BigDecimal(1));
        ttInvoiceDat.setFreight(new BigDecimal(1));
        ttInvoiceDat.setInsurance(new BigDecimal(1));
        ttInvoiceDat.setSubTotal(new BigDecimal(1));
        ttInvoiceDat.setVat(new BigDecimal(1));
        ttInvoiceDat.setHandlingCharge(new BigDecimal(1));
        ttInvoiceDat.setAdditionalCharge(new BigDecimal(1));
        ttInvoiceDat.setAdditionalChargeNm("A");
        ttInvoiceDat.setTotalInvoiceAmount(new BigDecimal(1));
        ttInvoiceDat.setNoCharge(new BigDecimal(1));
        ttInvoiceDat.setPltzItemQty(new BigDecimal(1));
        //
        ttInvoiceHeaderDat.setNetAmount(new BigDecimal(1));
        ttInvoiceHeaderDat.setFreight(new BigDecimal(1));
        ttInvoiceHeaderDat.setInsurance(new BigDecimal(1));
        ttInvoiceHeaderDat.setSubTotal(new BigDecimal(1));
        ttInvoiceHeaderDat.setVat(new BigDecimal(1));
        ttInvoiceHeaderDat.setHandlingCharge(new BigDecimal(1));
        ttInvoiceHeaderDat.setAdditionalCharge(new BigDecimal(1));
        ttInvoiceHeaderDat.setTotalInvoiceAmount(new BigDecimal(1));
        //
        List<TtInvoiceAttachedDomain> ttInvoiceAttachedList =  new ArrayList<TtInvoiceAttachedDomain>();
        TtInvoiceAttachedDomain ttInvoiceAttachedDat = new TtInvoiceAttachedDomain();
        ttInvoiceAttachedDat.setQty(new BigDecimal(1));
        ttInvoiceAttachedDat.setAmount(new BigDecimal(1));
        ttInvoiceAttachedList.add(ttInvoiceAttachedDat);
        MockObjectManager.setReturnValueAtAllTimes(TtInvoiceAttachedServiceImpl.class, "searchByCondition", ttInvoiceAttachedList);
        //
        List<TtPackingAttachedCmlDomain> ttPackingAttachedCmlList =  new ArrayList<TtPackingAttachedCmlDomain>();
        TtPackingAttachedCmlDomain ttPackingAttachedCmlDat = new TtPackingAttachedCmlDomain();
        ttPackingAttachedCmlList.add(ttPackingAttachedCmlDat);
        MockObjectManager.setReturnValueAtAllTimes(TtPackingAttachedCmlServiceImpl.class, "searchByCondition", ttPackingAttachedCmlList);
        //
        List<TtPackAtchItemNoDomain> ttPackAtchItemNoList =  new ArrayList<TtPackAtchItemNoDomain>();
        TtPackAtchItemNoDomain ttPackAtchItemNoDat = new TtPackAtchItemNoDomain();
        ttPackAtchItemNoList.add(ttPackAtchItemNoDat);
        MockObjectManager.setReturnValueAtAllTimes(TtPackAtchItemNoServiceImpl.class, "searchByCondition", ttPackAtchItemNoList);
        w6001DocService.transactOnUploadRegister(invoiceDomain);
        
        invoiceDomain.setClassOfInv("F");
        w6001DocService.transactOnUploadRegister(invoiceDomain);
        invoiceDomain.setClassOfInv("M");
        w6001DocInvoiceDomain.setCustomTimingTyp("B");
        w6001DocService.transactOnUploadRegister(invoiceDomain);
        w6001DocInvoiceDomain.setCustomTimingTyp("Z");
        w6001DocService.transactOnUploadRegister(invoiceDomain);

        w6001DocInvoiceDomain.setCustomTimingTyp("A");
        w6001DocInvoiceDomain.setPltzStatus("90");
        try {
            w6001DocService.transactOnUploadRegister(invoiceDomain);
        } catch (Exception e) {
        }
        w6001DocInvoiceDomain.setCustomTimingTyp("B");
        try {
            w6001DocService.transactOnUploadRegister(invoiceDomain);
        } catch (Exception e) {
        }
        w6001DocInvoiceDomain.setCustomTimingTyp("Z");
        try {
            w6001DocService.transactOnUploadRegister(invoiceDomain);
        } catch (Exception e) {
        }
        w6001DocInvoiceDomain.setCountMainMark(0);
        try {
            w6001DocService.transactOnUploadRegister(invoiceDomain);
        } catch (Exception e) {
        }
    }

    /**
     * 正常ケース
     * 
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testSearchForPagingOnCreateSearch() throws Exception  {
        // 検索条件
        W6001DocCriteriaDomain invoiceDomain = new W6001DocCriteriaDomain();
        invoiceDomain.setDscId("srawf09");
        invoiceDomain.setShipperCd("MAF");
        invoiceDomain.setGrpNo1("1");
        invoiceDomain.setGrpNo2("0");
        invoiceDomain.setOwnerCompCd("MYF");
        invoiceDomain.setCustomTimingTyp("A");
        
        List<W6001DocPltzDomain> docPltzList = new ArrayList<W6001DocPltzDomain>();
        W6001DocPltzDomain docPltzDomain = new W6001DocPltzDomain();
        docPltzDomain.setItemNo("A002TB0091B3N");
        docPltzDomain.setItemDescription("DESCRIPTION1");
        docPltzDomain.setModelCd("MODEL1");
        docPltzDomain.setCurrCd("CR2");
        docPltzDomain.setUnitPrice(new BigDecimal("2.3"));
        docPltzList.add(docPltzDomain);
        invoiceDomain.setDocPltzList(docPltzList);
        
        // ページ情報Creator(モック用にinstanceのみ)
        invoiceDomain.setScreenId(SCREEN_ID_W9018);
        invoiceDomain.setLanguageCd("ja");
        PageInfoCreator page = new ActionPageInfoCreator(null, null, null);
        invoiceDomain.setPageInfoCreator(page);
        
        PageInfoData pageInfoData = new PageInfoData();
        pageInfoData.setFromCount(1);
        pageInfoData.setToCount(5);
        
        MockObjectManager.addReturnValue(UserAuthServiceImpl.class, "hasRegisterAll", false);
        MockObjectManager.addReturnValue(UserAuthServiceImpl.class, "hasBrowseAll", true);
        MockObjectManager.addReturnValue(W6001DocDaoImpl.class, "searchCountTtPltzByTypA", 1);
        MockObjectManager.setReturnValueAtAllTimes(ActionPageInfoCreator.class, "createPageInfoData", pageInfoData);
        MockObjectManager.setReturnNullAtAllTimes(W6001DocDaoImpl.class, "searchForPagingTtPltzByTypA");
        w6001DocService.searchForPagingOnCreateSearch(invoiceDomain);
        
        invoiceDomain.setCustomTimingTyp("B");
        MockObjectManager.addReturnValue(UserAuthServiceImpl.class, "hasRegisterAll", false);
        MockObjectManager.addReturnValue(UserAuthServiceImpl.class, "hasBrowseAll", true);
        MockObjectManager.addReturnValue(W6001DocDaoImpl.class, "searchCountTtPltzByTypB", 1);
        MockObjectManager.setReturnValueAtAllTimes(ActionPageInfoCreator.class, "createPageInfoData", pageInfoData);
        MockObjectManager.setReturnNullAtAllTimes(W6001DocDaoImpl.class, "searchForPagingTtPltzByTypB");
        w6001DocService.searchForPagingOnCreateSearch(invoiceDomain);
        
        invoiceDomain.setCustomTimingTyp("Z");
        MockObjectManager.addReturnValue(UserAuthServiceImpl.class, "hasRegisterAll", false);
        MockObjectManager.addReturnValue(UserAuthServiceImpl.class, "hasBrowseAll", true);
        MockObjectManager.addReturnValue(W6001DocDaoImpl.class, "searchCountTtPltzByTypZ", 1);
        MockObjectManager.setReturnValueAtAllTimes(ActionPageInfoCreator.class, "createPageInfoData", pageInfoData);
        MockObjectManager.setReturnNullAtAllTimes(W6001DocDaoImpl.class, "searchForPagingTtPltzByTypZ");
        w6001DocService.searchForPagingOnCreateSearch(invoiceDomain);
        
        List<UserAuthDomain> List = new ArrayList<UserAuthDomain>();
        
        try{
            invoiceDomain.setCustomTimingTyp("Z");
            MockObjectManager.addReturnValue(UserAuthServiceImpl.class, "hasRegisterAll", false);
            MockObjectManager.addReturnValue(UserAuthServiceImpl.class, "hasBrowseAll", false);
            MockObjectManager.addReturnValue(UserAuthServiceImpl.class, "getUserAuthList", List);
            MockObjectManager.addReturnValue(W6001DocDaoImpl.class, "searchCountTtPltzByTypZ", 1);
            MockObjectManager.setReturnValueAtAllTimes(ActionPageInfoCreator.class, "createPageInfoData", pageInfoData);
            MockObjectManager.setReturnNullAtAllTimes(W6001DocDaoImpl.class, "searchForPagingTtPltzByTypZ");
            w6001DocService.searchForPagingOnCreateSearch(invoiceDomain);
        }catch (GscmApplicationException e) {
        }
        
        UserAuthDomain userAuthDomain = new UserAuthDomain();
        userAuthDomain.setAuthMgtComp("1");
        List.add(userAuthDomain);
        
        invoiceDomain.setCustomTimingTyp("Z");
        MockObjectManager.addReturnValue(UserAuthServiceImpl.class, "hasRegisterAll", false);
        MockObjectManager.addReturnValue(UserAuthServiceImpl.class, "hasBrowseAll", false);
        MockObjectManager.addReturnValue(UserAuthServiceImpl.class, "getUserAuthList", List);
        MockObjectManager.addReturnValue(W6001DocDaoImpl.class, "searchCountTtPltzByTypZ", 1);
        MockObjectManager.setReturnValueAtAllTimes(ActionPageInfoCreator.class, "createPageInfoData", pageInfoData);
        MockObjectManager.setReturnNullAtAllTimes(W6001DocDaoImpl.class, "searchForPagingTtPltzByTypZ");
        w6001DocService.searchForPagingOnCreateSearch(invoiceDomain);
    }
    
    /**
     * 正常ケース
     * 
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testDeleteOnCreateInit() throws Exception  {
        // 検索条件
        W6001DocCriteriaDomain invoiceDomain = new W6001DocCriteriaDomain();
        invoiceDomain.setDscId("maeTest01");
        
        MockObjectManager.setReturnNullAtAllTimes(TwInvPltzServiceImpl.class, "deleteByCondition");
        MockObjectManager.setReturnNullAtAllTimes(TwInvItemServiceImpl.class, "deleteByCondition");
        MockObjectManager.setReturnNullAtAllTimes(TwInvServiceImpl.class, "deleteByCondition");
        MockObjectManager.setReturnNullAtAllTimes(TwInvoiceServiceImpl.class, "deleteByCondition");

        w6001DocService.deleteOnCreateInit(invoiceDomain);
    }
    
    /**
     * 正常ケース
     * 
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testSearchToolTipOnInvoiceGrouping() throws Exception  {
        // 検索条件
        String dscId = "maeTest01";
        String customTimingTyp = "A";
        
        w6001DocService.searchToolTipOnInvoiceGrouping(dscId, customTimingTyp);
    }
    
    /**
     * 正常ケース
     * 
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testTransactOnInvGroupSearch() throws Exception  {

        W6001DocCriteriaDomain invoiceDomain = new W6001DocCriteriaDomain();
        
        invoiceDomain.setDscId("maeTest01");
        invoiceDomain.setShipperCd("MAT01");
       
        // まずはフラグNで一通り流す
        invoiceDomain.setFirstTimeFlg("N");
        MockObjectManager.addReturnNull(TwInvItemServiceImpl.class, "updateByCondition");
        w6001DocService.transactOnInvGroupSearch(invoiceDomain);
        
        // フラグYの残り（createInvoiceGroupingInformation内）
//        invoiceDomain.setFirstTimeFlg("Y");

        invoiceDomain.setGrpNo1("1");
        invoiceDomain.setGrpNo2("0");
        
        List<W6001DocPltzDomain> docPltzList = new ArrayList<W6001DocPltzDomain>();
        W6001DocPltzDomain docPltzDomain = new W6001DocPltzDomain();
        docPltzDomain.setItemNo("A002TB0091B3N");
        docPltzDomain.setItemDescription("DESCRIPTION1");
        docPltzDomain.setModelCd("MODEL1");
        docPltzDomain.setCurrCd("CR2");
        docPltzDomain.setUnitPrice(new BigDecimal("2.3"));
        docPltzDomain.setCustomerCd("1");
        docPltzDomain.setCmlTyp("1");
        
        List<W6001DocPltzItemDomain> docPltzItemList = new ArrayList<W6001DocPltzItemDomain>();
        W6001DocPltzItemDomain docPltzItemDomain = new W6001DocPltzItemDomain();
        docPltzItemDomain.setItemNo("A002TB0091B3N");
        docPltzItemDomain.setItemDescription("DESCRIPTION1");
        docPltzItemDomain.setModelCd("MODEL1");
        docPltzItemDomain.setCurrCd("CR2");
        docPltzItemDomain.setUnitPrice(new BigDecimal("2.3"));
        docPltzItemDomain.setItemWeight(new BigDecimal("1"));
        
        List<W6001DocPltzItemOdrDomain> docPltzItemOdrList = new ArrayList<W6001DocPltzItemOdrDomain>();
        W6001DocPltzItemOdrDomain docPltzItemOdrDomain = new W6001DocPltzItemOdrDomain();
        docPltzItemOdrDomain.setItemNo("A002TB0091B3N");
        docPltzItemOdrDomain.setSumAllocQty(new BigDecimal("1"));
        
        docPltzItemOdrList.add(docPltzItemOdrDomain);
        docPltzItemDomain.setDocPltzItemOdrList(docPltzItemOdrList);
        docPltzItemList.add(docPltzItemDomain);
        docPltzDomain.setDocPltzItemList(docPltzItemList);
        docPltzList.add(docPltzDomain);
        invoiceDomain.setDocPltzList(docPltzList);
        
        MockObjectManager.setReturnValueAtAllTimes(W6001DocDaoImpl.class, "searchTwInvPltzByGropingInfo", docPltzList);
        MockObjectManager.addReturnNull(TwInvItemServiceImpl.class, "create");
        MockObjectManager.setReturnValueAtAllTimes(W6001DocDaoImpl.class, "searchTwInvItemByGroupNo2", docPltzItemList);
        MockObjectManager.setReturnValueAtAllTimes(TwInvPltzServiceImpl.class, "updateByCondition", 1);
        MockObjectManager.setReturnValueAtAllTimes(W6001DocDaoImpl.class, "searchTwInvPltzBySearchInvoice", docPltzList);
        MockObjectManager.setReturnNullAtAllTimes(TwInvServiceImpl.class, "create");
        MockObjectManager.setReturnValueAtAllTimes(W6001DocDaoImpl.class, "searchTwPkgMaterials", docPltzItemList);
        MockObjectManager.setReturnValueAtAllTimes(TwInvItemServiceImpl.class, "updateByCondition", 1);
        w6001DocService.transactOnInvGroupSearch(invoiceDomain);
        
    }
    
    /**
     * 正常ケース
     * 
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testSearchOnRegisterPrintDocument() throws Exception  {

        // 検索条件
        W6001DocCriteriaDomain invoiceDomain = new W6001DocCriteriaDomain();
        W6001DocInvoiceDomain w6001DocInvoiceDomain = new W6001DocInvoiceDomain();

        invoiceDomain.setShipperCd("MYE");
        invoiceDomain.setInvoiceNo("W6001Max093");
        invoiceDomain.setInvoiceIssueDt(DateFormat.getDateInstance().parse("2014/06/19"));
        
        try{
            w6001DocService.searchOnRegisterPrintDocument(invoiceDomain);
        }catch (GscmApplicationException e) {
            assertThat(e.getCode(), is("NXS-E7-0064"));
        }
        
        invoiceDomain.setShipperCd("MYF");
        invoiceDomain.setInvoiceNo("W7001002");
        invoiceDomain.setInvoiceIssueDt(DateFormat.getDateInstance().parse("2014/03/19"));
        try{
            w6001DocService.searchOnRegisterPrintDocument(invoiceDomain);
        }catch (GscmApplicationException e) {
            assertThat(e.getCode(), is("NXS-E7-0064"));
        }
        
        invoiceDomain.setShipperCd("MAC");
        invoiceDomain.setInvoiceNo("W6001004");
        invoiceDomain.setInvoiceIssueDt(DateFormat.getDateInstance().parse("2014/01/01"));
        
        
        w6001DocInvoiceDomain.setScHeaderFileId("1");
        
        MockObjectManager.addReturnValue(W6001DocServiceImpl.class, "searchTtInvoiceOnRegisterByPrintDoc", "1");
        MockObjectManager.addReturnValue(W6001DocServiceImpl.class, "searchTtInvoiceOnRegisterByFileId", w6001DocInvoiceDomain);
        MockObjectManager.setReturnNullAtAllTimes(FileManagementServiceImpl.class, "searchFileDownload");
        MockObjectManager.setReturnNullAtAllTimes(CommonServiceImpl.class, "mergePdf");
        w6001DocService.searchOnRegisterPrintDocument(invoiceDomain);
        
        w6001DocInvoiceDomain.setPackingHeadFileId("1");
        
        MockObjectManager.addReturnValue(W6001DocServiceImpl.class, "searchTtInvoiceOnRegisterByPrintDoc", "1");
        MockObjectManager.addReturnValue(W6001DocServiceImpl.class, "searchTtInvoiceOnRegisterByFileId", w6001DocInvoiceDomain);
        MockObjectManager.setReturnNullAtAllTimes(FileManagementServiceImpl.class, "searchFileDownload");
        MockObjectManager.setReturnNullAtAllTimes(CommonServiceImpl.class, "mergePdf");
        w6001DocService.searchOnRegisterPrintDocument(invoiceDomain);
        
        w6001DocInvoiceDomain.setInvoiceHeaderFileId("1");
        w6001DocInvoiceDomain.setPackingHeadFileId("1");
        w6001DocInvoiceDomain.setScHeaderFileId("1");
        
        MockObjectManager.addReturnValue(W6001DocServiceImpl.class, "searchTtInvoiceOnRegisterByPrintDoc", "1");
        MockObjectManager.addReturnValue(W6001DocServiceImpl.class, "searchTtInvoiceOnRegisterByFileId", w6001DocInvoiceDomain);
        MockObjectManager.setReturnNullAtAllTimes(FileManagementServiceImpl.class, "searchFileDownload");
        MockObjectManager.setReturnNullAtAllTimes(CommonServiceImpl.class, "mergePdf");
        w6001DocService.searchOnRegisterPrintDocument(invoiceDomain);
        
        // DBから取得すると値をテスト用に作れないので、ここからは内部関数をMOC扱いにする
        // これ以降、FileManagementServiceImplのMOC使用可能化のために、同Javaファイルを作成してテスト
        MockObjectManager.addReturnValue(W6001DocServiceImpl.class, "searchTtInvoiceOnRegisterByPrintDoc", "0");
        MockObjectManager.addReturnValue(W6001DocServiceImpl.class, "searchTtInvoiceOnRegisterByPrintDoc", "1");
        MockObjectManager.addReturnValue(W6001DocServiceImpl.class, "searchTtInvoiceOnRegisterByFileId", w6001DocInvoiceDomain);
        MockObjectManager.setReturnValueAtAllTimes(FileManagementServiceImpl.class, "searchFileDownload", new FileManagementException("e"));
        try{
            w6001DocService.searchOnRegisterPrintDocument(invoiceDomain);
        }catch (Exception e) {
        }

        MockObjectManager.addReturnValue(W6001DocServiceImpl.class, "searchTtInvoiceOnRegisterByPrintDoc", "0");
        MockObjectManager.addReturnValue(W6001DocServiceImpl.class, "searchTtInvoiceOnRegisterByPrintDoc", "1");
        MockObjectManager.addReturnValue(W6001DocServiceImpl.class, "searchTtInvoiceOnRegisterByFileId", w6001DocInvoiceDomain);
        MockObjectManager.setReturnValueAtAllTimes(FileManagementServiceImpl.class, "searchFileDownload", new UnsupportedEncodingException());
        try{
            w6001DocService.searchOnRegisterPrintDocument(invoiceDomain);
        }catch (Exception e) {
        }

        MockObjectManager.addReturnValue(W6001DocServiceImpl.class, "searchTtInvoiceOnRegisterByPrintDoc", "0");
        MockObjectManager.addReturnValue(W6001DocServiceImpl.class, "searchTtInvoiceOnRegisterByPrintDoc", "1");
        MockObjectManager.addReturnValue(W6001DocServiceImpl.class, "searchTtInvoiceOnRegisterByFileId", w6001DocInvoiceDomain);
        MockObjectManager.setReturnValueAtAllTimes(FileManagementServiceImpl.class, "searchFileDownload", new IOException());
        try{
            w6001DocService.searchOnRegisterPrintDocument(invoiceDomain);
        }catch (Exception e) {
        }

    }
    
    /**
     * 正常ケース
     * 
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testTransactOnRegister() throws Exception  {
        
        W6001DocCriteriaDomain invoiceDomain = new W6001DocCriteriaDomain();
        W6001DocInvoiceDomain docInvoiceDomain = new W6001DocInvoiceDomain();
        W6001DocInvoiceDomain invoiceDomainForCalcAmount = new W6001DocInvoiceDomain();
        
        MockObjectManager.setReturnValueAtAllTimes(W6001DocServiceImpl.class, "calculateAmount", invoiceDomainForCalcAmount);
        MockObjectManager.setReturnValueAtAllTimes(W6001DocServiceImpl.class, "transactOnRegisterByRegistTwInvoice", docInvoiceDomain);
        w6001DocService.transactOnRegister(invoiceDomain);

        MockObjectManager.setReturnNullAtAllTimes(W6001DocServiceImpl.class, "transactOnRegisterByRegistTwInvoice");
        MockObjectManager.setReturnValueAtAllTimes(W6001DocServiceImpl.class, "transactOnRegisterByRegistTtInvoice", docInvoiceDomain);
        w6001DocService.transactOnRegister(invoiceDomain);

    }
    
    /**
     * 正常ケース
     * 
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testDeleteOnInvGroupBackToMainScreen001() throws Exception  {
        
        W6001DocCriteriaDomain criteria = new W6001DocCriteriaDomain();
        criteria.setDscId("10");
        
        // 検索
        w6001DocService.deleteOnInvGroupBackToMainScreen(criteria);
    }
    
    /**
     * 正常ケース
     * 
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testsearchOnDetailInit() throws Exception  {
        
        W6001DocCriteriaDomain criteria = new W6001DocCriteriaDomain();
        
        TwInvDomain twDom1 = new TwInvDomain();
        List<TwInvDomain> docTwList = new ArrayList<TwInvDomain>();
        
        TwInvItemDomain twItemDom1 = new TwInvItemDomain();
        List<TwInvItemDomain> docTwItemList = new ArrayList<TwInvItemDomain>();
        
        W6001DocPltzDomain pltzDom = new W6001DocPltzDomain();
        List<W6001DocPltzDomain> docPltzList = new ArrayList<W6001DocPltzDomain>();
        
        W6001DocPltzItemDomain pltzItemDom = new W6001DocPltzItemDomain();
        List<W6001DocPltzItemDomain> ptlzItemList = new ArrayList<W6001DocPltzItemDomain>();
        
        Ws6004ResultItemDomain ws6004ResDom = new Ws6004ResultItemDomain();
        List<Ws6004ResultItemDomain> salesPriceList = new ArrayList<Ws6004ResultItemDomain>();

        //序盤での処理終了
        try{
            MockObjectManager.setReturnValueAtAllTimes(TwInvServiceImpl.class, "searchByCondition", docTwList);
            w6001DocService.searchOnDetailInit(criteria);
        }catch (Exception e) {
        }
        
        //3300、3400に入らない部分
        try{
            docTwList.add(twDom1);
            MockObjectManager.setReturnValueAtAllTimes(TwInvServiceImpl.class, "searchByCondition", docTwList);
            pltzDom.setGrossWeight(new BigDecimal(1));
            pltzDom.setVolume(new BigDecimal(1));
            pltzDom.setMainMark("1");
            docPltzList.add(pltzDom);
            MockObjectManager.setReturnValueAtAllTimes(W6001DocDaoImpl.class, "searchTwInvPltzByDetail", docPltzList);
            MockObjectManager.setReturnValueAtAllTimes(W6001DocDaoImpl.class, "searchCountTwInvItemByCurrencyCheck", 1);
            w6001DocService.searchOnDetailInit(criteria);
        }catch (Exception e) {
        }
        try{
            MockObjectManager.setReturnValueAtAllTimes(W6001DocDaoImpl.class, "searchCountTwInvItemByCurrencyCheck", 0);
            w6001DocService.searchOnDetailInit(criteria);
        }catch (Exception e) {
        }
        try{
            MockObjectManager.setReturnValueAtAllTimes(W6001DocDaoImpl.class, "searchCountTwInvItemByUnitPrice", 1);
            w6001DocService.searchOnDetailInit(criteria);
        }catch (Exception e) {
        }
        
        //3300内部に入る部分
        criteria.setShipperCd("MAF");
        try{
            twDom1.setCmlTyp("2");
            MockObjectManager.setReturnNullAtAllTimes(TwInvItemServiceImpl.class, "updateByCondition");
            w6001DocService.searchOnDetailInit(criteria);
        }catch (Exception e) {
        }
        try{
            MockObjectManager.setReturnValueAtAllTimes(CommonServiceImpl.class, "searchTimezone", "DUMMY");
            ptlzItemList.add(pltzItemDom);
            MockObjectManager.setReturnValueAtAllTimes(W6001DocDaoImpl.class, "searchTmExpFormalitiItemNo", ptlzItemList);
            docTwItemList.add(twItemDom1);
            MockObjectManager.setReturnValueAtAllTimes(TwInvItemServiceImpl.class, "searchByCondition", docTwItemList);
            w6001DocService.searchOnDetailInit(criteria);
        }catch (Exception e) {
        }
        
        //3400内部に入る部分
        try{
            twItemDom1.setItemNo("P");
            twDom1.setCmlTyp("1");
            MockObjectManager.setReturnValueAtAllTimes(W6001DocDaoImpl.class, "updateClearPriceByTwInvItem", 1);
            Ws6004ResultDomain ws6004 = new Ws6004ResultDomain();
            ws6004.setResultCode("0");
            MockObjectManager.setReturnValueAtAllTimes(Ws6004RestServiceImpl.class, "getSalesPriceInfo", ws6004);
            ws6004ResDom.setPrtno("P");
            ws6004ResDom.setCurr3("1");
            ws6004ResDom.setPrice("1");
            salesPriceList.add(ws6004ResDom);
            MockObjectManager.setReturnValueAtAllTimes(Ws6004ResultDomain.class, "getSalesPriceList", salesPriceList);
            w6001DocService.searchOnDetailInit(criteria);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    /**
     * 正常ケース
     * 
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testDeleteOnHeaderInit001() throws Exception  {
        // 検索条件
        W6001DocCriteriaDomain invoiceDomain = new W6001DocCriteriaDomain();
        
        invoiceDomain.setShipperCd("10");
        invoiceDomain.setParInvoiceNo("10");
        
        MockObjectManager.addReturnValue(TwInvPltzServiceImpl.class, "searchCount", 1);
        MockObjectManager.addReturnValue(TwInvPltzServiceImpl.class, "deleteByCondition", 1);
        MockObjectManager.addReturnValue(TwInvItemServiceImpl.class, "searchCount", 1);
        MockObjectManager.addReturnValue(TwInvItemServiceImpl.class, "deleteByCondition", 1);
        MockObjectManager.addReturnValue(TwInvServiceImpl.class, "searchCount", 1);
        MockObjectManager.addReturnValue(TwInvServiceImpl.class, "deleteByCondition", 1);
        MockObjectManager.addReturnValue(TwInvoiceServiceImpl.class, "searchCount", 1);
        MockObjectManager.addReturnValue(TwInvoiceServiceImpl.class, "deleteByCondition", 1);
        w6001DocService.deleteOnHeaderInit(invoiceDomain);
    }
    
    /**
     * 正常ケース
     * 
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testCreateOnCreateUpdate001() throws Exception  {
        // 検索条件
        W6001DocCriteriaDomain invoiceDomain = new W6001DocCriteriaDomain();
        
        invoiceDomain.setDscId("srawf09");
        MockObjectManager.setReturnValueAtAllTimes(TwInvPltzServiceImpl.class, "create");
        w6001DocService.createOnCreateUpdate(invoiceDomain);
        
        List<W6001DocPltzDomain> List = new ArrayList<W6001DocPltzDomain>();
        
        MockObjectManager.addReturnValue(W6001DocDaoImpl.class, "searchTtPltzByCreate", List);
        w6001DocService.createOnCreateUpdate(invoiceDomain);
    }
    
    /**
     * 正常ケース
     * 
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testValidateDatabaseTtInvoiceOnMainCancelInv001() throws Exception  {

        W6001DocInvoiceDomain invoiceDomain = new W6001DocInvoiceDomain();
        W6001DocInvoiceDomain resultDoc = new W6001DocInvoiceDomain();
        String result = "";
        W6001DocPltzDomain pltzDomain = new W6001DocPltzDomain();
        List<W6001DocPltzDomain> docPltzList = new ArrayList<W6001DocPltzDomain>();;

        result = w6001DocService.validateDatabaseTtInvoiceOnMainCancelInv(invoiceDomain);       

        resultDoc.setCancelTyp("Y");
        MockObjectManager.addReturnValue(W6001DocDaoImpl.class, "searchTtInvoiceByCancelInv", resultDoc);
        result = w6001DocService.validateDatabaseTtInvoiceOnMainCancelInv(invoiceDomain);       

        resultDoc.setCancelTyp("N");
        resultDoc.setCancelFlg("Y");
        MockObjectManager.addReturnValue(W6001DocDaoImpl.class, "searchTtInvoiceByCancelInv", resultDoc);
        result = w6001DocService.validateDatabaseTtInvoiceOnMainCancelInv(invoiceDomain);       

        resultDoc.setCancelFlg("N");
        resultDoc.setShippingActNo("TEST");
        MockObjectManager.addReturnValue(W6001DocDaoImpl.class, "searchTtInvoiceByCancelInv", resultDoc);
        result = w6001DocService.validateDatabaseTtInvoiceOnMainCancelInv(invoiceDomain);       

        resultDoc.setShippingActNo("");
        resultDoc.setDocPltzList(docPltzList);
        MockObjectManager.addReturnValue(W6001DocDaoImpl.class, "searchTtInvoiceByCancelInv", resultDoc);
        result = w6001DocService.validateDatabaseTtInvoiceOnMainCancelInv(invoiceDomain);       

        resultDoc.setManualFlg("N");
        resultDoc.setCustomTimingTyp("TEST");
        docPltzList.add(pltzDomain);
        resultDoc.setDocPltzList(docPltzList);
        MockObjectManager.addReturnValue(W6001DocDaoImpl.class, "searchTtInvoiceByCancelInv", resultDoc);
        result = w6001DocService.validateDatabaseTtInvoiceOnMainCancelInv(invoiceDomain);       

        resultDoc.setManualFlg("Y");
        resultDoc.setManualTyp("2");
        resultDoc.setCustomTimingTyp("A");
        docPltzList.clear();
        pltzDomain.setPltzStatus("90");
        pltzDomain.setCountMainMark(1);
        docPltzList.add(pltzDomain);
        resultDoc.setDocPltzList(docPltzList);
        MockObjectManager.addReturnValue(W6001DocDaoImpl.class, "searchTtInvoiceByCancelInv", resultDoc);
        result = w6001DocService.validateDatabaseTtInvoiceOnMainCancelInv(invoiceDomain);       

        docPltzList.clear();
        pltzDomain.setPltzStatus("TEST");
        pltzDomain.setCountMainMark(0);
        docPltzList.add(pltzDomain);
        resultDoc.setDocPltzList(docPltzList);
        MockObjectManager.addReturnValue(W6001DocDaoImpl.class, "searchTtInvoiceByCancelInv", resultDoc);
        result = w6001DocService.validateDatabaseTtInvoiceOnMainCancelInv(invoiceDomain);       

        resultDoc.setCustomTimingTyp("B");
        docPltzList.clear();
        pltzDomain.setPltzStatus("60");
        pltzDomain.setCountMainMark(1);
        docPltzList.add(pltzDomain);
        resultDoc.setDocPltzList(docPltzList);
        MockObjectManager.addReturnValue(W6001DocDaoImpl.class, "searchTtInvoiceByCancelInv", resultDoc);
        result = w6001DocService.validateDatabaseTtInvoiceOnMainCancelInv(invoiceDomain);       

        docPltzList.clear();
        pltzDomain.setPltzStatus("TEST");
        pltzDomain.setCountMainMark(0);
        docPltzList.add(pltzDomain);
        resultDoc.setDocPltzList(docPltzList);
        MockObjectManager.addReturnValue(W6001DocDaoImpl.class, "searchTtInvoiceByCancelInv", resultDoc);
        result = w6001DocService.validateDatabaseTtInvoiceOnMainCancelInv(invoiceDomain);       

        resultDoc.setCustomTimingTyp("Z");
        docPltzList.clear();
        pltzDomain.setPltzStatus("40");
        pltzDomain.setCountMainMark(1);
        docPltzList.add(pltzDomain);
        resultDoc.setDocPltzList(docPltzList);
        MockObjectManager.addReturnValue(W6001DocDaoImpl.class, "searchTtInvoiceByCancelInv", resultDoc);
        result = w6001DocService.validateDatabaseTtInvoiceOnMainCancelInv(invoiceDomain);       

        docPltzList.clear();
        pltzDomain.setPltzStatus("TEST");
        pltzDomain.setCountMainMark(0);
        docPltzList.add(pltzDomain);
        resultDoc.setDocPltzList(docPltzList);
        MockObjectManager.addReturnValue(W6001DocDaoImpl.class, "searchTtInvoiceByCancelInv", resultDoc);
        result = w6001DocService.validateDatabaseTtInvoiceOnMainCancelInv(invoiceDomain);       
        if (result == null) {;}

    }
    
    /**
     * 正常ケース
     * 
     * @throws Exception 例外発生した場合
     */
    @Test
    public void testvalidateDatabaseTmInvAmountChkOnRegisterCalculateAmount001() throws Exception {
        W6001DocCriteriaDomain criteria = new W6001DocCriteriaDomain();
        criteria.setTradeTerms("11111");
        criteria.setShipperCd("1");
        criteria.setPayTerms("1");
        criteria.setFreightResponsibleCd("1");
        criteria.setFreight(new BigDecimal("1"));
        criteria.setInsurance(new BigDecimal("1"));
        String[] property = {"", "", ""};
        
        try{
            String e = null;
            if (e == null) {;}
            MockObjectManager.addReturnValue(TmInvAmountChkServiceImpl.class, "searchByKey", new ApplicationException(""));
            String result = w6001DocService.validateDatabaseTmInvAmountChkOnRegisterCalculateAmount(criteria, property);
            if (result == null) {;}
        }catch (ApplicationException e) {
            assertNull(e);
        }

        TmInvAmountChkDomain chkDomain = new TmInvAmountChkDomain();
        chkDomain.setFreightErr("0");
        MockObjectManager.addReturnValue(TmInvAmountChkServiceImpl.class, "searchByKey", chkDomain);
        String result = w6001DocService.validateDatabaseTmInvAmountChkOnRegisterCalculateAmount(criteria, property);
        assertNull(result);
        
        criteria.setFreight(new BigDecimal("0"));
        criteria.setInsurance(new BigDecimal("0"));
        chkDomain.setFreightErr("0");
        MockObjectManager.addReturnValue(TmInvAmountChkServiceImpl.class, "searchByKey", chkDomain);
        result = w6001DocService.validateDatabaseTmInvAmountChkOnRegisterCalculateAmount(criteria, property);
        assertEquals(result, "GSCM-E0-0034");
        
        criteria.setFreight(new BigDecimal("1"));
        criteria.setInsurance(new BigDecimal("1"));
        chkDomain.setFreightErr("1");
        chkDomain.setInsuranceErr("1");
        MockObjectManager.addReturnValue(TmInvAmountChkServiceImpl.class, "searchByKey", chkDomain);
        result = w6001DocService.validateDatabaseTmInvAmountChkOnRegisterCalculateAmount(criteria, property);
        assertEquals(result, "NXS-E7-0118");
        
        criteria.setFreight(new BigDecimal("0"));
        criteria.setInsurance(new BigDecimal("0"));
        chkDomain.setFreightErr("2");
        chkDomain.setInsuranceErr("0");
        MockObjectManager.addReturnValue(TmInvAmountChkServiceImpl.class, "searchByKey", chkDomain);
        result = w6001DocService.validateDatabaseTmInvAmountChkOnRegisterCalculateAmount(criteria, property);
        assertEquals(result, "GSCM-E0-0034");
        
        criteria.setFreight(new BigDecimal("1"));
        criteria.setInsurance(new BigDecimal("1"));
        chkDomain.setFreightErr("2");
        chkDomain.setInsuranceErr("1");
        MockObjectManager.addReturnValue(TmInvAmountChkServiceImpl.class, "searchByKey", chkDomain);
        result = w6001DocService.validateDatabaseTmInvAmountChkOnRegisterCalculateAmount(criteria, property);
        assertEquals(result, "NXS-E7-0118");

        criteria.setFreight(new BigDecimal("1"));
        criteria.setInsurance(new BigDecimal("1"));
        chkDomain.setFreightErr("2");
        chkDomain.setInsuranceErr("1");
        MockObjectManager.setReturnNullAt(TmInvAmountChkServiceImpl.class, "searchByKey", 1);
        result = w6001DocService.validateDatabaseTmInvAmountChkOnRegisterCalculateAmount(criteria, property);

    }
    
    /**
     * 正常ケース
     * 
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testUpdateOnDetailRemove001() throws Exception  {
        
        W6001DocCriteriaDomain invoiceDomain = new W6001DocCriteriaDomain();
        W6001DocInvoiceDomain retDom = new W6001DocInvoiceDomain();
        
        List<W6001DocPltzDomain> docPltzList = new ArrayList<W6001DocPltzDomain>();
        W6001DocPltzDomain docPltzDat = new W6001DocPltzDomain();
        docPltzList.add(docPltzDat);
        invoiceDomain.setDocPltzList(docPltzList);
        MockObjectManager.setReturnValueAtAllTimes(TwInvPltzServiceImpl.class, "updateByCondition", 1);
        MockObjectManager.setReturnValueAtAllTimes(TwInvItemServiceImpl.class, "updateByCondition", 1);
        MockObjectManager.setReturnValueAtAllTimes(W6001DocServiceImpl.class, "searchOnDetailInit", retDom);
        W6001DocInvoiceDomain result = w6001DocService.updateOnDetailRemove(invoiceDomain);
        if (result == null) {;}
        
    }
    
    /**
     * 正常ケース
     * 
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testSearchForPagingOnMainSearch001() throws Exception  {
        // 検索条件
        W6001DocCriteriaDomain invoiceDomain = new W6001DocCriteriaDomain();
        invoiceDomain.setShipperCd("0000000020");
        invoiceDomain.setInvoiceNo("2");
        invoiceDomain.setInvoiceIssueDt(DateFormat.getDateInstance().parse("2014/04/26"));
        invoiceDomain.setConsigneeCd("0000000020");
        invoiceDomain.setShipToCd("0");
        invoiceDomain.setTrnsCd("2");
        invoiceDomain.setCancelTyp("N");
        invoiceDomain.setCarrierCompCd("0000000020");
        invoiceDomain.setEtd(DateFormat.getDateInstance().parse("2014/04/26"));
        invoiceDomain.setForwarderCompCd("0000000020");
        invoiceDomain.setInvoiceIssueDt(DateFormat.getDateInstance().parse("2014/04/26"));
        invoiceDomain.setShippingFirmNo("1");
        invoiceDomain.setLocale(new Locale("en"));
        
        List<UserAuthDomain> List = new ArrayList<UserAuthDomain>();
        UserAuthDomain Domain = new UserAuthDomain();
        Domain.setAuthMgtComp("1");
        List.add(Domain);
        
        // ページ情報Creator(モック用にinstanceのみ)
        invoiceDomain.setScreenId(SCREEN_ID_W9018);
        invoiceDomain.setLanguageCd("ja");
        PageInfoCreator page = new ActionPageInfoCreator(null, null, null);
        invoiceDomain.setPageInfoCreator(page);
        
        // 検索
        MockObjectManager.addReturnValue(W6001DocDaoImpl.class, "searchCountTtInvoice", 1);
        MockObjectManager.addReturnValue(UserAuthServiceImpl.class, "getUserAuthList", List);
        PageInfoData pageInfoData = new PageInfoData();
        pageInfoData.setFromCount(1);
        pageInfoData.setToCount(5);
        
        List<W6001DocInvoiceDomain> resultList = new ArrayList<W6001DocInvoiceDomain>();
        W6001DocInvoiceDomain Domain2 = new W6001DocInvoiceDomain();
        Domain2.setCancelTyp("Y");
        resultList.add(Domain2);
        
        MockObjectManager.setReturnValueAtAllTimes(ActionPageInfoCreator.class, "createPageInfoData", pageInfoData);
        MockObjectManager.setReturnValueAtAllTimes(W6001DocDaoImpl.class, "searchForPagingTtInvoice", resultList);
        List<? extends W6001DocInvoiceDomain> result = w6001DocService.searchForPagingOnMainSearch(invoiceDomain);
        if (result == null) {;}
    }
    
    /**
     * 正常ケース
     * 
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testSearchOnUploadInit001() throws Exception  {
        // 検索条件
        W6001DocCriteriaDomain invoiceDomain = new W6001DocCriteriaDomain();
        invoiceDomain.setInvoiceNo("2");
        invoiceDomain.setParInvoiceNo("1");
        
        W6001DocInvoiceDomain docInvoiceDomain = new W6001DocInvoiceDomain(); 
        docInvoiceDomain.setCancelFlg("1");
        docInvoiceDomain.setCntryCd("1");
        
        TtInvoiceDomain ttInvoiceDomain = new TtInvoiceDomain();
        ttInvoiceDomain.setCancelFlg("1");
        
        List<TmNxsCompDomain> List = new ArrayList<TmNxsCompDomain>();
        TmNxsCompDomain Domain = new TmNxsCompDomain();
        Domain.setCntryCd("1");
        List.add(Domain);
        
        MockObjectManager.setReturnValueAtAllTimes(W6001DocDaoImpl.class, "searchTtInvoiceByUploadInit", docInvoiceDomain);
        MockObjectManager.setReturnValueAtAllTimes(TtInvoiceServiceImpl.class, "searchByKey", ttInvoiceDomain);
        MockObjectManager.setReturnValueAtAllTimes(TmNxsCompServiceImpl.class, "searchCount", 1);
        MockObjectManager.setReturnValueAtAllTimes(TmNxsCompServiceImpl.class, "searchByCondition", List);
        W6001DocInvoiceDomain result = w6001DocService.searchOnUploadInit(invoiceDomain);
        if (result == null) {;}
    }
    
    /**
     * 正常ケース
     * 
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testvalidateConsistencyFileExists() throws Exception {

        boolean result;
        
        result = w6001DocService.validateConsistencyFileExists(0);
        assertTrue(!result);
        result = w6001DocService.validateConsistencyFileExists(1);
        assertTrue(result);
    }
    
    /**
     * 正常ケース
     * 
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testvalidateConsistencyFileSize() throws Exception {

        boolean result;
        
        result = w6001DocService.validateConsistencyFileSize(0);
        assertTrue(result);
        result = w6001DocService.validateConsistencyFileSize(1024 * 1024 * 5);
        assertTrue(result);
        result = w6001DocService.validateConsistencyFileSize(1024 * 1024 * 5 + 1);
        assertTrue(!result);
    }
    
    /**
     * 正常ケース
     * 
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testValidateCorrelationDate_1() throws Exception  {
        boolean rt = w6001DocService.validateCorrelationDate("2014/03/01", "2014/03/30", "yyyy/MM/dd");
        assertTrue(rt);
        
        String dateFormat = "dd/MM/yy";
        
        // 結果取得用ドメイン
        boolean result;
        
        // 開始日 == null、終了日 == null
        result = w6001DocService.validateCorrelationDate(null, null, dateFormat);
        assertThat(result, is(true));
        
        // 開始日 == null、終了日 != null
        result = w6001DocService.validateCorrelationDate(null, "06/03/14", dateFormat);
        assertThat(result, is(true));
        
        // 開始日 != null、終了日 == null
        result = w6001DocService.validateCorrelationDate("06/03/14", null, dateFormat);
        assertThat(result, is(true));
        
        // 開始日 < 終了日
        result = w6001DocService.validateCorrelationDate("06/03/14", "13/03/14", dateFormat);
        assertThat(result, is(true));
        
        // 開始日 = 終了日
        result = w6001DocService.validateCorrelationDate("06/03/14", "06/03/14", dateFormat);
        assertThat(result, is(true));
        
        // 終了日 < 開始日
        result = w6001DocService.validateCorrelationDate("13/03/14", "06/03/14", dateFormat);
        assertThat(result, is(false));
    }
    
    /**
     * 正常ケース
     * 
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testValidateConsistencyFrtShipper001() throws Exception  {
        
        // 結果取得用ドメイン
        boolean result;
        
        // 開始日 == null、終了日 == null
        result = w6001DocService.validateConsistencyFrtShipper("1", "0");
        assertThat(result, is(true));
        
        // 開始日 == null、終了日 != null
        result = w6001DocService.validateConsistencyFrtShipper("", "1");
        assertThat(result, is(false));
    }
    
    /**
     * 正常ケース
     * 
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testValidateConsistencyRemittance001() throws Exception  {
        
        // 結果取得用ドメイン
        boolean result;
        
        // 開始日 == null、終了日 == null
        result = w6001DocService.validateConsistencyRemittance("1", "1");
        assertThat(result, is(true));
        
        // 開始日 == null、終了日 != null
        result = w6001DocService.validateConsistencyRemittance("", "R");
        assertThat(result, is(false));
    }
    
    /**
     * 正常ケース
     * 
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testValidateConsistencyLc001() throws Exception  {
        
        // 結果取得用ドメイン
        boolean result;
        
        // 開始日 == null、終了日 == null
        result = w6001DocService.validateConsistencyLc("1", "1");
        assertThat(result, is(true));
        
        // 開始日 == null、終了日 != null
        result = w6001DocService.validateConsistencyLc("", "L");
        assertThat(result, is(false));
    }
    
    /**
     * 正常ケース
     * 
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testValidateConsistencyAmountMaximum001() throws Exception  {
        
        // 結果取得用ドメイン
        boolean result;
        
        result = w6001DocService.validateConsistencyAmountMaximum(new BigDecimal(10), new BigDecimal(1));
        result = w6001DocService.validateConsistencyAmountMaximum(new BigDecimal("1.11"), new BigDecimal("10.1"));
        result = w6001DocService.validateConsistencyAmountMaximum(new BigDecimal(1), new BigDecimal(10));
        if (result) {;}
    }
    
    /**
     * 正常ケース
     * 
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testValidateDatabaseTtInvoiceOnMainUploadFrtInv001() throws Exception  {
        // 検索条件
        String shipperCd = "1";
        String invoiceNo = "1";
        Date invoiceIssueDt = DateFormat.getDateInstance().parse("1899/12/30");
        
        // 検索
        String result = w6001DocService.validateDatabaseTtInvoiceOnMainUploadFrtInv(shipperCd, invoiceNo, invoiceIssueDt);
        assertNull(result);

        // 検索条件
        shipperCd = "1";
        invoiceNo = "1";
        invoiceIssueDt = DateFormat.getDateInstance().parse("2014/02/07");
        
        // 検索
        result = w6001DocService.validateDatabaseTtInvoiceOnMainUploadFrtInv(shipperCd, invoiceNo, invoiceIssueDt);
        assertThat(result, is("NXS-E1-0037"));
        
        // 検索条件
        shipperCd = "1";
        invoiceNo = "1";
        invoiceIssueDt = DateFormat.getDateInstance().parse("2014/02/08");
        
        // 検索
        result = w6001DocService.validateDatabaseTtInvoiceOnMainUploadFrtInv(shipperCd, invoiceNo, invoiceIssueDt);
        assertThat(result, is("NXS-E7-0062"));
        
        // 検索条件
        shipperCd = "1";
        invoiceNo = "1";
        invoiceIssueDt = DateFormat.getDateInstance().parse("2014/02/09");
        
        // 検索
        result = w6001DocService.validateDatabaseTtInvoiceOnMainUploadFrtInv(shipperCd, invoiceNo, invoiceIssueDt);
        assertThat(result, is("NXS-E7-0063"));
    }
    
    /**
     * 正常ケース
     * 
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testValidateDatabaseTtInvoiceOnMainUploadNonDnGInvOrReInv001() throws Exception  {

        String shipperCd = "2";
        String invoiceNo = "2";
        Date invoiceIssueDt = DateFormat.getDateInstance().parse("1899/12/30");
        String[] manualTyp = {"", "", ""};
        String result = "";

        W6001DocInvoiceDomain resultDoc = new W6001DocInvoiceDomain();

        resultDoc.setCancelTyp("Y");
        MockObjectManager.addReturnValue(W6001DocDaoImpl.class, "searchTtInvoiceByNonDnGInvOrReInv", resultDoc);
        result = w6001DocService.validateDatabaseTtInvoiceOnMainUploadNonDnGInvOrReInv(shipperCd, invoiceNo, invoiceIssueDt, manualTyp);

        resultDoc.setCancelTyp("N");
        resultDoc.setCancelFlg("Y");
        resultDoc.setManualFlg("Y");
        resultDoc.setManualTyp("1");
        MockObjectManager.addReturnValue(W6001DocDaoImpl.class, "searchTtInvoiceByNonDnGInvOrReInv", resultDoc);
        result = w6001DocService.validateDatabaseTtInvoiceOnMainUploadNonDnGInvOrReInv(shipperCd, invoiceNo, invoiceIssueDt, manualTyp);
        
        resultDoc.setCancelFlg("Y");
        resultDoc.setManualFlg("Y");
        resultDoc.setManualTyp("2");
        MockObjectManager.addReturnValue(W6001DocDaoImpl.class, "searchTtInvoiceByNonDnGInvOrReInv", resultDoc);
        result = w6001DocService.validateDatabaseTtInvoiceOnMainUploadNonDnGInvOrReInv(shipperCd, invoiceNo, invoiceIssueDt, manualTyp);
        
        resultDoc.setCancelFlg("N");
        resultDoc.setManualFlg("N");
        resultDoc.setDnBaseFlg("N");
        MockObjectManager.addReturnValue(W6001DocDaoImpl.class, "searchTtInvoiceByNonDnGInvOrReInv", resultDoc);
        result = w6001DocService.validateDatabaseTtInvoiceOnMainUploadNonDnGInvOrReInv(shipperCd, invoiceNo, invoiceIssueDt, manualTyp);

        resultDoc.setShippingActNo("TEST");
        MockObjectManager.addReturnValue(W6001DocDaoImpl.class, "searchTtInvoiceByNonDnGInvOrReInv", resultDoc);
        result = w6001DocService.validateDatabaseTtInvoiceOnMainUploadNonDnGInvOrReInv(shipperCd, invoiceNo, invoiceIssueDt, manualTyp);
        
        if (result == null) {;}

    }
    
    /**
     * 正常ケース
     * 
     * @throws Exception 例外発生した場合
     */
    @Test
    public void testValidateDatabaseCarrier001() throws Exception {
        String compCd = "1";
        
        MockObjectManager.setReturnValueAtAllTimes(CommonServiceImpl.class, "validateCarrier", true);
        boolean result = w6001DocService.validateDatabaseCarrier(compCd);
        assertThat(result, is(true));
        
        MockObjectManager.setReturnValueAtAllTimes(CommonServiceImpl.class, "validateCarrier", false);
        result = w6001DocService.validateDatabaseCarrier(compCd);
        assertThat(result, is(false));
    }
      
    /**
     * 正常ケース
     * 
     * @throws Exception 例外発生した場合
     */
    @Test
    public void testValidateDatabaseCompCd001() throws Exception {
        String compCd = "1";
        
        MockObjectManager.setReturnValueAtAllTimes(CommonServiceImpl.class, "validateCompCd", true);
        boolean result = w6001DocService.validateDatabaseCompCd(compCd);
        assertThat(result, is(true));
        
        MockObjectManager.setReturnValueAtAllTimes(CommonServiceImpl.class, "validateCompCd", false);
        result = w6001DocService.validateDatabaseCompCd(compCd);
        assertThat(result, is(false));
    }
      
    /**
     * 正常ケース
     * 
     * @throws Exception 例外発生した場合
     */
    @Test
    public void testValidateDatabasePort001() throws Exception {
        String portCd = "1";
        
        MockObjectManager.setReturnValueAtAllTimes(CommonServiceImpl.class, "validatePort", true);
        boolean result = w6001DocService.validateDatabasePort(portCd, "");
        assertThat(result, is(true));
        
        MockObjectManager.setReturnValueAtAllTimes(CommonServiceImpl.class, "validatePort", false);
        result = w6001DocService.validateDatabasePort(portCd, "");
        assertThat(result, is(false));
    }

    /**
     * 正常ケース
     * 
     * @throws Exception 例外発生した場合
     */
    @Test
    public void testValidateConsistencyCancelInvoiceNo001() throws Exception {
        String invNo = "1";
        String orgInvNo = "1";
        
        boolean result = w6001DocService.validateConsistencyCancelInvoiceNo(invNo, orgInvNo);
        assertThat(result, is(false));
        
        invNo = "2";
        orgInvNo = "1";
        
        result = w6001DocService.validateConsistencyCancelInvoiceNo(invNo, orgInvNo);
        assertThat(result, is(true));
    }
    
    /**
     * 正常ケース
     * 
     * @throws Exception 例外発生した場合
     */
    @Test
    public void testValidateConsistencyReferenceInvNoReferenceInvShipper001() throws Exception {
        String referenceInvNo = "1";
        String referenceInvShipper = "1";
        String invoiceNo = "1";
        String shipper = "1";
        
        boolean result = w6001DocService.validateConsistencyReferenceInvNoReferenceInvShipper(referenceInvNo, referenceInvShipper, invoiceNo , shipper);
        assertThat(result, is(false));
        
        referenceInvNo = "1";
        referenceInvShipper = "2";
        invoiceNo = "3";
        shipper = "4";
        
        result = w6001DocService.validateConsistencyReferenceInvNoReferenceInvShipper(referenceInvNo, referenceInvShipper, invoiceNo , shipper);
        assertThat(result, is(true));
    }
    
    /**
     * 正常ケース
     * 
     * @throws Exception 例外発生した場合
     */
    @Test
    public void testValidateConsistencyCompulsory001() throws Exception {
        String value = "1";
        
        boolean result = w6001DocService.validateConsistencyCompulsory(value);
        assertThat(result, is(true));
        
        value = null;
        
        result = w6001DocService.validateConsistencyCompulsory(null);
        assertThat(result, is(false));
        
        value = "";
        
        result = w6001DocService.validateConsistencyCompulsory(value);
        assertThat(result, is(false));
    }
    
    /**
     * 正常ケース
     * 
     * @throws Exception 例外発生した場合
     */
    @Test
    public void testValidateConsistencyFunctionNoClassOfInv001() throws Exception {
        String clsOfInv = "F";
        
        boolean result = w6001DocService.validateConsistencyFunctionNoClassOfInv(clsOfInv);
        assertThat(result, is(false));
        
        clsOfInv = "N";
        
        result = w6001DocService.validateConsistencyFunctionNoClassOfInv(clsOfInv);
        assertThat(result, is(true));
    }
    
    /**
     * 正常ケース
     * 
     * @throws Exception 例外発生した場合
     */
    @Test
    public void testValidateDatabaseTtInvoiceOnUploadRegisterByCancel001() throws Exception {
        String shipperCd = "1";
        String invoiceNo = "1";
        Date invoiceIssueDt = DateFormat.getDateInstance().parse("2013/01/01");
        String functionNo = "1";
        
        boolean result = w6001DocService.validateDatabaseTtInvoiceOnUploadRegisterByCancel(shipperCd, invoiceNo, invoiceIssueDt, functionNo);
        assertThat(result, is(true));
        
        shipperCd = "1";
        invoiceNo = "1";
        invoiceIssueDt = DateFormat.getDateInstance().parse("2013/01/01");
        functionNo = "5";
        
        result = w6001DocService.validateDatabaseTtInvoiceOnUploadRegisterByCancel(shipperCd, invoiceNo, invoiceIssueDt, functionNo);
        assertThat(result, is(true));
        
        shipperCd = "1";
        invoiceNo = "1";
        invoiceIssueDt = DateFormat.getDateInstance().parse("2013/01/01");
        functionNo = "4";
        
        result = w6001DocService.validateDatabaseTtInvoiceOnUploadRegisterByCancel(shipperCd, invoiceNo, invoiceIssueDt, functionNo);
        assertThat(result, is(true));
    }
    
    /**
     * 正常ケース
     * 
     * @throws Exception 例外発生した場合
     */
    @Test
    public void testValidateDatabaseTtInvoiceOnUploadRegisterByDuplication001() throws Exception {
        String shipperCd = "1";
        String invoiceNo = "1";
        Date invoiceIssueDt = DateFormat.getDateInstance().parse("2013/01/01");
        
        boolean result = w6001DocService.validateDatabaseTtInvoiceOnUploadRegisterByDuplication(shipperCd, invoiceNo, invoiceIssueDt);
        assertThat(result, is(true));
    }
    
    /**
     * 正常ケース
     * 
     * @throws Exception 例外発生した場合
     */
    @Test
    public void testValidateDatabaseTtInvoiceOnUploadRegisterByExistence001() throws Exception {
        String shipperCd = "1";
        String invoiceNo = "1";
        Date invoiceIssueDt = DateFormat.getDateInstance().parse("2013/01/01");
        
        boolean result = w6001DocService.validateDatabaseTtInvoiceOnUploadRegisterByExistence(shipperCd, invoiceNo, invoiceIssueDt);
        assertThat(result, is(false));
        
        shipperCd = "MAC";
        invoiceNo = "W6001001";
        invoiceIssueDt = DateFormat.getDateInstance().parse("2014/01/01");
        
        result = w6001DocService.validateDatabaseTtInvoiceOnUploadRegisterByExistence(shipperCd, invoiceNo, invoiceIssueDt);
        assertThat(result, is(true));
    }
    
    /**
     * 正常ケース
     * 
     * @throws Exception 例外発生した場合
     */
    @Test
    public void testValidateDatabaseTtInvoiceOnUploadRegisterByStatus001() throws Exception {
        String shipperCd = "MYI";
        String invoiceNo = "W600200031";
        Date invoiceIssueDt = DateFormat.getDateInstance().parse("2014/04/20");
        
        boolean result = w6001DocService.validateDatabaseTtInvoiceOnUploadRegisterByStatus(shipperCd, invoiceNo, invoiceIssueDt);
        assertThat(result, is(false));
        
        shipperCd = "MAE";
        invoiceNo = "W6009033custA";
        invoiceIssueDt = DateFormat.getDateInstance().parse("2014/04/16");
        
        result = w6001DocService.validateDatabaseTtInvoiceOnUploadRegisterByStatus(shipperCd, invoiceNo, invoiceIssueDt);
        assertThat(result, is(true));
        
        shipperCd = "MAE";
        invoiceNo = "W6009039nonTmpStok";
        invoiceIssueDt = DateFormat.getDateInstance().parse("2014/04/22");
        
        MockObjectManager.setReturnValueAtAllTimes(W6001DocInvoiceDomain.class, "getCountMainMark", 0);
        result = w6001DocService.validateDatabaseTtInvoiceOnUploadRegisterByStatus(shipperCd, invoiceNo, invoiceIssueDt);
        assertThat(result, is(true));
        
        shipperCd = "MAE";
        invoiceNo = "W6009039nonTmpStok";
        invoiceIssueDt = DateFormat.getDateInstance().parse("2014/04/22");
        
        MockObjectManager.setReturnValueAtAllTimes(W6001DocInvoiceDomain.class, "getCustomTimingTyp", "B");
        MockObjectManager.setReturnValueAtAllTimes(W6001DocInvoiceDomain.class, "getPltzStatus", "60");
        MockObjectManager.setReturnValueAtAllTimes(W6001DocInvoiceDomain.class, "getCountMainMark", 1);
        result = w6001DocService.validateDatabaseTtInvoiceOnUploadRegisterByStatus(shipperCd, invoiceNo, invoiceIssueDt);
        assertThat(result, is(true));
        
        MockObjectManager.setReturnValueAtAllTimes(W6001DocInvoiceDomain.class, "getCustomTimingTyp", "B");
        MockObjectManager.setReturnValueAtAllTimes(W6001DocInvoiceDomain.class, "getPltzStatus", "50");
        MockObjectManager.setReturnValueAtAllTimes(W6001DocInvoiceDomain.class, "getCountMainMark", 0);
        result = w6001DocService.validateDatabaseTtInvoiceOnUploadRegisterByStatus(shipperCd, invoiceNo, invoiceIssueDt);
        assertThat(result, is(true));
        
        MockObjectManager.setReturnValueAtAllTimes(W6001DocInvoiceDomain.class, "getCustomTimingTyp", "Z");
        MockObjectManager.setReturnValueAtAllTimes(W6001DocInvoiceDomain.class, "getPltzStatus", "40");
        MockObjectManager.setReturnValueAtAllTimes(W6001DocInvoiceDomain.class, "getCountMainMark", 1);
        result = w6001DocService.validateDatabaseTtInvoiceOnUploadRegisterByStatus(shipperCd, invoiceNo, invoiceIssueDt);
        assertThat(result, is(true));
        
        MockObjectManager.setReturnValueAtAllTimes(W6001DocInvoiceDomain.class, "getCustomTimingTyp", "Z");
        MockObjectManager.setReturnValueAtAllTimes(W6001DocInvoiceDomain.class, "getPltzStatus", "30");
        MockObjectManager.setReturnValueAtAllTimes(W6001DocInvoiceDomain.class, "getCountMainMark", 0);
        result = w6001DocService.validateDatabaseTtInvoiceOnUploadRegisterByStatus(shipperCd, invoiceNo, invoiceIssueDt);
        assertThat(result, is(true));
    }
    
    /**
     * 正常ケース
     * 
     * @throws Exception 例外発生した場合
     */
    @Test
    public void testValidateConsistencyShipperPlantAuth001() throws Exception {
        String permitFuncId = "1";
        String compCd = "1";
        String plntCd = "1";
        
        MockObjectManager.setReturnValueAtAllTimes(UserAuthServiceImpl.class, "hasUserAuthForComp", true);
        boolean result = w6001DocService.validateConsistencyShipperPlantAuth(permitFuncId, compCd, plntCd);
        assertThat(result, is(true));
        
        MockObjectManager.setReturnValueAtAllTimes(UserAuthServiceImpl.class, "hasUserAuthForComp", false);
        result = w6001DocService.validateConsistencyShipperPlantAuth(permitFuncId, compCd, plntCd);
        assertThat(result, is(false));
    }
    
    /**
     * 正常ケース
     * 
     * @throws Exception 例外発生した場合
     */
    @Test
    public void testValidate001() throws Exception {
        String compCd = "1";
        String whCd = "1";
        
        MockObjectManager.setReturnValueAtAllTimes(CommonServiceImpl.class, "validateCompWh", true);
        boolean result = w6001DocService.validateDatabaseCompWh(compCd, whCd);
        assertThat(result, is(true));
        
        MockObjectManager.setReturnValueAtAllTimes(CommonServiceImpl.class, "validateCompWh", false);
        result = w6001DocService.validateDatabaseCompWh(compCd, whCd);
        assertThat(result, is(false));
    }
    
    /**
     * 正常ケース
     * 
     * @throws Exception 例外発生した場合
     */
    @Test
    public void testValidateDatabaseTwInvPltzOnCreateUpdateByCk001() throws Exception {
        
        String dscId = "maeTest01";
        
        boolean result = w6001DocService.validateDatabaseTwInvPltzOnCreateUpdateByCk(dscId);
        assertThat(result, is(false));
        
        // 絶対合致しないキーを設定
        dscId = "@NoDat";
        
        result = w6001DocService.validateDatabaseTwInvPltzOnCreateUpdateByCk(dscId);
        assertThat(result, is(true));
    }
    
    /**
     * 正常ケース
     * 
     * @throws Exception 例外発生した場合
     */
    @Test
    public void testValidateDatabaseTwInvPltzOnCreateUpdateByMaxMainMark001() throws Exception {
        
        String dscId = "maeTest01";
        
        int countMainMark = 1;
        boolean result = w6001DocService.validateDatabaseTwInvPltzOnCreateUpdateByMaxMainMark(dscId, countMainMark);
        assertThat(result, is(true));
        
        countMainMark = 9998;
        result = w6001DocService.validateDatabaseTwInvPltzOnCreateUpdateByMaxMainMark(dscId, countMainMark);
        assertThat(result, is(false));
    }
    
    /**
     * 正常ケース
     * 
     * @throws Exception 例外発生した場合
     */
    @Test
    public void testValidateDatabaseTwInvPltzOnCreateUpdateByContSortKey001() throws Exception {
        
        String dscId = "maeTest01";
        
        String containerSortingKey = "1";
        boolean result = w6001DocService.validateDatabaseTwInvPltzOnCreateUpdateByContSortKey(dscId, containerSortingKey);
        assertThat(result, is(true));
        
        containerSortingKey = "10";
        result = w6001DocService.validateDatabaseTwInvPltzOnCreateUpdateByContSortKey(dscId, containerSortingKey);
        assertThat(result, is(false));
    }
    
    /**
     * 正常ケース
     * 
     * @throws Exception 例外発生した場合
     */
    @Test
    public void testValidateDatabaseTwInvPltzOnCreateUpdateByExistence001() throws Exception {
        
        String dscId = "maeTest01";
        boolean result = w6001DocService.validateDatabaseTwInvPltzOnCreateUpdateByExistence(dscId);
        assertThat(result, is(true));
        
        // 絶対合致しないキーを設定
        dscId = "@NoDat";
        result = w6001DocService.validateDatabaseTwInvPltzOnCreateUpdateByExistence(dscId);
        assertThat(result, is(false));
    }
    
    /**
     * 正常ケース
     * 
     * @throws Exception 例外発生した場合
     */
    @Test
    public void testValidateConsistencyEtdAfterDate001() throws Exception {
        String date = "1";
        String dateFormat = "1";
        String compCd = "1";
        
        MockObjectManager.setReturnValueAtAllTimes(CommonServiceImpl.class, "validateAfterDateComp", true);
        boolean result = w6001DocService.validateConsistencyEtdAfterDate(date, dateFormat, compCd);
        assertThat(result, is(true));
        
        MockObjectManager.setReturnValueAtAllTimes(CommonServiceImpl.class, "validateAfterDateComp", false);
        result = w6001DocService.validateConsistencyEtdAfterDate(date, dateFormat, compCd);
        assertThat(result, is(false));
    }
    
    /**
     * 正常ケース
     * 
     * @throws Exception 例外発生した場合
     */
    @Test
    public void testValidateConsistencyEtdEda001() throws Exception {
        String etd = "2014/04/01";
        String eta = "2014/04/20";
        String dateFormat = "yyyy/mm/dd";
        
        boolean result = w6001DocService.validateConsistencyEtdEda(etd, eta, dateFormat);
        assertThat(result, is(false));
        
        etd = "2014/04/20";
        eta = "2014/04/01";
        dateFormat = "yyyy/mm/dd";
        
        result = w6001DocService.validateConsistencyEtdEda(etd, eta, dateFormat);
        assertThat(result, is(true));
        
        etd = "2014/04/01";
        eta = "2014/0420";
        dateFormat = "yyyy/mm/dd";
        
        result = w6001DocService.validateConsistencyEtdEda(etd, eta, dateFormat);
        assertThat(result, is(false));
    }
    
    /**
     * 正常ケース
     * 
     * @throws Exception 例外発生した場合
     */
    @Test
    public void testValidateDatabaseTwInvItemOnInvGroupSearch001() throws Exception {
        
        String dscId = "maeTest01";
        String shipperCd = "MAT01";
        boolean result = w6001DocService.validateDatabaseTwInvItemOnInvGroupSearch(dscId, shipperCd);
        assertThat(result, is(false));
        
        dscId = "NoData";
        shipperCd = "***";
        result = w6001DocService.validateDatabaseTwInvItemOnInvGroupSearch(dscId, shipperCd);
        assertThat(result, is(true));
    }
    
    /**
     * 正常ケース
     * 
     * @throws Exception 例外発生した場合
     */
    @Test
    public void testValidateDatabaseCigmaAds001() throws Exception {
        String compCd = "TEST";
        Date dateShipped = DateFormat.getDateInstance().parse("2013/01/01");
        
        boolean resultAd = w6001DocService.validateDatabaseCigmaAds(compCd, dateShipped);

        compCd = "MYE";
        MockObjectManager.setReturnValueAtAllTimes(CommonServiceImpl.class, "searchCigmaAds", DateFormat.getDateInstance().parse("2013/01/01"));
        boolean result = w6001DocService.validateDatabaseCigmaAds(compCd, dateShipped);
        assertThat(result, is(true));
        
        dateShipped = DateFormat.getDateInstance().parse("2013/06/01");
        
        MockObjectManager.setReturnValueAtAllTimes(CommonServiceImpl.class, "searchCigmaAds", DateFormat.getDateInstance().parse("2013/01/01"));
        result = w6001DocService.validateDatabaseCigmaAds(compCd, dateShipped);
        assertThat(result, is(false));
        
        dateShipped = DateFormat.getDateInstance().parse("2012/10/01");
        
        MockObjectManager.setReturnValueAtAllTimes(CommonServiceImpl.class, "searchCigmaAds", DateFormat.getDateInstance().parse("2013/01/01"));
        result = w6001DocService.validateDatabaseCigmaAds(compCd, dateShipped);
        assertThat(result, is(false));
        
        if (resultAd) {;}

    }
    
    /**
     * 正常ケース
     * 
     * @throws Exception 例外発生した場合
     */
    @Test
    public void testValidateConsistencyHsCodeWarningIgnoreWarnings001() throws Exception {
        String hsCdWarnig = "Y";
        String ignoreWarning = "off";
        
        boolean result = w6001DocService.validateConsistencyHsCodeWarningIgnoreWarnings(hsCdWarnig, ignoreWarning);
        assertThat(result, is(false));
        
        hsCdWarnig = "N";
        ignoreWarning = "on";
        
        result = w6001DocService.validateConsistencyHsCodeWarningIgnoreWarnings(hsCdWarnig, ignoreWarning);
        assertThat(result, is(true));
        
    }
    
    /**
     * 正常ケース
     * 
     * @throws Exception 例外発生した場合
     */
    @Test
    public void testValidateConsistencyRefreshed001() throws Exception {
        Date dateSkipped = DateFormat.getDateInstance().parse("2013/01/01");
        Date hiddenDateSkipped = DateFormat.getDateInstance().parse("2013/01/01");
        boolean refreshFlg = false;
        
        boolean result = w6001DocService.validateConsistencyRefreshed(dateSkipped, hiddenDateSkipped, refreshFlg);
        assertThat(result, is(true));
        
        dateSkipped = DateFormat.getDateInstance().parse("2013/04/01");
        hiddenDateSkipped = DateFormat.getDateInstance().parse("2013/01/01");
        refreshFlg = true;
        
        result = w6001DocService.validateConsistencyRefreshed(dateSkipped, hiddenDateSkipped, refreshFlg);
        assertThat(result, is(false));
        
    }
    
    /**
     * 正常ケース
     * 
     * @throws Exception 例外発生した場合
     */
    @Test
    public void testValidateConsistencyUnitPriceError001() throws Exception {
        String unitPriceErr = "N";
        
        boolean result = w6001DocService.validateConsistencyUnitPriceError(unitPriceErr);
        assertThat(result, is(true));
        
        unitPriceErr = "Y";
        
        result = w6001DocService.validateConsistencyUnitPriceError(unitPriceErr);
        assertThat(result, is(false));
        
    }
    
    /**
     * 正常ケース
     * 
     * @throws Exception 例外発生した場合
     */
    @Test
    public void testValidateDatabaseTwInvOnDetailFrtMoveToRegister001() throws Exception {
        W6008CriteriaDomain criteria = new W6008CriteriaDomain();
        
        criteria.setLoginUserDscId("srawf09");
        criteria.setShipperCd("MAF");
        criteria.setGrpNo1("1");
        
        boolean result = w6001DocService.validateDatabaseTwInvOnDetailFrtMoveToRegister(criteria);
        assertThat(result, is(true));
        
        criteria.setLoginUserDscId("srawf07");
        criteria.setShipperCd("MAF");
        criteria.setGrpNo1("1");
        
        result = w6001DocService.validateDatabaseTwInvOnDetailFrtMoveToRegister(criteria);
        assertThat(result, is(false));
        
    }
    
    /**
     * 正常ケース
     * 
     * @throws Exception 例外発生した場合
     */
    @Test
    public void testValidateConsistencyRelation001() throws Exception {
        BigDecimal value = new BigDecimal("10");
        int digit = 1;
        
        boolean result = w6001DocService.validateConsistencyRelation(value, digit);
        assertThat(result, is(true));
        
    }
    
    /**
     * 正常ケース
     * 
     * @throws Exception 例外発生した場合
     */
    @Test
    public void testValidateConsistencyFreeAdditionalFreeAdditionalNameOver001() throws Exception {
        
        BigDecimal freeAdd = new BigDecimal("0");
        String freeAddNm = "";
        boolean result;
        
        result = w6001DocService.validateConsistencyFreeAdditionalFreeAdditionalNameOver(freeAdd, freeAddNm);
        assertThat(result, is(true));
        
        freeAdd = new BigDecimal("1");
        result = w6001DocService.validateConsistencyFreeAdditionalFreeAdditionalNameOver(freeAdd, freeAddNm);
        assertThat(result, is(false));
        
    }
    
    /**
     * 正常ケース
     * 
     * @throws Exception 例外発生した場合
     */
    @Test
    public void testValidateConsistencyFreeAdditionalFreeAdditionalNameZero001() throws Exception {
        BigDecimal freeAdd = new BigDecimal("1");
        String freeAddNm = "1";
        
        boolean result = w6001DocService.validateConsistencyFreeAdditionalFreeAdditionalNameZero(freeAdd, freeAddNm);
        assertThat(result, is(true));
        
        freeAdd = new BigDecimal("0");
        freeAddNm = "1";
        
        result = w6001DocService.validateConsistencyFreeAdditionalFreeAdditionalNameZero(freeAdd, freeAddNm);
        assertThat(result, is(false));
    }
    
    /**
     * 正常ケース
     * 
     * @throws Exception 例外発生した場合
     */
    @Test
    public void testValidateConsistencyDigit001() throws Exception {
        BigDecimal curr = new BigDecimal("10");
        int digit = 1;
        
        boolean result = w6001DocService.validateConsistencyDigit(curr, digit);
        assertThat(result, is(true));
    }
    
    /**
     * 正常ケース
     * 
     * @throws Exception 例外発生した場合
     */
    @Test
    public void testValidateDatabaseCigmaAvailable001() throws Exception {
        String compCd = "1";
        String CmlType = "2";
        
        String result = w6001DocService.validateDatabaseCigmaAvailable(compCd, CmlType);
        assertThat(result, is("NXS-E1-0060"));
        
        CmlType = "1";
        
        MockObjectManager.setReturnValueAtAllTimes(CommonServiceImpl.class, "searchCigmaAvailable", true);
        result = w6001DocService.validateDatabaseCigmaAvailable(compCd, CmlType);
        assertThat(result, is("NXS-E7-0075"));
        
        MockObjectManager.setReturnValueAtAllTimes(CommonServiceImpl.class, "searchCigmaAvailable", false);
        result = w6001DocService.validateDatabaseCigmaAvailable(compCd, CmlType);
        assertThat(result, is("NXS-E1-0060"));
    }
    
    /**
     * 正常ケース
     * 
     * @throws Exception 例外発生した場合
     */
    @Test
    public void testValidateDatabaseCigmaAvailable002() throws Exception {

        String result = w6001DocService.validateDatabaseCigmaAvailable("TEST", "TEST", null);

        MockObjectManager.setReturnValueAtAllTimes(W6001DocDaoImpl.class, "searchTwInvPltzByCigmaCheck", 1);
        result = w6001DocService.validateDatabaseCigmaAvailable("TEST", "TEST", null);
        
        if (null == result) {;}
    }
    
    /**
     * 正常ケース
     * 
     * @throws Exception 例外発生した場合
     */
    @Test
    public void testValidateConsistencyNotifyPartyNameNotifyPartyAddress001() throws Exception {
        String notifyPatyNm = "";
        String notifyPatyAdd = "2";
        boolean selectFlg = false;
        
        boolean result = w6001DocService.validateConsistencyNotifyPartyNameNotifyPartyAddress(notifyPatyNm, notifyPatyAdd, selectFlg);
        assertThat(result, is(false));
        
        notifyPatyNm = "";
        notifyPatyAdd = "";
        
        result = w6001DocService.validateConsistencyNotifyPartyNameNotifyPartyAddress(notifyPatyNm, notifyPatyAdd, selectFlg);
        assertThat(result, is(true));
    }
    
    /**
     * 正常ケース
     * 
     * @throws Exception 例外発生した場合
     */
    @Test
    public void testValidateConsistencySpecialInformation001() throws Exception {
        String spInfo = "aaaaa";
        Integer lineMax = 10;
        Integer rowMax = 10;
        
        boolean result = w6001DocService.validateConsistencySpecialInformation(spInfo, lineMax, rowMax);
        assertThat(result, is(true));
        
        lineMax = 2;
        rowMax = 10;
        
        result = w6001DocService.validateConsistencySpecialInformation(spInfo, lineMax, rowMax);
        assertThat(result, is(false));
        
        lineMax = 10;
        rowMax = 0;
        
        result = w6001DocService.validateConsistencySpecialInformation(spInfo, lineMax, rowMax);
        assertThat(result, is(false));
    }
    
    /**
     * 正常ケース
     * 
     * @throws Exception 例外発生した場合
     */
    @Test
    public void testValidateDatabaseTtInvoiceOnRegisterCancel001() throws Exception {
        String shipperCd = "MYE";
        String invoiceNo = "W6001Max086";
        Date invoiceIssueDt = DateFormat.getDateInstance().parse("2014/06/12");
        
        String result = w6001DocService.validateDatabaseTtInvoiceOnRegisterCancel(shipperCd, invoiceNo, invoiceIssueDt);
        assertNull(result);
        
        shipperCd = "MYE";
        invoiceNo = "W6001Max087";
        invoiceIssueDt = DateFormat.getDateInstance().parse("2014/06/13");
        
        result = w6001DocService.validateDatabaseTtInvoiceOnRegisterCancel(shipperCd, invoiceNo, invoiceIssueDt);
        assertThat(result, is("NXS-E7-0062"));
        
        shipperCd = "MYE";
        invoiceNo = "W6001Max088";
        invoiceIssueDt = DateFormat.getDateInstance().parse("2014/06/14");
        
        result = w6001DocService.validateDatabaseTtInvoiceOnRegisterCancel(shipperCd, invoiceNo, invoiceIssueDt);
        assertThat(result, is("NXS-E7-0063"));
    }
    
    /**
     * 正常ケース
     * 
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testSearchOnMainPrintDocument001() throws Exception  {

        // 検索条件
        W6001DocCriteriaDomain invoiceDomain = new W6001DocCriteriaDomain();
        
        invoiceDomain.setShipperCd("MYE");
        invoiceDomain.setInvoiceNo("W6001Max086");
        invoiceDomain.setInvoiceIssueDt(DateFormat.getDateInstance().parse("2014/06/12"));
        try{
            File result = w6001DocService.searchOnMainPrintDocument(invoiceDomain);
            if (result == null) {;}
        }catch (GscmApplicationException e) {
            assertThat(e.getCode(), is("NXS-E7-0064"));
        }
        
        invoiceDomain.setShipperCd("MAE");
        invoiceDomain.setInvoiceNo("W6009B001File");
        invoiceDomain.setInvoiceIssueDt(DateFormat.getDateInstance().parse("2014/04/01"));
        
        File result = w6001DocService.searchOnMainPrintDocument(invoiceDomain);
        
        try{
            MockObjectManager.setReturnValueAtAllTimes(FileManagementServiceImpl.class, "searchFileDownload", new IOException());
            result = w6001DocService.searchOnMainPrintDocument(invoiceDomain);
        }catch (GscmApplicationException e) {
            assertThat(e.getCode(), is("NXS-E7-0064"));
        }
        
        try{
            MockObjectManager.setReturnValueAtAllTimes(FileManagementServiceImpl.class, "searchFileDownload", new UnsupportedEncodingException());
            result = w6001DocService.searchOnMainPrintDocument(invoiceDomain);
        }catch (GscmApplicationException e) {
            assertThat(e.getCode(), is("NXS-E7-0064"));
        }



        W6001DocInvoiceDomain resultDoc = new W6001DocInvoiceDomain();

        resultDoc.setInvoiceHeaderFileId("TEST");
        MockObjectManager.addReturnValue(W6001DocDaoImpl.class, "searchTtInvoiceByFileManager", resultDoc);
        MockObjectManager.setReturnValueAtAllTimes(FileManagementServiceImpl.class, "searchFileDownload", new FileManagementException("TEST"));
        try{
            result = w6001DocService.searchOnMainPrintDocument(invoiceDomain);
        }catch (Exception e) {
        }

        MockObjectManager.setReturnValueAtAllTimes(FileManagementServiceImpl.class, "searchFileDownload", new UnsupportedEncodingException());
        try{
            result = w6001DocService.searchOnMainPrintDocument(invoiceDomain);
        }catch (Exception e) {
        }

        MockObjectManager.setReturnValueAtAllTimes(FileManagementServiceImpl.class, "searchFileDownload", new IOException());
        try{
            result = w6001DocService.searchOnMainPrintDocument(invoiceDomain);
        }catch (Exception e) {
        }
        if (result == null) {;}


    }
    
    /**
     * 正常ケース
     * 
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testCalculateAmount001() throws Exception  {
        // 検索条件
        W6001DocCriteriaDomain invoiceDomain = new W6001DocCriteriaDomain();
        
        invoiceDomain.setNetAmount(new BigDecimal("100"));
        invoiceDomain.setHandlingCharge(new BigDecimal("100"));
        invoiceDomain.setAdditionalCharge(new BigDecimal("100"));
        invoiceDomain.setVatRatio(new BigDecimal("100"));
        invoiceDomain.setFreight(new BigDecimal("100"));
        invoiceDomain.setInsurance(new BigDecimal("100"));
        
        MockObjectManager.addReturnValue(CommonServiceImpl.class, "searchEffectivePrice", new BigDecimal(1));
        W6001DocInvoiceDomain result = w6001DocService.calculateAmount(invoiceDomain);
        
        if (result == null) {;}
        
    }
    
    /**
     * 正常ケース
     * 
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testSearchOnUpdateSkip001() throws Exception  {
        // 検索条件
        W6001DocCriteriaDomain invoiceDomain = new W6001DocCriteriaDomain();
        
        invoiceDomain.setShipperCd("1");
        invoiceDomain.setParInvoiceNo("1");
        
        //List<? extends TtInvoiceDomain> result = w6001DocService.searchOnUpdateSkip(invoiceDomain);
        
        //if (result == null) {;}
    }
    
    /**
     * 正常ケース
     * 
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testUpdateOnShippingInfoInpMoveToInvoiceGrouping001() throws Exception  {
        // 検索条件
        W6001DocCriteriaDomain invoiceDomain = new W6001DocCriteriaDomain();
        
        invoiceDomain.setCarrierCompCd("DNJ");
        invoiceDomain.setLoadingPortCd("BKK");
        invoiceDomain.setDischargePortCd("BKK");
        invoiceDomain.setArrivalTime("25:56");
        
        MockObjectManager.setReturnValueAtAllTimes(TwInvPltzServiceImpl.class, "updateByCondition", 1);

        w6001DocService.updateOnShippingInfoInpMoveToInvoiceGrouping(invoiceDomain);
    }
    
    /**
     * 正常ケース
     * 
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testSearchOnInvGroupInit001() throws Exception  {
        // 検索条件
        W6001DocCriteriaDomain invoiceDomain = new W6001DocCriteriaDomain();
        
        invoiceDomain.setDscId("maeTest01");
        
        invoiceDomain.setCustomTimingTyp("A");
        w6001DocService.searchOnInvGroupInit(invoiceDomain);
        
        invoiceDomain.setDscId("10");
        
        invoiceDomain.setCustomTimingTyp("B");
        w6001DocService.searchOnInvGroupInit(invoiceDomain);
        
        invoiceDomain.setCustomTimingTyp("Z");
        w6001DocService.searchOnInvGroupInit(invoiceDomain);
    }
    
    /**
     * 正常ケース
     * 
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testSearchOnDetailRefresh() throws Exception  {
        // 検索条件
        W6001DocCriteriaDomain invoiceDomain = new W6001DocCriteriaDomain();
        
        invoiceDomain.setDscId("srawf07");
        invoiceDomain.setShipperCd("MAF");
        invoiceDomain.setGrpNo1("1");
        invoiceDomain.setGrpNo2("0");
        w6001DocService.searchOnDetailRefresh(invoiceDomain);
    }
    
    /**
     * 正常ケース
     * 
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testUpdateOnDetailMoveToRegister() throws Exception  {
        // 検索条件
        W6001DocCriteriaDomain invoiceDomain = new W6001DocCriteriaDomain();
        invoiceDomain.setDscId("maeTest01");
        invoiceDomain.setShipperCd("MAT01");
        invoiceDomain.setGrpNo1("1");
        invoiceDomain.setGrpNo2("0");
        
        MockObjectManager.setReturnValueAtAllTimes(TwInvServiceImpl.class, "updateByCondition", 1);
      
        w6001DocService.updateOnDetailMoveToRegister(invoiceDomain);
    }
    
    /**
     * 正常ケース
     * 
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testsearchOnDetaiFrtlInit() throws Exception  {

        W6001DocCriteriaDomain invoiceDomain = new W6001DocCriteriaDomain();
        
        W6001DocPltzItemDomain ptlzItem = new W6001DocPltzItemDomain();
        List<W6001DocPltzItemDomain> ptlzItemList = new ArrayList<W6001DocPltzItemDomain>();

        TmInvFreeItemDomain invFreeItem = new TmInvFreeItemDomain();
        List<TmInvFreeItemDomain> invFreeList = new ArrayList<TmInvFreeItemDomain>();
 
        invoiceDomain.setDscId("@NoData");
        invoiceDomain.setShipperCd("MAT01");
        invoiceDomain.setGrpNo1("1");
        invoiceDomain.setGrpNo2("0");
        try{
            w6001DocService.searchOnDetaiFrtlInit(invoiceDomain);
        }catch (Exception e) {
        }
        
        invoiceDomain.setDscId("maeTest01");
        MockObjectManager.setReturnValueAtAllTimes(TwInvServiceImpl.class, "updateByCondition", 1);
        MockObjectManager.setReturnValueAtAllTimes(TwInvItemServiceImpl.class, "updateByCondition", 1);
        ptlzItemList.add(ptlzItem);
        MockObjectManager.setReturnValueAtAllTimes(W6001DocDaoImpl.class, "searchTmExpFormalitiItemNo", ptlzItemList);
        invFreeItem.setFreeColNo(new BigDecimal(1));
        invFreeList.add(invFreeItem);
        MockObjectManager.setReturnValueAtAllTimes(TmInvFreeItemServiceImpl.class, "searchByCondition", invFreeList);
        w6001DocService.searchOnDetaiFrtlInit(invoiceDomain);
        
        invFreeItem.setFreeColNo(new BigDecimal(2));
        w6001DocService.searchOnDetaiFrtlInit(invoiceDomain);

        invFreeItem.setFreeColNo(new BigDecimal(3));
        w6001DocService.searchOnDetaiFrtlInit(invoiceDomain);

        MockObjectManager.setReturnValueAtAllTimes(W6001DocDaoImpl.class, "searchCountTwInvItemByUnitPrice", 1);
        MockObjectManager.setReturnValueAtAllTimes(TwInvItemServiceImpl.class, "searchCount", 1);
        w6001DocService.searchOnDetaiFrtlInit(invoiceDomain);
        
    }
    
    /**
     * 正常ケース
     * 
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testdeleteOnDetailFrtRemove() throws Exception  {

        // 検索条件
        W6001DocCriteriaDomain invoiceDomain = new W6001DocCriteriaDomain();
        List<W6001DocPltzDomain> docPltzList = new ArrayList<W6001DocPltzDomain>();
        W6001DocPltzDomain docPltzDomain = new W6001DocPltzDomain();
        
        invoiceDomain.setDscId("testDsc");
        invoiceDomain.setShipperCd("testShipper");
        invoiceDomain.setGrpNo1("0");
        invoiceDomain.setGrpNo2("0");

        docPltzDomain.setItemNo("testItemNo");
        docPltzDomain.setItemDescription("testItemDescription");
        docPltzDomain.setModelCd("testModelCd");
        docPltzDomain.setCurrCd("testCurrCd");
        docPltzDomain.setUnitPrice(new BigDecimal("0"));
        docPltzList.add(docPltzDomain);
        invoiceDomain.setDocPltzList(docPltzList);

        MockObjectManager.setReturnValueAtAllTimes(TwInvItemServiceImpl.class, "updateByCondition", 1);
        // searchOnDetaiFrtlInitは個別でテストするのでここではMOC扱いにする
        MockObjectManager.setReturnNullAtAllTimes(W6001DocServiceImpl.class, "searchOnDetaiFrtlInit");
        w6001DocService.deleteOnDetailFrtRemove(invoiceDomain);
    }
    
    /**
     * 正常ケース
     * 
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testSearchOnRegisterChangeFrtShipper() throws Exception  {
        // 検索条件
        W6001DocCriteriaDomain invoiceDomain = new W6001DocCriteriaDomain();

        invoiceDomain.setInvoiceNo("W6001004");
        invoiceDomain.setFrtShipperCd("MYI");
        invoiceDomain.setShipperCd("MAC");
        invoiceDomain.setTotalVolume(new BigDecimal("100"));
        invoiceDomain.setVolumeUnit("LT");
        invoiceDomain.setTotalNetWeight(new BigDecimal("100"));
        invoiceDomain.setWeightUnit("KG");
        invoiceDomain.setTotalGrossWeight(new BigDecimal("100"));
        invoiceDomain.setWeightUnit("GR");
        invoiceDomain.setInvoiceIssueDt(DateFormat.getDateInstance().parse("2014/01/01"));
        w6001DocService.searchOnRegisterChangeFrtShipper(invoiceDomain);
        
        MockObjectManager.setReturnValueAtAllTimes(CommonServiceImpl.class, "searchWeightUnit", "TEST");
        MockObjectManager.setReturnValueAtAllTimes(CommonServiceImpl.class, "convertVolumeUnit", new BigDecimal(0));
        MockObjectManager.setReturnValueAtAllTimes(CommonServiceImpl.class, "searchVolumeUnit", "TEST");

        invoiceDomain.setFrtShipperCd("");
        w6001DocService.searchOnRegisterChangeFrtShipper(invoiceDomain);

        invoiceDomain.setGrpNo2("0");
        w6001DocService.searchOnRegisterChangeFrtShipper(invoiceDomain);
    }
    
    /**
     * 正常ケース
     * 
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testSearchTwInvPltzOnRegisterByFrtShipper() throws Exception  {
        // 検索条件
        String dscId = "srawf09";
        boolean addBlank = true;
        W6001DocPltzDomain docPltzDom = new W6001DocPltzDomain();
        List<W6001DocPltzDomain> pltzList = new ArrayList<W6001DocPltzDomain>();
        
        pltzList.add(docPltzDom);
        MockObjectManager.setReturnValueAtAllTimes(W6001DocDaoImpl.class, "searchTwInvPltzByShipper", pltzList);

        w6001DocService.searchTwInvPltzOnRegisterByFrtShipper(dscId, addBlank);
    }
    
    /**
     * 正常ケース
     * 
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testSearchTwInvPltzOnRegisterByFrtConsignee() throws Exception  {
        // 検索条件
        String dscId = "srawf09";
        String grpNo1 = "01";
        boolean addBlank = true;
        
        w6001DocService.searchTwInvPltzOnRegisterByFrtConsignee(dscId, grpNo1, addBlank);

        List<W6001DocPltzDomain> pltzList = new ArrayList<W6001DocPltzDomain>();
        W6001DocPltzDomain docPltz = new W6001DocPltzDomain();
        docPltz.setConsigneeCd("TEST");
        docPltz.setShipToCompCd("TEST");
        pltzList.add(docPltz);
        MockObjectManager.setReturnValueAtAllTimes(W6001DocDaoImpl.class, "searchTwInvPltzByConsignee", pltzList);
        w6001DocService.searchTwInvPltzOnRegisterByFrtConsignee(dscId, grpNo1, addBlank);

    }
    
    /**
     * 正常ケース
     * 
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testSearchTwInvOnRegisterByInvTmpNo() throws Exception  {
        // 検索条件
        String grpNo2 = "";
        String compCd = "MAF";
        boolean addBlank = true;
        String attr = "";
        String shipperCd = "";
        String invoiceCtgry = "";
        
        //最初の判定で抜ける
        w6001DocService.searchTwInvOnRegisterByInvTmpNo(null, compCd, shipperCd, invoiceCtgry, grpNo2, addBlank, attr);
        
        //ループに入り、条件分岐をクリアする
        List<W6001DocDomain> docList = new ArrayList<W6001DocDomain>();
        W6001DocDomain docData = new W6001DocDomain();
        docList.add(docData);
        MockObjectManager.setReturnValueAtAllTimes(W6001DocDaoImpl.class, "searchTmInvTplShipTo", docList);
        
        grpNo2 = "0";
        attr = "invTplNo";
        w6001DocService.searchTwInvOnRegisterByInvTmpNo(null, compCd, shipperCd, invoiceCtgry, grpNo2, addBlank, attr);
        attr = "comboFree1DispFlg";
        w6001DocService.searchTwInvOnRegisterByInvTmpNo(null, compCd, shipperCd, invoiceCtgry, grpNo2, addBlank, attr);
        attr = "comboFree2DispFlg";
        w6001DocService.searchTwInvOnRegisterByInvTmpNo(null, compCd, shipperCd, invoiceCtgry, grpNo2, addBlank, attr);
        attr = "comboFree3DispFlg";
        w6001DocService.searchTwInvOnRegisterByInvTmpNo(null, compCd, shipperCd, invoiceCtgry, grpNo2, addBlank, attr);
        attr = "comboFree4DispFlg";
        w6001DocService.searchTwInvOnRegisterByInvTmpNo(null, compCd, shipperCd, invoiceCtgry, grpNo2, addBlank, attr);
    }

    /**
     * 正常ケース
     * 
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testsearchTwInvPltzByShipperCd() throws Exception  {
        // 検索条件
        String dscId = "TEST";
        
        List<W6001DocPltzDomain> pltzList = new ArrayList<W6001DocPltzDomain>();
        W6001DocPltzDomain docPltz = new W6001DocPltzDomain();
        docPltz.setConsigneeCd("TEST");
        docPltz.setShipToCompCd("TEST");
        pltzList.add(docPltz);
        MockObjectManager.setReturnValueAtAllTimes(W6001DocDaoImpl.class, "searchTwInvPltzByShipperCd", pltzList);

        w6001DocService.searchTwInvPltzByShipperCd(dscId, true);
    }
    
    /**
     * 正常ケース
     * 
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testSearchTwInvOnRegisterByInvTmpNo2() throws Exception  {
        // 検索条件
        String compCd = "MAF";
//        String frtShipperCd = "MAF";
//        String shipToCd = "JPE";
//        String cmlTyp = "1";
        String grpNo2 = "0";
        boolean addBlank = true;
        String attr = "";
        String shipperCd = "";
        String invoiceCtgry = "";
        
        attr = "invTplNo";
        w6001DocService.searchTwInvOnRegisterByInvTmpNo(null, compCd, shipperCd, invoiceCtgry, grpNo2, addBlank, attr);
        
//        w6001DocService.searchTwInvOnRegisterByInvTmpNo(null, compCd, frtShipperCd, shipToCd, cmlTyp, addBlank, attr);
//        attr = "comboFree1DispFlg";
//        w6001DocService.searchTwInvOnRegisterByInvTmpNo(null, compCd, frtShipperCd, shipToCd, cmlTyp, addBlank, attr);
//        attr = "comboFree2DispFlg";
//        w6001DocService.searchTwInvOnRegisterByInvTmpNo(null, compCd, frtShipperCd, shipToCd, cmlTyp, addBlank, attr);
//        attr = "comboFree3DispFlg";
//        w6001DocService.searchTwInvOnRegisterByInvTmpNo(null, compCd, frtShipperCd, shipToCd, cmlTyp, addBlank, attr);
//        attr = "comboFree4DispFlg";
//        w6001DocService.searchTwInvOnRegisterByInvTmpNo(null, compCd, frtShipperCd, shipToCd, cmlTyp, addBlank, attr);
    }
    
    /**
     * 正常ケース
     * 
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testSearchOnRegisterInitByFromDetail() throws Exception  {
        // 検索条件
        W6001DocCriteriaDomain invoiceDomain = new W6001DocCriteriaDomain();
        invoiceDomain.setShipperCd("MAC");
        invoiceDomain.setInvoiceNo("W6001004");
        
        w6001DocService.searchOnRegisterInitByFromDetail(invoiceDomain);
    }
    
    /**
     * 正常ケース
     * 
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testSearchOnRegisterInitByFromMain() throws Exception  {
        // 検索条件
        W6001DocCriteriaDomain invoiceDomain = new W6001DocCriteriaDomain();
        invoiceDomain.setShipperCd("MAC");
        invoiceDomain.setInvoiceNo("W6001004");
        invoiceDomain.setInvoiceIssueDt(DateFormat.getDateInstance().parse("2014/04/25"));
        
        w6001DocService.searchOnRegisterInitByFromMain(invoiceDomain);
    }
    
    /**
     * 正常ケース
     * 
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testTransactOnRegisterCancel() throws Exception  {
        // 検索条件
        W6001DocCriteriaDomain invoiceDomain = new W6001DocCriteriaDomain();
        //invoiceDomain.setShipperCd("MAC");
        invoiceDomain.setShipperCd("MAT01");
        invoiceDomain.setInvoiceNo("0000000010");
        invoiceDomain.setInvoiceIssueDt(DateFormat.getDateInstance().parse("2014/04/26"));
        invoiceDomain.setDscId("maeTest01");
        invoiceDomain.setGrpNo1("1");
        invoiceDomain.setGrpNo2("0");
        invoiceDomain.setConsigneeCd("1");
        invoiceDomain.setCancelTyp("N");
        invoiceDomain.setInvTplNo("1");
        invoiceDomain.setNetAmount(new BigDecimal("100"));
        invoiceDomain.setHandlingCharge(new BigDecimal("100"));
        invoiceDomain.setAdditionalCharge(new BigDecimal("100"));
        invoiceDomain.setVatRatio(new BigDecimal("100"));
        invoiceDomain.setFreight(new BigDecimal("100"));
        invoiceDomain.setInsurance(new BigDecimal("100"));

        List<String> cancelInvNoList = new ArrayList<String>();
        cancelInvNoList.add("Test");
        TtInvoiceDomain ttInvDomDat = new TtInvoiceDomain();
        List<TtInvoiceDomain> ttInvDomList = new ArrayList<TtInvoiceDomain>();
        ttInvDomList.add(ttInvDomDat);
        
        
        MockObjectManager.setReturnValueAtAllTimes(W6001DocServiceImpl.class, "createCancelInvoiceNoOnRegister", ttInvDomList);
        MockObjectManager.setReturnValueAtAllTimes(W6001DocServiceImpl.class, "transactSequenceCancelInvNo", cancelInvNoList);
        MockObjectManager.setReturnNullAtAllTimes(W6001DocServiceImpl.class, "updateTtTmpStockOnRegisterByQtyAdd");
        MockObjectManager.setReturnNullAtAllTimes(W6001DocServiceImpl.class, "updateTtExpRcvOdrOnRegisterSubtract");
        MockObjectManager.setReturnNullAtAllTimes(W6001DocServiceImpl.class, "updateTtPltzOnRegisterbyCancel");
        MockObjectManager.setReturnNullAtAllTimes(W6001DocDaoImpl.class, "searchTtInvoiceByRegister");
        try {
            w6001DocService.transactOnRegisterCancel(invoiceDomain);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    //---------------------------------ここから下、坂井作成分---------------------------------//
    /**
     * 正常ケース
     * 
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testPrepareWs6001ParamDomain() throws Exception  {
        testtp_updateMocInvaludate();
        
        String shipperCd = "";
        String invoiceNo = "";
        Date invoiceIssueDt = new Date();

        W6001DocInvoiceDomain headDomain = new W6001DocInvoiceDomain();
        headDomain.setTotalVolume(new BigDecimal(1));
        headDomain.setRemLcTyp("R");
        MockObjectManager.setReturnValueAtAllTimes(W6001DocDaoImpl.class, "searchTtInvoiceByHeaderRegister", headDomain);

        W6001DocPltzItemOdrDomain ordDat = new W6001DocPltzItemOdrDomain();
        ordDat.setSumAllocQty(new BigDecimal(1));
        List<W6001DocPltzItemOdrDomain> ordList = new ArrayList<W6001DocPltzItemOdrDomain>();
        ordList.add(ordDat);
        
        W6001DocPltzItemDomain pltzItemDat = new W6001DocPltzItemDomain();
        pltzItemDat.setDocPltzItemOdrList(ordList);
        List<W6001DocPltzItemDomain> pltsItemList = new ArrayList<W6001DocPltzItemDomain>();
        pltsItemList.add(pltzItemDat);
        
        W6001DocPltzDomain pltzDat = new W6001DocPltzDomain();
        pltzDat.setDocPltzItemList(pltsItemList);
        List<W6001DocPltzDomain> pltzList = new ArrayList<W6001DocPltzDomain>();
        pltzList.add(pltzDat);
        
        W6001DocInvoiceDomain invoiceDat = new W6001DocInvoiceDomain();
        invoiceDat.setDocPltzList(pltzList);
        List<W6001DocInvoiceDomain> invoiceList = new ArrayList<W6001DocInvoiceDomain>();
        invoiceList.add(invoiceDat);
        
        MockObjectManager.setReturnValueAtAllTimes(W6001DocDaoImpl.class, "searchTtInvoiceAttached", invoiceList);

        testW6001DocService.tp_prepareWs6001ParamDomain(shipperCd, invoiceNo, invoiceIssueDt);
        
        headDomain.setFreightResponsibleCd("P");
        testW6001DocService.tp_prepareWs6001ParamDomain(shipperCd, invoiceNo, invoiceIssueDt);
    }
    
    /**
     * 正常ケース
     * 
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testSearchTtInvoiceByHeaderRegister() throws Exception  {
        testtp_updateMocInvaludate();
        
        String shipperCd = "";
        String invoiceNo = "";
        Date invoiceIssueDt = new Date();


        testW6001DocService.tp_searchTtInvoiceByHeaderRegister(shipperCd, invoiceNo, invoiceIssueDt);

    }
    
    /**
     * 正常ケース
     * 
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testTransactSequenceCancelInvNo() throws Exception  {
        testtp_updateMocInvaludate();
        
        W6001DocCriteriaDomain criteria = new W6001DocCriteriaDomain();
        List<TtInvoiceDomain> ttInvoiceList = new ArrayList<TtInvoiceDomain>();
        TtInvoiceDomain ttInvoiceDomain = new TtInvoiceDomain();
        ttInvoiceDomain.setInvoiceClass("M");
        ttInvoiceDomain.setSupplierInvoiceNo("111");
        ttInvoiceList.add(ttInvoiceDomain);
        
        ttInvoiceDomain = new TtInvoiceDomain();
        ttInvoiceDomain.setInvoiceClass("F");
        ttInvoiceDomain.setSupplierInvoiceNo("111");
        ttInvoiceList.add(ttInvoiceDomain);
        
        ttInvoiceDomain = new TtInvoiceDomain();
        ttInvoiceList.add(ttInvoiceDomain);
        MockObjectManager.initialize();
        TmCancelInvSeqTypDomain tmCancelinvSeqTypDomain = new TmCancelInvSeqTypDomain();
        MockObjectManager.setReturnNullAtAllTimes(W6001DocServiceImpl.class, "searchTmCancelInvSeqTyp");

        testW6001DocService.tp_transactSequenceCancelInvNo(criteria, ttInvoiceList);

        MockObjectManager.initialize();
        tmCancelinvSeqTypDomain = new TmCancelInvSeqTypDomain();
        tmCancelinvSeqTypDomain.setCancelInvSeqTyp("90");
        ttInvoiceDomain.setCmlTyp("40");
        MockObjectManager.setReturnValueAtAllTimes(W6001DocServiceImpl.class, "searchTmInvSeqOnRegister", "");
        MockObjectManager.setReturnValueAtAllTimes(W6001DocServiceImpl.class, "searchTmCancelInvSeqTyp", tmCancelinvSeqTypDomain);

        testW6001DocService.tp_transactSequenceCancelInvNo(criteria, ttInvoiceList);
        
    }
    
    /**
     * 正常ケース
     * 
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testSearchTmCancelInvSeqTyp() throws Exception  {
        testtp_updateMocInvaludate();
        
        testW6001DocService.tp_searchTmCancelInvSeqTyp("MYI");

    }
    
    /**
     * 正常ケース
     * 
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testCreateCancelInvoiceNoOnRegister() throws Exception  {
        testtp_updateMocInvaludate();
        
        List<TtInvoiceDomain> cancelList = new ArrayList<TtInvoiceDomain>();
        TtInvoiceDomain cancelDomain = new TtInvoiceDomain();
        cancelDomain.setInvoiceClass("M");
        cancelDomain.setShipperCd("MYI");
        cancelDomain.setInvoiceNo("W60020004");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        Date date = sdf.parse("20140420");
        cancelDomain.setInvoiceIssueDt(date);
        cancelList.add(cancelDomain);
        
        List<String> cancelInvNoList = new ArrayList<String>();
        cancelInvNoList.add("");
        
        List<TtInvoiceDomain> createInvoiceList = new ArrayList<TtInvoiceDomain>(); 
        TtInvoiceDomain cancelDomain2 = new TtInvoiceDomain();
        createInvoiceList.add(cancelDomain2);
        
        W6001DocCriteriaDomain criteria = new W6001DocCriteriaDomain();
        criteria.setShipperCd("MYI");
        criteria.setDscId("srawi09");
        
        MockObjectManager.initialize();
        MockObjectManager.setReturnValueAtAllTimes(TtInvoiceService.class, "create");
        List<TtInvoiceDomain> invoiceList = new ArrayList<TtInvoiceDomain>();
        TtInvoiceDomain domain = new TtInvoiceDomain();
        invoiceList.add(domain);
        MockObjectManager.setReturnNullAtAllTimes(DateUtil.class, "convertTime");
        MockObjectManager.setReturnValueAtAllTimes(W6001DocServiceImpl.class, "getDscName", "");
        MockObjectManager.setReturnValueAtAllTimes(W6001DocServiceImpl.class, "createTtInvoiceOnRegisterByCancel", invoiceList);
        MockObjectManager.setReturnValueAtAllTimes(W6001DocServiceImpl.class, "createTtInvoiceHeaderOnRegisterByCancel");
        MockObjectManager.setReturnValueAtAllTimes(W6001DocServiceImpl.class, "createTtPackingHeadOnRegisterByCancel");
        MockObjectManager.setReturnValueAtAllTimes(W6001DocServiceImpl.class, "createTtInvoiceAttachedOnRegisterByCancel");
        MockObjectManager.setReturnValueAtAllTimes(W6001DocServiceImpl.class, "createTtPackingAttachedCmlOnRegisterByCancel");
        MockObjectManager.setReturnValueAtAllTimes(W6001DocServiceImpl.class, "createTtPackAtchItemNoOnRegisterByCancel");
        MockObjectManager.setReturnValueAtAllTimes(W6001DocServiceImpl.class, "createPdfFileOnRegister");
        MockObjectManager.setReturnValueAtAllTimes(W6001DocServiceImpl.class, "updateTtInvoiceOnRegisterbyCancel", 1);
        
        testW6001DocService.tp_createCancelInvoiceNoOnRegister(cancelList, cancelInvNoList, criteria);

    }
    
    /**
     * 正常ケース
     * 
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testCreateTtInvoiceOnRegisterByCancel() throws Exception  {
        testtp_updateMocInvaludate();
        
        List<TtInvoiceDomain> cancelList = new ArrayList<TtInvoiceDomain>();
        TtInvoiceDomain cancelDomain = new TtInvoiceDomain();
        cancelDomain.setInvoiceClass("M");
        cancelDomain.setShipperCd("MYI");
        cancelDomain.setInvoiceNo("W60020004");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        Date date = sdf.parse("20140420");
        cancelDomain.setInvoiceIssueDt(date);
        cancelList.add(cancelDomain);
        
        List<String> cancelInvNoList = new ArrayList<String>();
        cancelInvNoList.add("");
        
        List<TtInvoiceDomain> createInvoiceList = new ArrayList<TtInvoiceDomain>(); 
        TtInvoiceDomain cancelDomain2 = new TtInvoiceDomain();
        createInvoiceList.add(cancelDomain2);
        
        Date invIssueDt = sdf.parse("20140425");
        
        String dscId = "";
        String dscNm = "";
        
        MockObjectManager.initialize();
        MockObjectManager.setReturnNullAtAllTimes(TtInvoiceServiceImpl.class, "create");
        testW6001DocService.tp_createTtInvoiceOnRegisterByCancel(cancelList, cancelInvNoList, invIssueDt, dscId, dscNm);

    }
    
    /**
     * 正常ケース
     * 
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testCreateTtInvoiceHeaderOnRegisterByCancel() throws Exception  {
        testtp_updateMocInvaludate();
        
        List<TtInvoiceDomain> cancelList = new ArrayList<TtInvoiceDomain>();
        TtInvoiceDomain cancelDomain = new TtInvoiceDomain();
        cancelDomain.setInvoiceClass("M");
        cancelDomain.setShipperCd("MYI");
        cancelDomain.setInvoiceNo("W60020004");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        Date date = sdf.parse("20140420");
        cancelDomain.setInvoiceIssueDt(date);
        cancelList.add(cancelDomain);
        
        List<String> cancelInvNoList = new ArrayList<String>();
        cancelInvNoList.add("");
        
        List<TtInvoiceDomain> createInvoiceList = new ArrayList<TtInvoiceDomain>(); 
        TtInvoiceDomain cancelDomain2 = new TtInvoiceDomain();
        createInvoiceList.add(cancelDomain2);
        
        Date invIssueDt = sdf.parse("20140425");
        
        MockObjectManager.initialize();
        MockObjectManager.setReturnNullAtAllTimes(TtInvoiceHeaderServiceImpl.class, "create");
        testW6001DocService.tp_createTtInvoiceHeaderOnRegisterByCancel(cancelList, cancelInvNoList, createInvoiceList, invIssueDt);

    }
    
    /**
     * 正常ケース
     * 
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testCreateTtPackingHeadOnRegisterByCancel() throws Exception  {
        testtp_updateMocInvaludate();
        
        List<TtInvoiceDomain> cancelList = new ArrayList<TtInvoiceDomain>();
        TtInvoiceDomain cancelDomain = new TtInvoiceDomain();
        cancelDomain.setInvoiceClass("M");
        cancelDomain.setShipperCd("MYI");
        cancelDomain.setInvoiceNo("W60020004");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        Date date = sdf.parse("20140420");
        cancelDomain.setInvoiceIssueDt(date);
        cancelList.add(cancelDomain);
        
        List<String> cancelInvNoList = new ArrayList<String>();
        cancelInvNoList.add("");
        
        List<TtInvoiceDomain> createInvoiceList = new ArrayList<TtInvoiceDomain>(); 
        TtInvoiceDomain cancelDomain2 = new TtInvoiceDomain();
        createInvoiceList.add(cancelDomain2);
        
        Date invIssueDt = sdf.parse("20140425");
        
        MockObjectManager.initialize();
        MockObjectManager.setReturnNullAtAllTimes(TtPackingHeadServiceImpl.class, "create");
        testW6001DocService.tp_createTtPackingHeadOnRegisterByCancel(cancelList, cancelInvNoList, createInvoiceList, invIssueDt);

    }
    
    /**
     * 正常ケース
     * 
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testCreateTtInvoiceAttachedOnRegisterByCancel() throws Exception  {
        testtp_updateMocInvaludate();
        
        List<TtInvoiceDomain> cancelList = new ArrayList<TtInvoiceDomain>();
        TtInvoiceDomain cancelDomain = new TtInvoiceDomain();
        cancelDomain.setInvoiceClass("M");
        cancelDomain.setShipperCd("MYI");
        cancelDomain.setInvoiceNo("W60020004");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        Date date = sdf.parse("20140420");
        cancelDomain.setInvoiceIssueDt(date);
        cancelList.add(cancelDomain);
        
        List<String> cancelInvNoList = new ArrayList<String>();
        cancelInvNoList.add("");
        
        List<TtInvoiceDomain> createInvoiceList = new ArrayList<TtInvoiceDomain>(); 
        TtInvoiceDomain cancelDomain2 = new TtInvoiceDomain();
        createInvoiceList.add(cancelDomain2);
        
        Date invIssueDt = sdf.parse("20140425");
        
        MockObjectManager.initialize();
        MockObjectManager.setReturnValueAtAllTimes(TtInvoiceAttachedServiceImpl.class, "create");
        testW6001DocService.tp_createTtInvoiceAttachedOnRegisterByCancel(cancelList, cancelInvNoList, createInvoiceList, invIssueDt);

    }
    
    /**
     * 正常ケース
     * 
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testcreateTtPackingAttachedCmlOnRegisterByCancel() throws Exception  {
        testtp_updateMocInvaludate();
        
        List<TtInvoiceDomain> cancelList = new ArrayList<TtInvoiceDomain>();
        TtInvoiceDomain cancelDomain = new TtInvoiceDomain();
        cancelDomain.setInvoiceClass("M");
        cancelDomain.setShipperCd("MYI");
        cancelDomain.setInvoiceNo("W600200031");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        Date date = sdf.parse("20140420");
        cancelDomain.setInvoiceIssueDt(date);
        cancelList.add(cancelDomain);
        
        List<String> cancelInvNoList = new ArrayList<String>();
        cancelInvNoList.add("");
        
        List<TtInvoiceDomain> createInvoiceList = new ArrayList<TtInvoiceDomain>(); 
        TtInvoiceDomain cancelDomain2 = new TtInvoiceDomain();
        createInvoiceList.add(cancelDomain2);
        
        Date invIssueDt = sdf.parse("20140425");
        
        MockObjectManager.initialize();
        MockObjectManager.setReturnValueAtAllTimes(TtPackingAttachedCmlServiceImpl.class, "create");
        testW6001DocService.tp_createTtPackingAttachedCmlOnRegisterByCancel(cancelList, cancelInvNoList, createInvoiceList, invIssueDt);

    }
    
    /**
     * 正常ケース
     * 
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testCreateTtPackAtchItemNoOnRegisterByCancel() throws Exception  {
        testtp_updateMocInvaludate();

        
        List<TtInvoiceDomain> cancelList = new ArrayList<TtInvoiceDomain>();
        TtInvoiceDomain cancelDat = new TtInvoiceDomain();
        cancelList.add(cancelDat);
        
        List<String> cancelInvNoList = new ArrayList<String>();
        cancelInvNoList.add("");
        
        List<TtInvoiceDomain> createInvoiceList = new ArrayList<TtInvoiceDomain>(); 
        TtInvoiceDomain createInvoiceDat = new TtInvoiceDomain();
        createInvoiceList.add(createInvoiceDat);
        
        Date invIssueDt = new Date();
        
        MockObjectManager.setReturnValueAtAllTimes(TtPackAtchItemNoServiceImpl.class, "create");
        testW6001DocService.tp_createTtPackAtchItemNoOnRegisterByCancel(cancelList, cancelInvNoList, createInvoiceList, invIssueDt);

    }
    
    /**
     * 正常ケース
     * 
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testUpdateTtInvoiceOnRegisterbyCancel() throws Exception  {
        testtp_updateMocInvaludate();
        
        List<TtInvoiceDomain> cancelList = new ArrayList<TtInvoiceDomain>();
        TtInvoiceDomain cancelDomain = new TtInvoiceDomain();
        cancelDomain.setShipperCd("MAE");
        cancelDomain.setInvoiceNo("90000006");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        Date date = sdf.parse("20140425");
        cancelDomain.setInvoiceIssueDt(date);
        cancelList.add(cancelDomain);
        testW6001DocService.tp_updateTtInvoiceOnRegisterbyCancel(cancelList);

    }
    
    /**
     * 正常ケース
     * 
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testUpdateTtPltzOnRegisterbyCancel() throws Exception  {
        testtp_updateMocInvaludate();
        
        TtInvoiceDomain ttInvoiceDomain = new TtInvoiceDomain();
        W6001DocCriteriaDomain criteria = new W6001DocCriteriaDomain();
        ttInvoiceDomain.setInvoiceClass("F");
        testW6001DocService.tp_updateTtPltzOnRegisterbyCancel(ttInvoiceDomain, criteria);
        ttInvoiceDomain.setInvoiceClass("M");
        ttInvoiceDomain.setCmlTyp("1");
        criteria.setShipperCd("MAX");
        criteria.setInvoiceNo("W6001A001");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        Date date = sdf.parse("20140401");
        criteria.setInvoiceIssueDt(date);
        testW6001DocService.tp_updateTtPltzOnRegisterbyCancel(ttInvoiceDomain, criteria);

        criteria.setShipperCd("MAE");
        MockObjectManager.initialize();
        TtTmpStockDomain ttTmpStockDomain = new TtTmpStockDomain();
        ttTmpStockDomain.setQty(new BigDecimal(0));
        List<W6001DocPltzDomain> docPltzList = new ArrayList<W6001DocPltzDomain>();
        W6001DocPltzDomain docPltzDomain = new W6001DocPltzDomain();
        ttInvoiceDomain.setCustomTimingTyp("A");
        docPltzDomain.setPltzStatus("91");
        docPltzList.add(docPltzDomain);
        MockObjectManager.initialize();
        MockObjectManager.setReturnValueAtAllTimes(W6001DocDaoImpl.class, "lockByNoWaitTtPltzByPltzStatus", docPltzList);
        testW6001DocService.tp_updateTtPltzOnRegisterbyCancel(ttInvoiceDomain, criteria);

        MockObjectManager.initialize();
        ttTmpStockDomain = new TtTmpStockDomain();
        ttTmpStockDomain.setQty(new BigDecimal(0));
        docPltzList = new ArrayList<W6001DocPltzDomain>();
        docPltzDomain = new W6001DocPltzDomain();
        ttInvoiceDomain.setCustomTimingTyp("B");
        docPltzDomain.setPltzStatus("61");
        docPltzList.add(docPltzDomain);
        MockObjectManager.initialize();
        MockObjectManager.setReturnValueAtAllTimes(W6001DocDaoImpl.class, "lockByNoWaitTtPltzByPltzStatus", docPltzList);
        testW6001DocService.tp_updateTtPltzOnRegisterbyCancel(ttInvoiceDomain, criteria);

        MockObjectManager.initialize();
        ttTmpStockDomain = new TtTmpStockDomain();
        ttTmpStockDomain.setQty(new BigDecimal(0));
        docPltzList = new ArrayList<W6001DocPltzDomain>();
        docPltzDomain = new W6001DocPltzDomain();
        ttInvoiceDomain.setCustomTimingTyp("Z");
        docPltzDomain.setPltzStatus("41");
        docPltzList.add(docPltzDomain);
        MockObjectManager.initialize();
        MockObjectManager.setReturnValueAtAllTimes(W6001DocDaoImpl.class, "lockByNoWaitTtPltzByPltzStatus", docPltzList);
        testW6001DocService.tp_updateTtPltzOnRegisterbyCancel(ttInvoiceDomain, criteria);

        MockObjectManager.initialize();
        ttTmpStockDomain = new TtTmpStockDomain();
        ttTmpStockDomain.setQty(new BigDecimal(0));
        docPltzList = new ArrayList<W6001DocPltzDomain>();
        docPltzDomain = new W6001DocPltzDomain();
        ttInvoiceDomain.setCustomTimingTyp("A");
        docPltzDomain.setPltzStatus("90");
        docPltzList.add(docPltzDomain);
        MockObjectManager.initialize();
        MockObjectManager.setReturnValueAtAllTimes(W6001DocDaoImpl.class, "lockByNoWaitTtPltzByPltzStatus", docPltzList);
        testW6001DocService.tp_updateTtPltzOnRegisterbyCancel(ttInvoiceDomain, criteria);

        MockObjectManager.initialize();
        ttTmpStockDomain = new TtTmpStockDomain();
        ttTmpStockDomain.setQty(new BigDecimal(0));
        docPltzList = new ArrayList<W6001DocPltzDomain>();
        docPltzDomain = new W6001DocPltzDomain();
        ttInvoiceDomain.setCustomTimingTyp("B");
        docPltzDomain.setPltzStatus("60");
        docPltzList.add(docPltzDomain);
        MockObjectManager.initialize();
        MockObjectManager.setReturnValueAtAllTimes(W6001DocDaoImpl.class, "lockByNoWaitTtPltzByPltzStatus", docPltzList);
        testW6001DocService.tp_updateTtPltzOnRegisterbyCancel(ttInvoiceDomain, criteria);

        MockObjectManager.initialize();
        ttTmpStockDomain = new TtTmpStockDomain();
        ttTmpStockDomain.setQty(new BigDecimal(0));
        docPltzList = new ArrayList<W6001DocPltzDomain>();
        docPltzDomain = new W6001DocPltzDomain();
        ttInvoiceDomain.setCustomTimingTyp("Z");
        docPltzDomain.setPltzStatus("40");
        docPltzList.add(docPltzDomain);
        MockObjectManager.initialize();
        MockObjectManager.setReturnValueAtAllTimes(W6001DocDaoImpl.class, "lockByNoWaitTtPltzByPltzStatus", docPltzList);
        testW6001DocService.tp_updateTtPltzOnRegisterbyCancel(ttInvoiceDomain, criteria);

    }
    /**
     * 正常ケース
     * 
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testupdateTtTmpStockOnRegisterByQtyAdd() throws Exception  {
        testtp_updateMocInvaludate();
        
        TtInvoiceDomain ttInvoiceDomain = new TtInvoiceDomain();
        W6001DocCriteriaDomain criteria = new W6001DocCriteriaDomain();
        ttInvoiceDomain.setInvoiceClass("M");
        ttInvoiceDomain.setCmlTyp("2");
        testW6001DocService.tp_updateTtTmpStockOnRegisterByQtyAdd(ttInvoiceDomain, criteria);
        ttInvoiceDomain.setInvoiceClass("M");
        ttInvoiceDomain.setCmlTyp("1");
        criteria.setShipperCd("MAX");
        criteria.setInvoiceNo("W6001A001");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        Date date = sdf.parse("20140401");
        criteria.setInvoiceIssueDt(date);
        testW6001DocService.tp_updateTtTmpStockOnRegisterByQtyAdd(ttInvoiceDomain, criteria);

        criteria.setShipperCd("MAE");
        MockObjectManager.initialize();
        TtTmpStockDomain ttTmpStockDomain = new TtTmpStockDomain();
        ttTmpStockDomain.setQty(new BigDecimal(0));
        MockObjectManager.initialize();
        MockObjectManager.setReturnNullAtAllTimes(TtTmpStockServiceImpl.class, "lockByKeyNoWait");
        testW6001DocService.tp_updateTtTmpStockOnRegisterByQtyAdd(ttInvoiceDomain, criteria);

        criteria.setShipperCd("MAE");
        MockObjectManager.initialize();
        ttTmpStockDomain = new TtTmpStockDomain();
        ttTmpStockDomain.setQty(new BigDecimal(0));
        MockObjectManager.setReturnValueAtAllTimes(TtTmpStockServiceImpl.class, "lockByKeyNoWait", ttTmpStockDomain);
        testW6001DocService.tp_updateTtTmpStockOnRegisterByQtyAdd(ttInvoiceDomain, criteria);

    }
    
    /**
     * 正常ケース
     * 
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testUpdateTtExpRcvOdrOnRegisterSubtract() throws Exception  {
        testtp_updateMocInvaludate();
        
        TtInvoiceDomain ttInvoiceDomain = new TtInvoiceDomain();
        W6001DocCriteriaDomain criteria = new W6001DocCriteriaDomain();
        ttInvoiceDomain.setInvoiceClass("M");
        ttInvoiceDomain.setCmlTyp("2");
        testW6001DocService.tp_updateTtExpRcvOdrOnRegisterSubtract(ttInvoiceDomain, criteria);
        ttInvoiceDomain.setInvoiceClass("M");
        ttInvoiceDomain.setCmlTyp("1");
        criteria.setShipperCd("MAE");
        criteria.setInvoiceNo("W6001A001");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        Date date = sdf.parse("20140401");
        criteria.setInvoiceIssueDt(date);
        MockObjectManager.initialize();
        MockObjectManager.setReturnNullAtAllTimes(TtExpRcvOdrServiceImpl.class, "lockByKeyNoWait");
        testW6001DocService.tp_updateTtExpRcvOdrOnRegisterSubtract(ttInvoiceDomain, criteria);

        MockObjectManager.initialize();
        TtExpRcvOdrDomain ttExpRcvOdrDomain = new TtExpRcvOdrDomain();
        ttExpRcvOdrDomain.setPartialDelivCnt(new BigDecimal(0));
        MockObjectManager.setReturnValueAtAllTimes(TtExpRcvOdrServiceImpl.class, "lockByKeyNoWait", ttExpRcvOdrDomain);
        testW6001DocService.tp_updateTtExpRcvOdrOnRegisterSubtract(ttInvoiceDomain, criteria);

        ttExpRcvOdrDomain = new TtExpRcvOdrDomain();
        ttExpRcvOdrDomain.setPartialDelivCnt(new BigDecimal(10));
        ttExpRcvOdrDomain.setShippedTyp("3");
        ttExpRcvOdrDomain.setShippedQty(new BigDecimal(50));
        MockObjectManager.initialize();
        MockObjectManager.setReturnValueAtAllTimes(TtExpRcvOdrServiceImpl.class, "lockByKeyNoWait", ttExpRcvOdrDomain);
        testW6001DocService.tp_updateTtExpRcvOdrOnRegisterSubtract(ttInvoiceDomain, criteria);

        TtExpRcvOdrDomain ttExpRcvOdrDomain2 = new TtExpRcvOdrDomain();
        ttExpRcvOdrDomain2.setPartialDelivCnt(new BigDecimal(10));
        ttExpRcvOdrDomain2.setShippedTyp("3");
        ttExpRcvOdrDomain2.setShippedQty(new BigDecimal(150));
        MockObjectManager.initialize();
        MockObjectManager.setReturnValueAtAllTimes(TtExpRcvOdrServiceImpl.class, "lockByKeyNoWait", ttExpRcvOdrDomain2);
        testW6001DocService.tp_updateTtExpRcvOdrOnRegisterSubtract(ttInvoiceDomain, criteria);
    }
    /**
     * 正常ケース
     * 
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testCallWebService6002() throws Exception  {
        testtp_updateMocInvaludate();
        
        List<TtInvoiceDomain> ttInvoiceList = new ArrayList<TtInvoiceDomain>();
        //Continueに入るためのデータ
        TtInvoiceDomain ttInvDomain1 = new TtInvoiceDomain();
        ttInvDomain1.setCmlTyp("2");
        ttInvDomain1.setInvoiceClass("M");
        ttInvoiceList.add(ttInvDomain1);
        //Continueに入らないデータ
        TtInvoiceDomain ttInvDomain2 = new TtInvoiceDomain();
        ttInvDomain2.setCmlTyp("1");
        ttInvDomain2.setInvoiceClass("M");
        ttInvoiceList.add(ttInvDomain2);
        //Exceptionをはくためのデータ
        ResultDomain resultDomain = new ResultDomain();
        resultDomain.setResultCode("1");
        
        W6001DocInvoiceDomain docInvDomain = new W6001DocInvoiceDomain();
        MockObjectManager.setReturnValueAtAllTimes(W6001DocDaoImpl.class, "searchTtInvoiceByHeaderCancel", docInvDomain);
        
        resultDomain.setResultCode("1");
        MockObjectManager.setReturnValueAtAllTimes(Ws6002RestServiceMockImpl.class, "cancelSalesOdrInvntry", resultDomain);
        try {
            testW6001DocService.tp_callWebService6002("MAE", ttInvoiceList);
        } catch (Exception e) {
        }
        //最後まで抜けるためのデータ
        resultDomain.setResultCode("0");
        MockObjectManager.setReturnValueAtAllTimes(Ws6002RestServiceMockImpl.class, "cancelSalesOdrInvntry", resultDomain);
        testW6001DocService.tp_callWebService6002("MAE", ttInvoiceList);
    }
    /**
     * 正常ケース
     * 
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testCreateTwInvItemOnInvoiceGroupingBySearch() throws Exception  {
        testtp_updateMocInvaludate();
        
        testW6001DocService.tp_createTwInvItemOnInvoiceGroupingBySearch("N", "10", "0000000010");
        testW6001DocService.tp_createTwInvItemOnInvoiceGroupingBySearch("Y", "srawe02", "MAE");
    }
    /**
     * 正常ケース
     * 
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testUpdateTwInvPltzOnInvoiceGroupingBySearchForCigma() throws Exception  {
        testtp_updateMocInvaludate();
        
        List<W6001DocPltzDomain> docPltzList = new ArrayList<W6001DocPltzDomain>();
        W6001DocPltzDomain docPltz = new W6001DocPltzDomain();
        docPltz.setCmlTyp("1");
        docPltz.setCmlTyp("1");
        docPltzList.add(docPltz);
        docPltzList.add(docPltz);
        
        Ws6003ResultDomain wsResult = new Ws6003ResultDomain();
        MockObjectManager.initialize();
        MockObjectManager.setReturnValueAtAllTimes(Ws6003RestServiceImpl.class, "getShippingDocInfo", wsResult);
        testW6001DocService.tp_updateTwInvPltzOnInvoiceGroupingBySearchForCigma("N", "10", "0000000010", docPltzList);
        
        MockObjectManager.initialize();
        MockObjectManager.setReturnValueAtAllTimes(Ws6003RestServiceImpl.class, "getShippingDocInfo", wsResult);
        testW6001DocService.tp_updateTwInvPltzOnInvoiceGroupingBySearchForCigma("Y", "10", "0000000010", docPltzList);

        wsResult.setResultCode("0");
        List<Ws6003ResultItemDomain> shipDocList = new ArrayList<Ws6003ResultItemDomain>();
        Ws6003ResultItemDomain shipDocDomain = new Ws6003ResultItemDomain();
        shipDocDomain.setCustomerCd("srawi07");
        shipDocDomain.setFreight("0");
        shipDocList.add(shipDocDomain);
        shipDocDomain = new Ws6003ResultItemDomain();
        shipDocDomain.setCustomerCd("srawi07");
        shipDocDomain.setFreight("1");
        shipDocList.add(shipDocDomain);
        wsResult.setShipDocList(shipDocList);
        MockObjectManager.initialize();
        MockObjectManager.setReturnValueAtAllTimes(Ws6003RestServiceImpl.class, "getShippingDocInfo", wsResult);
        testW6001DocService.tp_updateTwInvPltzOnInvoiceGroupingBySearchForCigma("Y", "srawi07", "MAI", docPltzList);
    }
    /**
     * 正常ケース
     * 
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testCallWebService6003() throws Exception  {
        testtp_updateMocInvaludate();
        
        List<W6001DocPltzDomain> docPltzList = new ArrayList<W6001DocPltzDomain>();
        W6001DocPltzDomain docPltz = new W6001DocPltzDomain();
        docPltz.setCmlTyp("1");
        docPltzList.add(docPltz);
        docPltzList.add(docPltz);
        
        testW6001DocService.tp_callWebService6003("MAI", docPltzList);
    }
    /**
     * 正常ケース
     * 
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testUpdateTwInvPltzOnInvoiceGroupingBySearchForRt() throws Exception  {
        testtp_updateMocInvaludate();
        
        testW6001DocService.tp_updateTwInvPltzOnInvoiceGroupingBySearchForRt("N", "10", "0000000010");
        testW6001DocService.tp_updateTwInvPltzOnInvoiceGroupingBySearchForRt("Y", "srawi07", "MAI");
    }
    /**
     * 正常ケース
     * 
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testUpdateTwInvPltzOnInvoiceGroupingBySearchForGrpNo1() throws Exception  {
        testtp_updateMocInvaludate();

        List<W6001DocPltzDomain> docPltzList = new ArrayList<W6001DocPltzDomain>();
        W6001DocPltzDomain docPltzDat = new W6001DocPltzDomain();
        docPltzList.add(docPltzDat);
        List<TwInvPltzDomain> twInvPltzList = new ArrayList<TwInvPltzDomain>();
        TwInvPltzDomain twInvPltzDat = new TwInvPltzDomain();
        twInvPltzDat.setGrpNo1("1");
        twInvPltzList.add(twInvPltzDat);
        MockObjectManager.setReturnValueAtAllTimes(W6001DocDaoImpl.class, "searchTwInvPltzByGroup", docPltzList);
        MockObjectManager.setReturnValueAtAllTimes(TwInvPltzServiceImpl.class, "searchByCondition", twInvPltzList);
        
        testW6001DocService.tp_updateTwInvPltzOnInvoiceGroupingBySearchForGrpNo1("0000000010", "maeTest01", "MAT01");
    }
    /**
     * 正常ケース
     * 
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testUpdateTwInvItemOnInvoiceGroupingBySearchForGrpNo1() throws Exception  {
        testtp_updateMocInvaludate();
        
        List<W6001DocPltzDomain> docPltzList = new ArrayList<W6001DocPltzDomain>();
        W6001DocPltzDomain docPltzDat = new W6001DocPltzDomain();
        docPltzList.add(docPltzDat);
        MockObjectManager.setReturnValueAtAllTimes(W6001DocDaoImpl.class, "searchTwInvPltzByGroupNo1", docPltzList);
        testW6001DocService.tp_updateTwInvItemOnInvoiceGroupingBySearchForGrpNo1("0000000010", "srawe02", "MAE");
    }

    /**
     * 正常ケース
     * 
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testSearchTwInvItemOnInvoiceGroupingForMaxGrpNo2() throws Exception  {
        testtp_updateMocInvaludate();
        
        List<TwInvItemDomain> retDomainList = new ArrayList<TwInvItemDomain>();
        MockObjectManager.setReturnValueAtAllTimes(TwInvItemServiceImpl.class, "searchByCondition", retDomainList);
        testW6001DocService.tp_searchTwInvItemOnInvoiceGroupingForMaxGrpNo2("srawf07", "mainMarkW6001001", "1", "1");

        TwInvItemDomain retDomain = new TwInvItemDomain();
        retDomain.setGrpNo2("1");
        retDomainList.add(retDomain);
        MockObjectManager.setReturnValueAtAllTimes(TwInvItemServiceImpl.class, "searchByCondition", retDomainList);
        testW6001DocService.tp_searchTwInvItemOnInvoiceGroupingForMaxGrpNo2("10", "0000000010", "10", "1");
    }
}
