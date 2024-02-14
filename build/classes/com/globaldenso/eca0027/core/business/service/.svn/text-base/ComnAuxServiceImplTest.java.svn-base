package com.globaldenso.eca0027.core.business.service;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionStatus;

import com.globaldenso.ai.common.core.exception.ApplicationException;

/**
 * Type in the functional overview of the class.
 *
 * @author $Author: masaki_awata@dnitsol.com $
 * @version $Revision: 9999 $
 */

public class ComnAuxServiceImplTest {

    /** ApplicationContext */
    private static ClassPathXmlApplicationContext applicationContext;

    /** トランザクションマネージャー */
    private PlatformTransactionManager txManager;

    /** トランザクションステータス */
    private TransactionStatus tx;

    /** サービス実装クラス */
    private ComnAuxServiceImpl comnAuxService;

    /**
     * デフォルトコンストラクタ
     */
    public ComnAuxServiceImplTest() {
    }

    /**
     * 準備
     */
    @BeforeClass
    public static void setUpClass() {
        applicationContext =
            new ClassPathXmlApplicationContext(
                    "ComnAuxServiceImplTest-context.xml", ComnAuxServiceImplTest.class);
    }

    /**
     * 準備
     */
    @Before
    public void setUp() {
        comnAuxService = (ComnAuxServiceImpl) applicationContext.getBean("comnAuxService");

        txManager = (PlatformTransactionManager) applicationContext.getBean("transactionManager");
        tx = txManager.getTransaction(null);
        tx.setRollbackOnly();
    }

    /**
     * 後始末
     */
    @AfterClass
    public static void tearDownClass() {
        if (applicationContext != null) {
            applicationContext.destroy();
        }
    }

