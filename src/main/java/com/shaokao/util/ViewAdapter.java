package com.shaokao.util;

import com.shaokao.view.*;

public class ViewAdapter {
    public static MainFrame mainFrame;

    public ViewAdapter(MainFrame mainFrame) {
        this.mainFrame = mainFrame;
    }
    //注册
    public void toRegister(){
        if (!mainFrame.views.containsKey("register")){
            //创建菜品一览界面
            RegisterView registerView = new RegisterView();
            //并添加到视图库中，
            mainFrame.views.put("register",registerView);
            // 添加到主容器中，
            mainFrame.container.add(registerView,"register");
        }
        //使用卡片布局管理器显示页面
        mainFrame.cardLayout.show(mainFrame.container,"register");
    }
    //菜品一览
    public void toFoodList(){
        if (!mainFrame.views.containsKey("foodList")){
            //创建菜品一览界面
            FoodListView foodListView = new FoodListView(mainFrame);
            //并添加到视图库中，
            mainFrame.views.put("foodList",foodListView);
            // 添加到主容器中，
            mainFrame.container.add(foodListView,"foodList");
        }
        //使用卡片布局管理器显示页面
        mainFrame.cardLayout.show(mainFrame.container,"foodList");
    }
    //菜品新增
    public void toFoodAdd(){
        if (!mainFrame.views.containsKey("foodAdd")){
            //创建菜品一览界面
            FoodAddView foodAddView = new FoodAddView();
            //并添加到视图库中，
            mainFrame.views.put("foodAdd",foodAddView);
            // 添加到主容器中，
            mainFrame.container.add(foodAddView,"foodAdd");
        }
        //使用卡片布局管理器显示页面
        mainFrame.cardLayout.show(mainFrame.container,"foodAdd");
    }
    //菜品修改
    public void toFoodModify(){
        if (!mainFrame.views.containsKey("foodModify")){
            //创建菜品一览界面
            FoodModifyView foodModifyView = new FoodModifyView();
            //并添加到视图库中，
            mainFrame.views.put("foodModify",foodModifyView);
            // 添加到主容器中，
            mainFrame.container.add(foodModifyView,"foodModify");
        }
        //使用卡片布局管理器显示页面
        mainFrame.cardLayout.show(mainFrame.container,"foodModify");
    }
    //订单一览
    public void toOrderList() {
        if (!mainFrame.views.containsKey("orderList")){
            //创建菜品一览界面
            OrderListView orderListView = new OrderListView();
            //并添加到视图库中，
            mainFrame.views.put("orderList",orderListView);
            // 添加到主容器中，
            mainFrame.container.add(orderListView,"orderList");
        }
        //使用卡片布局管理器显示页面
        mainFrame.cardLayout.show(mainFrame.container,"orderList");
    }
    //新增订单
    public void toOrderAdd() {
        if (!mainFrame.views.containsKey("orderAdd")){
            //创建菜品一览界面
            OrderAddView orderAddView = new OrderAddView();
            //并添加到视图库中，
            mainFrame.views.put("orderAdd",orderAddView);
            // 添加到主容器中，
            mainFrame.container.add(orderAddView,"orderAdd");
        }
        //使用卡片布局管理器显示页面
        mainFrame.cardLayout.show(mainFrame.container,"orderAdd");
    }
    //退出登录
    public void toLogout() {
        if (!mainFrame.views.containsKey("login")){
            //创建菜品一览界面
            LoginView loginView = new LoginView(mainFrame);
            //并添加到视图库中，
            mainFrame.views.put("login",loginView);
            // 添加到主容器中，
            mainFrame.container.add(loginView,"login");
        }
        //使用卡片布局管理器显示页面
        mainFrame.cardLayout.show(mainFrame.container,"login");
    }

}
