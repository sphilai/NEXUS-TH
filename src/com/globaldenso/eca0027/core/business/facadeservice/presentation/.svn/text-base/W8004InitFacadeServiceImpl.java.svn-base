/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import java.util.ArrayList;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W8001ProgCtrlPltzItemDomain;
import com.globaldenso.eca0027.core.business.domain.W8002CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W8004CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W8004ListDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W8001ProgCtrlCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W8001ProgCtrlService;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractSearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;


/**
 * An implementation class for facade service to initial action of progress control RTN material information screen.
 * <br />進度管理 RTN材情報画面のInitアクションに対するFacadeサービスの実装クラスです。
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W8004InitFacadeServiceImpl extends
    AbstractSearchFacadeService<List<? extends W8004ListDomain>, W8004CriteriaDomain> {

    /**
     * Progress control service
     * <br />進度管理のサービス
     */
    protected W8001ProgCtrlService w8001ProgCtrlService;

    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W8004InitFacadeServiceImpl() {
    }

    /**
     * Setter method for w8001ProgCtrlService.
     *
     * @param progCtrlService Set for w8001ProgCtrlService
     */
    public void setW8001ProgCtrlService(W8001ProgCtrlService progCtrlService) {
        w8001ProgCtrlService = progCtrlService;
    }

    /**
     * {@inheritDoc}
     * <pre>
     * No action.
     * </pre>
     * <pre>
     * 処理なし
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W8004CriteriaDomain filterDomain(W8004CriteriaDomain w8004CriteriaDomain)
        throws GscmApplicationException, ApplicationException {
        
        return w8004CriteriaDomain;
    }

    /**
     * {@inheritDoc}
     * <pre>
     * No action.
     * </pre>
     * <pre>
     * 処理なし
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W8004CriteriaDomain w8004CriteriaDomain)
        throws GscmApplicationException, ValidationException,
        ApplicationException {
        
    }

    /**
     * {@inheritDoc}
     * <pre>
     * No action.
     * </pre>
     * <pre>
     * 処理なし
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W8004CriteriaDomain w8004CriteriaDomain)
        throws GscmApplicationException, ValidationException,
        ApplicationException {
        
    }    

    /**
     * {@inheritDoc}
     * <pre>
     * No action.
     * </pre>
     * <pre>
     * 処理なし
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W8004CriteriaDomain w8004CriteriaDomain)
        throws GscmApplicationException, ValidationException,
        ApplicationException {
        
    }

    
    /**
     * {@inheritDoc}
     * <pre>
     * - Create criteria domain for progress control service.
     * Convert {@link W8002CriteriaDomain} to {@link W8001ProgCtrlCriteriaDomain}.
     * - Get search result.
     * Call  {@link W8001ProgCtrlService#searchOnRtnInfoInit}.
     * </pre>
     * <pre>
     * ‐進度管理サービスの条件ドメインを作成
     *     {@link W8002CriteriaDomain}を{@link W8001ProgCtrlCriteriaDomain}に変換する
     * 
     * ‐検索結果データ取得
     *     {@link W8001ProgCtrlService#searchOnRtnInfoInit}を呼出す
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected List<? extends W8004ListDomain> callServices(W8004CriteriaDomain w8004CriteriaDomain)
        throws GscmApplicationException, ApplicationException {

        W8001ProgCtrlCriteriaDomain criteria = createProgCtrlCriteriaDomain(w8004CriteriaDomain);

        List<? extends W8001ProgCtrlPltzItemDomain> pltzItemList = w8001ProgCtrlService.searchOnRtnInfoInit(criteria);
        
        return convertToListDomain(pltzItemList, w8004CriteriaDomain.getScreenDateFormat());
    }


    /**
     * Create criteria domain for progress control service.
     * <br />進度管理サービスの条件ドメインを作成します。
     *
     * @param w8004CriteriaDomain Criteria domain of progress control main screen<br />
     * 進度管理Main画面の条件ドメイン
     * @return Criteria domain for progress control service<br />
     * 進度管理サービスの条件ドメイン
     */
    protected W8001ProgCtrlCriteriaDomain createProgCtrlCriteriaDomain(W8004CriteriaDomain w8004CriteriaDomain) {
        String dateFormat = w8004CriteriaDomain.getScreenDateFormat();
        W8001ProgCtrlCriteriaDomain progCtrlCriteriaDomain = new W8001ProgCtrlCriteriaDomain();

        CommonUtil.copyPropertiesDomainToDomain(progCtrlCriteriaDomain, w8004CriteriaDomain, dateFormat);
        progCtrlCriteriaDomain.setMainMark(w8004CriteriaDomain.getCmlNo());

        // Setup of DSC-ID
        // DSC-IDの設定
        progCtrlCriteriaDomain.setDscId(w8004CriteriaDomain.getLoginUserDscId());
        
        // Setup of Server-ID
        // Server-IDの設定
        progCtrlCriteriaDomain.setServerId(w8004CriteriaDomain.getServerId());
        
        return progCtrlCriteriaDomain;
    }

    /**
     *  Convert progress control domain to list domain.
     * <br />進度管理ドメインをリストドメインに変換します。
     *
     * @param pltzItemList Search result<br />
     * 検索結果のリスト
     * @param dateFormat Date format<br />
     * 日付フォーマット
     * @return Conversion result<br />
     * 変換結果
     */
    protected List<? extends W8004ListDomain> convertToListDomain(List<? extends W8001ProgCtrlPltzItemDomain> pltzItemList, String dateFormat) {
        List<W8004ListDomain> listDomainList = new ArrayList<W8004ListDomain>();
        
        if (pltzItemList != null) {
            for (W8001ProgCtrlPltzItemDomain pltzItem : pltzItemList) {
                W8004ListDomain listDomain = new W8004ListDomain();
                listDomain.setPltzItemNo(pltzItem.getPltzItemNo());
                listDomain.setModelCd(pltzItem.getModelCd());
                listDomain.setItemDescription(pltzItem.getItemDescription());
                listDomain.setQty(pltzItem.getSumQty().toString());
                
                listDomainList.add(listDomain);
            }
        }
        return listDomainList;
    }
}
