package com.shaokao.listener;

import com.shaokao.view.MainFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FoodModifyAction implements ActionListener {
    public MainFrame mainFrame;

    public FoodModifyAction(MainFrame mainFrame) {
        this.mainFrame = mainFrame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        //页面跳转
        mainFrame.viewAdapter.toFoodModify();
    }
}
