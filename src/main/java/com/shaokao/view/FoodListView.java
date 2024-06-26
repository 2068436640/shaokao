package com.shaokao.view;

import com.shaokao.listener.FoodModifyAction;

import javax.swing.*;
import java.awt.*;

public class FoodListView extends JPanel {
    public JPanel optionPanel;
    public JLabel keyWordText;
    public JTextField keywordInput;
    public JButton findBut;
    public JButton modifyBut;
    public JButton deleteBut;

    public JScrollPane dataPanel;
    public JTable foodlistTable;
    public MainFrame mainFrame;

    public String[][] values = {
            {"0001","烈火牛肉","烧烤","68.00"},
            {"0002","烈火牛肉","烧烤","68.00"},
            {"0003","烈火牛肉","烧烤","68.00"},
            {"0004","烈火牛肉","烧烤","68.00"},
            {"0005","烈火牛肉","烧烤","68.00"}
    };
    public String[] colnames = {"菜品编号","菜品名称","菜品分类","菜品价格"};
    public FoodListView(MainFrame mainFrame) {
        /*0.设置布局管理器为边框布局管理器*/
        this.setLayout(new BorderLayout());
        /*1.实例化组件*/
        optionPanel = new JPanel();
        keyWordText = new JLabel("关键词");
        keywordInput = new JTextField("请输入菜品名");
        keywordInput.setPreferredSize(new Dimension(300,27));
        findBut = new JButton("查询");
        modifyBut = new JButton("修改选中菜品");
        deleteBut = new JButton("删除选中菜品");

        dataPanel = new JScrollPane();
        foodlistTable = new JTable(values,colnames);

        this.mainFrame = mainFrame;

        /*1.1给修改选中菜品按钮添加事件监听器*/
        modifyBut.addActionListener(new FoodModifyAction(mainFrame));

        /*2.设置组件位置*/
        optionPanel.add(keyWordText);
        optionPanel.add(keywordInput);
        optionPanel.add(findBut);
        optionPanel.add(modifyBut);
        optionPanel.add(deleteBut);

        dataPanel.add(foodlistTable);
        dataPanel.setViewportView(foodlistTable);

        /*3.将组件添加至容器*/
        this.add(optionPanel,BorderLayout.NORTH);
        this.add(dataPanel,BorderLayout.CENTER);
    }
}
