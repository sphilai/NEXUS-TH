/*
 * PROJECT：GSCM 共通機能群
 * PROJECT：GSCM Common Functions
 * 
 * Validatorクラス
 * Validator Class
 * 
 * Version.
 * 1.0.0
 * 
 * Copyright (c) 2013 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.gscm.framework.util;

import java.beans.PropertyDescriptor;
import java.math.BigDecimal;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.lang.BooleanUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.validator.GenericTypeValidator;
import org.apache.commons.validator.GenericValidator;

import com.globaldenso.ai.common.core.exception.SystemException;
import com.globaldenso.gscm.framework.business.domain.AbstractDomain;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;

/**
 * 入力チェック用クラス
 * Class of validating input
 * <p>
 * 
 * <pre>
 * ドメインが保持する各種情報のチェックを行い、エラーがあった場合は
 * 画面表示に必要な情報(エラーメッセージ、エラーメッセージパラメタ、強調表示箇所情報)を
 * 自身が保持するListに格納していく。
 * Validate ever kind information domain maintains,if error occurs,
 * add necessary information(error message,argument of message and information of emphasis display part) for window display
 * to own list
 * </pre>
 * 
 * </p>
 * 
 * @author $Author: 400616000304 $
 * @version $Revision: 11709 $
 * @param <T>チェック対象ドメインの型
 * @param <T>Type of validation target domain
 */
public final class Validator<T extends AbstractDomain> {
    /** ラベルのプロパティキー接頭語 */
    /** Prefix of label property key */
    private static final String LABEL_PREFIX = "label.";

    /** メッセージ名(PREFIX)のプロパティキー */
    /** Property key of message name(PREFIX) */
    private static final String MSG_PREFIX = "valid.msgPrefix";

    /** 標準の画面項目名を取得するキー （画面IDなし） * */
    /** Key for getting standard screen item id （without screen id） * */
    private static final String DEFAULT_ITEM_NONDISPID_LABEL = LABEL_PREFIX + "%s";

    /** 標準の画面項目名を取得するキー （画面IDあり） * */
    /** Key for getting standard screen item id （with screen id） * */
    private static final String DEFAULT_ITEM_DISPID_LABEL = "%s." + DEFAULT_ITEM_NONDISPID_LABEL;

    /** リソースキー参照用の接尾辞 */
    /** Suffix of resource key for reference */
    private static final String VALIDATE_RESOURCE_KEY_REF_SUFFIX = ".ref";

    /** Validateのリソースキー */
    /** Resource key of validation */
    private static final String VALIDATE_RESOURCE_KEY_REF_PATTERN = "%s"
        + VALIDATE_RESOURCE_KEY_REF_SUFFIX;

    /** DISP IDなしのリソースキーのプレフィックス */
    /** Prefix of resource key without DISP ID */
    private static final String RESOUCEKEY_NONDISPID_PREFIX = "valid.%s";

    /** DISP IDありのリソースキーのプレフィックス */
    /** Prefix of resource key with DISP ID */
    private static final String RESOUCEKEY_DISPID_PREFIX = RESOUCEKEY_NONDISPID_PREFIX + ".%s";

    /** メッセージのリソースキー */
    /** Resource key of message */
    private static final String MESSAGE_RESOURCE_KEY_FORMAT = "%s.msg";

    /** メッセージ引数のリソースキー */
    /** Resource key of message argument */
    private static final String MESSAGE_ARG_RESOURCE_KEY_FORMAT = MESSAGE_RESOURCE_KEY_FORMAT
        + ".%d";

    /** メッセージ引数の最大値 */
    /** Maximum value of message argument */
    private static final int MAX_MESSAGE_ARG = 10;

    /** チェック対象ドメイン */
    /** Domain of validation target */
    private T domain = null;

    /** エラーメッセージ格納用 */
    /** List for error message */
    private List<MessageDomain> errList = new ArrayList<MessageDomain>();

    /** 設定やメッセージを取得するため */
    /** Resource for getting set or message */
    private Resource rsc = null;

    /** 項目名(PREFIX)[一括登録・更新用] */
    /** Item name(PREFIX) [For create and update in a lump sum] */
    private String propertyNamePrefix = null;

    /** メッセージ名(PREFIX)[一括登録・更新用] */
    /** Message name(PREFIX) [For create and update in a lump sum] */
    private String msgPrefix = null;

    /** 画面ID */
    /** Screen id */
    private String screenId = null;

    /**
     * デフォルトコンストラクタ。
     * Default constructor
     */
    public Validator() {
    }

    /**
     * コンストラクタ。(単票用)
     * Constructor(For cut sheet)
     * 
     * @param domain チェック対象ドメイン
     * @param domain Domain of validation target
     */
    public Validator(T domain) {
        this(domain, null);
    }

    /**
     * コンストラクタ。(単票用)
     * Constructor(For cut sheet)
     * 
     * @param domain チェック対象ドメイン
     * @param domain Domain of validation target
     * @param domainName ドメイン名
     * @param domainName Domain name
     */
    public Validator(T domain, String domainName) {
        this.domain = domain;
        createResource(domain);
        if (StringUtils.isBlank(domainName)) {
            this.propertyNamePrefix = "";
        } else {
            this.propertyNamePrefix = StringUtils.defaultString(domainName) + ".";
        }
        this.msgPrefix = "";
    }

    /**
     * コンストラクタ。(一括用)
     * Constructor(For in a lump sum)
     * 
     * @param domain チェック対象ドメイン
     * @param domain Domain of validation target
     * @param listNm リスト名
     * @param listNm List name
     * @param i インデックス
     * @param i Index
     */
    public Validator(T domain, String listNm, int i) {
        this.domain = domain;
        createResource(domain);
        this.propertyNamePrefix = String.format("%s[%d].", listNm, i);
        this.msgPrefix = MessageFormat.format(StringUtils
            .defaultString(rsc.getResource(MSG_PREFIX)), i + 1);
    }

    /**
     * エラーリストを取得するメソッドです。
     * Method of getting error list
     * <p>
     * </p>
     * 
     * @return エラーリスト
     * @return Error list
     */
    public List<MessageDomain> getErrList() {
        return errList;
    }

    /**
     * 必須入力チェック用のメソッドです。
     * Method for required input validation
     * 
     * @param property ドメインのフィールド名 かつ ActionFormのフィールド名
     * @param property Domain field name and ActionForm field name
     * @return チェック対象値が「null」 または 「空文字列」の場合はfalseを返します。それ以外の場合はtrueを返します。
     * @return If validation target value is null or string empty,return false.If validation target value is other,return true
     */
    public boolean isFill(String property) {
        // TM_RESOURCE取得
        // Get TM_RESOURCE
        String validateName = "required";
        String resourceKey = getValidateResourceKey(property, validateName);
        String resourceValue = getValidateValue(resourceKey);

        // チェック対象か？対象外の場合はチェックOKで
        // Return true if result of validation is false
        if (!BooleanUtils.toBoolean(resourceValue)) {
            return true;
        }

        // Domainの値取得
        // Get value of Domain
        String propertyValue = getDomainPropertyValue(property);

        // 必須チェック
        // Validate required item
        boolean valid = !CheckUtil.isBlankOrNull(propertyValue);
        if (!valid) {
            String param = getPropertyItemName(property);
            addMessage(property, validateName, "GSCM-E0-0011", param);
        }

        return valid;
    }

    /**
     * 必須入力チェック用のメソッドです。
     * Method for validation required item
     * 
     * @param property ドメインのフィールド名 かつ ActionFormのフィールド名
     * @param property Field name of Domain and ActionForm
     * @param screenId 画面ID
     * @param screenId Screen id
     * @return チェック対象値が「null」 または 「空文字列」の場合はfalseを返します。それ以外の場合はtrueを返します。
     * @return If validation target value is null or string empty,return false.If validation target value is other,return true
     */
    public boolean isFill(String property, String screenId) {
        this.screenId = screenId;
        return isFill(property);
    }

    /**
     * 最小桁数チェック用のメソッドです。
     * Method for validating minimum number of digit
     * 
     * @param property ドメインのフィールド名 かつ ActionFormのフィールド名
     * @param property Field name of Domain and ActionForm
     * @return チェック対象項目 の文字数が minlength より小さい場合は false を返します。 それ以外の場合はtrueを返します。
     * @return If number of characters for validation target value is less than minlength,return false.If number of characters for validation target value is other,return true
     */
    public boolean isPermittedCharMinLen(String property) {
        // TM_RESOURCE取得
        // Get TM_RESOURCE
        String validateName = "minlength";
        String resourceKey = getValidateResourceKey(property, validateName);
        String resourceValue = getValidateValue(resourceKey);
        // Domainの値取得
        // Get value of Domain
        String propertyValue = getDomainPropertyValue(property);

        // TM_RESOURCEの値がない場合はチェックしない
        // If value of TM_RESOURCE is blank,return true
        if (StringUtils.isBlank(resourceValue)) {
            return true;
        }

        // プロパティの値がない場合はチェックしない
        // If value of property is blank,return true
        if (CheckUtil.isBlankOrNull(propertyValue)) {
            return true;
        }

        int minLength = Integer.parseInt(resourceValue);

        // 桁数チェック
        // Validate number of digit
        boolean valid = GenericValidator.minLength(propertyValue, minLength);
        if (!valid) {
            String param = getPropertyItemName(property);
            addMessage(property, validateName, "GSCM-E0-0022", param, minLength);
        }

        return valid;
    }

    /**
     * 最小桁数チェック用のメソッドです。
     * Method for validating minimum number of digit
     * 
     * @param property ドメインのフィールド名 かつ ActionFormのフィールド名
     * @param property Field name of Domain and ActionForm
     * @param screenId 画面ID
     * @param screenId Screen id
     * @return チェック対象項目 の文字数が minlength より小さい場合は false を返します。 それ以外の場合はtrueを返します。
     * @return If number of characters for validation target value is less than minlength,return false.If number of characters for validation target value is other,return true
     */
    public boolean isPermittedCharMinLen(String property, String screenId) {
        this.screenId = screenId;
        return isPermittedCharMinLen(property);
    }

