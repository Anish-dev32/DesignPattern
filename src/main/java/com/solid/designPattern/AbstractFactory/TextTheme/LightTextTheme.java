package com.solid.designPattern.AbstractFactory.TextTheme;

public class LightTextTheme implements TextTheme{
    @Override
    public String getThemeColor() {
        return "White Text";
    }
}
