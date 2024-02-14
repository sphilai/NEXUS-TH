/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0157;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.dao.Wt006OuterPkgSelectDao;
import com.globaldenso.eca0027.core.business.domain.Wt006OuterPkgSelectDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Wt006OuterPkgSelectCriteriaDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.exception.ValidationException;

/**
 * The search service implementation class of Outer Package Search Sub Screen.
 * <br />
 * 外装選択子画面のService実装クラスです。
 * 
 * @author $Author: 10088DS50272 $
 * @version $Revision: 10090 $
 */

public class Wt006OuterPkgSelectServiceImpl implements Wt006OuterPkgSelectService {

    /**
     * CommonService
     */
    protected CommonService commonService;
    
    /**
     * Wt006OuterPkgSelectDao
     */
    private Wt006OuterPkgSelectDao wt006OuterPkgSelectDao;

    /**
     * Default constructor.
     */
    public Wt006OuterPkgSelectServiceImpl() {
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
     * <p>
     * Setter method for wt006OuterPkgSelectDao.
     * </p>
     * 
     * @param wt006OuterPkgSelectDao Set for wt006OuterPkgSelectDao
     */
    public void setWt006OuterPkgSelectDao(Wt006OuterPkgSelectDao wt006OuterPkgSelectDao) {
        this.wt006OuterPkgSelectDao = wt006OuterPkgSelectDao;
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * This method calls the dao to search for the outer package information.
     * 外装情報の検索結果を取得するDAOを呼び出します。
     * - If the previous row are the same outerPkgCd  do not set a length, width, height.
     * - Convert the unit of Length and Width and Height.
     *      Call commonService.convertLengthUnit with Search result length information as an argument.
     * - Convert the unit of Volume.
     *      Call commonService.convertVolumeUnit with Search result volume information as an argument.
     * 
     * - 前行とouterPkgCdが同一の場合、outerPkgCd,length,width,heightは値を設定しない
     * - 縦、横、高さの単位変換
     *       検索結果の縦情報を引数にcommonService.convertLengthUnitの呼び出し
     * - 容積の単位変換
     *       検索結果の容積情報を引数にcommonService.convertVolumeUnitの呼び出し
     * </pre>
     * 
     * @see com.globaldenso.eca0027.core.auto.business.service.Wt006OuterPkgSelectDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.Wt006OuterPkgSelectCriteriaDomain)
     */
    public List<Wt006OuterPkgSelectDomain> searchByConditionForPaging(
        Wt006OuterPkgSelectCriteriaDomain criteria) throws ApplicationException {

        List<Wt006OuterPkgSelectDomain> resultList = wt006OuterPkgSelectDao
        .searchByConditionForPaging(criteria);
    
        // Create error list.
        List<MessageDomain> errList = new ArrayList<MessageDomain>();
        
        // If the previous row are the same outerPkgCd do not set a length, width,
        // height.
        String compareSource = "";
        String compareTarget;
        for (int i = 0; i < resultList.size(); ++i) {
            compareTarget = resultList.get(i).getOuterPkgCd();

            if (compareSource.equals(compareTarget)) {
                resultList.get(i).setOuterPkgCd(null);
                resultList.get(i).setLengthAfter(null);
                resultList.get(i).setWidthAfter(null);
                resultList.get(i).setHeightAfter(null);
            } else {
                compareSource = resultList.get(i).getOuterPkgCd();
            }

            if (resultList.get(i).getOuterPkgCd() != null) {
                // Convert the unit of Length and Width and Height.
                if (!resultList.get(i).getLengthUnitComp().equals(
                    resultList.get(i).getLengthUnitOuterPkg())) {
                    BigDecimal lengthAfter = commonService.convertLengthUnit(
                        resultList.get(i).getLengthBefore()
                        , resultList.get(i).getLengthUnitOuterPkg()
                        , resultList.get(i).getLengthUnitComp());
                    // An error is made when the digit number of integer part exceeds a maximum.
                    // 整数部の桁数が上限を超えた場合はエラー
                    if (lengthAfter == null) {
                        Object[] params = { "Length" };
                        errList.add(new MessageDomain("", NXS_E7_0157, params));
                    }
                    
                    BigDecimal widthAfter = commonService.convertLengthUnit(
                        resultList.get(i).getWidthBefore()
                        , resultList.get(i).getLengthUnitOuterPkg()
                        , resultList.get(i).getLengthUnitComp());
                    // An error is made when the digit number of integer part exceeds a maximum.
                    // 整数部の桁数が上限を超えた場合はエラー
                    if (widthAfter == null) {
                        Object[] params = { "Width" };
                        errList.add(new MessageDomain("", NXS_E7_0157, params));
                    }
                    
                    BigDecimal heightAfter = commonService.convertLengthUnit(
                        resultList.get(i).getHeightBefore()
                        , resultList.get(i).getLengthUnitOuterPkg()
                        , resultList.get(i).getLengthUnitComp());
                    // An error is made when the digit number of integer part exceeds a maximum.
                    // 整数部の桁数が上限を超えた場合はエラー
                    if (heightAfter == null) {
                        Object[] params = { "Height" };
                        errList.add(new MessageDomain("", NXS_E7_0157, params));
                    }
                    
                    resultList.get(i).setLengthAfter(lengthAfter);
                    resultList.get(i).setWidthAfter(widthAfter);
                    resultList.get(i).setHeightAfter(heightAfter);
                } else {
                    resultList.get(i).setLengthAfter(resultList.get(i).getLengthBefore());
                    resultList.get(i).setWidthAfter(resultList.get(i).getWidthBefore());
                    resultList.get(i).setHeightAfter(resultList.get(i).getHeightBefore());
                }
                
                // Convert the unit of Volume.
                if (!resultList.get(i).getVolumeUnitComp().equals(
                    resultList.get(i).getVolumeUnitOuterPkg())) {
                
                    BigDecimal volumeAfter = commonService.convertVolumeUnit(
                        resultList.get(i).getVolumeBefore()
                        , resultList.get(i).getVolumeUnitOuterPkg()
                        , resultList.get(i).getVolumeUnitComp());
                    // An error is made when the digit number of integer part exceeds a maximum.
                    // 整数部の桁数が上限を超えた場合はエラー
                    if (volumeAfter == null) {
                        Object[] params = { "Vol." };
                        errList.add(new MessageDomain("", NXS_E7_0157, params));
                    }
                    
                    resultList.get(i).setVolumeAfter(volumeAfter);
                } else {
                    resultList.get(i).setVolumeAfter(resultList.get(i).getVolumeBefore());
                }

                if (0 < errList.size()) {
                    throw new ValidationException(errList);
                }
            }
        }
        return resultList;
            
    }
        
    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * This method calls the dao to search count for the outer package information.
     * 外装情報の検索結果件数を取得するDAOを呼び出します。
     * </pre>
     */
    public int searchCount(Wt006OuterPkgSelectCriteriaDomain criteria)
        throws ApplicationException {
        return wt006OuterPkgSelectDao.searchCount(criteria);
    }
}
