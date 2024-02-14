/*
 * PROJECT：GSCM共通フレームワーク
 * 
 * createStackObjectテストクラス
 * 
 * Version.
 * 1.0.0
 * 
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.gscm.framework.util;

import static org.junit.Assert.assertEquals;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.dgic.testing.common.virtualmock.MockObjectManager;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.globaldenso.gscm.framework.presentation.ScreenInfoStackRequestProcessor;

/**
 * スタック情報作成機能テストクラス
 * <p>ScreenInfoStackRequestProcessor#createStackObjectメソッドの単体テストクラス</p>
 *
 * @author $Author: G453S402002 $
 * @version $Revision: 15480 $
 */
public class CreateStackObjectTest {
    /** テスト対象クラス */
    private static Class<ScreenInfoStackRequestProcessor> clazz = null;
    /** テスト対象のPrivateメソッド */
    private static Method createStackObject = null;

    /**
     * <p>デフォルトコンストラクタ</p>
     */
    public CreateStackObjectTest() {}
    
    /**
     * テストの前準備
     * @throws SecurityException セキュリティ例外
     * @throws NoSuchMethodException NoSuchMethodException
     */
    @BeforeClass
    public static void setUpClass() throws SecurityException, NoSuchMethodException {
        /*
         * ApplicationContextに設定ファイルを読み込ませるための環境準備
         * SVNよりソースをチェックアウトした状態では、本処理を実施するとFileNotFoundになってしまう。
         * [対応方法]
         * Eclipseメニューより「実行ダイアログを開く」または「デバックダイアログを開く」にてダイアログを出し
         * クラスパスタブ⇒「ユーザエントリ」選択⇒「拡張」ボタン押下⇒「外部フォルダの追加」を選択し「OK」押下
         * ポップアップしたダイアログに「WebContent」までのパスを指定する。
         */
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{
            "WEB-INF/applicationContext-aij2-aop.xml",
            "WEB-INF/applicationContext-aij2-jdbc.xml",
            "WEB-INF/applicationContext-aij2.xml"});
        
        new SpringUtil().setApplicationContext(context);
        
        new ResourcesFactory().createResources("");
        
