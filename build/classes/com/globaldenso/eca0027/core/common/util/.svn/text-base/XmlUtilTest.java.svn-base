/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.common.util;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_91_0001;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.globaldenso.ai.common.core.exception.SystemException;
import com.globaldenso.eca0027.core.AbstractEca0027Test;
import com.globaldenso.eca0027.core.business.domain.ErrorListItemDomain;
import com.globaldenso.eca0027.core.business.domain.ErrorParamListItemDomain;
import com.globaldenso.eca0027.core.business.domain.ResultDomain;

/**
 * <p>XmlUtilのテストクラス</p>
 *
 * <p>「djUnit テスト」で実行すること。</p>
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class XmlUtilTest extends AbstractEca0027Test {

    /**
     * <p>デフォルトコンストラクタ</p>
     */
    public XmlUtilTest() {
    }

    /**
     * <p>初期化処理</p>
     *
     * @throws Exception エラーが発生した場合が発生した場合
     */
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    /**
     * <p>終了処理</p>
     *
     * @throws Exception エラーが発生した場合が発生した場合
     */
    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    /**
     * <p>各テスト実行前の処理</p>
     *
     * @throws Exception エラーが発生した場合が発生した場合
     */
    @Before
    public void setUp() throws Exception {
    }

    /**
     * <p>各テスト実行後の処理</p>
     *
     * @throws Exception エラーが発生した場合
     */
    @After
    public void tearDown() throws Exception {
    }

    /**
     * <p>デフォルトコンストラクタのテスト</p>
     */
    @Test
    public void testXmlUtil() {
        
        // デフォルトコンストラクタが private なので、リフレクションで呼び出す
        try {
            Constructor<XmlUtil> constructor = XmlUtil.class.getDeclaredConstructor();
            constructor.setAccessible(true);
            
            assertNotNull(constructor.newInstance());
            
        } catch (Exception e) {
            fail("");
        }
    }

    /**
     * <p>marshalのテスト</p>
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testMarshal1() throws Exception {
        
        ResultDomain domain = new ResultDomain("success");
        
        String result1 = XmlUtil.marshal(domain);
        
        // マーシャル結果 (期待値)
        String expectedXml1 = "<?xml version=\"1.0\" encoding=\"utf-8\" standalone=\"yes\"?>"
            + "<result>"
            + "    <resultCode>success</resultCode>"
            + "    <errorList/>"
            + "</result>";
        
        assertThat(result1, is(expectedXml1));
    }

    /**
     * <p>marshalのテスト</p>
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testMarshal2() throws Exception {
        
        List<ErrorParamListItemDomain> errorParamList
            = Arrays.asList(new ErrorParamListItemDomain("param1"));
        List<ErrorListItemDomain> errorList
            = Arrays.asList(new ErrorListItemDomain("ERR-CODE-1", errorParamList));
        ResultDomain domain = new ResultDomain("err", errorList);
        
        String result1 = XmlUtil.marshal(domain);
        
        // マーシャル結果 (期待値)
        String expectedXml1 = "<?xml version=\"1.0\" encoding=\"utf-8\" standalone=\"yes\"?>"
            + "<result>"
            + "    <resultCode>err</resultCode>"
            + "    <errorList>"
            + "        <errorListItem>"
            + "            <errorCode>ERR-CODE-1</errorCode>"
            + "            <errorParamList>"
            + "                <errorParamListItem>"
            + "                    <param>param1</param>"
            + "                </errorParamListItem>"
            + "            </errorParamList>"
            + "        </errorListItem>"
            + "    </errorList>"
            + "</result>";
        
        assertThat(result1, is(expectedXml1));
    }

    /**
     * <p>marshalのテスト</p>
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testMarshal3() throws Exception {
        
        try {
            XmlUtil.marshal(null);
            fail("SystemException 発生せず");
        } catch (Exception e) {
            assertEquals(true, e instanceof SystemException);
            assertEquals(NXS_91_0001, ((SystemException) e).getCode());
        }
    }

    /**
     * <p>unmarshalのテスト</p>
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testUnmarshal1() throws Exception {
        
        String xml = "<?xml version=\"1.0\" encoding=\"utf-8\" standalone=\"yes\"?>"
            + "<result>"
            + "    <resultCode>success</resultCode>"
            + "    <errorList/>"
            + "</result>";
        
        ResultDomain result1 = XmlUtil.unmarshal(ResultDomain.class, xml);
        
        assertNotNull(result1);
        assertThat(result1.getResultCode(), is("success"));
        assertThat(result1.getErrorList().size(), is(0));
    }

    /**
     * <p>unmarshalのテスト</p>
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testUnmarshal2() throws Exception {
        
        String xml = "<?xml version=\"1.0\" encoding=\"utf-8\" standalone=\"yes\"?>"
            + "<result>"
            + "    <resultCode>err</resultCode>"
            + "    <errorList>"
            + "        <errorListItem>"
            + "            <errorCode>ERR-CODE-1</errorCode>"
            + "            <errorParamList>"
            + "                <errorParamListItem>"
            + "                    <param>param1</param>"
            + "                </errorParamListItem>"
            + "            </errorParamList>"
            + "        </errorListItem>"
            + "    </errorList>"
            + "</result>";
        
        ResultDomain result1 = XmlUtil.unmarshal(ResultDomain.class, xml);
        
        assertNotNull(result1);
        assertThat(result1.getResultCode(), is("err"));
        assertThat(result1.getErrorList().size(), is(1));
        assertThat(result1.getErrorList().get(0).getErrorCode(), is("ERR-CODE-1"));
        assertThat(result1.getErrorList().get(0).getErrorParamList().size(), is(1));
        assertThat(result1.getErrorList().get(0).getErrorParamList().get(0).getParam(), is("param1"));
    }

    /**
     * <p>unmarshalのテスト</p>
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testUnmarshal3() throws Exception {
        
        try {
            XmlUtil.unmarshal(null, null);
            fail("SystemException 発生せず");
        } catch (Exception e) {
            assertEquals(true, e instanceof SystemException);
            assertEquals(NXS_91_0001, ((SystemException) e).getCode());
        }
    }

}
