package com.shaokao.view;

import javax.swing.*;

public class RegisterView extends JPanel {
    public JLabel userText;
    public JLabel passText;
    public JLabel repassText;
    public JTextField userInput;
    public JPasswordField passInput;
    public JPasswordField repassInput;
    public JButton registerBut;
    public JButton resetBut;

    public RegisterView() {
        /*1.实例化界面组件*/
        userText = new JLabel("账号：");
        passText  = new JLabel("密码：");
        repassText  = new JLabel("重复密码：");
        userInput = new JTextField();
        passInput = new JPasswordField();
        repassInput = new JPasswordField();
        registerBut = new JButton("注册");
        resetBut = new JButton("重置");

        /*2.设置组件位置*/
        this.setLayout(null);
        userText.setBounds(250,50,50,36);
        passText.setBounds(250,100,50,36);
        repassText.setBounds(225,150,70,36);
        userInput.setBounds(300,50,300,36);
        passInput.setBounds(300,100,300,36);
        repassInput.setBounds(300,150,300,36);
        registerBut.setBounds(275,200,300,36);
        resetBut.setBounds(275,250,300,36);

        /*3.将组件添加至容器*/
        this.add(userText);
        this.add(passText);
        this.add(repassText);
        this.add(userInput);
        this.add(passInput);
        this.add(repassInput);
        this.add(registerBut);
        this.add(resetBut);
    }
}