        // テスト対象のPrivateメソッドを準備
        clazz = ScreenInfoStackRequestProcessor.class;
        createStackObject = clazz.getDeclaredMethod("createStackObject",
                                                    Class.class,
                                                    Object.class,
                                                    Object.class,
                                                    String.class,
                                                    String.class,
                                                    String.class);
        createStackObject.setAccessible(true);
    }
    
    /**
     * testCreateStackObjectメソッドのテスト1。
     * @throws InstantiationException InstantiationException
     * @throws InvocationTargetException InvocationTargetException
     * @throws IllegalAccessException IllegalAccessException
     * @throws IllegalArgumentException IllegalArgumentException
     */
    @Test
    public void testCreateStackObject1() throws IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        CreateStackObjectTest1ActionForm orig = new CreateStackObjectTest1ActionForm();
        CreateStackObjectTest1ActionForm dest = new CreateStackObjectTest1ActionForm();
        String formName = getFormName(orig);
        
        createStackObject.invoke(clazz.newInstance(), orig.getClass(), dest, orig, "W9999", formName, "");
    }

    /**
     * testCreateStackObjectメソッドのテスト2。
     * @throws InstantiationException InstantiationException
     * @throws InvocationTargetException InvocationTargetException
     * @throws IllegalAccessException IllegalAccessException
     * @throws IllegalArgumentException IllegalArgumentException
     */
    @Test
    public void testCreateStackObject2() throws IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        CreateStackObjectTest1ActionForm orig = new CreateStackObjectTest1ActionForm();
        orig.setDate1("2014/01/01");
        orig.setDate2("2014/12/31");
        orig.setItem("Test");
        orig.setNo(100);
        List<String> list = new ArrayList<String>();
        list.addAll(Arrays.asList(new String[]{"1", "2", "3"}));
        orig.setList(list);
        Map<String, String> map = new HashMap<String, String>();
        map.put("test1", "a");
        map.put("test2", "b");
        orig.setMap(map);
        CreateStackObjectTest1ActionForm dest = new CreateStackObjectTest1ActionForm();
        String formName = getFormName(orig);
        
        createStackObject.invoke(clazz.newInstance(), orig.getClass(), dest, orig, "W9999", formName, "");
    }

    /**
     * testCreateStackObjectメソッドのテスト3。
     * @throws InstantiationException InstantiationException
     * @throws InvocationTargetException InvocationTargetException
     * @throws IllegalAccessException IllegalAccessException
     * @throws IllegalArgumentException IllegalArgumentException
     */
    @Test
    public void testCreateStackObject3() throws IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        CreateStackObjectTest2ActionForm orig = new CreateStackObjectTest2ActionForm();
        CreateStackObjectTest1Domain origDomain = new CreateStackObjectTest1Domain();
        origDomain.setDate1("2014/01/01");
        origDomain.setDate2("2014/12/31");
        origDomain.setItem("Test");
        origDomain.setNo(100);
        List<String> list = new ArrayList<String>();
        list.addAll(Arrays.asList(new String[]{"1", "2", "3"}));
        origDomain.setList(list);
        Map<String, String> map = new HashMap<String, String>();
        map.put("test1", "a");
        map.put("test2", "b");
        origDomain.setMap(map);
        List<CreateStackObjectTest1Domain> listDomain = new ArrayList<CreateStackObjectTest1Domain>();
        listDomain.add(origDomain);
        orig.setList(listDomain);
        CreateStackObjectTest2ActionForm dest = new CreateStackObjectTest2ActionForm();
        String formName = getFormName(orig);
        
        createStackObject.invoke(clazz.newInstance(), orig.getClass(), dest, orig, "W9999", formName, "");
    }

    /**
     * testCreateStackObjectメソッドのテスト4。
     * @throws InstantiationException InstantiationException
     * @throws InvocationTargetException InvocationTargetException
     * @throws IllegalAccessException IllegalAccessException
     * @throws IllegalArgumentException IllegalArgumentException
     */
    @Test
    public void testCreateStackObject4() throws IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        CreateStackObjectTest2ActionForm orig = new CreateStackObjectTest2ActionForm();
        CreateStackObjectTest1Domain origDomain = new CreateStackObjectTest1Domain();
        origDomain.setDate1("2014/01/01");
        origDomain.setDate2("2014/12/31");
        origDomain.setItem("Test");
        origDomain.setNo(100);
        List<String> list = new ArrayList<String>();
        list.addAll(Arrays.asList(new String[]{"1", "2", "3"}));
        origDomain.setList(list);
        Map<String, String> map = new HashMap<String, String>();
        map.put("test1", "a");
        map.put("test2", "b");
        origDomain.setMap(map);
        Map<String, CreateStackObjectTest1Domain> mapDomain = new HashMap<String, CreateStackObjectTest1Domain>();
        mapDomain.put("mapKey", origDomain);
        orig.setMap(mapDomain);
        CreateStackObjectTest2ActionForm dest = new CreateStackObjectTest2ActionForm();
        String formName = getFormName(orig);
        
        createStackObject.invoke(clazz.newInstance(), orig.getClass(), dest, orig, "W9999", formName, "");
    }

    /**
     * testCreateStackObjectメソッドのテスト5。
     * @throws InstantiationException InstantiationException
     * @throws InvocationTargetException InvocationTargetException
     * @throws IllegalAccessException IllegalAccessException
     * @throws IllegalArgumentException IllegalArgumentException
     */
    @Test
    public void testCreateStackObject5() throws IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        CreateStackObjectTest3ActionForm orig = new CreateStackObjectTest3ActionForm();
        CreateStackObjectTest1Domain origDomain = new CreateStackObjectTest1Domain();
        origDomain.setDate1("2014/01/01");
        origDomain.setDate2("2014/12/31");
        origDomain.setItem("Test");
        origDomain.setNo(100);
        List<String> list = new ArrayList<String>();
        list.addAll(Arrays.asList(new String[]{"1", "2", "3"}));
        origDomain.setList(list);
        Map<String, String> map = new HashMap<String, String>();
        map.put("test1", "a");
        map.put("test2", "b");
        origDomain.setMap(map);
        orig.setDomain(origDomain);
        orig.setItem("Test");
        CreateStackObjectTest3ActionForm dest = new CreateStackObjectTest3ActionForm();
        String formName = getFormName(orig);
        
        createStackObject.invoke(clazz.newInstance(), orig.getClass(), dest, orig, "W9999", formName, "");

    }

    /**
     * testCreateStackObjectメソッドのテスト6。
     * @throws InstantiationException InstantiationException
     * @throws InvocationTargetException InvocationTargetException
     * @throws IllegalAccessException IllegalAccessException
     * @throws IllegalArgumentException IllegalArgumentException
     */
    @Test
    public void testCreateStackObject6() throws IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        CreateStackObjectTest4ActionForm orig = new CreateStackObjectTest4ActionForm();
        orig.setDate1("2014/01/01");
        orig.setDate2("2014/12/31");
        orig.setItem("Test");
        orig.setNo(100);
        List<String> list = new ArrayList<String>();
        list.addAll(Arrays.asList(new String[]{"1", "2", "3"}));
        orig.setList(list);
        Map<String, String> map = new HashMap<String, String>();
        map.put("test1", "a");
        map.put("test2", "b");
        orig.setMap(map);
        CreateStackObjectTest4ActionForm dest = new CreateStackObjectTest4ActionForm();
        String formName = getFormName(orig);
        
        createStackObject.invoke(clazz.newInstance(), orig.getClass(), dest, orig, "W9999", formName, "");

    }

    /**
     * testCreateStackObjectメソッドのテスト7。
     * @throws InstantiationException InstantiationException
     * @throws InvocationTargetException InvocationTargetException
     * @throws IllegalAccessException IllegalAccessException
     * @throws IllegalArgumentException IllegalArgumentException
     */
    @Test
    public void testCreateStackObject7() throws IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        CreateStackObjectTest5ActionForm orig = new CreateStackObjectTest5ActionForm();
        orig.setDate1("2014/01/01");
        orig.setDate2("2014/12/31");
        orig.setItem("Test");
        orig.setNo(100);
        List<String> list = new ArrayList<String>();
        list.addAll(Arrays.asList(new String[]{"1", "2", "3"}));
        orig.setList(list);
        Map<String, String> map = new HashMap<String, String>();
        map.put("test1", "a");
        map.put("test2", "b");
        orig.setMap(map);
        CreateStackObjectTest5ActionForm dest = new CreateStackObjectTest5ActionForm();
        String formName = getFormName(orig);
        
        createStackObject.invoke(clazz.newInstance(), orig.getClass(), dest, orig, "W9999", formName, "");
    }

    /**
     * testCreateStackObjectメソッドのテスト8。
     * @throws InstantiationException InstantiationException
     * @throws InvocationTargetException InvocationTargetException
     * @throws IllegalAccessException IllegalAccessException
     * @throws IllegalArgumentException IllegalArgumentException
     */
    @Test
    public void testCreateStackObject8() throws IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        CreateStackObjectTest1ActionForm orig = new CreateStackObjectTest1ActionForm();
        CreateStackObjectTest1ActionForm dest = null;
        String formName = getFormName(orig);
        createStackObject.invoke(clazz.newInstance(), orig.getClass(), dest, orig, "W9999", formName, "");
    }

    /**
     * testCreateStackObjectメソッドのテスト9。
     */
    @Test
    public void testCreateStackObject9() {
        MockObjectManager.addReturnValue("java.lang.reflect.Field", "setAccessible", new SecurityException());
        CreateStackObjectTest1ActionForm orig = new CreateStackObjectTest1ActionForm();
        orig.setDate1("2014/01/01");
        orig.setDate2("2014/12/31");
        orig.setItem("Test");
        orig.setNo(100);
        List<String> list = new ArrayList<String>();
        list.addAll(Arrays.asList(new String[]{"1", "2", "3"}));
        orig.setList(list);
        Map<String, String> map = new HashMap<String, String>();
        map.put("test1", "a");
        map.put("test2", "b");
        orig.setMap(map);
        CreateStackObjectTest1ActionForm dest = new CreateStackObjectTest1ActionForm();
        String formName = getFormName(orig);
        try {
            createStackObject.invoke(clazz.newInstance(), orig.getClass(), dest, orig, "W9999", formName, "");
        } catch (Exception e) {}
    }

    /**
     * testCreateStackObjectメソッドのテスト10。
     */
    @Test
    public void testCreateStackObject10() {
        MockObjectManager.addReturnValue("java.lang.reflect.Method", "invoke", new IllegalAccessException());
        CreateStackObjectTest1ActionForm orig = new CreateStackObjectTest1ActionForm();
        orig.setDate1("2014/01/01");
        orig.setDate2("2014/12/31");
        orig.setItem("Test");
        orig.setNo(100);
        List<String> list = new ArrayList<String>();
        list.addAll(Arrays.asList(new String[]{"1", "2", "3"}));
        orig.setList(list);
        Map<String, String> map = new HashMap<String, String>();
        map.put("test1", "a");
        map.put("test2", "b");
        orig.setMap(map);
        CreateStackObjectTest1ActionForm dest = new CreateStackObjectTest1ActionForm();
        String formName = getFormName(orig);
        try {
            createStackObject.invoke(clazz.newInstance(), orig.getClass(), dest, orig, "W9999", formName, "");
        } catch (Exception e) {}
    }

    /**
     * testCreateStackObjectメソッドのテスト11。
     */
    @Test
    public void testCreateStackObject11() {
        MockObjectManager.addReturnValue("java.lang.reflect.Method", "invoke", new java.lang.reflect.InvocationTargetException(new Exception()));
        CreateStackObjectTest1ActionForm orig = new CreateStackObjectTest1ActionForm();
        orig.setDate1("2014/01/01");
        orig.setDate2("2014/12/31");
        orig.setItem("Test");
        orig.setNo(100);
        List<String> list = new ArrayList<String>();
        list.addAll(Arrays.asList(new String[]{"1", "2", "3"}));
        orig.setList(list);
        Map<String, String> map = new HashMap<String, String>();
        map.put("test1", "a");
        map.put("test2", "b");
        orig.setMap(map);
        CreateStackObjectTest1ActionForm dest = new CreateStackObjectTest1ActionForm();
        String formName = getFormName(orig);
        try {
            createStackObject.invoke(clazz.newInstance(), orig.getClass(), dest, orig, "W9999", formName, "");
        } catch (Exception e) {}
    }

    /**
     * testCreateStackObjectメソッドのテスト12。
     * @throws InstantiationException InstantiationException
     * @throws InvocationTargetException InvocationTargetException
     * @throws IllegalAccessException IllegalAccessException
     * @throws IllegalArgumentException IllegalArgumentException
     */
    @Test
    public void testCreateStackObject12() throws IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        MockObjectManager.addReturnValue("Class", "newInstance", new InstantiationException());
        CreateStackObjectTest3ActionForm orig = new CreateStackObjectTest3ActionForm();
        CreateStackObjectTest1Domain origDomain = new CreateStackObjectTest1Domain();
        origDomain.setDate1("2014/01/01");
        origDomain.setDate2("2014/12/31");
        origDomain.setItem("Test");
        origDomain.setNo(100);
        List<String> list = new ArrayList<String>();
        list.addAll(Arrays.asList(new String[]{"1", "2", "3"}));
        origDomain.setList(list);
        Map<String, String> map = new HashMap<String, String>();
        map.put("test1", "a");
        map.put("test2", "b");
        origDomain.setMap(map);
        orig.setDomain(origDomain);
        orig.setItem("Test");
        CreateStackObjectTest3ActionForm dest = new CreateStackObjectTest3ActionForm();
        String formName = getFormName(orig);
        
        createStackObject.invoke(clazz.newInstance(), orig.getClass(), dest, orig, "W9999", formName, "");

    }

    /**
     * testCreateStackObjectメソッドのテスト13。
     * フォームに設定された実際のインスタンスが、宣言されたクラスのサブクラスだった場合のテスト。
     * 
     * @throws InstantiationException InstantiationException
     * @throws InvocationTargetException InvocationTargetException
     * @throws IllegalAccessException IllegalAccessException
     * @throws IllegalArgumentException IllegalArgumentException
     */
    @Test
    public void testCreateStackObject13() throws IllegalArgumentException,
        IllegalAccessException, InvocationTargetException,
        InstantiationException {
        CreateStackObjectTest3ActionForm orig = new CreateStackObjectTest3ActionForm();
        CreateStackObjectTest1ChildDomain origDomain = new CreateStackObjectTest1ChildDomain();
        origDomain.setDate1("2018/01/01");
        origDomain.setDate2("2018/12/31");
        origDomain.setItem("origDomain_Test13");
        origDomain.setNo(200);
        List<String> list = new ArrayList<String>();
        list.addAll(Arrays.asList(new String[] { "一", "二", "三" }));
        origDomain.setList(list);
        Map<String, String> map = new HashMap<String, String>();
        map.put("test1", "a");
        map.put("test2", "b");
        origDomain.setMap(map);
        origDomain.setChild("サブクラスにしかないフィールド");
        orig.setDomain(origDomain);
        orig.setItem("orig_Test13");
        CreateStackObjectTest3ActionForm dest = new CreateStackObjectTest3ActionForm();
        String formName = getFormName(orig);

        createStackObject.invoke(clazz.newInstance(), orig.getClass(), dest, orig, "W9999", formName, "");

        assertEquals("orig_Test13", dest.getItem());
        assertEquals("2018/01/01", dest.getDomain().getDate1());
        assertEquals("2018/12/31", dest.getDomain().getDate2());
        assertEquals("origDomain_Test13", dest.getDomain().getItem());
        assertEquals("origDomain_Test13", dest.getDomain().getItem());
        assertEquals(200, dest.getDomain().getNo());
        assertEquals("一", dest.getDomain().getList().get(0));
        assertEquals("二", dest.getDomain().getList().get(1));
        assertEquals("三", dest.getDomain().getList().get(2));
        assertEquals("a", dest.getDomain().getMap().get("test1"));
        assertEquals("b", dest.getDomain().getMap().get("test2"));
        assertEquals(
            "com.globaldenso.gscm.framework.util.CreateStackObjectTest1ChildDomain",
            dest.getDomain().getClass().getName());

        CreateStackObjectTest1ChildDomain destDomain = (CreateStackObjectTest1ChildDomain) dest.getDomain();
        assertEquals("サブクラスにしかないフィールド", destDomain.getChild());

    }

    /**
     * <p>クラス名取得</p>
     *
     * @param obj Object
     * @return クラス名
     */
    private String getFormName(Object obj) {
        String formName = obj.getClass().getName();
        formName = formName.substring(formName.lastIndexOf(".") + 1);
        return formName;
    }
}
