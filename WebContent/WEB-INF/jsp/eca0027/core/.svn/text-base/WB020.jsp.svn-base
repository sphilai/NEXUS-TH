<%--
 * Project : GSCM
 * 
 * WB020 - BL UPLOAD
 *
 * $Revision: 13730 $
 * 
 * Copyright (c) 2013 DENSO CORPORATION. All rights reserved.
 --%>

<html:form action="/WB020Init" styleId="mainForm" enctype="multipart/form-data">
    <%--
    -- file upload area
    --%>
    <table class="gscm_search">
        <colgroup>
            <col class="search_odr_upload_prompt_label" />
            <col class="search_upload_file" />
            <col class="search_blank_download_button" />
            <col class="search_display_button" />
            <col />
        </colgroup>
        <tr>
        </tr>
        <tr>
            <td class="prompt">
                <bean:message key="label.odrUploadPrompt" />
            </td>
            <td>
                <input type="file" id="formFileData" style="display:none" />
                <html:file property="formFileData" maxlength="300" styleClass="file_data" errorStyleClass="file_data gscm_error_class" />
                <html:button property="upload" onclick="gscm.commonSubmit('WB020Upload.do', this.form);" styleClass="upload">
                    <bean:message key="button.upload" />
                </html:button>
            </td>
            <td>
                <html:button property="blankDownload" onclick="location.href='files/NEXUS_non_edi_order.zip'" styleClass="blank_download">
                    <bean:message key="button.blankDownload" />
                </html:button>
            </td>
            <td>
                <html:button property="display" onclick="gscm.commonSubmit('WB020Init.do', this.form);" styleClass="display">
                    <bean:message key="button.reflesh" />
                </html:button>
            </td>
            <td>
            </td>
        </tr>
        <tr>
        </tr>
    </table>
    <hr />
    <br />
    <%--
    -- search results
    --%>
    <logic:notEmpty name="WB020Form" property="wb020ListDomainList">
        <table id="tablefix" class="gscm_resultlist">
            <colgroup>
                <col class="resultlist_request_dt" />
                <col class="resultlist_upload_file_nm" />
                <col class="resultlist_upload_file_line_cnt" />
                <col class="resultlist_status" />
                <col class="resultlist_rcv_odr_comp_nm" />
                <col class="resultlist_request_id" />
            </colgroup>
            <thead>
                <tr>
                    <th>
                        <bean:message key="label.uploadDt" />
                    </th>
                    <th>
                        <bean:message key="label.uploadFileNm" />
                    </th>
                    <th>
                        <bean:message key="label.uploadFileLineCnt" />
                    </th>
                    <th>
                        <bean:message key="label.status" />
                    </th>
                    <th>
                        <bean:message key="label.rcvOdrCompNm" />
                    </th>
                    <th>
                        <bean:message key="label.requestId" />
                    </th>
                </tr>
            </thead>
            <tbody>
                <logic:iterate name="WB020Form" property="wb020ListDomainList" id="wb020ListDomain" indexId="index">
                    <ai:stripeline number="${index+1}" odd="gscm_odd" even="gscm_even">
                        <tr class="gscm_odd">
                            <td>
                                <bean:write name="wb020ListDomain" property="requestDtLocal" />
                            </td>
                            <td>
                                <html:text name="wb020ListDomain" property="uploadFileNm" styleClass="wb020_upload_file_nm gscm_disptext" readonly="true" />
                            </td>
                            <td class="right">
                                <bean:write name="wb020ListDomain" property="uploadFileLineCnt" />
                            </td>
                            <td>
                                <c:if test="${wb020ListDomain.statusCd > '2'}">
                                    <a href="#" onclick="errorDownload(${wb020ListDomain.listIndex})" >
                                        <bean:write name="wb020ListDomain" property="statusNm" />
                                    </a>
                                </c:if>
                                <c:if test="${wb020ListDomain.statusCd <= '2'}">
                                    <bean:write name="wb020ListDomain" property="statusNm" />
                                </c:if>
                            </td>
                            <td >
                                <bean:write name="wb020ListDomain" property="rcvOdrCompCd" />
                            </td>
                            <td >
                                <bean:write name="wb020ListDomain" property="requestId" />
                            </td>
                        </tr>
                    </ai:stripeline>
                </logic:iterate>
            </tbody>
        </table>
    </logic:notEmpty>
    <%--
    -- hidden
    --%>
    <html:hidden property="wb020CriteriaDomain.downloadTyp" />
    <html:hidden property="wb020CriteriaDomain.listIndex" />
</html:form>
