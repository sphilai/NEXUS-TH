/*
 * PROJECT：GSCM 共通機能群
 * PROJECT：GSCM Common Functions
 * 
 * NullSkipActionMessagesクラス
 * NullSkipActionMessages Class
 * 
 * Version.
 * 1.0.0
 * 
 * Copyright (c) 2013 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.gscm.framework.presentation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;

/**
 * メッセージのループ処理でメッセージ・キーがnullのActionMessageをスキップするための
 * ActionMessagesクラスです。
 * ActionMessage class for skip ActionMessage whose message key is null at message loop process
 *
 * <p>
 * メッセージ出力処理において、
 * メッセージ・キーがnullのActionMessageを対象にすると、余分な空行が表示されるため、
 * これらのメッセージを処理の対象外とします。
 * At message output process, when make ActionMessage whose message key is null be target,
 * display unnecessary blank line.
 * Make these message be out of target
 * </p>
 * <p>
 * メッセージ・キーがnullなActionMessageは、相関チェックなど、ある一つのエラーが
 * 複数の項目に関係する場合にそれらの項目のCSSスタイルを変更するために必要となりますが、
 * メッセージの出力処理においては不要であるため、こういったメッセージが対象とならないようにします。
 * When a message like correlation validating and others is related multi-items,
 * ActionMessage whose message key is null is necessary for changing CSS style.
 * But because it is not necessary at message output process,make these messages be out of target
 * </p>
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class NullSkipActionMessages extends ActionMessages {

    /**
     * シリアル・バージョンUIDです。
     * serialVersionUID
     */
    private static final long serialVersionUID = 1L;

    /**
     * デフォルトコンストラクタです。
     * Default constructor
     */
    public NullSkipActionMessages() {
    }

    /**
     * {@inheritDoc}
     * @see org.apache.struts.action.ActionMessages#get()
     */
    @Override
    @SuppressWarnings("unchecked")
    public Iterator get() {
        return getValidMessages().iterator();
    }

    /**
     * {@inheritDoc}
     * @see org.apache.struts.action.ActionMessages#size()
     */
    @Override
    public int size() {
        return getValidMessages().size();
    }

    /**
     * キーが非nullなActionMessageのリストを返します。
     * Return ActionMessage list whose key is not null
     *
     * @return キーが非nullなActionMessageのリスト
     * @return ActionMessage list whose key is not null
     */
    @SuppressWarnings("unchecked")
    private List<ActionMessage> getValidMessages() {

        List<ActionMessage> messages = new ArrayList<ActionMessage>();
        for (Iterator i = super.get(); i.hasNext();) {
            ActionMessage message = (ActionMessage)i.next();
            if (message.getKey() != null) {
                messages.add(message);
            }
        }
        return messages;
    }
}
