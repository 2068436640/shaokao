package com.shaokao.view;

import com.shaokao.listener.MenuAction;

import javax.swing.*;

public class MenuBar extends JMenuBar {
    public final static String[][] MENU_TXT= {
            {"菜品管理","菜品一栏;FoodList","新增菜品;FoodAdd"},
            {"订单管理","订单一栏;OrderList","新增订单;OrderAdd"},
            {"用户管理","用户注册;Register","退出登录;Logout"}
    };
    public MainFrame mainFrame;
    public MenuBar(MainFrame mainFrame){
        this.mainFrame = mainFrame;
        MenuAction menuAction = new MenuAction(mainFrame);
        for (String[] menutxt : MENU_TXT){
            JMenu menu = new JMenu(menutxt[0]);
            for (int i = 1; i < menutxt.length; i++) {
                String[] txt = menutxt[i].split(";");
                JMenuItem item = new JMenuItem(txt[0]);
                //1.设置菜单项命令
                item.setActionCommand(txt[1]);
                //2.绑定菜单项监听器
                item.addActionListener(menuAction);
                menu.add(item);
            }
            this.add(menu);
        }
    }
}