    /**
     * {@link ComnAuxServiceImpl#transactOnComnAux()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testTransactOnComnAux() throws ApplicationException {
        comnAuxService.transactOnComnAux(); // 実行できることを確認するのみ
        txManager.rollback(tx);             // 後続のテストでデータを再利用するため
                                            // 削除したデータをロールバック
    }

    /**
     * {@link ComnAuxServiceImpl#deleteLogicalDeletedTtScAttached()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteLogicalDeletedTtScAttached() throws ApplicationException {
        assertThat(comnAuxService.deleteLogicalDeletedTtScAttached(), is(1));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteLogicalDeletedTtScHeader()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteLogicalDeletedTtScHeader() throws ApplicationException {
        assertThat(comnAuxService.deleteLogicalDeletedTtScHeader(), is(2));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteLogicalDeletedTtPackAtchItemNo()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteLogicalDeletedTtPackAtchItemNo() throws ApplicationException {
        assertThat(comnAuxService.deleteLogicalDeletedTtPackAtchItemNo(), is(3));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteLogicalDeletedTtPackingAttachedCml()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteLogicalDeletedTtPackingAttachedCml() throws ApplicationException {
        assertThat(comnAuxService.deleteLogicalDeletedTtPackingAttachedCml(), is(4));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteLogicalDeletedTtPackingHead()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteLogicalDeletedTtPackingHead() throws ApplicationException {
        assertThat(comnAuxService.deleteLogicalDeletedTtPackingHead(), is(5));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteLogicalDeletedTtInvoiceAttached()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteLogicalDeletedTtInvoiceAttached() throws ApplicationException {
        assertThat(comnAuxService.deleteLogicalDeletedTtInvoiceAttached(), is(6));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteLogicalDeletedTtInvoiceHeader()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteLogicalDeletedTtInvoiceHeader() throws ApplicationException {
        assertThat(comnAuxService.deleteLogicalDeletedTtInvoiceHeader(), is(7));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteLogicalDeletedTtShippingDocument()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteLogicalDeletedTtShippingDocument() throws ApplicationException {
        assertThat(comnAuxService.deleteLogicalDeletedTtShippingDocument(), is(8));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteLogicalDeletedTtInvoice()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteLogicalDeletedTtInvoice() throws ApplicationException {
        assertThat(comnAuxService.deleteLogicalDeletedTtInvoice(), is(9));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteLogicalDeletedTtShippingActOdr()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteLogicalDeletedTtShippingActOdr() throws ApplicationException {
        assertThat(comnAuxService.deleteLogicalDeletedTtShippingActOdr(), is(10));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteLogicalDeletedTtShippingAct()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteLogicalDeletedTtShippingAct() throws ApplicationException {
        assertThat(comnAuxService.deleteLogicalDeletedTtShippingAct(), is(6));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteLogicalDeletedTwShippingActInvoice()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteLogicalDeletedTwShippingActInvoice() throws ApplicationException {
        assertThat(comnAuxService.deleteLogicalDeletedTwShippingActInvoice(), is(12));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteTtMixKanban()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteTtMixKanban() throws ApplicationException {
        assertThat(comnAuxService.deleteTtMixKanban(), is(1));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteTtMixtagItemNo()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteTtMixtagItemNo() throws ApplicationException {
        assertThat(comnAuxService.deleteTtMixtagItemNo(), is(2));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteTtMixtagRt()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteTtMixtagRt() throws ApplicationException {
        assertThat(comnAuxService.deleteTtMixtagRt(), is(3));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteTtPltzInstrOdr()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteTtPltzInstrOdr() throws ApplicationException {
        assertThat(comnAuxService.deleteTtPltzInstrOdr(), is(3));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteTtPltzInstrItemNo()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteTtPltzInstrItemNo() throws ApplicationException {
        assertThat(comnAuxService.deleteTtPltzInstrItemNo(), is(3));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteTtPltzItemOdr()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteTtPltzItemOdr() throws ApplicationException {
        assertThat(comnAuxService.deleteTtPltzItemOdr(), is(29));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteTtPltzKanban()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteTtPltzKanban() throws ApplicationException {
        assertThat(comnAuxService.deleteTtPltzKanban(), is(29));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteTtPltzItemAndTtMixtagAndTtPltzInstr()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteTtPltzItemAndTtMixtagAndTtPltzInstr() throws ApplicationException {
        int[] deletedCount = comnAuxService.deleteTtPltzItemAndTtMixtagAndTtPltzInstr();
        assertThat(deletedCount.length, is(3));
        assertThat(deletedCount[0], is(29));
        assertThat(deletedCount[1], is(2));
        assertThat(deletedCount[2], is(3));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteTtShippingFirm()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteTtShippingFirm() throws ApplicationException {
        assertThat(comnAuxService.deleteTtShippingFirm(), is(3));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteTtPltzAndTtXpltzAndTtStgInstrAndTtStgAct()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteTtPltzAndTtXpltzAndTtStgInstrAndTtStgAct() throws ApplicationException {
        int[] deletedCount = comnAuxService.deleteTtPltzAndTtXpltzAndTtStgInstrAndTtStgAct();
        assertThat(deletedCount.length, is(4));
        assertThat(deletedCount[0], is(29));
        assertThat(deletedCount[1], is(29));
        assertThat(deletedCount[2], is(29));
        assertThat(deletedCount[3], is(1));
    }


    //  ----------------------------------------------------------------------------------


    /**
     * {@link ComnAuxServiceImpl#deleteLbFileManagerByshippinActMainReinv()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteLbFileManagerByshippinActMainReinv() throws ApplicationException {
        assertThat(comnAuxService.deleteLbFileManagerByshippinActMainReinv(), is(10));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteTtShippingDocumentByMainReinv()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteTtShippingDocumentByMainReinv() throws ApplicationException {
        assertThat(comnAuxService.deleteTtShippingDocumentByMainReinv(), is(10));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteTtPackAtchItemNoByMainReinv()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteTtPackAtchItemNoByMainReinv() throws ApplicationException {
        assertThat(comnAuxService.deleteTtPackAtchItemNoByMainReinv(), is(10));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteTtPackingAttachedCmlByMainReinv()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteTtPackingAttachedCmlByMainReinv() throws ApplicationException {
        assertThat(comnAuxService.deleteTtPackingAttachedCmlByMainReinv(), is(10));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteLbFileManagerPackingByMainReinv()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteLbFileManagerPackingByMainReinv() throws ApplicationException {
        assertThat(comnAuxService.deleteLbFileManagerPackingByMainReinv(), is(10));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteTtPackingHeadByMainReinv()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteTtPackingHeadByMainReinv() throws ApplicationException {
        assertThat(comnAuxService.deleteTtPackingHeadByMainReinv(), is(10));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteTtInvoiceAttachedByMainReinv()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteTtInvoiceAttachedByMainReinv() throws ApplicationException {
        assertThat(comnAuxService.deleteTtInvoiceAttachedByMainReinv(), is(10));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteLbFileManagerInvoiceByMainReinv()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteLbFileManagerInvoiceByMainReinv() throws ApplicationException {
        assertThat(comnAuxService.deleteLbFileManagerInvoiceByMainReinv(), is(10));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteTtInvoiceHeaderByMainReinv()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteTtInvoiceHeaderByMainReinv() throws ApplicationException {
        assertThat(comnAuxService.deleteTtInvoiceHeaderByMainReinv(), is(10));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteTtInvoiceReInvoiceByMainReinv()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteTtInvoiceReInvoiceByMainReinv() throws ApplicationException {
        assertThat(comnAuxService.deleteTtInvoiceReInvoiceByMainReinv(), is(10));
    }


    //  ----------------------------------------------------------------------------------


    /**
     * {@link ComnAuxServiceImpl#deleteLbFileManagerByshippinActMainFrt()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteLbFileManagerByshippinActMainFrt() throws ApplicationException {
        assertThat(comnAuxService.deleteLbFileManagerByshippinActMainFrt(), is(10));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteTtShippingDocumentByMainFrt()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteTtShippingDocumentByMainFrt() throws ApplicationException {
        assertThat(comnAuxService.deleteTtShippingDocumentByMainFrt(), is(10));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteTtPackAtchItemNoByMainFrt()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteTtPackAtchItemNoByMainFrt() throws ApplicationException {
        assertThat(comnAuxService.deleteTtPackAtchItemNoByMainFrt(), is(10));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteTtPackingAttachedCmlByMainFrt()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteTtPackingAttachedCmlByMainFrt() throws ApplicationException {
        assertThat(comnAuxService.deleteTtPackingAttachedCmlByMainFrt(), is(10));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteLbFileManagerPackingByMainFrt()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteLbFileManagerPackingByMainFrt() throws ApplicationException {
        assertThat(comnAuxService.deleteLbFileManagerPackingByMainFrt(), is(10));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteTtPackingHeadByMainFrt()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteTtPackingHeadByMainFrt() throws ApplicationException {
        assertThat(comnAuxService.deleteTtPackingHeadByMainFrt(), is(10));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteTtInvoiceAttachedByMainFrt()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteTtInvoiceAttachedByMainFrt() throws ApplicationException {
        assertThat(comnAuxService.deleteTtInvoiceAttachedByMainFrt(), is(10));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteLbFileManagerInvoiceByMainFrt()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteLbFileManagerInvoiceByMainFrt() throws ApplicationException {
        assertThat(comnAuxService.deleteLbFileManagerInvoiceByMainFrt(), is(10));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteTtInvoiceHeaderByMainFrt()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteTtInvoiceHeaderByMainFrt() throws ApplicationException {
        assertThat(comnAuxService.deleteTtInvoiceHeaderByMainFrt(), is(10));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteTtInvoiceByMainFrt()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteTtInvoiceByMainFrt() throws ApplicationException {
        assertThat(comnAuxService.deleteTtInvoiceByMainFrt(), is(11));
    }


    //  ----------------------------------------------------------------------------------


    /**
     * {@link ComnAuxServiceImpl#deleteLbFileManagerByshippinActMain()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteLbFileManagerByshippinActMain() throws ApplicationException {
        assertThat(comnAuxService.deleteLbFileManagerByshippinActMain(), is(29));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteTtShippingDocumentByMain()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteTtShippingDocumentByMain() throws ApplicationException {
        assertThat(comnAuxService.deleteTtShippingDocumentByMain(), is(29));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteTtPackAtchItemNoByMain()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteTtPackAtchItemNoByMain() throws ApplicationException {
        assertThat(comnAuxService.deleteTtPackAtchItemNoByMain(), is(29));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteTtPackingAttachedCmlByMain()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteTtPackingAttachedCmlByMain() throws ApplicationException {
        assertThat(comnAuxService.deleteTtPackingAttachedCmlByMain(), is(29));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteLbFileManagerPackingByMain()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteLbFileManagerPackingByMain() throws ApplicationException {
        assertThat(comnAuxService.deleteLbFileManagerPackingByMain(), is(29));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteTtPackingHeadByMain()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteTtPackingHeadByMain() throws ApplicationException {
        assertThat(comnAuxService.deleteTtPackingHeadByMain(), is(29));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteTtInvoiceAttachedByMain()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteTtInvoiceAttachedByMain() throws ApplicationException {
        assertThat(comnAuxService.deleteTtInvoiceAttachedByMain(), is(29));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteLbFileManagerInvoiceByMain()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteLbFileManagerInvoiceByMain() throws ApplicationException {
        assertThat(comnAuxService.deleteLbFileManagerInvoiceByMain(), is(29));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteTtInvoiceHeaderByMain()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteTtInvoiceHeaderByMain() throws ApplicationException {
        assertThat(comnAuxService.deleteTtInvoiceHeaderByMain(), is(29));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteTtInvoiceByMain()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteTtInvoiceByMain() throws ApplicationException {
        assertThat(comnAuxService.deleteTtInvoiceByMain(), is(30));
    }


    //  ----------------------------------------------------------------------------------


    /**
     * {@link ComnAuxServiceImpl#deleteTtShippingActOdr()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteTtShippingActOdr() throws ApplicationException {
        assertThat(comnAuxService.deleteTtShippingActOdr(), is(7));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteLbFileManagerByBlClp()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteLbFileManagerByBlClp() throws ApplicationException {
        assertThat(comnAuxService.deleteLbFileManagerByBlClp(), is(13));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteTtShippingAct()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteTtShippingAct() throws ApplicationException {
        assertThat(comnAuxService.deleteTtShippingAct(), is(33));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteTtExpRcvOdrByShiped()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteTtExpRcvOdrByShiped() throws ApplicationException {
        assertThat(comnAuxService.deleteTtExpRcvOdrByShiped(), is(1));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteTtExpRcvOdrByPrivateNotification()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteTtExpRcvOdrByPrivateNotification() throws ApplicationException {
        assertThat(comnAuxService.deleteTtExpRcvOdrByPrivateNotification(), is(7));
    }


    //  ----------------------------------------------------------------------------------


    /**
     * {@link ComnAuxServiceImpl#deleteLbFileManagerByshippinActBforCancelReinv()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteLbFileManagerByshippinActBforCancelReinv() throws ApplicationException {
        assertThat(comnAuxService.deleteLbFileManagerByshippinActBforCancelReinv(), is(10));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteTtShippingDocumentByBforCancelReinv()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteTtShippingDocumentByBforCancelReinv() throws ApplicationException {
        assertThat(comnAuxService.deleteTtShippingDocumentByBforCancelReinv(), is(10));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteTtPackAtchItemNoByBforCancelReinv()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteTtPackAtchItemNoByBforCancelReinv() throws ApplicationException {
        assertThat(comnAuxService.deleteTtPackAtchItemNoByBforCancelReinv(), is(10));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteTtPackingAttachedCmlByBforCancelReinv()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteTtPackingAttachedCmlByBforCancelReinv() throws ApplicationException {
        assertThat(comnAuxService.deleteTtPackingAttachedCmlByBforCancelReinv(), is(10));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteLbFileManagerPackingByBforCancelReinv()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteLbFileManagerPackingByBforCancelReinv() throws ApplicationException {
        assertThat(comnAuxService.deleteLbFileManagerPackingByBforCancelReinv(), is(10));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteTtPackingHeadByBforCancelReinv()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteTtPackingHeadByBforCancelReinv() throws ApplicationException {
        assertThat(comnAuxService.deleteTtPackingHeadByBforCancelReinv(), is(10));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteTtInvoiceAttachedByBforCancelReinv()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteTtInvoiceAttachedByBforCancelReinv() throws ApplicationException {
        assertThat(comnAuxService.deleteTtInvoiceAttachedByBforCancelReinv(), is(10));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteLbFileManagerInvoiceByBforCancelReinv()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteLbFileManagerInvoiceByBforCancelReinv() throws ApplicationException {
        assertThat(comnAuxService.deleteLbFileManagerInvoiceByBforCancelReinv(), is(10));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteTtInvoiceHeaderByBforCancelReinv()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteTtInvoiceHeaderByBforCancelReinv() throws ApplicationException {
        assertThat(comnAuxService.deleteTtInvoiceHeaderByBforCancelReinv(), is(10));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteTtInvoiceByBforCancelReinv()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteTtInvoiceByBforCancelReinv() throws ApplicationException {
        assertThat(comnAuxService.deleteTtInvoiceByBforCancelReinv(), is(13));
    }


    //  ----------------------------------------------------------------------------------


    /**
     * {@link ComnAuxServiceImpl#deleteLbFileManagerByshippinActBforCancelFrt()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteLbFileManagerByshippinActBforCancelFrt() throws ApplicationException {
        assertThat(comnAuxService.deleteLbFileManagerByshippinActBforCancelFrt(), is(10));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteTtShippingDocumentByBforCancelFrt()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteTtShippingDocumentByBforCancelFrt() throws ApplicationException {
        assertThat(comnAuxService.deleteTtShippingDocumentByBforCancelFrt(), is(10));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteTtPackAtchItemNoByBforCancelFrt()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteTtPackAtchItemNoByBforCancelFrt() throws ApplicationException {
        assertThat(comnAuxService.deleteTtPackAtchItemNoByBforCancelFrt(), is(10));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteTtPackingAttachedCmlByBforCancelFrt()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteTtPackingAttachedCmlByBforCancelFrt() throws ApplicationException {
        assertThat(comnAuxService.deleteTtPackingAttachedCmlByBforCancelFrt(), is(10));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteLbFileManagerPackingByBforCancelFrt()} のテス?g
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteLbFileManagerPackingByBforCancelFrt() throws ApplicationException {
        assertThat(comnAuxService.deleteLbFileManagerPackingByBforCancelFrt(), is(10));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteTtPackingHeadByBforCancelFrt()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteTtPackingHeadByBforCancelFrt() throws ApplicationException {
        assertThat(comnAuxService.deleteTtPackingHeadByBforCancelFrt(), is(10));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteTtInvoiceAttachedByBforCancelFrt()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteTtInvoiceAttachedByBforCancelFrt() throws ApplicationException {
        assertThat(comnAuxService.deleteTtInvoiceAttachedByBforCancelFrt(), is(10));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteLbFileManagerInvoiceByBforCancelFrt()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteLbFileManagerInvoiceByBforCancelFrt() throws ApplicationException {
        assertThat(comnAuxService.deleteLbFileManagerInvoiceByBforCancelFrt(), is(10));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteTtInvoiceHeaderByBforCancelFrt()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteTtInvoiceHeaderByBforCancelFrt() throws ApplicationException {
        assertThat(comnAuxService.deleteTtInvoiceHeaderByBforCancelFrt(), is(10));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteTtInvoiceByBforCancelFrt()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteTtInvoiceByBforCancelFrt() throws ApplicationException {
        assertThat(comnAuxService.deleteTtInvoiceByBforCancelFrt(), is(14));
    }


    //  ----------------------------------------------------------------------------------


    /**
     * {@link ComnAuxServiceImpl#deleteLbFileManagerByshippinActBforCancel()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteLbFileManagerByshippinActBforCancel() throws ApplicationException {
        assertThat(comnAuxService.deleteLbFileManagerByshippinActBforCancel(), is(30));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteTtShippingDocumentByBforCancel()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteTtShippingDocumentByBforCancel() throws ApplicationException {
        assertThat(comnAuxService.deleteTtShippingDocumentByBforCancel(), is(30));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteTtPackAtchItemNoByBforCancel()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteTtPackAtchItemNoByBforCancel() throws ApplicationException {
        assertThat(comnAuxService.deleteTtPackAtchItemNoByBforCancel(), is(30));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteTtPackingAttachedCmlByBforCancel()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteTtPackingAttachedCmlByBforCancel() throws ApplicationException {
        assertThat(comnAuxService.deleteTtPackingAttachedCmlByBforCancel(), is(30));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteLbFileManagerPackingByBforCancel()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteLbFileManagerPackingByBforCancel() throws ApplicationException {
        assertThat(comnAuxService.deleteLbFileManagerPackingByBforCancel(), is(30));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteTtPackingHeadByBforCancel()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteTtPackingHeadByBforCancel() throws ApplicationException {
        assertThat(comnAuxService.deleteTtPackingHeadByBforCancel(), is(30));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteTtInvoiceAttachedByBforCancel()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteTtInvoiceAttachedByBforCancel() throws ApplicationException {
        assertThat(comnAuxService.deleteTtInvoiceAttachedByBforCancel(), is(30));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteLbFileManagerInvoiceByBforCancel()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteLbFileManagerInvoiceByBforCancel() throws ApplicationException {
        assertThat(comnAuxService.deleteLbFileManagerInvoiceByBforCancel(), is(30));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteTtInvoiceHeaderByBforCancel()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteTtInvoiceHeaderByBforCancel() throws ApplicationException {
        assertThat(comnAuxService.deleteTtInvoiceHeaderByBforCancel(), is(30));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteTtInvoiceByBforCancel()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteTtInvoiceByBforCancel() throws ApplicationException {
        assertThat(comnAuxService.deleteTtInvoiceByBforCancel(), is(39));
    }


    //  ----------------------------------------------------------------------------------


    /**
     * {@link ComnAuxServiceImpl#deleteLbFileManagerByshippinActCancelReinv()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteLbFileManagerByshippinActCancelReinv() throws ApplicationException {
        assertThat(comnAuxService.deleteLbFileManagerByshippinActCancelReinv(), is(10));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteTtShippingDocumentByCancelReinv()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteTtShippingDocumentByCancelReinv() throws ApplicationException {
        assertThat(comnAuxService.deleteTtShippingDocumentByCancelReinv(), is(10));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteTtPackAtchItemNoByCancelReinv()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteTtPackAtchItemNoByCancelReinv() throws ApplicationException {
        assertThat(comnAuxService.deleteTtPackAtchItemNoByCancelReinv(), is(10));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteTtPackingAttachedCmlByCancelReinv()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteTtPackingAttachedCmlByCancelReinv() throws ApplicationException {
        assertThat(comnAuxService.deleteTtPackingAttachedCmlByCancelReinv(), is(10));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteLbFileManagerPackingByCancelReinv()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteLbFileManagerPackingByCancelReinv() throws ApplicationException {
        assertThat(comnAuxService.deleteLbFileManagerPackingByCancelReinv(), is(10));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteTtPackingHeadByCancelReinv()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteTtPackingHeadByCancelReinv() throws ApplicationException {
        assertThat(comnAuxService.deleteTtPackingHeadByCancelReinv(), is(10));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteTtInvoiceAttachedByCancelReinv()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteTtInvoiceAttachedByCancelReinv() throws ApplicationException {
        assertThat(comnAuxService.deleteTtInvoiceAttachedByCancelReinv(), is(10));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteLbFileManagerInvoiceByCancelReinv()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteLbFileManagerInvoiceByCancelReinv() throws ApplicationException {
        assertThat(comnAuxService.deleteLbFileManagerInvoiceByCancelReinv(), is(10));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteTtInvoiceHeaderByCancelReinv()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteTtInvoiceHeaderByCancelReinv() throws ApplicationException {
        assertThat(comnAuxService.deleteTtInvoiceHeaderByCancelReinv(), is(10));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteTtInvoiceByCancelReinv()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteTtInvoiceByCancelReinv() throws ApplicationException {
        assertThat(comnAuxService.deleteTtInvoiceByCancelReinv(), is(15));
    }


    //  ----------------------------------------------------------------------------------


    /**
     * {@link ComnAuxServiceImpl#deleteLbFileManagerByshippinActCancelFrt()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteLbFileManagerByshippinActCancelFrt() throws ApplicationException {
        assertThat(comnAuxService.deleteLbFileManagerByshippinActCancelFrt(), is(10));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteTtShippingDocumentByCancelFrt()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteTtShippingDocumentByCancelFrt() throws ApplicationException {
        assertThat(comnAuxService.deleteTtShippingDocumentByCancelFrt(), is(10));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteTtPackAtchItemNoByCancelFrt()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteTtPackAtchItemNoByCancelFrt() throws ApplicationException {
        assertThat(comnAuxService.deleteTtPackAtchItemNoByCancelFrt(), is(10));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteTtPackingAttachedCmlByCancelFrt()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteTtPackingAttachedCmlByCancelFrt() throws ApplicationException {
        assertThat(comnAuxService.deleteTtPackingAttachedCmlByCancelFrt(), is(10));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteLbFileManagerPackingByCancelFrt()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteLbFileManagerPackingByCancelFrt() throws ApplicationException {
        assertThat(comnAuxService.deleteLbFileManagerPackingByCancelFrt(), is(10));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteTtPackingHeadByCancelFrt()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteTtPackingHeadByCancelFrt() throws ApplicationException {
        assertThat(comnAuxService.deleteTtPackingHeadByCancelFrt(), is(10));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteTtInvoiceAttachedByCancelFrt()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteTtInvoiceAttachedByCancelFrt() throws ApplicationException {
        assertThat(comnAuxService.deleteTtInvoiceAttachedByCancelFrt(), is(10));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteLbFileManagerInvoiceByCancelFrt()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteLbFileManagerInvoiceByCancelFrt() throws ApplicationException {
        assertThat(comnAuxService.deleteLbFileManagerInvoiceByCancelFrt(), is(10));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteTtInvoiceHeaderByCancelFrt()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteTtInvoiceHeaderByCancelFrt() throws ApplicationException {
        assertThat(comnAuxService.deleteTtInvoiceHeaderByCancelFrt(), is(10));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteTtInvoiceByCancelFrt()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteTtInvoiceByCancelFrt() throws ApplicationException {
        assertThat(comnAuxService.deleteTtInvoiceByCancelFrt(), is(16));
    }


    //  ----------------------------------------------------------------------------------


    /**
     * {@link ComnAuxServiceImpl#deleteLbFileManagerByshippinActCancel()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteLbFileManagerByshippinActCancel() throws ApplicationException {
        assertThat(comnAuxService.deleteLbFileManagerByshippinActCancel(), is(50));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteTtShippingDocumentByCancel()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteTtShippingDocumentByCancel() throws ApplicationException {
        assertThat(comnAuxService.deleteTtShippingDocumentByCancel(), is(50));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteTtPackAtchItemNoByCancel()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteTtPackAtchItemNoByCancel() throws ApplicationException {
        assertThat(comnAuxService.deleteTtPackAtchItemNoByCancel(), is(50));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteTtPackingAttachedCmlByCancel()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteTtPackingAttachedCmlByCancel() throws ApplicationException {
        assertThat(comnAuxService.deleteTtPackingAttachedCmlByCancel(), is(50));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteLbFileManagerPackingByCancel()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteLbFileManagerPackingByCancel() throws ApplicationException {
        assertThat(comnAuxService.deleteLbFileManagerPackingByCancel(), is(50));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteTtPackingHeadByCancel()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteTtPackingHeadByCancel() throws ApplicationException {
        assertThat(comnAuxService.deleteTtPackingHeadByCancel(), is(50));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteTtInvoiceAttachedByCancel()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteTtInvoiceAttachedByCancel() throws ApplicationException {
        assertThat(comnAuxService.deleteTtInvoiceAttachedByCancel(), is(50));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteLbFileManagerInvoiceByCancel()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteLbFileManagerInvoiceByCancel() throws ApplicationException {
        assertThat(comnAuxService.deleteLbFileManagerInvoiceByCancel(), is(50));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteTtInvoiceHeaderByCancel()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteTtInvoiceHeaderByCancel() throws ApplicationException {
        assertThat(comnAuxService.deleteTtInvoiceHeaderByCancel(), is(50));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteTtInvoiceByCancel()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteTtInvoiceByCancel() throws ApplicationException {
        assertThat(comnAuxService.deleteTtInvoiceByCancel(), is(70));
    }


    //  ----------------------------------------------------------------------------------


    /**
     * {@link ComnAuxServiceImpl#deleteLbFileManagerByshippinActManualReinv()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteLbFileManagerByshippinActManualReinv() throws ApplicationException {
        assertThat(comnAuxService.deleteLbFileManagerByshippinActManualReinv(), is(10));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteTtShippingDocumentByManualReinv()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteTtShippingDocumentByManualReinv() throws ApplicationException {
        assertThat(comnAuxService.deleteTtShippingDocumentByManualReinv(), is(10));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteTtPackAtchItemNoByManualReinv()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteTtPackAtchItemNoByManualReinv() throws ApplicationException {
        assertThat(comnAuxService.deleteTtPackAtchItemNoByManualReinv(), is(10));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteTtPackingAttachedCmlByManualReinv()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteTtPackingAttachedCmlByManualReinv() throws ApplicationException {
        assertThat(comnAuxService.deleteTtPackingAttachedCmlByManualReinv(), is(10));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteLbFileManagerPackingByManualReinv()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteLbFileManagerPackingByManualReinv() throws ApplicationException {
        assertThat(comnAuxService.deleteLbFileManagerPackingByManualReinv(), is(10));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteTtPackingHeadByManualReinv()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteTtPackingHeadByManualReinv() throws ApplicationException {
        assertThat(comnAuxService.deleteTtPackingHeadByManualReinv(), is(10));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteTtInvoiceAttachedByManualReinv()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteTtInvoiceAttachedByManualReinv() throws ApplicationException {
        assertThat(comnAuxService.deleteTtInvoiceAttachedByManualReinv(), is(10));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteLbFileManagerInvoiceByManualReinv()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteLbFileManagerInvoiceByManualReinv() throws ApplicationException {
        assertThat(comnAuxService.deleteLbFileManagerInvoiceByManualReinv(), is(10));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteTtInvoiceHeaderByManualReinv()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteTtInvoiceHeaderByManualReinv() throws ApplicationException {
        assertThat(comnAuxService.deleteTtInvoiceHeaderByManualReinv(), is(10));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteTtInvoiceByManualReinv()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteTtInvoiceByManualReinv() throws ApplicationException {
        assertThat(comnAuxService.deleteTtInvoiceByManualReinv(), is(18));
    }


    //  ----------------------------------------------------------------------------------


    /**
     * {@link ComnAuxServiceImpl#deleteLbFileManagerByshippinActManualFrt()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteLbFileManagerByshippinActManualFrt() throws ApplicationException {
        assertThat(comnAuxService.deleteLbFileManagerByshippinActManualFrt(), is(10));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteTtShippingDocumentByManualFrt()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteTtShippingDocumentByManualFrt() throws ApplicationException {
        assertThat(comnAuxService.deleteTtShippingDocumentByManualFrt(), is(10));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteTtPackAtchItemNoByManualFrt()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteTtPackAtchItemNoByManualFrt() throws ApplicationException {
        assertThat(comnAuxService.deleteTtPackAtchItemNoByManualFrt(), is(10));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteTtPackingAttachedCmlByManualFrt()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteTtPackingAttachedCmlByManualFrt() throws ApplicationException {
        assertThat(comnAuxService.deleteTtPackingAttachedCmlByManualFrt(), is(10));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteLbFileManagerPackingByManualFrt()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteLbFileManagerPackingByManualFrt() throws ApplicationException {
        assertThat(comnAuxService.deleteLbFileManagerPackingByManualFrt(), is(10));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteTtPackingHeadByManualFrt()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteTtPackingHeadByManualFrt() throws ApplicationException {
        assertThat(comnAuxService.deleteTtPackingHeadByManualFrt(), is(10));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteTtInvoiceAttachedByManualFrt()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteTtInvoiceAttachedByManualFrt() throws ApplicationException {
        assertThat(comnAuxService.deleteTtInvoiceAttachedByManualFrt(), is(10));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteLbFileManagerInvoiceByManualFrt()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteLbFileManagerInvoiceByManualFrt() throws ApplicationException {
        assertThat(comnAuxService.deleteLbFileManagerInvoiceByManualFrt(), is(10));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteTtInvoiceHeaderByManualFrt()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteTtInvoiceHeaderByManualFrt() throws ApplicationException {
        assertThat(comnAuxService.deleteTtInvoiceHeaderByManualFrt(), is(10));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteTtInvoiceByManualFrt()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteTtInvoiceByManualFrt() throws ApplicationException {
        assertThat(comnAuxService.deleteTtInvoiceByManualFrt(), is(19));
    }


    //  ----------------------------------------------------------------------------------


    /**
     * {@link ComnAuxServiceImpl#deleteLbFileManagerByshippinActManual()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteLbFileManagerByshippinActManual() throws ApplicationException {
        assertThat(comnAuxService.deleteLbFileManagerByshippinActManual(), is(30));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteTtShippingDocumentByManual()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteTtShippingDocumentByManual() throws ApplicationException {
        assertThat(comnAuxService.deleteTtShippingDocumentByManual(), is(30));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteTtPackAtchItemNoByManual()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteTtPackAtchItemNoByManual() throws ApplicationException {
        assertThat(comnAuxService.deleteTtPackAtchItemNoByManual(), is(30));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteTtPackingAttachedCmlByManual()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteTtPackingAttachedCmlByManual() throws ApplicationException {
        assertThat(comnAuxService.deleteTtPackingAttachedCmlByManual(), is(30));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteLbFileManagerPackingByManual()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteLbFileManagerPackingByManual() throws ApplicationException {
        assertThat(comnAuxService.deleteLbFileManagerPackingByManual(), is(30));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteTtPackingHeadByManual()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteTtPackingHeadByManual() throws ApplicationException {
        assertThat(comnAuxService.deleteTtPackingHeadByManual(), is(30));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteTtInvoiceAttachedByManual()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteTtInvoiceAttachedByManual() throws ApplicationException {
        assertThat(comnAuxService.deleteTtInvoiceAttachedByManual(), is(30));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteLbFileManagerInvoiceByManual()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteLbFileManagerInvoiceByManual() throws ApplicationException {
        assertThat(comnAuxService.deleteLbFileManagerInvoiceByManual(), is(30));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteTtInvoiceHeaderByManual()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteTtInvoiceHeaderByManual() throws ApplicationException {
        assertThat(comnAuxService.deleteTtInvoiceHeaderByManual(), is(30));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteTtInvoiceByManual()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteTtInvoiceByManual() throws ApplicationException {
        assertThat(comnAuxService.deleteTtInvoiceByManual(), is(54));
    }


    //  ----------------------------------------------------------------------------------


    /**
     * {@link ComnAuxServiceImpl#deleteTtCmlErrorDtl()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteTtCmlErrorDtl() throws ApplicationException {
        assertThat(comnAuxService.deleteTtCmlErrorDtl(), is(1));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteTtCmlErrorHeader()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteTtCmlErrorHeader() throws ApplicationException {
        assertThat(comnAuxService.deleteTtCmlErrorHeader(), is(1));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteTtBhtWorkPltz()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteTtBhtWorkPltz() throws ApplicationException {
        assertThat(comnAuxService.deleteTtBhtWorkPltz(), is(100));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteTtBhtWorkMixTag()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteTtBhtWorkMixTag() throws ApplicationException {
        assertThat(comnAuxService.deleteTtBhtWorkMixTag(), is(10));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteTtBhtWorkErr()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteTtBhtWorkErr() throws ApplicationException {
        assertThat(comnAuxService.deleteTtBhtWorkErr(), is(10));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteTtBhtWorkTime()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteTtBhtWorkTime() throws ApplicationException {
        assertThat(comnAuxService.deleteTtBhtWorkTime(), is(100));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteTmPkgSpecRev()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteTmPkgSpecRev() throws ApplicationException {
        assertThat(comnAuxService.deleteTmPkgSpecRev(), is(5));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteTwShippingActInvoice()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteTwShippingActInvoice() throws ApplicationException {
        assertThat(comnAuxService.deleteTwShippingActInvoice(), is(8));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteTwInvPltz()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteTwInvPltz() throws ApplicationException {
        assertThat(comnAuxService.deleteTwInvPltz(), is(10));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteTwInv()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteTwInv() throws ApplicationException {
        assertThat(comnAuxService.deleteTwInv(), is(10));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteTwInvoice()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteTwInvoice() throws ApplicationException {
        assertThat(comnAuxService.deleteTwInvoice(), is(10));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteTwInvItem()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteTwInvItem() throws ApplicationException {
        assertThat(comnAuxService.deleteTwInvItem(), is(10));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteTwStgAct()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteTwStgAct() throws ApplicationException {
        assertThat(comnAuxService.deleteTwStgAct(), is(10));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteTwStgInstr()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteTwStgInstr() throws ApplicationException {
        assertThat(comnAuxService.deleteTwStgInstr(), is(10));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteTwXpltz()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteTwXpltz() throws ApplicationException {
        assertThat(comnAuxService.deleteTwXpltz(), is(1));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteTwPltzInstrItemNo()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteTwPltzInstrItemNo() throws ApplicationException {
        assertThat(comnAuxService.deleteTwPltzInstrItemNo(), is(37));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteTwPltzItemItemNo()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteTwPltzItemItemNo() throws ApplicationException {
        assertThat(comnAuxService.deleteTwPltzItemItemNo(), is(1));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteTwPltzItemPkg()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteTwPltzItemPkg() throws ApplicationException {
        assertThat(comnAuxService.deleteTwPltzItemPkg(), is(7));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteTwMixtagRt()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteTwMixtagRt() throws ApplicationException {
        assertThat(comnAuxService.deleteTwMixtagRt(), is(10));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteTwMixtag()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteTwMixtag() throws ApplicationException {
        assertThat(comnAuxService.deleteTwMixtag(), is(10));
    }

    /**
     * {@link ComnAuxServiceImpl#deleteTtBatchReqParam()} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDeleteTtBatchReqParam() throws ApplicationException {
        assertThat(comnAuxService.deleteTtBatchReqParam(), is(10));
    }

}
