<%--
 * Project : GSCM
 * 
 * X9001 - Test Page
 *
 * $Revision: 10090 $
 * 
 * Copyright (c) 2013 DENSO CORPORATION. All rights reserved.
 --%>
<script type="text/javascript" src="js/eca0027/core/X9001.js"></script>
<html:form action="/X9001Init.do" styleId="mainForm" enctype="multipart/form-data">

    <div>[Popup Screen Test]</div>
    
    <%-- popupWT001 args : shipperFlg, carrierCompFlg, customsBrokerFlg --%>
    <html:button property="" onclick="wt001CompSelect();">
    WT001
    </html:button>
    <%-- popupWT004 args : ownerComp --%>
    <html:button property="" onclick="wt004PkgSelect();">
    WT004
    </html:button>
    <%-- popupWT005 args : xmainMark --%>
    <html:button property="" onclick="wt005cmlInfo();">
    WT005
    </html:button>
    <%-- popupWT006 args : ownerComp --%>
    <html:button property="" onclick="wt006OuterPkgSelect();">
    WT006
    </html:button>
    <%-- popupWT007 args : mainMark, mixTagNo --%>
    <html:button property="" onclick="wt007itemNoInfo();">
    WT007
    </html:button>
    <%-- popupWT008 args : cntryCd --%>
    <html:button property="" onclick="wt008PortSelect();">
    WT008
    </html:button>
    <br />
    
    <html:button property="" onclick="wt010WhSelect();">
    WT010
    </html:button>
    <html:button property="" onclick="wt011CntrySelect();">
    WT011
    </html:button>
    <html:button property="" onclick="wt014ShipToSelect();">
    WT014
    </html:button>
    <%-- popupWT015 args : shipperCd, grpNo1, grpNo2 --%>
    <html:button property="" onclick="wt015UnitPriceErrList();">
    WT015
    </html:button>
    <%-- popupWT016 args : shipperCd, grpNo1, grpNo2 --%>
    <html:button property="" onclick="wt016UnregHsCdList();">
    WT016
    </html:button>
    <html:button property="" onclick="wt017ShippingActWarnList();">
    WT017
    </html:button>
    <hr>

    <div>[WT001 Result]</div>
    
    <c:out value="compCd_WT001" />
    <html:text property="x9001ActionForm.compCd_WT001" maxlength="20" size="20" value="${compCd_WT001}" styleClass="" errorStyle="" />
    <br />
    <c:out value="compNm_WT001" />
    <html:text property="x9001ActionForm.compNm_WT001" maxlength="20" size="20" value="${compNm_WT001}" styleClass="" errorStyle="" />
    <br />
    <c:out value="compNmAbb_WT001" />
    <html:text property="x9001ActionForm.compNmAbb_WT001" maxlength="20" size="20" value="${compNmAbb_WT001}" styleClass="" errorStyle="" />
    <br />
    <c:out value="compAddr_WT001" />
    <html:text property="x9001ActionForm.compAddr_WT001" maxlength="20" size="20" value="${compAddr_WT001}" styleClass="" errorStyle="" />
    <br />
    <c:out value="lengthUnitDisp_WT001" />
    <html:text property="x9001ActionForm.lengthUnitDisp_WT001" maxlength="20" size="20" value="${lengthUnitDisp_WT001}" styleClass="" errorStyle="" />
    <br />
    <c:out value="weightUnitDisp_WT001" />
    <html:text property="x9001ActionForm.weightUnitDisp_WT001" maxlength="20" size="20" value="${weightUnitDisp_WT001}" styleClass="" errorStyle="" />
    <br />
    <c:out value="volumeUnitDisp_WT001" />
    <html:text property="x9001ActionForm.volumeUnitDisp_WT001" maxlength="20" size="20" value="${volumeUnitDisp_WT001}" styleClass="" errorStyle="" />

    <div>[WT004 Result]</div>
    <c:out value="rtTyp_WT004" />
    <html:text property="x9001ActionForm.rtTyp_WT004" maxlength="20" size="20" value="${rtTyp_WT004}" styleClass="" errorStyle="" />
    <br />
    <c:out value="pkgItemNo_WT004" />
    <html:text property="x9001ActionForm.pkgItemNo_WT004" maxlength="20" size="20" value="${pkgItemNo_WT004}" styleClass="" errorStyle="" />
    <br />
    <c:out value="modelCd_WT004" />
    <html:text property="x9001ActionForm.modelCd_WT004" maxlength="20" size="20" value="${modelCd_WT004}" styleClass="" errorStyle="" />
    <br />
    <c:out value="pkgMtrlNm_WT004" />
    <html:text property="x9001ActionForm.pkgMtrlNm_WT004" maxlength="20" size="20" value="${pkgMtrlNm_WT004}" styleClass="" errorStyle="" />

    <div>[WT006 Result]</div>
    <c:out value="outerPkgCd_WT006" />
    <html:text property="x9001ActionForm.outerPkgCd_WT006" maxlength="20" size="20" value="${outerPkgCd_WT006}" styleClass="" errorStyle="" />
    <br />
    <c:out value="volumeAfter_WT006" />
    <html:text property="x9001ActionForm.volumeAfter_WT006" maxlength="20" size="20" value="${volumeAfter_WT006}" styleClass="" errorStyle="" />
    <br />
    <c:out value="volumeUnitComp_WT006" />
    <html:text property="x9001ActionForm.volumeUnitComp_WT006" maxlength="20" size="20" value="${volumeUnitComp_WT006}" styleClass="" errorStyle="" />
    <br />
    <c:out value="ownerComp_WT006" />
    <html:text property="x9001ActionForm.ownerComp_WT006" maxlength="20" size="20" value="${ownerComp_WT006}" styleClass="" errorStyle="" />
    <br />
    <c:out value="volumeUnitDisp_WT006" />
    <html:text property="x9001ActionForm.volumeUnitDisp_WT006" maxlength="20" size="20" value="${volumeUnitDisp_WT006}" styleClass="" errorStyle="" />

    <div>[WT008 Result]</div>
    <c:out value="portCd_WT008" />
    <html:text property="x9001ActionForm.portCd_WT008" maxlength="20" size="20" value="${portCd_WT008}" styleClass="" errorStyle="" />
    <br />
    <c:out value="portNm_WT008" />
    <html:text property="x9001ActionForm.portNm_WT008" maxlength="20" size="20" value="${portNm_WT008}" styleClass="" errorStyle="" />
    <br />
    <c:out value="cntryCd_WT008" />
    <html:text property="x9001ActionForm.cntryCd_WT008" maxlength="20" size="20" value="${cntryCd_WT008}" styleClass="" errorStyle="" />
    <br />

    <div>[WT010 Result]</div>
    <c:out value="compCd_WT010" />
    <html:text property="x9001ActionForm.compCd_WT010" maxlength="20" size="20" value="${compCd_WT010}" styleClass="" errorStyle="" />
    <br />
    <c:out value="whCd_WT010" />
    <html:text property="x9001ActionForm.whCd_WT010" maxlength="20" size="20" value="${whCd_WT010}" styleClass="" errorStyle="" />
    <br />
    <c:out value="whNm_WT010" />
    <html:text property="x9001ActionForm.whNm_WT010" maxlength="20" size="20" value="${whNm_WT010}" styleClass="" errorStyle="" />
    <br />

    <div>[WT011 Result]</div>
    <c:out value="cntryCd_WT011" />
    <html:text property="x9001ActionForm.cntryCd_WT011" maxlength="20" size="20" value="${cntryCd_WT011}" styleClass="" errorStyle="" />
    <br />
    <c:out value="cntryNm_WT011" />
    <html:text property="x9001ActionForm.cntryNm_WT011" maxlength="20" size="20" value="${cntryNm_WT011}" styleClass="" errorStyle="" />
    <br />

    <div>[WT014 Result]</div>
    <c:out value="shipToCd_WT014" />
    <html:text property="x9001ActionForm.shipToCd_WT014" maxlength="20" size="20" value="${shipToCd_WT014}" styleClass="" errorStyle="" />
    <br />
    <c:out value="shipToNmAbb_WT014" />
    <html:text property="x9001ActionForm.shipToNmAbb_WT014" maxlength="20" size="20" value="${shipToNmAbb_WT014}" styleClass="" errorStyle="" />
    <br />
    <c:out value="shipToNm_WT014" />
    <html:text property="x9001ActionForm.shipToNm_WT014" maxlength="20" size="20" value="${shipToNm_WT014}" styleClass="" errorStyle="" />
    <br />
    <c:out value="printShipToNm_WT014" />
    <html:text property="x9001ActionForm.printShipToNm_WT014" maxlength="20" size="20" value="${printShipToNm_WT014}" styleClass="" errorStyle="" />
    <br />
    <c:out value="printShipToAddr_WT014" />
    <html:text property="x9001ActionForm.printShipToAddr_WT014" maxlength="20" size="20" value="${printShipToAddr_WT014}" styleClass="" errorStyle="" />
    <br />
    
</html:form>