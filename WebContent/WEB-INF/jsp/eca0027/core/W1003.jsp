<%--
 * W1003.jsp
 * 
 *
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 --%>
<script type="text/javascript"><!--
$(function() {
    $('#tablefix').tablefix({height: 460, fixRows: 2});
    setNetWeight();
});
//--></script>
<html:form action="/W1003Init" styleId="mainForm">
  <table class="header_1">
    <colgroup>
      <col class="search_request_no" />
      <col class="search_shipper" />
      <col class="search_consignee" />
      <col class="search_ship_to" />
      <col class="search_trans" />
      <col class="search_weight_unit" />
    </colgroup>
    <tr>
      <th align="left"><bean:message key="label.requestNo" /></th>
      <th align="left"><bean:message key="label.shipper" /></th>
      <th align="left"><bean:message key="label.consignee" /></th>
      <th align="left"><bean:message key="label.nexusShipTo" /></th>
      <th align="left"><bean:message key="label.trans" /></th>
      <th align="left"><bean:message key="label.weightUnit" /></th>
    </tr>
    <tr>
      <td style="OVERFLOW: hidden;"><bean:write name="W1003Form" property="w1003CriteriaDomain.expRequestNo" /></td>
      <td style="OVERFLOW: hidden;"><bean:write name="W1003Form" property="w1003CriteriaDomain.shipperCd" /></td>
      <td style="OVERFLOW: hidden;"><bean:write name="W1003Form" property="w1003CriteriaDomain.consigneeCd" /></td>
      <td style="OVERFLOW: hidden;"><bean:write name="W1003Form" property="w1003CriteriaDomain.shipToCd" /></td>
      <td style="OVERFLOW: hidden;"><bean:write name="W1003Form" property="w1003CriteriaDomain.trnsCd" /></td>
      <td style="OVERFLOW: hidden;"><bean:write name="W1003Form" property="w1003CriteriaDomain.weightUnit" /></td>
    </tr>
  </table>
  <table>
  	<tr>
  		<td>
  			<fieldset id="fieldset3" style="border: #000000 1px solid;width: 380px">
  			<legend style="font-weight: bold;"><bean:message key="label.W1003.totalQty" /></legend>
  			<table class="header_qty">
  			  <colgroup>
      			<col class="search_unit" />
      			<col class="search_qty" />
      			<col class="search_unit" />
      			<col class="search_qty" />
      			<col class="search_blank" />
    		  </colgroup>
  			  <tr>
      			<th  align="right"><bean:message key="label.unit" /></th>
      			<th  align="right"><bean:message key="label.W1003.qty" /></th>
      			<th  align="right"><bean:message key="label.unit" /></th>
      			<th  align="right"><bean:message key="label.W1003.qty" /></th>
      			<th  >&nbsp;</th>
    		  </tr>
    		 <c:if test="${W1003Form.displayQtyList == true}">
    		  <logic:iterate name="W1003Form" property="qtyList" id="qtyList" indexId="idx">
    		  <c:if test="${W1003Form.qtyList[idx+1] != null}">
      		  <tr>
        		<td align="right" style="OVERFLOW: hidden;"><bean:write name="qtyList" property="qtyUnit1" /></td>
        		<td align="right" style="OVERFLOW: hidden;"><html:text name="qtyList" property="qty1" indexed="true" styleClass="search_qty right gscm_disptext" readonly="true"/></td>
        		<td align="right" style="OVERFLOW: hidden;"><bean:write name="qtyList" property="qtyUnit2" /></td>
        		<td align="right" style="OVERFLOW: hidden;"><html:text name="qtyList" property="qty2" indexed="true" styleClass="search_qty right gscm_disptext" readonly="true"/></td>
        		<td>&nbsp;</td>
      		  </tr>
      		  </c:if>
      		  <c:if test="${W1003Form.qtyList[idx+1] == null}">
      		  <tr>
        		<td  align="right" style="OVERFLOW: hidden;"><bean:write name="qtyList" property="qtyUnit1" /></td>
        		<td  align="right" style="OVERFLOW: hidden;"><html:text name="qtyList" property="qty1" indexed="true" styleClass="search_qty right gscm_disptext" readonly="true"/></td>
        		<td  align="right" style="OVERFLOW: hidden;"><bean:write name="qtyList" property="qtyUnit2" /></td>
        		<td  align="right" style="OVERFLOW: hidden;"><html:text name="qtyList" property="qty2" indexed="true" styleClass="search_qty right gscm_disptext" readonly="true"/></td>
        		<td >&nbsp;</td>
      		  </tr>
      		  </c:if>
    		  </logic:iterate>
    		 </c:if>
    		 <c:if test="${W1003Form.displayQtyList == false}">
    		  <tr>
        		<td  align="right">&nbsp;</td>
        		<td  align="right">&nbsp;</td>
        		<td  align="right">&nbsp;</td>
        		<td  align="right">&nbsp;</td>
        		<td >&nbsp;</td>
      		  </tr>
    		 </c:if>
  			</table>
  			</fieldset>
  		</td>
  		<td>
  			<fieldset id="fieldset1" style="border: #000000 1px solid;">
  			<legend style="font-weight: bold;"><bean:message key="label.W1003.totalAmount" /></legend>
  			<table class="header_amount">
  			  <colgroup>
  	  			<col class="search_total_amount" />
      			<col class="search_curr" />
      			<col class="search_amount" />
      			<col class="search_total_amount" />
      			<col class="search_curr" />
      			<col class="search_amount" />
      			<col class="search_blank" />
  			  </colgroup>
  			  <tr>
      			<th > &nbsp;</th>
      			<th align="right"><bean:message key="label.W1003.curr" /></th>
      			<th align="right"><bean:message key="label.amount" /></th>
      			<th >&nbsp;</th>
      			<th align="right"><bean:message key="label.W1003.curr" /></th>
      			<th align="right"><bean:message key="label.amount" /></th>
      			<th >&nbsp;</th>
  			  </tr>
  			<c:if test="${W1003Form.displayAmountList == true}">
  			  <logic:iterate name="W1003Form" property="amountList" id="amountList" indexId="idx">
  			  <c:if test="${W1003Form.amountList[idx+1] != null}">
  	  		  <tr>
  	  		  	<c:if test="${idx == 0}">
  	    			<td align="center"><bean:message key="label.commercial" /></td>
  	    		</c:if>
  	    		<c:if test="${idx != 0}">
  	    			<td align="center">&nbsp;</td>
  	    		</c:if>
        		<td align="right" style="OVERFLOW: hidden;"><bean:write name="amountList" property="currencyCd1" /></td>
        		<td align="right" style="OVERFLOW: hidden;"><html:text name="amountList" property="unitPrice1" indexed="true" styleClass="search_amount right gscm_disptext" readonly="true"/></td>
        		<c:if test="${idx == 0}">
        			<td align="center"><bean:message key="label.nonCommercial" /></td>
        		</c:if>
        		<c:if test="${idx != 0}">
        			<td align="center">&nbsp;</td>
        		</c:if>
        		<td align="right" style="OVERFLOW: hidden;"><bean:write name="amountList" property="currencyCd2" /></td>
        		<td align="right" style="OVERFLOW: hidden;"><html:text name="amountList" property="unitPrice2" indexed="true" styleClass="search_amount right gscm_disptext" readonly="true"/></td>
        		<td >&nbsp;</td>
  	  		  </tr>
  	  		  </c:if>
  	  		  <c:if test="${W1003Form.amountList[idx+1] == null}">
  	  		  <tr>
  	    		<c:if test="${idx == 0}">
  	    			<td align="center"><bean:message key="label.commercial" /></td>
  	    		</c:if>
  	    		<c:if test="${idx != 0}">
  	    			<td align="center">&nbsp;</td>
  	    		</c:if>
        		<td align="right" style="OVERFLOW: hidden;"><bean:write name="amountList" property="currencyCd1" /></td>
        		<td align="right" style="OVERFLOW: hidden;"><html:text name="amountList" property="unitPrice1" indexed="true" styleClass="search_amount right gscm_disptext" readonly="true"/></td>
        		<c:if test="${idx == 0}">
        			<td align="center"><bean:message key="label.nonCommercial" /></td>
        		</c:if>
        		<c:if test="${idx != 0}">
        			<td class="table_border_bottom" align="center">&nbsp;</td>
        		</c:if>
        		<td align="right" style="OVERFLOW: hidden;"><bean:write name="amountList" property="currencyCd2" /></td>
        		<td align="right" style="OVERFLOW: hidden;"><html:text name="amountList" property="unitPrice2" indexed="true" styleClass="search_amount right gscm_disptext" readonly="true"/></td>
        		<td >&nbsp;</td>
  	  		  </tr>
  	  		  </c:if>
  			  </logic:iterate>
  	  		</c:if>
  	  		<c:if test="${W1003Form.displayAmountList == false}">
  			   <tr>
  	    		<td  align="center"><bean:message key="label.commercial" /></td>
        		<td  align="right">-</td>
        		<td  align="right">-</td>
        		<td  align="center"><bean:message key="label.nonCommercial" /></td>
        		<td  align="right">-</td>
        		<td  align="right">-</td>
        		<td >&nbsp;</td>
  	  		   </tr>
  	  		</c:if>
  			</table>
  			</fieldset>
  		</td>
  	</tr>
  </table>
  <br/>
  <table class="gscm_search_button">
    <tr>
      <td>
		<html:button property="addNewLine10" styleId="add_new_line10" styleClass="add_new_line10" onclick="gscm.commonSubmit('W1003AddNewLine.do', this.form);">
          <bean:message key="button.addNewLine10" />
        </html:button>
      </td>
      <td class="right">
      	<html:button property="copy" onclick="gscm.commonSubmit('W1003CopyLine.do', this.form);" styleClass="copy">
		  <bean:message key="button.copy" />
        </html:button>
        <html:button property="save" onclick="gscm.submitCreateConfirm('W1003SaveLine.do', this.form);" styleClass="save">
		  <bean:message key="button.save" />
        </html:button>
		<html:button property="delete" onclick="gscm.submitDeleteConfirm('W1003DelLine.do', this.form);" styleClass="delete">
		  <bean:message key="button.delete" />
        </html:button>
        <html:button property="backToHead" onclick="doMoveToHeader('W1002Init.do', this.form);" styleClass="backToHead">
		  <bean:message key="button.backToHeader" />
        </html:button>
        <html:button property="moveToKitDt" onclick="gscm.commonSubmit('W1004Init.do', this.form);" styleClass="moveToKitDt">
		  <bean:message key="button.moveToKitDt" />
        </html:button>
        <html:button property="moveToRegister" onclick="doMoveToRegister('W1006Init.do', this.form);" styleClass="moveToRegister">
		  <bean:message key="button.moveToRegister" />
        </html:button>
      </td>
    </tr>
  </table>
  <hr />
  <c:if test="${W1003Form.displayList}">
  <!--- results --->
  <table id="tablefix" class="gscm_resultlist">
	<colgroup>
      <col class="resultlist_ck" />
      <col class="resultlist_select" />
      <col class="resultlist_kit" />
      <col class="resultlist_customer_no" />     
      <col class="resultlist_pkg_cd" />
      <col class="resultlist_co" />
      <col class="resultlist_qty_unit" />
      <col class="resultlist_qty" />
      <col class="resultlist_unit_price" />
      <col class="resultlist_nw" />
      <col class="resultlist_totalnw" />
      <col class="resultlist_comm" />
      <col class="resultlist_re" />
      <col class="resultlist_location" />
      <col class="resultlist_constrution" />
    </colgroup>
    <thead>
		<tr>
		  <th><bean:message key="label.ck" /></th>
		  <th rowspan="2"><bean:message key="label.select" /></th>
		  <th rowspan="2"><bean:message key="label.kitParent" /></th>
		  <th><bean:message key="label.customerOrderNo" /></th>
		  <th colspan="7"><bean:message key="label.prod" /></th>
		  <th colspan="3"><bean:message key="label.itemNo" /></th>
		  <th ><bean:message key="label.dgGoodsImExCtrl" /></th>
		</tr>
		<tr>
		  <th><bean:message key="label.line" /></th>
		  <th><bean:message key="label.customerItemNo" /></th>		  
		  <th><bean:message key="label.pkgCd" /></th>
          <th><bean:message key="label.co" /></th>
          <th><bean:message key="label.qtyUnit" /></th>
          <th><bean:message key="label.qty" /></th>
          <th><bean:message key="label.unitPrice" /></th>
          <th><bean:message key="label.unitNetWeight" /></th>
          <th><bean:message key="label.totalNetWeight" /></th>
          <th><bean:message key="label.comm" /></th>
          <th><bean:message key="label.rEx" /></th>
          <th><bean:message key="label.location" /></th>
          <th><bean:message key="label.construction" /></th>
		</tr>
    </thead>
    <tbody>
    <logic:iterate name="W1003Form" property="listDomainList" id="listDomainList" indexId="idx">
        <ai:stripeline number="${idx + 1}" odd="gscm_odd" even="gscm_even">
		<tr>
				<td class="center">
                    <html:checkbox name="listDomainList" property="selected" indexed="true" />
                </td>
                <td rowspan="2" class="center"> 
                	<html:button property="select" styleClass="select" indexed="true" disabled="true"> 
		  				<bean:message key="button.select" />
        			</html:button>
        		</td>
                <td rowspan="2" class="center">
					<html:select name="listDomainList" property="kitParFlg" indexed="true" styleId="kit_par_flg" styleClass="kit_par_flg gscm_required" errorStyleClass="kit_par_flg gscm_error_class" >
                    	<html:options collection="flag" property="id" labelProperty="name"/>
                	</html:select>
                </td>
                <td style="OVERFLOW: hidden;">
                	<html:text name="listDomainList" property="customerPoNo" indexed="true" styleId="customer_po_no" maxlength="20" styleClass="customer_po_no" errorStyleClass="customer_po_no gscm_error_class" />
            	</td>
                <td colspan="7" style="OVERFLOW: hidden;">
                	<html:text name="listDomainList" property="description" indexed="true" styleId="description" maxlength="200" styleClass="description gscm_required" errorStyleClass="description gscm_error_class" />
            	</td>
            	<td style="OVERFLOW: hidden;" colspan="3">
                	<html:text name="listDomainList" property="itemNo" indexed="true" styleId="item_no" maxlength="27" styleClass="item_no" errorStyleClass="item_no gscm_error_class" />
            	</td>
                <td  style="OVERFLOW: hidden;">
