package com.shaokao.listener;

import com.shaokao.view.MainFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuAction implements ActionListener {
    public MainFrame mainFrame;

    public MenuAction(MainFrame mainFrame) {
        this.mainFrame = mainFrame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if ("FoodList".equals(command)){
            mainFrame.viewAdapter.toFoodList();
        } else if ("FoodAdd".equals(command)) {
            mainFrame.viewAdapter.toFoodAdd();
        }else if ("OrderList".equals(command)) {
            mainFrame.viewAdapter.toOrderList();
        }else if ("OrderAdd".equals(command)) {
            mainFrame.viewAdapter.toOrderAdd();
        }else if ("Logout".equals(command)) {
            mainFrame.viewAdapter.toLogout();
        } else if ("Register".equals(command)) {
            mainFrame.viewAdapter.toRegister();
        }
    }
}
