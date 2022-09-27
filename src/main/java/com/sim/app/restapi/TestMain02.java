package com.sim.app.restapi;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TestMain02 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();

        map.put("1","사과");
        map.put("2","딸기");
        map.put("3","배");
        map.put("4","망고");

        Iterator<String> iterator = map.keySet().iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }



    }
}
