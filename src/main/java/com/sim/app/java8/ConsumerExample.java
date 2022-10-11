package com.sim.app.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

    /**
     * 받기만 하고 리턴이 없기에 소비자라고 한다.
     * 파라미터를 전달해서 처리한 후 결과를 리턴 받을 필요가 없을 때 사용한다.
     */

    public static void executeConsumer(List<String> nameList, Consumer<String> consumer){
        for(String name: nameList){
            consumer.accept(name + " !");
        }
    }

    public static void main(String[] args) {
        List<String> nameList = new ArrayList<>();
        nameList.add("정수빈");
        nameList.add("김재호");
        nameList.add("오재원");
        nameList.add("이영하");

        //ConsumerExample.executeConsumer(nameList,(String name) -> System.out.println(name));

        //위와 동일한 결과다.
        /*
        ConsumerExample.executeConsumer(nameList, new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
         */
        ConsumerExample.executeConsumer(nameList, name-> System.out.println(name));
    }

}
