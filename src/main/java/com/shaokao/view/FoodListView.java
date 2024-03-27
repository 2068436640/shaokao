package com.shaokao.view;

import javax.swing.*;
import java.awt.*;

public class FoodListView extends JPanel {
    JPanel optionJPanel;
    public JLabel keywordText;
    public JTextField keywordInput;
    JButton findBtn,modifyBtn,DelBtn;
    public JScrollPane dataPane;
    JTable foodListTable;
    public String[][] values = {
            {"001", "烈火牛牛", "红烧", "80"},
            {"001", "烈火牛牛", "红烧", "80"},
            {"001", "烈火牛牛", "红烧", "80"},
            {"001", "烈火牛牛", "红烧", "80"},
            {"001", "烈火牛牛", "红烧", "80"},
            {"001", "烈火牛牛", "红烧", "80"},
    };
    String[] cols ={"菜品编号","菜品名称","菜品分类","菜品价格"};
    public FoodListView() {
        optionJPanel = new JPanel();
        keywordInput = new JTextField();
        keywordInput.setPreferredSize(new Dimension(300,27));
        keywordText = new JLabel("关键词");
        findBtn = new JButton("查询");
        modifyBtn = new JButton("修改选中菜品");
        DelBtn = new JButton("删除选中菜品");
        dataPane = new JScrollPane();
        foodListTable = new JTable(values, cols);

        optionJPanel.add(keywordText);
        optionJPanel.add(keywordInput);
        optionJPanel.add(findBtn);
        optionJPanel.add(modifyBtn);
        optionJPanel.add(DelBtn);

        dataPane.add(foodListTable);
        dataPane.setViewportView(foodListTable);

        this.add(optionJPanel, BorderLayout.NORTH);
        this.add(dataPane, BorderLayout.CENTER);

    }
}