    /**
     * 最大桁数チェック用のメソッドです。
     * Method for validating maximum number of digit
     * 
     * @param property ドメインのフィールド名 かつ ActionFormのフィールド名
     * @param property Field name of Domain and ActionForm
     * @return チェック対象項目 の文字数が maxlength より大きい場合は false を返します。 それ以外の場合はtrueを返します。
     * @return If number of characters for validation target value is more than maxlength,return false.If number of characters for validation target value is other,return true
     */
    public boolean isPermittedCharMaxLen(String property) {
        // TM_RESOURCE取得
        // Get TM_RESOURCE
        String validateName = "maxlength";
        String resourceKey = getValidateResourceKey(property, validateName);
        String resourceValue = getValidateValue(resourceKey);
        // Domainの値取得
        // Get Domain
        String propertyValue = getDomainPropertyValue(property);

        // TM_RESOURCEの値がない場合はチェックしない
        // If value of TM_RESOURCE is blank,return true
        if (StringUtils.isBlank(resourceValue)) {
            return true;
        }

        // プロパティの値がない場合はチェックしない
        // If value of property is blank,return true
        if (CheckUtil.isBlankOrNull(propertyValue)) {
            return true;
        }

        int maxLength = Integer.parseInt(resourceValue);

        // 桁数チェック
        // Validate number of digit
        boolean valid = GenericValidator.maxLength(propertyValue, maxLength);
        if (!valid) {
            String param = getPropertyItemName(property);
            addMessage(property, validateName, "GSCM-E0-0013", param, maxLength);
        }
        return valid;
    }

    /**
     * 最大桁数チェック用のメソッドです。
     * Method for validating maximum number of digit
     * 
     * @param property ドメインのフィールド名 かつ ActionFormのフィールド名
     * @param property Field name of Domain and ActionForm
     * @param screenId 画面ID
     * @param screenId Screen id
     * @return チェック対象項目 の文字数が maxlength より大きい場合は false を返します。 それ以外の場合はtrueを返します。
     * @return If number of characters for validation target value is more than maxlength,return false.If number of characters for validation target value is other,return true
     */
    public boolean isPermittedCharMaxLen(String property, String screenId) {
        this.screenId = screenId;
        return isPermittedCharMaxLen(property);
    }

    /**
     * 属性チェック用のメソッドです。
     * Method for validating attribute
     * 
     * @param property ドメインのフィールド名 かつ ActionFormのフィールド名
     * @param property Field name of Domain and ActionForm
     * @return チェック対象項目内に許可する属性以外の文字列が入っていた場合は false を返します。それ以外の場合は true を返します。
     * @return If validation target contains some character string which is not permitted,return false.If validation target does not,return true
     */
    public boolean isPermittedAttr(String property) {
        // TM_RESOURCE取得
        // Get TM_RESOURCE
        String validateName = "attr";
        String resourceKey = getValidateResourceKey(property, validateName);
        String resourceValue = getValidateValue(resourceKey);
        // Domainの値取得
        // Get Domain
        String propertyValue = getDomainPropertyValue(property);

        // TM_RESOURCEの値がない場合はチェックしない
        // If value of TM_RESOURCE is blank,return true
        if (StringUtils.isBlank(resourceValue)) {
            return true;
        }

        // プロパティの値がない場合はチェックしない
        // If value of property is blank,return true
        if (CheckUtil.isBlankOrNull(propertyValue)) {
            return true;
        }

        String param = getPropertyItemName(property);

        // 全角
        // Fullwidth character
        if (StringUtils.equals("fullWidth", resourceValue)) {
            if (!CheckUtil.isZenkaku(propertyValue)) {
                addMessage(property, validateName, "GSCM-E0-0014", param);
                return false;
            }
        }

        // 半角英数字
        // Halfwidth alphanumeric character
        if (StringUtils.equals("alphaNumeric", resourceValue)) {
            if (!CheckUtil.isAlphaNumeric(propertyValue)) {
                addMessage(property, validateName, "GSCM-E0-0015", param);
                return false;
            }
        }

        // 半角英字
        // Halfwidth alphabet character
        if (StringUtils.equals("alpha", resourceValue)) {
            if (!CheckUtil.isAlpha(propertyValue)) {
                addMessage(property, validateName, "GSCM-E0-0016", param);
                return false;
            }
        }

        // 半角数字
        // Halfwidth numeric character
        if (StringUtils.equals("numeric", resourceValue)) {
            if (!CheckUtil.isNumeric(propertyValue)) {
                addMessage(property, validateName, "GSCM-E0-0017", param);
                return false;
            }
        }

        return true;
    }

    /**
     * 属性チェック用のメソッドです。
     * Method for validating attribute
     * 
     * @param property ドメインのフィールド名 かつ ActionFormのフィールド名
     * @param property Field name of Domain and ActionForm
     * @param screenId 画面ID
     * @param screenId Screen id
     * @return チェック対象項目内に許可する属性以外の文字列が入っていた場合は false を返します。それ以外の場合は true を返します。
     * @return If validation target contains some character string which is not permitted,return false.If validation target does not,return true
     */
    public boolean isPermittedAttr(String property, String screenId) {
        this.screenId = screenId;
        return isPermittedAttr(property);
    }

    /**
     * Byteチェック用のメソッドです。
     * Method for validating Byte
     * 
     * @param property ドメインのフィールド名 かつ ActionFormのフィールド名
     * @param property Field name of Domain and ActionForm
     * @return チェック対象項目内にバイト範囲外の文字列が入っていた場合は false を返します。それ以外の場合は true を返します。
     * @return If validation target contains some character string which is over fixed bytes range,return false.If validation target does not,return true
     */
    public boolean isPermittedByte(String property) {
        // TM_RESOURCE取得
        // Get TM_RESOURCE
        String validateName = "byte";
        String resourceKey = getValidateResourceKey(property, validateName);
        String resourceValue = getValidateValue(resourceKey);
        // Domainの値取得
        // Get Domain
        String propertyValue = getDomainPropertyValue(property);

        // チェック対象か？対象外の場合はチェックOKで
        // If value of TM_RESOURCE is not target,return true 
        if (!BooleanUtils.toBoolean(resourceValue)) {
            return true;
        }

        // プロパティの値がない場合はチェックしない
        // If value of property is blank,return true
        if (CheckUtil.isBlankOrNull(propertyValue)) {
            return true;
        }

        // Byteチェック(変換できない場合、nullが返却される)
        // Validate Byte(If target is not converted to byte,return null)
        Byte value = GenericTypeValidator.formatByte(propertyValue);
        boolean valid = true;
        if (value == null) {
            valid = false;
            String param = getPropertyItemName(property);
            addMessage(property, validateName, "GSCM-E0-0023", param);
        }

        return valid;
    }

    /**
     * Byteチェック用のメソッドです。
     * Method for validating Byte
     * 
     * @param property ドメインのフィールド名 かつ ActionFormのフィールド名
     * @param property Field name of Domain and ActionForm
     * @param screenId 画面ID
     * @param screenId Screen id
     * @return チェック対象項目内にバイト範囲外の文字列が入っていた場合は false を返します。それ以外の場合は true を返します。
     * @return If validation target contains some character string which is over fixed bytes range,return false.If validation target does not,return true
     */
    public boolean isPermittedByte(String property, String screenId) {
        this.screenId = screenId;
        return isPermittedByte(property);
    }

    /**
     * Shortチェック用のメソッドです。
     * Method for validating Short
     * 
     * @param property ドメインのフィールド名 かつ ActionFormのフィールド名
     * @param property Field name of Domain and ActionForm
     * @return チェック対象項目内にShort範囲外の文字列が入っていた場合は false を返します。それ以外の場合は true を返します。
     * @return If validation target contains some character string which is over fixed short range,return false.If validation target does not,return true
     */
    public boolean isPermittedShort(String property) {
        // TM_RESOURCE取得
        // Get TM_RESOURCE
        String validateName = "short";
        String resourceKey = getValidateResourceKey(property, validateName);
        String resourceValue = getValidateValue(resourceKey);
        // Domainの値取得
        // Get Domain
        String propertyValue = getDomainPropertyValue(property);

        // チェック対象か？対象外の場合はチェックOKで
        // If value of TM_RESOURCE is not target,return true 
        if (!BooleanUtils.toBoolean(resourceValue)) {
            return true;
        }

        // プロパティの値がない場合はチェックしない
        // If value of property is blank,return true
        if (CheckUtil.isBlankOrNull(propertyValue)) {
            return true;
        }

        // Shortチェック(変換できない場合、nullが返却される)
        // Validate Short(If target is not converted to short,return null)
        Short value = GenericTypeValidator.formatShort(propertyValue);
        boolean valid = true;
        if (value == null) {
            valid = false;
            String param = getPropertyItemName(property);
            addMessage(property, validateName, "GSCM-E0-0024", param);
        }

        return valid;
    }

    /**
     * Shortチェック用のメソッドです。
     * Method for validating Short
     * 
     * @param property ドメインのフィールド名 かつ ActionFormのフィールド名
     * @param property Field name of Domain and ActionForm
     * @param screenId 画面ID
     * @param screenId Screen id
     * @return チェック対象項目内にShort範囲外の文字列が入っていた場合は false を返します。それ以外の場合は true を返します。
     * @return If validation target contains some character string which is over fixed short range,return false.If validation target does not,return true
     */
    public boolean isPermittedShort(String property, String screenId) {
        this.screenId = screenId;
        return isPermittedShort(property);
    }

