package com.solid.designPattern.AbstractFactory;

import com.solid.designPattern.AbstractFactory.BackGroundTheme.BackGroundTheme;
import com.solid.designPattern.AbstractFactory.Factory.DarkModeUiFactory;
import com.solid.designPattern.AbstractFactory.Factory.LightModeUiFactory;
import com.solid.designPattern.AbstractFactory.Factory.UIFactory;
import com.solid.designPattern.AbstractFactory.TextTheme.TextTheme;

public class ThemeSelection {
    BackGroundTheme backGroundTheme;
    TextTheme textTheme;
    UIFactory uiFactory;

    ThemeSelection(String theme){
        if(theme.equals("Dark")){
            uiFactory = new DarkModeUiFactory();
        }else{
            uiFactory = new LightModeUiFactory();
        }
        this.backGroundTheme = uiFactory.getBackGroundTheme();
        this.textTheme = uiFactory.getTextTheme();
    }

    void GetUI(){
        String bkgrnd = backGroundTheme.getThemeColor();
        String txt = textTheme.getThemeColor();

        System.out.println("UI have "+ bkgrnd + " and " + txt);
    }
}
