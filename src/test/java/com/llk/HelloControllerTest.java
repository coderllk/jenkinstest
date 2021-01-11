package com.llk;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class HelloControllerTest {

    @Test
    public void test01(){
        System.out.println("***test01 seccess***");
    }

    @Test
    public void test02(){
        System.out.println("***test02 seccess***");
    }

}
