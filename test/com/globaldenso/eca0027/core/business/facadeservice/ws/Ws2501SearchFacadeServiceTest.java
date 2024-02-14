package com.globaldenso.eca0027.core.business.facadeservice.ws;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PLTZ_INSTR_STATUS_INSTRUCTION_CREATED;
import static java.util.Collections.singletonList;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import jp.co.dgic.testing.common.virtualmock.MockObjectManager;

import org.junit.Before;
import org.junit.Test;

import com.globaldenso.eca0027.core.auto.business.domain.TtMixtagDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtPltzDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtPltzInstrDomain;
import com.globaldenso.eca0027.core.auto.business.service.TtPltzInstrServiceImpl;
import com.globaldenso.eca0027.core.business.domain.Ws2501CustomerKanbanListItem;
import com.globaldenso.eca0027.core.business.domain.Ws2501InternalVariableHdrDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501KanbanListItem;
import com.globaldenso.eca0027.core.business.domain.Ws2501MainMarkListItem;
import com.globaldenso.eca0027.core.business.domain.Ws2501PnListItem;
import com.globaldenso.eca0027.core.business.domain.Ws2501RegisterDataListItem;
import com.globaldenso.eca0027.core.business.domain.Ws2501ResultDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501TmCustomerQrPatternHdrByDtlDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501TtPltzItemByKanbanDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501UnpackagedItemNoDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501UnregisterDataListItem;
import com.globaldenso.eca0027.core.business.domain.WsBhtEisProductDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2501CriteriaDomain;
import com.globaldenso.eca0027.core.business.service.WsBhtEisProductServiceImpl;

/**
 * {@link Ws2501SearchFacadeServiceImpl} のためのテストクラス
 *
 * @author $Author$
 * @version $Revision$
 */
public class Ws2501SearchFacadeServiceTest {

    /** テスト対象 */
    Ws2501SearchFacadeServiceImpl ws2501SearchFacadeService;

    /**
     * デフォルトコンストラクタ
     */
    public Ws2501SearchFacadeServiceTest() {
    }

    /**
     * 事前準備
     */
    @Before
    public void setUp() {

        MockObjectManager.initialize();

        ws2501SearchFacadeService = new Ws2501SearchFacadeServiceImpl();

        WsBhtEisProductServiceImpl wsBhtEisProductService = new WsBhtEisProductServiceImpl();
        ws2501SearchFacadeService.setWsBhtEisProductService(wsBhtEisProductService);

        wsBhtEisProductService.setTtPltzInstrService(new TtPltzInstrServiceImpl());
    }

    /**
     * {@link Ws2501SearchFacadeServiceImpl#validateDatabase(Ws2501CriteriaDomain)} のためのテストメソッド。
     *
     * @throws Exception 何らかのエラーが発生した場合
     */
    @Test
    public void testValidateDatabaseWs2501CriteriaDomain() throws Exception {

        // #1602 ST250 TtPltzInstrDomain#collateMethTyp が null の場合でも正しくチェックできることを確認

        TtPltzInstrDomain pltzInstr = new TtPltzInstrDomain();
        pltzInstr.setPltzInstrStatus(PLTZ_INSTR_STATUS_INSTRUCTION_CREATED);
        pltzInstr.setCollateMethTyp(null);
        MockObjectManager.addReturnValue(TtPltzInstrServiceImpl.class, "searchByKey", pltzInstr);

        Ws2501CriteriaDomain criteriaDomain = new Ws2501CriteriaDomain();
        ws2501SearchFacadeService.validateDatabase(criteriaDomain);
    }

