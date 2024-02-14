/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.VtCompMeasureUnitDomain;
import com.globaldenso.eca0027.core.business.domain.W2001PltzInstrItemDomain;
import com.globaldenso.eca0027.core.business.domain.W2004ListDomain;
import com.globaldenso.eca0027.core.business.domain.W2004UpdateDomain;
import com.globaldenso.eca0027.core.business.service.W2001PltzInstrService;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractDeleteFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.NumberUtil;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FORMAT_WEIGHT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NO_DATA;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0004;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CHECK_ON;


/**
 * This is an implement class of the Facade service to Delete action of a Packaging Instruction (=Pull) Create screen.
 * <br />梱包指示Create画面のDeleteアクションに対するFacadeサービスの実装クラスです。
 * <pre>
 * bean id: w2004DeleteFacadeService
 * </pre>
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W2004DeleteFacadeServiceImpl extends AbstractDeleteFacadeService<List<? extends W2004ListDomain>, W2004UpdateDomain> {

    /**
     * Common service
     * <br />共通サービス
     */
    protected CommonService commonService;
    
    /**
     * Packaging Instruction (=Pull) service
     * <br />梱包指示サービス
     */
    protected W2001PltzInstrService w2001PltzInstrService;
    
    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W2004DeleteFacadeServiceImpl() {
    }

    /**
     * Setter method for commonService.
     *
     * @param commonService Set for commonService
     */
    public void setCommonService(CommonService commonService) {
        this.commonService = commonService;
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
     * - Detailed line selection check
     *       This is a common-specifications .xls "functional common-specifications" No.12 particulars line selection check for details.   This is referred to.
     *
     * - Extraction of a target domain
     *       The List domain selected in the pictures is extracted, and it sets to a mass update domain.
     *
     * - 明細行選択チェック
     *     詳細は共通仕様.xls「機能共通仕様」No.12 明細行選択チェック 参照
     *     
     * - 対象ドメインの抽出
     *     画面で選択されたListドメインを抽出し、一括更新ドメインに設定する
     * </pre>
     * 
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W2004UpdateDomain filterDomain(W2004UpdateDomain updateDomain)
        throws GscmApplicationException, ApplicationException {

        List<W2004ListDomain> newListDomainList = new ArrayList<W2004ListDomain>();
        
        // selected List domain is extracted.
        // 選択されたListドメインを抽出
        for (W2004ListDomain listDomain : updateDomain.getListDomainList()) {
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
        
        // extracted setting of a List domain
        // 抽出したListドメインの設定
        updateDomain.setListDomainList(newListDomainList);
        
        return updateDomain;
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
    protected void validateItems(W2004UpdateDomain updateDomain)
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
    protected void validateConsistency(W2004UpdateDomain updateDomain)
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
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W2004UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        // No Action
        // 処理なし
    }

    /**
     * {@inheritDoc}
     * <pre>
     * A create of - Palletize Instruction Item No Work
     *       It changes into {@link W2001PltzInstrItemDomain} from {@link W2004ListDomain}.
     *
     * A delete of - Palletize Instruction Item No Work
     *       {@link W2001PltzInstrService#deleteOnRegisterDelete(List)} is called for created {@link W2001PltzInstrItemDomain} to an argument.
     *
     * A converted in - List domain
     *       The contents which carried out re retrieval are changed into {@link W2004ListDomain}.
     *
     * - 梱包指示品目番号ワークの作成
     *     {@link W2004ListDomain}から{@link W2001PltzInstrItemDomain}に変換する
     *     
     * - 梱包指示品目番号ワークの削除
     *     作成した{@link W2001PltzInstrItemDomain}を引数に、{@link W2001PltzInstrService#deleteOnRegisterDelete(List)}を呼出す
     * 
     * - Listドメインへの変換
     *     再検索した内容を{@link W2004ListDomain}に変換する
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected List<? extends W2004ListDomain> callServices(W2004UpdateDomain updateDomain) 
        throws GscmApplicationException, ApplicationException {

        // A create of Palletize Instruction Item No Work
        // 梱包指示品目番号ワークの作成
        List<? extends W2001PltzInstrItemDomain> pltzInstrItemList = createPltzInstrItem(updateDomain.getListDomainList());

        // A delete of Palletize Instruction Item No Work
        // 梱包指示品目番号ワークの削除
        pltzInstrItemList = w2001PltzInstrService.deleteOnRegisterDelete(pltzInstrItemList);
        
        // A converted in a List domain
        // Listドメインへの変換
        return convertToListDomain(pltzInstrItemList, updateDomain.getCriteriaDomain().getShipperCd());
    }

    /**
     * {@link W2004ListDomain} is changed into {@link W2001PltzInstrItemDomain}.
     * <br />{@link W2004ListDomain}を{@link W2001PltzInstrItemDomain}に変換します。
     *
     * @param listDomainList The list of {@link W2004ListDomain}<br />{@link W2004ListDomain}のリスト
     * @return The list of {@link W2001PltzInstrItemDomain}<br />{@link W2001PltzInstrItemDomain}のリスト
     */
    protected List<? extends W2001PltzInstrItemDomain> createPltzInstrItem(List<? extends W2004ListDomain> listDomainList) {
        List<W2001PltzInstrItemDomain> pltzInstrItemList = new ArrayList<W2001PltzInstrItemDomain>();

        for (W2004ListDomain listDomain : listDomainList) {
            W2001PltzInstrItemDomain pltzInstrItem = new W2001PltzInstrItemDomain();
            
            CommonUtil.copyPropertiesDomainToDomain(pltzInstrItem, listDomain);
            
            pltzInstrItemList.add(pltzInstrItem);
        }
        
        return pltzInstrItemList;
    }

    /**
     * {@link W2001PltzInstrItemDomain} is changed into {@link W2004ListDomain}. (at the time of the changes from a Create screen)
     * <br />{@link W2001PltzInstrItemDomain}を{@link W2004ListDomain}に変換します。(Create画面からの遷移時)
     *
     * @param pltzInstrItemList {@link W2001PltzInstrItemDomain} of a changing agency<br />変換元の{@link W2001PltzInstrItemDomain}
     * @param shipperCd The COMPANY CODE of Shipper<br />Shipperの会社コード
     * @return Created {@link W2004ListDomain}<br />作成した{@link W2004ListDomain}
     * @throws ApplicationException When the WEIGHT UNIT of Shipper is unacquirable<br />Shipperの重量単位が取得できない場合
     */
    protected List<? extends W2004ListDomain> convertToListDomain(List<? extends W2001PltzInstrItemDomain> pltzInstrItemList, String shipperCd) 
        throws ApplicationException {
        
        List<W2004ListDomain> listDomainList = new ArrayList<W2004ListDomain>();
        
        // Acquisition of the WEIGHT UNIT of Shipper
        // Shipperの重量単位の取得
        VtCompMeasureUnitDomain measureUnit = commonService.searchMeasureUnit(shipperCd);
        
        for (W2001PltzInstrItemDomain pltzInstrItem : pltzInstrItemList) {
            W2004ListDomain listDomain = new W2004ListDomain();
            
            // A setting of Palletize Instruction Item No Work
            // 梱包指示品目番号ワークの設定
            CommonUtil.copyPropertiesDomainToDomain(listDomain, pltzInstrItem);
            
            // Setting of a WEIGHT UNIT
            // 重量単位の設定
            listDomain.setWeightUnit(measureUnit.getWeightUnit());
            listDomain.setWeightUnitDisp(measureUnit.getWeightUnitDisp());
            
            // A setting of Total N/W
            // Total N/Wの設定
            if (pltzInstrItem.getTotalNetWeight() == null) {
                listDomain.setTotalNetWeight(NO_DATA);
            } else {
                listDomain.setTotalNetWeight(NumberUtil.format(pltzInstrItem.getTotalNetWeight(), FORMAT_WEIGHT));
            }
            
            listDomainList.add(listDomain);
        }
        
        return listDomainList;
    }
}
