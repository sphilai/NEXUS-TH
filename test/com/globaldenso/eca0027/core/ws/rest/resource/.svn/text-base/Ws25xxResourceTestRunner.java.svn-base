package com.globaldenso.eca0027.core.ws.rest.resource;

import static org.springframework.transaction.annotation.Propagation.REQUIRES_NEW;

import java.lang.reflect.Method;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.InitializationError;
import org.junit.runners.model.Statement;
import org.springframework.context.ApplicationContext;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import com.globaldenso.eca0027.core.AbstractEca0027Test;

/**
 * <br />Ws25xxResourceTest のテストクラスを実行するためのランナークラス。
 * 
 * AbstractEca0027Test を使用すると必ずトランザクションがロールバックされてしまうため
 * WEBサービスのテストのためのデータを @Before で事前に準備することができない。
 * そこで、このランナーでは @Before の処理の間だけ別のトランザクションを開始して
 * コミットできるようにしている。
 * 
 * 注意！！
 * このランナーを使用すると最低でも2つのデータベース接続が必要になるため、
 * あらかじめコネクションプールの設定を確認しておくこと。
 *
 * @author $Author$
 * @version $Revision$
 */
public class Ws25xxResourceTestRunner extends org.junit.runners.BlockJUnit4ClassRunner {

    /**
     * コンストラクタ
     * 
     * @param klass テストクラス
     * @throws InitializationError 初期化時にエラーが発生した場合
     */
    public Ws25xxResourceTestRunner(Class<?> klass) throws InitializationError {
        super(klass);
    }

    /**
     * {@inheritDoc}
     * 
     * @see org.junit.runners.BlockJUnit4ClassRunner#withBefores(org.junit.runners.model.FrameworkMethod, java.lang.Object, org.junit.runners.model.Statement)
     */
    @SuppressWarnings("deprecation")
    protected Statement withBefores(FrameworkMethod method, final Object target,
            final Statement statement) {

        if (!(target instanceof AbstractEca0027Test)) {
            return super.withBefores(method, target, statement);
        }

        final List<FrameworkMethod> befores = getTestClass().getAnnotatedMethods(Before.class);

        if (befores.isEmpty()) {
            return statement;
        }

        return new Statement() {
            public void evaluate() throws Throwable {

                PlatformTransactionManager txManager = null;
                TransactionStatus tx = null;

                try {

                    for (FrameworkMethod before : befores) {

                        before.invokeExplosively(target);

                        // AbstractEca0027Test の @Before が終了した時点で新規でトランザクションを開始する。
                        // AbstractEca0027Test の @Before が終了しないと ApplicationContext が生成されていないので...
                        // AbstractEca0027Test には @Before が一つのみ存在することを想定している。
                        // もし @Before を追加した場合は正しく動作しないだろう...
                        if (AbstractEca0027Test.class.equals(before.getMethod().getDeclaringClass())) {
                            txManager = getTransactionManager((AbstractEca0027Test) target);
                            tx = beginNewTransaction(txManager);
                        }
                    }

                    // 全ての @Before が終了した時点でトランザクションを終了

                    if (txManager != null && tx != null) {
                        txManager.commit(tx);
                    }

                } catch (Throwable t) {

                    if (txManager != null && tx != null) {
                        txManager.rollback(tx);
                    }

                    throw t;
                }

                statement.evaluate();
            }
        };
    }

    /**
     * {@inheritDoc}
     * 
     * @see org.junit.runners.BlockJUnit4ClassRunner#withAfters(org.junit.runners.model.FrameworkMethod, java.lang.Object, org.junit.runners.model.Statement)
     */
    @SuppressWarnings("deprecation")
    protected Statement withAfters(FrameworkMethod method, final Object target,
            final Statement statement) {

        if (!(target instanceof AbstractEca0027Test)) {
            return super.withAfters(method, target, statement);
        }

        final List<FrameworkMethod> afters = getTestClass().getAnnotatedMethods(After.class);

        if (afters.isEmpty()) {
            return statement;
        }

        return new Statement() {
            public void evaluate() throws Throwable {

                try {
                    statement.evaluate();

                } finally {

                    PlatformTransactionManager txManager = null;
                    TransactionStatus tx = null;

                    try {

                        // すべての @After が開始する前に新規でトランザクションを開始する。
                        
                        txManager = getTransactionManager((AbstractEca0027Test) target);
                        tx = beginNewTransaction(txManager);

                        for (FrameworkMethod after : afters) {

                            // AbstractEca0027Test には @After が一つのみ存在することを想定している。
                            // もし @After を追加した場合は正しく動作しないだろう...
                            if (AbstractEca0027Test.class.equals(after.getMethod().getDeclaringClass())) {

                                // AbstractEca0027Testの @After が開始する前にトランザクションを終了

                                if (txManager != null && tx != null) {
                                    txManager.commit(tx);
                                }
                            }

                            after.invokeExplosively(target);
                        }

                    } catch (Throwable t) {

                        if (txManager != null && tx != null) {
                            txManager.rollback(tx);
                        }

                        throw t;
                    }
                }
            }
        };
    }

    /**
     * テスト対象からトランザクションマネージャを取得して返す。
     * 
     * @param target テスト対象
     * @return トランザクションマネージャー
     * @throws Exception 何らかのエラーが発生した場合
     */
    private PlatformTransactionManager getTransactionManager(AbstractEca0027Test target) throws Exception {
        Method m = AbstractEca0027Test.class.getDeclaredMethod("getContext");
        m.setAccessible(true);
        ApplicationContext context = (ApplicationContext) m.invoke(target);
        return (PlatformTransactionManager) context.getBean("transactionManager");
    }

    /**
     * トランザクションを新しく開始する。
     * 
     * @param txManager トランザクションマネージャー
     * @return トランザクションステータス
     */
    private TransactionStatus beginNewTransaction(PlatformTransactionManager txManager) {
        DefaultTransactionDefinition definition = new DefaultTransactionDefinition();
        definition.setPropagationBehavior(REQUIRES_NEW.value());
        return txManager.getTransaction(definition);
    }
}
