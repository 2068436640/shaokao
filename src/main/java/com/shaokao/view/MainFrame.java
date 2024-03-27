package com.shaokao.view;

import com.jgoodies.looks.plastic.PlasticLookAndFeel;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private static final int width = 800;
    private static final int height = 500;

    public MainFrame() throws HeadlessException {

//        设置尺寸
        this.setSize(width, height);
//        加载菜单栏
        MenuBar menuBar = new MenuBar();
        this.setJMenuBar(menuBar);
//        加载主页面 登录视图
//        创建登录页面实例
//        LoginView loginView = new LoginView();
//        将登陆页面添加到窗口页
//        this.getContentPane().add(loginView);
        FoodListView view = new FoodListView();
        this.add(view);
//        设置关闭动作
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//        设置标题
        this.setTitle("烧烤店管理系统");
//        设置窗口大小不可变
        this.setResizable(false);
//        设置窗口可见性
        this.setVisible(true);

    }


    public static void main(String[] args) {

            try {
                UIManager.setLookAndFeel(new PlasticLookAndFeel());
            } catch (Exception e) {
                e.printStackTrace();
            }
            SwingUtilities.invokeLater(() -> {
                // 创建并显示你的 Swing 应用程序
                MainFrame mf = new MainFrame();
            });

    }
}
