/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CHECK_ON;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0035;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MAX_TW_XPLTZ_RECORDE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0004;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0015;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0016;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W2014PltzDomain;
import com.globaldenso.eca0027.core.business.domain.W2016ListDomain;
import com.globaldenso.eca0027.core.business.domain.W2016UpdateDomain;
import com.globaldenso.eca0027.core.business.service.W2014XtagService;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractCreateFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;

/**
 * The update service facade implementation class of X-Tag Create Screen
 * <br />X-Tag Create画面のUpdateサービス実装クラスです。
 * <pre>
 * bean id:w2016UpdateFacadeService
 * </pre>
 *
 * @author $Author: 810833843 $
 * @version $Revision: 6768 $
 */
public class W2016UpdateFacadeServiceImpl extends AbstractCreateFacadeService<Void, W2016UpdateDomain> {
    
    /**
     * X Palletize   Service
     * <br />まとめパレタイズ サービス
     */
    protected W2014XtagService w2014XtagService;
    
    /**
     * Common service.
     */
    protected CommonService commonService;

    /**
     * constructor.
     */
    public W2016UpdateFacadeServiceImpl() {
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
     * - Detailed line selection check
     * <br />- 明細行選択チェック
     *       This is a common-specifications .xls "functional common-specifications" No.12 particulars line selection check for details.   This is referred to.
     *       <br />詳細は共通仕様.xls「機能共通仕様」No.12 明細行選択チェック 参照
     *     
     * - Extraction of a target domain
     * <br />- 対象ドメインの抽出
     *       The List domain (update of new registration or) selected in the pictures is extracted.
     *       <br />画面で選択されたListドメイン(新規登録 or 更新)を抽出する
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W2016UpdateDomain filterDomain(W2016UpdateDomain updateDomain)
        throws GscmApplicationException, ApplicationException {
        
        List<W2016ListDomain> newListDomainList = new ArrayList<W2016ListDomain>();
        
        // selected List domain is extracted.<br />選択されたListドメインを抽出
        for (int i = 0; i < updateDomain.getListDomainList().size(); i++) {
            W2016ListDomain listDomain = updateDomain.getListDomainList().get(i);
            
            if (CHECK_ON.equals(listDomain.getSelected())) {
                listDomain.setIndex(i);
                newListDomainList.add(listDomain);
            }
        }
        
        // Detailed line selection check<br />明細行選択チェック
        if (newListDomainList.size() == 0) {
            List<MessageDomain> errList = Arrays.asList(new MessageDomain("", NXS_E7_0004, null));
            
            throw new ValidationException(errList);
        }
        
        updateDomain.setListDomainList(newListDomainList);
        
        return updateDomain;
    }
    
    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * No Action<br />処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W2016UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        // No Action<br />処理なし
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - Correlation check
     * <br />- 相関チェック
     *       This is a call about {@link W2014XtagService#validateConsistencyCcType (java.util.List, java.util.List)}.
     *       <br />{@link W2014XtagService#validateConsistencyCcType(java.util.List, java.util.List)}を呼出
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W2016UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        
        List<MessageDomain> errList = new ArrayList<MessageDomain>();
        
        // List generation of a Palletize domain<br />パレタイズドメインのリスト生成
        List<W2014PltzDomain> pltzList = new ArrayList<W2014PltzDomain>();
        
        // A CUSTOM TIMING TYPE is set to each Palletize domain of list.<br />リストの各パレタイズドメインに通関タイミング区分をセット
        for ( W2016ListDomain listDomain : updateDomain.getListDomainList() ){
            W2014PltzDomain pltz = new W2014PltzDomain();
            pltz.setCustomTimingTyp(listDomain.getCustomTimingTyp());
            pltzList.add(pltz);
        }
        
        // Variable generation for return VALUEs<br />戻り値用の変数生成
        List<String> errCcTypeList = new ArrayList<String>();
        
        // Correlation check<br />相関チェック
        if (!w2014XtagService.validateConsistencyCcType(pltzList, errCcTypeList)) {
            // -- there is only one errCcTypeList in practice<br />実際は、errCcTypeListは1件しかない
            Object[] params = {
                commonService.getResource(updateDomain.getLocale(), "label.ccType")
            };
            errList.add(new MessageDomain("", NXS_E7_0015, params));
        }
        
        // Error check<br />エラー確認
        if (0 < errList.size()) {
            throw new ValidationException(errList);
        }
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - The same X-TAG condition check
     * <br />- 同一まとめCML条件チェック
     *       This is a call about * {@link W2014XtagService#validateDatabaseTwXpltzOnCreateUpdateByCml(java.lang.String, java.lang.String)}.
     *       <br />{@link W2014XtagService#validateDatabaseTwXpltzOnCreateUpdateByCml(java.lang.String, java.lang.String)}を呼出
     *   
     * - The registration number check
     * <br />- 登録件数チェック
     *       This is a call about {@link W2014XtagService#validateDatabaseTwXpltzOnCreateUpdateByCount (java.lang.String, int)}.
     *       <br />{@link W2014XtagService#validateDatabaseTwXpltzOnCreateUpdateByCount(java.lang.String, int)}を呼出
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W2016UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        
        List<MessageDomain> errList = new ArrayList<MessageDomain>();
        
        // The same X-TAG condition check<br />同一まとめCML条件チェック
        if ( !w2014XtagService.validateDatabaseTwXpltzOnCreateUpdateByCml(
            updateDomain.getListDomainList().get(0).getLoginUserDscId(),
            updateDomain.getListDomainList().get(0).getCustomTimingTyp()) ){
            
            Object[] params = {
                commonService.getResource(updateDomain.getLocale(), "label.ccType")
            };
            errList.add(new MessageDomain("", NXS_E7_0016, params));
        }
        
        // The registration number check<br />登録件数チェック
        if ( !w2014XtagService.validateDatabaseTwXpltzOnCreateUpdateByCount(
            updateDomain.getListDomainList().get(0).getLoginUserDscId(),
            updateDomain.getListDomainList().size()) ){
            
            Object[] params = {
                MAX_TW_XPLTZ_RECORDE
            };
            errList.add(new MessageDomain("", GSCM_E0_0035, params));
        }
        
        if (0 < errList.size()) {
            throw new ValidationException(errList);
        }
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - Create of a Palletize domain
     * <br />- パレタイズドメインの作成
     *       {@link W2016ListDomain} is changed into {@link W2014PltzDomain}.
     *       <br />{@link W2016ListDomain}を{@link W2014PltzDomain}に変換する
     * 
     * - The list of {@link W2014PltzDomain} is made into an argument and this is registration of a X Palletize Work.
     * <br />- {@link W2014PltzDomain}のリストを引数にして、まとめパレタイズワークの登録
     *       This is a call about {@link W2014XtagService#createOnCreateUpdate (java.util.List)}.
     *       <br />{@link W2014XtagService#createOnCreateUpdate(java.util.List)}を呼出
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected Void callServices(W2016UpdateDomain updateDomain) 
        throws GscmApplicationException, ApplicationException {
        
        // List create of a Palletize domain<br />パレタイズドメインのリスト作成
        List<? extends W2014PltzDomain> pltzList = createPltz(updateDomain.getListDomainList());
        
        // Registration of X Palletize Work<br />まとめパレタイズワークの登録
        w2014XtagService.createOnCreateUpdate(pltzList);
        
        return null;
    }
    /**
     * {@link W2016ListDomain} is changed into {@link W2014PltzDomain}.
     * <br />{@link W2016ListDomain}を{@link W2014PltzDomain}に変換します。
     *
     * @param listDomainList The list of List domains<br />Listドメインのリスト
     * @return The list of {@link W2014PltzDomain}<br />{@link W2014PltzDomain}のリスト
     */
    protected List<? extends W2014PltzDomain> createPltz(List<? extends W2016ListDomain> listDomainList) {
        List<W2014PltzDomain> pltzList = new ArrayList<W2014PltzDomain>();
        
        for (W2016ListDomain listDomain : listDomainList) {
            W2014PltzDomain pltz = new W2014PltzDomain();
            
            CommonUtil.copyPropertiesDomainToDomain(pltz, listDomain);
            
            pltzList.add(pltz);
        }
        
        return pltzList;
    }
}
