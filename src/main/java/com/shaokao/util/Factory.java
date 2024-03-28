package com.shaokao.util;

import com.shaokao.view.MainFrame;

public class Factory {
    private static final MainFrame mainFrame = new MainFrame();
    public static MainFrame MainFrameFactory(){
        return mainFrame;
    }
}
