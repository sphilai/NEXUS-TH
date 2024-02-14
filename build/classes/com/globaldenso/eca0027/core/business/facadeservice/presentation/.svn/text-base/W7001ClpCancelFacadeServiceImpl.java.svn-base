/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CHECK_ON;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0002;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0028;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0036;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0004;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0014;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W7001ListDomain;
import com.globaldenso.eca0027.core.business.domain.W7001UpdateDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W7001ShippingActCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W7001ShippingActService;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractTransactFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;

/**
 * 
 * The Facade Service with respect to the CLP cancel of action Shipping Actuality Main screen.
 * <br />船積実績Main画面のCLPキャンセルアクションに対するFacadeサービスです。
 *
 * @author $Author$
 * @version $Revision$
 */
public class W7001ClpCancelFacadeServiceImpl extends 
    AbstractTransactFacadeService<Void, W7001UpdateDomain> {

    /**
     * Shipping Actuality Service.<br />
     * 船積実績サービス
     */
    protected W7001ShippingActService w7001ShippingActService;
    
    /**
     * Common Service.<br />
     * 共通サービス
     */
    protected CommonService commonService;
    
    /**
     * Default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public W7001ClpCancelFacadeServiceImpl() {
        super();
    }
    
    /**
     * Setter method for w7001ShippingActService.
     *
     * @param shippingActService Set for w7001ShippingActService
     */
    public void setW7001ShippingActService(W7001ShippingActService shippingActService) {
        w7001ShippingActService = shippingActService;
    }
    
    /**
     * <p>commonService のセッターメソッドです。</p>
     *
     * @param commonService commonService に設定する
     */
    public void setCommonService(CommonService commonService) {
        this.commonService = commonService;
    }

    /**
     * {@inheritDoc}
     * <pre>
     * - Detailed line selection check
     *       This is a common-specifications .xls "functional common-specifications" No.12 particulars line selection check for details.   This is referred to.
     *
     * - Extraction of a target domain
     *       The List domain selected in the pictures is extracted, and it sets to a mass update domain.
     *
     * - 明細行選択チェック
     *     詳細は共通仕様.xls「機能共通仕様」No.12 明細行選択チェック 参照
     *     
     * - 対象ドメインの抽出
     *     画面で選択されたListドメインを抽出し、一括更新ドメインに設定する
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W7001UpdateDomain filterDomain(W7001UpdateDomain updateDomain)
        throws GscmApplicationException, ApplicationException {
        List<W7001ListDomain> newListDomainList = new ArrayList<W7001ListDomain>();
        
        // Extract List the selected domain
        // 選択されたListドメインを抽出
        for (int i = 0; i < updateDomain.getListDomainList().size(); i++) {
            W7001ListDomain listDomain = updateDomain.getListDomainList().get(i);
            
            if (CHECK_ON.equals(listDomain.getSelected())) {
                newListDomainList.add(listDomain);
            }
        }
        
        // Line item selection check.
        // 明細行選択チェック
        if(newListDomainList.size() == 0) {
            List<MessageDomain> errList = Arrays.asList(new MessageDomain("", NXS_E7_0004, null));
            throw new ValidationException(errList);
        }
        
        updateDomain.setListDomainList(newListDomainList);
        
        return updateDomain;
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * No action
     * 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W7001UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        // No action
        // 処理なし
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * - CLP Group check(Single group check)
     *    It is determined whether the CLP group of the shipping actuality that a user chose with a screen is one
     * - CLPグループチェック(単一グループチェック)
     *    画面で選択した船積実績のCLPグループが1つかどうか判定
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W7001UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        // CLP Groupの存在チェック
        for(W7001ListDomain domain : updateDomain.getListDomainList()) {
            if(StringUtils.isEmpty(domain.getClpGroup())) {
                String[] params = new String[] { commonService.getResource(updateDomain.getLocale(), "label.clpGroup")};
                List<MessageDomain> errList = Arrays.asList(new MessageDomain(null, NXS_E1_0002, params));
                throw new ValidationException(errList);
            }
        }
        // CLP Groupの一貫性チェック
        String baseClpGroup = updateDomain.getListDomainList().get(0).getClpGroup();
        for(W7001ListDomain domain : updateDomain.getListDomainList()) {
            if(!baseClpGroup.equals(domain.getClpGroup())) {
                List<MessageDomain> errList = Arrays.asList(new MessageDomain(null, NXS_E7_0014, null));
                throw new ValidationException(errList);
            }
        }
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * - CLP Group check(Omission of choice check)
     *    Confirm whether there are not the shipping actuality of the same CLP group elsewhere
     *    
     * - Shipping actuality status check
     *    In the case of attached completion status, assume it an error
     *    
     * - CLPグループチェック(選択漏れチェック)
     *    同じCLPグループの船積実績が他にないか確認
     *    
     * - 船積実績ステータスチェック
     *    添付完了ステータスの場合はエラーとする
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W7001UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        //CLP Group選択漏れチェック
        if(!w7001ShippingActService.validateDatabaseTtShippingActOnClpCancel(updateDomain)) {
            throw new ValidationException(Arrays.asList(new MessageDomain(null, NXS_E1_0036, null)));
        }
        //船積実績ステータスチェック
        if(!w7001ShippingActService.validateDatabaseTtInvoiceOnClpCancel(updateDomain)) {
            throw new ValidationException(Arrays.asList(new MessageDomain(null, NXS_E1_0028, null)));
        }
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * - Create conditions domain
     *   Create the W7001ShippingActCriteriaDomain
     * 
     * - Update the Shipping Actuality
     *   Call the (W7001ShippingActCriteriaDomain) W7001ShippingActService.transactOnUpdateCancel, 
     *   Delete CLP Group of the Shipping Actuality that a user chose
     *
     * </pre>
     * <pre>
     * ‐条件ドメインの作成
     *     {@link W7001ShippingActCriteriaDomain}を作成する
     *     
     * ‐船積実績の更新
     *     {@link W7001ShippingActService#transactOnUpdateCancel(W7001ShippingActCriteriaDomain)}を呼出し、
     *     選択した船積実績のCLP Groupを削除する
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected Void callServices(W7001UpdateDomain updateDomain)
        throws GscmApplicationException, ApplicationException {
        W7001ShippingActCriteriaDomain criteria = createShippingActCriteriaDomain(updateDomain);
        w7001ShippingActService.transactOnUpdateCancel(criteria);
        return null;
    }
    
    /**
     * Create the condition of domain Shipping Actuality service.
     * <br />船積実績サービスの条件ドメインを作成します。
     *
     * @param updateDomain conditions of domain Shipping Actuality Main screen<br />
     * 船積実績Main画面の条件ドメイン
     *      *
     * @return Conditions of domain Shipping Actuality Service<br /> 
     * 船積実績サービスの条件ドメイン
     */
    protected W7001ShippingActCriteriaDomain createShippingActCriteriaDomain(W7001UpdateDomain updateDomain) {
        // Creation of conditions domain.
        // 条件ドメインの作成
        W7001ShippingActCriteriaDomain shippintActCriteria = new W7001ShippingActCriteriaDomain();
        
        // Creation of conditions domain.
        // 条件ドメインの設定
        shippintActCriteria.setClpGroup(updateDomain.getListDomainList().get(0).getClpGroup());
        shippintActCriteria.setListDomainList(updateDomain.getListDomainList());
        
        return shippintActCriteria;
    }
}
