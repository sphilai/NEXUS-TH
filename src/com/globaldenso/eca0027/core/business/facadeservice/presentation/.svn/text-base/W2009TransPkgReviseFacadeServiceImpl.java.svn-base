/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0009;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0004;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W2009CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W2009ListDomain;
import com.globaldenso.eca0027.core.business.service.W2009CmlService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractSearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;

/**
 * This is an e services of TransPkgReviseFacad(s) implement class of a CML Main Screen.
 * <br />CML Main Screen画面のTransPkgReviseFacadeサービス実装クラスです。
 * <pre>
 * bean id:w2009TransPkgReviseFacadeService
 * </pre>
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W2009TransPkgReviseFacadeServiceImpl extends AbstractSearchFacadeService<List<W2009ListDomain>, W2009CriteriaDomain> {

    /**
     * CML service
     * <br />CML サービス
     */
    protected W2009CmlService w2009CmlService;
    
    /**
     * constructor.
     */
    public W2009TransPkgReviseFacadeServiceImpl() {
    }
    
    /**
     * Setter method for w2009CmlService.
     *
     * @param cmlService Set for w2009CmlService
     */
    public void setW2009CmlService(W2009CmlService cmlService) {
        w2009CmlService = cmlService;
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - functional specification common : detailed line selection check
     * </pre>
     * <pre>
     * - 機能仕様共通：明細行選択チェック
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W2009CriteriaDomain filterDomain(W2009CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {

        // Detailed line selection check
        // 明細行選択チェック
        if (StringUtils.isEmpty(criteriaDomain.getMainMark())) {
            List<MessageDomain> errList = Arrays.asList(new MessageDomain("selected", NXS_E7_0004, null));
            throw new ValidationException(errList);
        }
        return criteriaDomain;
    }
    
    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * No Action
     * </pre>
     * <pre>
     * 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W2009CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        // No Action
        // 処理なし
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - Authority check
     *     authFlg which is the item hidden of a screen -- 2: -- update   Case where data is chosen
     *     A screen change is made possible.
     *
     *     - registerAuthFlg is set as an argument.
     *       {@link W2009CmlService#validateConsistencyRegisterAuthByTransPkgRevise(String)} is called.
     *
     *     - An error message is set when false has returned above.
     *       {@link ValidationException} is thrown.
     *
     * </pre>
     * <pre>
     * - 権限チェック
     *   画面のhidden項目であるauthFlg が 2:更新 のデータが選択されている場合に
     *   画面遷移を可能とする。
     *   
     *   - registerAuthFlg を引数に設定し
     *     {@link W2009CmlService#validateConsistencyRegisterAuthByTransPkgRevise(String)}を呼出す。
     *   
     *   - 上記で false が返ってきた場合は、エラーメッセージをセットして
     *     {@link ValidationException} を throw する
     *   
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W2009CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        
        // Authority check
        // 権限チェック
        boolean result = w2009CmlService.validateConsistencyRegisterAuthByTransPkgRevise(criteriaDomain.getSelectedAuthFlg());
        if (!result) {
            // mainMark of error line is displayed in a red character.
            // エラー行のmainMarkを赤文字で表示する。
            String indexId = criteriaDomain.getSelectedIdx();
            String errorParam = "listDomainList[" + indexId + "].mainMark";
            List<MessageDomain> errList = Arrays.asList(new MessageDomain(errorParam, GSCM_I0_0009, null));
            throw new ValidationException(errList);
        }
        return;
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - Palletize Status check
     * </pre>
     * <pre>
     * - パレタイズステータスチェック
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W2009CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {

        String indexId = criteriaDomain.getSelectedIdx();
        String mainMark = criteriaDomain.getMainMark();
        
        List<String> errMessageIds = w2009CmlService.validateDatabaseTtPltzOnMainTransPkgRevise(mainMark);
        if (errMessageIds != null && errMessageIds.size() > 0) {
            List<MessageDomain> errList = new ArrayList<MessageDomain>();
            for (int i = 0;  i < errMessageIds.size(); i++) {
                String messageId = errMessageIds.get(i);
                // mainMark of error line is displayed in a red character.
                // エラー行のmainMarkを赤文字で表示する。
                String errorParam = "listDomainList[" + indexId + "].mainMark";
                errList.add(new MessageDomain(errorParam, messageId, null));
                throw new ValidationException(errList);
            }
        }
        return;
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * No Action
     * </pre>
     * <pre>
     * 処理なし
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected List<W2009ListDomain> callServices(W2009CriteriaDomain criteriaDomain) 
        throws GscmApplicationException, ApplicationException {

        return null;
    }

}
