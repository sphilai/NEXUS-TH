package com.globaldenso.eca0027.core.business.service;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.LANGUAGE_CD_ENGLISH;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_91_0001;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.QR_HEAD;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLDecoder;
import java.util.Arrays;
import java.util.List;

import net.sf.jasperreports.engine.JasperPrint;

import org.apache.commons.lang.StringUtils;

import com.globaldenso.ai.common.core.context.DensoContext;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.ai.common.core.exception.SystemException;
import com.globaldenso.ai.library.formgenerate.FormGenerator;
import com.globaldenso.ai.library.formgenerate.exception.FormGenerateException;
import com.globaldenso.gscm.framework.business.domain.TmUserConfDomain;
import com.globaldenso.gscm.framework.business.domain.criteria.TmUserConfCriteriaDomain;
import com.globaldenso.gscm.framework.business.service.TmUserConfService;
import com.globaldenso.gscm.framework.util.StringUtil;

/**
 * This is a Super Class of list create service.
 * <br />帳票作成サービスの基底クラスです。
 * <pre>
 * Aim at communalizing exception handling at the time of a list create in this class,
 * The PDF file from list generation parts or middle report of an application base
 * Offer the function for creating.
 *
 * Since a PDF file is created as temporary file, it accepts necessity, and they are movement and a delete.
 * Please carry out.
 * 
 * このクラスでは、帳票作成時の例外処理を共通化することを目的として、
 * アプリ基盤の帳票生成部品からPDFファイルまたは中間レポートを
 * 作成するための機能を提供します。
 * 
 * PDFファイルは一時ファイルとして作成するので、必要に応じて移動・削除
 * して下さい。
 * </pre>
 * 
 * @version $Revision: 9972 $
 */
public abstract class AbstractReportServiceImpl {

    /**
     * User set master service
     * <br />ユーザ設定原単位サービス
     */
    private TmUserConfService tmUserConfService;
    
    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public AbstractReportServiceImpl() {
    }

    /**
     * User set master service   This is a setter method.
     * <br />ユーザ設定原単位サービス のセッターメソッドです。
     *
     * @param tmUserConfService User set master service It sets up.<br />ユーザ設定原単位サービス に設定する
     */
    public void setTmUserConfService(TmUserConfService tmUserConfService) {
        this.tmUserConfService = tmUserConfService;
    }

