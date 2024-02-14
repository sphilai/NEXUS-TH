/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0004;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W6001ListDomain;
import com.globaldenso.eca0027.core.business.domain.W6001UpdateDomain;
import com.globaldenso.eca0027.core.business.service.W6001DocService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractProcessFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;

/**
 * An implementation class of service for the Facade UploadFrtInv action of Documentation Invoice Main Screen screen.
 * <br />通関書類作成業務 Invoice Main Screen画面のUploadFrtInvアクションに対するFacadeサービスの実装クラスです。
 * <pre>
 * bean id: w6001UploadFrtInvFacadeService
 * </pre>
 *
 * @author $Author: 400616000304 $
 * @version $Revision: 11659 $
 */
public class W6001UploadFrtInvFacadeServiceImpl extends AbstractProcessFacadeService<W6001UpdateDomain, W6001UpdateDomain> {
  
    /**
     * Documentation Service.<br />
     * Documentationサービス
     */
    protected W6001DocService w6001DocService;
    
    /**
     * Default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public W6001UploadFrtInvFacadeServiceImpl(){
        super();
    }

    /**
     * Setter method for w6001DocService.
     *
     * @param docService Set for w6001DocService
     */
    public void setW6001DocService(W6001DocService docService) {
        w6001DocService = docService;
    }

    /**
     * {@inheritDoc}
     * <pre>
     * Line item selection check.
     * 明細行選択チェック
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W6001UpdateDomain filterDomain(W6001UpdateDomain updateDomain)
        throws GscmApplicationException, ApplicationException {
        // Line item selection check. 
        // 明細行選択チェック
        if (StringUtils.isEmpty(updateDomain.getW6001CriteriaDomain().getSelected())) {
            List<MessageDomain> errList = Arrays.asList(new MessageDomain("", NXS_E7_0004, null));
            throw new ValidationException(errList);
        }
        
        // Stores only selected rows
        // 選択した行のみを格納
        int selectedRow = Integer.parseInt(updateDomain.getW6001CriteriaDomain().getSelected());
        List<W6001ListDomain> listDomainList = new ArrayList<W6001ListDomain>();
        listDomainList.add(updateDomain.getListDomainList().get(selectedRow));
        
        updateDomain.setListDomainList(listDomainList);
        

        return updateDomain;
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * No action
     * 処理なし
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W6001UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * No action
     * 処理なし
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W6001UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * Transition condition check
     * - FRTinboice addition determination
     *   Setting to the search result selected item to the argument,
     *   then called the {@link W6001DocService#validateDatabaseTtInvoiceOnMainUploadFrtInv(String, String, java.util.Date)}.
     * </pre>
     * <pre>
     * 遷移条件チェック
     * ‐FRTinboice追加可否判定
     *     選択した検索結果リストの項目を引数に設定し、
     *     {@link W6001DocService#validateDatabaseTtInvoiceOnMainUploadFrtInv(String, String, java.util.Date)}を呼出します。
     * 
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W6001UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        
        W6001ListDomain listDomain = updateDomain.getListDomainList().get(0);
        
        String shipperCd = listDomain.getShipperCd();
        String invoiceNo = listDomain.getInvoiceNo();
        // ST184 INVOICE ISSUE DATE/インボイス発行日 MOD START
        //Date invoiceIssueDt = DateUtil.parseDate(listDomain.getInvoiceIssueDt(), listDomain.getScreenDateFormat());
        Date invoiceIssueDt = listDomain.getInvoiceIssueDt();
        // ST184 INVOICE ISSUE DATE/インボイス発行日 MOD START
        
        // Judgment additional FRT Invoice
        // FRT Invoice追加可否判定
        String msgCd = w6001DocService.validateDatabaseTtInvoiceOnMainUploadFrtInv(shipperCd, invoiceNo, invoiceIssueDt);
        if (StringUtils.isNotEmpty(msgCd)) {
            throw new ValidationException(Arrays.asList(new MessageDomain("", msgCd, null)));
        }
    }

    /**
     * {@inheritDoc}
     * <pre>
     * No action
     * 処理なし
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W6001UpdateDomain callServices(W6001UpdateDomain updateDomain) 
        throws GscmApplicationException, ApplicationException {

        return updateDomain;
    }
}
