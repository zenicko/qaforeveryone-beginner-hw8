package com.example.task19;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task19Test {

//    @Test
//    void randomIntegerSizeN() {
//        //
//        Task19.randomIntegerSizeN(int n);
//    }

    @Test
    void createRangeOfRandomIntegerNumbersBySize() {
        Task19 task19 = new Task19();
        int
                l = 3,
                d = 2;

        int[] actualResultArray = task19.createRangeOfRandomIntegerNumbers(l, d);
        Assertions.assertEquals(l, actualResultArray.length);
    }

    @Test
    void createRangeOfRandomIntegerNumbersByDigitityOfTheNumber() {
        Task19 task19 = new Task19();
        int
                l = 3,
                d = 2;

        int actualD;
        int[] actualResultArray = task19.createRangeOfRandomIntegerNumbers(l, d);

        for (int i = 0; i < actualResultArray.length; i++) {
            actualD = String.valueOf(actualResultArray[i]).length();

            Assertions.assertEquals(d, actualD);
            Assertions.assertEquals(d, String.valueOf(actualResultArray[i]).length());

            System.out.println(d + " " + actualResultArray[i]);
        }
    }

}