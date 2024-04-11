package com.shaokao.view;

import javax.swing.*;


public class OrderModifyView extends JPanel {
    //6个组件
    public  JLabel orderNumTxt;
    public  JLabel foodNameTxt;
    public  JLabel orderTotalPriceTxt;
    public  JLabel orderStatusTxt;
    public  JTextField orderNumInput;
    public JTextField foodnameInput;
    public JTextField orderTotalPriceInput;
    public JRadioButton orderStatusBtn1;
    public JRadioButton orderStatusBtn2;
    public JButton modifyBtn;
    public JButton cancelBtn;
    public OrderModifyView(){
        //实例化界面组件
        orderNumTxt = new  JLabel("桌号：");
        foodNameTxt = new  JLabel("菜品名称：");
        orderTotalPriceTxt = new JLabel("订单总价：");
        orderStatusTxt = new JLabel("订单状态：");
        orderNumInput = new JTextField();
        foodnameInput = new JTextField();
        orderTotalPriceInput = new JTextField();
        orderStatusBtn1 = new JRadioButton("未结账");
        orderStatusBtn2 = new JRadioButton("已结账");
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(orderStatusBtn1);
        buttonGroup.add(orderStatusBtn2);
        modifyBtn = new JButton("修改");
        cancelBtn = new JButton("取消");
        //设置组件位置
        this.setLayout(null);
        orderNumTxt.setBounds(230,50 ,80 , 35 );
        foodNameTxt.setBounds(230, 90, 80, 35);
        orderTotalPriceTxt.setBounds(230, 130, 80, 35);
        orderStatusTxt.setBounds(230, 170, 80, 35);
        orderNumInput.setBounds(330, 50, 250, 35);
        foodnameInput.setBounds(330, 90, 250, 35);
        orderTotalPriceInput.setBounds(330, 130, 250, 35);
        orderStatusBtn1.setBounds(350, 170, 100, 35);
        orderStatusBtn2.setBounds(500, 170, 100, 35);
        modifyBtn.setBounds(350, 210,80 ,35 );
        cancelBtn.setBounds(470, 210,80 ,35 );


        //将组件添加至容器JPanel里
        this.add(orderNumTxt);
        this.add(foodNameTxt);
        this.add(orderTotalPriceTxt);
        this.add(orderStatusTxt);
        this.add(orderNumInput);
        this.add(foodnameInput);
        this.add(orderTotalPriceInput);
        this.add(orderStatusBtn1);
        this.add(orderStatusBtn2);
        this.add(modifyBtn);
        this.add(cancelBtn);
    }

}
