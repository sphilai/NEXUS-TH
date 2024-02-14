/*
 * Project : NEXUS_EXPORT
 *
 * Dete of update          : 2013/12/16
 * Development company name: DENSO IT SOLUTIONS, INC.
 * Details of update       : New
 * (c) Copyright 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W0002ListDomain;
import com.globaldenso.eca0027.core.business.domain.W0002UserConfDomain;
import com.globaldenso.eca0027.core.business.service.W0002MenuService;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractUpdateFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;


/**
 * The implementation class of facade service for setup action of the menu screen.
 * <br />メニュー画面のSetupアクションに対するFacadeサービスの実装クラスです。
 * <pre>
 * bean id: w0002SetupFacadeService
 * </pre>
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W0002SetupFacadeServiceImpl extends AbstractUpdateFacadeService<Void, W0002ListDomain> {

    /**
     * service of the menu screen <br />
     * メニュー画面のサービス
     */
    protected W0002MenuService w0002MenuService;
    
    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W0002SetupFacadeServiceImpl() {
    }

    /**
     * Setter method for w0002MenuService.
     *
     * @param menuService Set for w0002MenuService
     */
    public void setW0002MenuService(W0002MenuService menuService) {
        w0002MenuService = menuService;
    }

    /**
     * {@inheritDoc}
     * <pre>
     * no action
     * 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W0002ListDomain filterDomain(W0002ListDomain listDomain)
        throws GscmApplicationException, ApplicationException {
        // 処理なし
        return listDomain;
    }

    /**
     * {@inheritDoc}
     * <pre>
     * no action
     * 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W0002ListDomain listDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        // No Action
        // 処理なし
    }

    /**
     * {@inheritDoc}
     * <pre>
     * no action
     * 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W0002ListDomain listDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        // No Action
        // 処理なし
    }

    /**
     * {@inheritDoc}
     * <pre>
     * no action
     * 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W0002ListDomain listDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        // No Action
        // 処理なし
    }

    /**
     * {@inheritDoc}
     * <pre>
     * - Create user settings
     *     Convert {@link W0002ListDomain} into {@link W0002UserConfDomain}
     * 
     * - Update 'User Config Master'
     *     Make {@link W0002UserConfDomain}, and call {@link W0002MenuService#updateOnMenuSetup(W0002UserConfDomain)} with an argument of it
     * 
     * 
     * - ユーザ設定の作成
     *     {@link W0002ListDomain}を{@link W0002UserConfDomain}に変換する
     *     
     * - ユーザ設定原単位の更新
     *     作成した{@link W0002UserConfDomain}を引数に、{@link W0002MenuService#updateOnMenuSetup(W0002UserConfDomain)}を呼び出す
     *     
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected Void callServices(W0002ListDomain listDomain)
        throws GscmApplicationException, ApplicationException {
        
        // A create of user set
        // ユーザ設定の作成
        W0002UserConfDomain userConf = createUserConf(listDomain);
        
        // The update of user set
        // ユーザ設定の更新
        w0002MenuService.updateOnMenuSetup(userConf);
        
        return null;
    }

    /**
     * Create {@link W0002ListDomain} and {@link W0002UserConfDomain}
     * <br />{@link W0002ListDomain}を{@link W0002UserConfDomain}を作成します。
     *
     * @param listDomain - List domain
     * @return {@link W0002UserConfDomain}
     */
    protected W0002UserConfDomain createUserConf(W0002ListDomain listDomain) {
        W0002UserConfDomain userConf = new W0002UserConfDomain();
        
        // Setting of property
        // プロパティの設定
        CommonUtil.copyPropertiesDomainToDomain(userConf, listDomain);
        
        // A setting of DSC-ID
        // DSC-IDの設定
        userConf.setDscId(listDomain.getLoginUserDscId());
        
        return userConf;
    }
}
