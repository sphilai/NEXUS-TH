package com.globaldenso.eca0027.core.business.service;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;

/**
 * {@link WsBhtEisProductServiceImpl} の WS2501 のためのテストクラス
 *
 * @author $Author$
 * @version $Revision$
 */
public class WsBhtEisProductServiceTest {

    /** 例外チェック */
    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    /**
     * デフォルトコンストラクタ
     */
    public WsBhtEisProductServiceTest() {
    }

    /**
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void assertNotEmpty1() throws ApplicationException {

        expectedException.expect(ValidationException.class);

        WsBhtEisProductServiceImpl bhtEisProductService = new WsBhtEisProductServiceImpl();
        bhtEisProductService.assertNotEmpty(null, "ERROR");
    }

    /**
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void assertNotEmpty2() throws ApplicationException {
        WsBhtEisProductServiceImpl bhtEisProductService = new WsBhtEisProductServiceImpl();
        bhtEisProductService.assertNotEmpty(new Object(), "ERROR");
    }

    /**
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void assertNotEmpty3() throws ApplicationException {

        expectedException.expect(ValidationException.class);

        WsBhtEisProductServiceImpl bhtEisProductService = new WsBhtEisProductServiceImpl();
        bhtEisProductService.assertNotEmpty(new ArrayList<Object>(), "ERROR");
    }

    /**
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void assertNotEmpty4() throws ApplicationException {
        WsBhtEisProductServiceImpl bhtEisProductService = new WsBhtEisProductServiceImpl();
        bhtEisProductService.assertNotEmpty(Collections.singletonList(new Object()), "ERROR");
    }
}
