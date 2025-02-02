package com.solid.designPattern.AbstractFactory.Factory;

import com.solid.designPattern.AbstractFactory.BackGroundTheme.BackGroundTheme;
import com.solid.designPattern.AbstractFactory.TextTheme.TextTheme;

public interface UIFactory {
    BackGroundTheme getBackGroundTheme();
    TextTheme getTextTheme();
}
