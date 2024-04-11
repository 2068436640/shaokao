package com.shaokao.view;

import javax.swing.*;
import java.awt.*;

public class OrderListView extends JPanel {
    public JPanel optionPanel;
    public JLabel keyWordText;
    public JTextField keywordInput;
    public JButton findBut;
    public JButton modifyBut;
    public JButton deleteBut;
    public JButton buyBut;

    public JScrollPane dataPanel;
    public JTable orderlistTable;

    public String[][] values = {
            {"1","168.00","未结账"},
            {"1","168.00","未结账"},
            {"1","168.00","未结账"},
            {"1","168.00","未结账"},
            {"1","168.00","未结账"}

    };
    public String[] colnames = {"桌号","订单总价","订单状态"};
    public OrderListView() {
        /*0.设置布局管理器为边框布局管理器*/
        this.setLayout(new BorderLayout());
        /*1.实例化组件*/
        optionPanel = new JPanel();
        keyWordText = new JLabel("关键词");
        keywordInput = new JTextField("请输入菜品名");
        keywordInput.setPreferredSize(new Dimension(300,27));
        findBut = new JButton("查询");
        modifyBut = new JButton("修改选中订单");
        deleteBut = new JButton("删除选中订单");
        buyBut = new JButton("订单结账");

        dataPanel = new JScrollPane();
        orderlistTable = new JTable(values,colnames);

        /*2.设置组件位置*/
        optionPanel.add(keyWordText);
        optionPanel.add(keywordInput);
        optionPanel.add(findBut);
        optionPanel.add(modifyBut);
        optionPanel.add(deleteBut);
        optionPanel.add(buyBut);

        dataPanel.add(orderlistTable);
        dataPanel.setViewportView(orderlistTable);

        /*3.将组件添加至容器*/
        this.add(optionPanel,BorderLayout.NORTH);
        this.add(dataPanel,BorderLayout.CENTER);
    }
}
