/*
 * PROJECT：GSCM 共通機能群
 * PROJECT：GSCM Common Functions
 * 
 * SearchMainMenuServiceの実装クラス
 * Implement Class of SearchMainMenuService
 * 
 * Version.
 * 1.0.0
 * 
 * Copyright (c) 2013 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.gscm.framework.business.service;

import java.util.List;
import java.util.Stack;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.gscm.framework.business.dao.MainMenuDao;
import com.globaldenso.gscm.framework.business.domain.AbstractDomain;
import com.globaldenso.gscm.framework.business.domain.MenuDomain;
import com.globaldenso.gscm.framework.business.domain.UserDomain;
import com.globaldenso.gscm.framework.util.SpringUtil;

/**
 * SearchMainMenuService のService実装クラスです。<BR>
 * Implement Class of Service for SearchMainMenuService<BR>
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class SearchMainMenuServiceImpl implements SearchMainMenuService {

    /**
     * デフォルトコンストラクタ。
     * Default constructor
     */
    public SearchMainMenuServiceImpl() {
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.mbom.business.service.SearchMainMenuService#search(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    public List<MenuDomain> search(AbstractDomain domain) throws ApplicationException {

        UserDomain searchUserDomain = null;

        if (domain instanceof UserDomain) {
            searchUserDomain = (UserDomain)domain;
        } else {
            throw new ApplicationException("");
        }
        MainMenuDao mainMenuDao = (MainMenuDao)SpringUtil.getBean("gscmMainMenuDao");
        List<MenuDomain> mainMenuList = mainMenuDao.searchByMainMenu(searchUserDomain);

        return convert(mainMenuList);
    }

    /**
     * メインメニュー構築
     * Construction of main menu
     * <p>
     * 取得したメニューの一覧を画面設定用に変換
     * Convert the list of getting menu into list for screen set
     * </p>
     * 
     * @param mainMenuList DBから取得したメニュー原単位
     * @param mainMenuList menu master from DB
     * @return メインメニュー
     * @return Main menu
     */
    private List<MenuDomain> convert(List<MenuDomain> mainMenuList) {

        // 親スタック（jsp側で、ul liタグを閉じる数の判断に必要）
        // Parents stack(Necessary for tne numerical judgment to close ul li tag in the jsp)
        Stack<String> parents = new Stack<String>();
        int listSize = mainMenuList.size();

        for (int i = 0; i < listSize; i++ ) {
            // 最後であれば
            // execute if listSize is equal to i
            if (i == listSize - 1) {
                // 親総数(ul liタグを閉じる数)の設定
                // Set for parents total number(number for closing ul li)
                mainMenuList.get(i).setParentTotal("" + parents.size());
                break;
            }
            String pId = mainMenuList.get(i).getParScreenId();
            String thisId = mainMenuList.get(i).getScreenId();
            String nextPId = mainMenuList.get(i + 1).getParScreenId();
            // 自分のIDが次の親ＩＤと同じであれば、自分は親
            // If itself ID is equal to the next parent ID,itself means parent stack
            if (thisId.equals(nextPId)) {
                // 親情報の設定(sizeでレベルを判断している)
                // Set the parent information(Judge the level by size)
                parents.push(thisId);
                mainMenuList.get(i).setParentInfo("" + parents.size());

                // 自分の親IDがNULL(トップレベル)ではなく、次の親ＩＤが自分の親ＩＤと異なれば、親を閉じる
                // If itself parent ID is not equal to NULL(top level) and the next parent ID is not eaqual to itself parent ID,clear the parent stack
            } else if (pId != null && !pId.equals(nextPId)) {
                // 次の親ＩＤがNULL(トップレベル)であれば、clear サイズを親総数に
                // If the next parent ID is equal to NULL(top level), clear the parent stack
                if (nextPId == null) {
                    mainMenuList.get(i).setParentTotal("" + parents.size());
                    parents.clear();
                } else {
                    // 次の親ＩＤが一致するまでpop popした数を親総数に
                    // While the next parent ID is equal to initial object of the parent stack,pop the parent stack.Set the number of the parent stack as total parent number.
                    int popCnt = 0;
                    while (parents.size() > 0 && !parents.peek().equals(nextPId)) {
                        parents.pop();
                        popCnt++ ;
                    }
                    mainMenuList.get(i).setParentTotal("" + popCnt);
                }
            }
            // 階層で絞る場合は、ここで、listから削除する処理をする。
            // When extracting on hierarchy,clear from mainMenuList
        }

        return mainMenuList;
    }

}
