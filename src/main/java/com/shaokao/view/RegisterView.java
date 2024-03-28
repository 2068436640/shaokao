package com.shaokao.view;

import javax.swing.*;
import java.awt.*;

public class RegisterView extends JPanel {
    public JLabel userText, passText,repassText,msg;
    JButton registBtn,resetBtn;
    TextField userNameInput,PassInput,rePassInput;

    public RegisterView() {
        userText = new JLabel("账号");
        passText = new JLabel("密码");
        repassText = new JLabel("确认密码：");
        registBtn = new JButton("注册");
        resetBtn = new JButton("重置");
        msg = new JLabel();
        userNameInput = new TextField();
        PassInput = new TextField();
        rePassInput = new TextField();

        this.setLayout(null);
        userText.setBounds(200, 50, 50, 36);
        passText.setBounds(200, 100, 50, 36);
        repassText.setBounds(200,150,50,36);
        userNameInput.setBounds(250, 50, 300, 36);
        PassInput.setBounds(250, 100, 300, 36);
        rePassInput.setBounds(250,150,300,36);
        msg.setBounds(300,190,100,36);
        registBtn.setBounds(250, 230, 300, 36);
        resetBtn.setBounds(250, 270, 300, 36);
        this.add(userText);
        this.add(userNameInput);
        this.add(passText);
        this.add(PassInput);
        this.add(repassText);
        this.add(rePassInput);
        this.add(msg);
        this.add(new JLabel());
        this.add(registBtn);
        this.add(resetBtn);
    }
}
