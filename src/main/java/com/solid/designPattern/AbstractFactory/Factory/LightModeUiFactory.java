package com.solid.designPattern.AbstractFactory.Factory;

import com.solid.designPattern.AbstractFactory.BackGroundTheme.BackGroundTheme;
import com.solid.designPattern.AbstractFactory.BackGroundTheme.LightBackGroundTheme;
import com.solid.designPattern.AbstractFactory.TextTheme.DarkTextTheme;
import com.solid.designPattern.AbstractFactory.TextTheme.TextTheme;

public class LightModeUiFactory implements UIFactory{
    @Override
    public BackGroundTheme getBackGroundTheme() {
        return new LightBackGroundTheme();
    }

    @Override
    public TextTheme getTextTheme() {
        return new DarkTextTheme();
    }
}