    /**
     * A PDF list is created using the specified domain for document outputs.
     * <br />指定された帳票出力用ドメインを使用してPDF帳票を作成します。
     *
     * @param reportId List ID<br />帳票ID
     * @param reportDomain The domain for document outputs<br />帳票出力用ドメイン
     * @return The created PDF list<br />作成したPDF帳票
     */
    protected File createReport(String reportId, Object reportDomain) {
        
        List<Object> domainList = Arrays.asList(reportDomain);
        
        String templatePath = getTemplatePath(reportId, getLanguageCd());
        File outputFile = createOutputFile(reportId);
        
        FileOutputStream out = null;
        
        try {
            out = new FileOutputStream(outputFile);
            
            FormGenerator.generateReport(domainList, null, templatePath, null, out);
        } catch (IOException e) {
            throw new SystemException("AI-90-0000", e, e.getMessage() + "(" + reportId + ")");
        } catch (FormGenerateException e) {
            throw new SystemException("AI-90-0000", e, e.getMessage() + "(" + reportId + ")");
        } finally {
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    throw new SystemException("AI-90-0000", e, e.getMessage() + "(" + reportId + ")");
                }
            }
        }
        
        return outputFile;
    }

    /**
     * A middle report is combined and one PDF list is created.
     * <br />中間レポートを結合して、1つのPDF帳票を作成します。
     *
     * @param reportId List ID<br />帳票ID
     * @param reportList Middle report<br />中間レポート
     * @return The created PDF list<br />作成したPDF帳票
     */
    protected File createReport(String reportId, List<JasperPrint> reportList) {
        File outputFile = createOutputFile(reportId);
        
        FileOutputStream out = null;
        
        try {
            out = new FileOutputStream(outputFile);
            
            FormGenerator.generateReport(reportList, null, out);
        } catch (IOException e) {
            throw new SystemException("AI-90-0000", e, e.getMessage() + "(" + reportId + ")");
        } catch (FormGenerateException e) {
            throw new SystemException("AI-90-0000", e, e.getMessage() + "(" + reportId + ")");
        } finally {
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    throw new SystemException("AI-90-0000", e, e.getMessage() + "(" + reportId + ")");
                }
            }
        }

        return outputFile;
    }
    
    /**
     * Using the specified domain for document outputs, a middle report is created.
     * <br />指定された帳票出力用ドメインを使用して、中間レポートを作成します。
     *
     * @param reportId List ID<br />帳票ID
     * @param reportDomain The domain for document outputs<br />帳票出力用ドメイン
     * @return The created middle report<br />作成した中間レポート
     */
    protected JasperPrint createJasperPrint(String reportId, Object reportDomain) {
        
        List<Object> domainList = Arrays.asList(reportDomain);

        String templatePath = getTemplatePath(reportId, getLanguageCd());
        
        try {
            return FormGenerator.generateIntermediateReport(domainList, null, templatePath);
        } catch (FormGenerateException e) {
            throw new SystemException("AI-90-0000", e, e.getMessage() + "(" + reportId + ")");
        }
    }
    
    /**
     * The path of the specified resource is returned.
     * <br />指定されたリソースのパスを返します。
     * <pre>
     * When a resource name starts in "/", search from directly under [ class path ].
     * Search from the same path as an execution class except it.
     * 
     * リソース名が「/」で始まる場合、クラスパス直下から検索します。
     * それ以外は、実行クラスと同じパスから検索します。
     * </pre>
     * 
     * @param resource Resource name<br />リソース名 
     * @return The absolute path of a resource<br />リソースの絶対パス
     */
    protected String getResourcePath(String resource) {
        URL resourceUrl = this.getClass().getResource(resource);
        if (resourceUrl == null) {
            throw new SystemException(NXS_91_0001, resource);
        }
        
        String resourcePath = null;
        try {
            resourcePath = URLDecoder.decode(resourceUrl.getFile(), "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new SystemException("AI-90-0000", e, resource);
        }
        
        return resourcePath;
    }
    
    /**
     * A new-line is inserted in a suitable position so that it may become the length as which one line was specified.
     * <br />1行が指定された長さになるように適切な位置に改行を挿入します。
     * 
     *
     * @param value The target string<br />対象の文字列
     * @param length The number of characters per line<br />1行あたりの文字数
     * @return The folded-up string<br />折り畳んだ文字列
     */
    protected String hold(String value, int length) {
        if (value == null) {
            return value;
        } else {
            if (value.length() < length) {
                return value;
            } else {
                StringBuilder sb = new StringBuilder();
                
                for (int pos = 0; pos < value.length(); pos += length) {
                    if (pos + length < value.length()) {
                        sb.append(value.substring(pos, pos + length));
                        sb.append("\n");
                    } else {
                        sb.append(value.substring(pos));
                    }
                }

                return sb.toString();
            }
        }
    }
    
    /**
     * Cut and start a new line the string<br>
     * 指定文字列を指定の文字数にカットし、指定文字数で改行します。
     *
     * @param str TargetString<br>
     * 対象文字列
     * @param brLength The number of the line feeds<br>
     * 改行文字数
     * @param maxLength maxLength<br>
     * 最大文字数
     * カットしない場合は0を設定
     * @return editStr editStr<br>
     * 編集後文字列
     */
    protected String getCutBrStr(String str, int brLength, int maxLength) {
        // LF => 'brLength' cut => 'maxLength'
        String editStr = StringUtil.getEmptyToBlank(str);
        StringBuilder sb = new StringBuilder(editStr);
        if (0 != maxLength && editStr.length() > maxLength) {
            sb = new StringBuilder(editStr.substring(0, maxLength));
        }        
        
        StringBuilder nsb = new StringBuilder();
        int tl = 0; // Total length
        int ll = 0; // a line length
        for (int c = 0; c < sb.length(); c++) {
            char ch = sb.charAt(c);
            int cl = String.valueOf(ch).getBytes().length;
            if (0 != maxLength && tl + cl > maxLength) {
                break;
            }
            if (ll + cl > brLength) {
                nsb.append("\n");
                ll = 0; // initialize
            }
            nsb.append(ch);
            ll += cl;
            tl += cl;
        }

        return nsb.toString();
    }
    
    /**
     * 
     * Get QR code header data.
     * <br />QRコードヘッダ部を取得します。
     *
     * @param compCd company code / 責任会社コード (3)
     * @param typeCd type code / 種別コード (3)
     * @param generationCd  generation managemento no / 世代コード (1)
     * @param qrSystemCd QR System code / QR体系コード (1)
     * @param qrCodeNo QRCode no / QRコードNo (2)
     * @param clmCnt data column cnt / 項目数
     * @return QRコードヘッダ部
     */
    protected String getQrHeader(String compCd, String typeCd, String generationCd, String qrSystemCd, String qrCodeNo, String clmCnt) {
        return String.format(QR_HEAD, getStringRPad(compCd, 3, ' '), getStringRPad(typeCd, 3, ' '), getStringLPad(generationCd, 1, '0')
            , getStringLPad(qrSystemCd, 2, '0'), getStringLPad(qrCodeNo, 2, '0'), getStringLPad(clmCnt, 3, '0'));
    }
    
    /**
     * Cut target string and left padding 0.
     * <br />対象文字列が指定長以上の場合、指定長にカットします。指定長以下の場合左埋めします。
     *
     * @param str 対象文字列
     * @param len 指定長
     * @param ch 左埋めする文字
     * @return カット後の文字列
     */
    private String getStringLPad (String str, int len, char ch) {
        return StringUtil.lPad(getString(str, len), len, ch);
    }
    

    /**
     * Cut target string and right padding.
     * <br />対象文字列が指定長以上の場合、指定長にカットします。指定長以下の場合右埋めします。
     *
     * @param str 対象文字列
     * @param len 指定長
     * @param ch 右埋めする文字
     * @return カット後の文字列
     */
    private String getStringRPad (String str, int len, char ch) {
        return StringUtil.rPad(getString(str, len), len, ch);
    }
    
    /**
     * Cut string length.
     * <br />対象文字列が指定長以上の場合、カットします。
     *
     * @param str 対象文字列
     * @param len 指定長
     * @return カット後の文字列
     */
    private String getString(String str, int len) {
        if (str == null) {
            return "";
        } else {
            if (str.length() < len) {
                return StringUtil.lPad(str, len, '0');
            } else {
                return str.substring(0, len);
            }
        }
    }
    
    /**
     * The absolute path of the template of the specified list is returned.
     * <br />指定された帳票のテンプレートの絶対パスを返します。
     * 
     * @param reportId List ID<br />帳票ID
     * @param languageCd LANGUAGE CODE<br />言語コード
     * @return The absolute path of a list template<br />帳票テンプレートの絶対パス
     */
    private String getTemplatePath(String reportId, String languageCd) {
        String resourcePath = String.format("/%s/%s{0}.jrxml", getModuleName(), reportId);
        
        try {
            return getResourcePath(resourcePath.replace("{0}", "_" + languageCd));
        } catch (SystemException e) {
            return getResourcePath(resourcePath.replace("{0}", ""));
            
        }
    }

    /**
     * A module name (package name of com.globaldenso.eca0027 directly under) is returned.
     * <br />モジュール名（com.globaldenso.eca0027直下のパッケージ名）を返します。
     *
     * @return Module name<br />モジュール名
     */
    private String getModuleName() {
        return this.getClass().getName().split("\\.")[3];
    }
    
    /**
     * Temporary file used as the output destination change of a PDF list is created.
     * <br />PDF帳票の出力先となる一時ファイルを作成します。
     * 
     * @param reportId List ID<br />帳票ID
     * @return Output destination change file<br />出力先ファイル
     */
    private File createOutputFile(String reportId) {
        try {
            return File.createTempFile(reportId, ".pdf");
        } catch (IOException e) {
            throw new SystemException("AI-90-0000", e, reportId);
        }
    }
    
    /**
     * A login user's language is returned.
     * <br />ログインユーザの言語を返します。
     *
     * @return A login user's language (if there is nothing English) <br />ログインユーザの言語 (なければ英語)
     */
    private String getLanguageCd() {
        try {
            TmUserConfCriteriaDomain tmUserConfCriteriaDomain = new TmUserConfCriteriaDomain();
            tmUserConfCriteriaDomain.setDscId(DensoContext.get().getDscId());
            
            TmUserConfDomain tmUserConfDomain = tmUserConfService.searchByKey(tmUserConfCriteriaDomain);
            
            if (tmUserConfDomain != null && !StringUtils.isEmpty(tmUserConfDomain.getLanguageCd())) {
                return tmUserConfDomain.getLanguageCd();
            } else {
                return LANGUAGE_CD_ENGLISH;
            }
        } catch (ApplicationException e) {
            return LANGUAGE_CD_ENGLISH;
        }
    }
}