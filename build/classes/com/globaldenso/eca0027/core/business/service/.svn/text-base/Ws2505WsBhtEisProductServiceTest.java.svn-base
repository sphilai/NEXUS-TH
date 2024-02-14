package com.globaldenso.eca0027.core.business.service;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

import java.math.BigDecimal;
import java.util.Date;

import jp.co.dgic.testing.common.virtualmock.MockObjectManager;

import org.junit.Before;
import org.junit.Test;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.AbstractEca0027Test;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPkgSpecHdrCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.service.TmPkgSpecRevServiceImpl;
import com.globaldenso.eca0027.core.business.domain.criteria.WsBhtEisProductCriteriaDomain;

/**
 * {@link WsBhtEisProductServiceImpl} のためのテストクラス
 *
 * @author $Author: 10088DS50908 $
 * @version $Revision: 10489 $
 */
public class Ws2505WsBhtEisProductServiceTest extends AbstractEca0027Test {

    /**
     * BhtEisProductサービス
     */
    private WsBhtEisProductService wsBhtEisProductService;

    /**
     * デフォルトコンストラクタ
     */
    public Ws2505WsBhtEisProductServiceTest() {
    }

    /**
     * Setter method for wsBhtEisProductService.
     *
     * @param wsBhtEisProductService Set for wsBhtEisProductService
     */
    public void setWsBhtEisProductService(
        WsBhtEisProductService wsBhtEisProductService) {
        this.wsBhtEisProductService = wsBhtEisProductService;
    }

    /**
     * 前処理
     */
    @Before
    public void setUp() {
        MockObjectManager.initialize();

        wsBhtEisProductService = (WsBhtEisProductService) getContext().getBean("wsBhtEisProductService");

    }

