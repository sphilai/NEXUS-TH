/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CHECK_ON;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FORMAT_WEIGHT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0004;
// import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0157;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W2014PltzDomain;
import com.globaldenso.eca0027.core.business.domain.W2014XtagDomain;
import com.globaldenso.eca0027.core.business.domain.W2017CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W2017ListDomain;
import com.globaldenso.eca0027.core.business.domain.W2017UpdateDomain;
import com.globaldenso.eca0027.core.business.service.W2014XtagService;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractDeleteFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.NumberUtil;

/**
 * The delete service facade implementation class of X-tag Register
 * <br />X-tag Register画面のDeleteFacadeサービス実装クラスです。
 * <pre>
 * bean id:W2017DeleteFacadeService
 * </pre>
 *
 * @author $Author: 400616000304 $
 * @version $Revision: 11243 $
 */
public class W2017DeleteFacadeServiceImpl extends AbstractDeleteFacadeService<W2017UpdateDomain, W2017UpdateDomain> {

    /**
     * Common service
     * <br />Commonサービス
     */
    protected CommonService commonService;
    
    /**
     * X-Palletize service
     * <br />まとめパレタイズサービス
     */
    protected W2014XtagService w2014XtagService;
    
    /**
     * constructor.
     */
    public W2017DeleteFacadeServiceImpl() {
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
     * Setter method for w2014XtagService.
     *
     * @param xtagService Set for w2014XtagService
     */
    public void setW2014XtagService(W2014XtagService xtagService) {
        w2014XtagService = xtagService;
    }
    
    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - Check for detailed line selection
     *     Refer for details to Common specification document
     * - Extract List domain
     *     Extract list domain selected in the screen　and set it to update domain
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
    protected W2017UpdateDomain filterDomain(W2017UpdateDomain updateDomain)
        throws GscmApplicationException, ApplicationException {

        List<W2017ListDomain> newListDomainList = new ArrayList<W2017ListDomain>();
        
        // extract selected list domain
        // 選択されたListドメインを抽出
        for (W2017ListDomain listDomain : updateDomain.getListDomainList()) {
            if (CHECK_ON.equals(listDomain.getSelected())) {
                newListDomainList.add(listDomain);
            }
        }
        
        // check for detailed line selection
        // 明細行選択チェック
        if (newListDomainList.size() == 0) {
            List<MessageDomain> errList = Arrays.asList(new MessageDomain("", NXS_E7_0004, null));
            
            throw new ValidationException(errList);
        }
        
        // set extracted List domain
        // 抽出したListドメインの設定
        updateDomain.setListDomainList(newListDomainList);
        
        return updateDomain;
    }
    
    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * No Action
     * 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W2017UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        // No Action
        // 処理なし
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * No Action
     * 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W2017UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        // No Action
        // 処理なし
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W2017UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        // No Action
        // 処理なし
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - Create X Palletize Work
     *     convert to {@link W2014PltzDomain} from {@link W2017ListDomain}
     * - Delete X Palletize Work
     *     argument: {@link W2014PltzDomain}
     *     call: {@link W2014XtagService#deleteOnRegisterDelete(W2014XtagDomain)}
     * - Convert to update domain
     *     convert to {@link W2017UpdateDomain} from the contents that is re-searched
     *     
     * - まとめパレタイズワークの作成
     *     {@link W2017ListDomain}から{@link W2014PltzDomain}に変換する
     *     
     * - まとめパレタイズワークの削除
     *     作成した{@link W2014PltzDomain}を引数に、{@link W2014XtagService#deleteOnRegisterDelete(W2014XtagDomain)}を呼出
     * 
     * - 一括更新ドメインへの変換
     *     再検索した内容を{@link W2017UpdateDomain}に変換する
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W2017UpdateDomain callServices(W2017UpdateDomain updateDomain) 
        throws GscmApplicationException, ApplicationException {
        
        // Create X Palletize Work
        // まとめパレタイズドメインの作成
        W2014XtagDomain xtag = createXtag(updateDomain);
        
        // Delete X Palletize Work
        // まとめパレタイズワークの削除
        xtag = w2014XtagService.deleteOnRegisterDelete(xtag);

        return convertToUpdateDomain(xtag);
    }
    /**
     * convert to {@link W2014PltzDomain} from {@link W2017ListDomain}
     * <br />{@link W2017ListDomain}を{@link W2014PltzDomain}に変換します。
     *
     * @param updateDomain update domain of Register screen<br />Register画面の一括更新ドメイン
     * @return list of {@link W2014PltzDomain}<br />{@link W2014PltzDomain}のリスト
     */
    protected W2014XtagDomain createXtag(W2017UpdateDomain updateDomain) {
        
        W2017CriteriaDomain criteriaDomain =  updateDomain.getCriteriaDomain();
        
        W2014XtagDomain xtag = new W2014XtagDomain();
        
        // set units
        // 単位関連の設定
        xtag.setWeightUnit(criteriaDomain.getWeightUnit());
        xtag.setWeightUnitDisplay(criteriaDomain.getWeightUnitDisplay());
        xtag.setVolumeUnit(criteriaDomain.getVolumeUnit());
        xtag.setVolumeUnitDisplay(criteriaDomain.getVolumeUnitDisplay());
        
        List<W2014PltzDomain> pltzList = new ArrayList<W2014PltzDomain>();

        for (W2017ListDomain listDomain : updateDomain.getListDomainList()) {
            W2014PltzDomain pltz = new W2014PltzDomain();
            
            pltz.setMainMark(listDomain.getMainMark());
            pltz.setLoginUserDscId(updateDomain.getLoginUserDscId());
            
            pltzList.add(pltz);
        }
        
        xtag.setPltzDomainList(pltzList);
        
        return xtag;
    }

    /**
     * Convert to {@link W2017UpdateDomain} from {@link W2014XtagDomain}
     * <br />{@link W2014XtagDomain}を{@link W2017UpdateDomain}に変換します。
     *
     * @param xtag {@link W2014XtagDomain} converted from<br />変換元の{@link W2014XtagDomain}
     * @return converted {@link W2017UpdateDomain}<br />作成した{@link W2017UpdateDomain}
     * @throws ApplicationException unexpected error<br />予期せぬエラー
     */
    protected W2017UpdateDomain convertToUpdateDomain(W2014XtagDomain xtag) 
        throws ApplicationException {
        
        W2017UpdateDomain updateDomain = new W2017UpdateDomain();
        
        W2017CriteriaDomain criteriaDomain = new W2017CriteriaDomain();
        
        List<W2017ListDomain> listDomainList = new ArrayList<W2017ListDomain>();
        
        if (xtag != null) {
            // set criteria domain
            // criteriaドメインの設定
            CommonUtil.copyPropertiesDomainToDomain(criteriaDomain, xtag);
            
            // set list domain
            // listドメインの設定
            for (W2014PltzDomain pltz : xtag.getPltzDomainList()) {
                W2017ListDomain listDomain = new W2017ListDomain();
                
                // set property copy
                // プロパティコピーの設定
                CommonUtil.copyPropertiesDomainToDomain(listDomain, pltz);
                
                listDomain.setGrossWeight(NumberUtil.format(pltz.getGrossWeight(), FORMAT_WEIGHT));
                
                listDomainList.add(listDomain);
            }
        }
        
        updateDomain.setCriteriaDomain(criteriaDomain);
        updateDomain.setListDomainList(listDomainList);
        return updateDomain;
    }
}
