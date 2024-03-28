package com.shaokao.util;

import com.shaokao.view.FoodListView;
import com.shaokao.view.MainFrame;

public class ViewAdapter {
    public static MainFrame mainFrame;

    public ViewAdapter(MainFrame mainFrame) {
        ViewAdapter.mainFrame=mainFrame;
    }

    public static void toFoodList() {
//        if (mainFrame)
        FoodListView foodListView = new FoodListView();
        if (!mainFrame.views.containsKey("foodList")) {
            mainFrame.views.put("foodList",foodListView);
            mainFrame.container.add(foodListView,"foodList");
        }
        mainFrame.cardLayout.show(mainFrame.container,"foodList");

    }
}