    /**
     * Integerチェック用のメソッドです。
     * Method for validating Integer
     * 
     * @param property ドメインのフィールド名 かつ ActionFormのフィールド名
     * @param property Field name of Domain and ActionForm
     * @return チェック対象項目内にInteger範囲外の文字列が入っていた場合は false を返します。それ以外の場合は true を返します。
     * @return If validation target contains some character string which is over fixed integer range,return false.If validation target does not,return true
     */
    public boolean isPermittedInteger(String property) {
        // TM_RESOURCE取得
        // Get TM_RESOURCE
        String validateName = "integer";
        String resourceKey = getValidateResourceKey(property, validateName);
        String resourceValue = getValidateValue(resourceKey);
        // Domainの値取得
        // Get Domain
        String propertyValue = getDomainPropertyValue(property);

        // チェック対象か？対象外の場合はチェックOKで
        // If value of TM_RESOURCE is not target,return true
        if (!BooleanUtils.toBoolean(resourceValue)) {
            return true;
        }

        // プロパティの値がない場合はチェックしない
        // If value of property is blank,return true
        if (CheckUtil.isBlankOrNull(propertyValue)) {
            return true;
        }

        // Integerチェック(変換できない場合、nullが返却される)
        // Validate Integer(If target is not converted to integer,return null)
        Integer value = GenericTypeValidator.formatInt(propertyValue);
        boolean valid = true;
        if (value == null) {
            valid = false;
            String param = getPropertyItemName(property);
            addMessage(property, validateName, "GSCM-E0-0024", param);
        }

        return valid;
    }

    /**
     * Integerチェック用のメソッドです。
     * Method for validating Integer
     * 
     * @param property ドメインのフィールド名 かつ ActionFormのフィールド名
     * @param property Field name of Domain and ActionForm
     * @param screenId 画面ID
     * @param screenId Screen id
     * @return チェック対象項目内にInteger範囲外の文字列が入っていた場合は false を返します。それ以外の場合は true を返します。
     * @return If validation target contains some character string which is over fixed integer range,return false.If validation target does not,return true
     */
    public boolean isPermittedInteger(String property, String screenId) {
        this.screenId = screenId;
        return isPermittedInteger(property);
    }

    /**
     * Longチェック用のメソッドです。
     * Method for validating Long
     * 
     * @param property ドメインのフィールド名 かつ ActionFormのフィールド名
     * @param property Field name of Domain and ActionForm
     * @return チェック対象項目内にLong範囲外の文字列が入っていた場合は false を返します。それ以外の場合は true を返します。
     * @return If validation target contains some character string which is over fixed long range,return false.If validation target does not,return true
     */
    public boolean isPermittedLong(String property) {
        // TM_RESOURCE取得
        // Get TM_RESOURCE
        String validateName = "long";
        String resourceKey = getValidateResourceKey(property, validateName);
        String resourceValue = getValidateValue(resourceKey);
        // Domainの値取得
        // Get Domain
        String propertyValue = getDomainPropertyValue(property);

        // チェック対象か？対象外の場合はチェックOKで
        // If value of TM_RESOURCE is not target,return true
        if (!BooleanUtils.toBoolean(resourceValue)) {
            return true;
        }

        // プロパティの値がない場合はチェックしない
        // If value of property is blank,return true
        if (CheckUtil.isBlankOrNull(propertyValue)) {
            return true;
        }

        // Longチェック(変換できない場合、nullが返却される)
        // Validate Long(If target is not converted to long,return null)
        Long value = GenericTypeValidator.formatLong(propertyValue);
        boolean valid = true;
        if (value == null) {
            valid = false;
            String param = getPropertyItemName(property);
            addMessage(property, validateName, "GSCM-E0-0024", param);
        }

        return valid;
    }

    /**
     * Longチェック用のメソッドです。
     * Method for validating Long
     * 
     * @param property ドメインのフィールド名 かつ ActionFormのフィールド名
     * @param property Field name of Domain and ActionForm
     * @param screenId 画面ID
     * @param screenId Screen id
     * @return チェック対象項目内にLong範囲外の文字列が入っていた場合は false を返します。それ以外の場合は true を返します。
     * @return If validation target contains some character string which is over fixed long range,return false.If validation target does not,return true
     */
    public boolean isPermittedLong(String property, String screenId) {
        this.screenId = screenId;
        return isPermittedLong(property);
    }

    /**
     * Floatチェック用のメソッドです。
     * Method for validating Float
     * 
     * @param property ドメインのフィールド名 かつ ActionFormのフィールド名
     * @param property Field name of Domain and ActionForm
     * @return チェック対象項目内にFloat範囲外の文字列が入っていた場合は false を返します。それ以外の場合は true を返します。
     * @return If validation target contains some character string which is over fixed float range,return false.If validation target does not,return true
     */
    public boolean isPermittedFloat(String property) {
        // TM_RESOURCE取得
        // Get TM_RESOURCE
        String validateName = "float";
        String resourceKey = getValidateResourceKey(property, validateName);
        String resourceValue = getValidateValue(resourceKey);
        // Domainの値取得
        // Get Domain
        String propertyValue = getDomainPropertyValue(property);

        // チェック対象か？対象外の場合はチェックOKで
        // If value of TM_RESOURCE is not target,return true
        if (!BooleanUtils.toBoolean(resourceValue)) {
            return true;
        }

        // プロパティの値がない場合はチェックしない
        // If value of property is blank,return true
        if (CheckUtil.isBlankOrNull(propertyValue)) {
            return true;
        }

        // Floatチェック(変換できない場合、nullが返却される)
        // Validate Float(If target is not converted to float,return null)
        Float value = GenericTypeValidator.formatFloat(propertyValue);
        boolean valid = true;
        if (value == null) {
            valid = false;
            String param = getPropertyItemName(property);
            addMessage(property, validateName, "GSCM-E0-0025", param);
        }

        return valid;
    }

    /**
     * Floatチェック用のメソッドです。
     * Method for validating Float
     * 
     * @param property ドメインのフィールド名 かつ ActionFormのフィールド名
     * @param property Field name of Domain and ActionForm
     * @param screenId 画面ID
     * @param screenId Screen id
     * @return チェック対象項目内にFloat範囲外の文字列が入っていた場合は false を返します。それ以外の場合は true を返します。
     * @return If validation target contains some character string which is over fixed float range,return false.If validation target does not,return true
     */
    public boolean isPermittedFloat(String property, String screenId) {
        this.screenId = screenId;
        return isPermittedFloat(property);
    }

    /**
     * Doubleチェック用のメソッドです。
     * Method for validating Double
     * 
     * @param property ドメインのフィールド名 かつ ActionFormのフィールド名
     * @param property Field name of Domain and ActionForm
     * @return チェック対象項目内にDouble範囲外の文字列が入っていた場合は false を返します。それ以外の場合は true を返します。
     * @return If validation target contains some character string which is over fixed double range,return false.If validation target does not,return true
     */
    public boolean isPermittedDouble(String property) {
        // TM_RESOURCE取得
        // Get TM_RESOURCE
        String validateName = "double";
        String resourceKey = getValidateResourceKey(property, validateName);
        String resourceValue = getValidateValue(resourceKey);
        // Domainの値取得
        // Get Domain
        String propertyValue = getDomainPropertyValue(property);

        // チェック対象か？対象外の場合はチェックOKで
        // If value of TM_RESOURCE is not target,return true
        if (!BooleanUtils.toBoolean(resourceValue)) {
            return true;
        }

        // プロパティの値がない場合はチェックしない
        // If value of property is blank,return true
        if (CheckUtil.isBlankOrNull(propertyValue)) {
            return true;
        }

        // Doubleチェック(変換できない場合、nullが返却される)
        // Validate Double(If target is not converted to double,return null)
        Double value = GenericTypeValidator.formatDouble(propertyValue);
        boolean valid = true;
        if (value == null) {
            valid = false;
            String param = getPropertyItemName(property);
            addMessage(property, validateName, "GSCM-E0-0025", param);
        }

        return valid;
    }

    /**
     * Doubleチェック用のメソッドです。
     * Method for validating Double
     * 
     * @param property ドメインのフィールド名 かつ ActionFormのフィールド名
     * @param property Field name of Domain and ActionForm
     * @param screenId 画面ID
     * @param screenId Screen id
     * @return チェック対象項目内にDouble範囲外の文字列が入っていた場合は false を返します。それ以外の場合は true を返します。
     * @return If validation target contains some character string which is over fixed double range,return false.If validation target does not,return true
     */
    public boolean isPermittedDouble(String property, String screenId) {
        this.screenId = screenId;
        return isPermittedDouble(property);
    }

    /**
     * BigDecimalチェック用のメソッドです。
     * Method for validating BigDecimal
     * 
     * @param property ドメインのフィールド名 かつ ActionFormのフィールド名
     * @param property Field name of Domain and ActionForm
     * @return チェック対象項目内にBigDecimal範囲外の文字列が入っていた場合は false を返します。それ以外の場合は true を返します。
     * @return If validation target contains some character string which is over fixed bigDecimal range,return false.If validation target does not,return true
     */
    public boolean isPermittedBigDecimal(String property) {
        // TM_RESOURCE取得
        // Get TM_RESOURCE
        String validateName = "bigDecimal";
        String resourceKey = getValidateResourceKey(property, validateName);
        String resourceValue = getValidateValue(resourceKey);
        // Domainの値取得
        // Get Domain
        String propertyValue = getDomainPropertyValue(property);

        // チェック対象か？対象外の場合はチェックOKで
        // If value of TM_RESOURCE is not target,return true
        if (!BooleanUtils.toBoolean(resourceValue)) {
            return true;
        }

        // プロパティの値がない場合はチェックしない
        // If value of property is blank,return true
        if (CheckUtil.isBlankOrNull(propertyValue)) {
            return true;
        }

        // BigDecimalチェック(変換できない場合、NumberFormatExceptionがthrowされる)
        // Validate BigDecimal(If target is not converted to bigDecimal,throw NumberFormatException)
        boolean valid = true;
        try {
            new BigDecimal(propertyValue);
        } catch (NumberFormatException e) {
            valid = false;
            String param = getPropertyItemName(property);
            addMessage(property, validateName, "GSCM-E0-0025", param);
        }

        return valid;
    }

