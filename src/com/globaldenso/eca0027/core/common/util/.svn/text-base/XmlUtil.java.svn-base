/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.common.util;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_91_0001;

import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;

import com.globaldenso.ai.common.core.exception.SystemException;

/**
 * The utility class for performing operations on XML
 * <br />XMLに関する操作を行うためのユーティリティ・クラスです。
 * 
 * @author $Author: 400616000407 $
 * @version $Revision: 12567 $
 */
public final class XmlUtil {

    /**
     * constructor.
     * <br />デフォルトコンストラクタです
     */
    private XmlUtil() {
    }

    /**
     * Convert the domain into a XML
     * <br />ドメインをXMLに変換します。
     *
     * @param domain - domain
     * @return conversion result (XML) 
     */
    public static String marshal(Object domain) {
        
        try {
            JAXBContext context = JAXBContext.newInstance(domain.getClass());

            // A create of Marshaller
            // Marshallerの作成
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty("jaxb.encoding", "utf-8");
            // 2015/12/11 MOD START for OutOfMemoryError
            //marshaller.setProperty("jaxb.formatted.output", true);
            marshaller.setProperty("jaxb.formatted.output", false);
            // 2015/12/11 MOD END

            Writer out = new StringWriter();

            // Marshall (a domain is changed into XML)  
            // マーシャル (ドメインをXMLに変換)
            marshaller.marshal(domain, out);

            // 2015/12/11 MOD START for OutOfMemoryError
            //return out.toString().replaceAll("\\n", "");
            return out.toString();
            // 2015/12/11 MOD END

        } catch (Exception e) {
            throw new SystemException(NXS_91_0001, e);
        }
    }

    /**
     * Convert the XML into a domain
     * <br />XMLからドメインに変換します。
     *
     * @param <T> - type of domain
     * @param domainClass - domain class 
     * @param xml - XML
     * @return conversion result (domain) 
     */
    @SuppressWarnings("unchecked")
    public static <T> T unmarshal(Class<T> domainClass, String xml) {

        try {
            // A create of Unmarshaller
            // Unmarshallerの作成
            JAXBContext context = JAXBContext.newInstance(domainClass);
            Unmarshaller unmarshaller = context.createUnmarshaller();

            // A create of XML sauce
            // XMLソースの作成
            StreamSource source = new StreamSource(new StringReader(xml));
            
            // Unmarshaller (XML is changed into a domain)  
            // アンマーシャル (XMLをドメインに変換)
            return (T) unmarshaller.unmarshal(source);

        } catch (Exception e) {
            throw new SystemException(NXS_91_0001, e);
        }
    }
}
