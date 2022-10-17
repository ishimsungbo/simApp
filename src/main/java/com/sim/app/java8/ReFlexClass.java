package com.sim.app.java8;

import java.util.Arrays;
import java.util.List;

public class ReFlexClass {

    public String mGetString(){
        return "A";
    }

    public int mGetInt(){
        return 1;
    }

    public List<String> mList(){
        return Arrays.asList("A","B","C");
    }

    public void mPrint(String inputStr){
        System.out.println("Log : " + inputStr);
    }

}
