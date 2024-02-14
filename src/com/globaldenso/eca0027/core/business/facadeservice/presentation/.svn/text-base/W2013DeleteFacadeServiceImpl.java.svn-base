/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CHECK_ON;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0004;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W2009CmlDomain;
import com.globaldenso.eca0027.core.business.domain.W2009CmlItemDomain;
import com.globaldenso.eca0027.core.business.domain.W2013ListDomain;
import com.globaldenso.eca0027.core.business.domain.W2013UpdateDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W2009CmlCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W2009CmlService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractDeleteFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;


/**
 * The delete service facade implementation class of CML PKG Info Detail
 * <br />CML PKG Info Detail画面のDeleteFacadeサービス実装クラスです。
 * <pre>
 * bean W2013DeleteFacadeService
 * </pre>
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W2013DeleteFacadeServiceImpl extends AbstractDeleteFacadeService<List<? extends W2013ListDomain>, W2013UpdateDomain> {

    /**
     * CML service
     * <br />CMLサービス
     */
    protected W2009CmlService w2009CmlService;
    
    /**
     * constructor.
     * <br /> デフォルトコンストラクタ
     */
    public W2013DeleteFacadeServiceImpl() {
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
     * - Detailed line selection check
     * 
     * - 明細行選択チェック
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W2013UpdateDomain filterDomain(W2013UpdateDomain updateDomain)
        throws GscmApplicationException, ApplicationException {
        
        List<W2013ListDomain> newListDomainList = new ArrayList<W2013ListDomain>();
        
        // selected List domain is extracted.
        // 選択されたListドメインを抽出
        for (int i = 0; i < updateDomain.getListDomainList().size(); i++) {
            W2013ListDomain listDomain = (W2013ListDomain)updateDomain.getListDomainList().get(i);
            
            if (CHECK_ON.equals(listDomain.getSelected())) {
                newListDomainList.add(listDomain);
            }
        }
        
        // Detailed line selection check
        // 明細行選択チェック
        if (newListDomainList.size() == 0) {
            List<MessageDomain> errList = Arrays.asList(new MessageDomain("", NXS_E7_0004, null));
            
            throw new ValidationException(errList);
        }
        
        // A create of new Update domain
        // 新しいUpdateドメインの作成
        W2013UpdateDomain newUpdateDomain = new W2013UpdateDomain();
    
        // Copy of property
        // プロパティのコピー
        CommonUtil.copyPropertiesDomainToDomain(newUpdateDomain, updateDomain);
        
        // extracted setting of a List domain
        // 抽出したListドメインの設定
        newUpdateDomain.setListDomainList(newListDomainList);
        
        return newUpdateDomain;

    }
    
    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * No Action
     * 
     * 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W2013UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * No Action
     * 
     * 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W2013UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * No Action
     * 
     * 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W2013UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - Delete process of the Palletize-Item-Work data currently checked
     * - Re retrieval processing after a delete (this is a screen setting for an initial display)
     * 
     * - チェックされているパレタイズ対象品ワークデータの削除処理
     * - 削除後、再検索処理（初期表示用に画面設定）
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected List<? extends W2013ListDomain> callServices(W2013UpdateDomain updateDomain)
        throws GscmApplicationException, ApplicationException {

        W2009CmlCriteriaDomain criteria = new W2009CmlCriteriaDomain();
        // DSC_ID
        // DSC_ID
        criteria.setLoginUserDscId(updateDomain.getLoginUserDscId());
        
        List<? extends W2013ListDomain> listDomain = updateDomain.getListDomainList();
        
        // the selected item BRCH is acquired.
        // 選択されたBRCH項目を取得
        List<String> brchList = new ArrayList<String>();
        for (W2013ListDomain w2013ListDomain : listDomain) {
            brchList.add(w2013ListDomain.getBrch());
        }
        
        // Palletize-Item-Work data is deleted.
        // パレタイズ対象品ワークデータを削除
        w2009CmlService.transactOnDetailDelete(criteria, brchList);
        
        // Acquisition of a re retrieval result
        // 再検索結果の取得
        List<W2013ListDomain> list = new ArrayList<W2013ListDomain>();
        
        // Search-condition setting for re retrieval
        // 再検索用の検索条件設定
        CommonUtil.copyPropertiesDomainToDomain(criteria, updateDomain.getCriteriaDomain());
        criteria.setLoginUserDscId(updateDomain.getLoginUserDscId());
        // This is made not to perform a number-of-cases check.
        // 件数チェックを行わないようにする
        criteria.setSearchCountCheckFlg(false);
        
        // Re retrieval
        // 再検索
        W2009CmlDomain w2009CmlDomain = w2009CmlService.searchOnDetailInit(criteria, updateDomain.getScreenId());

        
        // search results are set as the domain for a display.
        // 検索結果を表示用のドメインに設定
        for (W2009CmlItemDomain w2009CmlItemDomain : w2009CmlDomain.getCmlItemDomainList()) {
            W2013ListDomain w2013ListDomain = new W2013ListDomain();
            w2013ListDomain.setInputMethod(w2009CmlItemDomain.getInputMethod());
            w2013ListDomain.setRtFlg(w2009CmlItemDomain.getRtFlg());
            w2013ListDomain.setPkgTyp(w2009CmlItemDomain.getPkgTyp());
            w2013ListDomain.setPkgItemNo(w2009CmlItemDomain.getPltzItemNo());
            w2013ListDomain.setSelected("");
            w2013ListDomain.setModelCd(w2009CmlItemDomain.getModelCd());
            w2013ListDomain.setMixTagNo(w2009CmlItemDomain.getMixTagNo());
            w2013ListDomain.setQty(decimalToString(w2009CmlItemDomain.getQty()));
            w2013ListDomain.setTotalQty(decimalToString(w2009CmlItemDomain.getTotalQty()));
            w2013ListDomain.setBrch(decimalToString(w2009CmlItemDomain.getBrch()));
            w2013ListDomain.setItemDescription(w2009CmlItemDomain.getItemDescription());
            w2013ListDomain.setPkgTypHidden(w2009CmlItemDomain.getPkgTypHidden());
            w2013ListDomain.setPkgWeight(decimalToString(w2009CmlItemDomain.getPkgWeight()));
            w2013ListDomain.setWeightUnit(w2009CmlItemDomain.getWeightUnit());
            w2013ListDomain.setOriginCntryCd(w2009CmlItemDomain.getOriginCntryCd());
            w2013ListDomain.setCurrCd(w2009CmlItemDomain.getCurrCd());
            w2013ListDomain.setInputMethTyp(w2009CmlItemDomain.getInputMethTyp());
            list.add(w2013ListDomain);
        }
        return list;
        
    }

    /**
     * Change the VALUE of BigDecimal into a string.
     * <br />BigDecimalの値を文字列に変換する。
     * <pre>
     * - null is returned when an argument is null.
     *     When this is not null, the result of having carried out {@link BigDecimal#toPlainString()} to the argument is returned.
     * 
     * - 引数がnullの場合は、null を返す。
     *   nullでない場合は、引数に対して {@link BigDecimal#toPlainString()} を実施した結果を返す。
     * </pre>
     * @param decimalVal The VALUE of BigDecimal<br />BigDecimalの値
     * @return String<br />文字列
     */
    protected String decimalToString(BigDecimal decimalVal){
        
        if (decimalVal == null ) {
            return null;
        }
        return decimalVal.toPlainString();
        
    }

}
