/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.INPUT_METH_TYP_MANUAL;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MAX_PKG_ITEM_COUNT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_W1_0005;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PKG_TYP_DUMMY;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W2013ListDomain;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;

/**
 *    This is an Add New Line action class of a CML PKG Detail screen.
 * <br />CML PKG Detail画面のAdd New Lineアクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":W2013.jsp
 *     - "error":W2013.jsp
 * </pre>
 *
 * @author $Author: 400616000304 $
 * @version $Revision: 11271 $
 */
public class W2013AddNewLineAction extends W2013AbstractAction {

    /**
     * constructor.
     */
    public W2013AddNewLineAction() {
        super();
    }

    /**
     * {@inheritDoc}
     */
    protected boolean isScreenInfoStack() {
        return true;
    }
    
    /**
     * {@inheritDoc}.
     * <pre>
     * - Addition of a line
     *       {@link #addNewLine(HttpServletRequest, W2013ActionForm)} is calling, and add 10 records of the contents of the following.
     *         - The input method :   Code value acquired from TM_CD (CD-TYPE =61: the input method, a CD =2:manual)
     *         - PACKAGE TYPE :   Code value acquired from TM_CD (CD-TYPE =70: a PACKAGE TYPE, CD =2:dummy)
     *         - Method goods classification (hidden) : Code value of the   above-mentioned dummy
     *
     * - Screen fields attributes
     *       Display control of an invoke and a screen is performed for {@link #controlDisplay(HttpServletRequest, W2013ActionForm)}.
     *
     * - 行の追加
     *     {@link #addNewLine(HttpServletRequest, W2013ActionForm)}を呼出し、下記の内容のレコードを10件追加する。
     *       - 入力方法: TM_CDより取得したコード値 (コード種別＝61:入力方法、コード＝2:マニュアル)
     *       - 包装材種別: TM_CDより取得したコード値 (コード種別＝70:包装材種別、コード＝2:ダミー)
     *       - 方法財種別(hidden): 上記ダミーのコード値
     *       
     * - 画面表示制御
     *     {@link #controlDisplay(HttpServletRequest, W2013ActionForm)}を呼び出し、画面の表示制御を行う。
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws ApplicationException {

        // Setting of action form
        // アクションフォームの設定
        W2013ActionForm w2013Form = (W2013ActionForm) form;
        
        // Line addition
        // 行追加
        addNewLine(request, w2013Form);
        
        // Display control of a screen
        // 画面の表示制御
        controlDisplay(request, w2013Form);

        return FORWARD_SUCCESS;
    }

    /**
     *    A line is added.
     * <br />行を追加します。
     *
     * @param request HTTP request<br />HTTPリクエスト
     * @param form Action form<br />アクションフォーム
     * @throws ApplicationException When the number of lines of search-results area exceeds the maximum number of lines<br />検索結果エリアの行数が最大行数を越えた場合
     */
    protected void addNewLine(HttpServletRequest request, W2013ActionForm form) throws ApplicationException {
        // Acquisition of the input method (name), and a PACKAGE TYPE (name)
        // 入力方法(名称)、包装材種別(名称)の取得
        String inputMethod = getInputMethodVal(form.getLanguageCd());
        String pkgTyp = getPkgTypVal(form.getLanguageCd());
        
        List<? extends W2013ListDomain> listDomainList = form.getListDomainList();

        // Addition of a line
        // 行の追加
        for (int i = 0; i < 10; i++) {
            if (MAX_PKG_ITEM_COUNT == listDomainList.size()) {
                throw new GscmApplicationException(NXS_W1_0005);
            } else {
                // The index of additional line is set as a request attribute.
                // 追加行のインデックスをリクエスト属性に設定
                if (request.getAttribute("first_add_line") == null) {
                    request.setAttribute("first_add_line", listDomainList.size());
                }
                
                // Create of an additional line
                // 追加行の作成
                W2013ListDomain listDomain = new W2013ListDomain();
                
                listDomain.setInputMethod(inputMethod);
                listDomain.setInputMethTyp(INPUT_METH_TYP_MANUAL);
                listDomain.setPkgTyp(pkgTyp);
                listDomain.setPkgTypHidden(PKG_TYP_DUMMY);
                
                // Registration of an additional line
                // 追加行の登録
                form.setListDomainList(listDomainList.size(), listDomain);
            }
        }
    }
}
