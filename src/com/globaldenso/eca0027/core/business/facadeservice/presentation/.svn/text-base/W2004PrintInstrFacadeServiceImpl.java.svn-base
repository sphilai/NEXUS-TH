/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import java.io.File;
import java.util.Arrays;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W2001PltzInstrDomain;
import com.globaldenso.eca0027.core.business.domain.W2004CriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W2001PltzInstrService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractUpdateFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0010;

/**
 *    This is an implement class of the Facade service to PrintInstr action of a Packaging Instruction (=Pull) Register screen.
 * <br />梱包指示Register画面のPrintInstrアクションに対するFacadeサービスの実装クラスです。
 * <pre>
 * bean id: w2004PrintInstrFacadeService
 * </pre>
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W2004PrintInstrFacadeServiceImpl extends AbstractUpdateFacadeService<File, W2004CriteriaDomain> {

    /**
     * Packaging Instruction (=Pull) service
     * <br />梱包指示サービス
     */
    protected W2001PltzInstrService w2001PltzInstrService;
    
    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W2004PrintInstrFacadeServiceImpl() {
    }
    
    /**
     * Setter method for w2001PltzInstrService.
     *
     * @param pltzInstrService Set for w2001PltzInstrService
     */
    public void setW2001PltzInstrService(W2001PltzInstrService pltzInstrService) {
        w2001PltzInstrService = pltzInstrService;
    }

    /**
     * {@inheritDoc}
     * <pre>
     * No Action
     * 
     * 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W2004CriteriaDomain filterDomain(W2004CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {
        // No Action
        // 処理なし
        return criteriaDomain;
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * No Action
     * 
     * 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W2004CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        // No Action
        // 処理なし
    }

    /**
     * {@inheritDoc}
     * <pre>
     * No Action
     * 
     * 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W2004CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        // No Action
        // 処理なし
    }

    /**
     * {@inheritDoc}
     * <pre>
     * - select data's existence check
     *       {@link W2001PltzInstrService#validateDatabaseTtPltzInstrOnRegisterPrintInstr(String)} is called and an existence check is performed.
     *       When data does not exist, a throw of the {@link ValidationException} is carried out.
     * 
     * - 選択データの存在チェック
     *     {@link W2001PltzInstrService#validateDatabaseTtPltzInstrOnRegisterPrintInstr(String)}を呼出し、存在チェックを行う
     *     データが存在しない場合、{@link ValidationException}をスローする
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W2004CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {

        String pltzInstrNo = criteriaDomain.getPltzInstrNo();
        
        // select data's existence check
        // 選択データの存在チェック
        if (!w2001PltzInstrService.validateDatabaseTtPltzInstrOnRegisterPrintInstr(pltzInstrNo)) {
            List<MessageDomain> errList = Arrays.asList(new MessageDomain("", GSCM_E0_0010, null));
            
            throw new ValidationException(errList);
        }
    }

    /**
     * {@inheritDoc}
     * <pre>
     * A create of - PDF list
     *       {@link W2001PltzInstrDomain} is created and the following item is set up.
     *         - Packaging Instruction (=Pull) NO
     *       {@link W2001PltzInstrService#updatePrintInstr(W2001PltzInstrDomain, String)} is called, and a PDF list is created (the update of a PALLETIZE INSTRUCTION STATUS is included).
     *
     * - Update of a search-condition domain
     *       Since the result of a PDF list create is reflected, the following item of a search-condition domain is updated.
     *         - PALLETIZE INSTRUCTION STATUS
     *
     * A return of - PDF list
     * 
     * - PDF帳票の作成
     *     {@link W2001PltzInstrDomain}を作成し、下記項目を設定する
     *       - 梱包指示NO
     *     {@link W2001PltzInstrService#updatePrintInstr(W2001PltzInstrDomain, String)}を呼出し、PDF帳票の作成(梱包指示ステータスの更新を含む)を行う
     *     
     * - 検索条件ドメインの更新
     *     PDF帳票作成の結果を反映するために、検索条件ドメインの下記項目を更新する
     *       - 梱包指示ステータス
     *     
     * - PDF帳票の返却
     * </pre>
     * 
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected File callServices(W2004CriteriaDomain criteriaDomain) 
        throws GscmApplicationException, ApplicationException {
        
        // Create of a Packaging Instruction (=Pull)
        // 梱包指示の作成
        W2001PltzInstrDomain pltzInstr = createPltzInstr(criteriaDomain);
        
        // A create of PDF list
        // PDF帳票の作成
        File pdfReport = w2001PltzInstrService.updatePrintInstr(pltzInstr, criteriaDomain.getReportDateFormat());
        
        // The update of PALLETIZE INSTRUCTION STATUS
        // 梱包指示ステータスの更新
        criteriaDomain.setPltzInstrStatus(pltzInstr.getPltzInstrStatus());
        
        return pdfReport;
    }
    
    /**
     * {@link W2001PltzInstrDomain} is created from a search condition.
     * <br />検索条件から{@link W2001PltzInstrDomain}を作成します。
     *
     * @param criteriaDomain Search-condition domain<br />検索条件ドメイン
     * @return Created {@link W2001PltzInstrDomain}<br />作成した{@link W2001PltzInstrDomain}
     */
    protected W2001PltzInstrDomain createPltzInstr(W2004CriteriaDomain criteriaDomain) {
        W2001PltzInstrDomain pltzInstr = new W2001PltzInstrDomain();
        
        CommonUtil.copyPropertiesDomainToDomain(pltzInstr, criteriaDomain);
        
        return pltzInstr;
    }
}
