package com.solid.designPattern.AbstractFactory.TextTheme;

public class DarkTextTheme implements TextTheme{
    @Override
    public String getThemeColor() {
        return "Black Text";
    }
}