    /**
     * {@link Ws2501SearchFacadeServiceImpl#convertEisToResult(WsBhtEisProductDomain)} のためのテストメソッド。
     */
    @Test
    public void testConvertEisToResult() {

        WsBhtEisProductDomain wsBhtEisProduct = new WsBhtEisProductDomain();

        //  -------------------------------------------------------------------

        Ws2501InternalVariableHdrDomain internalVariableHdrDomain = new Ws2501InternalVariableHdrDomain();
        internalVariableHdrDomain.setShipperCd("x1");
        internalVariableHdrDomain.setCustomerCd("x2");
        internalVariableHdrDomain.setLgcyShipTo("x3");
        internalVariableHdrDomain.setTrnsCd("x4");
        internalVariableHdrDomain.setPlntCd("x5");
        internalVariableHdrDomain.setLgcyWhCd("x6");
        wsBhtEisProduct.setWs2501InternalVariableHdrDomain(internalVariableHdrDomain);

        //  -------------------------------------------------------------------

        TtPltzDomain pltz = new TtPltzDomain();
        pltz.setMainMark("a1");
        pltz.setPalletNo("a2");
        wsBhtEisProduct.setWs2501TtPltzList(singletonList(pltz));

        //  -------------------------------------------------------------------

        Ws2501TtPltzItemByKanbanDomain pltzItemByKanban = new Ws2501TtPltzItemByKanbanDomain();
        pltzItemByKanban.setPltzItemNo("b1");
        pltzItemByKanban.setPkgCd("b2");
        pltzItemByKanban.setCustomerItemNo("b3");
        pltzItemByKanban.setExpIndusTypCd("b4");
        pltzItemByKanban.setExpKanbanTyp("b5");
        pltzItemByKanban.setExpRegulateNo("b6");
        pltzItemByKanban.setExpCustomerRegulateNo("b7");
        wsBhtEisProduct.setWs2501TtPltzItemByKanbanList(singletonList(pltzItemByKanban));

        //  -------------------------------------------------------------------

        TtMixtagDomain mixtag = new TtMixtagDomain();
        mixtag.setMixTagNo("c1");
        wsBhtEisProduct.setWs2501TtMixtagList(singletonList(mixtag));

        //  -------------------------------------------------------------------

        Ws2501UnpackagedItemNoDomain unpackagedItemNo = new Ws2501UnpackagedItemNoDomain();
        unpackagedItemNo.setItemNo("d1");
        unpackagedItemNo.setPkgCd("d2");
        unpackagedItemNo.setInstrQty("100");
        unpackagedItemNo.setPackedQty("20");
        unpackagedItemNo.setSumQty("50");
        wsBhtEisProduct.setWs2501UnpackagedItemNoList(singletonList(unpackagedItemNo));

        //  -------------------------------------------------------------------

        TtMixtagDomain unpackagedMixtag = new TtMixtagDomain();
        unpackagedMixtag.setMixTagNo("e1");
        wsBhtEisProduct.setWs2501TtMixtagByNoPltzInstrList(singletonList(unpackagedMixtag));

        //  -------------------------------------------------------------------

        Ws2501TmCustomerQrPatternHdrByDtlDomain customerQrPatternHdrByDtl = new Ws2501TmCustomerQrPatternHdrByDtlDomain();
        customerQrPatternHdrByDtl.setStrtPos("1");
        customerQrPatternHdrByDtl.setQrItemLength("2");
        customerQrPatternHdrByDtl.setQrItemTyp("f3");
        customerQrPatternHdrByDtl.setChkValue("f4");
        customerQrPatternHdrByDtl.setQrItemId("f5");
        customerQrPatternHdrByDtl.setReqFlg("f6");
        customerQrPatternHdrByDtl.setAttrTyp("f7");
        customerQrPatternHdrByDtl.setGrpId("f8");
        wsBhtEisProduct.setWs2501TmCustomerQrPatternHdrByDtlList(singletonList(customerQrPatternHdrByDtl));

        //  -------------------------------------------------------------------

        Ws2501ResultDomain result = ws2501SearchFacadeService.convertEisToResult(wsBhtEisProduct, "x7");

        // -------------------------------------------------------------------

        assertThat(result.getPalletizeInstrHeader().getShipperCd(), is("x1"));
        assertThat(result.getPalletizeInstrHeader().getCustomerCd(), is("x2"));
        assertThat(result.getPalletizeInstrHeader().getLgcyShipTo(), is("x3"));
        assertThat(result.getPalletizeInstrHeader().getTrnsCd(), is("x4"));
        assertThat(result.getPalletizeInstrHeader().getPlntCd(), is("x5"));
        assertThat(result.getPalletizeInstrHeader().getLgcyWhCd(), is("x6"));
        assertThat(result.getPalletizeInstrHeader().getCollateMethTyp(), is("x7"));

        //  -------------------------------------------------------------------

        assertThat(result.getPalletizeInstrHeader().getRegisterDataList().size(), is(1));

        Ws2501RegisterDataListItem registerDataListItem = result.getPalletizeInstrHeader().getRegisterDataList().get(0);

        //  -------------------------------------------------------------------

        assertThat(registerDataListItem.getMainMarkList().size(), is(1));

        Ws2501MainMarkListItem mainMarkListItem = registerDataListItem.getMainMarkList().get(0);
        assertThat(mainMarkListItem.getMainMark(), is("a1"));
        assertThat(mainMarkListItem.getPalletNo(), is("a2"));

        //  -------------------------------------------------------------------

        assertThat(registerDataListItem.getKanbanList().size(), is(1));

        Ws2501KanbanListItem kanbanListItem = registerDataListItem.getKanbanList().get(0);
        assertThat(kanbanListItem.getPltzItemNo(), is("b1"));
        assertThat(kanbanListItem.getPkgCd(), is("b2"));
        assertThat(kanbanListItem.getCustomerItemNo(), is("b3"));
        assertThat(kanbanListItem.getExpIndusTypCd(), is("b4"));
        assertThat(kanbanListItem.getExpKanbanTyp(), is("b5"));
        assertThat(kanbanListItem.getExpRegulateNo(), is("b6"));
        assertThat(kanbanListItem.getExpCustomerRegulateNo(), is("b7"));

        //  -------------------------------------------------------------------

        assertThat(registerDataListItem.getMixTagList().size(), is(1));
        assertThat(registerDataListItem.getMixTagList().get(0).getMixTagNo(), is("c1"));

        //  -------------------------------------------------------------------

        assertThat(result.getPalletizeInstrHeader().getUnregisterDataList().size(), is(1));

        Ws2501UnregisterDataListItem unregisterDataListItem = result.getPalletizeInstrHeader().getUnregisterDataList().get(0);

        //  -------------------------------------------------------------------

        assertThat(unregisterDataListItem.getPnList().size(), is(1));

        Ws2501PnListItem pnListItem = unregisterDataListItem.getPnList().get(0);
        assertThat(pnListItem.getItemNo(), is("d1"));
        assertThat(pnListItem.getPkgCd(), is("d2"));
        assertThat(pnListItem.getUnPackedQty(), is("30"));

        //  -------------------------------------------------------------------

        assertThat(unregisterDataListItem.getMixTagList().size(), is(1));
        assertThat(unregisterDataListItem.getMixTagList().get(0).getMixTagNo(), is("e1"));

        //  -------------------------------------------------------------------

        assertThat(result.getCustomerKanbanList().size(), is(1));

        Ws2501CustomerKanbanListItem customerKanbanListItem = result.getCustomerKanbanList().get(0);
        assertThat(customerKanbanListItem.getStrtPos(), is("1"));
        assertThat(customerKanbanListItem.getQrItemLength(), is("2"));
        assertThat(customerKanbanListItem.getQrItemTyp(), is("f3"));
        assertThat(customerKanbanListItem.getChkValue(), is("f4"));
        assertThat(customerKanbanListItem.getQrItemId(), is("f5"));
        assertThat(customerKanbanListItem.getReqFlg(), is("f6"));
        assertThat(customerKanbanListItem.getAttrTyp(), is("f7"));
        assertThat(customerKanbanListItem.getGrpId(), is("f8"));
    }
}
