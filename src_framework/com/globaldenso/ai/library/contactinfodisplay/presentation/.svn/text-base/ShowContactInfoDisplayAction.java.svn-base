package com.globaldenso.ai.library.contactinfodisplay.presentation;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.validator.DynaValidatorActionForm;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.ai.library.contactinfodisplay.business.domain.ContactInfoDetailDomain;
import com.globaldenso.ai.library.contactinfodisplay.business.domain.ContactInfoSystemDomain;
import com.globaldenso.ai.library.contactinfodisplay.business.service.ContactInfoDetailService;
import com.globaldenso.ai.library.contactinfodisplay.business.service.ContactInfoSystemService;

/**
 * [JP] 問合せ先情報を取得する機能。<br/>
 * [EN] Function of get contact information.
 * 
 * <p>
 * [JP] 問合せ先情報、及びシステム名・システムコードを返すActionです。<br/>
 * [JP] 問合せ先情報の検索には、<b>問合せコード</b>と<b>言語情報</b>を利用します。<br/>
 * [JP] 問合せコードは、formにつめられた値（bean名： contactInfoId）を利用します。<br/>
 * [JP] 言語情報の取得方法は、form内の言語情報（bean名： locale）の存在有無により下記の通りとなります。
 * <ul>
 * <li>言語情報が存在する&nbsp;&nbsp;&nbsp;： form内の言語情報の先頭から2文字までの文字列</li>
 * <li>言語情報が存在しない： HttpServletRequest#getLocale()により取得した言語情報の先頭から2文字までの文字列</li>
 * </ul>
 * </p>
 * <p>
 * [EN] This Action is return a "contact information", "system name", and "system code".
 * When you search "contact information" with this Action, the Action need two parameters: <b>"contactInfoId"</b> and <b>"locale"</b>.
 * The "contactInfoId" is got from form (bean name: contactInfoId).
 * The "locale" is got by two way.
 * <ul>
 * <li>When "locale" information is in a form (bean name: locale), locale information is defined by 1st and 2nd characters of the form.</li>
 * <li>When "locale" information is NOT in a form (bean name: locale), locale information is defined by 1st and 2nd characters of the HttpServletRequest#getLocale().</li>
 * </ul>
 * </p>
 *
 * @author DENSO Corporation.
 * @version Ryota KAWAMURA
 */
public class ShowContactInfoDisplayAction extends Action {

    /**
     * [JP] エラーコード： 検索対象がテーブルに存在しない。<br/>
     * [EN] Error code: retrieval object was not found.
     */
    private static final String ERR_RETRIEVAL_OBJECT_WAS_NOT_FOUND = "LB72-90-0001";
    
    /**
     * [JP] エラーコード： 検索条件が取得できない。<br/>
     * [EN] Error code: search parameter was empty.
     */
    private static final String ERR_SEARCH_PARAM_WAS_EMPTY = "LB72-90-0002";
    
    /**
     * [JP] 文字列定数: contactInfoId<br/>
     * [EN] Constant characters: contactInfoId.
     */
    private static final String CONTACT_INFO_ID = "contactInfoId";

    /**
     * [JP] 文字列定数： systemId<br/>
     * [EN] Constant characters: systemId.
     */
    private static final String SYSTEM_ID = "systemId";

    /**
     * [JP] 文字列定数： locale<br/>
     * [EN] Constant characters: locale.
     */
    private static final String LOCALE = "locale";

    /**
     * [JP] contactInfoDetailService。<br/>
     * [EN] contactInfoDetailService.
     */
    private ContactInfoDetailService contactInfoDetailService = null;

    /**
     * [JP] contactInfoSystemService。<br/>
     * [EN] contactInfoSystemService.
     */
    private ContactInfoSystemService contactInfoSystemService = null;

    /**
     * [JP] デフォルトコンストラクタ。<br/>
     * [EN] Default constructor.
     */
    public ShowContactInfoDisplayAction(){
        // no-op;
    }

