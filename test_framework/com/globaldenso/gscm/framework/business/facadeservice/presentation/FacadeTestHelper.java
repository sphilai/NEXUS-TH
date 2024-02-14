/*
 * Project : GSCMFramework
 *
 * 更新日      更新者        更新内容
 * 2013/07/11  DNITS         新規作成
 *
 * $Id: FacadeTestHelper.java 5759 2014-06-27 08:14:53Z 10088DS01586 $
 *
 * Copyright (c) 2011 DENSO IT SOLUTIONS. All rights reserved.
 */
package com.globaldenso.gscm.framework.business.facadeservice.presentation;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * テスト用便利クラス
 * 
 * <p>
 * テスト用便利クラス
 * </p>
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class FacadeTestHelper {
    
    /** コンテキスト */
    private static ApplicationContext context = null;
    
    /**
     * 
     * デフォルトコンストラクタ。
     *
     */
    public FacadeTestHelper(){
        
    }
    
    /**
     * 
     * SpringContextの取得
     * 
     * <p>
     *  SpringContextの取得
     * </p>
     * 
     * @return コンテキスト
     * @throws NoSuchMethodException 例外 
     * @throws SecurityException 例外
     * @throws InvocationTargetException 例外
     * @throws IllegalAccessException 例外
     * @throws IllegalArgumentException 例外
     * @throws MalformedURLException 例外
     */
    public static ApplicationContext getContext() throws SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, MalformedURLException {
        
        if (context != null) {
            return context;
        }
        
        URL webContent = new File("WebContent").toURL();
        URL jdbcJar = CreateFacadeServiceTest.class.getResource("derby.jar");
        
        URLClassLoader urlLoader = (URLClassLoader)ClassLoader.getSystemClassLoader();
        Method method = URLClassLoader.class.getDeclaredMethod("addURL", new Class[]{URL.class});
        method.setAccessible(true);
        method.invoke(urlLoader, new Object[]{webContent});
        method.invoke(urlLoader, new Object[]{jdbcJar});
        
        
        context = new ClassPathXmlApplicationContext(new String[] {
            "WEB-INF/applicationContext-aij2.xml",
            "WEB-INF/applicationContext-aij2-aop.xml", 
            "com/globaldenso/gscm/framework/business/facadeservice/presentation/applicationContext-facade-jdbc.xml",
            "com/globaldenso/gscm/framework/business/facadeservice/presentation/applicationContext-facade-test.xml"});
        
        return context;
    }
    
    /**
     * 
     * テスト用テーブル作成
     * 
     * <p>
     * テスト用テーブル作成
     * </p>
     * 
     * @throws Exception 例外
     */
    public static void createTable() throws Exception {
        // table作成
        Connection con = null;
        Statement create = null;
        PreparedStatement exists = null;
        ResultSet rsExists = null;
        try {

            con = getConnection();
            
            // table存在チェック
            exists = con.prepareStatement("SELECT ST.TABLENAME FROM SYS.SYSTABLES AS ST WHERE ST.TABLENAME = ?");
            exists.setString(1, "TEST_FACADE_TABLE");
            rsExists = exists.executeQuery();
            if (!rsExists.next()) {

                // ない場合テーブル作る
                create = con.createStatement();
                create.execute("CREATE TABLE TEST_FACADE_TABLE(ID NUMERIC(2), ITEM VARCHAR(20) NOT NULL, CONSTRAINT FACADE_PK PRIMARY KEY(ID))");
            }
        
        } finally {
            if (rsExists != null) {
                rsExists.close();
            }
            if (exists != null) {
                exists.close();
            }
            if (create != null) {
                create.close();
            }
            if (con != null) {
                con.close();
            }
        }
    }
    
    /**
     * 
     * テーブル削除
     * 
     * <p>
     * テーブル削除
     * </p>
     *
     * @throws Exception 例外
     */
    public static void dropTable() throws Exception {
        
        Connection con = null;
        Statement drop = null;
        try {

            con = getConnection();
            
            drop = con.createStatement();
            drop.execute("DROP TABLE TEST_FACADE_TABLE");
   
        } finally {
            if (drop != null) {
                drop.close();
            }
            if (con != null) {
                con.close();
            }
        }
    }
    
    /**
     * 
     * コネクション取得
     * 
     * <p>
     * コネクション取得
     * </p>
     * 
     * @return コネクション
     * @throws SQLException 例外
     * @throws ClassNotFoundException 例外
     */
    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        ResourceBundle jdbcProperties = ResourceBundle.getBundle("com.globaldenso.gscm.framework.business.facadeservice.presentation.jdbc-aij2");
        String driver = jdbcProperties.getString("jdbc.driver");
        String url = jdbcProperties.getString("jdbc.url");
        Class.forName(driver);
        return DriverManager.getConnection(url);
    }

}
