/*
 * Project : NEXUS_EXPORT
 *
 * Dete of update          : 2013/12/16
 * Development company name: DENSO IT SOLUTIONS, INC.
 * Details of update       : New
 * (c) Copyright 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.ws;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.WsT501UnlockBhtDomain;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;

/**
 * <p>
 * The interface of the BHT unlock authorization check service.<BR>
 * BHTロック解除権限チェックサービスのインタフェースです。
 * </p>
 *
 * @version 1.00
 */
public interface WsBhtComnAuxService {

    /**
     * <p>
     * BHT unlock authority check.<BR>
     * BHTロック解除権限チェック。
     * </p>
     *
     * @param unlockBht
     *            BHT lock input domain   (BHTロック解除の検索条件Domain)
     * @return Processing result   (検索結果)
     * @throws GscmApplicationException
     *             Business error   (業務エラー)
     * @throws ApplicationException
     *             Application error   (アプリケーションエラー)
     */
    public boolean validateDatabaseVmBhtLockUser(WsT501UnlockBhtDomain unlockBht)
        throws GscmApplicationException, ApplicationException;
}
