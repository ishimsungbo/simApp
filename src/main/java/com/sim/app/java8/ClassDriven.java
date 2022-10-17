package com.sim.app.java8;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ClassDriven {
    public static void main(String[] args) {

        ReFlexClass mClass = new ReFlexClass();

        //클래스 안의 상세정보를 얻을 수 있다.
        Method[] methods = mClass.getClass().getDeclaredMethods();

        for(int i=0; i < methods.length ;i++){
            System.out.println(" ==> " + methods[i].getName());
            try {
                methods[i].invoke(mClass);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }



    }
}
