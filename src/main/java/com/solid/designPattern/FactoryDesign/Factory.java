package com.solid.designPattern.FactoryDesign;

import com.solid.designPattern.FactoryDesign.Class.ClassInterface;
import com.solid.designPattern.FactoryDesign.Class.ConcreteClassOne;
import com.solid.designPattern.FactoryDesign.Class.ConcreteClassTwo;

public class Factory {

    public static ClassInterface getInstance(String type){
        if(type.equals("One")){
            return new ConcreteClassOne();
        }else{
            return new ConcreteClassTwo();
        }
    }

}