    /**
     * {@link WsBhtEisProductServiceImpl#validateDatabaseCompCd(String, String[], String[])} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testValidateDatabaseCompCd() throws ApplicationException {
        boolean result = false;

        String[] itemNoGrp = new String[1];
        String[] timeZone = new String[1];

        // 存在する
        result = wsBhtEisProductService.validateDatabaseCompCd("MY7", itemNoGrp, timeZone);
        assertThat(result, is(true));

        // 存在しない
        result = wsBhtEisProductService.validateDatabaseCompCd("XYZ", itemNoGrp, timeZone);
        assertThat(result, is(false));

    }

    /**
     * {@link WsBhtEisProductServiceImpl#validateDatabaseTmPkgSpecificatinDtlOnPkgSpec(TmPkgSpecificationDtlCriteriaDomain)} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testValidateDatabaseTmPkgSpecificatinDtlOnPkgSpec() throws ApplicationException {
        boolean result = false;

        // 存在する
        TmPkgSpecHdrCriteriaDomain criteria1 = new TmPkgSpecHdrCriteriaDomain();
        criteria1.setOwnerComp("MY7");
        criteria1.setItemNo("A002TB0091B3N");
        criteria1.setPkgCd("110");
        criteria1.setTrnsCd("A");

        result = wsBhtEisProductService.validateDatabaseTmPkgSpecHdrOnPkgSpec(criteria1);
        assertThat(result, is(true));

        // 存在しない
        TmPkgSpecHdrCriteriaDomain criteria2 = new TmPkgSpecHdrCriteriaDomain();
        criteria2.setOwnerComp("MYX");
        criteria2.setItemNo("A002TB0091B3N");
        criteria2.setPkgCd("110");
        criteria2.setTrnsCd("A");

        result = wsBhtEisProductService.validateDatabaseTmPkgSpecHdrOnPkgSpec(criteria2);
        assertThat(result, is(false));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#transactOnPkgSpec(WsBhtEisProductCriteriaDomain)} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testTransactOnPkgSpec1() throws ApplicationException {
        WsBhtEisProductCriteriaDomain criteria = new WsBhtEisProductCriteriaDomain();
        criteria.setCompCd("MY7");
        criteria.setOwnerComp("MY7");
        criteria.setItemNoGrp("G1");
        criteria.setItemNo("A002TB0091B3N");
        criteria.setPkgCd("110");
        criteria.setTrnsCd("A");
        criteria.setIsltdPurchaseFlg("Y");
        criteria.setIsltdStorageFlg("Y");
        criteria.setIsltdShippingFlg("Y");
        criteria.setNProc(" ");
        criteria.setRev(new BigDecimal(1));
        criteria.setDueDt(new Date());
        criteria.setTimeZone("JST");
        criteria.setLoginUserDscId("nexus");

        try {
            wsBhtEisProductService.transactOnPkgSpec(criteria);
        } catch (Exception e) {
            fail("例外発生");
        }
    }

    /**
     * {@link WsBhtEisProductServiceImpl#transactOnPkgSpec(WsBhtEisProductCriteriaDomain)} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    @SuppressWarnings("deprecation")
    public void testTransactOnPkgSpec2() throws ApplicationException {
        WsBhtEisProductCriteriaDomain criteria = new WsBhtEisProductCriteriaDomain();
        criteria.setCompCd("MYA");
        criteria.setOwnerComp("MYA");
        criteria.setItemNoGrp("G1");
        criteria.setItemNo("A002TB0091B01N");
        criteria.setPkgCd("110");
        criteria.setTrnsCd("S");
        criteria.setIsltdPurchaseFlg("N");
        criteria.setIsltdStorageFlg("N");
        criteria.setIsltdShippingFlg("Y");
        criteria.setNProc(" ");
        criteria.setRev(new BigDecimal(2));
        criteria.setDueDt(new Date(2014, 5, 3));
        criteria.setTimeZone("JST");
        criteria.setLoginUserDscId("nexus");

        try {
            wsBhtEisProductService.transactOnPkgSpec(criteria);
        } catch (Exception e) {
            fail("例外発生");
        }
    }

    /**
     * {@link WsBhtEisProductServiceImpl#transactOnPkgSpec(WsBhtEisProductCriteriaDomain)} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    @SuppressWarnings("deprecation")
    public void testTransactOnPkgSpec3() throws ApplicationException {
        WsBhtEisProductCriteriaDomain criteria = new WsBhtEisProductCriteriaDomain();
        criteria.setCompCd("MY7");
        criteria.setOwnerComp("MY7");
        criteria.setItemNoGrp("G1");
        criteria.setItemNo("A002TB0091B3N03");
        criteria.setPkgCd("110");
        criteria.setTrnsCd("S");
        criteria.setIsltdPurchaseFlg("N");
        criteria.setIsltdStorageFlg("N");
        criteria.setIsltdShippingFlg("Y");
        criteria.setNProc(" ");
        criteria.setRev(new BigDecimal(1));
        criteria.setDueDt(new Date(2014, 5, 3));
        criteria.setTimeZone("JST");
        criteria.setLoginUserDscId("nexus");

        try {
            wsBhtEisProductService.transactOnPkgSpec(criteria);
        } catch (Exception e) {
            fail("例外発生");
        }
    }

    /**
     * {@link WsBhtEisProductServiceImpl#transactOnPkgSpec(WsBhtEisProductCriteriaDomain)} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    @SuppressWarnings("deprecation")
    public void testTransactOnPkgSpec4() throws ApplicationException {
        // TmPkgSpecRev NOT EXIST
        MockObjectManager.setReturnNullAtAllTimes(TmPkgSpecRevServiceImpl.class, "lockByKeyNoWait");

        WsBhtEisProductCriteriaDomain criteria = new WsBhtEisProductCriteriaDomain();
        criteria.setCompCd("MY7");
        criteria.setOwnerComp("MY7");
        criteria.setItemNoGrp("G1");
        criteria.setItemNo("HOGE");
        criteria.setPkgCd("110");
        criteria.setTrnsCd("S");
        criteria.setIsltdPurchaseFlg("N");
        criteria.setIsltdStorageFlg("N");
        criteria.setIsltdShippingFlg("Y");
        criteria.setNProc(" ");
        criteria.setRev(new BigDecimal(1));
        criteria.setDueDt(new Date(2014, 5, 3));
        criteria.setTimeZone("JST");
        criteria.setLoginUserDscId("nexus");

        wsBhtEisProductService.transactOnPkgSpec(criteria);
    }
}
