/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0011;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0057;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0067;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0036;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0010;

import java.util.Arrays;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W7001ShippingActDocDomain;
import com.globaldenso.eca0027.core.business.domain.W7005CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W7001ShippingActCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W7001ShippingActService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractTransactFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;

/**
 * 
 * A service for Facade Upload action of B / L Update screen.
 * <br />船荷証券更新画面のUploadアクションに対するFacadeサービスです。
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W7005UploadFacadeServiceImpl extends AbstractTransactFacadeService<W7005CriteriaDomain, W7005CriteriaDomain> {

    /**
     * Shipping actuality service.<br />
     * 船積実績サービス
     */
    protected W7001ShippingActService w7001ShippingActService;
    
    /**
     * Default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public W7005UploadFacadeServiceImpl() {
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
     * {@inheritDoc}
     * <pre>
     * No action
     * 処理なし
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W7005CriteriaDomain filterDomain(W7005CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {
        return criteriaDomain;
    }
    

    /**
     * {@inheritDoc}
     * <pre>
     * No action
     * 処理なし
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W7005CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
    }

    /**
     * {@inheritDoc}
     * <pre>
     * - Check input file path. 
     *      Call {@link W7001ShippingActService#validateConsistencyFilePathInput(org.apache.struts.upload.FormFile)}
     *      
     * - File existence check .
     *      Call {@link W7001ShippingActService#validateConsistencyFileExistence(org.apache.struts.upload.FormFile)}
     *      
     * - Check file size .
     *      Call the {@link W7001ShippingActService#validateConsistencyFileSize(org.apache.struts.upload.FormFile)}
     * </pre>
     * 
     * <pre>
     * ‐ファイルパス入力チェック
     *     {@link W7001ShippingActService#validateConsistencyFilePathInput(org.apache.struts.upload.FormFile)}を呼出す
     * 
     * ‐ファイル存在チェック
     *     {@link W7001ShippingActService#validateConsistencyFileExistence(org.apache.struts.upload.FormFile)}を呼出す
     * 
     * ‐ファイルサイズチェック
     *     {@link W7001ShippingActService#validateConsistencyFileSize(org.apache.struts.upload.FormFile)}を呼出す
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W7005CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        
        if (!w7001ShippingActService.validateConsistencyFilePathInput(criteriaDomain.getUploadFileName())) {
            throw new ValidationException(Arrays.asList(new MessageDomain("w7005CriteriaDomain.formFileData", NXS_E7_0011, null)));
        }
        
        if (!w7001ShippingActService.validateConsistencyFileExistence(criteriaDomain.getUploadFileSize())) {
            throw new ValidationException(Arrays.asList(new MessageDomain("w7005CriteriaDomain.formFileData", GSCM_E0_0036, null)));
        }

        if (!w7001ShippingActService.validateConsistencyFileSize(criteriaDomain.getUploadFileSize())) {
            throw new ValidationException(Arrays.asList(new MessageDomain("w7005CriteriaDomain.formFileData", NXS_E7_0057, null)));
        }
        
        if (!w7001ShippingActService.validateConsistencyFileName(criteriaDomain.getUploadFileName())) {
            throw new ValidationException(Arrays.asList(new MessageDomain("w7005CriteriaDomain.formFileData", NXS_E7_0067, null)));
        }
    }

    /**
     * {@inheritDoc}
     * <pre>
     * - Lock and check for the existence of shipping actuality .
     *     Call {@link W7001ShippingActService#validateDatabaseTtShippingActOnBlUpload}
     * </pre>
     * <pre>
     * ‐船積実績のロック＆存在チェック
     *     {@link W7001ShippingActService#validateDatabaseTtShippingActOnBlUpload}を呼出す
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W7005CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        if (!w7001ShippingActService.validateDatabaseTtShippingActOnBlUpload(criteriaDomain.getShippingActNo())) {
            throw new ValidationException(Arrays.asList(new MessageDomain("", GSCM_E0_0010, null)));
        }
    }

    /**
     * {@inheritDoc}
     * <pre>
     * - Conditions domain creation of shipping actuality service.
     *     Convert to the {@link W7005CriteriaDomain} {@link W7001ShippingActCriteriaDomain}
     *     
     * - Retrieval data 
     *     Call {@link W7001ShippingActService#transactOnBlUpload}
     * </pre>
     * <pre>
     * ‐船積実績サービスの条件ドメイン作成
     *     {@link W7005CriteriaDomain}を{@link W7001ShippingActCriteriaDomain}に変換する
     * 
     * ‐検索データの取得
     *     {@link W7001ShippingActService#transactOnBlUpload}を呼出す
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W7005CriteriaDomain callServices(W7005CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {
        W7001ShippingActCriteriaDomain shippingActCriteria = createShippingActCriteriaDomain(criteriaDomain);
        
        W7001ShippingActDocDomain docDomain = w7001ShippingActService.transactOnBlUpload(shippingActCriteria);
        
        return convertToCriteriaDomain(docDomain);
    }
    
    /**
     * 
     * Create a condition of shipping actuality service domain.
     * <br />船積実績サービスの条件ドメインを作成します。
     *
     * @param criteriaDomain Domain conditions of shipping actuality Main screen<br />
     * 船積実績Main画面の条件ドメイン
     * @return Conditions of shipping actuality service domain<br />
     * 船積実績サービスの条件ドメイン
     */
    protected W7001ShippingActCriteriaDomain createShippingActCriteriaDomain(W7005CriteriaDomain criteriaDomain) {
        W7001ShippingActCriteriaDomain shippintActCriteria = new W7001ShippingActCriteriaDomain();
        
        CommonUtil.copyPropertiesDomainToDomain(shippintActCriteria, criteriaDomain);

        // File data
        // ファイルデータ
        shippintActCriteria.setFileData(criteriaDomain.getUploadFileData());
        // File name
        // ファイル名
        shippintActCriteria.setFileName(criteriaDomain.getUploadFileName());
        
        // Login DSC-ID
        // ログインDSC-ID
        shippintActCriteria.setDscId(criteriaDomain.getLoginUserDscId());
        
        return shippintActCriteria;
    }
    
    /**
     * Convert shipping actuality domain to list domain
     * <br />船積実績ドメインをリストドメインに変換します。
     *
     * @param docDomain Search result<br />
     * 検索結果
     * @return Conversion result<br />
     * 変換結果
     */
    protected W7005CriteriaDomain convertToCriteriaDomain(W7001ShippingActDocDomain docDomain) {
        W7005CriteriaDomain criteriaDomain = new W7005CriteriaDomain();

        criteriaDomain.setFileName(docDomain.getFileName());
        criteriaDomain.setComUpdateTimestamp(docDomain.getComUpdateTimestamp());
        criteriaDomain.setUpdateCount(docDomain.getUpdateCount());
        
        return criteriaDomain;
    }
}