    /**
     * BigDecimalチェック用のメソッドです。
     * Method for validating BigDecimal
     * 
     * @param property ドメインのフィールド名 かつ ActionFormのフィールド名
     * @param property Field name of Domain and ActionForm
     * @param screenId 画面ID
     * @param screenId Screen id
     * @return チェック対象項目内にBigDecimal範囲外の文字列が入っていた場合は false を返します。それ以外の場合は true を返します。
     * @return If validation target contains some character string which is over fixed bigDecimal range,return false.If validation target does not,return true
     */
    public boolean isPermittedBigDecimal(String property, String screenId) {
        this.screenId = screenId;
        return isPermittedBigDecimal(property);
    }

    /**
     * ShortRangeチェック用のメソッドです。
     * Method for validating ShortRange
     * <p>
     * <pre>
     * Short範囲の指定は、TM_RESOURCESへ設定する。<br/>
     * Short range is specified at TM_RESOURCES<br/>
     * 設定内容は、「最小値:最大値」の書式で登録する。
     * Set content is registered as [Minimum:Maximum]
     * </pre>
     * </p>
     * @param property ドメインのフィールド名 かつ ActionFormのフィールド名
     * @param property Field name of Domain and ActionForm
     * @return チェック対象項目内に指定するShort範囲外の文字列が入っていた場合は false を返します。それ以外の場合は true を返します。
     * @return If validation target contains some character string which is over fixed short range,return false.If validation target does not,return true
     */
    public boolean isPermittedShortRange(String property) {
        // TM_RESOURCE取得
        // Get TM_RESOURCE
        String validateName = "shortRange";
        String resourceKey = getValidateResourceKey(property, validateName);
        String resourceValue = getValidateValue(resourceKey);
        // Domainの値取得
        // Get Domain
        String propertyValue = getDomainPropertyValue(property);

        // TM_RESOURCEの値がない場合はチェックしない
        // If value of TM_RESOURCE is blank,return true
        if (StringUtils.isBlank(resourceValue)) {
            return true;
        }

        // プロパティの値がない場合はチェックしない
        // If value of property is blank,return true
        if (CheckUtil.isBlankOrNull(propertyValue)) {
            return true;
        }

        // 最小値:最大値の取り出し
        // Get minimum and maximum value
        String[] parseRange = StringUtils.split(resourceValue, ":");
        short min = Short.parseShort(StringUtils.trim(parseRange[0]));
        short max = Short.parseShort(StringUtils.trim(parseRange[1]));

        // プロパティの値を数値変換
        // Convert property value to number
        short shortValue = Short.parseShort(propertyValue);

        // 範囲チェック
        // Validate range
        boolean valid = GenericValidator.isInRange(shortValue, min, max);
        if (!valid) {
            String param = getPropertyItemName(property);
            addMessage(property, validateName, "GSCM-E0-0026", param, min, max);
        }

        return valid;
    }

    /**
     * ShortRangeチェック用のメソッドです。
     * Method for validating ShortRange
     * <p>
     * <pre>
     * Short範囲の指定は、TM_RESOURCESへ設定する。<br/>
     * Short range is specified at TM_RESOURCES <br/>
     * 設定内容は、「最小値:最大値」の書式で登録する。
     * Set content is registered as [Minimum:Maximum]
     * </pre>
     * </p>
     * @param property ドメインのフィールド名 かつ ActionFormのフィールド名
     * @param property Field name of Domain and ActionForm
     * @param screenId 画面ID
     * @param screenId Screen id
     * @return チェック対象項目内に指定するShort範囲外の文字列が入っていた場合は false を返します。それ以外の場合は true を返します。
     * @return If validation target contains some character string which is over fixed short range,return false.If validation target does not,return true
     */
    public boolean isPermittedShortRange(String property, String screenId) {
        this.screenId = screenId;
        return isPermittedShortRange(property);
    }

    /**
     * IntegerRangeチェック用のメソッドです。
     * Method for validating IntegerRange
     * <p>
     * <pre>
     * Integer範囲の指定は、TM_RESOURCESへ設定する。<br/>
     * Integer range is specified at TM_RESOURCES<br/>
     * 設定内容は、「最小値:最大値」の書式で登録する。
     * Set content is registered as [Minimum:Maximum]
     * </pre>
     * </p>
     * @param property ドメインのフィールド名 かつ ActionFormのフィールド名
     * @param property Field name of Domain and ActionForm
     * @return チェック対象項目内に指定するInteger範囲外の文字列が入っていた場合は false を返します。それ以外の場合は true を返します。
     * @return If validation target contains some character string which is over fixed integer range,return false.If validation target does not,return true
     */
    public boolean isPermittedIntRange(String property) {
        // TM_RESOURCE取得
        // Get TM_RESOURCE
        String validateName = "intRange";
        String resourceKey = getValidateResourceKey(property, validateName);
        String resourceValue = getValidateValue(resourceKey);
        // Domainの値取得
        // Get Domain
        String propertyValue = getDomainPropertyValue(property);

        // TM_RESOURCEの値がない場合はチェックしない
        // If value of TM_RESOURCE is blank,return true
        if (StringUtils.isBlank(resourceValue)) {
            return true;
        }

        // プロパティの値がない場合はチェックしない
        // If value of property is blank,return true
        if (CheckUtil.isBlankOrNull(propertyValue)) {
            return true;
        }

        // 最小値:最大値の取り出し
        // Get minimum and maximum value
        String[] parseRange = StringUtils.split(resourceValue, ":");
        int min = Integer.parseInt(StringUtils.trim(parseRange[0]));
        int max = Integer.parseInt(StringUtils.trim(parseRange[1]));

        // プロパティの値を数値変換
        // Convert property value to number
        int intValue = Integer.parseInt(propertyValue);

        // 範囲チェック
        // Validate range
        boolean valid = GenericValidator.isInRange(intValue, min, max);
        if (!valid) {
            String param = getPropertyItemName(property);
            addMessage(property, validateName, "GSCM-E0-0026", param, min, max);
        }

        return valid;
    }

    /**
     * IntegerRangeチェック用のメソッドです。
     * Method for validating IntegerRange
     * <p>
     * <pre>
     * Integer範囲の指定は、TM_RESOURCESへ設定する。<br/>
     * Integer range is specified at TM_RESOURCES<br/>
     * 設定内容は、「最小値:最大値」の書式で登録する。
     * Set content is registered as [Minimum:Maximum]
     * </pre>
     * </p>
     * @param property ドメインのフィールド名 かつ ActionFormのフィールド名
     * @param property Field name of Domain and ActionForm
     * @param screenId 画面ID
     * @param screenId Screen id
     * @return チェック対象項目内に指定するInteger範囲外の文字列が入っていた場合は false を返します。それ以外の場合は true を返します。
     * @return If validation target contains some character string which is over fixed integer range,return false.If validation target does not,return true
     */
    public boolean isPermittedIntRange(String property, String screenId) {
        this.screenId = screenId;
        return isPermittedIntRange(property);
    }

    /**
     * LongRangeチェック用のメソッドです。
     * Method for validating LongRange
     * <p>
     * <pre>
     * Long範囲の指定は、TM_RESOURCESへ設定する。<br/>
     * Long range is specified at TM_RESOURCES<br/>
     * 設定内容は、「最小値:最大値」の書式で登録する。
     * Set content is registered as [Minimum:Maximum]
     * </pre>
     * </p>
     * @param property ドメインのフィールド名 かつ ActionFormのフィールド名
     * @param property Field name of Domain and ActionForm
     * @return チェック対象項目内に指定するLong範囲外の文字列が入っていた場合は false を返します。それ以外の場合は true を返します。
     * @return If validation target contains some character string which is over fixed long range,return false.If validation target does not,return true
     */
    public boolean isPermittedLongRange(String property) {
        // TM_RESOURCE取得
        // Get TM_RESOURCE
        String validateName = "longRange";
        String resourceKey = getValidateResourceKey(property, validateName);
        String resourceValue = getValidateValue(resourceKey);
        // Domainの値取得
        // Get Domain
        String propertyValue = getDomainPropertyValue(property);

        // TM_RESOURCEの値がない場合はチェックしない
        // If value of TM_RESOURCE is blank,return true
        if (StringUtils.isBlank(resourceValue)) {
            return true;
        }

        // プロパティの値がない場合はチェックしない
        // If value of property is blank,return true
        if (CheckUtil.isBlankOrNull(propertyValue)) {
            return true;
        }

        // 最小値:最大値の取り出し
        // Get minimum and Maximum value
        String[] parseRange = StringUtils.split(resourceValue, ":");
        long min = Long.parseLong(StringUtils.trim(parseRange[0]));
        long max = Long.parseLong(StringUtils.trim(parseRange[1]));

        // プロパティの値を数値変換
        // Convert property value to number
        long longValue = Long.parseLong(propertyValue);

        // 範囲チェック
        // Validate range
        boolean valid = GenericValidator.isInRange(longValue, min, max);
        if (!valid) {
            String param = getPropertyItemName(property);
            addMessage(property, validateName, "GSCM-E0-0026", param, min, max);
        }

        return valid;
    }

    /**
     * LongRangeチェック用のメソッドです。
     * Method for validating LongRange
     * <p>
     * <pre>
     * Long範囲の指定は、TM_RESOURCESへ設定する。<br/>
     * Long range is specified at TM_RESOURCES<br/>
     * 設定内容は、「最小値:最大値」の書式で登録する。
     * Set content is registered as [Minimum:Maximum]
     * </pre>
     * </p>
     * @param property ドメインのフィールド名 かつ ActionFormのフィールド名
     * @param property Field name of Domain and ActionForm
     * @param screenId 画面ID
     * @param screenId Screen id
     * @return チェック対象項目内に指定するLong範囲外の文字列が入っていた場合は false を返します。それ以外の場合は true を返します。
     * @return If validation target contains some character string which is over fixed long range,return false.If validation target does not,return true
     */
    public boolean isPermittedLongRange(String property, String screenId) {
        this.screenId = screenId;
        return isPermittedLongRange(property);
    }

