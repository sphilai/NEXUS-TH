package com.globaldenso.eca0027.core.business.domain;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * <p>
 * The domain class that represents the return value of the Ws0501.<BR>
 * Ws0501の戻り値を表すドメインクラスです。
 * </p>
 *
 * @version 1.00
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "result")
public class Ws0501ResultDomain extends ResultDomain implements Serializable {

    /**
     * <p>
     * Serial version ID<BR>
     * シリアルバージョンID
     * </p>
     */
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * Module information<BR>
     * モジュール情報
     * </p>
     */
    private Ws0501ModuleInfoDomain moduleInfo;

    /**
     * <p>
     * BHT lock Message list<BR>
     * BHTロックメッセージリスト
     * </p>
     */
    @XmlElementWrapper
    @XmlElement(name = "bhtLockListItem")
    private List<Ws0501BhtLockListItemDomain> bhtLockList;

    /**
     * <p>
     * Default constructor<BR>
     * デフォルトコンストラクタです。
     * </p>
     *
     */
    public Ws0501ResultDomain() {
        super();
    }

    /**
     * <p>
     * The constructor for creating an instance by specifying the code results (Normal use).<BR>
     * 結果コードを指定してインスタンスを生成するためのコンストラクタです（正常用）。
     * </p>
     *
     * @param resultCode
     *            (結果コード)
     */
    public Ws0501ResultDomain(String resultCode) {
        super(resultCode);
    }

    /**
     * <p>
     * The constructor for creating an instance by specifying the error code list and results (Errors).<BR>
     * 結果コードとエラーリストを指定してインスタンスを生成するためのコンストラクタです（エラー用）。
     * </p>
     *
     * @param resultCode
     *            (結果コード)
     * @param errorList
     *            (エラーリスト)
     */
    public Ws0501ResultDomain(String resultCode,
            List<ErrorListItemDomain> errorList) {
        super(resultCode, errorList);
    }

    /**
     * <p>
     * getter method of Module information<BR>
     * Module information のゲッターメソッドです。
     * </p>
     *
     * @return Module information
     */
    public Ws0501ModuleInfoDomain getModuleInfo() {
        return moduleInfo;
    }

    /**
     * <p>
     * setter method of Module information<BR>
     * Module information のセッターメソッドです。
     * </p>
     *
     * @param moduleInfo Module information に設定する
     */
    public void setModuleInfo(Ws0501ModuleInfoDomain moduleInfo) {
        this.moduleInfo = moduleInfo;
    }

    /**
     * <p>
     * getter method of BHT lock Message list<BR>
     * BHT lock Message list のゲッターメソッドです。
     * </p>
     *
     * @return BHT lock Message list
     */
    public List<Ws0501BhtLockListItemDomain> getBhtLockList() {
        return bhtLockList;
    }

    /**
     * <p>
     * setter method of BHT lock Message list<BR>
     * BHT lock Message list のセッターメソッドです。
     * </p>
     *
     * @param bhtLockList BHT lock Message list に設定する
     */
    public void setBhtLockList(List<Ws0501BhtLockListItemDomain> bhtLockList) {
        this.bhtLockList = bhtLockList;
    }

}
