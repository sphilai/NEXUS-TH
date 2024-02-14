<%--
 * W1009.jsp
 * 
 *
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 --%>
<script type="text/javascript"><!--
$(function() {
    $('#tablefix').tablefix({height: 360, fixRows: 2});
    init();
});
//--></script>
<html:form action="/W1009Init" styleId="mainForm">
  <table class="gscm_exppackaging">
    <colgroup>
      <col class="exppackaging_request_no" />
      <col class="exppackaging_plt_no" />
      <col class="exppackaging_shipper" />
      <col class="exppackaging_consignee" />
      <col class="exppackaging_ship_to" />
      <col class="exppackaging_nexux_wh_cocd" />
      <col class="exppackaging_nexus_wh_cd" />
      <col class="exppackaging_trans" />
      <col class="exppackaging_weight_unit" />
      <col class="exppackaging_request_no_status" />
    </colgroup>
    <tr>
      <th align="left"><bean:message key="label.requestNo" /></th>
      <th align="left"><bean:message key="label.pltNo" /></th>
      <th align="left"><bean:message key="label.shipper" /></th>
      <th align="left"><bean:message key="label.consignee" /></th>
      <th align="left"><bean:message key="label.nexusShipTo" /></th>
      <th align="left"><bean:message key="label.nexusWhCoCd" /></th>
      <th align="left"><bean:message key="label.nexusWhCd" /></th>
      <th align="left"><bean:message key="label.trans" /></th>
      <th align="left"><bean:message key="label.W1006.weightUnit" /></th>
      <th align="left"><bean:message key="label.requestNoStatus" /></th>
    </tr>
    <tr>
      <td style="OVERFLOW: hidden;"><bean:write name="W1009Form" property="w1009CriteriaDomain.expRequestNo" /></td>
      <td style="OVERFLOW: hidden;"><bean:write name="W1009Form" property="w1009CriteriaDomain.palletNo" /></td>
      <td style="OVERFLOW: hidden;"><bean:write name="W1009Form" property="w1009CriteriaDomain.shipperCd" /></td>
      <td style="OVERFLOW: hidden;"><bean:write name="W1009Form" property="w1009CriteriaDomain.consigneeCd" /></td>
      <td style="OVERFLOW: hidden;"><bean:write name="W1009Form" property="w1009CriteriaDomain.shipToCd" /></td>
      <td style="OVERFLOW: hidden;"><bean:write name="W1009Form" property="w1009CriteriaDomain.packingCompCd" /></td>
      <td style="OVERFLOW: hidden;"><bean:write name="W1009Form" property="w1009CriteriaDomain.packingWhCd" /></td>
      <td style="OVERFLOW: hidden;"><bean:write name="W1009Form" property="w1009CriteriaDomain.trnsCd" /></td>
      <td style="OVERFLOW: hidden;"><bean:write name="W1009Form" property="w1009CriteriaDomain.weightUnit" /></td>
      <td style="OVERFLOW: hidden;"><bean:write name="W1009Form" property="w1009CriteriaDomain.requestStatus" /></td>
    </tr>
  </table>
  <hr />
  <table class="gscm_resultlist_button">
    <tr>
      <td>
		<html:button property="addNewLine10" tabindex="1" styleId="add_new_line10" styleClass="add_new_line10" onclick="gscm.commonSubmit('W1009AddNewLine.do', this.form);">
          <bean:message key="button.addNewLine10" />
        </html:button>
		<html:button property="delete" tabindex="2" onclick="gscm.submitDeleteConfirm('W1009DeleteLine.do', this.form);" styleClass="delete">
		  <bean:message key="button.delete" />
        </html:button>
		<html:button property="save" tabindex="3" onclick="gscm.submitCreateConfirm('W1009SaveLine.do', this.form);" styleClass="save" style="width : 200px">
		  <bean:message key="button.saveAndBackToRegister" />
        </html:button>
      </td>
      <!-- <td align="right">
      	<html:button property="backToRegister" tabindex="4" onclick="gscm.submitBack('W1008Init.do', this.form);" styleClass="backToRegister">
		  <bean:message key="button.backToRegister" />
        </html:button>
      </td> -->
    </tr>
  </table>
  <p>* Please input RT only, this information will show on invoice</p>
  <!--- search results --->
  <table id="tablefix" class="gscm_resultlist">
	<colgroup>
      <col class="resultlist_del" />
      <col class="resultlist_no" />
      <col class="resultlist_select_pkg" />
      <col class="resultlist_desc_country" />
      <col class="resultlist_desc_currency" />
      <col class="resultlist_desc_unit_price" />
      <col class="resultlist_desc_unit_lwh" />
      <col class="resultlist_pkg_part_no_length" />
      <col class="resultlist_pkg_part_no_width" />
      <col class="resultlist_pkg_part_no_height" />
      <col class="resultlist_type_nw_per_material_unti" />
      <col class="resultlist_type_nw_per_material" />
      <col class="resultlist_type_unit_qty" />
      <col class="resultlist_type_quantity" />
    </colgroup>
    <thead>
		<tr>
		  <th rowspan="2"><bean:message key="label.del" /><br />
		  <input type="checkbox" name="checkAll" onclick="allcheck('listDomainList', 'selected', this.checked);" /></th>
		  <th rowspan="2"><bean:message key="label.no" /></th>
		  <th rowspan="2"><bean:message key="label.selectPkg" /></th>
		  <th colspan="4"><bean:message key="label.description" /></th>
		  <th colspan="3"><bean:message key="label.pkgPartNo" /></th>
		  <th colspan="4"><bean:message key="label.modelCd" /></th>
		</tr>
		<tr>
		  <th><bean:message key="label.originCntryCd" /></th>
		  <th><bean:message key="label.currency" /></th>
		  <th><bean:message key="label.unitPriceCusPur" /></th>
          <th><bean:message key="label.unitOfLwh" /></th>
          <th><bean:message key="label.length" /></th>
          <th><bean:message key="label.width" /></th>
          <th><bean:message key="label.height" /></th>
          <th><bean:message key="label.unitNwPerMaterial" /></th>
          <th><bean:message key="label.nwPerMaterial" /></th>
          <th><bean:message key="label.unitOfQty" /></th>
          <th><bean:message key="label.quantity" /></th>
		</tr>
    </thead>
    <tbody>
		<logic:iterate name="W1009Form" property="listDomainList" id="listDomainList" indexId="idx">
		  <ai:stripeline number="${idx + 1}" odd="gscm_odd" even="gscm_even">
		    <tr>
				<td rowspan="2" class="center"><html:checkbox name="listDomainList" property="selected" tabindex="${idx + 1}1" indexed="true" /></td>
                <td rowspan="2" class="center">${idx + 1}</td>
                <td>
                	<html:select name="listDomainList" property="selectPkgFlg" indexed="true" tabindex="${idx + 1}2" onchange="selectPkgFlg($(this),'${idx}',true,'');" styleId="select_pkg_flg" styleClass="select_pkg_flg" errorStyleClass="select_pkg_flg gscm_error_class" disabled="true">
                    	<html:options collection="flag" property="id" labelProperty="name"/>
                	</html:select>
                </td>
                <td colspan="4">
                	<html:text readonly="true"  name="listDomainList" property="description" tabindex="${idx + 1}3" indexed="true" styleId="description" maxlength="100" styleClass="description gscm_required" errorStyleClass="description gscm_error_class" />
                </td>
                <td colspan="3">
                	<html:text readonly="true"  name="listDomainList" property="pkgItemNo" tabindex="${idx + 1}4" indexed="true" styleId="pkg_item_no" maxlength="27" styleClass="pkg_item_no gscm_required" errorStyleClass="pkg_item_no gscm_error_class" />
                </td>
                <td colspan="4">
                	<html:text readonly="true" name="listDomainList" property="modelCd" tabindex="${idx + 1}5" indexed="true" styleId="model_cd" maxlength="20" styleClass="model_cd" errorStyleClass="model_cd gscm_error_class" />
                </td>
		    </tr>
		    <tr>
				<td>
					<html:button property="select" styleClass="select" tabindex="${idx + 1}6" onclick="selectPkgItem('${idx}');" indexed="true">
		  				<bean:message key="button.select" />
        			</html:button>
        		</td>
                <td>
                	<html:select disabled="true"  name="listDomainList" property="selectOriginCntryCd" tabindex="${idx + 1}7" indexed="true" onchange="setSelected($(this),'[${idx}].originCntryCd');" styleId="origin_cntry_cd" styleClass="origin_cntry_cd gscm_required" errorStyleClass="origin_cntry_cd gscm_error_class" >
                    	<html:options collection="cntry" property="id" labelProperty="name"/>
                	</html:select>
                	<html:hidden name="listDomainList" property="originCntryCd" indexed="true" />
                </td>
                <td>
                	<html:select disabled="true"  name="listDomainList" property="selectCurrCd" tabindex="${idx + 1}8" indexed="true" onchange="setSelected($(this),'[${idx}].currCd');" styleId="curr_cd" styleClass="curr_cd gscm_required" errorStyleClass="curr_cd gscm_error_class" >
                    	<html:options collection="curr" property="id" labelProperty="name"/>
                	</html:select>
                	<html:hidden name="listDomainList" property="currCd" indexed="true" />
                </td>
                <td style="OVERFLOW: hidden;">
                	<html:text readonly="true"  name="listDomainList" property="unitPrice" tabindex="${idx + 1}9" indexed="true" styleId="unit_price" maxlength="10" styleClass="unit_price gscm_required" errorStyleClass="unit_price gscm_error_class" />
                </td>
                <td>
                	<html:select disabled="true"  name="listDomainList" property="selectLengthUnit" tabindex="${idx + 1}9" indexed="true" onchange="setSelected($(this),'[${idx}].lengthUnit');" styleId="length_unit" styleClass="length_unit gscm_required" errorStyleClass="length_unit gscm_error_class" >
                    	<html:options collection="qtyUnit" property="id" labelProperty="name"/>
                	</html:select>
                	<html:hidden name="listDomainList" property="lengthUnit" indexed="true" />
                </td>
                <td style="OVERFLOW: hidden;">
                	<html:text readonly="true"  name="listDomainList" property="length" tabindex="${idx + 1}9" indexed="true" styleId="length" maxlength="6" styleClass="length gscm_required" errorStyleClass="length gscm_error_class" />
                </td>
                <td style="OVERFLOW: hidden;">
                	<html:text readonly="true"  name="listDomainList" property="width" tabindex="${idx + 1}9" indexed="true" styleId="width" maxlength="6" styleClass="width gscm_required" errorStyleClass="width gscm_error_class" />
                </td>
                <td style="OVERFLOW: hidden;">
                	<html:text readonly="true"  name="listDomainList" property="height" tabindex="${idx + 1}9" indexed="true" styleId="height" maxlength="6" styleClass="height gscm_required" errorStyleClass="height gscm_error_class" />
                </td>
                <td >
                    <!--UT458 Start--> 
                    <html:select disabled="true" name="listDomainList" property="selectUnitNetWeight" tabindex="${idx + 1}9" indexed="true" onchange="setSelected($(this),'[${idx}].netWeightUnit');" styleId="unit_weight" styleClass="unit_weight gscm_required" errorStyleClass="unit_weight gscm_error_class" >
                    <!--UT458 End-->
                        <html:options collection="unitNet" property="id" labelProperty="name"/>
                    </html:select>
                    <html:hidden name="listDomainList" property="netWeightUnit" indexed="true" />
                </td>
                <td style="OVERFLOW: hidden;">
                    <html:text readonly="true"  name="listDomainList" property="netWeight" tabindex="${idx + 1}9" indexed="true" styleId="net_weight" maxlength="10" styleClass="net_weight gscm_required" errorStyleClass="net_weight gscm_error_class" />
                </td>
                <td>
                     <html:select name="listDomainList" property="selectQtyUnit" tabindex="${idx + 1}9" indexed="true" onchange="setSelected($(this),'[${idx}].qtyUnit');" styleId="qty_unit" styleClass="qty_unit gscm_required" errorStyleClass="qty_unit gscm_error_class" >
                        <html:options collection="qtyUnitList" property="id" labelProperty="name"/>
                    </html:select>
                    <html:hidden name="listDomainList" property="qtyUnit" indexed="true" />
                </td>
                <td style="OVERFLOW: hidden;">
                    <html:text  name="listDomainList" property="qty" tabindex="${idx + 1}9" indexed="true" styleId="qty" maxlength="7" styleClass="qty gscm_required" errorStyleClass="qty gscm_error_class" />
                </td>
                <html:hidden name="listDomainList" property="expRequestNo" indexed="true" />
                <html:hidden name="listDomainList" property="palletNo" indexed="true" />
                <html:hidden name="listDomainList" property="expRequestRtItemId" indexed="true" />
                <html:hidden name="listDomainList" property="outerCode" indexed="true" />
                <html:hidden name="listDomainList" property="weightUnit" indexed="true" />
            </tr>
          </ai:stripeline>
        </logic:iterate>
    </tbody>
  </table>
  <html:hidden property="callScreenId" />
  <html:hidden name="W1009Form" property="w1009CriteriaDomain.mainMark"/>
  <html:hidden name="W1009Form" property="w1009CriteriaDomain.shipperCd" />
  <html:hidden name="W1009Form" property="w1009CriteriaDomain.dcsId" />
  <html:hidden name="W1009Form" property="w1009CriteriaDomain.ownerComp" />
    <html:hidden name="W1009Form" property="w1009CriteriaDomain.lengthUnitHeader" />
</html:form>