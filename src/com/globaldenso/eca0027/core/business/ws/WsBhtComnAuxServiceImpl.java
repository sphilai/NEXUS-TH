/*
 * Project : NEXUS_EXPORT
 *
 * Dete of update          : 2013/12/16
 * Development company name: DENSO IT SOLUTIONS, INC.
 * Details of update       : New
 * (c) Copyright 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.ws;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.*;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.VtBhtLockuserDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.VtBhtLockuserCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.service.VtBhtLockuserService;
import com.globaldenso.eca0027.core.business.domain.WsT501UnlockBhtDomain;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;

/**
 * <p>
 * An implementation class of the BHT unlock authorization check service.<BR>
 * ログイン認証、BHTアプリバージョンチェックサービスの実装クラスです。
 * </p>
 *
 * @version 1.00
 */
public class WsBhtComnAuxServiceImpl implements WsBhtComnAuxService {

    /**
     * <p>
     * VtBhtLockuserService service<BR>
     * VtBhtLockuserServiceサービス
     * </p>
     */
    private VtBhtLockuserService vtBhtLockuserService;

    /**
     * <p>
     * Default constructor<BR>
     * デフォルトコンストラクタです。
     * </p>
     *
     */
    public WsBhtComnAuxServiceImpl() {
    }

    // ------------------- 依存サービス・DaoのGetter / Setter -------------------

    /**
     * <p>
     * Setter method for VtBhtLockuserService.
     * </p>
     *
     * @param vtBhtLockuserService
     *            Set for VtBhtLockuserService
     */
    public void setVtBhtLockuserService(
            VtBhtLockuserService vtBhtLockuserService) {
        this.vtBhtLockuserService = vtBhtLockuserService;
    }

    // -------------------------- メソッド ---------------------------
    /**
     * {@inheritDoc}
     *
     * @see com.globaldenso.eca0027.core.business.service.WsBhtComnAuxService#validateDatabaseVmBhtLockUser(com.globaldenso.eca0027.core.business.domain.WsT501UnlockBhtDomain)
     */
    public boolean validateDatabaseVmBhtLockUser(WsT501UnlockBhtDomain unlockBht)
        throws GscmApplicationException, ApplicationException {

        VtBhtLockuserCriteriaDomain vtBhtLockuserCriteria = new VtBhtLockuserCriteriaDomain();
        vtBhtLockuserCriteria.setDscId(unlockBht.getMgrDscId());
        vtBhtLockuserCriteria.setRole(BHT_ROLE_LOCK);
        vtBhtLockuserCriteria.setAuthMgtComp(unlockBht.getVmUserInfo().getCompCd());
        vtBhtLockuserCriteria.setAuthDataTyp(AUTH_DATA_TYP_PLNT_CD);


        List<VtBhtLockuserDomain> vtBhtLockuserList = vtBhtLockuserService
                .searchByCondition(vtBhtLockuserCriteria);

        if (vtBhtLockuserList == null || vtBhtLockuserList.size() == 0) {
            throw new GscmApplicationException(NXS_E1_5063);
        } else {
            for (VtBhtLockuserDomain vtBhtLockuser : vtBhtLockuserList) {
                if (vtBhtLockuser.getRole() == null) {
                    throw new GscmApplicationException(NXS_E1_5063);
                }
            }
        }

        return true;
    }

}