package com.misha.demo.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by misha on 04.09.17.
 */
//@RunWith(SpringJUnit4ClassRunner.class)
public class MyTestServiceTest {


    MyTestService myTestService = new MyTestService();

    @Test
    public void testGetMessage() {

        assertEquals("Hello World", myTestService.getMessage());

    }



}