/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.integration;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.dao.ComnAuxDao;
import com.globaldenso.eca0027.core.business.domain.T0100BatchDeleteDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain;

/**
 * This is a DAO implement class of garbage data delete batch.
 * <br />不要データ削除バッチのDAO実装クラスです。
 *
 * <pre>
 * This is creating based on the following specifications.<br />
 * 以下の仕様をベースに作成しています。
 * trunk\200_外部設計\011_外部設計書(更新不可12月版)\08_Job Definition Document\T_Common Auxiliary Screen\ジョブ定義書_ECA0027T0100_不要データ削除.xls の revision 358
 * trunk\300_内部設計\370_SQLMap定義書\08_Job Definition Document\T_Common Auxiliary Screen\SQLMap Definition Document (T_Common Auxiliary Screen) .xls の revision 2316
 * trunk\300_内部設計\380_内部設計書\386_Batch\Class Relationship Diagrams Service-DAO (T_Common Auxiliary Screen).xls の revision 1658
 * </pre>
 :
 * @author $Author: G453S402002 $
 * @version $Revision: 14926 $
 */
public class ComnAuxDaoImpl extends SqlMapClientDaoSupport implements
    ComnAuxDao {

    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     *
     */
    public ComnAuxDaoImpl() {
        // No Action
        // 処理なし
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteTtMixKanban(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteTtMixKanban(T0100BatchDeleteCriteriaDomain criteria)
        throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteTtMixKanban", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteTtMixtagItemOdr(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteTtMixtagItemOdr(T0100BatchDeleteCriteriaDomain criteria)
        throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteTtMixtagItemOdr", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteTtMixtagItemNo(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteTtMixtagItemNo(T0100BatchDeleteCriteriaDomain criteria)
        throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteTtMixtagItemNo", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteTtMixtagRt(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteTtMixtagRt(T0100BatchDeleteCriteriaDomain criteria)
        throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteTtMixtagRt", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteTtPltzInstrOdr(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteTtPltzInstrOdr(T0100BatchDeleteCriteriaDomain criteria)
        throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteTtPltzInstrOdr", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteTtPltzInstrItemNo(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteTtPltzInstrItemNo(T0100BatchDeleteCriteriaDomain criteria)
        throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteTtPltzInstrItemNo", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteTtPltzItemOdr(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteTtPltzItemOdr(T0100BatchDeleteCriteriaDomain criteria)
        throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteTtPltzItemOdr", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteTtPltzKanban(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteTtPltzKanban(T0100BatchDeleteCriteriaDomain criteria)
        throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteTtPltzKanban", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#searchTtPltzItemMixtag(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends T0100BatchDeleteDomain> searchTtPltzItemMixtag(
        T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException {
        return (List<T0100BatchDeleteDomain>) getSqlMapClientTemplate()
            .queryForList("ComnAux.SearchTtPltzItemMixtag", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#searchTtPltzItemPltzInstrNo(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends T0100BatchDeleteDomain> searchTtPltzItemPltzInstrNo(
        T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException {
        return (List<T0100BatchDeleteDomain>) getSqlMapClientTemplate()
            .queryForList("ComnAux.SearchTtPltzItemPltzInstrNo", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteTtPltzItem(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteTtPltzItem(T0100BatchDeleteCriteriaDomain criteria)
        throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteTtPltzItem", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteTtMixtag(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteTtMixtag(T0100BatchDeleteCriteriaDomain criteria)
        throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteTtMixtag", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteTtPltzInstr(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteTtPltzInstr(T0100BatchDeleteCriteriaDomain criteria)
        throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteTtPltzInstr", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteTtShippingFirm(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteTtShippingFirm(T0100BatchDeleteCriteriaDomain criteria)
        throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteTtShippingFirm", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#searchTtPltzXMainMark(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends T0100BatchDeleteDomain> searchTtPltzXMainMark(
        T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException {
        return (List<T0100BatchDeleteDomain>) getSqlMapClientTemplate()
            .queryForList("ComnAux.SearchTtPltzXMainMark", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#searchTtPltzByStagingInstr(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends T0100BatchDeleteDomain> searchTtPltzByStagingInstr(
        T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException {
        return (List<T0100BatchDeleteDomain>) getSqlMapClientTemplate()
            .queryForList("ComnAux.SearchTtPltzStagingInstr", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#searchTtPltzByStagingActuality(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends T0100BatchDeleteDomain> searchTtPltzByStagingActuality(
        T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException {
        return (List<T0100BatchDeleteDomain>) getSqlMapClientTemplate()
            .queryForList("ComnAux.SearchTtPltzStagingActuality", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteTtPltz(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteTtPltz(T0100BatchDeleteCriteriaDomain criteria)
        throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteTtPltz", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteTtXpltz(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteTtXpltz(T0100BatchDeleteCriteriaDomain criteria)
        throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteTtXpltz", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteTtStgInstr(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteTtStgInstr(T0100BatchDeleteCriteriaDomain criteria)
        throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteTtStgInstr", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteTtStgAct(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteTtStgAct(T0100BatchDeleteCriteriaDomain criteria)
        throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteTtStgAct", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteLbFileManagerByshippinActMainReinv(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteLbFileManagerByshippinActMainReinv(
        T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteLbFileManagershippinActMainReinv", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteTtShippingDocumentByMainReinv(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteTtShippingDocumentByMainReinv(
        T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteTtShippingDocumentMainReinv", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteTtPackAtchItemNoByMainReinv(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteTtPackAtchItemNoByMainReinv(
        T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteTtPackAtchItemNoMainReinv", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteTtPackingAttachedCmlByMainReinv(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteTtPackingAttachedCmlByMainReinv(
        T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteTtPackingAttachedCmlMainReinv", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteLbFileManagerPackingByMainReinv(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteLbFileManagerPackingByMainReinv(
        T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteLbFileManagerPackingMainReinv", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteTtPackingHeadByMainReinv(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteTtPackingHeadByMainReinv(
        T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteTtPackingHeadMainReinv", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteTtInvoiceAttachedByMainReinv(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteTtInvoiceAttachedByMainReinv(
        T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteTtInvoiceAttachedMainReinv", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteLbFileManagerInvoiceByMainReinv(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteLbFileManagerInvoiceByMainReinv(
        T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteLbFileManagerInvoiceMainReinv", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteTtInvoiceHeaderByMainReinv(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteTtInvoiceHeaderByMainReinv(
        T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteTtInvoiceHeaderMainReinv", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteTtInvoiceReInvoiceByMainReinv(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteTtInvoiceReInvoiceByMainReinv(
        T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteTtInvoiceReInvoiceMainReinv", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteLbFileManagerByshippinActMainFrt(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteLbFileManagerByshippinActMainFrt(
        T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteLbFileManagershippinActMainFrt", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteTtShippingDocumentByMainFrt(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteTtShippingDocumentByMainFrt(
        T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteTtShippingDocumentMainFrt", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteTtPackAtchItemNoByMainFrt(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteTtPackAtchItemNoByMainFrt(
        T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteTtPackAtchItemNoMainFrt", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteTtPackingAttachedCmlByMainFrt(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteTtPackingAttachedCmlByMainFrt(
        T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteTtPackingAttachedCmlMainFrt", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteLbFileManagerPackingByMainFrt(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteLbFileManagerPackingByMainFrt(
        T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteLbFileManagerPackingMainFrt", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteTtPackingHeadByMainFrt(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteTtPackingHeadByMainFrt(
        T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteTtPackingHeadMainFrt", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteTtInvoiceAttachedByMainFrt(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteTtInvoiceAttachedByMainFrt(
        T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteTtInvoiceAttachedMainFrt", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteLbFileManagerInvoiceByMainFrt(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteLbFileManagerInvoiceByMainFrt(
        T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteLbFileManagerInvoiceMainFrt", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteTtInvoiceHeaderByMainFrt(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteTtInvoiceHeaderByMainFrt(
        T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteTtInvoiceHeaderMainFrt", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteTtInvoiceByMainFrt(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteTtInvoiceByMainFrt(T0100BatchDeleteCriteriaDomain criteria)
        throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteTtInvoiceFrtMainFrt", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteLbFileManagerByshippinActMain(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteLbFileManagerByshippinActMain(
        T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteLbFileManagershippinActMain", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteTtShippingDocumentByMain(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteTtShippingDocumentByMain(
        T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteTtShippingDocumentMain", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteTtPackAtchItemNoByMain(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteTtPackAtchItemNoByMain(
        T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteTtPackAtchItemNoMain", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteTtPackingAttachedCmlByMain(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteTtPackingAttachedCmlByMain(
        T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteTtPackingAttachedCmlMain", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteLbFileManagerPackingByMain(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteLbFileManagerPackingByMain(
        T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteLbFileManagerPackingMain", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteTtPackingHeadByMain(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteTtPackingHeadByMain(T0100BatchDeleteCriteriaDomain criteria)
        throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteTtPackingHeadMain", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteTtInvoiceAttachedByMain(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteTtInvoiceAttachedByMain(
        T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteTtInvoiceAttachedMain", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteLbFileManagerInvoiceByMain(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteLbFileManagerInvoiceByMain(
        T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteLbFileManagerInvoiceMain", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteTtInvoiceHeaderByMain(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteTtInvoiceHeaderByMain(
        T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteTtInvoiceHeaderMain", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteTtInvoiceByMain(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteTtInvoiceByMain(T0100BatchDeleteCriteriaDomain criteria)
        throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteTtInvoice", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteTtShippingActOdr(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteTtShippingActOdr(T0100BatchDeleteCriteriaDomain criteria)
        throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteTtShippingActOdr", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteLbFileManagerByBlClp(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteLbFileManagerByBlClp(
        T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteLbFileManagerBlClp", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteTtShippingAct(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteTtShippingAct(T0100BatchDeleteCriteriaDomain criteria)
        throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteTtShippingAct", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteTtExpRcvOdrByShiped(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteTtExpRcvOdrByShiped(T0100BatchDeleteCriteriaDomain criteria)
        throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteTtExpRcvOdrShiped", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteTtExpRcvOdrByPrivateNotification(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteTtExpRcvOdrByPrivateNotification(
        T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteTtExpRcvOdrPrivateNotification", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteLbFileManagerByshippinActBforCancelReinv(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteLbFileManagerByshippinActBforCancelReinv(
        T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteLbFileManagershippinActBforCancelReinv", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteTtShippingDocumentByBforCancelReinv(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteTtShippingDocumentByBforCancelReinv(
        T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteTtShippingDocumentBforCancelReinv", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteTtPackAtchItemNoByBforCancelReinv(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteTtPackAtchItemNoByBforCancelReinv(
        T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteTtPackAtchItemNoBforCancelReinv", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteTtPackingAttachedCmlByBforCancelReinv(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteTtPackingAttachedCmlByBforCancelReinv(
        T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteTtPackingAttachedCmlBforCancelReinv", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteLbFileManagerPackingByBforCancelReinv(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteLbFileManagerPackingByBforCancelReinv(
        T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteLbFileManagerPackingBforCancelReinv", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteTtPackingHeadByBforCancelReinv(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteTtPackingHeadByBforCancelReinv(
        T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteTtPackingHeadBforCancelReinv", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteTtInvoiceAttachedByBforCancelReinv(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteTtInvoiceAttachedByBforCancelReinv(
        T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteTtInvoiceAttachedBforCancelReinv", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteLbFileManagerInvoiceByBforCancelReinv(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteLbFileManagerInvoiceByBforCancelReinv(
        T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteLbFileManagerInvoiceBforCancelReinv", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteTtInvoiceHeaderByBforCancelReinv(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteTtInvoiceHeaderByBforCancelReinv(
        T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteTtInvoiceHeaderBforCancelReinv", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteTtInvoiceByBforCancelReinv(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteTtInvoiceByBforCancelReinv(
        T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteTtInvoiceBforCancelReinv", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteLbFileManagerByshippinActBforCancelFrt(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteLbFileManagerByshippinActBforCancelFrt(
        T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteLbFileManagershippinActBforCancelFrt", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteTtShippingDocumentByBforCancelFrt(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteTtShippingDocumentByBforCancelFrt(
        T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteTtShippingDocumentBforCancelFrt", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteTtPackAtchItemNoByBforCancelFrt(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteTtPackAtchItemNoByBforCancelFrt(
        T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteTtPackAtchItemNoBforCancelFrt", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteTtPackingAttachedCmlByBforCancelFrt(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteTtPackingAttachedCmlByBforCancelFrt(
        T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteTtPackingAttachedCmlBforCancelFrt", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteLbFileManagerPackingByBforCancelFrt(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteLbFileManagerPackingByBforCancelFrt(
        T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteLbFileManagerPackingBforCancelFrt", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteTtPackingHeadByBforCancelFrt(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteTtPackingHeadByBforCancelFrt(
        T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteTtPackingHeadBforCancelFrt", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteTtInvoiceAttachedByBforCancelFrt(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteTtInvoiceAttachedByBforCancelFrt(
        T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteTtInvoiceAttachedBforCancelFrt", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteLbFileManagerInvoiceByBforCancelFrt(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteLbFileManagerInvoiceByBforCancelFrt(
        T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteLbFileManagerInvoiceBforCancelFrt", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteTtInvoiceHeaderByBforCancelFrt(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteTtInvoiceHeaderByBforCancelFrt(
        T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteTtInvoiceHeaderBforCancelFrt", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteTtInvoiceByBforCancelFrt(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteTtInvoiceByBforCancelFrt(
        T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteTtInvoiceBforCancelFrt", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteLbFileManagerByshippinActBforCancel(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteLbFileManagerByshippinActBforCancel(
        T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteLbFileManagershippinActBforCancel", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteTtShippingDocumentByBforCancel(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteTtShippingDocumentByBforCancel(
        T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteTtShippingDocumentBforCancel", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteTtPackAtchItemNoByBforCancel(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteTtPackAtchItemNoByBforCancel(
        T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteTtPackAtchItemNoBforCancel", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteTtPackingAttachedCmlByBforCancel(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteTtPackingAttachedCmlByBforCancel(
        T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteTtPackingAttachedCmlBforCancel", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteLbFileManagerPackingByBforCancel(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteLbFileManagerPackingByBforCancel(
        T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteLbFileManagerPackingBforCancel", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteTtPackingHeadByBforCancel(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteTtPackingHeadByBforCancel(
        T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteTtPackingHeadBforCancel", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteTtInvoiceAttachedByBforCancel(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteTtInvoiceAttachedByBforCancel(
        T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteTtInvoiceAttachedBforCancel", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteLbFileManagerInvoiceByBforCancel(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteLbFileManagerInvoiceByBforCancel(
        T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteLbFileManagerInvoiceBforCancel", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteTtInvoiceHeaderByBforCancel(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteTtInvoiceHeaderByBforCancel(
        T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteTtInvoiceHeaderBforCancel", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteTtInvoiceByBforCancel(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteTtInvoiceByBforCancel(
        T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteTtInvoiceBforCancel", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteLbFileManagerByshippinActCancelReinv(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteLbFileManagerByshippinActCancelReinv(
        T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteLbFileManagershippinActCancelReinv", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteTtShippingDocumentByCancelReinv(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteTtShippingDocumentByCancelReinv(
        T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteTtShippingDocumentCancelReinv", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteTtPackAtchItemNoByCancelReinv(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteTtPackAtchItemNoByCancelReinv(
        T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteTtPackAtchItemNoCancelReinv", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteTtPackingAttachedCmlByCancelReinv(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteTtPackingAttachedCmlByCancelReinv(
        T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteTtPackingAttachedCmlCancelReinv", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteLbFileManagerPackingByCancelReinv(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteLbFileManagerPackingByCancelReinv(
        T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteLbFileManagerPackingCancelReinv", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteTtPackingHeadByCancelReinv(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteTtPackingHeadByCancelReinv(
        T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteTtPackingHeadCancelReinv", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteTtInvoiceAttachedByCancelReinv(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteTtInvoiceAttachedByCancelReinv(
        T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteTtInvoiceAttachedCancelReinv", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteLbFileManagerInvoiceByCancelReinv(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteLbFileManagerInvoiceByCancelReinv(
        T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteLbFileManagerInvoiceCancelReinv", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteTtInvoiceHeaderByCancelReinv(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteTtInvoiceHeaderByCancelReinv(
        T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteTtInvoiceHeaderCancelReinv", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteTtInvoiceByCancelReinv(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteTtInvoiceByCancelReinv(
        T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteTtInvoiceCancelReinv", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteLbFileManagerByshippinActCancelFrt(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteLbFileManagerByshippinActCancelFrt(
        T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteLbFileManagershippinActCancelFrt", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteTtShippingDocumentByCancelFrt(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteTtShippingDocumentByCancelFrt(
        T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteTtShippingDocumentCancelFrt", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteTtPackAtchItemNoByCancelFrt(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteTtPackAtchItemNoByCancelFrt(
        T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteTtPackAtchItemNoCancelFrt", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteTtPackingAttachedCmlByCancelFrt(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteTtPackingAttachedCmlByCancelFrt(
        T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteTtPackingAttachedCmlCancelFrt", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteLbFileManagerPackingByCancelFrt(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteLbFileManagerPackingByCancelFrt(
        T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteLbFileManagerPackingCancelFrt", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteTtPackingHeadByCancelFrt(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteTtPackingHeadByCancelFrt(
        T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteTtPackingHeadCancelFrt", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteTtInvoiceAttachedByCancelFrt(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteTtInvoiceAttachedByCancelFrt(
        T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteTtInvoiceAttachedCancelFrt", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteLbFileManagerInvoiceByCancelFrt(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteLbFileManagerInvoiceByCancelFrt(
        T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteLbFileManagerInvoiceCancelFrt", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteTtInvoiceHeaderByCancelFrt(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteTtInvoiceHeaderByCancelFrt(
        T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteTtInvoiceHeaderCancelFrt", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteTtInvoiceByCancelFrt(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteTtInvoiceByCancelFrt(
        T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteTtInvoiceCancelFrt", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteLbFileManagerByshippinActCancel(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteLbFileManagerByshippinActCancel(
        T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteLbFileManagershippinActCancel", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteTtShippingDocumentByCancel(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteTtShippingDocumentByCancel(
        T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteTtShippingDocumentCancel", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteTtPackAtchItemNoByCancel(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteTtPackAtchItemNoByCancel(
        T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteTtPackAtchItemNoCancel", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteTtPackingAttachedCmlByCancel(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteTtPackingAttachedCmlByCancel(
        T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteTtPackingAttachedCmlCancel", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteLbFileManagerPackingByCancel(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteLbFileManagerPackingByCancel(
        T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteLbFileManagerPackingCancel", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteTtPackingHeadByCancel(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteTtPackingHeadByCancel(
        T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteTtPackingHeadCancel", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteTtInvoiceAttachedByCancel(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteTtInvoiceAttachedByCancel(
        T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteTtInvoiceAttachedCancel", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteLbFileManagerInvoiceByCancel(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteLbFileManagerInvoiceByCancel(
        T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteLbFileManagerInvoiceCancel", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteTtInvoiceHeaderByCancel(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteTtInvoiceHeaderByCancel(
        T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteTtInvoiceHeaderCancel", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteTtInvoiceByCancel(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteTtInvoiceByCancel(T0100BatchDeleteCriteriaDomain criteria)
        throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteTtInvoiceCancel", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteLbFileManagerByshippinActManualReinv(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteLbFileManagerByshippinActManualReinv(
        T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteLbFileManagershippinActManualReinv", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteTtShippingDocumentByManualReinv(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteTtShippingDocumentByManualReinv(
        T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteTtShippingDocumentManualReinv", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteTtPackAtchItemNoByManualReinv(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteTtPackAtchItemNoByManualReinv(
        T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteTtPackAtchItemNoManualReinv", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteTtPackingAttachedCmlByManualReinv(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteTtPackingAttachedCmlByManualReinv(
        T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteTtPackingAttachedCmlManualReinv", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteLbFileManagerPackingByManualReinv(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteLbFileManagerPackingByManualReinv(
        T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteLbFileManagerPackingManualReinv", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteTtPackingHeadByManualReinv(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteTtPackingHeadByManualReinv(
        T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteTtPackingHeadManualReinv", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteTtInvoiceAttachedByManualReinv(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteTtInvoiceAttachedByManualReinv(
        T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteTtInvoiceAttachedManualReinv", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteLbFileManagerInvoiceByManualReinv(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteLbFileManagerInvoiceByManualReinv(
        T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteLbFileManagerInvoiceManualReinv", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteTtInvoiceHeaderByManualReinv(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteTtInvoiceHeaderByManualReinv(
        T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteTtInvoiceHeaderManualReinv", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteTtInvoiceByManualReinv(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteTtInvoiceByManualReinv(
        T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteTtInvoiceManualReinv", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteLbFileManagerByshippinActManualFrt(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteLbFileManagerByshippinActManualFrt(
        T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteLbFileManagershippinActManualFrt", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteTtShippingDocumentByManualFrt(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteTtShippingDocumentByManualFrt(
        T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteTtShippingDocumentManualFrt", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteTtPackAtchItemNoByManualFrt(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteTtPackAtchItemNoByManualFrt(
        T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteTtPackAtchItemNoManualFrt", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteTtPackingAttachedCmlByManualFrt(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteTtPackingAttachedCmlByManualFrt(
        T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteTtPackingAttachedCmlManualFrt", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteLbFileManagerPackingByManualFrt(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteLbFileManagerPackingByManualFrt(
        T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteLbFileManagerPackingManualFrt", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteTtPackingHeadByManualFrt(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteTtPackingHeadByManualFrt(
        T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteTtPackingHeadManualFrt", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteTtInvoiceAttachedByManualFrt(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteTtInvoiceAttachedByManualFrt(
        T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteTtInvoiceAttachedManualFrt", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteLbFileManagerInvoiceByManualFrt(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteLbFileManagerInvoiceByManualFrt(
        T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteLbFileManagerInvoiceManualFrt", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteTtInvoiceHeaderByManualFrt(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteTtInvoiceHeaderByManualFrt(
        T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteTtInvoiceHeaderManualFrt", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteTtInvoiceByManualFrt(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteTtInvoiceByManualFrt(
        T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteTtInvoiceManualFrt", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteLbFileManagerByshippinActManual(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteLbFileManagerByshippinActManual(
        T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteLbFileManagershippinActManual", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteTtShippingDocumentByManual(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteTtShippingDocumentByManual(
        T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteTtShippingDocumentManual", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteTtPackAtchItemNoByManual(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteTtPackAtchItemNoByManual(
        T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteTtPackAtchItemNoManual", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteTtPackingAttachedCmlByManual(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteTtPackingAttachedCmlByManual(
        T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteTtPackingAttachedCmlManual", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteLbFileManagerPackingByManual(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteLbFileManagerPackingByManual(
        T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteLbFileManagerPackingManual", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteTtPackingHeadByManual(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteTtPackingHeadByManual(
        T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteTtPackingHeadManual", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteTtInvoiceAttachedByManual(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteTtInvoiceAttachedByManual(
        T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteTtInvoiceAttachedManual", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteLbFileManagerInvoiceByManual(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteLbFileManagerInvoiceByManual(
        T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteLbFileManagerInvoiceManual", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteTtInvoiceHeaderByManual(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteTtInvoiceHeaderByManual(
        T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteTtInvoiceHeaderManual", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteTtInvoiceByManual(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteTtInvoiceByManual(T0100BatchDeleteCriteriaDomain criteria)
        throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteTtInvoiceManual", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteTtCmlErrorDtl(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteTtCmlErrorDtl(T0100BatchDeleteCriteriaDomain criteria)
        throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteTtCmlErrorDtl", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteTtCmlErrorHeader(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteTtCmlErrorHeader(T0100BatchDeleteCriteriaDomain criteria)
        throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteTtCmlErrorHeader", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteTtBhtWorkPltz(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteTtBhtWorkPltz(T0100BatchDeleteCriteriaDomain criteria)
        throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteTtBhtWorkPltz", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteTtBhtWorkMixTag(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteTtBhtWorkMixTag(T0100BatchDeleteCriteriaDomain criteria)
        throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteTtBhtWorkMixTag", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteTtBhtWorkErr(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteTtBhtWorkErr(T0100BatchDeleteCriteriaDomain criteria)
        throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteTtBhtWorkErr", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteTtBhtWorkTime(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteTtBhtWorkTime(T0100BatchDeleteCriteriaDomain criteria)
        throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteTtBhtWorkTime", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteTmPkgSpecRev(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteTmPkgSpecRev(T0100BatchDeleteCriteriaDomain criteria)
        throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteTmPkgSpecRev", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteTwShippingActInvoice(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteTwShippingActInvoice(
        T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteTwShippingActInvoice", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteTwInvPltz(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteTwInvPltz(T0100BatchDeleteCriteriaDomain criteria)
        throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteTwInvPltz", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteTwInv(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteTwInv(T0100BatchDeleteCriteriaDomain criteria)
        throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteTwInv", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteTwInvoice(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteTwInvoice(T0100BatchDeleteCriteriaDomain criteria)
        throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteTwInvoice", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteTwInvItem(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteTwInvItem(T0100BatchDeleteCriteriaDomain criteria)
        throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteTwInvItem", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteTwStgAct(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteTwStgAct(T0100BatchDeleteCriteriaDomain criteria)
        throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteTwStgAct", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteTwStgInstr(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteTwStgInstr(T0100BatchDeleteCriteriaDomain criteria)
        throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteTwStgInstr", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteTwXpltz(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteTwXpltz(T0100BatchDeleteCriteriaDomain criteria)
        throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteTwXpltz", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteTwPltzInstrItemNo(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteTwPltzInstrItemNo(T0100BatchDeleteCriteriaDomain criteria)
        throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteTwPltzInstrItemNo", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteTwPltzItemItemNo(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteTwPltzItemItemNo(T0100BatchDeleteCriteriaDomain criteria)
        throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteTwPltzItemItemNo", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteTwPltzItemPkg(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteTwPltzItemPkg(T0100BatchDeleteCriteriaDomain criteria)
        throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteTwPltzItemPkg", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteTwMixtagRt(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteTwMixtagRt(T0100BatchDeleteCriteriaDomain criteria)
        throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteTwMixtagRt", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteTwMixtag(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteTwMixtag(T0100BatchDeleteCriteriaDomain criteria)
        throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteTwMixtag", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.ComnAuxDao#deleteTtBatchReqParam(com.globaldenso.eca0027.core.business.domain.criteria.T0100BatchDeleteCriteriaDomain)
     */
    public int deleteTtBatchReqParam(T0100BatchDeleteCriteriaDomain criteria)
        throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteTtBatchReqParam", criteria);
    }

    // NL015 ADD START
    /**
     * {@inheritDoc}
     */
    public int deleteTtScAttachedByMain(T0100BatchDeleteCriteriaDomain criteria)
        throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteTtScAttachedByMain", criteria);
    }

    /**
     * {@inheritDoc}
     */
    public int deleteLbFileManagerScByMain(
        T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteLbFileManagerScByMain", criteria);
    }

    /**
     * {@inheritDoc}
     */
    public int deleteTtScHeaderByMain(T0100BatchDeleteCriteriaDomain criteria)
        throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteTtScHeaderByMain", criteria);
    }

    /**
     * {@inheritDoc}
     */
    public int deleteTtScAttachedByBeforeCancel(
        T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteTtScAttachedByBeforeCancel", criteria);
    }

    /**
     * {@inheritDoc}
     */
    public int deleteLbFileManagerScByBeforeCancel(
        T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteLbFileManagerScByBeforeCancel", criteria);
    }

    /**
     * {@inheritDoc}
     */
    public int deleteTtScHeaderByBeforeCancel(
        T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteTtScHeaderByBeforeCancel", criteria);
    }

    /**
     * {@inheritDoc}
     */
    public int deleteLbFileManagerByOdrUpload(
        T0100BatchDeleteCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteLbFileManagerByOdrUpload", criteria);
    }

    /**
     * {@inheritDoc}
     */
    public int deleteTtOdrUploadReqMgt(T0100BatchDeleteCriteriaDomain criteria)
        throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteTtOdrUploadReqMgt", criteria);
    }

    /**
     * {@inheritDoc}
     */
    public int deleteTtOnlineReqJobParam(T0100BatchDeleteCriteriaDomain criteria)
        throws ApplicationException {
        return getSqlMapClientTemplate().delete("ComnAux.DeleteTtOnlineReqJobParam", criteria);
    }
    // NL015 ADD END
}