    /**
     * [JP] contactInfoDetailServiceのセッターメソッド。<br/>
     * [EN] Setter of contactInfoDetailService.
     * 
     * @param contactInfoDetailService [JP] contactInfoDetailService。 [EN] contactInfoDetailService.
     */
    public void setContactInfoDetailService(ContactInfoDetailService contactInfoDetailService) {
        this.contactInfoDetailService = contactInfoDetailService;
    }

    /**
     * [JP] contactInfoSystemServiceのセッターメソッド。<br/>
     * [EN] Setter of contactInfoSystemService.
     * 
     * @param contactInfoSystemService [JP] contactInfoSystemService。 [EN] contactInfoSystemService.
     */
    public void setContactInfoSystemService(ContactInfoSystemService contactInfoSystemService) {
        this.contactInfoSystemService = contactInfoSystemService;
    }

    /**
     * [JP] JSPへの遷移を実施する。<br/>
     * [EN] Jump to JSP.
     * 
     * @param mapping [JP] ActionMapping。 [EN] ActionMapping.
     * @param form [JP] ActionForm。 [EN] ActionForm.
     * @param request [JP] HttpServletRequest。 [EN] HttpServletRequest.
     * @param response [JP] HttpServletResponse。 [EN] HttpServletResponse.
     * @return [JP] mapping.findForward("success")。 [EN] mapping.findForward("success").
     * @throws Exception [JP] 例外。 [EN] Exception.
     */
    public ActionForward execute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws Exception {

        // === get parameter from form =====================
        DynaValidatorActionForm contactInfoForm = (DynaValidatorActionForm)form;

        String contactInfoId = contactInfoForm.getString(CONTACT_INFO_ID);
        String locale = contactInfoForm.getString(LOCALE);
        // =================================================

        // === input check =================================
        if (contactInfoId == null || "".equals(contactInfoId)) {
            throw new ApplicationException(ERR_SEARCH_PARAM_WAS_EMPTY, CONTACT_INFO_ID);
        }

        if (locale == null || "".equals(locale)) {
            // get locale information from request.
            locale = request.getLocale().toString();
        }
        locale = locale.substring(0, 2);
        // =================================================

        // === search: CONTACT_INFO_DETAIL ==============
        ContactInfoDetailDomain detailCriterion = new ContactInfoDetailDomain();
        List<ContactInfoDetailDomain> detailResultList = null;

        detailCriterion.setContactInfoId(contactInfoId);
        detailCriterion.setLocale(locale);

        detailResultList = contactInfoDetailService.searchByCondition(detailCriterion);

        if (detailResultList == null || detailResultList.size() != 1) {
            throw new ApplicationException(ERR_RETRIEVAL_OBJECT_WAS_NOT_FOUND);
        }
        // =================================================

        // === search: CONTACT_INFO_SYSTEM ==============
        ContactInfoSystemDomain systemCriterion = new ContactInfoSystemDomain();
        List<ContactInfoSystemDomain> systemResultList = null;

        String systemId = detailResultList.get(0).getSystemId();
        if (systemId == null || "".equals(systemId)){
            throw new ApplicationException(ERR_SEARCH_PARAM_WAS_EMPTY, SYSTEM_ID);
        } else {
            systemCriterion.setSystemId(detailResultList.get(0).getSystemId());
            systemCriterion.setLocale(locale);
        } 

        systemResultList = contactInfoSystemService.searchByCondition(systemCriterion);

        if (systemResultList.size() != 1) {
            throw new ApplicationException(ERR_RETRIEVAL_OBJECT_WAS_NOT_FOUND);
        }
        // =================================================

        // === return result ===============================
        request.setAttribute("contactInfo", detailResultList.get(0).getContactInfo());
        request.setAttribute("systemId", detailResultList.get(0).getSystemId());
        request.setAttribute("systemName", systemResultList.get(0).getSystemName());
        
        // Set locale information
        String windowId = request.getParameter("windowId");
        request.setAttribute("locale_key", windowId + "_locale");

        return mapping.findForward("success");
        // =================================================
    }

}
