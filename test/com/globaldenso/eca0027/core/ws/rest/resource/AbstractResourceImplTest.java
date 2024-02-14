package com.globaldenso.eca0027.core.ws.rest.resource;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_5004;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_ERROR;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_ERROR_SYSTEM;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.springframework.dao.CannotAcquireLockException;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.ResultDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2502ResultDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2503ResultDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2505ResultDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2507ResultDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2508ResultDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2510ResultDomain;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;

/**
 * {@link AbstractResourceImpl} のテストクラス。
 */
public class AbstractResourceImplTest {

    /** テスト対象 */
    private AbstractResourceImpl impl = new AbstractResourceImpl() {
    };

    /**
     * デフォルトコンストラクタ。
     */
    public AbstractResourceImplTest() {
    }

    /**
     * {@link AbstractResourceImpl#processApplicationException(ApplicationException, Class)} のためのテスト。
     */
    @Test
    public void testProcessApplicationException1() {
        ApplicationException e = new ApplicationException("a");

        assertThat(impl.processApplicationException(e, Ws2502ResultDomain.class), instanceOf(Ws2502ResultDomain.class));
        assertThat(impl.processApplicationException(e, Ws2503ResultDomain.class), instanceOf(Ws2503ResultDomain.class));
        assertThat(impl.processApplicationException(e, Ws2505ResultDomain.class), instanceOf(Ws2505ResultDomain.class));
        assertThat(impl.processApplicationException(e, Ws2507ResultDomain.class), instanceOf(Ws2507ResultDomain.class));
        assertThat(impl.processApplicationException(e, Ws2508ResultDomain.class), instanceOf(Ws2508ResultDomain.class));
        assertThat(impl.processApplicationException(e, Ws2510ResultDomain.class), instanceOf(Ws2510ResultDomain.class));
    }

    /**
     * {@link AbstractResourceImpl#processApplicationException(ApplicationException, Class)} のためのテスト。
     */
    @Test
    public void testProcessApplicationException2() {
        List<MessageDomain> msgs = new ArrayList<MessageDomain>();
        msgs.add(new MessageDomain("", "a", new String[] { "b", "c" }));
        ValidationException e = new ValidationException(msgs);
        ResultDomain result = impl.processApplicationException(e, ResultDomain.class);

        assertThat(result.getResultCode(), is(WS_RESULT_ERROR));
        assertThat(result.getErrorList().get(0).getErrorCode(), is("a"));
        assertThat(result.getErrorList().get(0).getErrorParamList().get(0).getParam(), is("b"));
        assertThat(result.getErrorList().get(0).getErrorParamList().get(1).getParam(), is("c"));
    }

    /**
     * {@link AbstractResourceImpl#processApplicationException(ApplicationException, Class)} のためのテスト。
     */
    @Test
    public void testProcessApplicationException3() {
        GscmApplicationException e = new GscmApplicationException("a", new Object[] { "b", "c" });
        ResultDomain result = impl.processApplicationException(e, ResultDomain.class);

        assertThat(result.getResultCode(), is(WS_RESULT_ERROR_SYSTEM));
        assertThat(result.getErrorList().get(0).getErrorCode(), is("a"));
        assertThat(result.getErrorList().get(0).getErrorParamList().get(0).getParam(), is("b"));
        assertThat(result.getErrorList().get(0).getErrorParamList().get(1).getParam(), is("c"));
    }

    /**
     * {@link AbstractResourceImpl#processApplicationException(ApplicationException, Class)} のためのテスト。
     */
    @Test
    public void testProcessApplicationException4() {
        ApplicationException e = new ApplicationException("a");
        ResultDomain result = impl.processApplicationException(e, ResultDomain.class);

        assertThat(result.getResultCode(), is(WS_RESULT_ERROR_SYSTEM));
        assertThat(result.getErrorList().get(0).getErrorCode(), is("a"));
    }

    /**
     * {@link AbstractResourceImpl#processApplicationException(ApplicationException, Class)} のためのテスト。
     */
    @Test
    public void testProcessApplicationException5() {
        ApplicationException e = new ApplicationException(new CannotAcquireLockException("This is a test."));
        ResultDomain result = impl.processApplicationException(e, ResultDomain.class);

        assertThat(result.getResultCode(), is(WS_RESULT_ERROR));    // 1
        assertThat(result.getErrorList().get(0).getErrorCode(), is(NXS_E1_5004));
    }
}
