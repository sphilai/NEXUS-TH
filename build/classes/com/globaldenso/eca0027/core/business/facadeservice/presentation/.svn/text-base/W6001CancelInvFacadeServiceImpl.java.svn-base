/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CANCEL_TYP_NORMAL;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_Y;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MANUAL_TYP_RE_INVOICE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0037;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0004;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0062;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W6001DocInvoiceDomain;
import com.globaldenso.eca0027.core.business.domain.W6001ListDomain;
import com.globaldenso.eca0027.core.business.domain.W6001UpdateDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W6001DocCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W6001DocService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractProcessFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;

/**
 * An implementation class of service for the Facade CancelInv action of Documentation Invoice Main Screen screen.
 * <br />通関書類作成業務 Invoice Main Screen画面のCancelInvアクションに対するFacadeサービスの実装クラスです。
 * <pre>
 * bean id: w6001CancelInvFacadeService
 * </pre>
 *
 * @author $Author: 400616000304 $
 * @version $Revision: 11686 $
 */
public class W6001CancelInvFacadeServiceImpl extends AbstractProcessFacadeService<W6001UpdateDomain, W6001UpdateDomain>{
    
    /**
     * Documentation Service.
     * <br />Documentation サービス
     */
    protected  W6001DocService w6001DocService;
     
    /**
     * The default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W6001CancelInvFacadeServiceImpl(){
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
     * Transition disabled If canceled invoice has been selected.
     * キャンセルインボイスが選択された場合遷移不可。
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W6001UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {

        // ST946 MANUAL SCREEN TRANSITION ADD START
        W6001ListDomain parInvoiceDomain = updateDomain.getListDomainList().get(0);
        if (!CANCEL_TYP_NORMAL.equals(parInvoiceDomain.getCancelTyp())) {
            throw new ValidationException(Arrays.asList(new MessageDomain(null, NXS_E1_0037, null)));
        }
        // ST946 MANUAL SCREEN TRANSITION ADD END
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * - Cancel determination 
     *   Setting to the search result selected item to the argument,
     *   then called the {@link W6001DocService#validateDatabaseTtInvoiceOnMainCancelInv(W6001DocInvoiceDomain)}.
     * </pre>
     * <pre> 
     * ‐Cancel 可否判定
     *     選択した検索結果項目を引数に設定し、
     *     {@link W6001DocService#validateDatabaseTtInvoiceOnMainCancelInv(W6001DocInvoiceDomain)}を呼出します。
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    @SuppressWarnings("unchecked")
    protected void validateDatabase(W6001UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        
        // ST946 MANUAL SCREEN TRANSITION ADD START

        W6001ListDomain parInvoiceDomain = updateDomain.getListDomainList().get(0); // selected invoice
        W6001ListDomain checkTargetInvoiceDomain = parInvoiceDomain;

        // if manual or re-invoice
        // =If the conditions are matched to transition to W6002(each canceling).
        // マニュアルかリインボイスの場合
        // =W6002（個別キャンセル）への遷移条件に当てはまる場合
        if (FLAG_Y.equals(parInvoiceDomain.getManualFlg()) || MANUAL_TYP_RE_INVOICE.equals(parInvoiceDomain.getManualTyp())) {

            // Search invoice to be displayed.
            // Since there is a possibility that the main invoice that has been selected is canceled.
            // 表示対象のインボイスを検索
            // 選択されているメインインボイスはキャンセルされている可能性があるため。

            W6001DocCriteriaDomain nextInvoiceCriteriaDomain = new W6001DocCriteriaDomain();
            // main invoice (= current invoice)
            nextInvoiceCriteriaDomain.setTakeOverParInvoiceShipperCd(parInvoiceDomain.getShipperCd());
            nextInvoiceCriteriaDomain.setTakeOverParInvoiceNo(parInvoiceDomain.getInvoiceNo());
            nextInvoiceCriteriaDomain.setTakeOverParInvoiceIssueDt(parInvoiceDomain.getInvoiceIssueDt());
            W6001DocInvoiceDomain nextInvoiceResultDomain = w6001DocService.searchNextInvoiceBySameParent(nextInvoiceCriteriaDomain);
            // if all canceled transition disabled
            // 全てキャンセルされている場合、遷移不可
            if (nextInvoiceResultDomain == null) {
                throw new ValidationException(Arrays.asList(new MessageDomain("", NXS_E7_0062, null)));
            }

            // Invoice of the display object and return it to add as the next element of the selected invoice.
            // Guaranteed list of 2 elements.
            // 表示対象のインボイスは選択インボイスの次要素としてaddして返す。
            // リストは2要素を保証。
            W6001ListDomain nextInvoiceDomain = new W6001ListDomain();
            nextInvoiceDomain.setShipperCd(nextInvoiceResultDomain.getShipperCd());
            nextInvoiceDomain.setInvoiceNo(nextInvoiceResultDomain.getInvoiceNo());
            nextInvoiceDomain.setInvoiceIssueDt(nextInvoiceResultDomain.getInvoiceIssueDt());
            ((List<W6001ListDomain>)(updateDomain.getListDomainList())).add(nextInvoiceDomain);

            checkTargetInvoiceDomain = nextInvoiceDomain;
        }

        // ST946 MANUAL SCREEN TRANSITION ADD END

        // ST946 MANUAL SCREEN TRANSITION MOD START
        //W6001DocInvoiceDomain invoiceDomain = createW6001DocInvoiceDomain(updateDomain.getListDomainList().get(0), updateDomain.getScreenDateFormat());
        W6001DocInvoiceDomain invoiceDomain = createW6001DocInvoiceDomain(checkTargetInvoiceDomain, updateDomain.getScreenDateFormat());
        // ST946 MANUAL SCREEN TRANSITION MOD END
        
        String msgCd = w6001DocService.validateDatabaseTtInvoiceOnMainCancelInv(invoiceDomain);
        if (StringUtils.isNotEmpty(msgCd)) {
            throw new ValidationException(Arrays.asList(new MessageDomain("", msgCd, null)));
        }
        
        //convertListDomain(updateDomain.getListDomainList().get(0), invoiceDomain, updateDomain.getScreenDateFormat());
            // ST946 MANUAL SCREEN TRANSITION DEL
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
    
    /**
     * Setting the search criteria domain.
     * <br />検索条件ドメインを設定します。
     * 
     * @param listDomain List the selected domain<br />
     * 選択したリストドメイン
     * @return Search conditions domain (Invoice)<br />
     * 検索条件ドメイン（インボイス）
     * @param dateFormat Date format<br />
     * 日付フォーマット
     */
    protected W6001DocInvoiceDomain createW6001DocInvoiceDomain(W6001ListDomain listDomain, String dateFormat) {
        W6001DocInvoiceDomain invoiceDomain = new W6001DocInvoiceDomain();
        
        CommonUtil.copyPropertiesDomainToDomain(invoiceDomain, listDomain, dateFormat);
        
        return invoiceDomain;
    }
    
    /**
     * Converting to the screen wrist domain search results.
     * <br />検索結果を画面用リストドメインに変換します。
     * 
     * @param listDomain Screen wrist domain<br />
     * 画面用リストドメイン 
     * @param invoiceDomain Search Result (Invoice domain)<br />
     * 検索結果（インボイスドメイン）
     * @param dateFormat Date format<br />
     * 日付フォーマット
     */
    protected void convertListDomain (W6001ListDomain listDomain, W6001DocInvoiceDomain invoiceDomain, String dateFormat) {
        
        CommonUtil.copyPropertiesDomainToDomain(listDomain, invoiceDomain, dateFormat);
        
    }
}
