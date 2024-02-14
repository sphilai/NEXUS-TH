<%--
 * W1010.jsp€‚
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 --%>
<html:form action="/W1010Init" styleId="mainForm" enctype="multipart/form-data">

    <table class="gscm_search_button">
        <colgroup>
            <col class="upload_select_file" />
            <col class="upload_borwd_file" />
            <col class="upload_file" />
            <col class="download_file" />
        </colgroup>
        <tr>
        	<td>
        		 <html:button property="backToHead" styleClass="backToHead" onclick="gscm.submitBack('W1002Init.do', this.form);">
                    <bean:message key="button.backToHeader" />
                </html:button>
        	</td>
        	<td colspan="3">
	        	<html:button property="moveToPkg" styleClass="moveToPkg" onclick="gscm.commonSubmit('W1010MoveToPackaging.do', this.form);">
	          	<bean:message key="button.moveToPkg" />
	        	</html:button>
        	</td>
        </tr>
        <tr>
            <th>
            	<bean:message key="label.selectCsvFile" />
            </th>
            <td>
            	<input type="file" id="formFileData" style="display:none" />
                <html:file property="formFileData" maxlength="300" styleClass="file_data" errorStyleClass="file_data gscm_error_class" />
            </td>
            <td>
                <html:button property="upload" onclick="gscm.commonSubmit('W1010Upload.do', this.form);" styleClass="upload">
                    <bean:message key="button.upload" />
                </html:button>
            </td>
            <td>
                <html:button property="download" onclick="gscm.commonSubmitForCheck('W1010Download.do', this.form, 'false', 'false');" styleClass="download">
                    <bean:message key="button.downloadCsv" />
                </html:button>
            </td>
        </tr>
    </table>
    
    <%--
    -- hidden
    --%>
    <html:hidden property="callScreenId" />
    <html:hidden property="w1010CriteriaDomain.expRequestNo" name="W1010Form" />
</html:form>
