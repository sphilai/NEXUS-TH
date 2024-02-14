/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0010;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.ai.library.filemanagerstream.business.domain.FileManagementDomain;
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
 * A service to its Cancel Facade action of B / L Update screen.
 * <br />船荷証券更新画面のCancelアクションに対するFacadeサービスです。
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W7005CancelFacadeServiceImpl extends AbstractTransactFacadeService<W7005CriteriaDomain, W7005CriteriaDomain> {

    /**
     * Shipping actuality service.<br />
     * 船積実績サービス
     */
    protected W7001ShippingActService w7001ShippingActService;
    
    /**
     * Default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public W7005CancelFacadeServiceImpl() {
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
     * No action
     * 処理なし
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W7005CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
    }

    /**
     * {@inheritDoc}
     * <pre>
     * - The shipping lock and acquisition track record number check .
     *     Call {@link W7001ShippingActService#validateDatabaseTtShippingActOnBlUploadCancel}
     *     
     * - File lock management and acquisition number check .
     *      Call {@link W7001ShippingActService#validateDatabaseFileManager(String, FileManagementDomain)}
     * </pre>
     * <pre>
     * ‐船積実績 ロック＆取得件数チェック
     *     {@link W7001ShippingActService#validateDatabaseTtShippingActOnBlUploadCancel}を呼出す
     * 
     * ‐ファイル管理 ロック＆取得件数チェック
     *     {@link W7001ShippingActService#validateDatabaseFileManager(String, FileManagementDomain)}を呼出す
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W7005CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        
        W7001ShippingActCriteriaDomain shippingActCriteria = createShippingActCriteriaDomain(criteriaDomain);
        
        // Shipping actually The lock & number check 
        // 船積実績 ロック＆取得件数チェック
        if (!w7001ShippingActService.validateDatabaseTtShippingActOnBlUploadCancel(shippingActCriteria)) {
            throw new ValidationException(Arrays.asList(new MessageDomain("", GSCM_E0_0010, null)));
        }

        // File manager The lock & number check 
        // ファイル管理 ロック＆取得件数チェック
        String fileId = shippingActCriteria.getBilldFileIdList().get(0);
        FileManagementDomain fileDomain = new FileManagementDomain();
        if (!w7001ShippingActService.validateDatabaseFileManager(fileId, fileDomain)) {
            throw new ValidationException(Arrays.asList(new MessageDomain("", GSCM_E0_0010, null)));
        }
        // The time of file ID acquired from file management and a last update date is set as an argument. 
        // ファイル管理から取得したファイルIDと最終更新日時を引数に設定
        criteriaDomain.setFileId(fileId);
        criteriaDomain.setComUpdateTimestampForFileMng(fileDomain.getLastUpdateDate());
    }

    /**
     * {@inheritDoc}
     * <pre>
     * - Conditions domain creation of shipping actuality service .
     *      Convert to the {@link W7005CriteriaDomain} {@link W7001ShippingActCriteriaDomain}
     *      
     * - Deleting an uploaded file .
     *      Call {@link W7001ShippingActService#transactOnBlUploadCancel}
     * </pre>
     * <pre>
     * ‐船積実績サービスの条件ドメイン作成
     *     {@link W7005CriteriaDomain}を{@link W7001ShippingActCriteriaDomain}に変換する
     * 
     * ‐アップロードファイルデータの削除
     *     {@link W7001ShippingActService#transactOnBlUploadCancel}を呼出す
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W7005CriteriaDomain callServices(W7005CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {

        W7001ShippingActCriteriaDomain shippingActCriteria = createShippingActCriteriaDomain(criteriaDomain);
        
        W7001ShippingActDocDomain docDomain = w7001ShippingActService.transactOnBlUploadCancel(shippingActCriteria);

        return convertToCriteriaDomain(docDomain);
    }
    
    /**
     * 
     * Create a condition of shipping actuality service domain.
     * <br />船積実績サービスの条件ドメインを作成します。
     *
     * @param criteriaDomain Domain conditions of shipment performance Main screen<br />
     * 船積実績Main画面の条件ドメイン
     * @return Conditions of shipment domain service performance<br />
     * 船積実績サービスの条件ドメイン
     */
    protected W7001ShippingActCriteriaDomain createShippingActCriteriaDomain(W7005CriteriaDomain criteriaDomain) {
        W7001ShippingActCriteriaDomain shippingActCriteria = new W7001ShippingActCriteriaDomain();
        
        CommonUtil.copyPropertiesDomainToDomain(shippingActCriteria, criteriaDomain);
        shippingActCriteria.setDscId(criteriaDomain.getLoginUserDscId());
        
        // Those with file management information 
        // ファイル管理情報あり
        if (!StringUtils.isEmpty(criteriaDomain.getFileId())) {
            W7001ShippingActDocDomain docDomain = new W7001ShippingActDocDomain();
            
            docDomain.setFileId(criteriaDomain.getFileId());
            docDomain.setComUpdateTimestamp(criteriaDomain.getComUpdateTimestampForFileMng());
            
            List<W7001ShippingActDocDomain> shippingActDocList = new ArrayList<W7001ShippingActDocDomain>();
            shippingActDocList.add(docDomain);
            shippingActCriteria.setShippingActDocList(shippingActDocList);
        }
        
        return shippingActCriteria;
    }
    
    /**
     * Convert shipping actuality domain to list a domain.
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
