package com.daclink;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class AdderTest {

    @Test
    void adderTest() {
        Random random = new Random();
        int x;
        int y;
        for(int i = 0; i < random.nextInt(10); i++){
            x = random.nextInt(100);
            y = random.nextInt(100);
            assertEquals((x+y),Main.adder(x,y));
        }

    }
}