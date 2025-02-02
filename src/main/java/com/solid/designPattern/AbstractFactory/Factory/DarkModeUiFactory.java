package com.solid.designPattern.AbstractFactory.Factory;

import com.solid.designPattern.AbstractFactory.BackGroundTheme.BackGroundTheme;
import com.solid.designPattern.AbstractFactory.BackGroundTheme.DarkBackGroundTheme;
import com.solid.designPattern.AbstractFactory.TextTheme.LightTextTheme;
import com.solid.designPattern.AbstractFactory.TextTheme.TextTheme;

public class DarkModeUiFactory implements UIFactory{
    @Override
    public BackGroundTheme getBackGroundTheme() {
        return new DarkBackGroundTheme();
    }

    @Override
    public TextTheme getTextTheme() {
        return new LightTextTheme();
    }
}
