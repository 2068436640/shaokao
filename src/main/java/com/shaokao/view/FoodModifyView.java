package com.shaokao.view;

import javax.swing.*;
import java.awt.*;

public class FoodModifyView extends JPanel {
    public JLabel foodName, classify,price;
    JButton modifyBtn,closeBtn;
    TextField foodNameInput,classifyInput,priceInput;
    public FoodModifyView() {
        foodName = new JLabel("菜品名称");
        classify = new JLabel("菜品分类");
        price = new JLabel("菜品价格");
        modifyBtn = new JButton("修改");
        closeBtn = new JButton("取消");
        foodNameInput = new TextField();
        classifyInput = new TextField();
        priceInput = new TextField();

        this.setLayout(null);
        foodName.setBounds(200, 50, 50, 36);
        classify.setBounds(200, 100, 50, 36);
        price.setBounds(200,150,50,36);
        foodNameInput.setBounds(250, 50, 300, 36);
        classifyInput.setBounds(250, 100, 300, 36);
        priceInput.setBounds(250,150,300,36);
        modifyBtn.setBounds(250, 190, 300, 36);
        closeBtn.setBounds(250, 230, 300, 36);

        this.add(foodName);
        this.add(foodNameInput);
        this.add(classify);
        this.add(classifyInput);
        this.add(price);
        this.add(priceInput);
        this.add(modifyBtn);
        this.add(closeBtn);
    }
}
