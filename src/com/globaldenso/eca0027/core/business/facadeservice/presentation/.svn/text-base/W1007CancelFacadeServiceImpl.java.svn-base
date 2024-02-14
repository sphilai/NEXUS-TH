/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CASEMARK;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FUNC_PACKING_STATUS;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FUNC_PALLETIZE_INSTRUCTION;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.LANGUAGE_CD_ENGLISH;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NOT_PACKED;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NOT_RECEIVED;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NOT_RECEIVED_PACKING;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_3001;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_3007;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCdCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.service.TmCdService;
import com.globaldenso.eca0027.core.business.domain.W1007ExpRequestDomain;
import com.globaldenso.eca0027.core.business.domain.W1007ExpRequestDtlDomain;
import com.globaldenso.eca0027.core.business.domain.W1007ExpRequestDtlKitDomain;
import com.globaldenso.eca0027.core.business.domain.W1007ListDomain;
import com.globaldenso.eca0027.core.business.domain.W1007PltzWkDomain;
import com.globaldenso.eca0027.core.business.domain.W1007UpdateDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W1007ExpRequestCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W1007ExpRequestDtlCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W1007ExpRequestDtlKitCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W1007PltzWkCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W1007ExpRequestDtlKitService;
import com.globaldenso.eca0027.core.business.service.W1007ExpRequestDtlService;
import com.globaldenso.eca0027.core.business.service.W1007ExpRequestService;
import com.globaldenso.eca0027.core.business.service.W1007PltzWkService;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractTransactFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;

/**
 * The Register service facade implementation class of Staging Instruction Register screen
 * <br />荷揃え指示Register画面の登録facadeサービス実装クラスです。
 * <pre>
 * bean id:w4004RegisterFacadeService
 * </pre>
 *
 * @author $Author: masaki_awata@dnitsol.com $
 * @version $Revision: 5446 $
 */
