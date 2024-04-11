package com.shaokao.listener;

import com.shaokao.entity.User;
import com.shaokao.view.LoginView;
import com.shaokao.view.MainFrame;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class LoginAction implements ActionListener {
    public MainFrame mainFrame;
    public static ArrayList<User> userlist = new ArrayList<>();
    static {
        userlist.add(new User(null, "jack", "123456"));
    }
    public LoginAction(MainFrame mainFrame) {
        this.mainFrame = mainFrame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //1.登录校验
        boolean islogin=false;
        LoginView loginView = (LoginView) mainFrame.views.get("login");
        String userName = loginView.userInput.getText();
        String passwd = String.valueOf(loginView.passInput.getPassword());
        User user = new User(null, userName, passwd);
        for (User user1 : userlist) {
            if (user1.equals(user)) {
                islogin=true;
            }
        }

        //2.成功时，跳转至菜品一栏界面
        if (islogin) {
            mainFrame.viewAdapter.toFoodList();
        }else {
            loginView.msg.setText("账号或密码错误，请重新输入！！！");
            loginView.msg.setForeground(Color.RED);
        }
    }
}
