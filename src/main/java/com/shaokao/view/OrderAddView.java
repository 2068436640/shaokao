package com.shaokao.view;

import javax.swing.*;
import java.awt.*;

public class OrderAddView extends JPanel {
    public JPanel optionPanel1;
    public JPanel optionPanel2;
    public JLabel deskNumTxt;
    public JTextField deskNumInput;
    public JButton findBtn;
    public JButton submitBtn;
    public JButton addInOrderBtn;
    public JButton deleteFromOrderBtn;

    public JScrollPane dataPanel1;
    public JScrollPane dataPanel2;
    public JTable orderListTable1;
    public JTable orderListTable2;

    public String [][] values1={
            {"000001","烈火牛肉","烧烤",},
            {"000001","烈火牛肉","烧烤",},
            {"000001","烈火牛肉","烧烤",},
            {"000001","烈火牛肉","烧烤",},
            {"000001","烈火牛肉","烧烤",},
            {"000001","烈火牛肉","烧烤",},
            {"000001","烈火牛肉","烧烤",},
            {"000001","烈火牛肉","烧烤",}
    };
    public String[] colnames1={"订单编号","订单价格","订单状态"};
    public String [][] values2={
            {"000001","烈火牛肉","烧烤","38"},
            {"000001","烈火牛肉","烧烤","38"},
            {"000001","烈火牛肉","烧烤","38"},
            {"000001","烈火牛肉","烧烤","38"},
            {"000001","烈火牛肉","烧烤","38"},
            {"000001","烈火牛肉","烧烤","38"},
            {"000001","烈火牛肉","烧烤","38"},
            {"000001","烈火牛肉","烧烤","38"}
    };
    public String[] colnames2={"菜品编号","菜品名称","菜品分类","菜品价格"};
    public OrderAddView(){
        //设置布局管理器为边框管理器
        this.setLayout(new BorderLayout());
        //实例化界面组件
        optionPanel1 = new JPanel();
        optionPanel2 = new JPanel();
        dataPanel1 = new JScrollPane();
        dataPanel2 = new JScrollPane();
        deskNumTxt = new  JLabel("桌号：");
        deskNumInput = new JTextField();
        //设置一下输入框大小
        deskNumInput.setPreferredSize(new Dimension(150,27));

        optionPanel2.setLayout(new FlowLayout());

        findBtn = new JButton("查询");
        submitBtn = new JButton("提交订单");
        addInOrderBtn = new JButton("删除选中的订单");
        deleteFromOrderBtn = new JButton("从订单中删除");
        orderListTable1 = new JTable(values1,colnames1);
        orderListTable2 = new JTable(values2,colnames2);

        orderListTable1.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        orderListTable2.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        dataPanel1.setPreferredSize(new Dimension(250,0));
        dataPanel2.setPreferredSize(new Dimension(320,0));

        dataPanel1.add(orderListTable1);
        dataPanel2.add(orderListTable2);
        dataPanel1.setViewportView(orderListTable1);
        dataPanel2.setViewportView(orderListTable2);


        //将两个北中组件添加至容器JPanel里
        this.add(optionPanel1,BorderLayout.NORTH);
        this.add(optionPanel2,BorderLayout.CENTER);
        this.add(dataPanel1,BorderLayout.EAST);
        this.add(dataPanel2,BorderLayout.WEST);

        optionPanel1.add(deskNumTxt);
        optionPanel1.add(deskNumInput);
        optionPanel1.add(findBtn);
        optionPanel1.add(submitBtn);
        optionPanel2.add(addInOrderBtn);
        optionPanel2.add(deleteFromOrderBtn);

    }
}

