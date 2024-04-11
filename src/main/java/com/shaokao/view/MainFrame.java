package com.shaokao.view;

import com.shaokao.util.ViewAdapter;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class MainFrame extends JFrame {
    private static final int WIDTH = 800;
    private static final int HEIGHT = 500;
    public Container container;
    public CardLayout cardLayout;
    public ViewAdapter viewAdapter;
    public Map<String, Object> views = new HashMap<>();
    public MainFrame() throws HeadlessException {
        //1.设置窗体的尺寸；宽和高
        this.setSize(WIDTH,HEIGHT);
        //2.加载菜单栏
        //2.1创建菜单的对象（实例）
        MenuBar menuBar = new MenuBar(this);
        //2.2将菜单对象设置到窗体
        this.setJMenuBar(menuBar);
        //2.3为主界面赋值
        container = this.getContentPane();
        //2.4为主容器设置卡片布局管理器
        cardLayout = new CardLayout();
        container.setLayout(cardLayout);
        //2.5创建界面跳转适配器
        viewAdapter = new ViewAdapter(this);
        //3.加载主界面 登录视图
        //3.1创建登录界面的实例
        //3.2将登录对象添加到窗体
        //3.2.1新建
        LoginView loginView = new LoginView(this);
        //3.2.2入库
        container.add(loginView,"login");
        //3.2.3加入主容器
        views.put("login",loginView);
        //3.2.4显示
        cardLayout.show(container,"login");

        //设置窗体标题
        this.setTitle("烧烤店管理系统");
        //设置窗体的关闭动作
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //设置窗体的不可变更尺寸
        this.setResizable(false);
        //设置窗体的可见性
        this.setVisible(true);
    }

    public static void main(String[] args) {
        MainFrame mf = new MainFrame();
    }
}
