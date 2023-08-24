package com.rutuj;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class TestClassFirst {

    @Test
    public void passes(){
        assertEquals(2+2,4);
    }

    @Test
    public void fails(){
        assertEquals(2+2,5);
    }
}
