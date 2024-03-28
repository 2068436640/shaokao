package com.shaokao.listener;

import com.shaokao.view.MainFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class loginAction implements ActionListener {
    MainFrame mainFrame;

    public loginAction(MainFrame mainFrame) {
        this.mainFrame = mainFrame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
//        登录校验

//        页面跳转
        mainFrame.viewAdapter.toFoodList();

    }
}
