/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jp.co.dgic.testing.common.virtualmock.MockObjectManager;

import org.junit.Before;
import org.junit.Test;
import org.springframework.transaction.annotation.Transactional;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.ai.common.core.exception.SystemException;
import com.globaldenso.eca0027.core.AbstractEca0027Test;
import com.globaldenso.eca0027.core.business.domain.W9024ItemNoAplyStrtDtItemDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W9024ItemNoAplyStrtDtCriteriaDomain;
import com.globaldenso.eca0027.core.common.business.domain.UserAuthDomain;
import com.globaldenso.eca0027.core.common.business.service.UserAuthServiceImpl;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.util.DateUtil;

/**
 * W9024ItemNoAplyStrtDtServiceImplの単体テストクラスです。
 *
 * @author $Author: 810833843 $
 * @version $Revision: 9972 $
 */
public class W9024ItemNoAplyStrtDtServiceTest extends AbstractEca0027Test {

    /**
     * Type in the role of the field.
     */
    private W9024ItemNoAplyStrtDtService w9024ItemNoAplyStrtDtService;
    
    /**
     * <br />デフォルトコンストラクタです。
     */
    public W9024ItemNoAplyStrtDtServiceTest() {
    }

    /**
     * 
     * 前処理
     *
     * @throws Exception エラーが発生した場合が発生した場合
     */
    @Before
    public void setUp() throws Exception {
        w9024ItemNoAplyStrtDtService = (W9024ItemNoAplyStrtDtService) getContext().getBean("w9024ItemNoAplyStrtDtService");
    }
    
    /**
     * 正常ケース
     *
     * @throws Exception 例外発生した場合
     */
    @Test
    @Transactional
    public void testCreateOnRegister() throws Exception {
        
        W9024ItemNoAplyStrtDtCriteriaDomain criteria = new W9024ItemNoAplyStrtDtCriteriaDomain();
        
        // 包装仕様有効リビジョン原単位 登録処理
        criteria.setCompCd("compCd222");
        criteria.setItemNo("itemNo222");
        criteria.setPkgCd("");
        criteria.setTrnsCd("2");
        criteria.setIsltdPurchaseFlg("N");
        criteria.setIsltdStorageFlg("N");
        criteria.setIsltdShippingFlg("Y");
        criteria.setNProc(" ");
        criteria.setOwnerCompCd("MYI");
        criteria.setItemNoGrp("DG");
        criteria.setScreenId("W9024");
        criteria.setRev("2");
        criteria.setRevOld("1");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        Date date = sdf.parse("20140310");
        MockObjectManager.setReturnValueAtAllTimes(DateUtil.class, "convertTime", date);
        w9024ItemNoAplyStrtDtService.createOnRegister(criteria);
        
        // 包装仕様有効リビジョン原単位 登録処理
        criteria.setCompCd("MYI");
        criteria.setItemNo("ItemNo100");
        criteria.setPkgCd("100");
        criteria.setTrnsCd("S");
        criteria.setIsltdPurchaseFlg("N");
        criteria.setIsltdStorageFlg("N");
        criteria.setIsltdShippingFlg("Y");
        criteria.setNProc(" ");
        criteria.setOwnerCompCd("MYI");
        criteria.setItemNoGrp("G1");
        criteria.setScreenId("W9024");
        criteria.setRev("2");
        criteria.setRevOld("2");
        MockObjectManager.setReturnValueAtAllTimes(DateUtil.class, "convertTime", date);
        w9024ItemNoAplyStrtDtService.createOnRegister(criteria);
        
        
    }
    
