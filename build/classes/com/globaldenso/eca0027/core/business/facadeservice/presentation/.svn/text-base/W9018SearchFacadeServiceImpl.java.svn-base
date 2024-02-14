/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W9018;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.apache.commons.lang.time.DateUtils;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W9018CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W9018ExpFmlByItemMaItemDomain;
import com.globaldenso.eca0027.core.business.domain.W9018ListDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W9018ExpFmlByItemMaCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W9018ExpFmlByItemMaService;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractSearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.DateUtil;
import com.globaldenso.gscm.framework.util.Validator;

/**
 *  The implementation class of Facade service to search action of Export Formalities by Item
 *  MA Inquiry screen.
 * <br />Export Formalities by Item MA Inquiry画面のSearchアクションに対するFacadeサービスの実装クラスです。
 *
 * @author $Author: 400616000304 $
 * @version $Revision: 12652 $
 */
public class W9018SearchFacadeServiceImpl extends
    AbstractSearchFacadeService<List<? extends W9018ListDomain>, W9018CriteriaDomain> {
    
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
    public W9018SearchFacadeServiceImpl() {
    }

    /**
     * Setter method for w9018ExpFmlByItemMaService.
     *
     * @param expFmlByItemMaService Set for w9018ExpFmlByItemMaService
     */
    public void setW9018ExpFmlByItemMaService(
        W9018ExpFmlByItemMaService expFmlByItemMaService) {
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
    protected W9018CriteriaDomain filterDomain(W9018CriteriaDomain argDomain)
        throws GscmApplicationException, ApplicationException {
        return argDomain;
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
    protected void validateItems(W9018CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException,
        ApplicationException {
        
        Validator<W9018CriteriaDomain> valid = new Validator<W9018CriteriaDomain>(criteriaDomain, "w9018CriteriaDomain");

        String[] properties = {
            "hsCd"
        };

        valid.isPermittedAttr("compCd", SCREEN_ID_W9018);
        valid.isPermittedFormat("itemNo", SCREEN_ID_W9018);
        valid.isValidateProperties(properties, SCREEN_ID_W9018);

        if (0 < valid.getErrList().size()) {
            throw new ValidationException(valid.getErrList());
        }
    }

    /**
     * {@inheritDoc}
     * <pre>
     * Check correlation
     * </pre>
     * <pre>
     * 相関チェック
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W9018CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException,
        ApplicationException {
        
        // UT387 Start
        // List<MessageDomain> errorList = new ArrayList<MessageDomain>();
        
        // Combination check 
        // 相関チェック
        // if(!w9018ExpFmlByItemMaService.validateCompanyFromToDate(criteriaDomain.getFmAplyStrtDt(), criteriaDomain.getToAplyStrtDt(), criteriaDomain.getScreenDateFormat())) {
        //     Object[] params = {
        //         commonService.getResource(criteriaDomain.getLocale(), "label.aplyStrtDt")
        //     };
        //     MessageDomain msgToDate = new MessageDomain("w9018CriteriaDomain.toAplyStrtDt", GSCM_E0_0031, params);
        //     MessageDomain msgFmDate = new MessageDomain("w9018CriteriaDomain.fmAplyStrtDt", null, null);

        //     errorList.add(msgToDate);
        //     errorList.add(msgFmDate);
        // }
        
        // if (0 < errorList.size()) {
        //     throw new ValidationException(errorList);
        // }
        // UT387 End
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
    protected void validateDatabase(W9018CriteriaDomain filterDomain)
        throws GscmApplicationException, ValidationException,
        ApplicationException {
    }

    /**
     * {@inheritDoc}
     * <pre>
     * Get the data of export shipment item number basic unit.
     * </pre>
     * <pre>
     * 輸出出荷品目番号原単位のデータ取得
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected List<? extends W9018ListDomain> callServices(W9018CriteriaDomain criteria)
        throws GscmApplicationException, ApplicationException {
        
        W9018ExpFmlByItemMaCriteriaDomain criteriaDomain = createExpShippingItemSpInfoMaCriteria(criteria);
    
        List<? extends W9018ExpFmlByItemMaItemDomain> itemDomainList = w9018ExpFmlByItemMaService.searchForPagingOnInquirySearch(criteriaDomain);
        
        return convertToListDomain(itemDomainList, criteria.getScreenDateFormat());
    }

    
    /**
     *  Based on (PL) Search criteria domain, create Search criteria domain (BL).
     * <br />検索条件ドメイン(PL)を基に、検索条件ドメイン(BL)を作成します。
     *
     * @param criteriaDomain Criteria domain of screen(PL)<br />
     * 画面の検索条件ドメイン(PL)
     * @return Criteria domain of User Id MA service<br />
     * User Id MA Editサービスの検索条件ドメイン(BL)
     * @throws ApplicationException <br />
     * アプリケーション例外
     */
    protected W9018ExpFmlByItemMaCriteriaDomain createExpShippingItemSpInfoMaCriteria(W9018CriteriaDomain criteriaDomain) 
        throws ApplicationException {
        
        W9018ExpFmlByItemMaCriteriaDomain userIdMaCriteria = new W9018ExpFmlByItemMaCriteriaDomain();
        
        // setup for acquiring the maximum number 
        // 最大件数を取得するための設定
        userIdMaCriteria.setScreenId(criteriaDomain.getScreenId());
        userIdMaCriteria.setLocale(new Locale(criteriaDomain.getLanguageCd()));
        
        CommonUtil.copyPropertiesDomainToDomain(userIdMaCriteria, criteriaDomain, criteriaDomain.getScreenDateFormat());
        
        // UT387
        String timezoneId = commonService.searchTimezone(criteriaDomain.getOwnerCompCd());
        Date nowDt = DateUtils.truncate(DateUtil.convertTime(new Date(), timezoneId), Calendar.DAY_OF_MONTH);
        userIdMaCriteria.setFmtAplyStrtDt(nowDt);
        
        return userIdMaCriteria;
    }
    
    /**
     * Convert service domain(PL) to list domain of screen(PL)
     * <br />サービスのドメイン(BL)を画面のリストドメイン(PL)に変換します。
     *
     * @param srcList List of service domain(PL)<br />
     * サービスドメインのリスト(BL)
     * @param dateFormat Date format (for display)<br />
     * 日付フォーマット (画面表示用)
     * @return List domain of screen(PL)<br />
     * 画面のリストドメイン(PL)
     */
    protected List<W9018ListDomain> convertToListDomain(List<? extends W9018ExpFmlByItemMaItemDomain> srcList, String dateFormat) {
        
        List<W9018ListDomain> dstList = new ArrayList<W9018ListDomain>();
        
        if (srcList != null) {
            for (W9018ExpFmlByItemMaItemDomain src : srcList) {
                
                W9018ListDomain dst = new W9018ListDomain();
                
                CommonUtil.copyPropertiesDomainToDomain(dst, src, dateFormat);

                dstList.add(dst);
            }
        }
        
        return dstList;
    }
}
