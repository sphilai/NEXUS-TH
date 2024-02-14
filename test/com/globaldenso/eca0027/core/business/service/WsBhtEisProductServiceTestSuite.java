package com.globaldenso.eca0027.core.business.service;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.globaldenso.eca0027.core.integration.WsBhtEisProductDaoTest;

/**
 * {@link WsBhtEisProductServiceImpl} のためのテストスイートクラス
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
@RunWith(Suite.class)
@SuiteClasses({
  Ws2501WsBhtEisProductServiceTest.class,
  Ws2502WsBhtEisProductServiceTest.class,
  Ws2503WsBhtEisProductServiceTest.class,
  Ws2504WsBhtEisProductServiceTest.class,
  Ws2505WsBhtEisProductServiceTest.class,
  Ws2507WsBhtEisProductServiceTest.class,
  Ws2508WsBhtEisProductServiceTest.class,
  Ws2509WsBhtEisProductServiceTest.class,
  Ws2510WsBhtEisProductServiceTest.class,
  Ws2511WsBhtEisProductServiceTest.class,
  Ws2512WsBhtEisProductServiceTest.class,
  WsBhtEisProductDaoTest.class
})
public class WsBhtEisProductServiceTestSuite {

    /**
     * デフォルトコンストラクタ
     */
    public WsBhtEisProductServiceTestSuite() {

    }

}
