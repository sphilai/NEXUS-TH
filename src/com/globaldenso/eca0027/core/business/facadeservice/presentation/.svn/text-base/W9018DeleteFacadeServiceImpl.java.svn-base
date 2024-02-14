/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0009;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0004;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

import org.apache.commons.lang.StringUtils;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W9018ListDomain;
import com.globaldenso.eca0027.core.business.domain.W9018UpdateDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W9018ExpFmlByItemMaCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W9018ExpFmlByItemMaService;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractDeleteFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;

/**
 *  The implementation class of Facade service to delete action of Export Formalities by Item
 *  MA Inquiry screen.
 * <br />Export Formalities by Item MA Inquiry画面のDeleteアクションに対するFacadeサービスの実装クラスです。
 *
 * @author $Author: 400616000304 $
 * @version $Revision: 12609 $
 */
public class W9018DeleteFacadeServiceImpl extends
    AbstractDeleteFacadeService<Integer, W9018UpdateDomain> {
    
    /**
     * Service of Export Formalities by Item MA<br />
     * Export Formalities by Item MAのサービス
     */
    protected W9018ExpFmlByItemMaService w9018ExpFmlByItemMaService;

    /**
     * common services<br />
     * 共通サービス
     */
    protected CommonService commonService;
    
    /**
     * Default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public W9018DeleteFacadeServiceImpl() {
    }

    /**
     * Getter method for w9018ExpFmlByItemMaService.
     *
     * @return the w9018ExpFmlByItemMaService
     */
    public W9018ExpFmlByItemMaService getW9018ExpFmlByItemMaService() {
        return w9018ExpFmlByItemMaService;
    }

    /**
     * Setter method for w9018ExpFmlByItemMaService.
     *
     * @param expFmlByItemMaService Set for w9018ExpFmlByItemMaService
     */
    public void setW9018ExpFmlByItemMaService(W9018ExpFmlByItemMaService expFmlByItemMaService) {
        w9018ExpFmlByItemMaService = expFmlByItemMaService;
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
     * {@inheritDoc}
     * <pre>
     * no action 
     * </pre>
     * <pre>
     * 処理なし
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W9018UpdateDomain filterDomain(W9018UpdateDomain updateDomain)
        throws GscmApplicationException, ApplicationException {
        
        // Detail line selection check 
        // 明細行選択チェック
        if (StringUtils.isEmpty(updateDomain.getCriteriaDomain().getSelected())) {
            List<MessageDomain> errList = Arrays.asList(new MessageDomain("", NXS_E7_0004, null));
            throw new ValidationException(errList);
        }
        
        // selected line is stored. 
        // 選択した行のみを格納
        int selectedRow = Integer.parseInt(updateDomain.getCriteriaDomain().getSelected());
        List<W9018ListDomain> listDomainList = new ArrayList<W9018ListDomain>();
        listDomainList.add(updateDomain.getListDomainList().get(selectedRow));
        
        updateDomain.setListDomainList(listDomainList);
        
        return updateDomain;
    }

    /**
     * {@inheritDoc}
     * <pre>
     * no action 
     * </pre>
     * <pre>
     * 処理なし
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W9018UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
    }

    /**
     * {@inheritDoc}
     * <pre>
     * Authority check
     * Past date check
     * </pre>
     * <pre>
     * 権限チェック
     * 過去日チェック
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W9018UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        
        W9018ListDomain listDomain = updateDomain.getListDomainList().get(0);
        
        // Authority check 
        // 権限チェック
        if(!w9018ExpFmlByItemMaService.validateConsistencyCompAuth(listDomain.getCompCd())){
            throw new ValidationException(Arrays.asList(new MessageDomain("", GSCM_I0_0009, null)));
        }
        
        // Check of a past day. 
        // 過去日チェック
        // UT422 DEL START
        //if(!w9018ExpFmlByItemMaService.validateConsistencyAfterDate(listDomain.getAplyStrtDt(), updateDomain.getCriteriaDomain().getScreenDateFormat(), listDomain.getCompCd())){
        //    Object[] params = {
        //        commonService.getResource(updateDomain.getCriteriaDomain().getLocale(), "label.aplyStrtDt")
        //    };
        //    String property = String.format("listDomainList[%d].aplyStrtDt", Integer.parseInt(updateDomain.getCriteriaDomain().getSelected()));
        //    throw new ValidationException(Arrays.asList(new MessageDomain(property, NXS_E7_0070, params)));
        //}
        // UT422 DEL END
    }

    /**
     * {@inheritDoc}
     * <pre>
     * no action 
     * </pre>
     * <pre>
     * 処理なし
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W9018UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
    }

    /**
     * {@inheritDoc}
     * <pre>
     * The physical delete the export procedures Part basic unit.
     * </pre>
     * <pre>
     * 輸出手続品番原単位を物理削除
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected Integer callServices(W9018UpdateDomain updateDomain) 
        throws GscmApplicationException, ApplicationException {
        
        W9018ExpFmlByItemMaCriteriaDomain criteriaDomain = createExpShippingItemSpInfoMaCriteria(updateDomain);
    
        return w9018ExpFmlByItemMaService.deleteOnInquiryDelete(criteriaDomain);
        
    }

    /**
     *  Based on (PL) Search criteria domain, create Search criteria domain (BL).
     * <br />検索条件ドメイン(PL)を基に、検索条件ドメイン(BL)を作成します。
     *
     * @param updateDomain Criteria domain of screen(PL)<br />
     * 画面の検索条件ドメイン(PL)
     * @return Criteria domain of User Id MA service<br />
     * User Id MA Editサービスの検索条件ドメイン(BL)
     */
    protected W9018ExpFmlByItemMaCriteriaDomain createExpShippingItemSpInfoMaCriteria(W9018UpdateDomain updateDomain) {
        
        W9018ExpFmlByItemMaCriteriaDomain userIdMaCriteria = new W9018ExpFmlByItemMaCriteriaDomain();
        
        CommonUtil.copyPropertiesDomainToDomain(userIdMaCriteria, updateDomain.getListDomainList().get(0), updateDomain.getCriteriaDomain().getScreenDateFormat());

        // setup for acquiring the maximum number 
        // 最大件数を取得するための設定
        userIdMaCriteria.setScreenId(updateDomain.getScreenId());
        userIdMaCriteria.setLocale(new Locale(updateDomain.getLanguageCd()));
        
        return userIdMaCriteria;
    }
}
