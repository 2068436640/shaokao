package com.shaokao.view;

import com.shaokao.listener.LoginAction;
import com.shaokao.listener.RegisterAction;

import javax.swing.*;

public class LoginView extends JPanel {
    /* 声明登录界面的组件*/
    public JLabel userText;
    public JLabel passText;
    public JTextField userInput;
    public JPasswordField passInput;
    public JButton loginBut;
    public JButton resetBut;
    public MainFrame mainFrame;

    public LoginView(MainFrame mainFrame) {
        /*1.实例化界面组件*/
         userText = new JLabel("账号：");
         passText  = new JLabel("密码：");
         userInput = new JTextField();
         passInput = new JPasswordField();
         loginBut = new JButton("登录");
         resetBut = new JButton("注册");

         this.mainFrame = mainFrame;

         /*1.1给loginView绑定事件监听器 */
         loginBut.addActionListener(new LoginAction(mainFrame));
         resetBut.addActionListener(new RegisterAction(mainFrame));

         /*2.设置组件位置*/
        this.setLayout(null);
        userText.setBounds(250,100,50,36);
        passText.setBounds(250,150,50,36);
        userInput.setBounds(300,100,300,36);
        passInput.setBounds(300,150,300,36);
        loginBut.setBounds(275,200,300,36);
        resetBut.setBounds(275,250,300,36);

        /*3.将组件添加至容器*/
        this.add(userText);
        this.add(passText);
        this.add(userInput);
        this.add(passInput);
        this.add(loginBut);
        this.add(resetBut);
    }
}
