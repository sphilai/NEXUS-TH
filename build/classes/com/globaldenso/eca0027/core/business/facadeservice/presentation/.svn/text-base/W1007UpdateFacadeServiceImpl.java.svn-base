/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FUNC_PACKING_STATUS;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0024;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.LANGUAGE_CD_ENGLISH;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NOT_PACKED;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0048;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W1007;

import java.util.ArrayList;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCdCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.service.TmCdService;
import com.globaldenso.eca0027.core.business.domain.W1007ExpRequestDtlDomain;
import com.globaldenso.eca0027.core.business.domain.W1007ListDomain;
import com.globaldenso.eca0027.core.business.domain.W1007UpdateDomain;
import com.globaldenso.eca0027.core.business.domain.W1008PltzDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W1008PltzCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W1007PltzWkService;
import com.globaldenso.eca0027.core.business.service.W1008PltzService;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractTransactFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CheckUtil;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.Validator;

/**
 * The Register service facade implementation class of Export Request Header screen
 * <br />荷揃え指示Register画面の登録facadeサービス実装クラスです。
 * <pre>
 * bean id:w1007UpdateFacadeService
 * </pre>
 *
 * @author $Author: DCS
 * @version $Revision: 5446 $
 */
public class W1007UpdateFacadeServiceImpl extends
    AbstractTransactFacadeService<W1007UpdateDomain, W1007UpdateDomain> {
    
    /**
     * Common service.
     */
    protected CommonService commonService;

    /**
     * W1007PltzWkService service.
     */
    protected W1007PltzWkService w1007PltzWkService; 
    
    /**
     * TmCdService service.
     */
    protected TmCdService tmCdService;
    /**
     * W1008PltzService service.
     */
    protected W1008PltzService w1008PltzService;
    
    
    /**
     * constructor.
     */
    public W1007UpdateFacadeServiceImpl() {
    }

     /**
     * <p>Setter method for w1008PltzService.</p>
     *
     * @param pltzService Set for w1008PltzService
     */
    public void setW1008PltzService(W1008PltzService pltzService) {
        w1008PltzService = pltzService;
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
     * <p>Setter method for w1007PltzWkService.</p>
     *
     * @param pltzWkService Set for w1007PltzWkService
     */
    public void setW1007PltzWkService(W1007PltzWkService pltzWkService) {
        w1007PltzWkService = pltzWkService;
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
        // Validate Pallet No not Register
        for(W1007ListDomain domain : filterDomain.getListDomainList())
        {
            if(domain.isVisibleFlag() && domain.getPackingStatusCode() != null && NOT_PACKED.equalsIgnoreCase(domain.getPackingStatusCode()))
            {
                // The information from a screen is set to criteria.
                W1008PltzCriteriaDomain criteriaDomain = new W1008PltzCriteriaDomain();
                criteriaDomain.setExpRequestNo(domain.getExpRequestNo());
                criteriaDomain.setPalletNo(domain.getPalletNo());
                criteriaDomain.setLanguageCd(filterDomain.getLanguageCd());
                // Search By Condition
                List<W1008PltzDomain> result = w1008PltzService.searchByCondition(criteriaDomain);
                if(result != null && result.size() > 0)
                {
                    // Setting error message
                    List<MessageDomain> errList = new ArrayList<MessageDomain>();
                    MessageDomain msgUpdateStatus = new MessageDomain("", NXS_E7_0048, null);
                    errList.add(msgUpdateStatus);
                    throw new ValidationException(errList);
                }
            }
        }
       
        
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
        if (filterDomain.getListDomainList() == null || filterDomain.getListDomainList().isEmpty()) {
            // When there is no list data
            // 一覧データがない場合
            return;
        }
        for (int i = 0; i < filterDomain.getListDomainList().size(); i++) {
            W1007ListDomain listDomain = filterDomain.getListDomainList().get(i);
            listDomain.setLocale(filterDomain.getLocale());
            Validator<W1007ListDomain> valid = new Validator<W1007ListDomain>(listDomain, "W1007ListDomain", i);
            // Packing Status is not 'NOT PACKED'
            if(!listDomain.getPackingStatusCode().equals(NOT_PACKED))
            {
               /* //Setting error mesage
                Object [] param=new Object[1];
                param[0]=getMessageValue(listDomain.getPackingStatusCode());
                MessageDomain msgUpdateStatus = new MessageDomain("", NXS_E1_3001, param);
                errList.add(msgUpdateStatus);
                break;*/
            }else if (listDomain.isVisibleFlag() && CheckUtil.isBlankOrNull(listDomain.getPalletNo())) {
                // Unary eye check
                // 単項目チェック
                String[] properties = { 
                    "palletNo"
                };
                valid.isValidateProperties(properties, SCREEN_ID_W1007);
                // Error check
                // エラー確認
                if (0 < valid.getErrList().size()) {
                    errList.addAll(valid.getErrList());
                    break;
                }
            }else if(listDomain.isVisibleFlag() && !isNumeric(listDomain.getPalletNo())){
                // Setting error mesage
                Object[] obj = new Object[10];
                obj[0] = "Pallet No.";
                MessageDomain msgUpdateStatus = new MessageDomain("", GSCM_E0_0024, obj);
                errList.add(msgUpdateStatus);
                break;
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
    protected W1007UpdateDomain callServices(W1007UpdateDomain filterDomain) throws GscmApplicationException,
        ApplicationException {
       
        return w1007PltzWkService.transactOnDetailSave(filterDomain);
    }
    /**
     *    The name of the input method (Manual) is acquired.
     * <br />入力方法(Manual)の名称を取得します。
     *
     * @param cd LANGUAGE CODE<br />言語コード
     * @return The name of the input method<br />入力方法の名称
     * @throws ApplicationException When the input method is unacquirable<br />入力方法が取得できない場合
     */
    protected String getMessageValue(String cd ) throws ApplicationException {
        // Setting of a search condition
        // 検索条件の設定
        TmCdCriteriaDomain criteria = new TmCdCriteriaDomain();
        criteria.setLngCd(LANGUAGE_CD_ENGLISH);
        criteria.setCdTyp(FUNC_PACKING_STATUS);
        criteria.setCd(cd);

        // Acquisition of a name
        // 名称の取得
        return tmCdService.searchByKey(criteria).getValue();
    }
    /**
     * IsNumeric
     *
     * @param str String
     * @return Boolean
     */
    protected  boolean isNumeric(String str)  
    {  
        try  
        {  
            Integer.parseInt(str);  
        }catch(NumberFormatException nfe){  
            return false;  
        }  
        return true;  
    }
    
    /**
     *   ConvertToW1007ExpRequestDtlDomain
     * <br />入力方法(Manual)の名称を取得します。
     *
     * @param listDomain List<? extends W1007ListDomain>
     * @return W1007ExpRequestDtlDomain List
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
