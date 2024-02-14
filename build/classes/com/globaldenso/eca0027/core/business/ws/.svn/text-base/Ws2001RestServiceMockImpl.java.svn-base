/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.ws;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_SUCCESS;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.Ws2001ResultDomain;

/**
 * The mock class to call service of web services <br />
 * Webサービス(WS2001)呼出しサービスのMockクラスです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class Ws2001RestServiceMockImpl implements Ws2001RestService {

    /**
     * <p>constructor. <br />
     * デフォルトコンストラクタです。</p>
     */
    public Ws2001RestServiceMockImpl() {
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.ws.Ws2001RestService#searchWorkingDay(String, Date, int, int)
     */
    public Ws2001ResultDomain searchWorkingDay(String compCd, Date baseDate, int beforeDays,
        int afterDays) throws ApplicationException {

        // W2001の結果ドメイン
        Ws2001ResultDomain ws2001ResultDomain = new Ws2001ResultDomain(WS_RESULT_SUCCESS);

        // 稼働日の設定
        ws2001ResultDomain.setWorkingDayList(Arrays.asList(
            add(baseDate, -2),
            add(baseDate, -1),
            add(baseDate, 0),
            add(baseDate, 1),
            add(baseDate, 2),
            add(baseDate, 3),
            add(baseDate, 4)
        ));
        
        
        return ws2001ResultDomain;
    }
    
    /**
     * Adds a number of days to a base date
     * <br />基準日に指定された日数を加算した日付(文字列)を取得します。
     *
     * @param baseDate a base date<br />基準日
     * @param amount the amount to add, may be negative <br />加算する日数
     * @return the date string with the amount added (yyyyMMdd) <br />加算後の日付文字列 (yyyyMMdd)
     */
    private String add(Date baseDate, int amount) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(baseDate);
        
        cal.add(Calendar.DAY_OF_MONTH, amount);
        
        return new SimpleDateFormat("yyyyMMdd").format(cal.getTime());
    }
}
