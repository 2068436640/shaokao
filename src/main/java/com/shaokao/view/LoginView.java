package com.shaokao.view;

import com.shaokao.listener.loginAction;

import javax.swing.*;

public class LoginView extends JPanel {
    public JLabel userText, passText;
    public JTextField userInput, passInput;
    public JButton loginBtn, registBtn;
    MainFrame mainFrame;

    public LoginView(MainFrame mainFrame) {
        /*
        实例化
         */
        this.mainFrame = mainFrame;
        userText = new JLabel("账号：");
        passText = new JLabel("密码");
        userInput = new JTextField();
        passInput = new JPasswordField();
        loginBtn = new JButton("登录");
        registBtn = new JButton("注册");
        /*
    设置组件位置
         */
        this.setLayout(null);
        userText.setBounds(200, 50, 50, 36);
        passText.setBounds(200, 100, 50, 36);
        userInput.setBounds(250, 50, 300, 36);
        passInput.setBounds(250, 100, 300, 36);
        loginBtn.setBounds(250, 150, 300, 36);
        registBtn.setBounds(250, 190, 300, 36);

        /*
        将组件添加至容器
         */
        this.add(userText);
        this.add(userInput);
        this.add(passText);
        this.add(passInput);
        this.add(loginBtn);
        this.add(registBtn);
        loginBtn.addActionListener(new loginAction(mainFrame));

    }


}
