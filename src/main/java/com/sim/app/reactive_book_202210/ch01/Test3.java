package com.sim.app.reactive_book_202210.ch01;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Flux;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Slf4j
public class Test3 {

    private static List<String> strings = Arrays.asList("사과","배","바나나");

    public static void main(String[] args) {
        Flux<List<String>> flux = Flux.just(strings)
                .doOnNext(pList->{
                    System.out.println("1. 최초 발행 데이터");
                    System.out.println(pList);
                })
                .map(list -> {
                    List<String> changeList = new ArrayList<>();
                    for(int i =0; i < list.size() ;i++){

                        if(i==0){
                            changeList.add("수박");
                            //System.out.println("여기는 1");
                        }else{
                            changeList.add(list.get(i));
                            //System.out.println("여기는 2");
                        }
                    }
                    return changeList;
                })
                .doOnNext(pList->{
                    System.out.println("2. map 을 통해 변경한 데이터");
                    System.out.println(pList);
                });
        TestSubscriber testSubscriber = new TestSubscriber();
        flux.subscribe(testSubscriber);
    }


}
