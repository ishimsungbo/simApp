package com.sim.app.test;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Slf4j
public class Collection_Sync_List {

    private static List list = Collections.synchronizedList(new ArrayList<>());

    public static void main(String[] args) {

        for(int i=0; i < 10 ;i++){
            String a = i+"요소";
            list.add(a);
        }

      log.info("총 수 : " + list.size());

    }
}