public class W1007CancelFacadeServiceImpl extends
    AbstractTransactFacadeService<List<? extends W1007ListDomain>, W1007UpdateDomain> {
    
    /**
     * Common service.
     */
    protected CommonService commonService;

    /**
     * W1007ExpRequest Service.
     */
    protected W1007ExpRequestService w1007ExpRequestService; 
    /**
     * W1007PltzWk Service.
     */
    protected W1007PltzWkService w1007PltzWkService; 
    /**
     * W1007ExpRequestDtl Service.
     */
    protected W1007ExpRequestDtlService w1007ExpRequestDtlService; 
    /**
     * W1007ExpRequestDtlKit Service.
     */
    protected W1007ExpRequestDtlKitService w1007ExpRequestDtlKitService; 
    /**
     * TmCd Service.
     */
    protected TmCdService tmCdService;
    /**
     * constructor.
     */
    public W1007CancelFacadeServiceImpl() {
    }

     /**
     * <p>Setter method for w1007PltzWkService.</p>
     *
     * @param pltzWkService Set for w1007PltzWkService
     */
    public void setW1007PltzWkService(W1007PltzWkService pltzWkService) {
        w1007PltzWkService = pltzWkService;
    }

    /**
     * <p>Setter method for w1007ExpRequestService.</p>
     *
     * @param expRequestService Set for w1007ExpRequestService
     */
    public void setW1007ExpRequestService(W1007ExpRequestService expRequestService) {
        w1007ExpRequestService = expRequestService;
    }

    /**
     * <p>Setter method for tmCdService.</p>
     *
     * @param tmCdService Set for tmCdService
     */
    public void setTmCdService(TmCdService tmCdService) {
        this.tmCdService = tmCdService;
    }

    /**
     * <p>Setter method for w1007ExpRequestDtlKitService.</p>
     *
     * @param expRequestDtlKitService Set for w1007ExpRequestDtlKitService
     */
    public void setW1007ExpRequestDtlKitService(W1007ExpRequestDtlKitService expRequestDtlKitService) {
        w1007ExpRequestDtlKitService = expRequestDtlKitService;
    }

    /**
     * <p>Setter method for w1007ExpRequestDtlService.</p>
     *
     * @param expRequestDtlService Set for w1007ExpRequestDtlService
     */
    public void setW1007ExpRequestDtlService(W1007ExpRequestDtlService expRequestDtlService) {
        w1007ExpRequestDtlService = expRequestDtlService;
    }


    /**
     * Setter method for commonService.
     *
     * @param commonService Set for commonService
     */
    public void setCommonService(CommonService commonService) {
        this.commonService = commonService;
    }
    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * No Action
     * </pre>
     * <pre>
     * 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W1007UpdateDomain filterDomain(W1007UpdateDomain argDomain)
        throws GscmApplicationException, ApplicationException {
        return argDomain;
    }
    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * No Action
     * </pre>
     * <pre>
     * 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W1007UpdateDomain filterDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        // TODO Auto-generated method stub
        
    }
    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * No Action
     * </pre>
     * <pre>
     * 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W1007UpdateDomain filterDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        // TODO Auto-generated method stub
        
    }
    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - Common error checking
     *       Screen definition document_ECA0027_W2001_Palletize Instruction Main Screen.xls "a screen item definition" is referred to for details.
     *       
     * - 共通エラーチェック
     *     詳細は画面定義書_ECA0027_W2001_Palletize Instruction Main Screen.xls「画面項目定義」を参照
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W1007UpdateDomain filterDomain) throws GscmApplicationException,
        ValidationException, ApplicationException {
        List<MessageDomain> errList = new ArrayList<MessageDomain>();
        
        //Variable for check item
        boolean checkSelected = false;
        
        //Get checkbox from jsp page
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        String []ck = new String [filterDomain.getListDomainList().size()];
        if( filterDomain.getChk() != null && filterDomain.getChk().trim().length() > 0 )
        {
            ck = filterDomain.getChk().split(",");
            for(int i = 0; i < ck.length; i++){
                //Keep value to map
                map.put(Integer.parseInt(ck[i]), Integer.parseInt(ck[i]));
            }
            
        }
        
        //Convert W1007Listdomain to W1007ExpRequestDtlDomain
        List<W1007ExpRequestDtlDomain> w1007ExpRequestDtlDomain = convertToW1007ExpRequestDtlDomain(filterDomain.getListDomainList());
        if (w1007ExpRequestDtlDomain != null) {
            int index = 0;
            for (W1007ExpRequestDtlDomain domain : w1007ExpRequestDtlDomain) {
                // CheckBox
                if(map.get(index) != null){//if (CHECK_ON.equals(domain.getSelected())) {
                    checkSelected = true;
                    // Packing Status is not 'NOT PACKED'
                    if(!domain.getPackingStatusCode().equals(NOT_PACKED)) 
                    {
                        //Setting error message
                        Object [] param = new Object[1];
                        param[0] = getMessageValue(domain.getPackingStatusCode(), FUNC_PACKING_STATUS);
                        MessageDomain msgUpdateStatus = new MessageDomain("", NXS_E1_3001, param);
                        errList.add(msgUpdateStatus);
                        break;
                    }
                
                }
                index++;
            }
            //Not CheckBox
            if(!checkSelected) 
            {
                //Setting error message
                MessageDomain msgUpdateStatus = new MessageDomain("", NXS_E7_3007, null);
                errList.add(msgUpdateStatus);
            }
        }
        // Error check
        // エラー確認
        if (0 < errList.size()) {
            throw new ValidationException(errList);
        }
     
    }
    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - retrieval-result-data acquisition
     * </pre>
     * <pre>
     * - 検索結果データ取得
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected List<? extends W1007ListDomain> callServices(W1007UpdateDomain updateDomain) throws GscmApplicationException,
        ApplicationException {
        W1007ExpRequestDtlCriteriaDomain  w1007ExpRequestDtlcriteriaDomain = new W1007ExpRequestDtlCriteriaDomain();
        int index = 0;
        W1007ExpRequestDtlDomain parentHidden = null;
        
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        String []ck = new String [updateDomain.getListDomainList().size()];
        if( updateDomain.getChk() != null && updateDomain.getChk().trim().length() > 0 )
        {
            ck = updateDomain.getChk().split(",");
            for(int i = 0; i < ck.length; i++){
                map.put(Integer.parseInt(ck[i]), Integer.parseInt(ck[i]));
            }
            
        }
        
        //Convert W1007ListDomain to W1007ExpRequestDtlDomain
        List<W1007ExpRequestDtlDomain> w1007ExpRequestDtlDomain = convertToW1007ExpRequestDtlDomain(updateDomain.getListDomainList());
        if (w1007ExpRequestDtlDomain != null) {
            int indexArray = 0;
            for (W1007ExpRequestDtlDomain domain : w1007ExpRequestDtlDomain) {
                // checkBox
                if(map.get(indexArray) != null){//if (CHECK_ON.equals(domain.getSelected())) {
                    if(domain.getLineNo() == null) //For KIT
                    {
                        // The information from a screen is set to criteria.
                        W1007ExpRequestDtlKitCriteriaDomain kitCriteriaDomain = new W1007ExpRequestDtlKitCriteriaDomain();
                        kitCriteriaDomain.setExpRequestNo(domain.getExpRequestNo());
                        w1007ExpRequestDtlcriteriaDomain.setExpRequestNo(domain.getExpRequestNo());
                        kitCriteriaDomain.setExpRequestItemId(domain.getExpRequestItemId());
                        kitCriteriaDomain.setKitBrch(new BigDecimal(domain.getItem()));
                        kitCriteriaDomain.setExpRequestKitId(new BigDecimal( domain.getExpRequestKitId()));
                        
                        // Search By Key
                        W1007ExpRequestDtlKitDomain kitDomain = w1007ExpRequestDtlKitService.searchByKey(kitCriteriaDomain);
                        
                        if(kitDomain != null)
                        {
                            // Update Packing Status
                            kitDomain.setPackingStatus(NOT_RECEIVED);
                            kitDomain.setComUpdateFuncId(updateDomain.getScreenId());
                            kitDomain.setComUpdateUserId(updateDomain.getLoginUserDscId());
                            w1007ExpRequestDtlKitService.update(kitDomain);
                            
                            // Delete data in TW_EXP_REQUEST_PLTZ
                            // The information from a screen is set to criteria.
                            W1007PltzWkCriteriaDomain criteriaDomain = new W1007PltzWkCriteriaDomain();
                            criteriaDomain.setExpRequestNo(domain.getExpRequestNo());
                            criteriaDomain.setExpRequestItemId(domain.getExpRequestItemId());
                            criteriaDomain.setKitBrch(new BigDecimal(domain.getItem()));
                            criteriaDomain.setExpRequestKitId(new BigDecimal( domain.getExpRequestKitId()));
                            
                            //Search By Key
                            List<W1007PltzWkDomain> w1007PltzWkDomainList = w1007PltzWkService.searchByCondition(criteriaDomain);
                            if(w1007PltzWkDomainList != null && w1007PltzWkDomainList.size() > 0){
                                for(W1007PltzWkDomain w1007PltzWkDomain : w1007PltzWkDomainList){
                                    //Convert W1007PltzWkDomain to W1007PltzWkCriteriaDomain
                                    W1007PltzWkCriteriaDomain criteria = convertToW1007PltzWkCriteriaDomain(w1007PltzWkDomain);
                                    //Delete
                                    w1007PltzWkService.delete(criteria);
                                }
                            }
                        }
                    }else{//For Parent
                        // The information from a screen is set to criteria.
                        W1007ExpRequestDtlCriteriaDomain criteriaDomain = new W1007ExpRequestDtlCriteriaDomain();
                        criteriaDomain.setExpRequestNo(domain.getExpRequestNo());
                        w1007ExpRequestDtlcriteriaDomain.setExpRequestNo(domain.getExpRequestNo());
                        criteriaDomain.setExpRequestItemId(domain.getExpRequestItemId());
                        criteriaDomain.setLineNo(domain.getLineNo());
                        
                        // Search By Key
                        W1007ExpRequestDtlDomain expRequestDtldomain = w1007ExpRequestDtlService.searchByKey(criteriaDomain);
                        if(expRequestDtldomain != null)
                        {
                            // Update Packing Status
                            expRequestDtldomain.setPackingStatus(NOT_RECEIVED);
                            expRequestDtldomain.setComUpdateFuncId(updateDomain.getScreenId());
                            expRequestDtldomain.setComUpdateUserId(updateDomain.getLoginUserDscId());
                            w1007ExpRequestDtlService.update(expRequestDtldomain);
                            
                            //Delete data in TW_EXP_REQUEST_PLTZ
                            // The information from a screen is set to criteria.
                            W1007PltzWkCriteriaDomain w1007PltzWkCriteriaDomain = new W1007PltzWkCriteriaDomain();
                            w1007PltzWkCriteriaDomain.setExpRequestNo(domain.getExpRequestNo());
                            w1007PltzWkCriteriaDomain.setExpRequestItemId(domain.getExpRequestItemId());
                            w1007PltzWkCriteriaDomain.setLineNo(domain.getLineNo());
                            //Search By Key
                            List<W1007PltzWkDomain> w1007PltzWkDomainList = w1007PltzWkService.searchByCondition(w1007PltzWkCriteriaDomain);
                            if(w1007PltzWkDomainList != null && w1007PltzWkDomainList.size() > 0){
                                for(W1007PltzWkDomain w1007PltzWkDomain : w1007PltzWkDomainList){
                                    //Convert W1007PltzWkDomain to W1007PltzWkCriteriaDomain
                                    W1007PltzWkCriteriaDomain criteria = convertToW1007PltzWkCriteriaDomain(w1007PltzWkDomain);
                                    //Delete
                                    w1007PltzWkService.delete(criteria);
                                }
                            }
                        }
                    }
                }
                indexArray++;
            }
            
            //Update Exp Request Status (if Packing status is all 10 then Exp Request Status is 30)            
            //Search All
            List<W1007ExpRequestDtlDomain> resultList = w1007ExpRequestDtlService.searchParentKitByCondition(w1007ExpRequestDtlcriteriaDomain);
            
            //RemoveParent ( If it has kits then show only kits )
            resultList = removeParent(resultList);
            
            //FilterParent ( If no kits then validate parent (which no kits in other status) )
            resultList = filterParent(resultList);
            
            // Not update parent hidden
            boolean isCancel = true;
            for(W1007ExpRequestDtlDomain domain : resultList)
            {
                if(!domain.isVisibleFlag())
                {
                    parentHidden = domain;
                }else{
                    if(index + 1 < resultList.size())
                    {
                        W1007ExpRequestDtlDomain nextItem = resultList.get(++index);
                        //Next parent
                        if(nextItem.getLineNo() != null && parentHidden != null && isCancel)
                        {
                            W1007ExpRequestDtlCriteriaDomain criteriaDomain = new W1007ExpRequestDtlCriteriaDomain();
                            criteriaDomain.setExpRequestNo(parentHidden.getExpRequestNo());
                            criteriaDomain.setExpRequestItemId(parentHidden.getExpRequestItemId());
                            criteriaDomain.setLineNo(parentHidden.getLineNo());
                            //Search By Key
                            W1007ExpRequestDtlDomain expRequestdomain = w1007ExpRequestDtlService.searchByKey(criteriaDomain);
                            if(expRequestdomain != null)
                            {
                                //Update packing status
                                expRequestdomain.setPackingStatus(NOT_RECEIVED);
                                expRequestdomain.setComUpdateFuncId(updateDomain.getScreenId());
                                expRequestdomain.setComUpdateUserId(updateDomain.getLoginUserDscId());
                                w1007ExpRequestDtlService.update(expRequestdomain);
                                
                                parentHidden.setPackingStatus(NOT_RECEIVED);
                                
                            }
                            parentHidden = null;
                            isCancel = true;
                        }else{
                            if(domain.getPackingStatus().equals(NOT_PACKED) || domain.getPackingStatus().equals(CASEMARK)){
                                isCancel = false;
                            }
                        }
                    }else if(parentHidden != null && isCancel){
                        W1007ExpRequestDtlCriteriaDomain criteriaDomain = new W1007ExpRequestDtlCriteriaDomain();
                        criteriaDomain.setExpRequestNo(parentHidden.getExpRequestNo());
                        criteriaDomain.setExpRequestItemId(parentHidden.getExpRequestItemId());
                        criteriaDomain.setLineNo(parentHidden.getLineNo());
                        //Search By Key
                        W1007ExpRequestDtlDomain expRequestdomain = w1007ExpRequestDtlService.searchByKey(criteriaDomain);
                        if(expRequestdomain != null)
                        {
                            //Update packing status
                            expRequestdomain.setPackingStatus(NOT_RECEIVED);
                            expRequestdomain.setComUpdateFuncId(updateDomain.getScreenId());
                            expRequestdomain.setComUpdateUserId(updateDomain.getLoginUserDscId());
                            w1007ExpRequestDtlService.update(expRequestdomain);
                            
                            parentHidden.setPackingStatus(NOT_RECEIVED);
                        }
                        parentHidden = null;
                        isCancel = true;
                    }
                }
            }
            
            //Update Exp Request Status (if Packing status is all 10 then Exp Request Status is 30)
            if(resultList != null && resultList.size() > 0)
            {
                //Variable check item
                boolean cancleAll = true;
                for(W1007ExpRequestDtlDomain domain : resultList)
                {
                    if(domain.isVisibleFlag() && !domain.getPackingStatus().equals(NOT_RECEIVED))
                    {
                        cancleAll = false;
                        break;
                    }
                }
                if(cancleAll) // Change Exp Request Status is 30 
                {
                    for(W1007ExpRequestDtlDomain domain : resultList)
                    {
                        // The information from a screen is set to criteria.
                        W1007ExpRequestCriteriaDomain criteriaDomain = new W1007ExpRequestCriteriaDomain();
                        criteriaDomain.setExpRequestNo(domain.getExpRequestNo());
                        // Search By Key
                        W1007ExpRequestDomain result = (W1007ExpRequestDomain)w1007ExpRequestService.searchByKey(criteriaDomain);
                        if(result != null)
                        {
                            // Update request status
                            result.setRequestStatus(NOT_RECEIVED_PACKING);
                            result.setComUpdateFuncId(updateDomain.getScreenId());
                            result.setComUpdateUserId(updateDomain.getLoginUserDscId());
                            w1007ExpRequestService.update(result);
                            updateDomain.getCriteriaDomain().setRequestStatus(getMessageValue(NOT_RECEIVED_PACKING, FUNC_PALLETIZE_INSTRUCTION));
                            break;
                        }
                    }
                }
                
            }
        }
        return updateDomain.getListDomainList();
    }
    /**
     *    The name of the input method (Manual) is acquired.
     * <br />入力方法(Manual)の名称を取得します。
     *
     * @param cd String
     * @param cdType String
     * @return The name of the input method<br />入力方法の名称
     * @throws ApplicationException When the input method is unacquirable<br />入力方法が取得できない場合
     */
    protected String getMessageValue(String cd , String cdType) throws ApplicationException {
        // Setting of a search condition
        // 検索条件の設定
        TmCdCriteriaDomain criteria = new TmCdCriteriaDomain();
        criteria.setLngCd(LANGUAGE_CD_ENGLISH);
        criteria.setCdTyp(cdType);
        criteria.setCd(cd);

        // Acquisition of a name
        // 名称の取得
        return cd + " : " + tmCdService.searchByKey(criteria).getValue();
    }
    
    /**
     * Convert W1007ListDomain to W1007ExpRequestDtlDomain
     *
     * @param listDomain List<? extends W1007ListDomain>
     * @return listDomain List<W1007ExpRequestDtlDomain>
     */
    protected List<W1007ExpRequestDtlDomain> convertToW1007ExpRequestDtlDomain(List<? extends W1007ListDomain> listDomain) {
        List<W1007ExpRequestDtlDomain> listDomainList = new ArrayList<W1007ExpRequestDtlDomain>();
        if (listDomain != null && listDomain.size() > 0) {
            for (W1007ListDomain domain : listDomain) {
                W1007ExpRequestDtlDomain criteria = new W1007ExpRequestDtlDomain();
                // Copy of property
                // プロパティのコピー
                CommonUtil.copyPropertiesDomainToDomain(criteria, domain);
                listDomainList.add(criteria);
            }
        }
        
        return listDomainList;
    }
    /**
     * Convert W1007PltzWkDomain to W1007PltzWkCriteriaDomain
     *
     * @param domain W1007ExpRequestDtlKitDomain
     * @return w1007PltzWkCriteriaDomain W1007PltzWkCriteriaDomain
     */
    protected W1007PltzWkCriteriaDomain convertToW1007PltzWkCriteriaDomain(W1007PltzWkDomain domain) {
        W1007PltzWkCriteriaDomain w1007PltzWkCriteriaDomain = new W1007PltzWkCriteriaDomain();
        // Copy of property
        // プロパティのコピー
        CommonUtil.copyPropertiesDomainToDomain(w1007PltzWkCriteriaDomain, domain);
        return w1007PltzWkCriteriaDomain;
    }
    /** RemoveParent If it has kits then show only kits
    *
    * @param expRequestDtlList W1007ExpRequestDtlDomain List
    * @return list List<W1007ExpRequestDtlDomain>
    */
    protected List<W1007ExpRequestDtlDomain> removeParent(List<? extends W1007ExpRequestDtlDomain> expRequestDtlList) {
        List<W1007ExpRequestDtlDomain> listDomainList = new ArrayList<W1007ExpRequestDtlDomain>();
        if (expRequestDtlList != null && expRequestDtlList.size() > 0) {
            for (int i = 0; i < expRequestDtlList.size(); i++ ) {
                W1007ExpRequestDtlDomain domainParent = (W1007ExpRequestDtlDomain)expRequestDtlList.get(i);
                if(i + 1 < expRequestDtlList.size())
                {
                    W1007ExpRequestDtlDomain domainChild = (W1007ExpRequestDtlDomain)expRequestDtlList.get( i + 1);
                    if(domainChild != null && domainParent.getLineNo() != null && domainChild.getExpRequestItemId().intValue() == domainParent.getExpRequestItemId().intValue() && domainChild.getLineNo() == null )
                    {
                        domainParent.setVisibleFlag(false);
                    }else{
                        //Add data to List
                        domainParent.setVisibleFlag(true);
                    }
                }else{
                    //Add data to List
                    domainParent.setVisibleFlag(true);
                   
                }
                
                // Set mainmark is empty when Packing status < 30 
                if(domainParent.getPackingStatus() != null && Integer.parseInt(domainParent.getPackingStatus()) < 30 )
                {
                    domainParent.setMainMark("");
                    domainParent.setPalletNo("");
                }
                listDomainList.add(domainParent);
            }
        }
       
        return listDomainList;
    }
   /**FilterParent If no kits then validate parent (which no kits in other status) 
   *
   * @param expRequestDtlList W1007ExpRequestDtlDomain List
   * @return W1007ExpRequestDtlDomain result
   * @throws GscmApplicationException gscmApplicationException
   * @throws ApplicationException applicationException
   */
    protected List<W1007ExpRequestDtlDomain> filterParent(List<? extends W1007ExpRequestDtlDomain> expRequestDtlList) throws GscmApplicationException, ApplicationException {
        List<W1007ExpRequestDtlDomain> listDomainList = new ArrayList<W1007ExpRequestDtlDomain>();
        if (expRequestDtlList != null && expRequestDtlList.size() > 0) {
            for (int i = 0; i < expRequestDtlList.size(); i++ ) {
                W1007ExpRequestDtlDomain domain = expRequestDtlList.get(i);
                if(!domain.isVisibleFlag()){
                    listDomainList.add(domain);
                }else{
                  //Setting default flag each item
                    domain.setPalletTempFlag(false);
                    if(domain.getPalletNo() != null  || domain.getPalletTemp() != null )
                    {
                      //Setting flag and palletNo each item 
                        domain.setPalletTempFlag(true);
                        if(domain.getPalletTemp() != null)
                        {
                            domain.setPalletNo(domain.getPalletTemp());
                        }
                        if(domain.getPackingStatus() != null && NOT_RECEIVED.equals(domain.getPackingStatus()) ){
                            domain.setPalletNo("");
                            domain.setPalletTempFlag(false);
                        }
                     
                    }
                      
                    // Check Parent have child ?
                    if(domain.getLineNo() != null && domain.getLineNo().intValue() > 0)
                    {
                        // The information from a screen is set to criteria.
                        W1007ExpRequestDtlKitCriteriaDomain kitCriteriaDomain = new W1007ExpRequestDtlKitCriteriaDomain();
                        kitCriteriaDomain.setExpRequestNo(domain.getExpRequestNo());
                        kitCriteriaDomain.setExpRequestItemId(domain.getExpRequestItemId());
                        //Search By Condition
                        List<W1007ExpRequestDtlKitDomain>  expRequestList = w1007ExpRequestDtlKitService.searchByCondition(kitCriteriaDomain);
                        if(expRequestList == null || expRequestList.size() == 0)
                        {
                            //Add data to List
                            listDomainList.add(domain);
                        }
                    }else{
                        //Add data to List
                        listDomainList.add(domain);
                    }
                }
            }
        }
      
        return listDomainList;
    }
}
