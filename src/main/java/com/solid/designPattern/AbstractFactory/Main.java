package com.solid.designPattern.AbstractFactory;

import com.solid.designPattern.AbstractFactory.Factory.DarkModeUiFactory;

public class Main {
    public static void main(String[] args) {

        ThemeSelection themeSelection = new ThemeSelection("Light");
        themeSelection.GetUI();
    }
}
