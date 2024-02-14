/*
 * PROJECT：GSCM 共通機能群
 * PROJECT：GSCM Common Functions
 * 
 * MenuUtilクラス
 * MenuUtil Class
 * 
 * Version.
 * 1.0.1
 * 
 * Copyright (c) 2013 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.gscm.framework.util;

import java.util.List;

import com.globaldenso.ai.common.core.context.DensoContext;
import com.globaldenso.gscm.framework.business.domain.AbstractDomain;
import com.globaldenso.gscm.framework.business.domain.MenuDomain;
import com.globaldenso.gscm.framework.presentation.WindowInfoDomain;

/**
 * <p>
 * 画面ヘッダー向けメニュー情報クラス
 * Menu information class for window header
 * </p>
 * 
 * @author $Author: 10088DS01586 $
 */
public class MenuUtil {

    /**
     * デフォルトコンストラクタ。
     * Default constructor
     */
    private MenuUtil() {

    }

    /**
     * <p>
     * メニュー構築機能
     * Menu building function
     * </p>
     * 
     * @param context String コンテキストルート
     * @param context String Context root
     * @param topFlg String true トップ画面、falseトップ画面以外
     * @param topFlg String true is top window and false is other
     * @param windowId String ウィンドウID
     * @param windowId String Window ID
     * @return メニューHTML
     * @return Menu HTML
     */
    public static String getMenuHTML(String context, String topFlg, String windowId) {
        // 共通セッション情報から取得した利用可能画面情報を変換する
        // Convert available window information gotten from common session information
        WindowInfoDomain windowInfo = (WindowInfoDomain)DensoContext.get().getGeneralArea(windowId);
        CommonInfoDomain commonIfo = windowInfo.getCommonInfo();

        List<? extends AbstractDomain> listMenu = commonIfo.getAvailableMenu();
        return makeRootMenu(context, listMenu, topFlg).toString();
    }

    /**
     * <p>
     * メニュー構築機能
     * Menu building function
     * </p>
     * 
     * @param context String コンテキストルート
     * @param context String Context root
     * @param menuInfo MenuInfo メニューオブジェクト
     * @param menuInfo MenuInfo Menu information
     * @param topFlg String true トップ画面、falseトップ画面以外
     * @param topFlg String true is top window and false is other
     * @return メニューHTML
     * @return Menu HTML
     */
    private static StringBuffer makeRootMenu(String context,
        List<? extends AbstractDomain> menuInfo, String topFlg) {

        StringBuffer buf = new StringBuffer();

        if (menuInfo == null) {
            return buf;
        }

        // レベル0定義
        // Level variable
        int level = 1;

        buf.append("<ul class=\"gscm_mainmenu\">");
        buf.append("\r\n");
        for (AbstractDomain ad : menuInfo) {
            MenuDomain md = (MenuDomain)ad;

            buf.append(getLiTag(level));
            buf.append("\r\n");
            // aタグの生成
            // Create tag
            buf.append(makeActionPath(topFlg, context, md.getActionPath(), md.getScreenId(), md
                .getScreenNm(), md.getRole()));
            // Level1メニューの回数、呼び出す。
            // Execute for Level1 menu
            if (md.getParentInfo() != null) {
                buf.append(getUlTag());
                buf.append("\r\n");
                level++ ;
            } else {
                buf.append("</li>");
                buf.append("\r\n");
            }

            int pt = 0;
            if (md.getParentTotal() != null && !"".equals(md.getParentTotal().trim())) {
                pt = Integer.parseInt(md.getParentTotal());
            }
            if (pt > 0) {
                for (int i = 0; i < pt; i++ ) {
                    // レベル0定義を閉じる
                    // Close level variable
                    buf.append("</ul>");
                    buf.append("\r\n");
                    buf.append("</li>");
                    buf.append("\r\n");
                    level-- ;
                }
            }
        }

        buf.append("</ul>");
        buf.append("\r\n");

        return buf;

    }

    /**
     * Liタグの内容を返却する。
     * Return content of Li tag
     * <p>
     * Liタグの内容を返却する。
     * Return content of Li tag
     * </p>
     * 
     * @param level 階層
     * @param level Level
     * @return Liタグの内容
     * @return Content of Li tag
     */
    private static String getLiTag(int level) {
        return "<li class=\"gscm_off\" onmouseover=\"this.className='gscm_on';\">";
    }

    /**
     * Ulタグの内容を返却する。
     * Return content of UL tag
     * <p>
     * Ulタグの内容を返却する。
     * Return content of UL tag
     * </p>
     * 
     * @return Ulタグの内容
     * @return Content of UL tag
     */
    private static String getUlTag() {
        return "<ul class=\"subMenu\">";
    }

    /**
     * <p>
     * メニュー構築機能(aタグ部分)
     * Menu building function(a tag part)
     * </p>
     * 
     * @param topFlg String true トップ画面、falseトップ画面以外
     * @param topFlg String true is top window and false is other
     * @param context String コンテキストルート
     * @param context String Context root
     * @param actionPath String アクションパス
     * @param actionPath String Action path
     * @param actionName String アクション名(認可用文字列)
     * @param actionName String Action name(String for permission)
     * @param dispName String メニュー表示用文字列
     * @param dispName String String for menu display
     * @param role 役割
     * @param role Role
     * @return aタグHTML
     * @return a tag HTML
     */
    private static String makeActionPath(String topFlg, String context, String actionPath,
        String actionName, String dispName, String role) {

        StringBuffer buf = new StringBuffer();

        // Actionパスが設定されていない場合
        // Case of action path of argument and role of argument is null
        if (actionPath == null || role == null) {
            buf.append("<a href=\"javascript:void(0)\">");
            buf.append("\r\n");
        } else {
            // Actionパスが設定されている場合
            // Case of action path of argument and role of argument is not null
            buf.append("<a href=\"# \"");

            // トップ画面の場合
            // In case of top flag of argument is true
            if (topFlg.equals("true")) {

                buf.append("onclick=\"gscm.disp('");
            } else {
                buf.append("onclick=\"gscm.screenJump('");
            }
            buf.append(actionPath);
            buf.append("');return false;\" ");

            buf.append("name=\"");
            buf.append(actionName);
            buf.append("\"");
            buf.append("> ");
            buf.append("\r\n");
        }
        buf.append(dispName);
        buf.append("</a>");
        buf.append("\r\n");

        return buf.toString();

    }
}
