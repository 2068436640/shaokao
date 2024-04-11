package com.shaokao.view;

import javax.swing.*;

public class FoodAddView extends JPanel {
    public JLabel nameText;
    public JLabel categoryText;
    public JLabel priceText;
    public JTextField nameInput;
    public JTextField categoryInput;
    public JTextField priceInput;
    public JButton addBut;
    public JButton cancelBut;

    public FoodAddView() {
        /*1.实例化界面组件*/
        nameText = new JLabel("菜品名称：");
        categoryText  = new JLabel("菜品分类：");
        priceText  = new JLabel("菜品价格：");
        nameInput = new JTextField();
        categoryInput = new JTextField();
        priceInput = new JTextField();
        addBut = new JButton("添加");
        cancelBut = new JButton("取消");

        /*2.设置组件位置*/
        this.setLayout(null);
        nameText.setBounds(230,50,100,36);
        categoryText.setBounds(230,100,100,36);
        priceText.setBounds(230,150,100,36);
        nameInput.setBounds(300,50,300,36);
        categoryInput.setBounds(300,100,300,36);
        priceInput.setBounds(300,150,300,36);
        addBut.setBounds(265,200,300,36);
        cancelBut.setBounds(265,250,300,36);

        /*3.将组件添加至容器*/
        this.add(nameText);
        this.add(categoryText);
        this.add(priceText);
        this.add(nameInput);
        this.add(categoryInput);
        this.add(priceInput);
        this.add(addBut);
        this.add(cancelBut);
    }
}