    /**
     * FloatRangeチェック用のメソッドです。
     * Method for validating FloatRange
     * <p>
     * <pre>
     * Float範囲の指定は、TM_RESOURCESへ設定する。<br/>
     * Float range is specified at TM_RESOURCES<br/>
     * 設定内容は、「最小値:最大値」の書式で登録する。
     * Set content is registered as [Minimum:Maximum]
     * </pre>
     * </p>
     * @param property ドメインのフィールド名 かつ ActionFormのフィールド名
     * @param property Field name of Domain and ActionForm
     * @return チェック対象項目内に指定するFloat範囲外の文字列が入っていた場合は false を返します。それ以外の場合は true を返します。
     * @return If validation target contains some character string which is over fixed float range,return false.If validation target does not,return true
     */
    public boolean isPermittedFloatRange(String property) {
        // TM_RESOURCE取得
        // Get TM_RESOURCE
        String validateName = "floatRange";
        String resourceKey = getValidateResourceKey(property, validateName);
        String resourceValue = getValidateValue(resourceKey);
        // Domainの値取得
        // Get Domain
        String propertyValue = getDomainPropertyValue(property);

        // TM_RESOURCEの値がない場合はチェックしない
        // If value of TM_RESOURCE is blank,return true
        if (StringUtils.isBlank(resourceValue)) {
            return true;
        }

        // プロパティの値がない場合はチェックしない
        // If value of property is blank,return true
        if (CheckUtil.isBlankOrNull(propertyValue)) {
            return true;
        }

        // 最小値:最大値の取り出し
        // Get minimum and Maximum value
        String[] parseRange = StringUtils.split(resourceValue, ":");
        float min = Float.parseFloat(StringUtils.trim(parseRange[0]));
        float max = Float.parseFloat(StringUtils.trim(parseRange[1]));

        // プロパティの値を数値変換
        // Convert property value to number
        float floatValue = Float.parseFloat(propertyValue);

        // 範囲チェック
        // Validate range
        boolean valid = GenericValidator.isInRange(floatValue, min, max);
        if (!valid) {
            String param = getPropertyItemName(property);
            addMessage(property, validateName, "GSCM-E0-0026", param, min, max);
        }

        return valid;
    }

    /**
     * FloatRangeチェック用のメソッドです。
     * Method for validating FloatRange
     * <p>
     * <pre>
     * Float範囲の指定は、TM_RESOURCESへ設定する。<br/>
     * Float range is specified at TM_RESOURCES<br/>
     * 設定内容は、「最小値:最大値」の書式で登録する。
     * Set content is registered as [Minimum:Maximum]
     * </pre>
     * </p>
     * @param property ドメインのフィールド名 かつ ActionFormのフィールド名
     * @param property Field name of Domain and ActionForm
     * @param screenId 画面ID
     * @param screenId Screen id
     * @return チェック対象項目内に指定するFloat範囲外の文字列が入っていた場合は false を返します。それ以外の場合は true を返します。
     * @return If validation target contains some character string which is over fixed float range,return false.If validation target does not,return true
     */
    public boolean isPermittedFloatRange(String property, String screenId) {
        this.screenId = screenId;
        return isPermittedFloatRange(property);
    }

    /**
     * DoubleRangeチェック用のメソッドです。
     * Method for validating DoubleRange
     * <p>
     * <pre>
     * Double範囲の指定は、TM_RESOURCESへ設定する。<br/>
     * Double range is specified at TM_RESOURCES<br/>
     * 設定内容は、「最小値:最大値」の書式で登録する。
     * Set content is registered as [Minimum:Maximum]
     * </pre>
     * </p>
     * @param property ドメインのフィールド名 かつ ActionFormのフィールド名
     * @param property Field name of Domain and ActionForm
     * @return チェック対象項目内に指定するDouble範囲外の文字列が入っていた場合は false を返します。それ以外の場合は true を返します。
     * @return If validation target contains some character string which is over fixed double range,return false.If validation target does not,return true
     */
    public boolean isPermittedDoubleRange(String property) {
        // TM_RESOURCE取得
        // Get TM_RESOURCE
        String validateName = "doubleRange";
        String resourceKey = getValidateResourceKey(property, validateName);
        String resourceValue = getValidateValue(resourceKey);
        // Domainの値取得
        // Get Domain
        String propertyValue = getDomainPropertyValue(property);

        // TM_RESOURCEの値がない場合はチェックしない
        // If value of TM_RESOURCE is blank,return true
        if (StringUtils.isBlank(resourceValue)) {
            return true;
        }

        // プロパティの値がない場合はチェックしない
        // If value of property is blank,return true
        if (CheckUtil.isBlankOrNull(propertyValue)) {
            return true;
        }

        // 最小値:最大値の取り出し
        // Get minimum and Maximum value
        String[] parseRange = StringUtils.split(resourceValue, ":");
        double min = Double.parseDouble(StringUtils.trim(parseRange[0]));
        double max = Double.parseDouble(StringUtils.trim(parseRange[1]));

        // プロパティの値を数値変換
        // Convert property value to number
        double doubleValue = Double.parseDouble(propertyValue);

        // 範囲チェック
        // Validate range
        boolean valid = GenericValidator.isInRange(doubleValue, min, max);
        if (!valid) {
            String param = getPropertyItemName(property);
            addMessage(property, validateName, "GSCM-E0-0026", param, min, max);
        }

        return valid;
    }

    /**
     * DoubleRangeチェック用のメソッドです。
     * Method for validating DoubleRange
     * <p>
     * <pre>
     * Double範囲の指定は、TM_RESOURCESへ設定する。<br/>
     * Double range is specified at TM_RESOURCES<br/>
     * 設定内容は、「最小値:最大値」の書式で登録する。
     * Set content is registered as [Minimum:Maximum]
     * </pre>
     * </p>
     * @param property ドメインのフィールド名 かつ ActionFormのフィールド名
     * @param property Field name of Domain and ActionForm
     * @param screenId 画面ID
     * @param screenId Screen id
     * @return チェック対象項目内に指定するDouble範囲外の文字列が入っていた場合は false を返します。それ以外の場合は true を返します。
     * @return If validation target contains some character string which is over fixed double range,return false.If validation target does not,return true
     */
    public boolean isPermittedDoubleRange(String property, String screenId) {
        this.screenId = screenId;
        return isPermittedDoubleRange(property);
    }

    /**
     * BigDecimalRangeチェック用のメソッドです。
     * Method for validating BigDecimalRange
     * <p>
     * <pre>
     * BigDecimal範囲の指定は、TM_RESOURCESへ設定する。<br/>
     * BigDecimal range is specified at TM_RESOURCES<br/>
     * 設定内容は、「最小値:最大値」の書式で登録する。
     * Set content is registered as [Minimum:Maximum]
     * </pre>
     * </p>
     * @param property ドメインのフィールド名 かつ ActionFormのフィールド名
     * @param property Field name of Domain and ActionForm
     * @return チェック対象項目内に指定するBigDecimal範囲外の文字列が入っていた場合は false を返します。それ以外の場合は true を返します。
     * @return If validation target contains some character string which is over fixed BigDecimal range,return false.If validation target does not,return true
     */
    public boolean isPermittedBigDecimalRange(String property) {
        // TM_RESOURCE取得
        // Get TM_RESOURCE
        String validateName = "bigDecimalRange";
        String resourceKey = getValidateResourceKey(property, validateName);
        String resourceValue = getValidateValue(resourceKey);
        // Domainの値取得
        // Get Domain
        String propertyValue = getDomainPropertyValue(property);

        // TM_RESOURCEの値がない場合はチェックしない
        // If value of TM_RESOURCE is blank,return true
        if (StringUtils.isBlank(resourceValue)) {
            return true;
        }

        // プロパティの値がない場合はチェックしない
        // If value of property is blank,return true
        if (CheckUtil.isBlankOrNull(propertyValue)) {
            return true;
        }

        // 最小値:最大値の取り出し
        // Get minimum and Maximum value
        String[] parseRange = StringUtils.split(resourceValue, ":");
        BigDecimal min = new BigDecimal(StringUtils.trim(parseRange[0]));
        BigDecimal max = new BigDecimal(StringUtils.trim(parseRange[1]));

        // プロパティの値を数値変換
        // Convert property value to number
        BigDecimal bigDecimalValue = new BigDecimal(propertyValue);

        // 範囲チェック
        // Validate range
        if (bigDecimalValue.compareTo(min) < 0 || bigDecimalValue.compareTo(max) > 0 ) {
            String param = getPropertyItemName(property);
            addMessage(property, validateName, "GSCM-E0-0026", param, min, max);
            return false;
        }

        return true;
    }

    /**
     * BigDecimalRangeチェック用のメソッドです。
     * Method for validating BigDecimalRange
     * <p>
     * <pre>
     * BigDecimal範囲の指定は、TM_RESOURCESへ設定する。<br/>
     * BigDecimal range is specified at TM_RESOURCES<br/>
     * 設定内容は、「最小値:最大値」の書式で登録する。
     * Set content is registered as [Minimum:Maximum]
     * </pre>
     * </p>
     * @param property ドメインのフィールド名 かつ ActionFormのフィールド名
     * @param property Field name of Domain and ActionForm
     * @param screenId 画面ID
     * @param screenId Screen id
     * @return チェック対象項目内に指定するBigDecimal範囲外の文字列が入っていた場合は false を返します。それ以外の場合は true を返します。
     * @return If validation target contains some character string which is over fixed bigDecimal range,return false.If validation target does not,return true
     */
    public boolean isPermittedBigDecimalRange(String property, String screenId) {
        this.screenId = screenId;
        return isPermittedBigDecimalRange(property);
    }

