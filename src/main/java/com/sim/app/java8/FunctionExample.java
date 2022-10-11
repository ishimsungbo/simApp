package com.sim.app.java8;

import io.swagger.models.auth.In;

import java.util.function.Function;

public class FunctionExample {

    /**
    생성할때 두 개의 제네릭 타입을 정의해야 하며 각각의 이름은 T와 R이다.
    T를 인수로 받아 R로 리턴하는 apply 메서드를 갖고 있다.

    주로 값을 변경하거나 매핑할 때 사용한다.
     */

    public static int executeFunction(String context, Function<String, Integer> function){
        System.out.println("들오온 T는 " + context);
        System.out.println("리턴할 R은 " + context.length());
        return function.apply(context);
    }

    public static void main(String[] args) {

        int num = FunctionExample.executeFunction("Hello! Welcome to Java World.", inString-> inString.length());
        System.out.println(num);

    }

}
