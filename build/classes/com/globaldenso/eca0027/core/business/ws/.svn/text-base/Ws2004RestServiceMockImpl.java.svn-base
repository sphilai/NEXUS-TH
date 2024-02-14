/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.ws;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_SUCCESS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.Ws2004ResultDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2004ResultItemDomain;

/**
 * The mock class for the Web Call Service (WS2004) <br />
 * Webサービス(WS2004)呼出しサービスのMockクラスです。
 * 
 * @author $Author: 810833843 $
 * @version $Revision: 9972 $
 */
public class Ws2004RestServiceMockImpl implements Ws2004RestService {

    /**
     * <p>constructor. <br />
     * デフォルトコンストラクタです。</p>
     */
    public Ws2004RestServiceMockImpl() {
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.ws.Ws2004RestService#searchItemInfoForCml(java.lang.String, java.util.List, java.lang.String, java.util.List, java.lang.String)
     */
    public Ws2004ResultDomain searchItemInfoForCml(String compCd, List<String> plantCdList,
        String whCd, List<String> itemNoList, String customerCd) throws ApplicationException {

        Ws2004ResultDomain result = new Ws2004ResultDomain(WS_RESULT_SUCCESS);
        
        if (compCd.equals("MY4")) {
            // 品目情報
            Ws2004ResultItemDomain item = new Ws2004ResultItemDomain();
            item.setItnbr("A002TB0091B3N");
            item.setPackc("10");
            item.setMohtq("1");
            item.setUnmsr("1");
            item.setCurr3("XXX");
            item.setUnmsr("l");
            item.setPackc("M1");
            
            // 結果ドメイン
            result.setItemList(Arrays.asList(item));
        } else {
            List<Ws2004ResultItemDomain> itemList = new ArrayList<Ws2004ResultItemDomain>();
            
            for (int i = 0; i < itemNoList.size(); i++) {
                // 品目情報
                Ws2004ResultItemDomain item = new Ws2004ResultItemDomain();
                item.setItnbr(itemNoList.get(i));
                
                if ( plantCdList.size() == 1 ) {
                    item.setPackc( plantCdList.get(0) );
                } else {
                    switch ( i % 2 ) {
                        case 0 :
                            item.setPackc( "M3" );
                            break;
                        case 1 :
                            item.setPackc( "M4" );
                            break;
                        default:
                            item.setPackc( "M1" );
                    }
                }
                item.setMohtq("100");
                item.setUnmsr("kg");
                if ("MYA".equals(compCd) && "A002TB0091B04N".equals(itemNoList.get(i))) {
                    item.setCurr3("");
                } else if ("MYB".equals(compCd) && "A002TB0091B09N".equals(itemNoList.get(i))) {
                    item.setCurr3("");
                } else {
                    item.setCurr3("002");
                }
                
                itemList.add(item);
            }
            // 結果ドメイン
            result.setItemList(itemList);
        }
        return result;
    }
}
