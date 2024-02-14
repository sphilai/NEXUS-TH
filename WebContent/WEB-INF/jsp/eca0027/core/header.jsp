<%--
 * header.jsp
 *
 * 画面のヘッダ部を構成するJSPです。
 * 
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
--%>
<script>
    function windowClose() {
        location.href = './WindowCloseAction.do?windowId=' + window.name;
    }
</script>
<div class = "gscm_top_left">
    <table class="header_left">
        <colgroup>
            <col class="header_system" />
            <col class="header_server" />
            <col class="header_time_zone" />
            <col class="header_user_name" />
        </colgroup>
        <tr>
            <%-- システムタイトルブロック --%>
            <td>
                <h1>
                    <bean:message key="label.systemTitle" />
                </h1>
            </td>
            <td>
                Server:<input type="text" class="header_disptext server" value="${serverNm}" readonly />
            </td>
            <td>
                Time Zone:<input type="text" class="header_disptext time_zone" value="${timeZoneName}" readonly />
            </td>
            <td>
                User Name:<input type="text" class="header_disptext user_name" value="${usrNmEn}" readonly />
            </td>
        </tr>
    </table>
</div>
<div class = "gscm_top_right">
    <table class="header_right">
        <tr>
            <%-- ボタンブロック --%>
            <td class="right">
                <html:form action="/W0002Init.do" styleId="headerForm">
                    <%-- 個人設定ボタン --%>
                    <c:if test="${topFlg}">
                        <html:button property="personalSetup" styleClass="header_personal_setup">
                            <bean:message key="button.personalSetup" />
                        </html:button>
                    </c:if>
                    <%-- MENUボタン --%>
                    <c:if test="${!topFlg}">
                        <html:button property="menu" styleClass="header_menu" onclick="gscm.commonSubmit('W0002Init.do', this.form);">
                            <bean:message key="button.menu" />
                        </html:button>
                    </c:if>
                    <%-- Infoボタン --%>
                    <html:button property="info" styleClass="header_info" onclick="callContactInfo();">
                        <bean:message key="button.info" />
                    </html:button>
                </html:form>
                <%-- 問合せ先表示 --%>
                <html:form action="/callContactInfoDisplay" method="post">
                    <%-- hidden --%>
                    <logic:notEmpty name="headerOwnerCompCp">
                        <html:hidden property="contactInfoId" value="HELP_${systemId}_${headerOwnerCompCp}"/>
                    </logic:notEmpty>
                    <logic:empty name="headerOwnerCompCp">
                        <html:hidden property="contactInfoId" value="HELP_${systemId}"/>
                    </logic:empty>
                    <html:hidden property="locale" value="${sessionScope[locale_key]}" />
                </html:form>
            </td>
        </tr>
    </table>
</div>
