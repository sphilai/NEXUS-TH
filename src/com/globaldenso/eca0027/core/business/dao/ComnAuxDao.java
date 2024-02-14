/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.dao;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.T0100BatchDeleteDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain;

/**
 * DAO Interface For Batches That Delete Unnecessary Data <br />
 * 不要データ削除バッチのDAOインタフェースです。
 * 
 * <pre>
 * This interface has been created based on the following specifications. <br />
 * 以下の仕様をベースに作成しています。
 * trunk\200_外部設計\011_外部設計書(更新不可12月版)\08_Job Definition Document\T_Common Auxiliary Screen\ジョブ定義書_ECA0027T0100_不要データ削除.xls の revision 358
 * trunk\300_内部設計\370_SQLMap定義書\08_Job Definition Document\T_Common Auxiliary Screen\SQLMap Definition Document (T_Common Auxiliary Screen) .xls の revision 2316
 * trunk\300_内部設計\380_内部設計書\386_Batch\Class Relationship Diagrams Service-DAO (T_Common Auxiliary Screen).xls の revision 1658
 * </pre>
 *
 * @author $Author: G453S402002 $
 * @version $Revision: 14926 $
 */
public interface ComnAuxDao {

    /**
     * 2. Method To Delete records of 'Mix Tag KANBAN' <br />
     * <br />2. Mix品かんばん情報削除
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteTtMixKanban(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 3-1. Method To Delete records of 'Mix Tag Receive Order' <br />
     * <br />3-1. Mixed品目番号受注情報削除
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteTtMixtagItemOdr(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 3-2. Method To Delete records of 'Mix Tag Item No' <br />
     * <br />3-2. Mixed品目番号情報削除
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteTtMixtagItemNo(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 4. Method To Delete records of 'Mix Tag RT' <br />
     * <br />4. Mixed用RT材情報削除
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteTtMixtagRt(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 5. Method To Delete records of 'Palletize Instruction Receive Order' <br />
     * <br />5. 梱包指示品目番号受注情報削除
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteTtPltzInstrOdr(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 6. Method To Delete records of 'Palletize Instruction Item No' <br />
     * <br />6. 梱包指示品目番号情報削除
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteTtPltzInstrItemNo(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 7. Method To Delete records of 'Palletize Item Receive Order' <br />
     * <br />7. パレタイズ対象品受注情報削除
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteTtPltzItemOdr(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 8. Method To Delete records of 'Palletize Item KANBAN' <br />
     * <br />8. パレタイズ対象品かんばん情報削除
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteTtPltzKanban(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 9. Method To Save the Mix Tag To Be Deleted <br />
     * <br />9. 削除対象のMixタグ退避
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return The list of Mix tags<br />Mixタグのリスト
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public List<? extends T0100BatchDeleteDomain> searchTtPltzItemMixtag(T0100BatchDeleteCriteriaDomain criteria)
        throws ApplicationException;

    /**
     * 10. Method To Save Packing Instruction No. To Be Deleted <br />
     * <br />10. 削除対象の梱包指示No.退避
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return The list of Palletize Instr. No. .<br />梱包指示No.のリスト
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public List<? extends T0100BatchDeleteDomain> searchTtPltzItemPltzInstrNo(T0100BatchDeleteCriteriaDomain criteria)
        throws ApplicationException;

    /**
     * 11. Method To Delete Information On Item For Palletizing <br />
     * <br />11. パレタイズ対象品情報削除
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteTtPltzItem(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 12. Method To Delete Information On Mixed Label <br />
     * <br />12. Mixed現品票情報削除
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteTtMixtag(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 13. Method To Delete Information On Packing Instruction <br />
     * <br />13. 梱包指示情報削除
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteTtPltzInstr(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 14. Method To Delete Information For Shipment Confirmation <br />
     * <br />14. 出荷確認情報削除
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteTtShippingFirm(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 15. Method To Save Conclusion Main Mark To Be Deleted <br />
     * <br />15. 削除対象のまとめメインマーク退避
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return The list of Palletize Instr. No.<br />梱包指示No.のリスト
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public List<? extends T0100BatchDeleteDomain> searchTtPltzXMainMark(T0100BatchDeleteCriteriaDomain criteria)
        throws ApplicationException;

    /**
     * 16. Method To Save Staging Instruction No. To Be Deleted <br />
     * <br />16. 削除対象の荷揃え指示No.退避
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return The list of Palletize Instr. No.<br />梱包指示No.のリスト
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public List<? extends T0100BatchDeleteDomain> searchTtPltzByStagingInstr(T0100BatchDeleteCriteriaDomain criteria)
        throws ApplicationException;

    /**
     * 17. Method To Save Staging Actuality No. To Be Deleted <br />
     * <br />17. 削除対象の山作り実績No.退避
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return The list of Palletize Instr. No.<br />梱包指示No.のリスト
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public List<? extends T0100BatchDeleteDomain> searchTtPltzByStagingActuality(T0100BatchDeleteCriteriaDomain criteria)
        throws ApplicationException;

    /**
     * 18. Method To Delete Information on Palletizing
     * <br />18. パレタイズ情報削除
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteTtPltz(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 19. Method To Delete Information on Summary Palletizing <br />
     * <br />19. まとめパレタイズ情報削除
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteTtXpltz(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 20. Method To Delete Information On Staging Instruction <br />
     * <br />20. 荷揃え指示情報削除
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteTtStgInstr(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 21. Method To Delete Information On Staging Actuality <br />
     * <br />21. 山作り実績情報削除
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteTtStgAct(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 22. Method To Delete Information Related Invoice ( Main Invoice - Re-Invoice ) <br />
     * -    Common  0.2.1. To Delete File Management Information On Shipping Documents <br />
     * <br />22. インボイス関連情報削除(メインインボイス-リインボイス)
     *     共通　0.2.1. 船積書類ファイル管理情報削除
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteLbFileManagerByshippinActMainReinv(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 22. Method To Delete Information Related Invoice ( Main Invoice - Re-Invoice ) <br />
     * -   Common  0.2.2. To Delete Information On Shipping documents <br />
     * <br />22. インボイス関連情報削除(メインインボイス-リインボイス) 
     *     共通　0.2.2. 船積書類情報削除
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteTtShippingDocumentByMainReinv(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 22. Method To Delete Information Related Invoice ( Main Invoice - Re-Invoice ) <br />
     * -   Common  0.2.3. To Delete Information On Packing Attach Item No. <br />
     * <br />22. インボイス関連情報削除(メインインボイス-リインボイス)
     *     共通　0.2.3. パッキングアタッチ_品目番号情報削除
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteTtPackAtchItemNoByMainReinv(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 22. Method To Delete Information Related Invoice ( Main Invoice - Re-Invoice ) <br />
     * -   Common  0.2.4. To Delete Information On Packing Attach CML <br />
     * <br />22. インボイス関連情報削除(メインインボイス-リインボイス)
     *     共通　0.2.4. パッキングアタッチ_CML情報削除
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteTtPackingAttachedCmlByMainReinv(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 22. Method To Delete Information Related Invoice ( Main Invoice - Re-Invoice ) <br />
     * -   Common  0.2.5. To Delete File Management Information On Packing Documents <br />
     * <br />22. インボイス関連情報削除(メインインボイス-リインボイス)
     *     共通　0.2.5. パッキング書類ファイル管理情報削除
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteLbFileManagerPackingByMainReinv(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 22. Method To Delete Information Related Invoice ( Main Invoice - Re-Invoice ) <br />
     * -   Common  0.2.6. To Delete Information On Packing Header <br />
     * <br />22. インボイス関連情報削除(メインインボイス-リインボイス)
     *     共通　0.2.6. パッキングヘッダ情報削除
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteTtPackingHeadByMainReinv(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 22. Method To Delete Information Related Invoice ( Main Invoice - Re-Invoice ) <br />
     * -   Common  0.2.7. To Delete Information On Invoice Attached <br />
     * <br />22. インボイス関連情報削除(メインインボイス-リインボイス)
     *     共通　0.2.7. インボイスアタッチ情報削除
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteTtInvoiceAttachedByMainReinv(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 22. Method To Delete Information Related Invoice ( Main Invoice - Re-Invoice ) <br />
     * -   Common  0.2.8. To Delete File Management Information On Invoice Documents <br />
     * <br />22. インボイス関連情報削除(メインインボイス-リインボイス)
     *     共通　0.2.8. インボイス書類ファイル管理情報削除
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteLbFileManagerInvoiceByMainReinv(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 22. Method To Delete Information Related Invoice ( Main Invoice - Re-Invoice ) <br />
     * -   Common  0.2.9. To Delete Information On Invoice Header <br />
     * <br />22. インボイス関連情報削除(メインインボイス-リインボイス)
     *     共通　0.2.9. インボイスヘッダ情報削除
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteTtInvoiceHeaderByMainReinv(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 23. Method To Delete Information On Invoice ( Main Invoice - Re-Invoice ) <br />
     * <br />23. インボイス情報削除(メインインボイス-リインボイス)
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteTtInvoiceReInvoiceByMainReinv(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 24. Method To Delete Information Related Invoice ( Main Invoice - FRT Invoice ) <br />
     * -   Common  0.2.1. To Delete File Management Information On Shipping Documents <br />
     * <br />24. インボイス関連情報削除(メインインボイス-FRTインボイス)
     *     共通　0.2.1. 船積書類ファイル管理情報削除
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteLbFileManagerByshippinActMainFrt(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 24. Method To Delete Information Related Invoice ( Main Invoice - FRT Invoice ) <br />
     * -   Common  0.2.2. To Delete Information On Shipping documents <br />
     * <br />24. インボイス関連情報削除(メインインボイス-FRTインボイス)
     *     共通　0.2.2. 船積書類情報削除
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteTtShippingDocumentByMainFrt(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 24. Method To Delete Information Related Invoice ( Main Invoice - FRT Invoice ) <br />
     * -   Common  0.2.3. To Delete Information On Packing Attach Item No. <br />
     * <br />24. インボイス関連情報削除(メインインボイス-FRTインボイス)
     *     共通　0.2.3. パッキングアタッチ_品目番号情報削除
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteTtPackAtchItemNoByMainFrt(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 24. Method To Delete Information Related Invoice ( Main Invoice - FRT Invoice ) <br />
     * -   Common  0.2.4. To Delete Information On Packing Attach CML <br />
     * <br />24. インボイス関連情報削除(メインインボイス-FRTインボイス)
     *     共通　0.2.4. パッキングアタッチ_CML情報削除
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteTtPackingAttachedCmlByMainFrt(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 24. Method To Delete Information Related Invoice ( Main Invoice - FRT Invoice ) <br />
     * -   Common  0.2.5. To Delete File Management Information On Packing Documents <br />
     * <br />24. インボイス関連情報削除(メインインボイス-FRTインボイス)
     *     共通　0.2.5. パッキング書類ファイル管理情報削除
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteLbFileManagerPackingByMainFrt(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 24. Method To Delete Information Related Invoice ( Main Invoice - FRT Invoice ) <br />
     * -   Common  0.2.6. To Delete Information On Packing Header <br />
     * <br />24. インボイス関連情報削除(メインインボイス-FRTインボイス)
     *     共通　0.2.6. パッキングヘッダ情報削除
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteTtPackingHeadByMainFrt(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 24. Method To Delete Information Related Invoice ( Main Invoice - FRT Invoice ) <br />
     * -   Common  0.2.7. To Delete Information On Invoice Attached <br />
     * <br />24. インボイス関連情報削除(メインインボイス-FRTインボイス)
     *     共通　0.2.7. インボイスアタッチ情報削除
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteTtInvoiceAttachedByMainFrt(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 24. Method To Delete Information Related Invoice ( Main Invoice - FRT Invoice ) <br />
     * -   Common  0.2.8. To Delete File Management Information On Invoice Documents <br />
     * <br />24. インボイス関連情報削除(メインインボイス-FRTインボイス)
     *     共通　0.2.8. インボイス書類ファイル管理情報削除
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteLbFileManagerInvoiceByMainFrt(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 24. Method To Delete Information Related Invoice ( Main Invoice - FRT Invoice ) <br />
     * -   Common  0.2.9. To Delete Information On Invoice Header <br />
     * <br />24. インボイス関連情報削除(メインインボイス-FRTインボイス)
     *     共通　0.2.9. インボイスヘッダ情報削除
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteTtInvoiceHeaderByMainFrt(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 25. Method To Delete Information On Invoice ( Main Invoice - FRT Invoice ) <br />
     * <br />25. インボイス情報削除(メインインボイス-FRTインボイス)
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteTtInvoiceByMainFrt(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 26. Method To Delete Information Related Invoice ( Main Invoice ) <br />
     * -    Common  0.2.1. To Delete File Management Information On Shipping Documents <br />
     * <br />26. インボイス関連情報削除(メインインボイス)
     *     共通　0.2.1. 船積書類ファイル管理情報削除
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteLbFileManagerByshippinActMain(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 26. Invoice pertinent information delete (main Invoice)  
     *       Common 0.2.2. Shipping-Document information delete
     * <br />26. インボイス関連情報削除(メインインボイス)
     *     共通　0.2.2. 船積書類情報削除
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteTtShippingDocumentByMain(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 26. Invoice pertinent information delete (main Invoice)  
     *       Common 0.2.3. Packing-Attached-Item-No information delete
     * <br />26. インボイス関連情報削除(メインインボイス)
     *     共通　0.2.3. パッキングアタッチ_品目番号情報削除
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteTtPackAtchItemNoByMain(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 26. Invoice pertinent information delete (main Invoice)  
     *       Common 0.2.4. Packing-Attached-CML information delete
     * <br />26. インボイス関連情報削除(メインインボイス)
     *     共通　0.2.4. パッキングアタッチ_CML情報削除
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteTtPackingAttachedCmlByMain(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 26. Invoice pertinent information delete (main Invoice)  
     *       Common 0.2.5. Packing documents file-management-information delete
     * <br />26. インボイス関連情報削除(メインインボイス)
     *     共通　0.2.5. パッキング書類ファイル管理情報削除
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteLbFileManagerPackingByMain(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 26. Invoice pertinent information delete (main Invoice)  
     *       Common 0.2.6. Packing-Header information delete
     * <br />26. インボイス関連情報削除(メインインボイス)
     *     共通　0.2.6. パッキングヘッダ情報削除
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteTtPackingHeadByMain(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 26. Invoice pertinent information delete (main Invoice)  
     *       Common 0.2.7. Invoice-Attached information delete
     * <br />26. インボイス関連情報削除(メインインボイス)
     *     共通　0.2.7. インボイスアタッチ情報削除
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteTtInvoiceAttachedByMain(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 26. Invoice pertinent information delete (main Invoice)  
     *       Common 0.2.8. Invoice documents file-management-information delete
     * <br />26. インボイス関連情報削除(メインインボイス)
     *     共通　0.2.8. インボイス書類ファイル管理情報削除
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteLbFileManagerInvoiceByMain(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 26. Invoice pertinent information delete (main Invoice)  
     *       Common 0.2.9. Invoice-Header information delete
     * <br />26. インボイス関連情報削除(メインインボイス)
     *     共通　0.2.9. インボイスヘッダ情報削除
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteTtInvoiceHeaderByMain(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 27. invoice information delete (main Invoice)  
     * <br />27. インボイス情報削除(メインインボイス)
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteTtInvoiceByMain(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 28. Shipping-Actuality-Receive-Order delete
     * <br />28. 船積実績対象品受注情報削除
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteTtShippingActOdr(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 29. B/L, a CLP file-management-information delete
     * <br />29. B/L、CLPファイル管理情報削除
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteLbFileManagerByBlClp(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 30. Shipping-Actuality information delete
     * <br />30. 船積実績情報削除
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteTtShippingAct(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 31. Delete of a shipped firm-order-receipt information
     * <br />31. 出荷済確定受注情報の削除
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteTtExpRcvOdrByShiped(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 32. Delete of an unofficial announcement ordering information
     * <br />32. 内示受注情報の削除
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteTtExpRcvOdrByPrivateNotification(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 33. Delete of the invoice information before cancellation by which the cancellation Invoice was published
     * 33.1. Invoice pertinent information delete (front [ cancellation ] Invoice Re-Invoice)  
     *       Common 0.2.1. Shipping-Document file-management-information delete
     * <br />33. キャンセルインボイスが発行されたキャンセル前インボイス情報の削除
     * 33.1. インボイス関連情報削除(キャンセル前インボイス-リインボイス)
     *     共通　0.2.1. 船積書類ファイル管理情報削除
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteLbFileManagerByshippinActBforCancelReinv(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 33. Delete of the invoice information before cancellation by which the cancellation Invoice was published
     * 33.1. Invoice pertinent information delete (front [ cancellation ] Invoice Re-Invoice)  
     *       Common 0.2.2. Shipping-Document information delete
     * <br />33. キャンセルインボイスが発行されたキャンセル前インボイス情報の削除
     * 33.1. インボイス関連情報削除(キャンセル前インボイス-リインボイス)
     *     共通　0.2.2. 船積書類情報削除
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteTtShippingDocumentByBforCancelReinv(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 33. Delete of the invoice information before cancellation by which the cancellation Invoice was published
     * 33.1. Invoice pertinent information delete (front [ cancellation ] Invoice Re-Invoice)  
     *       Common 0.2.3. Packing-Attached-Item-No information delete
     * <br />33. キャンセルインボイスが発行されたキャンセル前インボイス情報の削除
     * 33.1. インボイス関連情報削除(キャンセル前インボイス-リインボイス)
     *     共通　0.2.3. パッキングアタッチ_品目番号情報削除
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteTtPackAtchItemNoByBforCancelReinv(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 33. Delete of the invoice information before cancellation by which the cancellation Invoice was published
     * 33.1. Invoice pertinent information delete (front [ cancellation ] Invoice Re-Invoice)  
     *       Common 0.2.4. Packing-Attached-CML information delete
     * <br />33. キャンセルインボイスが発行されたキャンセル前インボイス情報の削除
     * 33.1. インボイス関連情報削除(キャンセル前インボイス-リインボイス)
     *     共通　0.2.4. パッキングアタッチ_CML情報削除
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteTtPackingAttachedCmlByBforCancelReinv(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 33. Delete of the invoice information before cancellation by which the cancellation Invoice was published
     * 33.1. Invoice pertinent information delete (front [ cancellation ] Invoice Re-Invoice)  
     *       Common 0.2.5. Packing documents file-management-information delete
     * <br />33. キャンセルインボイスが発行されたキャンセル前インボイス情報の削除
     * 33.1. インボイス関連情報削除(キャンセル前インボイス-リインボイス)
     *     共通　0.2.5. パッキング書類ファイル管理情報削除
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteLbFileManagerPackingByBforCancelReinv(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 33. Delete of the invoice information before cancellation by which the cancellation Invoice was published
     * 33.1. Invoice pertinent information delete (front [ cancellation ] Invoice Re-Invoice)  
     *       Common 0.2.6. Packing-Header information delete
     * <br />33. キャンセルインボイスが発行されたキャンセル前インボイス情報の削除
     * 33.1. インボイス関連情報削除(キャンセル前インボイス-リインボイス)
     *     共通　0.2.6. パッキングヘッダ情報削除
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteTtPackingHeadByBforCancelReinv(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 33. Delete of the invoice information before cancellation by which the cancellation Invoice was published
     * 33.1. Invoice pertinent information delete (front [ cancellation ] Invoice Re-Invoice)  
     *       Common 0.2.7. Invoice-Attached information delete
     * <br />33. キャンセルインボイスが発行されたキャンセル前インボイス情報の削除
     * 33.1. インボイス関連情報削除(キャンセル前インボイス-リインボイス)
     *     共通　0.2.7. インボイスアタッチ情報削除
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteTtInvoiceAttachedByBforCancelReinv(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 33. Delete of the invoice information before cancellation by which the cancellation Invoice was published
     * 33.1. Invoice pertinent information delete (front [ cancellation ] Invoice Re-Invoice)  
     *       Common 0.2.8. Invoice documents file-management-information delete
     * <br />33. キャンセルインボイスが発行されたキャンセル前インボイス情報の削除
     * 33.1. インボイス関連情報削除(キャンセル前インボイス-リインボイス)
     *     共通　0.2.8. インボイス書類ファイル管理情報削除
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteLbFileManagerInvoiceByBforCancelReinv(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 33. Delete of the invoice information before cancellation by which the cancellation Invoice was published
     * 33.1. Invoice pertinent information delete (front [ cancellation ] Invoice Re-Invoice)  
     *       Common 0.2.9. Invoice-Header information delete
     * <br />33. キャンセルインボイスが発行されたキャンセル前インボイス情報の削除
     * 33.1. インボイス関連情報削除(キャンセル前インボイス-リインボイス)
     *     共通　0.2.9. インボイスヘッダ情報削除
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteTtInvoiceHeaderByBforCancelReinv(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 33. Delete of the invoice information before cancellation by which the cancellation Invoice was published
     * 33.2. invoice information delete (front [ cancellation ] Invoice Re-Invoice)
     * <br />33. キャンセルインボイスが発行されたキャンセル前インボイス情報の削除
     * 33.2. インボイス情報削除(キャンセル前インボイス-リインボイス)
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteTtInvoiceByBforCancelReinv(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 33. Delete of the invoice information before cancellation by which the cancellation Invoice was published
     * 33.3. Invoice pertinent information delete (front [ cancellation ] Invoice FRT Invoice)  
     *       Common 0.2.1. Shipping-Document file-management-information delete
     * <br />33. キャンセルインボイスが発行されたキャンセル前インボイス情報の削除
     * 33.3. インボイス関連情報削除(キャンセル前インボイス-FRTインボイス)
     *     共通　0.2.1. 船積書類ファイル管理情報削除
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteLbFileManagerByshippinActBforCancelFrt(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 33. Delete of the invoice information before cancellation by which the cancellation Invoice was published
     * 33.3. Invoice pertinent information delete (front [ cancellation ] Invoice FRT Invoice)  
     *       Common 0.2.2. Shipping-Document information delete
     * <br />33. キャンセルインボイスが発行されたキャンセル前インボイス情報の削除
     * 33.3. インボイス関連情報削除(キャンセル前インボイス-FRTインボイス)
     *     共通　0.2.2. 船積書類情報削除
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteTtShippingDocumentByBforCancelFrt(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 33. Delete of the invoice information before cancellation by which the cancellation Invoice was published
     * 33.3. Invoice pertinent information delete (front [ cancellation ] Invoice FRT Invoice)  
     *       Common 0.2.3. Packing-Attached-Item-No information delete
     * <br />33. キャンセルインボイスが発行されたキャンセル前インボイス情報の削除
     * 33.3. インボイス関連情報削除(キャンセル前インボイス-FRTインボイス)
     *     共通　0.2.3. パッキングアタッチ_品目番号情報削除
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteTtPackAtchItemNoByBforCancelFrt(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 33. Delete of the invoice information before cancellation by which the cancellation Invoice was published
     * 33.3. Invoice pertinent information delete (front [ cancellation ] Invoice FRT Invoice)  
     *       Common 0.2.4. Packing-Attached-CML information delete
     * <br />33. キャンセルインボイスが発行されたキャンセル前インボイス情報の削除
     * 33.3. インボイス関連情報削除(キャンセル前インボイス-FRTインボイス)
     *     共通　0.2.4. パッキングアタッチ_CML情報削除
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteTtPackingAttachedCmlByBforCancelFrt(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 33. Delete of the invoice information before cancellation by which the cancellation Invoice was published
     * 33.3. Invoice pertinent information delete (front [ cancellation ] Invoice FRT Invoice)  
     *       Common 0.2.5. Packing documents file-management-information delete
     * <br />33. キャンセルインボイスが発行されたキャンセル前インボイス情報の削除
     * 33.3. インボイス関連情報削除(キャンセル前インボイス-FRTインボイス)
     *     共通　0.2.5. パッキング書類ファイル管理情報削除
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteLbFileManagerPackingByBforCancelFrt(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 33. Delete of the invoice information before cancellation by which the cancellation Invoice was published
     * 33.3. Invoice pertinent information delete (front [ cancellation ] Invoice FRT Invoice)  
     *       Common 0.2.6. Packing-Header information delete
     * <br />33. キャンセルインボイスが発行されたキャンセル前インボイス情報の削除
     * 33.3. インボイス関連情報削除(キャンセル前インボイス-FRTインボイス)
     *     共通　0.2.6. パッキングヘッダ情報削除
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteTtPackingHeadByBforCancelFrt(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 33. Delete of the invoice information before cancellation by which the cancellation Invoice was published
     * 33.3. Invoice pertinent information delete (front [ cancellation ] Invoice FRT Invoice)  
     *       Common 0.2.7. Invoice-Attached information delete
     * <br />33. キャンセルインボイスが発行されたキャンセル前インボイス情報の削除
     * 33.3. インボイス関連情報削除(キャンセル前インボイス-FRTインボイス)
     *     共通　0.2.7. インボイスアタッチ情報削除
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteTtInvoiceAttachedByBforCancelFrt(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 33. Delete of the invoice information before cancellation by which the cancellation Invoice was published
     * 33.3. Invoice pertinent information delete (front [ cancellation ] Invoice FRT Invoice)  
     *       Common 0.2.8. Invoice documents file-management-information delete
     * <br />33. キャンセルインボイスが発行されたキャンセル前インボイス情報の削除
     * 33.3. インボイス関連情報削除(キャンセル前インボイス-FRTインボイス)
     *     共通　0.2.8. インボイス書類ファイル管理情報削除
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteLbFileManagerInvoiceByBforCancelFrt(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 33. Delete of the invoice information before cancellation by which the cancellation Invoice was published
     * 33.3. Invoice pertinent information delete (front [ cancellation ] Invoice FRT Invoice)  
     *       Common 0.2.9. Invoice-Header information delete
     * <br />33. キャンセルインボイスが発行されたキャンセル前インボイス情報の削除
     * 33.3. インボイス関連情報削除(キャンセル前インボイス-FRTインボイス)
     *     共通　0.2.9. インボイスヘッダ情報削除
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteTtInvoiceHeaderByBforCancelFrt(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 33. Delete of the invoice information before cancellation by which the cancellation Invoice was published
     * 33.4. invoice information delete (front [ cancellation ] Invoice FRT Invoice)  
     * <br />33. キャンセルインボイスが発行されたキャンセル前インボイス情報の削除
     * 33.4. インボイス情報削除(キャンセル前インボイス-FRTインボイス)
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteTtInvoiceByBforCancelFrt(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 33. Delete of the invoice information before cancellation by which the cancellation Invoice was published
     * 33.5. Invoice pertinent information delete (front [ cancellation ] Invoice)
     *       Common 0.2.1. Shipping-Document file-management-information delete
     * <br />33. キャンセルインボイスが発行されたキャンセル前インボイス情報の削除
     * 33.5. インボイス関連情報削除(キャンセル前インボイス)
     *     共通　0.2.1. 船積書類ファイル管理情報削除
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteLbFileManagerByshippinActBforCancel(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 33. Delete of the invoice information before cancellation by which the cancellation Invoice was published
     * 33.5. Invoice pertinent information delete (front [ cancellation ] Invoice)
     *       Common 0.2.2. Shipping-Document information delete
     * <br />33. キャンセルインボイスが発行されたキャンセル前インボイス情報の削除
     * 33.5. インボイス関連情報削除(キャンセル前インボイス)
     *     共通　0.2.2. 船積書類情報削除
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteTtShippingDocumentByBforCancel(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 33. Delete of the invoice information before cancellation by which the cancellation Invoice was published
     * 33.5. Invoice pertinent information delete (front [ cancellation ] Invoice)
     *       Common 0.2.3. Packing-Attached-Item-No information delete
     * <br />33. キャンセルインボイスが発行されたキャンセル前インボイス情報の削除
     * 33.5. インボイス関連情報削除(キャンセル前インボイス)
     *     共通　0.2.3. パッキングアタッチ_品目番号情報削除
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteTtPackAtchItemNoByBforCancel(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 33. Delete of the invoice information before cancellation by which the cancellation Invoice was published
     * 33.5. Invoice pertinent information delete (front [ cancellation ] Invoice)
     *       Common 0.2.4. Packing-Attached-CML information delete
     * <br />33. キャンセルインボイスが発行されたキャンセル前インボイス情報の削除
     * 33.5. インボイス関連情報削除(キャンセル前インボイス)
     *     共通　0.2.4. パッキングアタッチ_CML情報削除
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteTtPackingAttachedCmlByBforCancel(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 33. Delete of the invoice information before cancellation by which the cancellation Invoice was published
     * 33.5. Invoice pertinent information delete (front [ cancellation ] Invoice)
     *       Common 0.2.5. Packing documents file-management-information delete
     * <br />33. キャンセルインボイスが発行されたキャンセル前インボイス情報の削除
     * 33.5. インボイス関連情報削除(キャンセル前インボイス)
     *     共通　0.2.5. パッキング書類ファイル管理情報削除
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteLbFileManagerPackingByBforCancel(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 33. Delete of the invoice information before cancellation by which the cancellation Invoice was published
     * 33.5. Invoice pertinent information delete (front [ cancellation ] Invoice)
     *       Common 0.2.6. Packing-Header information delete
     * <br />33. キャンセルインボイスが発行されたキャンセル前インボイス情報の削除
     * 33.5. インボイス関連情報削除(キャンセル前インボイス)
     *     共通　0.2.6. パッキングヘッダ情報削除
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteTtPackingHeadByBforCancel(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 33. Delete of the invoice information before cancellation by which the cancellation Invoice was published
     * 33.5. Invoice pertinent information delete (front [ cancellation ] Invoice)
     *       Common 0.2.7. Invoice-Attached information delete
     * <br />33. キャンセルインボイスが発行されたキャンセル前インボイス情報の削除
     * 33.5. インボイス関連情報削除(キャンセル前インボイス)
     *     共通　0.2.7. インボイスアタッチ情報削除
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteTtInvoiceAttachedByBforCancel(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 33. Delete of the invoice information before cancellation by which the cancellation Invoice was published
     * 33.5. Invoice pertinent information delete (front [ cancellation ] Invoice)
     *       Common 0.2.8. Invoice documents file-management-information delete
     * <br />33. キャンセルインボイスが発行されたキャンセル前インボイス情報の削除
     * 33.5. インボイス関連情報削除(キャンセル前インボイス)
     *     共通　0.2.8. インボイス書類ファイル管理情報削除
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteLbFileManagerInvoiceByBforCancel(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 33. Delete of the invoice information before cancellation by which the cancellation Invoice was published
     * 33.5. Invoice pertinent information delete (front [ cancellation ] Invoice)
     *       Common 0.2.9. Invoice-Header information delete
     * <br />33. キャンセルインボイスが発行されたキャンセル前インボイス情報の削除
     * 33.5. インボイス関連情報削除(キャンセル前インボイス)
     *     共通　0.2.9. インボイスヘッダ情報削除
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteTtInvoiceHeaderByBforCancel(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 33. Delete of the invoice information before cancellation by which the cancellation Invoice was published
     * 33.6. invoice information delete (front [ cancellation ] Invoice)
     * <br />33. キャンセルインボイスが発行されたキャンセル前インボイス情報の削除
     * 33.6. インボイス情報削除(キャンセル前インボイス)
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteTtInvoiceByBforCancel(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 34. Information delete of the cancellation Invoice itself
     * 34.1. Invoice pertinent information delete (cancellation Invoice Re-Invoice)  
     *       Common 0.2.1. Shipping-Document file-management-information delete
     * <br />34. キャンセルインボイス自体の情報削除
     * 34.1. インボイス関連情報削除(キャンセルインボイス-リインボイス)
     *     共通　0.2.1. 船積書類ファイル管理情報削除
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteLbFileManagerByshippinActCancelReinv(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 34. Information delete of the cancellation Invoice itself
     * 34.1. Invoice pertinent information delete (cancellation Invoice Re-Invoice)  
     *       Common 0.2.2. Shipping-Document information delete
     * <br />34. キャンセルインボイス自体の情報削除
     * 34.1. インボイス関連情報削除(キャンセルインボイス-リインボイス)
     *     共通　0.2.2. 船積書類情報削除
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteTtShippingDocumentByCancelReinv(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 34. Information delete of the cancellation Invoice itself
     * 34.1. Invoice pertinent information delete (cancellation Invoice Re-Invoice)  
     *       Common 0.2.3. Packing-Attached-Item-No information delete
     * <br />34. キャンセルインボイス自体の情報削除
     * 34.1. インボイス関連情報削除(キャンセルインボイス-リインボイス)
     *     共通　0.2.3. パッキングアタッチ_品目番号情報削除
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteTtPackAtchItemNoByCancelReinv(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 34. Information delete of the cancellation Invoice itself
     * 34.1. Invoice pertinent information delete (cancellation Invoice Re-Invoice)  
     *       Common 0.2.4. Packing-Attached-CML information delete
     * <br />34. キャンセルインボイス自体の情報削除
     * 34.1. インボイス関連情報削除(キャンセルインボイス-リインボイス)
     *     共通　0.2.4. パッキングアタッチ_CML情報削除
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteTtPackingAttachedCmlByCancelReinv(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 34. Information delete of the cancellation Invoice itself
     * 34.1. Invoice pertinent information delete (cancellation Invoice Re-Invoice)  
     *       Common 0.2.5. Packing documents file-management-information delete
     * <br />34. キャンセルインボイス自体の情報削除
     * 34.1. インボイス関連情報削除(キャンセルインボイス-リインボイス)
     *     共通　0.2.5. パッキング書類ファイル管理情報削除
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteLbFileManagerPackingByCancelReinv(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 34. Information delete of the cancellation Invoice itself
     * 34.1. Invoice pertinent information delete (cancellation Invoice Re-Invoice)  
     *       Common 0.2.6. Packing-Header information delete
     * <br />34. キャンセルインボイス自体の情報削除
     * 34.1. インボイス関連情報削除(キャンセルインボイス-リインボイス)
     *     共通　0.2.6. パッキングヘッダ情報削除
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteTtPackingHeadByCancelReinv(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 34. Information delete of the cancellation Invoice itself
     * 34.1. Invoice pertinent information delete (cancellation Invoice Re-Invoice)  
     *       Common 0.2.7. Invoice-Attached information delete
     * <br />34. キャンセルインボイス自体の情報削除
     * 34.1. インボイス関連情報削除(キャンセルインボイス-リインボイス)
     *     共通　0.2.7. インボイスアタッチ情報削除
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteTtInvoiceAttachedByCancelReinv(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 34. Information delete of the cancellation Invoice itself
     * 34.1. Invoice pertinent information delete (cancellation Invoice Re-Invoice)  
     *       Common 0.2.8. Invoice documents file-management-information delete
     * <br />34. キャンセルインボイス自体の情報削除
     * 34.1. インボイス関連情報削除(キャンセルインボイス-リインボイス)
     *     共通　0.2.8. インボイス書類ファイル管理情報削除
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteLbFileManagerInvoiceByCancelReinv(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 34. Information delete of the cancellation Invoice itself
     * 34.1. Invoice pertinent information delete (cancellation Invoice Re-Invoice)  
     *       Common 0.2.9. Invoice-Header information delete
     * <br />34. キャンセルインボイス自体の情報削除
     * 34.1. インボイス関連情報削除(キャンセルインボイス-リインボイス)
     *     共通　0.2.9. インボイスヘッダ情報削除
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteTtInvoiceHeaderByCancelReinv(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 34. Information delete of the cancellation Invoice itself
     * 34.2. invoice information delete (cancellation Invoice Re-Invoice)  
     * <br />34. キャンセルインボイス自体の情報削除
     * 34.2. インボイス情報削除(キャンセルインボイス-リインボイス)
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteTtInvoiceByCancelReinv(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 34. Information delete of the cancellation Invoice itself
     * 34.3. Invoice pertinent information delete (cancellation Invoice FRT Invoice)  
     *       Common 0.2.1. Shipping-Document file-management-information delete
     * <br />34. キャンセルインボイス自体の情報削除
     * 34.3. インボイス関連情報削除(キャンセルインボイス-FRTインボイス)
     *     共通　0.2.1. 船積書類ファイル管理情報削除
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteLbFileManagerByshippinActCancelFrt(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 34. Information delete of the cancellation Invoice itself
     * 34.3. Invoice pertinent information delete (cancellation Invoice FRT Invoice)  
     *       Common 0.2.2. Shipping-Document information delete
     * <br />34. キャンセルインボイス自体の情報削除
     * 34.3. インボイス関連情報削除(キャンセルインボイス-FRTインボイス)
     *     共通　0.2.2. 船積書類情報削除
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteTtShippingDocumentByCancelFrt(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 34. Information delete of the cancellation Invoice itself
     * 34.3. Invoice pertinent information delete (cancellation Invoice FRT Invoice)  
     *       Common 0.2.3. Packing-Attached-Item-No information delete
     * <br />34. キャンセルインボイス自体の情報削除
     * 34.3. インボイス関連情報削除(キャンセルインボイス-FRTインボイス)
     *     共通　0.2.3. パッキングアタッチ_品目番号情報削除
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteTtPackAtchItemNoByCancelFrt(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 34. Information delete of the cancellation Invoice itself
     * 34.3. Invoice pertinent information delete (cancellation Invoice FRT Invoice)  
     *       Common 0.2.4. Packing-Attached-CML information delete
     * <br />34. キャンセルインボイス自体の情報削除
     * 34.3. インボイス関連情報削除(キャンセルインボイス-FRTインボイス)
     *     共通　0.2.4. パッキングアタッチ_CML情報削除
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteTtPackingAttachedCmlByCancelFrt(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 34. Information delete of the cancellation Invoice itself
     * 34.3. Invoice pertinent information delete (cancellation Invoice FRT Invoice)  
     *       Common 0.2.5. Packing documents file-management-information delete
     * <br />34. キャンセルインボイス自体の情報削除
     * 34.3. インボイス関連情報削除(キャンセルインボイス-FRTインボイス)
     *     共通　0.2.5. パッキング書類ファイル管理情報削除
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteLbFileManagerPackingByCancelFrt(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 34. Information delete of the cancellation Invoice itself
     * 34.3. Invoice pertinent information delete (cancellation Invoice FRT Invoice)  
     *       Common 0.2.6. Packing-Header information delete
     * <br />34. キャンセルインボイス自体の情報削除
     * 34.3. インボイス関連情報削除(キャンセルインボイス-FRTインボイス)
     *     共通　0.2.6. パッキングヘッダ情報削除
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteTtPackingHeadByCancelFrt(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 34. Information delete of the cancellation Invoice itself
     * 34.3. Invoice pertinent information delete (cancellation Invoice FRT Invoice)  
     *       Common 0.2.7. Invoice-Attached information delete
     * <br />34. キャンセルインボイス自体の情報削除
     * 34.3. インボイス関連情報削除(キャンセルインボイス-FRTインボイス)
     *     共通　0.2.7. インボイスアタッチ情報削除
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteTtInvoiceAttachedByCancelFrt(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 34. Information delete of the cancellation Invoice itself
     * 34.3. Invoice pertinent information delete (cancellation Invoice FRT Invoice)  
     *       Common 0.2.8. Invoice documents file-management-information delete
     * <br />34. キャンセルインボイス自体の情報削除
     * 34.3. インボイス関連情報削除(キャンセルインボイス-FRTインボイス)
     *     共通　0.2.8. インボイス書類ファイル管理情報削除
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteLbFileManagerInvoiceByCancelFrt(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 34. Information delete of the cancellation Invoice itself
     * 34.3. Invoice pertinent information delete (cancellation Invoice FRT Invoice)  
     *       Common 0.2.9. Invoice-Header information delete
     * <br />34. キャンセルインボイス自体の情報削除
     * 34.3. インボイス関連情報削除(キャンセルインボイス-FRTインボイス)
     *     共通　0.2.9. インボイスヘッダ情報削除
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteTtInvoiceHeaderByCancelFrt(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 34. Information delete of the cancellation Invoice itself
     * 34.4. invoice information delete (cancellation Invoice FRT Invoice)  
     * <br />34. キャンセルインボイス自体の情報削除
     * 34.4. インボイス情報削除(キャンセルインボイス-FRTインボイス)
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteTtInvoiceByCancelFrt(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 34. Information delete of the cancellation Invoice itself
     * 34.5. Invoice pertinent information delete (cancellation Invoice)  
     *       Common 0.2.1. Shipping-Document file-management-information delete
     * <br />34. キャンセルインボイス自体の情報削除
     * 34.5. インボイス関連情報削除(キャンセルインボイス)
     *     共通　0.2.1. 船積書類ファイル管理情報削除
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteLbFileManagerByshippinActCancel(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 34. Information delete of the cancellation Invoice itself
     * 34.5. Invoice pertinent information delete (cancellation Invoice)  
     *       Common 0.2.2. Shipping-Document information delete
     * <br />34. キャンセルインボイス自体の情報削除
     * 34.5. インボイス関連情報削除(キャンセルインボイス)
     *     共通　0.2.2. 船積書類情報削除
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteTtShippingDocumentByCancel(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 34. Information delete of the cancellation Invoice itself
     * 34.5. Invoice pertinent information delete (cancellation Invoice)  
     *       Common 0.2.3. Packing-Attached-Item-No information delete
     * <br />34. キャンセルインボイス自体の情報削除
     * 34.5. インボイス関連情報削除(キャンセルインボイス)
     *     共通　0.2.3. パッキングアタッチ_品目番号情報削除
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteTtPackAtchItemNoByCancel(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 34. Information delete of the cancellation Invoice itself
     * 34.5. Invoice pertinent information delete (cancellation Invoice)  
     *       Common 0.2.4. Packing-Attached-CML information delete
     * <br />34. キャンセルインボイス自体の情報削除
     * 34.5. インボイス関連情報削除(キャンセルインボイス)
     *     共通　0.2.4. パッキングアタッチ_CML情報削除
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteTtPackingAttachedCmlByCancel(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 34. Information delete of the cancellation Invoice itself
     * 34.5. Invoice pertinent information delete (cancellation Invoice)  
     *       Common 0.2.5. Packing documents file-management-information delete
     * <br />34. キャンセルインボイス自体の情報削除
     * 34.5. インボイス関連情報削除(キャンセルインボイス)
     *     共通　0.2.5. パッキング書類ファイル管理情報削除
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteLbFileManagerPackingByCancel(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 34. Information delete of the cancellation Invoice itself
     * 34.5. Invoice pertinent information delete (cancellation Invoice)  
     *       Common 0.2.6. Packing-Header information delete
     * <br />34. キャンセルインボイス自体の情報削除
     * 34.5. インボイス関連情報削除(キャンセルインボイス)
     *     共通　0.2.6. パッキングヘッダ情報削除
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteTtPackingHeadByCancel(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 34. Information delete of the cancellation Invoice itself
     * 34.5. Invoice pertinent information delete (cancellation Invoice)  
     *       Common 0.2.7. Invoice-Attached information delete
     * <br />34. キャンセルインボイス自体の情報削除
     * 34.5. インボイス関連情報削除(キャンセルインボイス)
     *     共通　0.2.7. インボイスアタッチ情報削除
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteTtInvoiceAttachedByCancel(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 34. Information delete of the cancellation Invoice itself
     * 34.5. Invoice pertinent information delete (cancellation Invoice)  
     *       Common 0.2.8. Invoice documents file-management-information delete
     * <br />34. キャンセルインボイス自体の情報削除
     * 34.5. インボイス関連情報削除(キャンセルインボイス)
     *     共通　0.2.8. インボイス書類ファイル管理情報削除
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteLbFileManagerInvoiceByCancel(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 34. Information delete of the cancellation Invoice itself
     * 34.5. Invoice pertinent information delete (cancellation Invoice)  
     *       Common 0.2.9. Invoice-Header information delete
     * <br />34. キャンセルインボイス自体の情報削除
     * 34.5. インボイス関連情報削除(キャンセルインボイス)
     *     共通　0.2.9. インボイスヘッダ情報削除
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteTtInvoiceHeaderByCancel(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 34. Information delete of the cancellation Invoice itself
     * 34.6. invoice information delete (cancellation Invoice)  
     * <br />34. キャンセルインボイス自体の情報削除
     * 34.6. インボイス情報削除(キャンセルインボイス)
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteTtInvoiceByCancel(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 35. Delete of manual invoice information
     * 35.1. Invoice pertinent information delete (manual Invoice Re-Invoice)  
     *       Common 0.2.1. Shipping-Document file-management-information delete
     * <br />35. マニュアルインボイス情報の削除
     * 35.1. インボイス関連情報削除(マニュアルインボイス-リインボイス)
     *     共通　0.2.1. 船積書類ファイル管理情報削除
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteLbFileManagerByshippinActManualReinv(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 35. Delete of manual invoice information
     * 35.1. Invoice pertinent information delete (manual Invoice Re-Invoice)  
     *       Common 0.2.2. Shipping-Document information delete
     * <br />35. マニュアルインボイス情報の削除
     * 35.1. インボイス関連情報削除(マニュアルインボイス-リインボイス)
     *     共通　0.2.2. 船積書類情報削除
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteTtShippingDocumentByManualReinv(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 35. Delete of manual invoice information
     * 35.1. Invoice pertinent information delete (manual Invoice Re-Invoice)  
     *       Common 0.2.3. Packing-Attached-Item-No information delete
     * <br />35. マニュアルインボイス情報の削除
     * 35.1. インボイス関連情報削除(マニュアルインボイス-リインボイス)
     *     共通　0.2.3. パッキングアタッチ_品目番号情報削除
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteTtPackAtchItemNoByManualReinv(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 35. Delete of manual invoice information
     * 35.1. Invoice pertinent information delete (manual Invoice Re-Invoice)  
     *       Common 0.2.4. Packing-Attached-CML information delete
     * <br />35. マニュアルインボイス情報の削除
     * 35.1. インボイス関連情報削除(マニュアルインボイス-リインボイス)
     *     共通　0.2.4. パッキングアタッチ_CML情報削除
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteTtPackingAttachedCmlByManualReinv(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 35. Delete of manual invoice information
     * 35.1. Invoice pertinent information delete (manual Invoice Re-Invoice)  
     *       Common 0.2.5. Packing documents file-management-information delete
     * <br />35. マニュアルインボイス情報の削除
     * 35.1. インボイス関連情報削除(マニュアルインボイス-リインボイス)
     *     共通　0.2.5. パッキング書類ファイル管理情報削除
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteLbFileManagerPackingByManualReinv(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 35. Delete of manual invoice information
     * 35.1. Invoice pertinent information delete (manual Invoice Re-Invoice)  
     *       Common 0.2.6. Packing-Header information delete
     * <br />35. マニュアルインボイス情報の削除
     * 35.1. インボイス関連情報削除(マニュアルインボイス-リインボイス)
     *     共通　0.2.6. パッキングヘッダ情報削除
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteTtPackingHeadByManualReinv(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 35. Delete of manual invoice information
     * 35.1. Invoice pertinent information delete (manual Invoice Re-Invoice)  
     *       Common 0.2.7. Invoice-Attached information delete
     * <br />35. マニュアルインボイス情報の削除
     * 35.1. インボイス関連情報削除(マニュアルインボイス-リインボイス)
     *     共通　0.2.7. インボイスアタッチ情報削除
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteTtInvoiceAttachedByManualReinv(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 35. Delete of manual invoice information
     * 35.1. Invoice pertinent information delete (manual Invoice Re-Invoice)  
     *       Common 0.2.8. Invoice documents file-management-information delete
     * <br />35. マニュアルインボイス情報の削除
     * 35.1. インボイス関連情報削除(マニュアルインボイス-リインボイス)
     *     共通　0.2.8. インボイス書類ファイル管理情報削除
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteLbFileManagerInvoiceByManualReinv(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 35. Delete of manual invoice information
     * 35.1. Invoice pertinent information delete (manual Invoice Re-Invoice)  
     *       Common 0.2.9. Invoice-Header information delete
     * <br />35. マニュアルインボイス情報の削除
     * 35.1. インボイス関連情報削除(マニュアルインボイス-リインボイス)
     *     共通　0.2.9. インボイスヘッダ情報削除
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteTtInvoiceHeaderByManualReinv(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 35. Delete of manual invoice information
     * 35.2. invoice information delete (manual Invoice Re-Invoice)  
     * <br />35. マニュアルインボイス情報の削除
     * 35.2. インボイス情報削除(マニュアルインボイス-リインボイス)
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteTtInvoiceByManualReinv(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 35. Delete of manual invoice information
     * 35.3. Invoice pertinent information delete (manual Invoice FRT Invoice)  
     *       Common 0.2.1. Shipping-Document file-management-information delete
     * <br />35. マニュアルインボイス情報の削除
     * 35.3. インボイス関連情報削除(マニュアルインボイス-FRTインボイス)
     *     共通　0.2.1. 船積書類ファイル管理情報削除
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteLbFileManagerByshippinActManualFrt(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 35. Delete of manual invoice information
     * 35.3. Invoice pertinent information delete (manual Invoice FRT Invoice)  
     *       Common 0.2.2. Shipping-Document information delete
     * <br />35. マニュアルインボイス情報の削除
     * 35.3. インボイス関連情報削除(マニュアルインボイス-FRTインボイス)
     *     共通　0.2.2. 船積書類情報削除
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteTtShippingDocumentByManualFrt(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 35. Delete of manual invoice information
     * 35.3. Invoice pertinent information delete (manual Invoice FRT Invoice)  
     *       Common 0.2.3. Packing-Attached-Item-No information delete
     * <br />35. マニュアルインボイス情報の削除
     * 35.3. インボイス関連情報削除(マニュアルインボイス-FRTインボイス)
     *     共通　0.2.3. パッキングアタッチ_品目番号情報削除
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteTtPackAtchItemNoByManualFrt(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 35. Delete of manual invoice information
     * 35.3. Invoice pertinent information delete (manual Invoice FRT Invoice)  
     *       Common 0.2.4. Packing-Attached-CML information delete
     * <br/>35. マニュアルインボイス情報の削除
     * 35.3. インボイス関連情報削除(マニュアルインボイス-FRTインボイス)
     *     共通　0.2.4. パッキングアタッチ_CML情報削除
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteTtPackingAttachedCmlByManualFrt(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 35. Delete of manual invoice information
     * 35.3. Invoice pertinent information delete (manual Invoice FRT Invoice)  
     *       Common 0.2.5. Packing documents file-management-information delete
     * <br />35. マニュアルインボイス情報の削除
     * 35.3. インボイス関連情報削除(マニュアルインボイス-FRTインボイス)
     *     共通　0.2.5. パッキング書類ファイル管理情報削除
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteLbFileManagerPackingByManualFrt(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 35. Delete of manual invoice information
     * 35.3. Invoice pertinent information delete (manual Invoice FRT Invoice)  
     *       Common 0.2.6. Packing-Header information delete
     * <br />35. マニュアルインボイス情報の削除
     * 35.3. インボイス関連情報削除(マニュアルインボイス-FRTインボイス)
     *     共通　0.2.6. パッキングヘッダ情報削除
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteTtPackingHeadByManualFrt(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 35. Delete of manual invoice information
     * 35.3. Invoice pertinent information delete (manual Invoice FRT Invoice)  
     *       Common 0.2.7. Invoice-Attached information delete
     * <br />35. マニュアルインボイス情報の削除
     * 35.3. インボイス関連情報削除(マニュアルインボイス-FRTインボイス)
     *     共通　0.2.7. インボイスアタッチ情報削除
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteTtInvoiceAttachedByManualFrt(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 35. Delete of manual invoice information
     * 35.3. Invoice pertinent information delete (manual Invoice FRT Invoice)  
     *       Common 0.2.8. Invoice documents file-management-information delete
     * <br />35. マニュアルインボイス情報の削除
     * 35.3. インボイス関連情報削除(マニュアルインボイス-FRTインボイス)
     *     共通　0.2.8. インボイス書類ファイル管理情報削除
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteLbFileManagerInvoiceByManualFrt(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 35. Delete of manual invoice information
     * 35.3. Invoice pertinent information delete (manual Invoice FRT Invoice)  
     *       Common 0.2.9. Invoice-Header information delete
     * <br />35. マニュアルインボイス情報の削除
     * 35.3. インボイス関連情報削除(マニュアルインボイス-FRTインボイス)
     *     共通　0.2.9. インボイスヘッダ情報削除
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteTtInvoiceHeaderByManualFrt(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 35. Delete of manual invoice information
     * 35.4. invoice information delete (manual Invoice FRT Invoice)  
     * <br />35. マニュアルインボイス情報の削除
     * 35.4. インボイス情報削除(マニュアルインボイス-FRTインボイス)
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteTtInvoiceByManualFrt(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 35. Delete of manual invoice information
     * 35.5. Invoice pertinent information delete (manual Invoice)  
     *       Common 0.2.1. Shipping-Document file-management-information delete
     * <br />35. マニュアルインボイス情報の削除
     * 35.5. インボイス関連情報削除(マニュアルインボイス)
     *     共通　0.2.1. 船積書類ファイル管理情報削除
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteLbFileManagerByshippinActManual(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 35. Delete of manual invoice information
     * 35.5. Invoice pertinent information delete (manual Invoice)  
     *       Common 0.2.2. Shipping-Document information delete
     * <br />35. マニュアルインボイス情報の削除
     * 35.5. インボイス関連情報削除(マニュアルインボイス)
     *     共通　0.2.2. 船積書類情報削除
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteTtShippingDocumentByManual(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 35. Delete of manual invoice information
     * 35.5. Invoice pertinent information delete (manual Invoice)  
     *       Common 0.2.3. Packing-Attached-Item-No information delete
     * <br />35. マニュアルインボイス情報の削除
     * 35.5. インボイス関連情報削除(マニュアルインボイス)
     *     共通　0.2.3. パッキングアタッチ_品目番号情報削除
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteTtPackAtchItemNoByManual(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 35. Delete of manual invoice information
     * 35.5. Invoice pertinent information delete (manual Invoice)  
     *       Common 0.2.4. Packing-Attached-CML information delete
     * <br />35. マニュアルインボイス情報の削除
     * 35.5. インボイス関連情報削除(マニュアルインボイス)
     *     共通　0.2.4. パッキングアタッチ_CML情報削除
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteTtPackingAttachedCmlByManual(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 35. Delete of manual invoice information
     * 35.5. Invoice pertinent information delete (manual Invoice)  
     *       Common 0.2.5. Packing documents file-management-information delete
     * <br />35. マニュアルインボイス情報の削除
     * 35.5. インボイス関連情報削除(マニュアルインボイス)
     *     共通　0.2.5. パッキング書類ファイル管理情報削除
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteLbFileManagerPackingByManual(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 35. Delete of manual invoice information
     * 35.5. Invoice pertinent information delete (manual Invoice)  
     *       Common 0.2.6. Packing-Header information delete
     * <br />35. マニュアルインボイス情報の削除
     * 35.5. インボイス関連情報削除(マニュアルインボイス)
     *     共通　0.2.6. パッキングヘッダ情報削除
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteTtPackingHeadByManual(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 35. Delete of manual invoice information
     * 35.5. Invoice pertinent information delete (manual Invoice)  
     *       Common 0.2.7. Invoice-Attached information delete
     * <br />35. マニュアルインボイス情報の削除
     * 35.5. インボイス関連情報削除(マニュアルインボイス)
     *     共通　0.2.7. インボイスアタッチ情報削除
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteTtInvoiceAttachedByManual(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 35. Delete of manual invoice information
     * 35.5. Invoice pertinent information delete (manual Invoice)  
     *       Common 0.2.8. Invoice documents file-management-information delete
     * <br />35. マニュアルインボイス情報の削除
     * 35.5. インボイス関連情報削除(マニュアルインボイス)
     *     共通　0.2.8. インボイス書類ファイル管理情報削除
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteLbFileManagerInvoiceByManual(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 35. Delete of manual invoice information
     * 35.5. Invoice pertinent information delete (manual Invoice)  
     *       Common 0.2.9. Invoice-Header information delete
     * <br />35. マニュアルインボイス情報の削除
     * 35.5. インボイス関連情報削除(マニュアルインボイス)
     *     共通　0.2.9. インボイスヘッダ情報削除
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteTtInvoiceHeaderByManual(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 35. Delete of manual invoice information
     * 35.6. invoice information delete (manual Invoice)  
     * <br />35. マニュアルインボイス情報の削除
     * 35.6. インボイス情報削除(マニュアルインボイス)
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteTtInvoiceByManual(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 36. Delete of Sequence-Master data
     * This function is deleted from the specification.
     * <br/>36. 採番原単位データの削除
     * この機能は仕様から削除されている
     */

