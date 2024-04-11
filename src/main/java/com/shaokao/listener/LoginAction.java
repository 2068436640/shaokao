package com.shaokao.listener;

import com.shaokao.view.MainFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginAction implements ActionListener {
    public MainFrame mainFrame;

    public LoginAction(MainFrame mainFrame) {
        this.mainFrame = mainFrame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //1.登录校验

        //2.成功时，跳转至菜品一栏界面
        mainFrame.viewAdapter.toFoodList();
    }
}