    /**
     * 書式チェック用のメソッドです。
     * Method for validating Format
     * 
     * @param property ドメインのフィールド名 かつ ActionFormのフィールド名
     * @param property Field name of Domain and ActionForm
     * @return チェック対象項目の文字列が format で指定した書式に一致しない場合は false を返します。それ以外の場合は true を返します。
     * @return If character string of validation target is not consistent with format,return false.If character string of validation target is consistent,return true
     */
    public boolean isPermittedFormat(String property) {
        // TM_RESOURCE取得
        // Get TM_RESOURCE
        String validateName = "format";
        String resourceKey = getValidateResourceKey(property, validateName);
        String resourceValue = getValidateValue(resourceKey);
        // Domainの値取得
        // Get Domain
        String propertyValue = getDomainPropertyValue(property);

        // TM_RESOURCEの値がない場合はチェックしない
        // If value of TM_RESOURCE is blank,return true
        if (StringUtils.isBlank(resourceValue)) {
            return true;
        }

        // プロパティの値がない場合はチェックしない
        // If value of property is blank,return true
        if (CheckUtil.isBlankOrNull(propertyValue)) {
            return true;
        }

        // 正規表現チェック
        // Validate regular expressions
        boolean valid = CheckUtil.isMatchedFormat(propertyValue, resourceValue);
        if (!valid) {
            String param = getPropertyItemName(property);
            addMessage(property, validateName, "GSCM-E0-0018", param);
        }

        return valid;
    }

    /**
     * 書式チェック用のメソッドです。
     * Method for validating Format
     * 
     * @param property ドメインのフィールド名 かつ ActionFormのフィールド名
     * @param property Field name of Domain and ActionForm
     * @param screenId 画面ID
     * @param screenId Screen id
     * @return チェック対象項目の文字列が format で指定した書式に一致しない場合は false を返します。それ以外の場合は true を返します。
     * @return If character string of validation target is not consistent with format,return false.If character string of validation target is consistent,return true
     */
    public boolean isPermittedFormat(String property, String screenId) {
        this.screenId = screenId;
        return isPermittedFormat(property);
    }

    /**
     * 日付チェック用のメソッドです。
     * Method for validating Date
     * 
     * @param property ドメインのフィールド名 かつ ActionFormのフィールド名
     * @param property Field name of Domain and ActionForm
     * @return チェック対象項目の文字数が 正しい日付でない場合は false を返します。 それ以外の場合はtrueを返します。
     * @return If character string of validation target is not date format,return false.If character string of validation target is,return true
     */
    public boolean isPermittedDate(String property) {
        // TM_RESOURCE取得
        // Get TM_RESOURCE
        String validateName = "date";
        String resourceKey = getValidateResourceKey(property, validateName);
        String resourceValue = getValidateValue(resourceKey);
        // Domainの値取得
        // Get Domain
        String propertyValue = getDomainPropertyValue(property);

        // TM_RESOURCEの値がない場合はチェックしない
        // If value of TM_RESOURCE is blank,return true
        if (StringUtils.isBlank(resourceValue)) {
            return true;
        }

        // プロパティの値がない場合はチェックしない
        // If value of property is blank,return true
        if (CheckUtil.isBlankOrNull(propertyValue)) {
            return true;
        }

        // カンマ複数指定
        // Structure of variable for multi-comma
        String[] formatArray = StringUtils.split(resourceValue, ",");
        // 日付書式チェック
        // Validate date format
        boolean valid = CheckUtil.isDate(propertyValue, formatArray);
        if (!valid) {
            String param = getPropertyItemName(property);
            addMessage(property, validateName, "GSCM-E0-0019", param);
        }

        return valid;
    }

    /**
     * 日付チェック用のメソッドです。
     * Method for validating Date
     * 
     * @param property ドメインのフィールド名 かつ ActionFormのフィールド名
     * @param property Field name of Domain and ActionForm
     * @param screenId 画面ID
     * @param screenId Screen id
     * @return チェック対象項目の文字数が 正しい日付でない場合は false を返します。 それ以外の場合はtrueを返します。
     * @return If character string of validation target is not date format,return false.If character string of validation target is,return true
     */
    public boolean isPermittedDate(String property, String screenId) {
        this.screenId = screenId;
        return isPermittedDate(property);
    }

    /**
     * 日付チェック(責任会社用日付フォーマット)用のメソッドです。
     * Method for validating Date(for company date)
     * <p>
     * <pre>
     * 画面共通情報(CommonInfoDomain)内に保持する日付フォーマットを利用し、日付の書式チェックを行います。
     * Validate date format with date format at common screen information(CommonInfoDomain)
     * </pre>
     * </p>
     * @param property ドメインのフィールド名 かつ ActionFormのフィールド名
     * @param property Field name of Domain and ActionForm
     * @return チェック対象項目の文字数が 正しい日付でない場合は false を返します。 それ以外の場合はtrueを返します。
     * @return If character string of validation target is not date format,return false.If character string of validation target is,return true
     */
    public boolean isPermittedOwnerCompDate(String property) {
        // TM_RESOURCE取得
        // Get TM_RESOURCE
        String validateName = "ownerCompDate";
        String resourceKey = getValidateResourceKey(property, validateName);
        String resourceValue = getValidateValue(resourceKey);

        // Domainの値取得
        // Get Domain
        String propertyValue = getDomainPropertyValue(property);
        // 責任会社用の日付フォーマット取得
        // Get format date for company
        String ownerCompDateFormat = domain.getDateFormat();

        // チェック対象か？対象外の場合はチェックOKで
        // If value of TM_RESOURCE is not target,return true
        if (!BooleanUtils.toBoolean(resourceValue)) {
            return true;
        }

        // プロパティの値がない場合はチェックしない
        // If value of property is blank,return true
        if (CheckUtil.isBlankOrNull(propertyValue)) {
            return true;
        }

        // 責任会社用の日付フォーマットが未指定の場合はチェックしない
        // If date format for company is not specified,return true
        if (CheckUtil.isBlankOrNull(ownerCompDateFormat)) {
            return true;
        }

        // 日付書式チェック
        // Validate date format
        boolean valid = CheckUtil.isDate(propertyValue, ownerCompDateFormat);
        if (!valid) {
            String param = getPropertyItemName(property);
            addMessage(property, validateName, "GSCM-E0-0019", param);
        }

        return valid;
    }

    /**
     * 日付チェック(責任会社用日付フォーマット)用のメソッドです。
     * Method for validating Date(for company date)
     * <p>
     * <pre>
     * 画面共通情報(CommonInfoDomain)内に保持する日付フォーマットを利用し、日付の書式チェックを行います。
     * Validate date format with date format at common screen information(CommonInfoDomain)
     * </pre>
     * </p>
     * @param property ドメインのフィールド名 かつ ActionFormのフィールド名
     * @param property Field name of Domain and ActionForm
     * @param screenId 画面ID
     * @param screenId Screen id
     * @return チェック対象項目の文字数が 正しい日付でない場合は false を返します。 それ以外の場合はtrueを返します。
     * @return If character string of validation target is not date format,return false.If character string of validation target is,return true
     */
    public boolean isPermittedOwnerCompDate(String property, String screenId) {
        this.screenId = screenId;
        return isPermittedOwnerCompDate(property);
    }

    /**
     * URLチェック用のメソッドです。
     * Method for validating URL
     * <p>
     * <pre>
     * 許可するスキームは、「http:」、「https:」、「ftp:」のみ有効。<br/>
     * Permitted scheme is only http:,https: and ftp:<br/>
     * ダブルスラッシュは「http://」以外での「//」は入力禁止。<br/>
     * Input of double slash except http:// is prohibited<br/>
     * URLの途中に#入力可。
     * Input # is available at midpoint of URL
     * </pre>
     * </p>
     * @param property ドメインのフィールド名 かつ ActionFormのフィールド名
     * @param property Field name of Domain and ActionForm
     * @return チェック対象項目の文字数が 正しいURLでない場合は false を返します。 それ以外の場合はtrueを返します。
     * @return If character string of validation target is not correct URL,return false.If character string of validation target is,return true
     */
    public boolean isPermittedUrl(String property) {
        // TM_RESOURCE取得
        // Get TM_RESOURCE
        String validateName = "url";
        String resourceKey = getValidateResourceKey(property, validateName);
        String resourceValue = getValidateValue(resourceKey);
        // Domainの値取得
        // Get Domain
        String propertyValue = getDomainPropertyValue(property);

        // チェック対象か？対象外の場合はチェックOKで
        // If value of TM_RESOURCE is not target,return true
        if (!BooleanUtils.toBoolean(resourceValue)) {
            return true;
        }

        // プロパティの値がない場合はチェックしない
        // If value of property is blank,return true
        if (CheckUtil.isBlankOrNull(propertyValue)) {
            return true;
        }

        // 正規表現チェック
        // Validate regular expressions
        boolean valid = GenericValidator.isUrl(propertyValue);
        if (!valid) {
            String param = getPropertyItemName(property);
            addMessage(property, validateName, "GSCM-E0-0028", param);
        }

        return valid;
    }

    /**
     * URLチェック用のメソッドです。
     * Method for validating URL
     * <p>
     * <pre>
     * 許可するスキームは、「http:」、「https:」、「ftp:」のみ有効。<br/>
     * Permitted scheme is only http:,https: and ftp:<br/>
     * ダブルスラッシュは「http://」以外での「//」は入力禁止。<br/>
     * Input of double slash except http:// is prohibited<br/>
     * URLの途中に#入力可。
     * Input # is available at midpoint of URL
     * </pre>
     * </p>
     * @param property ドメインのフィールド名 かつ ActionFormのフィールド名
     * @param property Field name of Domain and ActionForm
     * @param screenId 画面ID
     * @param screenId Screen id
     * @return チェック対象項目の文字数が 正しいURLでない場合は false を返します。 それ以外の場合はtrueを返します。
     * @return If character string of validation target is not correct URL,return false.If character string of validation target is,return true
     */
    public boolean isPermittedUrl(String property, String screenId) {
        this.screenId = screenId;
        return isPermittedUrl(property);
    }
 
