/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.business.service;

import java.io.File;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.TmInvTplDomain;
import com.globaldenso.eca0027.core.business.domain.W9022InvTplMaDomain;
import com.globaldenso.eca0027.core.business.domain.W9022InvTplMaItemDomain;
import com.globaldenso.eca0027.core.business.domain.W9023CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W9022InvTplMaCriteriaDomain;

/**
 * Service interface Invoice Template MA
 * <br />Invoice Template MAのサービスインタフェースです。
 * <pre>
 * bean id: W9022InvTplMaService
 * </pre>
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7966 $
 */
public interface W9022InvTplMaService {

    /**
     * Get search results data
     * <br />検索結果データを取得
     * 
     * @param criteria Search conditions domain<br />
     * 検索条件ドメイン
     * @return Domain that holds the screen information<br />
     * 画面情報を保持するドメイン
     * @throws ApplicationException If an exception occurs<br />
     * 例外が発生した場合
     */
    public List<? extends W9022InvTplMaItemDomain> searchForPagingOnInquirySearch(W9022InvTplMaCriteriaDomain criteria) throws ApplicationException;
    
    /**
     * The physical delete the Invoice Template Master
     * <br />船積書類テンプレート原単位を物理削除
     * <pre>
     * - 4.Lock on the data
     * - 5.Delete Selected data
     * </pre>
     * <pre>
     * - 4.データのロック
     * - 5.選択データの削除
     * </pre>
     * 
     * @param criteria Search conditions domain<br />
     * 検索条件ドメイン
     * @return delete count
     * @throws ApplicationException If an exception occurs<br />
     * 例外が発生した場合
     */
    public int deleteOnInquiryDelete(W9022InvTplMaCriteriaDomain criteria) throws ApplicationException;
    
    /**
     * Get search results data
     * <br />検索結果データを取得
     * <pre>
     * - 4.In the case of correction mode-see mode, the capture of search data
     * - 5.In the case of correction mode-see mode, set to screen search results
     * </pre>
     * <pre>
     * - 4.検索データの取得(修正モード・参照モードの場合のみ)
     * - 5.検索結果を画面に設定(修正モード・参照モードの場合のみ)
     * </pre>
     * 
     * @param criteria Search conditions domain<br />
     * 検索条件ドメイン
     * @return Domain that holds the screen information<br />
     * 画面情報を保持するドメイン
     * @throws ApplicationException If an exception occurs<br />
     * 例外が発生した場合
     */
    public W9022InvTplMaDomain searchOnEditInit(W9022InvTplMaCriteriaDomain criteria) throws ApplicationException;
    
    /**
     * Multiple lines of text check
     * <br />複数行テキストチェック
     *
     * @param txtLines target text
     * @param lineMax max number of per line
     * @param rowMax Max number of lines
     * @return True if there is no error in the input value, otherwise false.
     * @throws ApplicationException Can not be Multiple lines of text check
     */
    public boolean validateConsistencyTxtLines(String txtLines, Integer lineMax, Integer rowMax) 
        throws ApplicationException;
    
    /**
     * Check correlation
     * <br />相関チェック
     *
     * @param invoiceCategory invoiceCategory
     * @param classOfInvoice classOfInvoice
     * @return True if there is no error in the input value, otherwise false.
     * @throws ApplicationException If an exception occurs<br />
     * 例外が発生した場合
     */
    public boolean validateConsistencyInvoiceCategoryClassOfInvoice(String invoiceCategory, String classOfInvoice) throws ApplicationException;
    
     /**
      * File check
      * <br />ファイルチェック
      *
      * @param fileName file name
      * @param fileSize fileSize file size
      * @return message code
      * @throws ApplicationException If an exception occurs<br />
      * 例外が発生した場合
      */
    public String validateConsistencyFile(String fileName, int fileSize) throws ApplicationException;
    
    /**
     * Company presence check
     * <br />Company存在チェック
     *
     * @param company COMPANY CODE<br />
     * 会社コード
     * @return True if there is no error in the input value, otherwise false.
     * @throws ApplicationException If an exception occurs<br />
     * 例外が発生した場合
     */
    public boolean validateDatabaseCompCd(String company) throws ApplicationException;
    
    /**
     * Authority check
     * <br />権限チェックを行います。
     * <pre>
     * - Authority check
     *   Details common specification xls: see "access common specification reference and update authority".
     * </pre>
     * <pre>
     * ‐権限チェック
     *     詳細は共通仕様.xls「アクセス権限共通仕様：参照・更新権限」を参照
     * </pre>
     * 
     * @param compCd COMPANY CODE<br />
     * 会社コード
     * @return True, false and otherwise if there is a function use rights to the COMPANY CODE specified<br />
     * 指定された会社コードに対する機能利用権限があればtrue、そうでなければfalse
     * @throws ApplicationException If the authorization check can not be<br />
     * 権限チェックができない場合
     */
    public boolean validateConsistencyCompanyAuth(String compCd) throws ApplicationException;
    
    /**
     * Lock selection data to Invoice tempalate master.
     * <br />選択データをロック
     *
     * @param compCd company code
     * @param docNo document no
     * @param resultDomain Locked the Invoice template master data.
     * @return Locked true, not Locked false;
     * @throws ApplicationException If an exception occurs<br />
     * 例外が発生した場合
     */
    public boolean validateDatabaseTmInvTplOnEditRegister(String compCd, String docNo, TmInvTplDomain resultDomain)
        throws ApplicationException;
    
    /**
     * Register / Update Invoice Template Master, Register / Update / Delete the File Manage
     * <br />船積書類テンプレート原単位を登録/更新, ファイル管理を登録/更新/削除
     * <pre>
     * - Register / Update Invoice Template Master
     * - Register / Update / Delete the File Manage
     * </pre>
     * <pre>
     * - 船積書類テンプレート原単位を登録/更新
     * - ファイル管理を登録/更新/削除
     * </pre>
     * 
     * @param criteria Criteria Domain
     * @param lockDomain Locked Domain
     * @return W9023CriteriaDomain w9023CriteriaDomain
     * @throws ApplicationException If an exception occurs<br />
     * 例外が発生した場合
     */
    public W9023CriteriaDomain createOnEditRegister(W9022InvTplMaCriteriaDomain criteria, TmInvTplDomain lockDomain) throws ApplicationException;
    
    /**
     * Form creation
     * <br />帳票作成
     *
     * @param criteria Search conditions domain<br />
     * 検索条件ドメイン
     * @return Print Document
     * @throws ApplicationException If an exception occurs<br />
     * 例外が発生した場合
     */
    public File printSample(W9022InvTplMaCriteriaDomain criteria) throws ApplicationException;
}
