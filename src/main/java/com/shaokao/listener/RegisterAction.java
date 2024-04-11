package com.shaokao.listener;

import com.shaokao.view.MainFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegisterAction implements ActionListener {
    public MainFrame mainFrame;

    public RegisterAction(MainFrame mainFrame) {
        this.mainFrame = mainFrame;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        mainFrame.viewAdapter.toRegister();
    }
}
