package com.globaldenso.eca0027.core.job;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.PlatformTransactionManager;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.service.ComnAuxService;

/**
 * Type in the functional overview of the class.
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class ECA0027T0100ChildJob01Test {

    /** transactOnComnAux が呼び出されたことを表すフラグ */
    private boolean called = false;

    /**
     * デフォルトコンストラクタ
     */
    public ECA0027T0100ChildJob01Test() {
    }

    /**
     * {@link ECA0027T0100ChildJob01#mainBizProc(com.globaldenso.ai.aijb.core.business.domain.JobInputDomain)} のテスト
     *
     * @throws ApplicationException  何らかのエラーが発生した場合
     */
    @Test
    public void testMainBizProcWithStub() throws ApplicationException {

        ComnAuxService comnAuxService = new ComnAuxService() {
            public void transactOnComnAux() throws ApplicationException {
                called = true;
            }
        };

        ECA0027T0100ChildJob01 job = new ECA0027T0100ChildJob01();
        job.setComnAuxService(comnAuxService);
        job.mainBizProc(null);

        assertTrue(called);
    }

    /**
     * {@link ECA0027T0100ChildJob01#mainBizProc(com.globaldenso.ai.aijb.core.business.domain.JobInputDomain)} のテスト
     *
     * @throws ApplicationException  何らかのエラーが発生した場合
     */
    @Test
    @Ignore
    public void testMainBizProc() throws ApplicationException {

        ApplicationContext context = new ClassPathXmlApplicationContext("ECA0027T0100ChildJob01Test-context.xml", getClass());

        PlatformTransactionManager txManager = (PlatformTransactionManager) context.getBean("transactionManager");
        txManager.getTransaction(null).setRollbackOnly();

        ECA0027T0100ChildJob01 job = (ECA0027T0100ChildJob01) context.getBean("childJobBase1");

        job.mainBizProc(null);
    }
}
