package com.shaokao.view;

import javax.swing.*;

public class MenuBar extends JMenuBar {
    public static final String[][] MENU_txt = new String[][]{
            {"菜品管理", "菜品一览", "新增菜品"},
            {"订单管理", "订单一览", "新增订单"},
            {"人员管理", "退出登录"},
    };

    public MenuBar() {
        super();
        for (String[] menu : MENU_txt) {
            JMenu jMenu = new JMenu(menu[0]);
            for (int i = 1; i < menu.length; i++) {
                JMenuItem item = new JMenu(menu[i]);
                jMenu.add(item);
            }
            this.add(jMenu);
        }
    }
}
