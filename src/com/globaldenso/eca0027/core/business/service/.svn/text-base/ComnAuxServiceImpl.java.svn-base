/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import java.util.List;

import org.apache.log4j.Logger;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtInvoiceAttachedCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtInvoiceCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtInvoiceHeaderCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPackAtchItemNoCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPackingAttachedCmlCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPackingHeadCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtScAttachedCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtScHeaderCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtShippingActCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtShippingActOdrCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtShippingDocumentCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TwShippingActInvoiceCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.service.TtInvoiceAttachedService;
import com.globaldenso.eca0027.core.auto.business.service.TtInvoiceHeaderService;
import com.globaldenso.eca0027.core.auto.business.service.TtInvoiceService;
import com.globaldenso.eca0027.core.auto.business.service.TtPackAtchItemNoService;
import com.globaldenso.eca0027.core.auto.business.service.TtPackingAttachedCmlService;
import com.globaldenso.eca0027.core.auto.business.service.TtPackingHeadService;
import com.globaldenso.eca0027.core.auto.business.service.TtScAttachedService;
import com.globaldenso.eca0027.core.auto.business.service.TtScHeaderService;
import com.globaldenso.eca0027.core.auto.business.service.TtShippingActOdrService;
import com.globaldenso.eca0027.core.auto.business.service.TtShippingActService;
import com.globaldenso.eca0027.core.auto.business.service.TtShippingDocumentService;
import com.globaldenso.eca0027.core.auto.business.service.TwShippingActInvoiceService;
import com.globaldenso.eca0027.core.business.dao.ComnAuxDao;
import com.globaldenso.eca0027.core.business.domain.T0100BatchDeleteDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain;


/**
 * This is an implement class of garbage data delete service.
 * <br />不要データ削除サービスの実装クラスです。
 *
 * trunk\200_外部設計\011_外部設計書(更新不可12月版)\08_Job Definition Document\T_Common Auxiliary Screen\ジョブ定義書_ECA0027T0100_不要データ削除.xls
 * 
 * <br />This is creating based on revision 358.
 * <br />の revision 358 をベースに作成しています。
 *
 * @author $Author: G453S402002 $
 * @version $Revision: 14926 $
 */
public class ComnAuxServiceImpl implements ComnAuxService {

    /** 
     * Extraction-condition-less
     * <br />抽出条件なし
     * */
    private static final T0100BatchDeleteCriteriaDomain NONE = null;

    /**
     * log4j log class
     * <br />log4j ログクラス
     */
    private Logger LOG = Logger.getLogger(ComnAuxServiceImpl.class);

    /**
     * 1.1 Sales Contract Attached   Service
     * <br />1.1 セールスコントラクトアタッチ サービス
     */
    private TtScAttachedService ttScAttachedService = null;

    /**
     * 1.2 Sales Contract Header   Service
     * <br />1.2 セールスコントラクトヘッダ サービス
     */
    private TtScHeaderService ttScHeaderService = null;

    /**
     * 1.3 Packing attaching ITEM NO   Service
     * <br />1.3 パッキングアタッチ品目番号 サービス
     */
    private TtPackAtchItemNoService ttPackAtchItemNoService = null;

    /**
     * 1.4 Packing attaching CML service
     * <br />1.4 パッキングアタッチCML サービス
     */
    private TtPackingAttachedCmlService ttPackingAttachedCmlService = null;

    /**
     * 1.5 Packing Header   Service
     * <br />1.5 パッキングヘッダ サービス
     */
    private TtPackingHeadService ttPackingHeadService = null;

    /**
     * 1.6 Invoice Attached   Service
     * <br />1.6 インボイスアタッチ サービス
     */
    private TtInvoiceAttachedService ttInvoiceAttachedService = null;

    /**
     * 1.7 Invoice Header   Service
     * <br />1.7 インボイスヘッダ サービス
     */
    private TtInvoiceHeaderService ttInvoiceHeaderService = null;

    /**
     * 1.8 Shipping Document   Service
     * <br />1.8 船積書類 サービス
     */
    private TtShippingDocumentService ttShippingDocumentService = null;

    /**
     * 1.9 Invoice   Service
     * <br />1.9 インボイス サービス
     */
    private TtInvoiceService ttInvoiceService = null;

    /**
     * 1.10 Shipping Actuality Receive Order   Service
     * <br />1.10 船積実績対象品受注情報 サービス
     */
    private TtShippingActOdrService ttShippingActOdrService = null;

    /**
     * 1.11 Shipping Actuality   Service
     * <br />1.11 船積実績 サービス
     */
    private TtShippingActService ttShippingActService = null;

    /**
     * 1.12 Shipping Actuality Invoice Works   Service
     * <br />1.12 船積実績対象インボイスワーク サービス
     */
    private TwShippingActInvoiceService twShippingActInvoiceService = null;

    /**
     * Garbage data delete DAO
     * <br />不要データ削除 DAO
     */
    private ComnAuxDao comnAuxDao = null;

    /**
     *
     * constructor.
     * <br />デフォルトコンストラクタ。
     *
     */
    public ComnAuxServiceImpl(){
    }


    /**
     * Setter method for ttScAttachedService
     *
     * @param ttScAttachedService Set for ttScAttachedService
     */
    public void setTtScAttachedService(TtScAttachedService ttScAttachedService) {
        this.ttScAttachedService = ttScAttachedService;
    }

    /**
     * Setter method for ttScHeaderService
     *
     * @param ttScHeaderService Set for ttScHeaderService
     */
    public void setTtScHeaderService(TtScHeaderService ttScHeaderService) {
        this.ttScHeaderService = ttScHeaderService;
    }

    /**
     * Setter method for ttPackAtchItemNoService
     *
     * @param ttPackAtchItemNoService Set for ttPackAtchItemNoService
     */
    public void setTtPackAtchItemNoService(
        TtPackAtchItemNoService ttPackAtchItemNoService) {
        this.ttPackAtchItemNoService = ttPackAtchItemNoService;
    }

    /**
     * Setter method for ttPackingAttachedCmlService
     *
     * @param ttPackingAttachedCmlService Set for ttPackingAttachedCmlService
     */
    public void setTtPackingAttachedCmlService(
        TtPackingAttachedCmlService ttPackingAttachedCmlService) {
        this.ttPackingAttachedCmlService = ttPackingAttachedCmlService;
    }

    /**
     * Setter method for ttPackingHeadService
     *
     * @param ttPackingHeadService Set for ttPackingHeadService
     */
    public void setTtPackingHeadService(TtPackingHeadService ttPackingHeadService) {
        this.ttPackingHeadService = ttPackingHeadService;
    }

    /**
     * Setter method for ttInvoiceAttachedService
     *
     * @param ttInvoiceAttachedService Set for ttInvoiceAttachedService
     */
    public void setTtInvoiceAttachedService(
        TtInvoiceAttachedService ttInvoiceAttachedService) {
        this.ttInvoiceAttachedService = ttInvoiceAttachedService;
    }

    /**
     * Setter method for ttInvoiceHeaderService
     *
     * @param ttInvoiceHeaderService Set for ttInvoiceHeaderService
     */
    public void setTtInvoiceHeaderService(
        TtInvoiceHeaderService ttInvoiceHeaderService) {
        this.ttInvoiceHeaderService = ttInvoiceHeaderService;
    }

    /**
     * Setter method for ttShippingDocumentService
     *
     * @param ttShippingDocumentService Set for ttShippingDocumentService
     */
    public void setTtShippingDocumentService(
        TtShippingDocumentService ttShippingDocumentService) {
        this.ttShippingDocumentService = ttShippingDocumentService;
    }

    /**
     * Setter method for ttInvoiceService
     *
     * @param ttInvoiceService Set for ttInvoiceService
     */
    public void setTtInvoiceService(TtInvoiceService ttInvoiceService) {
        this.ttInvoiceService = ttInvoiceService;
    }

    /**
     * Setter method for ttShippingActOdrService
     *
     * @param ttShippingActOdrService Set for ttShippingActOdrService
     */
    public void setTtShippingActOdrService(
        TtShippingActOdrService ttShippingActOdrService) {
        this.ttShippingActOdrService = ttShippingActOdrService;
    }

    /**
     * Setter method for ttShippingActService
     *
     * @param ttShippingActService Set for ttShippingActService
     */
    public void setTtShippingActService(TtShippingActService ttShippingActService) {
        this.ttShippingActService = ttShippingActService;
    }

    /**
     * Setter method for twShippingActInvoiceService
     *
     * @param twShippingActInvoiceService Set for twShippingActInvoiceService
     */
    public void setTwShippingActInvoiceService(
        TwShippingActInvoiceService twShippingActInvoiceService) {
        this.twShippingActInvoiceService = twShippingActInvoiceService;
    }