<!--                	<html:text name="listDomainList" property="dngrGoodsImpExpCtrl" indexed="true" styleId="dngr_goods_imp_exp" maxlength="2" styleClass="dngr_goods_imp_exp" errorStyleClass="dngr_goods_imp_exp gscm_error_class" />-->
            		<html:select name="listDomainList" property="dngrGoodsImpExpCtrl" indexed="true" styleId="dngr_goods_imp_exp" styleClass="dngr_goods_imp_exp" errorStyleClass="dngr_goods_imp_exp gscm_error_class" >
                    	<html:options collection="flag" property="id" labelProperty="name"/>
                	</html:select>
            	</td>
		    </tr>
		    <tr>
				<td style="OVERFLOW: hidden;">
					<bean:write name="listDomainList" property="lineNo" />
            	</td>
                <td style="OVERFLOW: hidden;">
                	<html:text name="listDomainList" property="customerItemNo" indexed="true" styleId="customer_item_no" maxlength="27" styleClass="customer_item_no" errorStyleClass="customer_item_no gscm_error_class" />
            	</td>
                
                <td style="OVERFLOW: hidden;">
                	<html:text name="listDomainList" property="pkgCd" indexed="true" styleId="pkg_cd" maxlength="3" styleClass="pkg_cd" errorStyleClass="pkg_cd gscm_error_class" />
            	</td>
                <td class="center" style="OVERFLOW: hidden;">
                	<html:select name="listDomainList" property="originCntryCd" indexed="true" styleId="origin_cntry_cd" styleClass="origin_cntry_cd gscm_required" errorStyleClass="origin_cntry_cd gscm_error_class" >
                    	<html:options collection="cntry" property="id" labelProperty="name"/>
                	</html:select>
                </td>
                <td class="center" style="OVERFLOW: hidden;">
                	<html:select name="listDomainList" property="qtyUnit" indexed="true" styleId="qty_unit" styleClass="qty_unit gscm_required" errorStyleClass="qty_unit gscm_error_class" >
                    	<html:options collection="qtyUnit" property="id" labelProperty="name"/>
                	</html:select>
                </td>
                <td style="OVERFLOW: hidden;">
                	<html:text name="listDomainList" property="qty" indexed="true" onchange="calNetWeight(${idx});" onkeyup="calNetWeight(${idx});" onblur="calNetWeight(${idx});" styleId="qty" maxlength="7" styleClass="qty right gscm_required" errorStyleClass="qty gscm_error_class" />
            	</td>
                <td class="center" style="OVERFLOW: hidden;">
                	<html:text name="listDomainList" property="unitPrice" indexed="true" styleId="unit_price" maxlength="12" styleClass="unit_price right gscm_required" errorStyleClass="unit_price gscm_error_class" />
            		<bean:write name="listDomainList" property="currCd" />
            	</td>
                <td style="OVERFLOW: hidden;">
                	<html:text name="listDomainList" property="netWeight" indexed="true" onchange="calNetWeight(${idx});" onkeyup="calNetWeight(${idx});" onblur="calNetWeight(${idx});" styleId="net_weight" maxlength="13" styleClass="net_weight right gscm_required" errorStyleClass="net_weight gscm_error_class" />
            	</td>
            	<td style="OVERFLOW: hidden;">
					<html:text name="listDomainList" property="totalNetWeight" indexed="true" styleId="net_weight" styleClass="net_weight right gscm_disptext" readonly="true" />
            	</td>
                <td class="center" style="OVERFLOW: hidden;">
                	<html:select name="listDomainList" property="commercialFlg" indexed="true" styleId="commercial_flg" styleClass="commercial_flg gscm_required" errorStyleClass="commercial_flg gscm_error_class" >
                    	<html:options collection="flag" property="id" labelProperty="id"/>
                	</html:select>
                </td>
                <td class="center" style="OVERFLOW: hidden;">
                	<html:select name="listDomainList" property="reExpGoodsFlg" indexed="true" styleId="re_exp_goods_flg" styleClass="re_exp_goods_flg gscm_required" errorStyleClass="re_exp_goods_flg gscm_error_class" >
                    	<html:options collection="flag" property="id" labelProperty="id"/>
                	</html:select>
                </td>
                <td style="OVERFLOW: hidden;">
                	<html:text name="listDomainList" property="locationNo" indexed="true" styleId="location_no" maxlength="5" styleClass="location_no" errorStyleClass="location_no gscm_error_class" />
            	</td>
                <td style="OVERFLOW: hidden;">
                	<html:text name="listDomainList" property="constructionWorkNo" indexed="true" styleId="construction_work_no" maxlength="12" styleClass="construction_work_no" errorStyleClass="construction_work_no gscm_error_class" />
            	</td>
            	<html:hidden name="listDomainList" property="currCd" indexed="true" />
            	<html:hidden name="listDomainList" property="lineNo" indexed="true" />
            	<html:hidden name="listDomainList" property="expRequestNo" indexed="true" />
            	<html:hidden name="listDomainList" property="expRequestItemId" indexed="true" />
		    </tr>
		    </ai:stripeline>
        </logic:iterate>
    </tbody>
 </table> 
 </c:if>
 <html:hidden property="callScreenId" />
 <html:hidden property="fromScreenId" />
</html:form>