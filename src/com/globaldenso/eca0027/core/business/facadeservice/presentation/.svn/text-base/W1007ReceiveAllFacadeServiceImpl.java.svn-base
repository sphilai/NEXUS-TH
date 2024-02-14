/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CASEMARK;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FUNC_PALLETIZE_INSTRUCTION;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.LANGUAGE_CD_ENGLISH;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NOT_PACKED;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NOT_PACKED_EXP;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCdCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.service.TmCdService;
import com.globaldenso.eca0027.core.business.domain.W1007ExpRequestDomain;
import com.globaldenso.eca0027.core.business.domain.W1007ExpRequestDtlDomain;
import com.globaldenso.eca0027.core.business.domain.W1007ExpRequestDtlKitDomain;
import com.globaldenso.eca0027.core.business.domain.W1007ListDomain;
import com.globaldenso.eca0027.core.business.domain.W1007UpdateDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W1007ExpRequestCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W1007ExpRequestDtlCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W1007ExpRequestDtlKitCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W1007ExpRequestDtlKitService;
import com.globaldenso.eca0027.core.business.service.W1007ExpRequestDtlService;
import com.globaldenso.eca0027.core.business.service.W1007ExpRequestService;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractTransactFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;

/**
 * The ReceiveAll service facade implementation class of Export Request Header screen.
 * <br />荷揃え指示Register画面の登録facadeサービス実装クラスです。
 * <pre>
 * bean id:w1007ReceiveAllFacadeService
 * </pre>
 *
 * @author $Author: DCS
 * @version $Revision: 5446 $
 */
