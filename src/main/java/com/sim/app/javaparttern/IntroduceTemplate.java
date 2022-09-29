package com.sim.app.javaparttern;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class IntroduceTemplate {

    String name;
    int age;

    public IntroduceTemplate(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public final void introduceOneself(){
        sayName();
        sayAge();
        saySpecialty();
        sayMessages();
    }

    public void sayName(){
        log.info("안녕하세요. 저는 {} 입니다.",name);
    }

    public void sayAge(){
        log.info("제 나이는 {} 입니다.",age);
    }

    /**
     * hook method
     */
    public void saySpecialty(){}

    public abstract void sayMessages();
}
