package com.sim.app.test;


import lombok.extern.slf4j.Slf4j;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

@Slf4j
public class StreamTest {

    public static void main(String[] args) {

        byte[] datas = new byte[]{1,2,3,4,5,6,7};

        ByteArrayInputStream inputStream = new ByteArrayInputStream(datas);
        InputStream stream;
    }

}
