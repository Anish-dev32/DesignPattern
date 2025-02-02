package com.solid.designPattern.Singleton;

public class SingletonClass {

    private static volatile SingletonClass instance;
    //volatile - global instance to be used while checking double lock
    // instead of local copy of it.
    /* Eager Initialization
    public static final SingletonClass singleton = new SingletonClass();
    * */

    private SingletonClass(){}

    public static SingletonClass getInstance(){
        if(instance == null){
            synchronized (SingletonClass.class) {
                if(instance == null) {
                    instance = new SingletonClass();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        System.out.println(SingletonClass.getInstance().hashCode());
        System.out.println(SingletonClass.getInstance().hashCode());
        System.out.println(SingletonClass.getInstance().hashCode());
    }
}