    /**
     * Emailチェック用のメソッドです。
     * Method for validating Email
     * 
     * @param property ドメインのフィールド名 かつ ActionFormのフィールド名
     * @param property Field name of Domain and ActionForm
     * @return チェック対象項目の文字数が 正しいURLでない場合は false を返します。 それ以外の場合はtrueを返します。
     * @return If character string of validation target is not correct Email address,return false.If character string of validation target is,return true
     */
    public boolean isPermittedEmail(String property) {
        // TM_RESOURCE取得
        // Get TM_RESOURCE
        String validateName = "email";
        String resourceKey = getValidateResourceKey(property, validateName);
        String resourceValue = getValidateValue(resourceKey);
        // Domainの値取得
        // Get Domain
        String propertyValue = getDomainPropertyValue(property);

        // チェック対象か？対象外の場合はチェックOKで
        // If value of TM_RESOURCE is not target,return true
        if (!BooleanUtils.toBoolean(resourceValue)) {
            return true;
        }

        // プロパティの値がない場合はチェックしない
        // If value of property is blank,return true
        if (CheckUtil.isBlankOrNull(propertyValue)) {
            return true;
        }

        // 正規表現チェック
        // Validate regular expressions
        boolean valid = GenericValidator.isEmail(propertyValue);
        if (!valid) {
            String param = getPropertyItemName(property);
            addMessage(property, validateName, "GSCM-E0-0027", param);
        }

        return valid;
    }

    /**
     * Emailチェック用のメソッドです。
     * Method for validating Email
     * 
     * @param property ドメインのフィールド名 かつ ActionFormのフィールド名
     * @param property Field name of Domain and ActionForm
     * @param screenId 画面ID
     * @param screenId Screen id
     * @return チェック対象項目の文字数が 正しいURLでない場合は false を返します。 それ以外の場合はtrueを返します。
     * @return If character string of validation target is not correct Email address,return false.If character string of validation target is,return true
     */
    public boolean isPermittedEmail(String property, String screenId) {
        this.screenId = screenId;
        return isPermittedEmail(property);
    }

    /**
     * 全プロパティをチェックする
     * Validate all properties
     * <p>
     * 全プロパティをチェックする
     * Validate all properties
     * </p>
     * 
     * @return true=チェックOK、false=チェックNG
     * @return true=validation is OK,false=validation is NG
     */
    public boolean isValidateAllProperties() {
        return isValidateAllProperties("");
    }

    /**
     * 全プロパティをチェックする
     * Validate all properties
     * <p>
     * 全プロパティをチェックする
     * Validate all properties
     * </p>
     * 
     * @param screenId 画面ID
     * @param screenId Screen id
     * @return true=チェックOK、false=チェックNG
     * @return true=validation is OK,false=validation is NG
     */
    public boolean isValidateAllProperties(String screenId) {

        PropertyDescriptor[] propertyDescriptors = PropertyUtils.getPropertyDescriptors(domain);
        List<String> propertyList = new ArrayList<String>();

        for (PropertyDescriptor descriptor : propertyDescriptors) {

            // Stringのプロパティだけ
            // Validate only string property
            if (!String.class.equals(descriptor.getPropertyType())) {
                continue;
            }
            propertyList.add(descriptor.getName());
        }
        Collections.sort(propertyList);
        String[] properties = propertyList.toArray(new String[propertyList.size()]);

        return isValidateProperties(properties, screenId);
    }

    /**
     * 指定プロパティのバリデータを実行する
     * Validate specified property
     * <p>
     * 指定プロパティのバリデータを実行する
     * Validate specified property
     * </p>
     * 
     * @param properties プロパティ名配列
     * @param properties Structure of property name
     * @return true=チェックOK、false=チェックNG
     * @return true=validation is OK,false=validation is NG
     */
    public boolean isValidateProperties(String[] properties) {
        return isValidateProperties(properties, "");
    }

    /**
     * 指定プロパティのバリデータを実行する
     * Validate specified property
     * <p>
     * 指定プロパティのバリデータを実行する
     * Validate specified property
     * </p>
     * 
     * @param properties プロパティ名配列
     * @param properties Structure of property name
     * @param screenId 画面ID
     * @param screenId Screen id
     * @return true=チェックOK、false=チェックNG
     * @return true=validation is OK,false=validation is NG
     */
    public boolean isValidateProperties(String[] properties, String screenId) {

        // プロパティなしの場合はチェックしない
        // If properties of argument is null,return true
        if (properties == null) {
            return true;
        }

        // 単項目チェックを全部実施
        // Validate an item to properties of argument
        boolean valid = true;
        for (String property : properties) {
            valid = isValidateProperty(property, screenId) && valid;
        }

        return valid;
    }

    /**
     * 指定したプロパティと画面IDの組み合わせのチェックを行う
     * Validate set of specified property and screen id
     * <p>
     * Mapのキーにはプロパティ、値には画面IDを指定する。 画面IDに関係なくチェックしたい場合は画面IDをNULLまたはブランクで指定する。
     * Specify property to Map key and screen id to Map value.When validate without screen id,specify screen id with NULL or blank 
     * プロパティの順番を指定したい場合はTreeMapのインスタンスを引数へ設定する。
     * When specify sequence of property,set instance of TreeMap to argument
     * </p>
     * 
     * @param propertiesMap プロパティと画面IDの組み合わせ
     * @param propertiesMap Set of property and screen id
     * @return true=チェックOK、false=チェックNG
     * @return true=validation is OK,false=validation is NG
     */
    public boolean isValidateProperties(Map<String, String> propertiesMap) {

        // NULLの場合はチェックしない
        // If propertiesMap of arguments is Null,return true
        if (propertiesMap == null) {
            return true;
        }

        boolean valid = true;
        for (Entry<String, String> propertyEntry : propertiesMap.entrySet()) {
            String property = propertyEntry.getKey();
            String screenId = propertyEntry.getValue();

            valid = isValidateProperty(property, screenId) && valid;

        }

        return valid;

    }

    /**
     * 1項目の単項目チェックを行う
     * Validate an item for one item
     * <p>
     * 1項目の単項目チェックを行う
     * Validate an item for one item
     * </p>
     * 
     * @param property プロパティ名
     * @param property Property name
     * @return true=チェックOK、false=チェックNG
     * @return true=validation is OK,false=validation is NG
     */
    public boolean isValidateProperty(String property) {

        return isValidateProperty(property, "");

    }

    /**
     * 1項目の単項目チェックを行う
     * Validate an item for one item
     * <p>
     * 1項目の単項目チェックを行う
     * Validate an item for one item
     * </p>
     * 
     * @param property プロパティ名
     * @param property Property name
     * @param screenId 画面ID
     * @param screenId Screen id
     * @return true=チェックOK、false=チェックNG
     * @return true=validation is OK,false=validation is NG
     */
    public boolean isValidateProperty(String property, String screenId) {
        this.screenId = screenId;

        // プロパティに対してチェックを順に行う
        // Validate property sequencely
        boolean valid = isFill(property);
        valid = valid && isPermittedAttr(property);
        valid = valid && isPermittedIllegalChar(property);
        valid = valid && isPermittedCharMinLen(property);
        valid = valid && isPermittedCharMaxLen(property);
        valid = valid && isPermittedByte(property);
        valid = valid && isPermittedShort(property);
        valid = valid && isPermittedInteger(property);
        valid = valid && isPermittedLong(property);
        valid = valid && isPermittedFloat(property);
        valid = valid && isPermittedDouble(property);
        valid = valid && isPermittedBigDecimal(property);
        valid = valid && isPermittedShortRange(property);
        valid = valid && isPermittedIntRange(property);
        valid = valid && isPermittedLongRange(property);
        valid = valid && isPermittedFloatRange(property);
        valid = valid && isPermittedDoubleRange(property);
        valid = valid && isPermittedBigDecimalRange(property);
        valid = valid && isPermittedFormat(property);
        valid = valid && isPermittedOwnerCompDate(property);
        valid = valid && isPermittedDate(property);
        valid = valid && isPermittedUrl(property);
        valid = valid && isPermittedEmail(property);

        return valid;
    }

    /**
     * 禁止文字チェック
     * Validate prohibited character
     * 
     * @param property プロパティ
     * @param property Property
     * @return true=チェックOK、false=チェックNG
     * @return true=validation is OK,false=validation is NG
     */
    public boolean isPermittedIllegalChar(String property) {
        // 禁止文字チェックは無条件に実行する
        // Validate prohibited character invariably
        // TM_RESOURCE取得
        // Get TM_RESOURCE
        String validateName = "illegalChar";
        // Domainの値取得
        // Get Domain
        String propertyValue = getDomainPropertyValue(property);

        boolean valid = true;
        
        // NULL、Blank、半角/全角スペースの場合、trueを返す。
        // If property of argument is NULL,Blank,halfwidth space or fullwidth space,return true
        // 禁則文字チェック(アプリ基盤共通部品)でfalseとなるのを回避する。
        // Avoid that return false with validate prohibited character(common part of application) 
        if (StringUtils.isBlank(propertyValue)) {
            return valid;
        }
        
        // 禁則文字チェック
        // Validate prohibited character
        if (!CheckUtil.isUnprohibited(propertyValue)) {
            valid = false;
        }

        // サロゲートペア対応。禁則文字と同じ扱いにしておく。
        // For Surrogates Pair.Validate same as prohibited character
        if (!CheckUtil.isSurrogatePair(propertyValue)) {
            valid = false;
        }

        if (!valid) {
            String param = getPropertyItemName(property);
            addMessage(property, validateName, "GSCM-E0-0012", param);
        }

        return valid;
    }

