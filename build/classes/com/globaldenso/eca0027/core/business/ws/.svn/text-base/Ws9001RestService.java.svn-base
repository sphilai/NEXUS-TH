/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.ws;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.Ws9001ResultDomain;

/**
 * Interface for the Web Call Service (WS9001)
 * <br />Webサービス(WS9001)呼出しサービスのインタフェースです。
 * 
 * @author $Author: 400616000304 $
 * @version $Revision: 12250 $
 */
public interface Ws9001RestService {

    /**
     * Get one record from Item No. MA of CIGMA by using Item No. as a key, by using the (WS9001) Web Services
     * <br />Webサービス(WS9001)を使用して、CIGMAの品番MAから品番をキーに情報を1件取得します。
     *
     * @param compCd - COMPANY CODE
     * @param itemNo - Item No.
     * @param customerNo - CUSTOMER CODE
     * @return result domain of WS9001
     * @throws ApplicationException - If an error occurs in the Web services provider
     */
    public Ws9001ResultDomain getItemInfoForMa(String compCd, String itemNo, String customerNo) throws ApplicationException;

    /**
     * Get one record from Item No. MA of CIGMA by using Item No. as a key, by using the (WS9001) Web Services
     * <br />Webサービス(WS9001)を使用して、CIGMAの品番MAから品番をキーに情報を1件取得します。
     *
     * UT305 ADD
     *
     * @param compCd - COMPANY CODE
     * @param itemNo - Item No.
     * @param customerNo - CUSTOMER CODE
     * @param refDate Refernce date - CIGMA date format/判定基準日 - CIGMA日付フォーマット
     * @return result domain of WS9001
     * @throws ApplicationException - If an error occurs in the Web services provider
     */
    public Ws9001ResultDomain getItemInfoForMa(String compCd, String itemNo, String customerNo, String refDate)
        throws ApplicationException;
}