    /**
     * 37. A delete of CML-Error-Report-Detail information
     * <br />37. CMLエラーレポート明細情報の削除
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteTtCmlErrorDtl(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 38. A delete of CML-Error-Report-Header information
     * <br />38. CMLエラーレポートヘッダ情報の削除
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteTtCmlErrorHeader(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 39. A delete of BHT-Work-Time information
     * 39.1 Delete of a BHT-Work-Time-For-Palletize information
     * <br />39. BHT作業時間情報の削除
     * 39.1 BHT作業情報テーブル(パレタイズ)情報の削除
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteTtBhtWorkPltz(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 39. A delete of BHT-Work-Time information
     * 39.2 Delete of a BHT-Work-Time-For-Mix-Tag information
     * <br />39. BHT作業時間情報の削除
     * 39.2 BHT作業情報テーブル(小箱内多品)情報の削除
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteTtBhtWorkMixTag(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 39. A delete of BHT-Work-Time information
     * 39.3 Delete of a BHT-Work-Error information
     * <br />39. BHT作業時間情報の削除
     * 39.3 BHT作業エラー情報の削除
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteTtBhtWorkErr(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 39. A delete of BHT-Work-Time information
     * 39.4 Delete of a BHT-Work-Time information
     * <br />39. BHT作業時間情報の削除
     * 39.4 BHT作業時間情報の削除
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteTtBhtWorkTime(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 41. Packing specification effective REVISION hysteresis information delete
     * <br />41. 包装仕様有効リビジョン履歴情報削除
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteTmPkgSpecRev(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 42. Delete of unnecessary work data
     *    1. Shipping-Actuality-Invoice-Work T
     * <br />42. 不要ワークデータの削除
     *  1. 船積実績対象インボイスワークT
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteTwShippingActInvoice(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 42. Delete of unnecessary work data
     *    2. Palletize work T for an Invoice
     * <br />42. 不要ワークデータの削除
     *  2. インボイス対象パレタイズワークT
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteTwInvPltz(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 42. Delete of unnecessary work data
     *    3. Invoice Group Work T
     * <br />42. 不要ワークデータの削除
     *  3. インボイスグループワークT
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteTwInv(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 42. Delete of unnecessary work data
     *    4. Invoice Work T
     * <br />42. 不要ワークデータの削除
     *  4. インボイスワークT
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteTwInvoice(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 42. Delete of unnecessary work data
     *    5. Invoice-Item-No-Work T
     * <br />42. 不要ワークデータの削除
     *  5. インボイス作成対象品目番号ワークT
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteTwInvItem(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 42. Delete of unnecessary work data
     *    6. Staging-Actuality-Work T
     * <br />42. 不要ワークデータの削除
     *  6. 山作り実績ワークT
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteTwStgAct(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 42. Delete of unnecessary work data
     *    7. Staging-Inst-Work T
     * <br />42. 不要ワークデータの削除
     *  7. 荷揃え指示ワークT
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteTwStgInstr(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 42. Delete of unnecessary work data
     *    8. X-Palletize-Work T
     * <br />42. 不要ワークデータの削除
     *  8. まとめパレタイズワークT
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteTwXpltz(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 42. Delete of unnecessary work data
     *    9. Palletize-Instruction-Item-No-Work T
     * <br />42. 不要ワークデータの削除
     *  9. 梱包指示品目番号ワークT
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteTwPltzInstrItemNo(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 42. Delete of unnecessary work data
     *    10. Palletize-Item-Work T
     * <br />42. 不要ワークデータの削除
     *  10. パレタイズ対象品ワークT
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteTwPltzItemItemNo(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 42. Delete of unnecessary work data
     *    11. Palletize-Item-Package-Work T
     * <br />42. 不要ワークデータの削除
     *  11. パレタイズ対象品PKGワークT
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteTwPltzItemPkg(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 42. Delete of unnecessary work data
     *    12. Mix-Tag-RT-WorkT
     * <br />42. 不要ワークデータの削除
     *  12. MIXED用RT材ワークT
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteTwMixtagRt(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 42. Delete of unnecessary work data
     *    13. Mix-Tag-WorkT
     * <br />42. 不要ワークデータの削除
     *  13. MIXED品目番号ワークT
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteTwMixtag(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * 42. Delete of unnecessary work data
     *    14. Batch Request Parameter T
     * <br />42. 不要ワークデータの削除
     *  14. バッチリクエストパラメータT
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br/>アプリ基盤のアプリケーション例外です。
     */
    public int deleteTtBatchReqParam(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    // NL015 ADD START
    /**
     * Delete TT_SC_ATTACHED by main invoice approach from TT_SHIPPING_ACT.
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    public int deleteTtScAttachedByMain(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * Delete LB_FILE_MANAGER approach from TT_SHIPPING_ACT.
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    public int deleteLbFileManagerScByMain(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * Delete TT_SC_HEADER approach from TT_SHIPPING_ACT.
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    public int deleteTtScHeaderByMain(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * Delete TT_SC_ATTACHED approach from cancel invoice.
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    public int deleteTtScAttachedByBeforeCancel(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * Delete LB_FILE_MANAGER approach from cancel invoice.
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    public int deleteLbFileManagerScByBeforeCancel(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * Delete TT_SC_HEADER approach from cancel invoice.
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    public int deleteTtScHeaderByBeforeCancel(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * Delete LB_FILE_MANAGER used by Order Upload.
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    public int deleteLbFileManagerByOdrUpload(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * Delete TT_ODR_UPLOAD_REQ_MGT.
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    public int deleteTtOdrUploadReqMgt(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;

    /**
     * Delete TT_ONLINE_REQ_JOB_PARAM.
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    public int deleteTtOnlineReqJobParam(T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException;
   // NL015 ADD END
}
