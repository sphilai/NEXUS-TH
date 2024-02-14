/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0004;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0009;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

import org.apache.commons.lang.StringUtils;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W9022CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W9022InvTplMaItemDomain;
import com.globaldenso.eca0027.core.business.domain.W9022ListDomain;
import com.globaldenso.eca0027.core.business.domain.W9022UpdateDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W9022InvTplMaCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W9022InvTplMaService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractDeleteFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;

/**
 * The implementation class of the Facade service for Delete action of Invoice Template MA Inquiry screen.
 * <br />Invoice Template MA Inquiry画面のDeleteアクションに対するFacadeサービスの実装クラスです。
 *
 * @author $Author: 810833843 $
 * @version $Revision: 9587 $
 */
public class W9022DeleteFacadeServiceImpl extends AbstractDeleteFacadeService<W9022UpdateDomain, W9022UpdateDomain> {
    
    /**
     * Service of invoice Template MA<br />
     * Invoice Template MAのサービス
     */
    protected W9022InvTplMaService w9022InvTplMaService;

    /**
     * Default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public W9022DeleteFacadeServiceImpl() {
    }
    
    /**
     * Getter method for w9022InvTplMaService.
     *
     * @return the w9022InvTplMaService
     */
    public W9022InvTplMaService getW9022InvTplMaService() {
        return w9022InvTplMaService;
    }

    /**
     * Setter method for w9022InvTplMaService.
     *
     * @param invTplMaService Set for w9022InvTplMaService
     */
    public void setW9022InvTplMaService(W9022InvTplMaService invTplMaService) {
        w9022InvTplMaService = invTplMaService;
    }

    /**
     * {@inheritDoc}
     * <pre>
     *  Physical delete the shipping documents template basic unit
     * </pre>
     * <pre>
     * 船積書類テンプレート原単位を物理削除
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W9022UpdateDomain callServices(W9022UpdateDomain updateDomain) 
        throws GscmApplicationException, ApplicationException {
        
        W9022InvTplMaCriteriaDomain criteriaDomain = createInvTplMaCriteria(updateDomain);
        
        int deleteCount = w9022InvTplMaService.deleteOnInquiryDelete(criteriaDomain);
        updateDomain.getCriteriaDomain().setDeleteCount(Integer.toString(deleteCount));
        
        return updateDomain;
    }

    /**
     * {@inheritDoc}
     * <pre>
     * Line item selection check
     * 明細行選択チェック
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W9022UpdateDomain filterDomain(W9022UpdateDomain updateDomain)
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
        List<W9022ListDomain> listDomainList = new ArrayList<W9022ListDomain>();
        listDomainList.add(updateDomain.getListDomainList().get(selectedRow));
        
        updateDomain.setListDomainList(listDomainList);
        
        return updateDomain;
    }

    /**
     * {@inheritDoc}
     * <pre>
     * Authority check
     * </pre>
     * <pre>
     * 権限チェック
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W9022UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        
        // Check of update authority 
        // 更新権限チェック
        if(!w9022InvTplMaService.validateConsistencyCompanyAuth(updateDomain.getListDomainList().get(0).getCompCd())){
            List<MessageDomain> errList = Arrays.asList(new MessageDomain("", GSCM_I0_0009, null));
            throw new ValidationException(errList);
        }

    }

    /**
     * {@inheritDoc}
     * <pre>
     * no action.
     * </pre>
     * <pre>
     * 処理なし
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W9022UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException,
        ApplicationException {
    }

    /**
     * {@inheritDoc}
     * <pre>
     * no action.
     * </pre>
     * <pre>
     * 処理なし
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W9022UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException,
        ApplicationException {
    }
    
    /**
     *  Based on (PL) Search criteria domain, create Search criteria domain (BL).
     * <br />検索条件ドメイン(PL)を基に、検索条件ドメイン(BL)を作成します。
     *
     * @param updateDomain Criteria domain of screen(PL)<br />
     * 画面の検索条件ドメイン(PL)
     * @return Criteria domain of service<br />
     * サービスの検索条件ドメイン(BL)
     */
    protected W9022InvTplMaCriteriaDomain createInvTplMaCriteria(W9022UpdateDomain updateDomain) {
        
        W9022InvTplMaCriteriaDomain invTplMaCriteria = new W9022InvTplMaCriteriaDomain();
        
        // setup for acquiring the maximum number 
        // 最大件数を取得するための設定
        invTplMaCriteria.setScreenId(updateDomain.getScreenId());
        invTplMaCriteria.setLocale(new Locale(updateDomain.getLanguageCd()));
        
        CommonUtil.copyPropertiesDomainToDomain(invTplMaCriteria, updateDomain.getListDomainList().get(0));
        
        return invTplMaCriteria;
    }
    
    /**
     * 
     * <br />画面表示情報を再検索します。
     * 
     * @param criteriaDomain  Criteria Domain
     * @return listDomainList
     * @throws ApplicationException  データの取得ができなかった場合
     */
    protected List<? extends W9022ListDomain> searchListDomainList (W9022CriteriaDomain criteriaDomain) throws ApplicationException {
        
        W9022InvTplMaCriteriaDomain invTplMaCriteria = createInvTplMaCriteria(criteriaDomain);
        
        List<? extends W9022InvTplMaItemDomain> itemDomain = w9022InvTplMaService.searchForPagingOnInquirySearch(invTplMaCriteria);
        
        return convertToListDomain(itemDomain);
    }
    
    /**
     *  Based on (PL) Search criteria domain, create Search criteria domain (BL).
     * <br />検索条件ドメイン(PL)を基に、検索条件ドメイン(BL)を作成します。
     *
     * @param criteriaDomain Criteria domain of screen(PL)<br />
     * 画面の検索条件ドメイン(PL)
     * @return Criteria domain of service<br />
     * サービスの検索条件ドメイン(BL)
     */
    protected W9022InvTplMaCriteriaDomain createInvTplMaCriteria(W9022CriteriaDomain criteriaDomain) {
        
        W9022InvTplMaCriteriaDomain invTplMaCriteria = new W9022InvTplMaCriteriaDomain();
        
        // setup for acquiring the maximum number 
        // 最大件数を取得するための設定
        invTplMaCriteria.setScreenId(criteriaDomain.getScreenId());
        invTplMaCriteria.setLocale(new Locale(criteriaDomain.getLanguageCd()));
        
        // company is copied to compCd. 
        // companyをcompCdにコピー
        invTplMaCriteria.setCompCd(criteriaDomain.getCompany());
        
        CommonUtil.copyPropertiesDomainToDomain(invTplMaCriteria, criteriaDomain);
        
        return invTplMaCriteria;
    }
    
    /**
     * Convert service domain(BL) to list domain of screen(PL)
     * 
     * @param srcList  List of service domain(BL)
     * @return  List domain of screen(PL)
     */
    protected List<W9022ListDomain> convertToListDomain(List<? extends W9022InvTplMaItemDomain> srcList) {
        List<W9022ListDomain> dstList = new ArrayList<W9022ListDomain>();
        if (srcList != null) {
            for (W9022InvTplMaItemDomain src : srcList) {
                
                W9022ListDomain dst = new W9022ListDomain();
                CommonUtil.copyPropertiesDomainToDomain(dst, src);

                dstList.add(dst);
            }
        }
        return dstList;
    }
}
