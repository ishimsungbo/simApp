package com.sim.app.javaparttern;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Hansan extends IntroduceTemplate{

    @Override
    public void saySpecialty() {  //hook 메서드란 사용해도 안해도 됨을 말함.
        log.info("저는 노래를 잘합니다.");
    }

    @Override
    public void sayMessages() { //자기 소개
        log.info("안녕하세요. 저는 잘살아 왔습니다.");
    }

    public Hansan(String name, int age) {
        super(name, age);
    }

    public static void main(String[] args) {
        IntroduceTemplate Hansan = new Hansan("이순신", 23);
        Hansan.introduceOneself();
    }

}