    /**
     * Setter method for comnAuxDao
     *
     * @param comnAuxDao Set for comnAuxDao
     */
    public void setComnAuxDao(ComnAuxDao comnAuxDao) {
        this.comnAuxDao = comnAuxDao;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.ComnAuxService#transactOnComnAux()
     */
    public void transactOnComnAux() throws ApplicationException {

        // job definition document_ECA0027T0100_garbage data delete .xls sheet "a shipping data delete":
        // ジョブ定義書_ECA0027T0100_不要データ削除.xls シート「出荷データ削除」より:

        // 1. Delete of a soft-delete record
        // 1. 論理削除レコードの削除
        deleteLogicalDeletedTtScAttached();           // 1.1 Sales-Contract-Attached - TtScAttached                     1.1 セールスコントラクトアタッチ - TtScAttached
        deleteLogicalDeletedTtScHeader();             // 1.2 Sales-Contract-Header - TtScHeader                         1.2 セールスコントラクトヘッダ - TtScHeader
        deleteLogicalDeletedTtPackAtchItemNo();       // 1.3 Packing attaching ITEM-NO - TtPackAtchItemNo               1.3 パッキングアタッチ品目番号 - TtPackAtchItemNo
        deleteLogicalDeletedTtPackingAttachedCml();   // 1.4 Packing attaching CML - TtPackingAttachedCml               1.4 パッキングアタッチCML - TtPackingAttachedCml
        deleteLogicalDeletedTtPackingHead();          // 1.5 Packing-Header - TtPackingHead                             1.5 パッキングヘッダ - TtPackingHead
        deleteLogicalDeletedTtInvoiceAttached();      // 1.6 Invoice-Attached - TtInvoiceAttached                       1.6 インボイスアタッチ - TtInvoiceAttached
        deleteLogicalDeletedTtInvoiceHeader();        // 1.7 Invoice-Header - TtInvoiceHeader                           1.7 インボイスヘッダ - TtInvoiceHeader
        deleteLogicalDeletedTtShippingDocument();     // 1.8 Shipping-Document - TtShippingDocument                     1.8 船積書類 - TtShippingDocument
        deleteLogicalDeletedTtInvoice();              // 1.9 Invoice - TtInvoice                                        1.9 インボイス - TtInvoice
        deleteLogicalDeletedTtShippingActOdr();       // 1.10 Shipping-Actuality-Receive-Order - TtShippingActOdr       1.10 船積実績対象品受注情報 - TtShippingActOdr
        deleteLogicalDeletedTtShippingAct();          // 1.11 Shipping-Actuality - TtShippingAct                        1.11 船積実績 - TtShippingAct
        deleteLogicalDeletedTwShippingActInvoice();   // 1.12 Shipping Actuality Invoice Works - TwShippingActInvoice   1.12 船積実績対象インボイスワーク - TwShippingActInvoice

        // 2. Mix article KANBAN information delete
        // 2. Mix品かんばん情報削除
        deleteTtMixKanban();

        // 3-1. Mix Tag Receive Order delete
        // 3-1. MIXED品目番号受注情報報削除
        deleteTtMixtagItemOdr();

        // 3-2. Mixed ITEM-NO information delete
        // 3-2. Mixed品目番号情報削除
        deleteTtMixtagItemNo();

        // 4. RT material information delete for Mixed
        // 4. Mixed用RT材情報削除
        deleteTtMixtagRt();

        // 5. Palletize-Instruction-Receive-Order delete
        // 5. 梱包指示品目番号受注情報削除
        deleteTtPltzInstrOdr();

        // 6. Palletize-Instruction-Item-No information delete
        // 6. 梱包指示品目番号情報削除
        deleteTtPltzInstrItemNo();

        // 7. Palletize-Item-Receive-Order delete
        // 7. パレタイズ対象品受注情報削除
        deleteTtPltzItemOdr();

        // 8. Palletize-Item-KANBAN delete
        // 8. パレタイズ対象品かんばん情報削除
        deleteTtPltzKanban();

        //  9. Mix tag backup for a delete
        // 10. Palletize Instr. No. . backup for a delete
        // 11. Palletize-Item information delete
        // 12. Mixed thing vote information delete
        // 13. Packaging Instruction (=Pull) information delete
        //  9. 削除対象のMixタグ退避
        // 10. 削除対象の梱包指示No.退避
        // 11. パレタイズ対象品情報削除
        // 12. Mixed現品票情報削除
        // 13. 梱包指示情報削除
        deleteTtPltzItemAndTtMixtagAndTtPltzInstr();

        // 14. Shipping-Confirm. information delete
        // 14. 出荷確認情報削除
        deleteTtShippingFirm();

        // 15. X-TAG backup for a delete
        // 16. The staging-instruction No. backup for delete
        // 17. The Staging-Actuality No. backup for delete
        // 18. Palletize information delete
        // 19. X-Palletize information delete
        // 20. staging-instruction information delete
        // 21. Staging-Actuality information delete
        // 15. 削除対象のまとめメインマーク退避
        // 16. 削除対象の荷揃え指示No.退避
        // 17. 削除対象の山作り実績No.退避
        // 18. パレタイズ情報削除
        // 19. まとめパレタイズ情報削除
        // 20. 荷揃え指示情報削除
        // 21. 山作り実績情報削除
        deleteTtPltzAndTtXpltzAndTtStgInstrAndTtStgAct();

        // ---------------------------------------------------------------------

        // 22. Invoice pertinent information delete (main Invoice Re-Invoice)  
        // 22. インボイス関連情報削除(メインインボイス-リインボイス)
        deleteLbFileManagerByshippinActMainReinv(); // Common 0.2.1. Shipping-Document file-management-information delete     共通　0.2.1. 船積書類ファイル管理情報削除
        deleteTtShippingDocumentByMainReinv();      // Common 0.2.2. Shipping-Document information delete                     共通　0.2.2. 船積書類情報削除
        deleteTtPackAtchItemNoByMainReinv();        // Common 0.2.3. Packing-Attached-Item-No information delete              共通　0.2.3. パッキングアタッチ_品目番号情報削除
        deleteTtPackingAttachedCmlByMainReinv();    // Common 0.2.4. Packing-Attached-CML information delete                  共通　0.2.4. パッキングアタッチ_CML情報削除
        deleteLbFileManagerPackingByMainReinv();    // Common 0.2.5. Packing documents file-management-information delete     共通　0.2.5. パッキング書類ファイル管理情報削除
        deleteTtPackingHeadByMainReinv();           // Common 0.2.6. Packing-Header information delete                        共通　0.2.6. パッキングヘッダ情報削除
        deleteTtInvoiceAttachedByMainReinv();       // Common 0.2.7. Invoice-Attached information delete                      共通　0.2.7. インボイスアタッチ情報削除
        deleteLbFileManagerInvoiceByMainReinv();    // Common 0.2.8. Invoice documents file-management-information delete     共通　0.2.8. インボイス書類ファイル管理情報削除
        deleteTtInvoiceHeaderByMainReinv();         // Common 0.2.9. Invoice-Header information delete                        共通　0.2.9. インボイスヘッダ情報削除

        // 23. invoice information delete (main Invoice Re-Invoice)
        // 23. インボイス情報削除(メインインボイス-リインボイス)
        deleteTtInvoiceReInvoiceByMainReinv();

        // ---------------------------------------------------------------------

        // 24. Invoice pertinent information delete (main Invoice FRT Invoice)  
        // 24. インボイス関連情報削除(メインインボイス-FRTインボイス)
        deleteLbFileManagerByshippinActMainFrt();   // Common 0.2.1. Shipping-Document file-management-information delete     共通　0.2.1. 船積書類ファイル管理情報削除
        deleteTtShippingDocumentByMainFrt();        // Common 0.2.2. Shipping-Document information delete                     共通　0.2.2. 船積書類情報削除
        deleteTtPackAtchItemNoByMainFrt();          // Common 0.2.3. Packing-Attached-Item-No information delete              共通　0.2.3. パッキングアタッチ_品目番号情報削除
        deleteTtPackingAttachedCmlByMainFrt();      // Common 0.2.4. Packing-Attached-CML information delete                  共通　0.2.4. パッキングアタッチ_CML情報削除
        deleteLbFileManagerPackingByMainFrt();      // Common 0.2.5. Packing documents file-management-information delete     共通　0.2.5. パッキング書類ファイル管理情報削除
        deleteTtPackingHeadByMainFrt();             // Common 0.2.6. Packing-Header information delete                        共通　0.2.6. パッキングヘッダ情報削除
        deleteTtInvoiceAttachedByMainFrt();         // Common 0.2.7. Invoice-Attached information delete                      共通　0.2.7. インボイスアタッチ情報削除
        deleteLbFileManagerInvoiceByMainFrt();      // Common 0.2.8. Invoice documents file-management-information delete     共通　0.2.8. インボイス書類ファイル管理情報削除
        deleteTtInvoiceHeaderByMainFrt();           // Common 0.2.9. Invoice-Header information delete                        共通　0.2.9. インボイスヘッダ情報削除

        // 25. invoice information delete (main Invoice FRT Invoice)
        // 25. インボイス情報削除(メインインボイス-FRTインボイス)
        deleteTtInvoiceByMainFrt();

        // ---------------------------------------------------------------------

        // 26. Invoice pertinent information delete (main Invoice)  
        // 26. インボイス関連情報削除(メインインボイス)
        deleteLbFileManagerByshippinActMain();      // Common 0.2.1. Shipping-Document file-management-information delete     共通　0.2.1. 船積書類ファイル管理情報削除
        deleteTtShippingDocumentByMain();           // Common 0.2.2. Shipping-Document information delete                     共通　0.2.2. 船積書類情報削除
        deleteTtPackAtchItemNoByMain();             // Common 0.2.3. Packing-Attached-Item-No information delete              共通　0.2.3. パッキングアタッチ_品目番号情報削除
        deleteTtPackingAttachedCmlByMain();         // Common 0.2.4. Packing-Attached-CML information delete                  共通　0.2.4. パッキングアタッチ_CML情報削除
        deleteLbFileManagerPackingByMain();         // Common 0.2.5. Packing documents file-management-information delete     共通　0.2.5. パッキング書類ファイル管理情報削除
        deleteTtPackingHeadByMain();                // Common 0.2.6. Packing-Header information delete                        共通　0.2.6. パッキングヘッダ情報削除
        deleteTtInvoiceAttachedByMain();            // Common 0.2.7. Invoice-Attached information delete                      共通　0.2.7. インボイスアタッチ情報削除
        deleteLbFileManagerInvoiceByMain();         // Common 0.2.8. Invoice documents file-management-information delete     共通　0.2.8. インボイス書類ファイル管理情報削除
        deleteTtInvoiceHeaderByMain();              // Common 0.2.9. Invoice-Header information delete                        共通　0.2.9. インボイスヘッダ情報削除
        // NL015 ADD START
        deleteTtScAttachedByMain();
        deleteLbFileManagerScByMain();
        deleteTtScHeaderByMain();
        // NL015 ADD END

        // 27. invoice information delete (main Invoice)
        // 27. インボイス情報削除(メインインボイス)
        deleteTtInvoiceByMain();

        // ---------------------------------------------------------------------

        // 28. Shipping-Actuality-Receive-Order delete
        // 28. 船積実績対象品受注情報削除
        deleteTtShippingActOdr();

        // 29. B/L, a CLP file-management-information delete
        // 29. B/L、CLPファイル管理情報削除
        deleteLbFileManagerByBlClp();

        // 30. Shipping-Actuality information delete
        // 30. 船積実績情報削除
        deleteTtShippingAct();

        // 31. Delete of a shipped firm-order-receipt information
        // 31. 出荷済確定受注情報の削除
        deleteTtExpRcvOdrByShiped();

        // 32. Delete of an unofficial announcement ordering information
        // 32. 内示受注情報の削除
        deleteTtExpRcvOdrByPrivateNotification();

        // =====================================================================
        // 33. The delete of the invoice information before cancellation by which cancellation Invoice was published
        // 33. キャンセルインボイスが発行されたキャンセル前インボイス情報の削除
        // =====================================================================

        // 33.1. Invoice pertinent information delete (front [ cancellation ] Invoice Re-Invoice)  
        // 33.1. インボイス関連情報削除(キャンセル前インボイス-リインボイス)
        deleteLbFileManagerByshippinActBforCancelReinv();   // Common 0.2.1. Shipping-Document file-management-information delete    共通　0.2.1. 船積書類ファイル管理情報削除
        deleteTtShippingDocumentByBforCancelReinv();        // Common 0.2.2. Shipping-Document information delete                    共通　0.2.2. 船積書類情報削除
        deleteTtPackAtchItemNoByBforCancelReinv();          // Common 0.2.3. Packing-Attached-Item-No information delete             共通　0.2.3. パッキングアタッチ_品目番号情報削除
        deleteTtPackingAttachedCmlByBforCancelReinv();      // Common 0.2.4. Packing-Attached-CML information delete                 共通　0.2.4. パッキングアタッチ_CML情報削除
        deleteLbFileManagerPackingByBforCancelReinv();      // Common 0.2.5. Packing documents file-management-information delete    共通　0.2.5. パッキング書類ファイル管理情報削除
        deleteTtPackingHeadByBforCancelReinv();             // Common 0.2.6. Packing-Header information delete                       共通　0.2.6. パッキングヘッダ情報削除
        deleteTtInvoiceAttachedByBforCancelReinv();         // Common 0.2.7. Invoice-Attached information delete                     共通　0.2.7. インボイスアタッチ情報削除
        deleteLbFileManagerInvoiceByBforCancelReinv();      // Common 0.2.8. Invoice documents file-management-information delete    共通　0.2.8. インボイス書類ファイル管理情報削除
        deleteTtInvoiceHeaderByBforCancelReinv();           // Common 0.2.9. Invoice-Header information delete                       共通　0.2.9. インボイスヘッダ情報削除

        // 33.2. invoice information delete (front [ cancellation ] Invoice Re-Invoice)
        // 33.2. インボイス情報削除(キャンセル前インボイス-リインボイス)
        deleteTtInvoiceByBforCancelReinv();

        // ---------------------------------------------------------------------

        // 33.3. Invoice pertinent information delete (front [ cancellation ] Invoice FRT Invoice)  
        // 33.3. インボイス関連情報削除(キャンセル前インボイス-FRTインボイス)
        deleteLbFileManagerByshippinActBforCancelFrt();     // Common 0.2.1. Shipping-Document file-management-information delete    共通　0.2.1. 船積書類ファイル管理情報削除
        deleteTtShippingDocumentByBforCancelFrt();          // Common 0.2.2. Shipping-Document information delete                    共通　0.2.2. 船積書類情報削除
        deleteTtPackAtchItemNoByBforCancelFrt();            // Common 0.2.3. Packing-Attached-Item-No information delete             共通　0.2.3. パッキングアタッチ_品目番号情報削除
        deleteTtPackingAttachedCmlByBforCancelFrt();        // Common 0.2.4. Packing-Attached-CML information delete                 共通　0.2.4. パッキングアタッチ_CML情報削除
        deleteLbFileManagerPackingByBforCancelFrt();        // Common 0.2.5. Packing documents file-management-information delete    共通　0.2.5. パッキング書類ファイル管理情報削除
        deleteTtPackingHeadByBforCancelFrt();               // Common 0.2.6. Packing-Header information delete                       共通　0.2.6. パッキングヘッダ情報削除
        deleteTtInvoiceAttachedByBforCancelFrt();           // Common 0.2.7. Invoice-Attached information delete                     共通　0.2.7. インボイスアタッチ情報削除
        deleteLbFileManagerInvoiceByBforCancelFrt();        // Common 0.2.8. Invoice documents file-management-information delete    共通　0.2.8. インボイス書類ファイル管理情報削除
        deleteTtInvoiceHeaderByBforCancelFrt();             // Common 0.2.9. Invoice-Header information delete                       共通　0.2.9. インボイスヘッダ情報削除

        // 33.4. invoice information delete (front [ cancellation ] Invoice FRT Invoice)
        // 33.4. インボイス情報削除(キャンセル前インボイス-FRTインボイス)
        deleteTtInvoiceByBforCancelFrt();

        // ---------------------------------------------------------------------

        // 33.5. Invoice pertinent information delete (front [ cancellation ] Invoice)  
        // 33.5. インボイス関連情報削除(キャンセル前インボイス)
        deleteLbFileManagerByshippinActBforCancel();        // Common 0.2.1. Shipping-Document file-management-information delete    共通　0.2.1. 船積書類ファイル管理情報削除
        deleteTtShippingDocumentByBforCancel();             // Common 0.2.2. Shipping-Document information delete                    共通　0.2.2. 船積書類情報削除
        deleteTtPackAtchItemNoByBforCancel();               // Common 0.2.3. Packing-Attached-Item-No information delete             共通　0.2.3. パッキングアタッチ_品目番号情報削除
        deleteTtPackingAttachedCmlByBforCancel();           // Common 0.2.4. Packing-Attached-CML information delete                 共通　0.2.4. パッキングアタッチ_CML情報削除
        deleteLbFileManagerPackingByBforCancel();           // Common 0.2.5. Packing documents file-management-information delete    共通　0.2.5. パッキング書類ファイル管理情報削除
        deleteTtPackingHeadByBforCancel();                  // Common 0.2.6. Packing-Header information delete                       共通　0.2.6. パッキングヘッダ情報削除
        deleteTtInvoiceAttachedByBforCancel();              // Common 0.2.7. Invoice-Attached information delete                     共通　0.2.7. インボイスアタッチ情報削除
        deleteLbFileManagerInvoiceByBforCancel();           // Common 0.2.8. Invoice documents file-management-information delete    共通　0.2.8. インボイス書類ファイル管理情報削除
        deleteTtInvoiceHeaderByBforCancel();                // Common 0.2.9. Invoice-Header information delete                       共通　0.2.9. インボイスヘッダ情報削除
        // NL015 ADD START
        deleteTtScAttachedByBeforeCancel();
        deleteLbFileManagerScByBeforeCancel();
        deleteTtScHeaderByBeforeCancel();
        // NL015 ADD END

        // 33.6. invoice information delete (front [ cancellation ] Invoice)
        // 33.6. インボイス情報削除(キャンセル前インボイス)
        deleteTtInvoiceByBforCancel();

        // ---------------------------------------------------------------------


        // =====================================================================
        // 34. Information delete of the cancellation Invoice itself
        // 34. キャンセルインボイス自体の情報削除
        // =====================================================================

        // 34.1. Invoice pertinent information delete (cancellation Invoice Re-Invoice)  
        // 34.1. インボイス関連情報削除(キャンセルインボイス-リインボイス)
        deleteLbFileManagerByshippinActCancelReinv();       // Common 0.2.1. Shipping-Document file-management-information delete    共通　0.2.1. 船積書類ファイル管理情報削除
        deleteTtShippingDocumentByCancelReinv();            // Common 0.2.2. Shipping-Document information delete                    共通　0.2.2. 船積書類情報削除
        deleteTtPackAtchItemNoByCancelReinv();              // Common 0.2.3. Packing-Attached-Item-No information delete             共通　0.2.3. パッキングアタッチ_品目番号情報削除
        deleteTtPackingAttachedCmlByCancelReinv();          // Common 0.2.4. Packing-Attached-CML information delete                 共通　0.2.4. パッキングアタッチ_CML情報削除
        deleteLbFileManagerPackingByCancelReinv();          // Common 0.2.5. Packing documents file-management-information delete    共通　0.2.5. パッキング書類ファイル管理情報削除
        deleteTtPackingHeadByCancelReinv();                 // Common 0.2.6. Packing-Header information delete                       共通　0.2.6. パッキングヘッダ情報削除
        deleteTtInvoiceAttachedByCancelReinv();             // Common 0.2.7. Invoice-Attached information delete                     共通　0.2.7. インボイスアタッチ情報削除
        deleteLbFileManagerInvoiceByCancelReinv();          // Common 0.2.8. Invoice documents file-management-information delete    共通　0.2.8. インボイス書類ファイル管理情報削除
        deleteTtInvoiceHeaderByCancelReinv();               // Common 0.2.9. Invoice-Header information delete                       共通　0.2.9. インボイスヘッダ情報削除

        // 34.2. invoice information delete (cancellation Invoice Re-Invoice)
        // 34.2. インボイス情報削除(キャンセルインボイス-リインボイス)
        deleteTtInvoiceByCancelReinv();

        // ---------------------------------------------------------------------

        // 34.3. Invoice pertinent information delete (cancellation Invoice FRT Invoice)  
        // 34.3. インボイス関連情報削除(キャンセルインボイス-FRTインボイス)
        deleteLbFileManagerByshippinActCancelFrt();         // Common 0.2.1. Shipping-Document file-management-information delete    共通　0.2.1. 船積書類ファイル管理情報削除
        deleteTtShippingDocumentByCancelFrt();              // Common 0.2.2. Shipping-Document information delete                    共通　0.2.2. 船積書類情報削除
        deleteTtPackAtchItemNoByCancelFrt();                // Common 0.2.3. Packing-Attached-Item-No information delete             共通　0.2.3. パッキングアタッチ_品目番号情報削除
        deleteTtPackingAttachedCmlByCancelFrt();            // Common 0.2.4. Packing-Attached-CML information delete                 共通　0.2.4. パッキングアタッチ_CML情報削除
        deleteLbFileManagerPackingByCancelFrt();            // Common 0.2.5. Packing documents file-management-information delete    共通　0.2.5. パッキング書類ファイル管理情報削除
        deleteTtPackingHeadByCancelFrt();                   // Common 0.2.6. Packing-Header information delete                       共通　0.2.6. パッキングヘッダ情報削除
        deleteTtInvoiceAttachedByCancelFrt();               // Common 0.2.7. Invoice-Attached information delete                     共通　0.2.7. インボイスアタッチ情報削除
        deleteLbFileManagerInvoiceByCancelFrt();            // Common 0.2.8. Invoice documents file-management-information delete    共通　0.2.8. インボイス書類ファイル管理情報削除
        deleteTtInvoiceHeaderByCancelFrt();                 // Common 0.2.9. Invoice-Header information delete                       共通　0.2.9. インボイスヘッダ情報削除

        // 34.4. invoice information delete (cancellation Invoice FRT Invoice)
        // 34.4. インボイス情報削除(キャンセルインボイス-FRTインボイス)
        deleteTtInvoiceByCancelFrt();

        // ---------------------------------------------------------------------

        // 34.5. Invoice pertinent information delete (cancellation Invoice)  
        // 34.5. インボイス関連情報削除(キャンセルインボイス)
        deleteLbFileManagerByshippinActCancel();            // Common 0.2.1. Shipping-Document file-management-information delete    共通　0.2.1. 船積書類ファイル管理情報削除
        deleteTtShippingDocumentByCancel();                 // Common 0.2.2. Shipping-Document information delete                    共通　0.2.2. 船積書類情報削除
        deleteTtPackAtchItemNoByCancel();                   // Common 0.2.3. Packing-Attached-Item-No information delete             共通　0.2.3. パッキングアタッチ_品目番号情報削除
        deleteTtPackingAttachedCmlByCancel();               // Common 0.2.4. Packing-Attached-CML information delete                 共通　0.2.4. パッキングアタッチ_CML情報削除
        deleteLbFileManagerPackingByCancel();               // Common 0.2.5. Packing documents file-management-information delete    共通　0.2.5. パッキング書類ファイル管理情報削除
        deleteTtPackingHeadByCancel();                      // Common 0.2.6. Packing-Header information delete                       共通　0.2.6. パッキングヘッダ情報削除
        deleteTtInvoiceAttachedByCancel();                  // Common 0.2.7. Invoice-Attached information delete                     共通　0.2.7. インボイスアタッチ情報削除
        deleteLbFileManagerInvoiceByCancel();               // Common 0.2.8. Invoice documents file-management-information delete    共通　0.2.8. インボイス書類ファイル管理情報削除
        deleteTtInvoiceHeaderByCancel();                    // Common 0.2.9. Invoice-Header information delete                       共通　0.2.9. インボイスヘッダ情報削除

        // 34.6. invoice information delete (cancellation Invoice)
        // 34.6. インボイス情報削除(キャンセルインボイス)
        deleteTtInvoiceByCancel();

        // ---------------------------------------------------------------------


        // =====================================================================
        // 35. Delete of manual invoice information
        // 35. マニュアルインボイス情報の削除
        // =====================================================================

        // 35.1. Invoice pertinent information delete (manual Invoice Re-Invoice)  
        // 35.1. インボイス関連情報削除(マニュアルインボイス-リインボイス)
        deleteLbFileManagerByshippinActManualReinv();   // Common 0.2.1. Shipping-Document file-management-information delete    共通　0.2.1. 船積書類ファイル管理情報削除
        deleteTtShippingDocumentByManualReinv();        // Common 0.2.2. Shipping-Document information delete                    共通　0.2.2. 船積書類情報削除
        deleteTtPackAtchItemNoByManualReinv();          // Common 0.2.3. Packing-Attached-Item-No information delete             共通　0.2.3. パッキングアタッチ_品目番号情報削除
        deleteTtPackingAttachedCmlByManualReinv();      // Common 0.2.4. Packing-Attached-CML information delete                 共通　0.2.4. パッキングアタッチ_CML情報削除
        deleteLbFileManagerPackingByManualReinv();      // Common 0.2.5. Packing documents file-management-information delete    共通　0.2.5. パッキング書類ファイル管理情報削除
        deleteTtPackingHeadByManualReinv();             // Common 0.2.6. Packing-Header information delete                       共通　0.2.6. パッキングヘッダ情報削除
        deleteTtInvoiceAttachedByManualReinv();         // Common 0.2.7. Invoice-Attached information delete                     共通　0.2.7. インボイスアタッチ情報削除
        deleteLbFileManagerInvoiceByManualReinv();      // Common 0.2.8. Invoice documents file-management-information delete    共通　0.2.8. インボイス書類ファイル管理情報削除
        deleteTtInvoiceHeaderByManualReinv();           // Common 0.2.9. Invoice-Header information delete                       共通　0.2.9. インボイスヘッダ情報削除

        // 35.2. invoice information delete (manual Invoice Re-Invoice)
        // 35.2. インボイス情報削除(マニュアルインボイス-リインボイス)
        deleteTtInvoiceByManualReinv();

        // ---------------------------------------------------------------------

        // 35.3. Invoice pertinent information delete (manual Invoice FRT Invoice)  
        // 35.3. インボイス関連情報削除(マニュアルインボイス-FRTインボイス)
        deleteLbFileManagerByshippinActManualFrt();     // Common 0.2.1. Shipping-Document file-management-information delete    共通　0.2.1. 船積書類ファイル管理情報削除
        deleteTtShippingDocumentByManualFrt();          // Common 0.2.2. Shipping-Document information delete                    共通　0.2.2. 船積書類情報削除
        deleteTtPackAtchItemNoByManualFrt();            // Common 0.2.3. Packing-Attached-Item-No information delete             共通　0.2.3. パッキングアタッチ_品目番号情報削除
        deleteTtPackingAttachedCmlByManualFrt();        // Common 0.2.4. Packing-Attached-CML information delete                 共通　0.2.4. パッキングアタッチ_CML情報削除
        deleteLbFileManagerPackingByManualFrt();        // Common 0.2.5. Packing documents file-management-information delete    共通　0.2.5. パッキング書類ファイル管理情報削除
        deleteTtPackingHeadByManualFrt();               // Common 0.2.6. Packing-Header information delete                       共通　0.2.6. パッキングヘッダ情報削除
        deleteTtInvoiceAttachedByManualFrt();           // Common 0.2.7. Invoice-Attached information delete                     共通　0.2.7. インボイスアタッチ情報削除
        deleteLbFileManagerInvoiceByManualFrt();        // Common 0.2.8. Invoice documents file-management-information delete    共通　0.2.8. インボイス書類ファイル管理情報削除
        deleteTtInvoiceHeaderByManualFrt();             // Common 0.2.9. Invoice-Header information delete                       共通　0.2.9. インボイスヘッダ情報削除

        // 35.4. invoice information delete (manual Invoice FRT Invoice)
        // 35.4. インボイス情報削除(マニュアルインボイス-FRTインボイス)
        deleteTtInvoiceByManualFrt();

        // ---------------------------------------------------------------------

        // 35.5. Invoice pertinent information delete (manual Invoice)  
        // 35.5. インボイス関連情報削除(マニュアルインボイス)
        deleteLbFileManagerByshippinActManual();        // Common 0.2.1. Shipping-Document file-management-information delete    共通　0.2.1. 船積書類ファイル管理情報削除
        deleteTtShippingDocumentByManual();             // Common 0.2.2. Shipping-Document information delete                    共通　0.2.2. 船積書類情報削除
        deleteTtPackAtchItemNoByManual();               // Common 0.2.3. Packing-Attached-Item-No information delete             共通　0.2.3. パッキングアタッチ_品目番号情報削除
        deleteTtPackingAttachedCmlByManual();           // Common 0.2.4. Packing-Attached-CML information delete                 共通　0.2.4. パッキングアタッチ_CML情報削除
        deleteLbFileManagerPackingByManual();           // Common 0.2.5. Packing documents file-management-information delete    共通　0.2.5. パッキング書類ファイル管理情報削除
        deleteTtPackingHeadByManual();                  // Common 0.2.6. Packing-Header information delete                       共通　0.2.6. パッキングヘッダ情報削除
        deleteTtInvoiceAttachedByManual();              // Common 0.2.7. Invoice-Attached information delete                     共通　0.2.7. インボイスアタッチ情報削除
        deleteLbFileManagerInvoiceByManual();           // Common 0.2.8. Invoice documents file-management-information delete    共通　0.2.8. インボイス書類ファイル管理情報削除
        deleteTtInvoiceHeaderByManual();                // Common 0.2.9. Invoice-Header information delete                       共通　0.2.9. インボイスヘッダ情報削除

        // 35.6. invoice information delete (manual Invoice)
        // 35.6. インボイス情報削除(マニュアルインボイス)
        deleteTtInvoiceByManual();

        // ---------------------------------------------------------------------

        // 37. A delete of CML-Error-Report-Detail information
        // 37. CMLエラーレポート明細情報の削除
        deleteTtCmlErrorDtl();

        // 38. A delete of CML-Error-Report-Header information
        // 38. CMLエラーレポートヘッダ情報の削除
        deleteTtCmlErrorHeader();

        // 39.A delete of BHT-Work-Time information
        // 39. BHT作業時間情報の削除
        deleteTtBhtWorkPltz();      // 39.1 Delete of BHT-Work-Time-For-Palletize informations     39.1 BHT作業情報テーブル(パレタイズ)情報の削除
        deleteTtBhtWorkMixTag();    // 39.2 Delete of BHT-Work-Time-For-Mix-Tag informations       39.2 BHT作業情報テーブル(小箱内多品)情報の削除
        deleteTtBhtWorkErr();       // 39.3 Delete of BHT-Work-Error informations                  39.3 BHT作業エラー情報の削除
        deleteTtBhtWorkTime();      // 39.4 Delete of BHT-Work-Time informations                   39.4 BHT作業時間情報の削除

        // 41. Packing specification effective REVISION hysteresis information delete
        // 41. 包装仕様有効リビジョン履歴情報削除
        deleteTmPkgSpecRev();

        // Order upload request management infomation delte.
        // 受注アップロードリクエスト管理情報削除
        deleteLbFileManagerByOdrUpload(); // NL015 ADD
        deleteTtOdrUploadReqMgt(); // NL015 ADD

        // 42. Delete of unnecessary work data
        // 42. 不要ワークデータの削除
        deleteTwShippingActInvoice();   //  1. Shipping-Actuality-Invoice-Work T        1. 船積実績対象インボイスワークT
        deleteTwInvPltz();              //  2. Palletize work T for an Invoice          2. インボイス対象パレタイズワークT
        deleteTwInv();                  //  3. Invoice Group Work T                     3. インボイスグループワークT
        deleteTwInvoice();              //  4. Invoice Work T                           4. インボイスワークT
        deleteTwInvItem();              //  5. Invoice-Item-No-Work T                   5. インボイス作成対象品目番号ワークT
        deleteTwStgAct();               //  6. Staging-Actuality-Work T                 6. 山作り実績ワークT
        deleteTwStgInstr();             //  7. Staging-Inst-Work T                      7. 荷揃え指示ワークT
        deleteTwXpltz();                //  8. X-Palletize-Work T                       8. まとめパレタイズワークT
        deleteTwPltzInstrItemNo();      //  9. Palletize-Instruction-Item-No-Work T     9. 梱包指示品目番号ワークT
        deleteTwPltzItemItemNo();       // 10. Palletize-Item-Work T                   10. パレタイズ対象品ワークT
        deleteTwPltzItemPkg();          // 11. Palletize-Item-Package-Work T           11. パレタイズ対象品PKGワークT
        deleteTwMixtagRt();             // 12. Mix-Tag-RT-WorkT                        12. MIXED用RT材ワークT
        deleteTwMixtag();               // 13. Mix-Tag-WorkT                           13. MIXED品目番号ワークT
        deleteTtBatchReqParam();        // 14. Batch Request Parameter T               14. バッチリクエストパラメータT
        deleteTtOnlineReqJobParam();    // 15. Online Request Job Parameter            15. オンラインリクエストジョブパラメータ   //NL015 ADD
    }


    /**
     * 1. Delete of a soft-delete record
     *    1.1 Sales Contract Attached
     * <br />1. 論理削除レコードの削除
     *    1.1 セールスコントラクトアタッチ
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteLogicalDeletedTtScAttached() throws ApplicationException {
        TtScAttachedCriteriaDomain ttScAttachedCriteriaDomain = new TtScAttachedCriteriaDomain();
        ttScAttachedCriteriaDomain.setDeleteFlg("Y");
        int deletedCount = ttScAttachedService.deleteByCondition(ttScAttachedCriteriaDomain);
        LOG.info("ECA0027T0100: TtScAttached: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 1. Delete of a soft-delete record
     *    1.2 Sales Contract Header
     * <br />1. 論理削除レコードの削除
     *    1.2 セールスコントラクトヘッダ
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteLogicalDeletedTtScHeader() throws ApplicationException {
        TtScHeaderCriteriaDomain ttScHeaderCriteriaDomain = new TtScHeaderCriteriaDomain();
        ttScHeaderCriteriaDomain.setDeleteFlg("Y");
        int deletedCount = ttScHeaderService.deleteByCondition(ttScHeaderCriteriaDomain);
        LOG.info("ECA0027T0100: TtScHeader: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 1. Delete of a soft-delete record
     *   1.3 Packing attaching ITEM NO
     * <br />1. 論理削除レコードの削除
     *    1.3 パッキングアタッチ品目番号
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteLogicalDeletedTtPackAtchItemNo() throws ApplicationException {
        TtPackAtchItemNoCriteriaDomain ttPackAtchItemNoCriteriaDomain = new TtPackAtchItemNoCriteriaDomain();
        ttPackAtchItemNoCriteriaDomain.setDeleteFlg("Y");
        int deletedCount = ttPackAtchItemNoService.deleteByCondition(ttPackAtchItemNoCriteriaDomain);
        LOG.info("ECA0027T0100: TtPackAtchItemNo: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 1. Delete of a soft-delete record
     *    1.4 Packing attaching CML
     * <br />1. 論理削除レコードの削除
     *    1.4 パッキングアタッチCML
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteLogicalDeletedTtPackingAttachedCml() throws ApplicationException {
        TtPackingAttachedCmlCriteriaDomain ttPackingAttachedCmlCriteriaDomain = new TtPackingAttachedCmlCriteriaDomain();
        ttPackingAttachedCmlCriteriaDomain.setDeleteFlg("Y");
        int deletedCount = ttPackingAttachedCmlService.deleteByCondition(ttPackingAttachedCmlCriteriaDomain);
        LOG.info("ECA0027T0100: TtPackingAttachedCml: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 1. Delete of a soft-delete record
     *    1.5 Packing Header
     * <br />1. 論理削除レコードの削除
     *    1.5 パッキングヘッダ
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteLogicalDeletedTtPackingHead() throws ApplicationException {
        TtPackingHeadCriteriaDomain ttPackingHeadCriteriaDomain = new TtPackingHeadCriteriaDomain();
        ttPackingHeadCriteriaDomain.setDeleteFlg("Y");
        int deletedCount = ttPackingHeadService.deleteByCondition(ttPackingHeadCriteriaDomain);
        LOG.info("ECA0027T0100: TtPackingHead: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 1. Delete of a soft-delete record
     *    1.6 Invoice Attached
     * <br />1. 論理削除レコードの削除
     *    1.6 インボイスアタッチ
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteLogicalDeletedTtInvoiceAttached() throws ApplicationException {
        TtInvoiceAttachedCriteriaDomain ttInvoiceAttachedCriteriaDomain = new TtInvoiceAttachedCriteriaDomain();
        ttInvoiceAttachedCriteriaDomain.setDeleteFlg("Y");
        int deletedCount = ttInvoiceAttachedService.deleteByCondition(ttInvoiceAttachedCriteriaDomain);
        LOG.info("ECA0027T0100: TtInvoiceAttached: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 1. Delete of a soft-delete record
     *      1.7 Invoice Header
     * <br />1. 論理削除レコードの削除
     *    1.7 インボイスヘッダ
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteLogicalDeletedTtInvoiceHeader() throws ApplicationException {
        TtInvoiceHeaderCriteriaDomain ttInvoiceHeaderCriteriaDomain = new TtInvoiceHeaderCriteriaDomain();
        ttInvoiceHeaderCriteriaDomain.setDeleteFlg("Y");
        int deletedCount = ttInvoiceHeaderService.deleteByCondition(ttInvoiceHeaderCriteriaDomain);
        LOG.info("ECA0027T0100: TtInvoiceHeader: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 1. Delete of a soft-delete record
     *    1.8 Shipping Document
     * <br />1. 論理削除レコードの削除
     *    1.8 船積書類
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteLogicalDeletedTtShippingDocument() throws ApplicationException {
        TtShippingDocumentCriteriaDomain ttShippingDocumentCriteriaDomain = new TtShippingDocumentCriteriaDomain();
        ttShippingDocumentCriteriaDomain.setDeleteFlg("Y");
        int deletedCount = ttShippingDocumentService.deleteByCondition(ttShippingDocumentCriteriaDomain);
        LOG.info("ECA0027T0100: TtShippingDocument: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 1. Delete of a soft-delete record
     *    1.9 Invoice
     * <br />1. 論理削除レコードの削除
     *    1.9 インボイス
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteLogicalDeletedTtInvoice() throws ApplicationException {
        TtInvoiceCriteriaDomain ttInvoiceCriteriaDomain = new TtInvoiceCriteriaDomain();
        ttInvoiceCriteriaDomain.setDeleteFlg("Y");
        int deletedCount = ttInvoiceService.deleteByCondition(ttInvoiceCriteriaDomain);
        LOG.info("ECA0027T0100: TtInvoice: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 1. Delete of a soft-delete record
     *    1.10 Shipping Actuality Receive Order
     * <br />1. 論理削除レコードの削除
     *    1.10 船積実績対象品受注情報
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteLogicalDeletedTtShippingActOdr() throws ApplicationException {
        TtShippingActOdrCriteriaDomain ttShippingActOdrCriteriaDomain = new TtShippingActOdrCriteriaDomain();
        ttShippingActOdrCriteriaDomain.setDeleteFlg("Y");
        int deletedCount = ttShippingActOdrService.deleteByCondition(ttShippingActOdrCriteriaDomain);
        LOG.info("ECA0027T0100: TtShippingActOdr: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 1. Delete of a soft-delete record
     *    1.11 Shipping Actuality
     * <br />1. 論理削除レコードの削除
     *    1.11 船積実績
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteLogicalDeletedTtShippingAct() throws ApplicationException {
        TtShippingActCriteriaDomain ttShippingActCriteriaDomain = new TtShippingActCriteriaDomain();
        ttShippingActCriteriaDomain.setDeleteFlg("Y");
        int deletedCount = ttShippingActService.deleteByCondition(ttShippingActCriteriaDomain);
        LOG.info("ECA0027T0100: TtShippingAct: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 1. Delete of a soft-delete record
     *    1.12 Shipping Actuality Invoice Works
     * <br />1. 論理削除レコードの削除
     *    1.12 船積実績対象インボイスワーク
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteLogicalDeletedTwShippingActInvoice() throws ApplicationException {
        TwShippingActInvoiceCriteriaDomain twShippingActInvoiceCriteriaDomain = new TwShippingActInvoiceCriteriaDomain();
        twShippingActInvoiceCriteriaDomain.setDelFlg("Y");
        int deletedCount = twShippingActInvoiceService.deleteByCondition(twShippingActInvoiceCriteriaDomain);
        LOG.info("ECA0027T0100: TwShippingActInvoice: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 2. Mix article KANBAN information delete
     * <br />2. Mix品かんばん情報削除
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException  This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteTtMixKanban() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteTtMixKanban(NONE);
        LOG.info("ECA0027T0100: deleteTtMixKanban: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 3-1. Mix Tag Receive Order delete
     * <br />3-1. Mixed品目番号受注情報削除
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteTtMixtagItemOdr() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteTtMixtagItemOdr(NONE);
        LOG.info("ECA0027T0100: deleteTtMixtagItemOdr: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 3-2. Mixed ITEM-NO information delete
     * <br />3-2. Mixed品目番号情報削除
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteTtMixtagItemNo() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteTtMixtagItemNo(NONE);
        LOG.info("ECA0027T0100: deleteTtMixtagItemNo: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 4. RT material information delete for Mixed
     * <br />4. Mixed用RT材情報削除
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteTtMixtagRt() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteTtMixtagRt(NONE);
        LOG.info("ECA0027T0100: deleteTtMixtagRt: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 5. Palletize-Instruction-Receive-Order delete
     * <br />5. 梱包指示品目番号受注情報削除
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteTtPltzInstrOdr() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteTtPltzInstrOdr(NONE);
        LOG.info("ECA0027T0100: deleteTtPltzInstrOdr: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 6. Palletize-Instruction-Item-No information delete
     * <br />6. 梱包指示品目番号情報削除
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteTtPltzInstrItemNo() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteTtPltzInstrItemNo(NONE);
        LOG.info("ECA0027T0100: deleteTtPltzInstrItemNo: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 7. Palletize-Item-Receive-Order delete
     * <br />7. パレタイズ対象品受注情報削除
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteTtPltzItemOdr() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteTtPltzItemOdr(NONE);
        LOG.info("ECA0027T0100: deleteTtPltzItemOdr: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 8. Palletize-Item-KANBAN delete
     * <br />8. パレタイズ対象品かんばん情報削除
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteTtPltzKanban() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteTtPltzKanban(NONE);
        LOG.info("ECA0027T0100: deleteTtPltzKanban: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     *  9. Mix tag backup for a delete
     * 10. Palletize Instr. No. . backup for a delete
     * 11. Palletize-Item information delete
     * 12. Mixed thing vote information delete
     * 13. Packaging Instruction (=Pull) information delete
     * <br /> 9. 削除対象のMixタグ退避
     * 10. 削除対象の梱包指示No.退避
     * 11. パレタイズ対象品情報削除
     * 12. Mixed現品票情報削除
     * 13. 梱包指示情報削除
     *
     * @return The delete number (0 : 2:  a Palletize-Item information, a 1: Mixed thing vote information, and Packaging Instruction (=Pull) information)  <br />削除件数 (0: パレタイズ対象品情報, 1: Mixed現品票情報, 2: 梱包指示情報)
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int[] deleteTtPltzItemAndTtMixtagAndTtPltzInstr() throws ApplicationException {

        int[] deletedCount = new int[3];

        // 9. Mix tag backup for a delete
        // 9. 削除対象のMixタグ退避
        List<? extends T0100BatchDeleteDomain> savedMixtag = comnAuxDao.searchTtPltzItemMixtag(NONE);
        LOG.info("ECA0027T0100: searchTtPltzItemMixtag: " + Integer.toString(savedMixtag.size()) + " record(s) saved");

        // 10. Palletize Instr. No. . backup for a delete
        // 10. 削除対象の梱包指示No.退避
        List<? extends T0100BatchDeleteDomain> savedInstrNo = comnAuxDao.searchTtPltzItemPltzInstrNo(NONE);
        LOG.info("ECA0027T0100: searchTtPltzItemPltzInstrNo: " + Integer.toString(savedInstrNo.size()) + " record(s) saved");

        // 11. Palletize-Item information delete
        // 11. パレタイズ対象品情報削除
        deletedCount[0] = comnAuxDao.deleteTtPltzItem(NONE);
        LOG.info("ECA0027T0100: deleteTtPltzItem: " + Integer.toString(deletedCount[0]) + " record(s) deleted");

        // 12. Mixed thing vote information delete
        // 12. Mixed現品票情報削除
        T0100BatchDeleteCriteriaDomain mixtagCriteria = new T0100BatchDeleteCriteriaDomain();
        for (T0100BatchDeleteDomain mixtag : savedMixtag) {
            mixtagCriteria.setMixTagNo(mixtag.getMixTagNo());
            deletedCount[1] += comnAuxDao.deleteTtMixtag(mixtagCriteria);
        }
        LOG.info("ECA0027T0100: deleteTtMixtag: " + Integer.toString(deletedCount[1]) + " record(s) deleted");
        savedMixtag = null; // Unnecessary henceforth 以降は不要

        // 13. Packaging Instruction (=Pull) information delete
        // 13. 梱包指示情報削除
        T0100BatchDeleteCriteriaDomain instrNoCriteria = new T0100BatchDeleteCriteriaDomain();
        for (T0100BatchDeleteDomain instrNo : savedInstrNo) {
            instrNoCriteria.setPltzInstrNo(instrNo.getPltzInstrNo());
            deletedCount[2] += comnAuxDao.deleteTtPltzInstr(instrNoCriteria);
        }
        LOG.info("ECA0027T0100: deleteTtPltzInstr: " + Integer.toString(deletedCount[2]) + " record(s) deleted");
        savedInstrNo = null; // Unnecessary henceforth 以降は不要

        return deletedCount;
    }


    /**
     * 14. Shipping-Confirm. information delete
     * <br />14. 出荷確認情報削除
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteTtShippingFirm() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteTtShippingFirm(NONE);
        LOG.info("ECA0027T0100: deleteTtShippingFirm: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 15. X-TAG backup for a delete
     * 16. Staging-instruction No. backup for a delete
     * 17. Staging-Actuality No. backup for a delete
     * 18. Palletize information delete
     * 19. X-Palletize information delete
     * 20. staging-instruction information delete
     * 21. Staging-Actuality information delete
     * <br />15. 削除対象のまとめメインマーク退避
     * 16. 削除対象の荷揃え指示No.退避
     * 17. 削除対象の山作り実績No.退避
     * 18. パレタイズ情報削除
     * 19. まとめパレタイズ情報削除
     * 20. 荷揃え指示情報削除
     * 21. 山作り実績情報削除
     *
     * @return The delete number (0:Palletize information, 1:X-Palletize information, and 2 : 3:  a staging-instruction information and Staging-Actuality information)  <br />削除件数 (0: パレタイズ情報, 1: まとめパレタイズ情報, 2: 荷揃え指示情報, 3: 山作り実績情報)
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int[] deleteTtPltzAndTtXpltzAndTtStgInstrAndTtStgAct() throws ApplicationException {

        int[] deletedCount = new int[4];

        // 15. X-TAG backup for a delete
        // 15. 削除対象のまとめメインマーク退避
        List<? extends T0100BatchDeleteDomain> savedXMainMark = comnAuxDao.searchTtPltzXMainMark(NONE);
        LOG.info("ECA0027T0100: searchTtPltzXMainMark: " + Integer.toString(savedXMainMark.size()) + " record(s) saved");

        // 16. The staging-instruction No. backupfor delete
        // 16. 削除対象の荷揃え指示No.退避
        List<? extends T0100BatchDeleteDomain> savedStagingInstr = comnAuxDao.searchTtPltzByStagingInstr(NONE);
        LOG.info("ECA0027T0100: searchTtPltzByStagingInstr: " + Integer.toString(savedStagingInstr.size()) + " record(s) saved");

        // 17. The Staging-Actuality No. backupfor delete
        // 17. 削除対象の山作り実績No.退避
        List<? extends T0100BatchDeleteDomain> savedStagingActuality = comnAuxDao.searchTtPltzByStagingActuality(NONE);
        LOG.info("ECA0027T0100: searchTtPltzByStagingActuality: " + Integer.toString(savedStagingActuality.size()) + " record(s) saved");

        // 18. Palletize information delete
        // 18. パレタイズ情報削除
        deletedCount[0] = comnAuxDao.deleteTtPltz(NONE);
        LOG.info("ECA0027T0100: deleteTtPltz: " + Integer.toString(deletedCount[0]) + " record(s) deleted");

        // 19. X-Palletize information delete
        // 19. まとめパレタイズ情報削除
        T0100BatchDeleteCriteriaDomain xMainMarkCriteria = new T0100BatchDeleteCriteriaDomain();
        for (T0100BatchDeleteDomain xMainMark : savedXMainMark) {
            xMainMarkCriteria.setXMainMark(xMainMark.getXMainMark());
            deletedCount[1] += comnAuxDao.deleteTtXpltz(xMainMarkCriteria);
        }
        LOG.info("ECA0027T0100: deleteTtXpltz: " + Integer.toString(deletedCount[1]) + " record(s) deleted");
        savedXMainMark = null; // Unnecessary henceforth 以降は不要

        // 20. staging-instruction information delete
        // 20. 荷揃え指示情報削除
        T0100BatchDeleteCriteriaDomain stagingInstrCriteria = new T0100BatchDeleteCriteriaDomain();
        for (T0100BatchDeleteDomain stagingInstr : savedStagingInstr) {
            stagingInstrCriteria.setStgInstrNo(stagingInstr.getStgInstrNo());
            deletedCount[2] += comnAuxDao.deleteTtStgInstr(stagingInstrCriteria);
        }
        LOG.info("ECA0027T0100: deleteTtStgInstr: " + Integer.toString(deletedCount[2]) + " record(s) deleted");
        savedStagingInstr = null; // Unnecessary henceforth 以降は不要

        // 21. Staging-Actuality information delete
        // 21. 山作り実績情報削除
        T0100BatchDeleteCriteriaDomain stagingActualityCriteria = new T0100BatchDeleteCriteriaDomain();
        for (T0100BatchDeleteDomain stagingActuality : savedStagingActuality) {
            stagingActualityCriteria.setStgActNo(stagingActuality.getStgActNo());
            deletedCount[3] = comnAuxDao.deleteTtStgAct(stagingActualityCriteria);
        }
        LOG.info("ECA0027T0100: deleteTtStgAct: " + Integer.toString(deletedCount[3]) + " record(s) deleted");
        savedStagingActuality = null; // Unnecessary henceforth 以降は不要

        return deletedCount;
    }


    /**
     * 22. Invoice pertinent information delete (main Invoice Re-Invoice)
     * Common 0.2.1. Shipping-Document file-management-information delete
     * <br />22. インボイス関連情報削除(メインインボイス-リインボイス)
     * 共通　0.2.1. 船積書類ファイル管理情報削除
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteLbFileManagerByshippinActMainReinv() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteLbFileManagerByshippinActMainReinv(NONE);
        LOG.info("ECA0027T0100: deleteLbFileManagerByshippinActMainReinv: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 22. Invoice pertinent information delete (main Invoice Re-Invoice)  
     * Common 0.2.2. Shipping-Document information delete
     * <br />22. インボイス関連情報削除(メインインボイス-リインボイス)
     * 共通　0.2.2. 船積書類情報削除
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteTtShippingDocumentByMainReinv() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteTtShippingDocumentByMainReinv(NONE);
        LOG.info("ECA0027T0100: deleteTtShippingDocumentByMainReinv: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 22. Invoice pertinent information delete (main Invoice Re-Invoice)  
     * Common 0.2.3. Packing-Attached-Item-No information delete
     * <br />22. インボイス関連情報削除(メインインボイス-リインボイス)
     * 共通　0.2.3. パッキングアタッチ_品目番号情報削除
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteTtPackAtchItemNoByMainReinv() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteTtPackAtchItemNoByMainReinv(NONE);
        LOG.info("ECA0027T0100: deleteTtPackAtchItemNoByMainReinv: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 22. Invoice pertinent information delete (main Invoice Re-Invoice)  
     * Common 0.2.4. Packing-Attached-CML information delete
     * <br />22. インボイス関連情報削除(メインインボイス-リインボイス)
     * 共通　0.2.4. パッキングアタッチ_CML情報削除
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteTtPackingAttachedCmlByMainReinv() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteTtPackingAttachedCmlByMainReinv(NONE);
        LOG.info("ECA0027T0100: deleteTtPackingAttachedCmlByMainReinv: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 22. Invoice pertinent information delete (main Invoice Re-Invoice)  
     * Common 0.2.5. Packing documents file-management-information delete
     * <br />22. インボイス関連情報削除(メインインボイス-リインボイス)
     * 共通　0.2.5. パッキング書類ファイル管理情報削除
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteLbFileManagerPackingByMainReinv() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteLbFileManagerPackingByMainReinv(NONE);
        LOG.info("ECA0027T0100: deleteLbFileManagerPackingByMainReinv: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 22. Invoice pertinent information delete (main Invoice Re-Invoice)  
     * Common 0.2.6. Packing-Header information delete
     * 22. Invoice pertinent information delete (main Invoice Re-Invoice)  
     * Common 0.2.6. Packing-Header information delete
     * <br />22. インボイス関連情報削除(メインインボイス-リインボイス)
     * 共通　0.2.6. パッキングヘッダ情報削除
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteTtPackingHeadByMainReinv() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteTtPackingHeadByMainReinv(NONE);
        LOG.info("ECA0027T0100: deleteTtPackingHeadByMainReinv: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 22. Invoice pertinent information delete (main Invoice Re-Invoice)  
     * Common 0.2.7. Invoice-Attached information delete
     * <br />22. インボイス関連情報削除(メインインボイス-リインボイス)
     * 共通　0.2.7. インボイスアタッチ情報削除
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteTtInvoiceAttachedByMainReinv() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteTtInvoiceAttachedByMainReinv(NONE);
        LOG.info("ECA0027T0100: deleteTtInvoiceAttachedByMainReinv: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 22. Invoice pertinent information delete (main Invoice Re-Invoice)  
     * Common 0.2.8. Invoice documents file-management-information delete
     * <br />22. インボイス関連情報削除(メインインボイス-リインボイス)
     * 共通　0.2.8. インボイス書類ファイル管理情報削除
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteLbFileManagerInvoiceByMainReinv() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteLbFileManagerInvoiceByMainReinv(NONE);
        LOG.info("ECA0027T0100: deleteLbFileManagerInvoiceByMainReinv: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 22. Invoice pertinent information delete (main Invoice Re-Invoice)  
     * Common 0.2.9. Invoice-Header information delete
     * <br />22. インボイス関連情報削除(メインインボイス-リインボイス)
     * 共通　0.2.9. インボイスヘッダ情報削除
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteTtInvoiceHeaderByMainReinv() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteTtInvoiceHeaderByMainReinv(NONE);
        LOG.info("ECA0027T0100: deleteTtInvoiceHeaderByMainReinv: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 23. invoice information delete (main Invoice Re-Invoice)  
     * <br />23. インボイス情報削除(メインインボイス-リインボイス)
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteTtInvoiceReInvoiceByMainReinv() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteTtInvoiceReInvoiceByMainReinv(NONE);
        LOG.info("ECA0027T0100: deleteTtInvoiceReInvoiceByMainReinv: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 24. Invoice pertinent information delete (main Invoice FRT Invoice)  
     * Common 0.2.1. Shipping-Document file-management-information delete
     * <br />24. インボイス関連情報削除(メインインボイス-FRTインボイス)
     * 共通　0.2.1. 船積書類ファイル管理情報削除
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteLbFileManagerByshippinActMainFrt() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteLbFileManagerByshippinActMainFrt(NONE);
        LOG.info("ECA0027T0100: deleteLbFileManagerByshippinActMainFrt: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 24. Invoice pertinent information delete (main Invoice FRT Invoice)  
     * Common 0.2.2. Shipping-Document information delete
     * <br />24. インボイス関連情報削除(メインインボイス-FRTインボイス)
     * 共通　0.2.2. 船積書類情報削除
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteTtShippingDocumentByMainFrt() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteTtShippingDocumentByMainFrt(NONE);
        LOG.info("ECA0027T0100: deleteTtShippingDocumentByMainFrt: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 24. Invoice pertinent information delete (main Invoice FRT Invoice)  
     * Common 0.2.3. Packing-Attached-Item-No information delete
     * <br />24. インボイス関連情報削除(メインインボイス-FRTインボイス)
     * 共通　0.2.3. パッキングアタッチ_品目番号情報削除
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteTtPackAtchItemNoByMainFrt() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteTtPackAtchItemNoByMainFrt(NONE);
        LOG.info("ECA0027T0100: deleteTtPackAtchItemNoByMainFrt: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 24. Invoice pertinent information delete (main Invoice FRT Invoice)  
     * Common 0.2.4. Packing-Attached-CML information delete
     * <br />24. インボイス関連情報削除(メインインボイス-FRTインボイス)
     * 共通　0.2.4. パッキングアタッチ_CML情報削除
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteTtPackingAttachedCmlByMainFrt() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteTtPackingAttachedCmlByMainFrt(NONE);
        LOG.info("ECA0027T0100: deleteTtPackingAttachedCmlByMainFrt: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 24. Invoice pertinent information delete (main Invoice FRT Invoice)  
     * Common 0.2.5. Packing documents file-management-information delete
     * <br />24. インボイス関連情報削除(メインインボイス-FRTインボイス)
     * 共通　0.2.5. パッキング書類ファイル管理情報削除
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteLbFileManagerPackingByMainFrt() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteLbFileManagerPackingByMainFrt(NONE);
        LOG.info("ECA0027T0100: deleteLbFileManagerPackingByMainFrt: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 24. Invoice pertinent information delete (main Invoice FRT Invoice)  
     * Common 0.2.6. Packing-Header information delete
     * <br />24. インボイス関連情報削除(メインインボイス-FRTインボイス)
     * 共通　0.2.6. パッキングヘッダ情報削除
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteTtPackingHeadByMainFrt() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteTtPackingHeadByMainFrt(NONE);
        LOG.info("ECA0027T0100: deleteTtPackingHeadByMainFrt: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 24. Invoice pertinent information delete (main Invoice FRT Invoice)  
     * Common 0.2.7. Invoice-Attached information delete
     * <br />24. インボイス関連情報削除(メインインボイス-FRTインボイス)
     * 共通　0.2.7. インボイスアタッチ情報削除
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteTtInvoiceAttachedByMainFrt() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteTtInvoiceAttachedByMainFrt(NONE);
        LOG.info("ECA0027T0100: deleteTtInvoiceAttachedByMainFrt: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 24. Invoice pertinent information delete (main Invoice FRT Invoice)  
     * Common 0.2.8. Invoice documents file-management-information delete
     * <br />24. インボイス関連情報削除(メインインボイス-FRTインボイス)
     * 共通　0.2.8. インボイス書類ファイル管理情報削除
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteLbFileManagerInvoiceByMainFrt() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteLbFileManagerInvoiceByMainFrt(NONE);
        LOG.info("ECA0027T0100: deleteLbFileManagerInvoiceByMainFrt: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 24. Invoice pertinent information delete (main Invoice FRT Invoice)  
     * Common 0.2.9. Invoice-Header information delete
     * <br />24. インボイス関連情報削除(メインインボイス-FRTインボイス)
     * 共通　0.2.9. インボイスヘッダ情報削除
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteTtInvoiceHeaderByMainFrt() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteTtInvoiceHeaderByMainFrt(NONE);
        LOG.info("ECA0027T0100: deleteTtInvoiceHeaderByMainFrt: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 25. invoice information delete (main Invoice FRT Invoice)  
     * <br />25. インボイス情報削除(メインインボイス-FRTインボイス)
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteTtInvoiceByMainFrt() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteTtInvoiceByMainFrt(NONE);
        LOG.info("ECA0027T0100: deleteTtInvoiceByMainFrt: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 26. Invoice pertinent information delete (main Invoice)  
     * Common 0.2.1. Shipping-Document file-management-information delete
     * <br />26. インボイス関連情報削除(メインインボイス)
     * 共通　0.2.1. 船積書類ファイル管理情報削除
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteLbFileManagerByshippinActMain() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteLbFileManagerByshippinActMain(NONE);
        LOG.info("ECA0027T0100: deleteLbFileManagerByshippinActMain: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 26. Invoice pertinent information delete (main Invoice)  
     * Common 0.2.2. Shipping-Document information delete
     * <br />26. インボイス関連情報削除(メインインボイス)
     * 共通　0.2.2. 船積書類情報削除
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteTtShippingDocumentByMain() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteTtShippingDocumentByMain(NONE);
        LOG.info("ECA0027T0100: deleteTtShippingDocumentByMain: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 26. Invoice pertinent information delete (main Invoice)  
     * Common 0.2.3. Packing-Attached-Item-No information delete
     * <br />26. インボイス関連情報削除(メインインボイス)
     * 共通　0.2.3. パッキングアタッチ_品目番号情報削除
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteTtPackAtchItemNoByMain() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteTtPackAtchItemNoByMain(NONE);
        LOG.info("ECA0027T0100: deleteTtPackAtchItemNoByMain: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 26. Invoice pertinent information delete (main Invoice)  
     * Common 0.2.4. Packing-Attached-CML information delete
     * <br />26. インボイス関連情報削除(メインインボイス)
     * 共通　0.2.4. パッキングアタッチ_CML情報削除
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteTtPackingAttachedCmlByMain() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteTtPackingAttachedCmlByMain(NONE);
        LOG.info("ECA0027T0100: deleteTtPackingAttachedCmlByMain: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 26. Invoice pertinent information delete (main Invoice)  
     * Common 0.2.5. Packing documents file-management-information delete
     * <br />26. インボイス関連情報削除(メインインボイス)
     * 共通　0.2.5. パッキング書類ファイル管理情報削除
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteLbFileManagerPackingByMain() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteLbFileManagerPackingByMain(NONE);
        LOG.info("ECA0027T0100: deleteLbFileManagerPackingByMain: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 26. Invoice pertinent information delete (main Invoice)  
     * Common 0.2.6. Packing-Header information delete
     * <br />26. インボイス関連情報削除(メインインボイス)
     * 共通　0.2.6. パッキングヘッダ情報削除
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteTtPackingHeadByMain() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteTtPackingHeadByMain(NONE);
        LOG.info("ECA0027T0100: deleteTtPackingHeadByMain: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 26. Invoice pertinent information delete (main Invoice)  
     * Common 0.2.7. Invoice-Attached information delete
     * <br />26. インボイス関連情報削除(メインインボイス)
     * 共通　0.2.7. インボイスアタッチ情報削除
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteTtInvoiceAttachedByMain() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteTtInvoiceAttachedByMain(NONE);
        LOG.info("ECA0027T0100: deleteTtInvoiceAttachedByMain: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 26. Invoice pertinent information delete (main Invoice)  
     * Common 0.2.8. Invoice documents file-management-information delete
     * <br />26. インボイス関連情報削除(メインインボイス)
     * 共通　0.2.8. インボイス書類ファイル管理情報削除
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteLbFileManagerInvoiceByMain() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteLbFileManagerInvoiceByMain(NONE);
        LOG.info("ECA0027T0100: deleteLbFileManagerInvoiceByMain: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 26. Invoice pertinent information delete (main Invoice)  
     * Common 0.2.9. Invoice-Header information delete
     * <br />26. インボイス関連情報削除(メインインボイス)
     * 共通　0.2.9. インボイスヘッダ情報削除
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteTtInvoiceHeaderByMain() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteTtInvoiceHeaderByMain(NONE);
        LOG.info("ECA0027T0100: deleteTtInvoiceHeaderByMain: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 27. invoice information delete (main Invoice)  
     * <br />27. インボイス情報削除(メインインボイス)
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteTtInvoiceByMain() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteTtInvoiceByMain(NONE);
        LOG.info("ECA0027T0100: deleteTtInvoiceByMain: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 28. Shipping-Actuality-Receive-Order delete
     * <br />28. 船積実績対象品受注情報削除
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteTtShippingActOdr() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteTtShippingActOdr(NONE);
        LOG.info("ECA0027T0100: deleteTtShippingActOdr: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 29. B/L, a CLP file-management-information delete
     * <br />29. B/L、CLPファイル管理情報削除
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteLbFileManagerByBlClp() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteLbFileManagerByBlClp(NONE);
        LOG.info("ECA0027T0100: deleteLbFileManagerByBlClp: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 30. Shipping-Actuality information delete
     * <br />30. 船積実績情報削除
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteTtShippingAct() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteTtShippingAct(NONE);
        LOG.info("ECA0027T0100: deleteTtShippingAct: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 31. Delete of a shipped firm-order-receipt information
     * <br />31. 出荷済確定受注情報の削除
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteTtExpRcvOdrByShiped() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteTtExpRcvOdrByShiped(NONE);
        LOG.info("ECA0027T0100: deleteTtExpRcvOdrByShiped: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 32. Delete of an unofficial announcement ordering information
     * <br />32. 内示受注情報の削除
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteTtExpRcvOdrByPrivateNotification() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteTtExpRcvOdrByPrivateNotification(NONE);
        LOG.info("ECA0027T0100: deleteTtExpRcvOdrByPrivateNotification: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 33.1. Invoice pertinent information delete (front [ cancellation ] Invoice Re-Invoice)  
     * Common 0.2.1. Shipping-Document file-management-information delete
     * <br />33.1. インボイス関連情報削除(キャンセル前インボイス-リインボイス)
     * 共通　0.2.1. 船積書類ファイル管理情報削除
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteLbFileManagerByshippinActBforCancelReinv() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteLbFileManagerByshippinActBforCancelReinv(NONE);
        LOG.info("ECA0027T0100: deleteLbFileManagerByshippinActBforCancelReinv: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 33.1. Invoice pertinent information delete (front [ cancellation ] Invoice Re-Invoice)  
     * Common 0.2.2. Shipping-Document information delete
     * <br />33.1. インボイス関連情報削除(キャンセル前インボイス-リインボイス)
     * 共通　0.2.2. 船積書類情報削除
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteTtShippingDocumentByBforCancelReinv() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteTtShippingDocumentByBforCancelReinv(NONE);
        LOG.info("ECA0027T0100: deleteTtShippingDocumentByBforCancelReinv: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 33.1. Invoice pertinent information delete (front [ cancellation ] Invoice Re-Invoice)  
     * Common 0.2.3. Packing-Attached-Item-No information delete
     * <br />33.1. インボイス関連情報削除(キャンセル前インボイス-リインボイス)
     * 共通　0.2.3. パッキングアタッチ_品目番号情報削除
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteTtPackAtchItemNoByBforCancelReinv() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteTtPackAtchItemNoByBforCancelReinv(NONE);
        LOG.info("ECA0027T0100: deleteTtPackAtchItemNoByBforCancelReinv: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 33.1. Invoice pertinent information delete (front [ cancellation ] Invoice Re-Invoice)  
     * Common 0.2.4. Packing-Attached-CML information delete
     * <br />33.1. インボイス関連情報削除(キャンセル前インボイス-リインボイス)
     * 共通　0.2.4. パッキングアタッチ_CML情報削除
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteTtPackingAttachedCmlByBforCancelReinv() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteTtPackingAttachedCmlByBforCancelReinv(NONE);
        LOG.info("ECA0027T0100: deleteTtPackingAttachedCmlByBforCancelReinv: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 33.1. Invoice pertinent information delete (front [ cancellation ] Invoice Re-Invoice)  
     * Common 0.2.5. Packing documents file-management-information delete
     * <br />33.1. インボイス関連情報削除(キャンセル前インボイス-リインボイス)
     * 共通　0.2.5. パッキング書類ファイル管理情報削除
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteLbFileManagerPackingByBforCancelReinv() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteLbFileManagerPackingByBforCancelReinv(NONE);
        LOG.info("ECA0027T0100: deleteLbFileManagerPackingByBforCancelReinv: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 33.1. Invoice pertinent information delete (front [ cancellation ] Invoice Re-Invoice)  
     * Common 0.2.6. Packing-Header information delete
     * <br />33.1. インボイス関連情報削除(キャンセル前インボイス-リインボイス)
     * 共通　0.2.6. パッキングヘッダ情報削除
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteTtPackingHeadByBforCancelReinv() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteTtPackingHeadByBforCancelReinv(NONE);
        LOG.info("ECA0027T0100: deleteTtPackingHeadByBforCancelReinv: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 33.1. Invoice pertinent information delete (front [ cancellation ] Invoice Re-Invoice)  
     * Common 0.2.7. Invoice-Attached information delete
     * <br />33.1. インボイス関連情報削除(キャンセル前インボイス-リインボイス)
     * 共通　0.2.7. インボイスアタッチ情報削除
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteTtInvoiceAttachedByBforCancelReinv() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteTtInvoiceAttachedByBforCancelReinv(NONE);
        LOG.info("ECA0027T0100: deleteTtInvoiceAttachedByBforCancelReinv: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 33.1. Invoice pertinent information delete (front [ cancellation ] Invoice Re-Invoice)  
     * Common 0.2.8. Invoice documents file-management-information delete
     * <br />33.1. インボイス関連情報削除(キャンセル前インボイス-リインボイス)
     * 共通　0.2.8. インボイス書類ファイル管理情報削除
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteLbFileManagerInvoiceByBforCancelReinv() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteLbFileManagerInvoiceByBforCancelReinv(NONE);
        LOG.info("ECA0027T0100: deleteLbFileManagerInvoiceByBforCancelReinv: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 33.1. Invoice pertinent information delete (front [ cancellation ] Invoice Re-Invoice)  
     * Common 0.2.9. Invoice-Header information delete
     * <br />33.1. インボイス関連情報削除(キャンセル前インボイス-リインボイス)
     * 共通　0.2.9. インボイスヘッダ情報削除
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteTtInvoiceHeaderByBforCancelReinv() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteTtInvoiceHeaderByBforCancelReinv(NONE);
        LOG.info("ECA0027T0100: deleteTtInvoiceHeaderByBforCancelReinv: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 33.2. invoice information delete (front [ cancellation ] Invoice Re-Invoice)  
     * <br />33.2. インボイス情報削除(キャンセル前インボイス-リインボイス)
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteTtInvoiceByBforCancelReinv() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteTtInvoiceByBforCancelReinv(NONE);
        LOG.info("ECA0027T0100: deleteTtInvoiceByBforCancelReinv: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 33.3. Invoice pertinent information delete (front [ cancellation ] Invoice FRT Invoice)  
     * Common 0.2.1. Shipping-Document file-management-information delete
     * <br />33.3. インボイス関連情報削除(キャンセル前インボイス-FRTインボイス)
     * 共通　0.2.1. 船積書類ファイル管理情報削除
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteLbFileManagerByshippinActBforCancelFrt() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteLbFileManagerByshippinActBforCancelFrt(NONE);
        LOG.info("ECA0027T0100: deleteLbFileManagerByshippinActBforCancelFrt: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 33.3. Invoice pertinent information delete (front [ cancellation ] Invoice FRT Invoice)  
     * Common 0.2.2. Shipping-Document information delete
     * <br />33.3. インボイス関連情報削除(キャンセル前インボイス-FRTインボイス)
     * 共通　0.2.2. 船積書類情報削除
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteTtShippingDocumentByBforCancelFrt() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteTtShippingDocumentByBforCancelFrt(NONE);
        LOG.info("ECA0027T0100: deleteTtShippingDocumentByBforCancelFrt: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 33.3. Invoice pertinent information delete (front [ cancellation ] Invoice FRT Invoice)  
     * Common 0.2.3. Packing-Attached-Item-No information delete
     * <br />33.3. インボイス関連情報削除(キャンセル前インボイス-FRTインボイス)
     * 共通　0.2.3. パッキングアタッチ_品目番号情報削除
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteTtPackAtchItemNoByBforCancelFrt() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteTtPackAtchItemNoByBforCancelFrt(NONE);
        LOG.info("ECA0027T0100: deleteTtPackAtchItemNoByBforCancelFrt: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 33.3. Invoice pertinent information delete (front [ cancellation ] Invoice FRT Invoice)  
     * Common 0.2.4. Packing-Attached-CML information delete
     * <br />33.3. インボイス関連情報削除(キャンセル前インボイス-FRTインボイス)
     * 共通　0.2.4. パッキングアタッチ_CML情報削除
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteTtPackingAttachedCmlByBforCancelFrt() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteTtPackingAttachedCmlByBforCancelFrt(NONE);
        LOG.info("ECA0027T0100: deleteTtPackingAttachedCmlByBforCancelFrt: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 33.3. Invoice pertinent information delete (front [ cancellation ] Invoice FRT Invoice)  
     * Common 0.2.5. Packing documents file-management-information delete
     * <br />33.3. インボイス関連情報削除(キャンセル前インボイス-FRTインボイス)
     * 共通　0.2.5. パッキング書類ファイル管理情報削除
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteLbFileManagerPackingByBforCancelFrt() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteLbFileManagerPackingByBforCancelFrt(NONE);
        LOG.info("ECA0027T0100: deleteLbFileManagerPackingByBforCancelFrt: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 33.3. Invoice pertinent information delete (front [ cancellation ] Invoice FRT Invoice)  
     * Common 0.2.6. Packing-Header information delete
     * <br />33.3. インボイス関連情報削除(キャンセル前インボイス-FRTインボイス)
     * 共通　0.2.6. パッキングヘッダ情報削除
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteTtPackingHeadByBforCancelFrt() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteTtPackingHeadByBforCancelFrt(NONE);
        LOG.info("ECA0027T0100: deleteTtPackingHeadByBforCancelFrt: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 33.3. Invoice pertinent information delete (front [ cancellation ] Invoice FRT Invoice)  
     * Common 0.2.7. Invoice-Attached information delete
     * <br />33.3. インボイス関連情報削除(キャンセル前インボイス-FRTインボイス)
     * 共通　0.2.7. インボイスアタッチ情報削除
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteTtInvoiceAttachedByBforCancelFrt() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteTtInvoiceAttachedByBforCancelFrt(NONE);
        LOG.info("ECA0027T0100: deleteTtInvoiceAttachedByBforCancelFrt: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 33.3. Invoice pertinent information delete (front [ cancellation ] Invoice FRT Invoice)  
     * Common 0.2.8. Invoice documents file-management-information delete
     * <br />33.3. インボイス関連情報削除(キャンセル前インボイス-FRTインボイス)
     * 共通　0.2.8. インボイス書類ファイル管理情報削除
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteLbFileManagerInvoiceByBforCancelFrt() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteLbFileManagerInvoiceByBforCancelFrt(NONE);
        LOG.info("ECA0027T0100: deleteLbFileManagerInvoiceByBforCancelFrt: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 33.3. Invoice pertinent information delete (front [ cancellation ] Invoice FRT Invoice)  
     * Common 0.2.9. Invoice-Header information delete
     * <br />33.3. インボイス関連情報削除(キャンセル前インボイス-FRTインボイス)
     * 共通　0.2.9. インボイスヘッダ情報削除
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteTtInvoiceHeaderByBforCancelFrt() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteTtInvoiceHeaderByBforCancelFrt(NONE);
        LOG.info("ECA0027T0100: deleteTtInvoiceHeaderByBforCancelFrt: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 33.4. invoice information delete (front [ cancellation ] Invoice FRT Invoice)  
     * <br />33.4. インボイス情報削除(キャンセル前インボイス-FRTインボイス)
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteTtInvoiceByBforCancelFrt() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteTtInvoiceByBforCancelFrt(NONE);
        LOG.info("ECA0027T0100: deleteTtInvoiceByBforCancelFrt: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 33.5. Invoice pertinent information delete (front [ cancellation ] Invoice)  
     * Common 0.2.1. Shipping-Document file-management-information delete
     * <br />33.5. インボイス関連情報削除(キャンセル前インボイス)
     * 共通　0.2.1. 船積書類ファイル管理情報削除
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteLbFileManagerByshippinActBforCancel() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteLbFileManagerByshippinActBforCancel(NONE);
        LOG.info("ECA0027T0100: deleteLbFileManagerByshippinActBforCancel: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 33.5. Invoice pertinent information delete (front [ cancellation ] Invoice)  
     * Common 0.2.2. Shipping-Document information delete
     * <br />33.5. インボイス関連情報削除(キャンセル前インボイス)
     * 共通　0.2.2. 船積書類情報削除
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteTtShippingDocumentByBforCancel() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteTtShippingDocumentByBforCancel(NONE);
        LOG.info("ECA0027T0100: deleteTtShippingDocumentByBforCancel: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 33.5. Invoice pertinent information delete (front [ cancellation ] Invoice)  
     * Common 0.2.3. Packing-Attached-Item-No information delete
     * <br />33.5. インボイス関連情報削除(キャンセル前インボイス)
     * 共通　0.2.3. パッキングアタッチ_品目番号情報削除
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteTtPackAtchItemNoByBforCancel() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteTtPackAtchItemNoByBforCancel(NONE);
        LOG.info("ECA0027T0100: deleteTtPackAtchItemNoByBforCancel: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 33.5. Invoice pertinent information delete (front [ cancellation ] Invoice)  
     * Common 0.2.4. Packing-Attached-CML information delete
     * <br />33.5. インボイス関連情報削除(キャンセル前インボイス)
     * 共通　0.2.4. パッキングアタッチ_CML情報削除
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteTtPackingAttachedCmlByBforCancel() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteTtPackingAttachedCmlByBforCancel(NONE);
        LOG.info("ECA0027T0100: deleteTtPackingAttachedCmlByBforCancel: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 33.5. Invoice pertinent information delete (front [ cancellation ] Invoice)  
     * Common 0.2.5. Packing documents file-management-information delete
     * <br />33.5. インボイス関連情報削除(キャンセル前インボイス)
     * 共通　0.2.5. パッキング書類ファイル管理情報削除
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteLbFileManagerPackingByBforCancel() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteLbFileManagerPackingByBforCancel(NONE);
        LOG.info("ECA0027T0100: deleteLbFileManagerPackingByBforCancel: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 33.5. Invoice pertinent information delete (front [ cancellation ] Invoice)  
     * Common 0.2.6. Packing-Header information delete
     * <br />33.5. インボイス関連情報削除(キャンセル前インボイス)
     * 共通　0.2.6. パッキングヘッダ情報削除
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteTtPackingHeadByBforCancel() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteTtPackingHeadByBforCancel(NONE);
        LOG.info("ECA0027T0100: deleteTtPackingHeadByBforCancel: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 33.5. Invoice pertinent information delete (front [ cancellation ] Invoice)  
     * Common 0.2.7. Invoice-Attached information delete
     * <br />33.5. インボイス関連情報削除(キャンセル前インボイス)
     * 共通　0.2.7. インボイスアタッチ情報削除
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteTtInvoiceAttachedByBforCancel() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteTtInvoiceAttachedByBforCancel(NONE);
        LOG.info("ECA0027T0100: deleteTtInvoiceAttachedByBforCancel: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 33.5. Invoice pertinent information delete (front [ cancellation ] Invoice)  
     * Common 0.2.8. Invoice documents file-management-information delete
     * <br />33.5. インボイス関連情報削除(キャンセル前インボイス)
     * 共通　0.2.8. インボイス書類ファイル管理情報削除
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteLbFileManagerInvoiceByBforCancel() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteLbFileManagerInvoiceByBforCancel(NONE);
        LOG.info("ECA0027T0100: deleteLbFileManagerInvoiceByBforCancel: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 33.5. Invoice pertinent information delete (front [ cancellation ] Invoice)  
     * Common 0.2.9. Invoice-Header information delete
     * <br />33.5. インボイス関連情報削除(キャンセル前インボイス)
     * 共通　0.2.9. インボイスヘッダ情報削除
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteTtInvoiceHeaderByBforCancel() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteTtInvoiceHeaderByBforCancel(NONE);
        LOG.info("ECA0027T0100: deleteTtInvoiceHeaderByBforCancel: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 33.6. invoice information delete (front [ cancellation ] Invoice)  
     * <br />33.6. インボイス情報削除(キャンセル前インボイス)
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteTtInvoiceByBforCancel() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteTtInvoiceByBforCancel(NONE);
        LOG.info("ECA0027T0100: deleteTtInvoiceByBforCancel: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 34.1. Invoice pertinent information delete (cancellation Invoice Re-Invoice)  
     * Common 0.2.1. Shipping-Document file-management-information delete
     * <br />34.1. インボイス関連情報削除(キャンセルインボイス-リインボイス)
     * 共通　0.2.1. 船積書類ファイル管理情報削除
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteLbFileManagerByshippinActCancelReinv() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteLbFileManagerByshippinActCancelReinv(NONE);
        LOG.info("ECA0027T0100: deleteLbFileManagerByshippinActCancelReinv: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 34.1. Invoice pertinent information delete (cancellation Invoice Re-Invoice)  
     * Common 0.2.2. Shipping-Document information delete
     * <br />34.1. インボイス関連情報削除(キャンセルインボイス-リインボイス)
     * 共通　0.2.2. 船積書類情報削除
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteTtShippingDocumentByCancelReinv() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteTtShippingDocumentByCancelReinv(NONE);
        LOG.info("ECA0027T0100: deleteTtShippingDocumentByCancelReinv: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 34.1. Invoice pertinent information delete (cancellation Invoice Re-Invoice)  
     * Common 0.2.3. Packing-Attached-Item-No information delete
     * <br />34.1. インボイス関連情報削除(キャンセルインボイス-リインボイス)
     * 共通　0.2.3. パッキングアタッチ_品目番号情報削除
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteTtPackAtchItemNoByCancelReinv() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteTtPackAtchItemNoByCancelReinv(NONE);
        LOG.info("ECA0027T0100: deleteTtPackAtchItemNoByCancelReinv: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 34.1. Invoice pertinent information delete (cancellation Invoice Re-Invoice)  
     * Common 0.2.4. Packing-Attached-CML information delete
     * <br />34.1. インボイス関連情報削除(キャンセルインボイス-リインボイス)
     * 共通　0.2.4. パッキングアタッチ_CML情報削除
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteTtPackingAttachedCmlByCancelReinv() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteTtPackingAttachedCmlByCancelReinv(NONE);
        LOG.info("ECA0027T0100: deleteTtPackingAttachedCmlByCancelReinv: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 34.1. Invoice pertinent information delete (cancellation Invoice Re-Invoice)  
     * Common 0.2.5. Packing documents file-management-information delete
     * <br />34.1. インボイス関連情報削除(キャンセルインボイス-リインボイス)
     * 共通　0.2.5. パッキング書類ファイル管理情報削除
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteLbFileManagerPackingByCancelReinv() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteLbFileManagerPackingByCancelReinv(NONE);
        LOG.info("ECA0027T0100: deleteLbFileManagerPackingByCancelReinv: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 34.1. Invoice pertinent information delete (cancellation Invoice Re-Invoice)  
     * Common 0.2.6. Packing-Header information delete
     * <br />34.1. インボイス関連情報削除(キャンセルインボイス-リインボイス)
     * 共通　0.2.6. パッキングヘッダ情報削除
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteTtPackingHeadByCancelReinv() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteTtPackingHeadByCancelReinv(NONE);
        LOG.info("ECA0027T0100: deleteTtPackingHeadByCancelReinv: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 34.1. Invoice pertinent information delete (cancellation Invoice Re-Invoice)  
     * Common 0.2.7. Invoice-Attached information delete
     * <br />34.1. インボイス関連情報削除(キャンセルインボイス-リインボイス)
     * 共通　0.2.7. インボイスアタッチ情報削除
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteTtInvoiceAttachedByCancelReinv() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteTtInvoiceAttachedByCancelReinv(NONE);
        LOG.info("ECA0027T0100: deleteTtInvoiceAttachedByCancelReinv: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 34.1. Invoice pertinent information delete (cancellation Invoice Re-Invoice)  
     * Common 0.2.8. Invoice documents file-management-information delete
     * <br />34.1. インボイス関連情報削除(キャンセルインボイス-リインボイス)
     * 共通　0.2.8. インボイス書類ファイル管理情報削除
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteLbFileManagerInvoiceByCancelReinv() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteLbFileManagerInvoiceByCancelReinv(NONE);
        LOG.info("ECA0027T0100: deleteLbFileManagerInvoiceByCancelReinv: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 34.1. Invoice pertinent information delete (cancellation Invoice Re-Invoice)  
     * Common 0.2.9. Invoice-Header information delete
     * <br />34.1. インボイス関連情報削除(キャンセルインボイス-リインボイス)
     * 共通　0.2.9. インボイスヘッダ情報削除
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteTtInvoiceHeaderByCancelReinv() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteTtInvoiceHeaderByCancelReinv(NONE);
        LOG.info("ECA0027T0100: deleteTtInvoiceHeaderByCancelReinv: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 34.2. invoice information delete (cancellation Invoice Re-Invoice)  
     * <br />34.2. インボイス情報削除(キャンセルインボイス-リインボイス)
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteTtInvoiceByCancelReinv() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteTtInvoiceByCancelReinv(NONE);
        LOG.info("ECA0027T0100: deleteTtInvoiceByCancelReinv: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 34.3. Invoice pertinent information delete (cancellation Invoice FRT Invoice)  
     * Common 0.2.1. Shipping-Document file-management-information delete
     * <br />34.3. インボイス関連情報削除(キャンセルインボイス-FRTインボイス)
     * 共通　0.2.1. 船積書類ファイル管理情報削除
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteLbFileManagerByshippinActCancelFrt() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteLbFileManagerByshippinActCancelFrt(NONE);
        LOG.info("ECA0027T0100: deleteLbFileManagerByshippinActCancelFrt: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 34.3. Invoice pertinent information delete (cancellation Invoice FRT Invoice)  
     * Common 0.2.2. Shipping-Document information delete
     * <br />34.3. インボイス関連情報削除(キャンセルインボイス-FRTインボイス)
     * 共通　0.2.2. 船積書類情報削除
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteTtShippingDocumentByCancelFrt() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteTtShippingDocumentByCancelFrt(NONE);
        LOG.info("ECA0027T0100: deleteTtShippingDocumentByCancelFrt: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 34.3. Invoice pertinent information delete (cancellation Invoice FRT Invoice)  
     * Common 0.2.3. Packing-Attached-Item-No information delete
     * <br />34.3. インボイス関連情報削除(キャンセルインボイス-FRTインボイス)
     * 共通　0.2.3. パッキングアタッチ_品目番号情報削除
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteTtPackAtchItemNoByCancelFrt() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteTtPackAtchItemNoByCancelFrt(NONE);
        LOG.info("ECA0027T0100: deleteTtPackAtchItemNoByCancelFrt: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 34.3. Invoice pertinent information delete (cancellation Invoice FRT Invoice)  
     * Common 0.2.4. Packing-Attached-CML information delete
     * <br />34.3. インボイス関連情報削除(キャンセルインボイス-FRTインボイス)
     * 共通　0.2.4. パッキングアタッチ_CML情報削除
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteTtPackingAttachedCmlByCancelFrt() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteTtPackingAttachedCmlByCancelFrt(NONE);
        LOG.info("ECA0027T0100: deleteTtPackingAttachedCmlByCancelFrt: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 34.3. Invoice pertinent information delete (cancellation Invoice FRT Invoice)  
     * Common 0.2.5. Packing documents file-management-information delete
     * <br />34.3. インボイス関連情報削除(キャンセルインボイス-FRTインボイス)
     * 共通　0.2.5. パッキング書類ファイル管理情報削除
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteLbFileManagerPackingByCancelFrt() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteLbFileManagerPackingByCancelFrt(NONE);
        LOG.info("ECA0027T0100: deleteLbFileManagerPackingByCancelFrt: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 34.3. Invoice pertinent information delete (cancellation Invoice FRT Invoice)  
     * Common 0.2.6. Packing-Header information delete
     * <br />34.3. インボイス関連情報削除(キャンセルインボイス-FRTインボイス)
     * 共通　0.2.6. パッキングヘッダ情報削除
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteTtPackingHeadByCancelFrt() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteTtPackingHeadByCancelFrt(NONE);
        LOG.info("ECA0027T0100: deleteTtPackingHeadByCancelFrt: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 34.3. Invoice pertinent information delete (cancellation Invoice FRT Invoice)  
     * Common 0.2.7. Invoice-Attached information delete
     * <br />34.3. インボイス関連情報削除(キャンセルインボイス-FRTインボイス)
     * 共通　0.2.7. インボイスアタッチ情報削除
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteTtInvoiceAttachedByCancelFrt() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteTtInvoiceAttachedByCancelFrt(NONE);
        LOG.info("ECA0027T0100: deleteTtInvoiceAttachedByCancelFrt: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 34.3. Invoice pertinent information delete (cancellation Invoice FRT Invoice)  
     * Common 0.2.8. Invoice documents file-management-information delete
     * <br />34.3. インボイス関連情報削除(キャンセルインボイス-FRTインボイス)
     * 共通　0.2.8. インボイス書類ファイル管理情報削除
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteLbFileManagerInvoiceByCancelFrt() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteLbFileManagerInvoiceByCancelFrt(NONE);
        LOG.info("ECA0027T0100: deleteLbFileManagerInvoiceByCancelFrt: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 34.3. Invoice pertinent information delete (cancellation Invoice FRT Invoice)  
     * Common 0.2.9. Invoice-Header information delete
     * <br />34.3. インボイス関連情報削除(キャンセルインボイス-FRTインボイス)
     * 共通　0.2.9. インボイスヘッダ情報削除
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteTtInvoiceHeaderByCancelFrt() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteTtInvoiceHeaderByCancelFrt(NONE);
        LOG.info("ECA0027T0100: deleteTtInvoiceHeaderByCancelFrt: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 34.4. invoice information delete (cancellation Invoice FRT Invoice)  
     * <br />34.4. インボイス情報削除(キャンセルインボイス-FRTインボイス)
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteTtInvoiceByCancelFrt() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteTtInvoiceByCancelFrt(NONE);
        LOG.info("ECA0027T0100: deleteTtInvoiceByCancelFrt: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 34.4. invoice information delete (cancellation Invoice FRT Invoice)  
     * <br />34.5. インボイス関連情報削除(キャンセルインボイス)
     * 共通　0.2.1. 船積書類ファイル管理情報削除
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteLbFileManagerByshippinActCancel() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteLbFileManagerByshippinActCancel(NONE);
        LOG.info("ECA0027T0100: deleteLbFileManagerByshippinActCancel: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 34.5. Invoice pertinent information delete (cancellation Invoice)  
     * Common 0.2.2. Shipping-Document information delete
     * <br />34.5. インボイス関連情報削除(キャンセルインボイス)
     * 共通　0.2.2. 船積書類情報削除
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteTtShippingDocumentByCancel() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteTtShippingDocumentByCancel(NONE);
        LOG.info("ECA0027T0100: deleteTtShippingDocumentByCancel: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 34.5. Invoice pertinent information delete (cancellation Invoice)  
     * Common 0.2.3. Packing-Attached-Item-No information delete
     * <br />34.5. インボイス関連情報削除(キャンセルインボイス)
     * 共通　0.2.3. パッキングアタッチ_品目番号情報削除
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteTtPackAtchItemNoByCancel() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteTtPackAtchItemNoByCancel(NONE);
        LOG.info("ECA0027T0100: deleteTtPackAtchItemNoByCancel: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 34.5. Invoice pertinent information delete (cancellation Invoice)  
     * Common 0.2.4. Packing-Attached-CML information delete
     * <br />34.5. インボイス関連情報削除(キャンセルインボイス)
     * 共通　0.2.4. パッキングアタッチ_CML情報削除
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteTtPackingAttachedCmlByCancel() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteTtPackingAttachedCmlByCancel(NONE);
        LOG.info("ECA0027T0100: deleteTtPackingAttachedCmlByCancel: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 34.5. Invoice pertinent information delete (cancellation Invoice)  
     * Common 0.2.5. Packing documents file-management-information delete
     * <br />34.5. インボイス関連情報削除(キャンセルインボイス)
     * 共通　0.2.5. パッキング書類ファイル管理情報削除
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteLbFileManagerPackingByCancel() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteLbFileManagerPackingByCancel(NONE);
        LOG.info("ECA0027T0100: deleteLbFileManagerPackingByCancel: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 34.5. Invoice pertinent information delete (cancellation Invoice)  
     * Common 0.2.6. Packing-Header information delete
     * <br />34.5. インボイス関連情報削除(キャンセルインボイス)
     * 共通　0.2.6. パッキングヘッダ情報削除
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteTtPackingHeadByCancel() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteTtPackingHeadByCancel(NONE);
        LOG.info("ECA0027T0100: deleteTtPackingHeadByCancel: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 34.5. Invoice pertinent information delete (cancellation Invoice)  
     * Common 0.2.7. Invoice-Attached information delete
     * <br />34.5. インボイス関連情報削除(キャンセルインボイス)
     * 共通　0.2.7. インボイスアタッチ情報削除
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteTtInvoiceAttachedByCancel() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteTtInvoiceAttachedByCancel(NONE);
        LOG.info("ECA0027T0100: deleteTtInvoiceAttachedByCancel: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 34.5. Invoice pertinent information delete (cancellation Invoice)  
     * Common 0.2.8. Invoice documents file-management-information delete
     * <br />34.5. インボイス関連情報削除(キャンセルインボイス)
     * 共通　0.2.8. インボイス書類ファイル管理情報削除
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteLbFileManagerInvoiceByCancel() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteLbFileManagerInvoiceByCancel(NONE);
        LOG.info("ECA0027T0100: deleteLbFileManagerInvoiceByCancel: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 34.5. Invoice pertinent information delete (cancellation Invoice)  
     * Common 0.2.9. Invoice-Header information delete
     * <br />34.5. インボイス関連情報削除(キャンセルインボイス)
     * 共通　0.2.9. インボイスヘッダ情報削除
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteTtInvoiceHeaderByCancel() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteTtInvoiceHeaderByCancel(NONE);
        LOG.info("ECA0027T0100: deleteTtInvoiceHeaderByCancel: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 34.6. invoice information delete (cancellation Invoice)  
     * <br />34.6. インボイス情報削除(キャンセルインボイス)
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteTtInvoiceByCancel() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteTtInvoiceByCancel(NONE);
        LOG.info("ECA0027T0100: deleteTtInvoiceByCancel: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 35.1. Invoice pertinent information delete (manual Invoice Re-Invoice)  
     * Common 0.2.1. Shipping-Document file-management-information delete
     * <br />35.1. インボイス関連情報削除(マニュアルインボイス-リインボイス)
     * 共通　0.2.1. 船積書類ファイル管理情報削除
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteLbFileManagerByshippinActManualReinv() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteLbFileManagerByshippinActManualReinv(NONE);
        LOG.info("ECA0027T0100: deleteLbFileManagerByshippinActManualReinv: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 35.1. Invoice pertinent information delete (manual Invoice Re-Invoice)  
     * Common 0.2.2. Shipping-Document information delete
     * <br />35.1. インボイス関連情報削除(マニュアルインボイス-リインボイス)
     * 共通　0.2.2. 船積書類情報削除
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteTtShippingDocumentByManualReinv() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteTtShippingDocumentByManualReinv(NONE);
        LOG.info("ECA0027T0100: deleteTtShippingDocumentByManualReinv: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 35.1. Invoice pertinent information delete (manual Invoice Re-Invoice)  
     * Common 0.2.3. Packing-Attached-Item-No information delete
     * <br />35.1. インボイス関連情報削除(マニュアルインボイス-リインボイス)
     * 共通　0.2.3. パッキングアタッチ_品目番号情報削除
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteTtPackAtchItemNoByManualReinv() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteTtPackAtchItemNoByManualReinv(NONE);
        LOG.info("ECA0027T0100: deleteTtPackAtchItemNoByManualReinv: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 35.1. Invoice pertinent information delete (manual Invoice Re-Invoice)  
     * Common 0.2.4. Packing-Attached-CML information delete
     * <br />35.1. インボイス関連情報削除(マニュアルインボイス-リインボイス)
     * 共通　0.2.4. パッキングアタッチ_CML情報削除
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteTtPackingAttachedCmlByManualReinv() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteTtPackingAttachedCmlByManualReinv(NONE);
        LOG.info("ECA0027T0100: deleteTtPackingAttachedCmlByManualReinv: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 35.1. Invoice pertinent information delete (manual Invoice Re-Invoice)  
     * Common 0.2.5. Packing documents file-management-information delete
     * <br />35.1. インボイス関連情報削除(マニュアルインボイス-リインボイス)
     * 共通　0.2.5. パッキング書類ファイル管理情報削除
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteLbFileManagerPackingByManualReinv() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteLbFileManagerPackingByManualReinv(NONE);
        LOG.info("ECA0027T0100: deleteLbFileManagerPackingByManualReinv: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 35.1. Invoice pertinent information delete (manual Invoice Re-Invoice)  
     * Common 0.2.6. Packing-Header information delete
     * <br />35.1. インボイス関連情報削除(マニュアルインボイス-リインボイス)
     * 共通　0.2.6. パッキングヘッダ情報削除
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteTtPackingHeadByManualReinv() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteTtPackingHeadByManualReinv(NONE);
        LOG.info("ECA0027T0100: deleteTtPackingHeadByManualReinv: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 35.1. Invoice pertinent information delete (manual Invoice Re-Invoice)  
     * Common 0.2.7. Invoice-Attached information delete
     * <br />35.1. インボイス関連情報削除(マニュアルインボイス-リインボイス)
     * 共通　0.2.7. インボイスアタッチ情報削除
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteTtInvoiceAttachedByManualReinv() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteTtInvoiceAttachedByManualReinv(NONE);
        LOG.info("ECA0027T0100: deleteTtInvoiceAttachedByManualReinv: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 35.1. Invoice pertinent information delete (manual Invoice Re-Invoice)  
     * Common 0.2.8. Invoice documents file-management-information delete
     * <br />35.1. インボイス関連情報削除(マニュアルインボイス-リインボイス)
     * 共通　0.2.8. インボイス書類ファイル管理情報削除
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteLbFileManagerInvoiceByManualReinv() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteLbFileManagerInvoiceByManualReinv(NONE);
        LOG.info("ECA0027T0100: deleteLbFileManagerInvoiceByManualReinv: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 35.1. Invoice pertinent information delete (manual Invoice Re-Invoice)  
     * Common 0.2.9. Invoice-Header information delete
     * <br />35.1. インボイス関連情報削除(マニュアルインボイス-リインボイス)
     * 共通　0.2.9. インボイスヘッダ情報削除
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteTtInvoiceHeaderByManualReinv() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteTtInvoiceHeaderByManualReinv(NONE);
        LOG.info("ECA0027T0100: deleteTtInvoiceHeaderByManualReinv: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 35.2. invoice information delete (manual Invoice Re-Invoice)  
     * <br />35.2. インボイス情報削除(マニュアルインボイス-リインボイス)
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteTtInvoiceByManualReinv() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteTtInvoiceByManualReinv(NONE);
        LOG.info("ECA0027T0100: deleteTtInvoiceByManualReinv: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 35.3. Invoice pertinent information delete (manual Invoice FRT Invoice)  
     *         Common 0.2.1. Shipping-Document file-management-information delete
     * <br />35.3. インボイス関連情報削除(マニュアルインボイス-FRTインボイス)
     *       共通　0.2.1. 船積書類ファイル管理情報削除
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteLbFileManagerByshippinActManualFrt() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteLbFileManagerByshippinActManualFrt(NONE);
        LOG.info("ECA0027T0100: deleteLbFileManagerByshippinActManualFrt: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 35.3. Invoice pertinent information delete (manual Invoice FRT Invoice)  
     *         Common 0.2.2. Shipping-Document information delete
     * <br />35.3. インボイス関連情報削除(マニュアルインボイス-FRTインボイス)
     *       共通　0.2.2. 船積書類情報削除
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteTtShippingDocumentByManualFrt() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteTtShippingDocumentByManualFrt(NONE);
        LOG.info("ECA0027T0100: deleteTtShippingDocumentByManualFrt: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 35.3. Invoice pertinent information delete (manual Invoice FRT Invoice)  
     *         Common 0.2.3. Packing-Attached-Item-No information delete
     * <br />35.3. インボイス関連情報削除(マニュアルインボイス-FRTインボイス)
     *       共通　0.2.3. パッキングアタッチ_品目番号情報削除
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteTtPackAtchItemNoByManualFrt() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteTtPackAtchItemNoByManualFrt(NONE);
        LOG.info("ECA0027T0100: deleteTtPackAtchItemNoByManualFrt: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 35.3. Invoice pertinent information delete (manual Invoice FRT Invoice)  
     *         Common 0.2.4. Packing-Attached-CML information delete
     * <br />35.3. インボイス関連情報削除(マニュアルインボイス-FRTインボイス)
     *       共通　0.2.4. パッキングアタッチ_CML情報削除
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteTtPackingAttachedCmlByManualFrt() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteTtPackingAttachedCmlByManualFrt(NONE);
        LOG.info("ECA0027T0100: deleteTtPackingAttachedCmlByManualFrt: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 35.3. Invoice pertinent information delete (manual Invoice FRT Invoice)  
     *         Common 0.2.5. Packing documents file-management-information delete
     * <br />35.3. インボイス関連情報削除(マニュアルインボイス-FRTインボイス)
     *       共通　0.2.5. パッキング書類ファイル管理情報削除
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteLbFileManagerPackingByManualFrt() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteLbFileManagerPackingByManualFrt(NONE);
        LOG.info("ECA0027T0100: deleteLbFileManagerPackingByManualFrt: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 35.3. Invoice pertinent information delete (manual Invoice FRT Invoice)  
     *         Common 0.2.6. Packing-Header information delete
     * <br />35.3. インボイス関連情報削除(マニュアルインボイス-FRTインボイス)
     *       共通　0.2.6. パッキングヘッダ情報削除
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteTtPackingHeadByManualFrt() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteTtPackingHeadByManualFrt(NONE);
        LOG.info("ECA0027T0100: deleteTtPackingHeadByManualFrt: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 35.3. Invoice pertinent information delete (manual Invoice FRT Invoice)  
     *         Common 0.2.7. Invoice-Attached information delete
     * <br />35.3. インボイス関連情報削除(マニュアルインボイス-FRTインボイス)
     *       共通　0.2.7. インボイスアタッチ情報削除
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteTtInvoiceAttachedByManualFrt() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteTtInvoiceAttachedByManualFrt(NONE);
        LOG.info("ECA0027T0100: deleteTtInvoiceAttachedByManualFrt: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 35.3. Invoice pertinent information delete (manual Invoice FRT Invoice)  
     *         Common 0.2.8. Invoice documents file-management-information delete
     * <br />35.3. インボイス関連情報削除(マニュアルインボイス-FRTインボイス)
     *       共通　0.2.8. インボイス書類ファイル管理情報削除
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteLbFileManagerInvoiceByManualFrt() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteLbFileManagerInvoiceByManualFrt(NONE);
        LOG.info("ECA0027T0100: deleteLbFileManagerInvoiceByManualFrt: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 35.3. Invoice pertinent information delete (manual Invoice FRT Invoice)  
     *         Common 0.2.9. Invoice-Header information delete
     * <br />35.3. インボイス関連情報削除(マニュアルインボイス-FRTインボイス)
     *       共通　0.2.9. インボイスヘッダ情報削除
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteTtInvoiceHeaderByManualFrt() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteTtInvoiceHeaderByManualFrt(NONE);
        LOG.info("ECA0027T0100: deleteTtInvoiceHeaderByManualFrt: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 35.4. invoice information delete (manual Invoice FRT Invoice)  
     * <br />35.4. インボイス情報削除(マニュアルインボイス-FRTインボイス)
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteTtInvoiceByManualFrt() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteTtInvoiceByManualFrt(NONE);
        LOG.info("ECA0027T0100: deleteTtInvoiceByManualFrt: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 35.5. Invoice pertinent information delete (manual Invoice)  
     *         Common 0.2.1. Shipping-Document file-management-information delete
     * <br />35.5. インボイス関連情報削除(マニュアルインボイス)
     *       共通　0.2.1. 船積書類ファイル管理情報削除
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteLbFileManagerByshippinActManual() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteLbFileManagerByshippinActManual(NONE);
        LOG.info("ECA0027T0100: deleteLbFileManagerByshippinActManual: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 35.5. Invoice pertinent information delete (manual Invoice)  
     *         Common 0.2.2. Shipping-Document information delete
     * <br />35.5. インボイス関連情報削除(マニュアルインボイス)
     *       共通　0.2.2. 船積書類情報削除
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteTtShippingDocumentByManual() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteTtShippingDocumentByManual(NONE);
        LOG.info("ECA0027T0100: deleteTtShippingDocumentByManual: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 35.5. Invoice pertinent information delete (manual Invoice)  
     *         Common 0.2.3. Packing-Attached-Item-No information delete
     * <br />35.5. インボイス関連情報削除(マニュアルインボイス)
     *       共通　0.2.3. パッキングアタッチ_品目番号情報削除
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteTtPackAtchItemNoByManual() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteTtPackAtchItemNoByManual(NONE);
        LOG.info("ECA0027T0100: deleteTtPackAtchItemNoByManual: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 35.5. Invoice pertinent information delete (manual Invoice)  
     *         Common 0.2.4. Packing-Attached-CML information delete
     * <br />35.5. インボイス関連情報削除(マニュアルインボイス)
     *       共通　0.2.4. パッキングアタッチ_CML情報削除
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteTtPackingAttachedCmlByManual() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteTtPackingAttachedCmlByManual(NONE);
        LOG.info("ECA0027T0100: deleteTtPackingAttachedCmlByManual: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 35.5. Invoice pertinent information delete (manual Invoice)  
     *         Common 0.2.5. Packing documents file-management-information delete
     * <br />35.5. インボイス関連情報削除(マニュアルインボイス)
     *       共通　0.2.5. パッキング書類ファイル管理情報削除
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteLbFileManagerPackingByManual() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteLbFileManagerPackingByManual(NONE);
        LOG.info("ECA0027T0100: deleteLbFileManagerPackingByManual: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 35.5. Invoice pertinent information delete (manual Invoice)  
     *         Common 0.2.6. Packing-Header information delete
     * <br />35.5. インボイス関連情報削除(マニュアルインボイス)
     *       共通　0.2.6. パッキングヘッダ情報削除
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteTtPackingHeadByManual() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteTtPackingHeadByManual(NONE);
        LOG.info("ECA0027T0100: deleteTtPackingHeadByManual: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 35.5. Invoice pertinent information delete (manual Invoice)  
     *         Common 0.2.7. Invoice-Attached information delete
     * <br />35.5. インボイス関連情報削除(マニュアルインボイス)
     *       共通　0.2.7. インボイスアタッチ情報削除
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteTtInvoiceAttachedByManual() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteTtInvoiceAttachedByManual(NONE);
        LOG.info("ECA0027T0100: deleteTtInvoiceAttachedByManual: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 35.5. Invoice pertinent information delete (manual Invoice)  
     *         Common 0.2.8. Invoice documents file-management-information delete
     * <br />35.5. インボイス関連情報削除(マニュアルインボイス)
     *       共通　0.2.8. インボイス書類ファイル管理情報削除
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteLbFileManagerInvoiceByManual() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteLbFileManagerInvoiceByManual(NONE);
        LOG.info("ECA0027T0100: deleteLbFileManagerInvoiceByManual: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 35.5. Invoice pertinent information delete (manual Invoice)  
     *         Common 0.2.9. Invoice-Header information delete
     * <br />35.5. インボイス関連情報削除(マニュアルインボイス)
     *       共通　0.2.9. インボイスヘッダ情報削除
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteTtInvoiceHeaderByManual() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteTtInvoiceHeaderByManual(NONE);
        LOG.info("ECA0027T0100: deleteTtInvoiceHeaderByManual: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     /**
     * 35.6. invoice information delete (manual Invoice)  
     * <br />35.6. インボイス情報削除(マニュアルインボイス)
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteTtInvoiceByManual() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteTtInvoiceByManual(NONE);
        LOG.info("ECA0027T0100: deleteTtInvoiceByManual: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 37. A delete of CML-Error-Report-Detail information
     * <br />37. CMLエラーレポート明細情報の削除
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteTtCmlErrorDtl() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteTtCmlErrorDtl(NONE);
        LOG.info("ECA0027T0100: deleteTtCmlErrorDtl: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 38. A delete of CML-Error-Report-Header information
     * <br />38. CMLエラーレポートヘッダ情報の削除
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteTtCmlErrorHeader() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteTtCmlErrorHeader(NONE);
        LOG.info("ECA0027T0100: deleteTtCmlErrorHeader: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 39.1 Delete of a BHT-Work-Time-For-Palletize information
     * <br />39.1 BHT作業情報テーブル(パレタイズ)情報の削除
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteTtBhtWorkPltz() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteTtBhtWorkPltz(NONE);
        LOG.info("ECA0027T0100: deleteTtBhtWorkPltz: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 39.2 Delete of a BHT-Work-Time-For-Mix-Tag information
     * <br />39.2 BHT作業情報テーブル(小箱内多品)情報の削除
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteTtBhtWorkMixTag() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteTtBhtWorkMixTag(NONE);
        LOG.info("ECA0027T0100: deleteTtBhtWorkMixTag: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 39.3 Delete of a BHT-Work-Error information
     * <br />39.3 BHT作業エラー情報の削除
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteTtBhtWorkErr() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteTtBhtWorkErr(NONE);
        LOG.info("ECA0027T0100: deleteTtBhtWorkErr: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 39.4 Delete of a BHT-Work-Time information
     * <br />39.4 BHT作業時間情報の削除
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteTtBhtWorkTime() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteTtBhtWorkTime(NONE);
        LOG.info("ECA0027T0100: deleteTtBhtWorkTime: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 41. Packing specification effective REVISION hysteresis information delete
     * <br />41. 包装仕様有効リビジョン履歴情報削除
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteTmPkgSpecRev() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteTmPkgSpecRev(NONE);
        LOG.info("ECA0027T0100: deleteTmPkgSpecRev: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 42. Delete of unnecessary work data
     *       1. Shipping-Actuality-Invoice-Work T
     * <br />42. 不要ワークデータの削除
     *     1. 船積実績対象インボイスワークT
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteTwShippingActInvoice() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteTwShippingActInvoice(NONE);
        LOG.info("ECA0027T0100: deleteTwShippingActInvoice: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 42. Delete of unnecessary work data
     *       2. Palletize work T for an Invoice
     * <br />42. 不要ワークデータの削除
     *     2. インボイス対象パレタイズワークT
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteTwInvPltz() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteTwInvPltz(NONE);
        LOG.info("ECA0027T0100: deleteTwInvPltz: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 42. Delete of unnecessary work data
     *       3. Invoice Group Work T
     * <br />42. 不要ワークデータの削除
     *     3. インボイスグループワークT
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteTwInv() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteTwInv(NONE);
        LOG.info("ECA0027T0100: deleteTwInv: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 42. Delete of unnecessary work data
     *       4. Invoice Work T
     * <br />42. 不要ワークデータの削除
     *     4. インボイスワークT
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteTwInvoice() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteTwInvoice(NONE);
        LOG.info("ECA0027T0100: deleteTwInvoice: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 42. Delete of unnecessary work data
     *       5. Invoice-Item-No-Work T
     * <br />42. 不要ワークデータの削除
     *     5. インボイス作成対象品目番号ワークT
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteTwInvItem() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteTwInvItem(NONE);
        LOG.info("ECA0027T0100: deleteTwInvItem: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 42. Delete of unnecessary work data
     *       6. Staging-Actuality-Work T
     * <br />42. 不要ワークデータの削除
     *     6. 山作り実績ワークT
     *
     * @return 削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteTwStgAct() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteTwStgAct(NONE);
        LOG.info("ECA0027T0100: deleteTwStgAct: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 42. Delete of unnecessary work data
     *       7. Staging-Inst-Work T
     * <br />42. 不要ワークデータの削除
     *     7. 荷揃え指示ワークT
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteTwStgInstr() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteTwStgInstr(NONE);
        LOG.info("ECA0027T0100: deleteTwStgInstr: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 42. Delete of unnecessary work data
     *       8. X-Palletize-Work T
     * <br />42. 不要ワークデータの削除
     *     8. まとめパレタイズワークT
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteTwXpltz() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteTwXpltz(NONE);
        LOG.info("ECA0027T0100: deleteTwXpltz: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 42. Delete of unnecessary work data
     *       9. Palletize-Instruction-Item-No-Work T
     * <br />42. 不要ワークデータの削除
     *     9. 梱包指示品目番号ワークT
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteTwPltzInstrItemNo() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteTwPltzInstrItemNo(NONE);
        LOG.info("ECA0027T0100: deleteTwPltzInstrItemNo: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 42. Delete of unnecessary work data
     *       10. Palletize-Item-Work T
     * <br />42. 不要ワークデータの削除
     *     10. パレタイズ対象品ワークT
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteTwPltzItemItemNo() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteTwPltzItemItemNo(NONE);
        LOG.info("ECA0027T0100: deleteTwPltzItemItemNo: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 42. Delete of unnecessary work data
     *       11. Palletize-Item-Package-Work T
     * <br />42. 不要ワークデータの削除
     *     11. パレタイズ対象品PKGワークT
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteTwPltzItemPkg() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteTwPltzItemPkg(NONE);
        LOG.info("ECA0027T0100: deleteTwPltzItemPkg: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 42. Delete of unnecessary work data
     *       12. Mix-Tag-RT-WorkT
     * <br />42. 不要ワークデータの削除
     *     12. MIXED用RT材ワークT
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteTwMixtagRt() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteTwMixtagRt(NONE);
        LOG.info("ECA0027T0100: deleteTwMixtagRt: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 42. Delete of unnecessary work data
     *       13. Mix-Tag-WorkT
     * <br />42. 不要ワークデータの削除
     *     13. MIXED品目番号ワークT
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteTwMixtag() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteTwMixtag(NONE);
        LOG.info("ECA0027T0100: deleteTwMixtag: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }


    /**
     * 42. Delete of unnecessary work data
     *       14. Batch Request Parameter T
     * <br />42. 不要ワークデータの削除
     *     14. バッチリクエストパラメータT
     *
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteTtBatchReqParam() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteTtBatchReqParam(NONE);
        LOG.info("ECA0027T0100: deleteTtBatchReqParam: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }

    // NL015 ADD START
    /**
     * Delete TT_SC_ATTACHED by main invoice approach from TT_SHIPPING_ACT.
     * 
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteTtScAttachedByMain() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteTtScAttachedByMain(NONE);
        LOG.info("ECA0027T0100: deleteTtScAttachedByMain: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }

    /**
     * Delete LB_FILE_MANAGER approach from TT_SHIPPING_ACT.
     * 
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteLbFileManagerScByMain() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteLbFileManagerScByMain(NONE);
        LOG.info("ECA0027T0100: deleteLbFileManagerScByMain: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }

    /**
     * Delete TT_SC_HEADER approach from TT_SHIPPING_ACT.
     * 
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteTtScHeaderByMain() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteTtScHeaderByMain(NONE);
        LOG.info("ECA0027T0100: deleteTtScHeaderByMain: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }

    /**
     * Delete TT_SC_ATTACHED approach from cancel invoice.
     * 
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteTtScAttachedByBeforeCancel() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteTtScAttachedByBeforeCancel(NONE);
        LOG.info("ECA0027T0100: deleteTtScAttachedByBeforeCancel: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }

    /**
     * Delete LB_FILE_MANAGER approach from cancel invoice.
     * 
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteLbFileManagerScByBeforeCancel() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteLbFileManagerScByBeforeCancel(NONE);
        LOG.info("ECA0027T0100: deleteLbFileManagerScByBeforeCancel: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }

    /**
     * Delete TT_SC_HEADER approach from cancel invoice.
     * 
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteTtScHeaderByBeforeCancel() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteTtScHeaderByBeforeCancel(NONE);
        LOG.info("ECA0027T0100: deleteTtScHeaderByBeforeCancel: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }

    /**
     * Delete LB_FILE_MANAGER used by Order Upload.
     * 
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteLbFileManagerByOdrUpload() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteLbFileManagerByOdrUpload(NONE);
        LOG.info("ECA0027T0100: deleteLbFileManagerByOdrUpload: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }

    /**
     * Delete TT_ODR_UPLOAD_REQ_MGT.
     * 
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteTtOdrUploadReqMgt() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteTtOdrUploadReqMgt(NONE);
        LOG.info("ECA0027T0100: deleteTtOdrUploadReqMgt: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }

    /**
     * Delete TT_ONLINE_REQ_JOB_PARAM.
     * 
     * @return Delete number<br />削除件数
     * @throws ApplicationException This is an application exception of an application base.<br />アプリ基盤のアプリケーション例外です。
     */
    protected int deleteTtOnlineReqJobParam() throws ApplicationException {
        int deletedCount = comnAuxDao.deleteTtOnlineReqJobParam(NONE);
        LOG.info("ECA0027T0100: deleteTtOnlineReqJobParam: " + Integer.toString(deletedCount) + " record(s) deleted");
        return deletedCount;
    }
   // NL015 ADD END
}
