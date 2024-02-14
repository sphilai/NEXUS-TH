/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.WB020OdrUploadReqDomain;

/**
 * This is an interface of ordering registration service.
 * <br />受注登録サービスのインタフェースです。
 * <pre>
 * bean id: wB0001OrderEntryService
 * </pre>
 *
 * @author $Author: 10088DS50908 $
 * @version $Revision: 13730 $
 */
public interface WB020OdrUploadService {

    /**
     * Run a initialize search process of Order Upload Screen
     * <br />受注アップロード画面の初期検索処理を行います。
     * <pre>
     * - Search the Request information of the order upload table
     *     With criteria as an argument, get the Request information of the order upload table
     *     by calling {@link Wb020OdrUploadDao#searchOdrUploadReqMgt(WB020OdrUploadReqDomain)}
     * 
     * - Return search results
     *         Return search results in a form of list {@link WB020OdrUploadReqDomain}
     *         
     * - 受注アップロードリクエスト管理テーブルの検索
     *     criteriaを引数にして、{@link Wb020OdrUploadDao#searchOdrUploadReqMgt(WB020OdrUploadReqDomain)}を呼出し、
     *     受注アップロードリクエスト管理テーブルを取得する
     *     
     * - 検索結果の返却
     *     結果を{@link WB020OdrUploadReqDomain}で返却する
     * </pre>
     *
     * @param wb020CriteriaDomain - search conditions domain
     * @return search results
     * @throws ApplicationException - if cannot refer Order CSV
     */
    public List<? extends WB020OdrUploadReqDomain> searchOnInit(WB020OdrUploadReqDomain wb020CriteriaDomain)
        throws ApplicationException;

    /**
     * Registration process of a Order Upload screen
     * <br />受注アップロード画面の登録処理
     * <pre>
     * - Register an upload file with File Manager
     * - Register a request with AI-JB
     * 
     * - アップロードファイルをファイルマネージャーに登録する
     * - AI-JBにリクエストを登録する。
     * </pre>
     *
     * @param wb020CriteriaDomain - upload domain
     * @return upload result
     * @throws ApplicationException - if cannot register Order CSV
     */
    public boolean transactUpload(WB020OdrUploadReqDomain wb020CriteriaDomain)
        throws ApplicationException;

}