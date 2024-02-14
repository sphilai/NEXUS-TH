/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRAbstractBeanDataSourceProvider;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

/**
 * <br />Mock帳票データソース・プロバイダです。
 * <pre>
 * このクラスは帳票デザイン時しか利用しません。
 * </pre>
 * 
 * @version $Revision: 5759 $
 */
public class L9999ReportDataSourceProvider extends JRAbstractBeanDataSourceProvider {

    /**
     * <br />QRコード画像のパス (サンプル)
     */
    private static final String QR_CODE_PATH = "qrcode.gif";
    
    /**
     * <br />Mock帳票データソースを作成するためのコンストラクタです。
     */
    @SuppressWarnings("unchecked")
    public L9999ReportDataSourceProvider() {
        super(L9999ReportDomain.class);
    }

    /**
     * {@inheritDoc}
     * @see net.sf.jasperreports.engine.JRDataSourceProvider#create(net.sf.jasperreports.engine.JasperReport)
     */
    public JRDataSource create(JasperReport report) throws JRException {
        L9999ReportDomain reportDomain = new L9999ReportDomain();

        reportDomain.setSingleFlg(false);
        reportDomain.setContainerSortKey("MMMMMMME");
        reportDomain.setLdCd("M");
        reportDomain.setInstrFlg(true);
        reportDomain.setAirFlg(true);
        reportDomain.setPalletNo("MMME");
        reportDomain.setMainMark("MMMMMMMMMMMMMMMMMMME");
        reportDomain.setShipToAbbr("MMMMMMMMME");
        reportDomain.setShipToCompName("MMMMMMMMMMMMMMMMMMMMMMMMMMMMME\nMMMMMMMMMMMMMMMMMMMMMMMMMMMMME");
        reportDomain.setCustomerItemNo("MMMMMMMMMMMMMMMMMMME");
        reportDomain.setQty("9999999");
        reportDomain.setBrokenFlg(true);
        reportDomain.setUnitName("EA");
        reportDomain.setCmlType("M");
        reportDomain.setGw("999999999.999 kg");
        reportDomain.setDescription("MMMMMMMMMMMMMMMMMMME\nMMMMMMMMMMMMMMMMMMME");
        reportDomain.setItemNo("MMMMMMMMMMMMMMMMMMMMMMMMMME");
        reportDomain.setQrNexus(getInputStream(QR_CODE_PATH));
        reportDomain.setDueDate(new Date());
        reportDomain.setRemarks("MMMMMMMMMMMMMMMMMMMMMMMME\nMMMMMMMMMMMMMMMMMMMMMMMME");
        reportDomain.setQrEis(getInputStream(QR_CODE_PATH));
        reportDomain.setPrintedDate(new Date());
        reportDomain.setShipper("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMME");
        reportDomain.setIssuer("MMMMMMMMME\nMMMMMMMMME");
        
        List<L9999ReportDetailDomain> detailList = new ArrayList<L9999ReportDetailDomain>();
        
        for (int i = 0; i < 50; i++) {
            L9999ReportDetailDomain detailDomain = new L9999ReportDetailDomain();
            String seq = String.format("%02d", i + 1);
            
            detailDomain.setCmlNo("MMMMMMMMMMMMMMMMMMME");
            detailDomain.setRt("M");
            detailDomain.setMixTag("M");
            detailDomain.setDescription(seq + "MMMMMMMMMMMMMMMMMMMMMMMMMMME\nMMMMMMMMMMMMMMMMMMMMMMMMMMMMME");
            detailDomain.setCustItemNoOrModItemNo("MMMMMMMMMMMMMMMMMMMMMMMMMME");
            detailDomain.setItemNo("MMMMMMMMMMMMMMMMMMMMMMMMMME");
            detailDomain.setQty("9999999");
            detailDomain.setPkg("MMM");
            detailDomain.setRemarks("MMMMMMMMMMMMMMMMMMMMMMMME\nMMMMMMMMMMMMMMMMMMMMMMMME");
            
            detailList.add(detailDomain);
        }
        
        reportDomain.setDetailList(detailList);
        
        return new JRBeanCollectionDataSource(Arrays.asList(reportDomain));
    }

    /**
     * {@inheritDoc}
     * @see net.sf.jasperreports.engine.JRDataSourceProvider#dispose(net.sf.jasperreports.engine.JRDataSource)
     */
    public void dispose(JRDataSource dataSource) throws JRException {
        // nothing to do
    }

    /**
     * <br />指定されたリソースに対する入力ストリームを作成する。
     *
     * @param resource リソース名
     * @return 入力ストリーム
     * @throws JRException 入力ストリームが作成できなかった場合
     */
    private InputStream getInputStream(String resource) throws JRException {
        try {
            URL url = getClass().getClassLoader().getResource(resource);
            return url.openStream();
        } catch (IOException e) {
            throw new JRException("cannot open " + resource, e);
        }
    }
}