    /**
     * 正常ケース
     *
     * @throws ApplicationException 例外発生した場合
     */
    @Test
    @Transactional
    public void testSearchOnRegisterAddOrRefer() throws ApplicationException {
        
        W9024ItemNoAplyStrtDtCriteriaDomain criteria = new W9024ItemNoAplyStrtDtCriteriaDomain();
        
        criteria.setCompCd("compCd001");
        criteria.setItemNo("itemNo001");
        criteria.setPkgCd("packCd001");
        criteria.setTrnsCd("tranCd001");
        criteria.setIsltdPurchaseFlg("N");
        criteria.setIsltdStorageFlg("N");
        criteria.setIsltdShippingFlg("Y");
        criteria.setNProc(" ");
        
        List<UserAuthDomain> userAuthList = new ArrayList<UserAuthDomain>();
        UserAuthDomain userDomain = new UserAuthDomain();
        userDomain.setDscId("srawj16");
        userAuthList.add(userDomain);
        
        MockObjectManager.setReturnValueAtAllTimes(UserAuthServiceImpl.class, "getUserAuthList", userAuthList);
        W9024ItemNoAplyStrtDtItemDomain domain = w9024ItemNoAplyStrtDtService.searchOnRegisterAddOrRefer(criteria);
        if (domain == null) {;}
        
        
        userAuthList = new ArrayList<UserAuthDomain>();
        MockObjectManager.setReturnValueAtAllTimes(UserAuthServiceImpl.class, "getUserAuthList", userAuthList);
        try {
            domain = w9024ItemNoAplyStrtDtService.searchOnRegisterAddOrRefer(criteria);
            fail("この行は、実行されないはず");
        } catch (GscmApplicationException e) {
            assertEquals("GSCM-I0-0009", e.getMessage());
        }

        userAuthList = new ArrayList<UserAuthDomain>();
        userDomain = new UserAuthDomain();
        userDomain.setDscId("srawj16");
        userAuthList.add(userDomain);
        
        criteria.setItemNoGrp("DG");
        criteria.setPkgCd("packCd001");
        MockObjectManager.setReturnValueAtAllTimes(UserAuthServiceImpl.class, "getUserAuthList", userAuthList);
        try {
            domain = w9024ItemNoAplyStrtDtService.searchOnRegisterAddOrRefer(criteria);
            fail("この行は、実行されないはず");
        } catch (GscmApplicationException e) {
            assertEquals("NXS-E7-0142", e.getMessage());
        }

        userAuthList = new ArrayList<UserAuthDomain>();
        userDomain = new UserAuthDomain();
        userDomain.setDscId("srawj16");
        userAuthList.add(userDomain);
        
        criteria.setItemNoGrp("D");
        criteria.setPkgCd("");
        MockObjectManager.setReturnValueAtAllTimes(UserAuthServiceImpl.class, "getUserAuthList", userAuthList);
        try {
            domain = w9024ItemNoAplyStrtDtService.searchOnRegisterAddOrRefer(criteria);
            fail("この行は、実行されないはず");
        } catch (GscmApplicationException e) {
            assertEquals("NXS-E7-0143", e.getMessage());
        }

    }
    
    /**
     * 正常ケース
     *
     * @throws ApplicationException 例外発生した場合
     */
    @Test
    @Transactional
    public void testValidateConsistencyRevision() throws ApplicationException {
        
        assertTrue(w9024ItemNoAplyStrtDtService.validateConsistencyRevision(0, 1, false));
        assertFalse(w9024ItemNoAplyStrtDtService.validateConsistencyRevision(0, 2, false));
        assertTrue(w9024ItemNoAplyStrtDtService.validateConsistencyRevision(0, 1, true));
    }
    
    /**
     * 正常ケース
     *
     * @throws ApplicationException 例外発生した場合
     */
    @Test
    @Transactional
    public void testValidateDatabaseShipper() throws ApplicationException {
        
        MockObjectManager.setReturnValueAtAllTimes(UserAuthServiceImpl.class, "hasUserAuthForComp", true);
        assertTrue(w9024ItemNoAplyStrtDtService.validateDatabaseShipper("MYI"));

        MockObjectManager.setReturnValueAtAllTimes(UserAuthServiceImpl.class, "hasUserAuthForComp", true);
        try {
            assertTrue(w9024ItemNoAplyStrtDtService.validateDatabaseShipper("compCd000"));
            fail("この行は、実行されないはず");
        } catch (GscmApplicationException e) {
            assertEquals("NXS-E7-0111", e.getMessage());
        }

        MockObjectManager.setReturnValueAtAllTimes(UserAuthServiceImpl.class, "hasUserAuthForComp", false);
        try {
            w9024ItemNoAplyStrtDtService.validateDatabaseShipper("compCd999");
            fail("この行は、実行されないはず");
        } catch (SystemException e) {
            assertEquals("GSCM-I0-0009", e.getMessage());
        }
    }
}