    /**
     * リソースを作成する
     * Create resource
     * 
     * @param domain ドメイン
     * @param domain Domain
     */
    private void createResource(AbstractDomain domain) {
        Locale locale = domain.getLocale();
        if (locale == null) {
            locale = new Locale(domain.getLanguageCd());
        }
        rsc = new Resource(locale);
    }

    /**
     * Validateのリソースキーを取得する
     * Get resource key of validation
     * 
     * @param property プロパティ
     * @param property Property
     * @param validateName バリデート種類名
     * @param validateName Kind of validation name
     * @return リソースキー
     * @return Resource key
     */
    private String getValidateResourceKey(String property, String validateName) {
        String prefix = getResourceKeyPrefix(property);
        return String.format("%s.%s", prefix, validateName);
    }

    /**
     * リソースキーのプロパティ部分まで作成する
     * Create property part of resource key
     * 
     * @param property プロパティ
     * @param property Property
     * @return キーの前半
     * @return prefix of key
     */
    private String getResourceKeyPrefix(String property) {
        String prefix = null;
        if (StringUtils.isBlank(screenId)) {
            // 画面IDなしの場合はプロパティだけで作成
            // If screen id is blank,create prefix of key only with property
            prefix = String.format(RESOUCEKEY_NONDISPID_PREFIX, property);
        } else {
            // 画面IDありの場合は画面ID付で作成
            // If screen id exists,create prefix of key with property added screen id
            prefix = String.format(RESOUCEKEY_DISPID_PREFIX, screenId, property);
        }
        return prefix;
    }

    /**
     * TM_RESOURCEの値を取得する（参照の参照後の値を取得する）
     * Get TM_RESOURCE(Value of reference)
     * 
     * @param validateResourceKey リソースキー
     * @param validateResourceKey Resource key
     * @return 値
     * @return Value
     */
    private String getValidateValue(String validateResourceKey) {

        String value = rsc.getResource(validateResourceKey);
        if (value == null) {
            value = getValidateValueRef(validateResourceKey);
        }
        return value;
    }

    /**
     * TM_RESOURCEの値を取得する（参照用）
     * Get TM_RESOURCE(Value of reference)
     * 
     * @param validateResourceKey リソースキー
     * @param validateResourceKey Resource key
     * @return 値
     * @return Value
     */
    private String getValidateValueRef(String validateResourceKey) {
        String resourceKey = String.format(VALIDATE_RESOURCE_KEY_REF_PATTERN, validateResourceKey);
        String refKey = rsc.getResource(resourceKey);
        String value = rsc.getResource(refKey);

        if (value == null && StringUtils.contains(refKey, ",")) {

            // リソースキーがカンマ区切りの場合は、カンマで分けてそれぞれ取得して最終的にカンマ区切りに直して返す
            // When resource key of arguments contains comma,get value of resource with combined comma and finally join with comma-separated

            // カンマで取れた分すべて取得
            // Get value of resource with combined comma
            String[] keys = StringUtils.split(refKey, ",");
            String[] values = new String[keys.length];
            for (int i = 0; i < keys.length; i++ ) {
                String key = StringUtils.trim(keys[i]);
                values[i] = rsc.getResource(key);
            }

            // カンマつなぎ
            // Join value of resource with comma-separated
            value = StringUtils.join(values, ",");

        }

        return value;
    }

    /**
     * プロパティの項目名の取得する
     * Get item name of property
     * <p>
     * プロパティの項目名の取得する
     * Get item name of property
     * </p>
     * 
     * @param property プロパティ名
     * @param property Property name
     * @return 項目名
     * @return Item name
     */
    private String getPropertyItemName(String property) {
        return getPropertyItemName(screenId, property);
    }

    /**
     * プロパティの項目名の取得する
     * Get item name of property
     * <p>
     * プロパティの項目名の取得する
     * Get item name of property
     * </p>
     * 
     * @param dispId 画面ID
     * @param dispId screen id
     * @param property プロパティ名
     * @param property Property name
     * @return 項目名
     * @return Item name
     */
    private String getPropertyItemName(String dispId, String property) {
        String value = null;
        if (StringUtils.isBlank(dispId)) {
            String key = String.format(DEFAULT_ITEM_NONDISPID_LABEL, property);
            value = rsc.getResource(key);
        } else {
            String key = String.format(DEFAULT_ITEM_DISPID_LABEL, dispId, property);
            value = rsc.getResource(key);
            if (value == null) {
                // valueがない場合は、画面IDなしでも見る
                // If screen id of argument is not blank and value of resource with screen id of argument is null,set value only with property
                value = getPropertyItemName(null, property);
            }
        }

        /*
         * 画面ID付きのRESOUCE_キーが見つからない場合、画面IDなしで再帰的に本メソッドが呼ばれている
         * ので、一覧系画面の場合、メッセージ接頭辞が二重に付与されないようにする。
         * Because invoke this method again without screen id if value of resource is not with screen id,
         * make prefix message not set twice
         */
        if (value != null && value.indexOf(this.msgPrefix) == -1) {
            value = StringUtils.defaultString(this.msgPrefix) + value;
        }
        return value;
    }

    // ///// Domain関連 ////////
    // ///// For Domain ////////
    /**
     * ドメインのフィールド名を受け取り、そのフィールドの値を返すメソッドです。
     * Method for receiving field name of domain and returning value of the field
     * <p>
     * フィールドがString型で定義されていることが前提です。<br>
     * To define field as string type is precondition<br>
     * Exception発生時にはSystemExceptionでラッピングしてスローします。
     * When exception occurs,throw exception wrapped with SystemException
     * </p>
     * 
     * @param propertyName ドメインのフィールド名
     * @param propertyName Field name of domain
     * @return ドメインのフィールド値
     * @return Field value of domain
     */
    private String getDomainPropertyValue(String propertyName) {
        try {
            return (String)BeanUtils.getProperty(domain, propertyName);
        } catch (Exception e) {
            // 呼び出した先のメソッドで例外が発生した場合エラー
            // When exception occurs at method invoked,throw exception
            throw new SystemException(e);
        }
    }

    // ////// メッセージ関連 ////////
    // ////// For message ////////

    /**
     * エラーメッセージリストにエラーメッセージドメインを追加する
     * Add domain of error message to list of error message
     * 
     * @param property プロパティ
     * @param property Property
     * @param validateName validate種類名
     * @param validateName Name of validation
     * @param defaultMessageId デフォルトメッセージID
     * @param defaultMessageId Default message id
     * @param defaultMessageParams デフォルトメッセージパラメータ
     * @param defaultMessageParams Argument of default message
     */
    private void addMessage(String property, String validateName, String defaultMessageId,
        Object... defaultMessageParams) {
        MessageDomain messageDomain = getMessageDomain(property, validateName, defaultMessageId,
            defaultMessageParams);
        errList.add(messageDomain);
    }

    /**
     * メッセージDomain取得
     * Get message Domain
     * 
     * @param property プロパティ
     * @param property Property
     * @param validateName バリデート種類
     * @param validateName Name of validation
     * @param defaultMessageId デフォルトメッセージID
     * @param defaultMessageId Default message id
     * @param defaultMessageParams デフォルトメッセージ用パラメータ
     * @param defaultMessageParams Argument of default message
     * @return メッセージドメイン
     * @return Message domain
     */
    private MessageDomain getMessageDomain(String property, String validateName,
        String defaultMessageId, Object... defaultMessageParams) {

        // 画面用プロパティ名
        // Property name for window
        String fullProperty = getPropertyName(property);

        // メッセージIDの取得
        // Get message id
        String validKey = getValidateResourceKey(property, validateName);
        String resourceKey = String.format(MESSAGE_RESOURCE_KEY_FORMAT, validKey);
        String messageId = rsc.getResource(resourceKey);

        // メッセージIDが取得できない場合は、標準のメッセージを取得する
        // If message id is not gotten,get standard message
        if (StringUtils.isBlank(messageId)) {
            return new MessageDomain(fullProperty, defaultMessageId, defaultMessageParams);
        }

        // メッセージ引数の取得
        // Get message argument
        List<String> messageArgList = new ArrayList<String>();
        for (int i = 0; i < MAX_MESSAGE_ARG; i++ ) {
            String messageArgKey = String.format(MESSAGE_ARG_RESOURCE_KEY_FORMAT, validKey, i);
            String messageArgRefKey = rsc.getResource(messageArgKey);
            String messageArg = rsc.getResource(messageArgRefKey);
            if (StringUtils.isBlank(messageArg) && i < defaultMessageParams.length) {
                messageArg = defaultMessageParams[i].toString();
            }
            // 一覧形式のチェック且つ、埋め込みパラメータの0番目の時
            // If roop count is 0 and first of argument of message is not prefix of message,prefix message is added to argument of message
            if (i == 0 && messageArg.indexOf(this.msgPrefix) != 0) {
                messageArg = this.msgPrefix + messageArg;
            }
            messageArgList.add(messageArg);
        }
        // いらないリストを削る
        // Delete unnecessary value from message list
        // 最後から見てNULLにならなくなるまで削る
        // Delete until message list is null
        for (int i = messageArgList.size() - 1; i >= 0; i-- ) {
            String val = messageArgList.get(i);
            if (val != null) {
                break;
            }
            messageArgList.remove(i);
        }
        String[] messageArgs = messageArgList.toArray(new String[messageArgList.size()]);

        MessageDomain messageDomain = new MessageDomain(fullProperty, messageId, messageArgs);
        return messageDomain;

    }

    /**
     * プロパティの項目名を取得する
     * Get item name of property
     * <p>
     * プロパティの項目名を取得する
     * Get item name of property
     * </p>
     * 
     * @param property プロパティ名
     * @param property Property name
     * @return 項目名
     * @return Item name
     */
    private String getPropertyName(String property) {
        StringBuilder propertyName = new StringBuilder();
        // チェック対象のフィールド名をセット
        // Set field name of target validated
        propertyName.append(this.propertyNamePrefix);
        propertyName.append(property);

        return propertyName.toString();
    }

}