public class W1007ReceiveAllFacadeServiceImpl extends
    AbstractTransactFacadeService<W1007UpdateDomain, W1007UpdateDomain> {
    
    /**
     * Common service.
     */
    protected CommonService commonService;

    /**
     * W1007ExpRequest Service.
     */
    protected W1007ExpRequestService w1007ExpRequestService; 
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
    public W1007ReceiveAllFacadeServiceImpl() {
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
        /*List<MessageDomain> errList = new ArrayList<MessageDomain>();
        //Convert W1007ListDomain to W1007ExpRequestDtlDomain
        List<W1007ExpRequestDtlDomain> w1007ExpRequestDtlDomain=convertToW1007ExpRequestDtlDomain(filterDomain.getListDomainList());
        if (w1007ExpRequestDtlDomain != null) {
            for (W1007ExpRequestDtlDomain domain : w1007ExpRequestDtlDomain) {
                    // Packing Status is not 'NOT RECEIVED'
                    if(!domain.getPackingStatusCode().equals(NOT_RECEIVED))
                    {
                        //Setting error Message
                        Object [] param=new Object[1];
                        param[0]=getMessageValue(domain.getPackingStatusCode());
                        MessageDomain msgUpdateStatus = new MessageDomain("", NXS_E1_3001, param);
                        errList.add(msgUpdateStatus);
                        break;
                    }
            }
        }
        // Error check
        // エラー確認
        if (0 < errList.size()) {
            throw new ValidationException(errList);
        }*/
     
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
    protected W1007UpdateDomain callServices(W1007UpdateDomain filterDomain) throws GscmApplicationException,
        ApplicationException {
        HashMap<String, String> expRequestNoMap = new HashMap<String, String>();
        HashMap<String, String> expRequestNoParentMap = new HashMap<String, String>();
        int totalUpdate = 0;
        W1007ExpRequestDtlDomain parentHidden = null;
        List<W1007ExpRequestDtlDomain> w1007ExpRequestDtlDomain = convertToW1007ExpRequestDtlDomain(filterDomain.getListDomainList());
        if (w1007ExpRequestDtlDomain != null) {
            for (W1007ExpRequestDtlDomain domain : w1007ExpRequestDtlDomain) {
                // In grid, status for receive 
                if(!domain.getPackingStatusCode().equals(NOT_PACKED) && !domain.getPackingStatusCode().equals(CASEMARK) ){
                // Parent hidden
                    if(!domain.isVisibleFlag())
                    {
                        parentHidden = domain;
                    }else{
                        // checkBox
                        if(domain.getLineNo() == null) //KIT
                        {
                            // The information from a screen is set to criteria.
                            W1007ExpRequestDtlKitCriteriaDomain kitCriteriaDomain = new W1007ExpRequestDtlKitCriteriaDomain();
                            kitCriteriaDomain.setExpRequestNo(domain.getExpRequestNo());
                            kitCriteriaDomain.setExpRequestItemId(domain.getExpRequestItemId());
                            kitCriteriaDomain.setKitBrch(new BigDecimal(domain.getItem()));
                            kitCriteriaDomain.setExpRequestKitId(new BigDecimal( domain.getExpRequestKitId()));
                            // Search By Key
                            W1007ExpRequestDtlKitDomain kitDomain = w1007ExpRequestDtlKitService.searchByKey(kitCriteriaDomain);
                            if(kitDomain != null)
                            {
                                // Update packing status
                                kitDomain.setPackingStatus(NOT_PACKED);
                                kitDomain.setComUpdateFuncId(filterDomain.getScreenId());
                                kitDomain.setComUpdateUserId(filterDomain.getLoginUserDscId());
                                w1007ExpRequestDtlKitService.update(kitDomain);
                                // Setting data to hashMap for update exp Request Status
                                expRequestNoMap.put(domain.getExpRequestNo(), domain.getExpRequestNo());
                                // Set key to hashmap
                                if(parentHidden != null){
                                    if(domain.getExpRequestNo().equals(parentHidden.getExpRequestNo()) && domain.getExpRequestItemId().intValue() == parentHidden.getExpRequestItemId().intValue())
                                    {
                                        String key = parentHidden.getExpRequestNo() + "#" + parentHidden.getExpRequestItemId() + "#" + parentHidden.getLineNo();
                                        expRequestNoParentMap.put(key, key);
                                    }
                                    parentHidden = null;
                                }
                                totalUpdate++;
                            }
                            
                        }else{// Parent
                            // The information from a screen is set to criteria.
                            W1007ExpRequestDtlCriteriaDomain criteriaDomain = new W1007ExpRequestDtlCriteriaDomain();
                            criteriaDomain.setExpRequestNo(domain.getExpRequestNo());
                            criteriaDomain.setExpRequestItemId(domain.getExpRequestItemId());
                            criteriaDomain.setLineNo(domain.getLineNo());
                            // Search By Key
                            W1007ExpRequestDtlDomain expRequestdomain = w1007ExpRequestDtlService.searchByKey(criteriaDomain);
                            if(expRequestdomain != null)
                            {
                                // Update packing status
                                expRequestdomain.setPackingStatus(NOT_PACKED);
                                expRequestdomain.setComUpdateFuncId(filterDomain.getScreenId());
                                expRequestdomain.setComUpdateUserId(filterDomain.getLoginUserDscId());
                                w1007ExpRequestDtlService.update(expRequestdomain);
                                // Setting data to hashMap for update exp Request Status
                                expRequestNoMap.put(domain.getExpRequestNo(), domain.getExpRequestNo());
                                totalUpdate++;
                            }
                        }
                    }
                }
            }
            // Update Status Exp Request Status
            Set<String> keys = expRequestNoMap.keySet();
            for(String key : keys){
                // The information from a screen is set to criteria.
                W1007ExpRequestCriteriaDomain criteriaDomain = new W1007ExpRequestCriteriaDomain();
                criteriaDomain.setExpRequestNo(key);
                // Search By Key
                W1007ExpRequestDomain result = (W1007ExpRequestDomain)w1007ExpRequestService.searchByKey(criteriaDomain);
                if(result != null && Integer.parseInt(result.getRequestStatus()) <= Integer.parseInt(NOT_PACKED_EXP))
                {
                    // Update request status
                    result.setRequestStatus(NOT_PACKED_EXP);
                    result.setComUpdateFuncId(filterDomain.getScreenId());
                    result.setComUpdateUserId(filterDomain.getLoginUserDscId());
                    w1007ExpRequestService.update(result);
                    filterDomain.getCriteriaDomain().setRequestStatus(getMessageValue(NOT_PACKED_EXP, FUNC_PALLETIZE_INSTRUCTION));
                }
               
            }
            // Not update parent hidden
            keys = expRequestNoParentMap.keySet();
            for(String key : keys)
            {
                String[] strSplit = key.split("#");
                W1007ExpRequestDtlCriteriaDomain criteriaDomain = new W1007ExpRequestDtlCriteriaDomain();
                if(strSplit.length == 3){
                    criteriaDomain.setExpRequestNo(strSplit[0]);
                    criteriaDomain.setExpRequestItemId(new BigDecimal(strSplit[1]));
                    criteriaDomain.setLineNo(new BigDecimal(strSplit[2]));
                    // Search By Key
                    W1007ExpRequestDtlDomain expRequestdomain = w1007ExpRequestDtlService.searchByKey(criteriaDomain);
                    if(expRequestdomain != null)
                    {
                        // Update packing status
                        expRequestdomain.setPackingStatus(NOT_PACKED);
                        expRequestdomain.setComUpdateFuncId(filterDomain.getScreenId());
                        expRequestdomain.setComUpdateUserId(filterDomain.getLoginUserDscId());
                        w1007ExpRequestDtlService.update(expRequestdomain);
                    }
                }
            }
        }
        filterDomain.setTotalUpdate(totalUpdate);
        return filterDomain;
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
    protected String getMessageValue(String cd, String cdType ) throws ApplicationException {
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
        if(listDomain != null && listDomain.size() > 0){
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
}
