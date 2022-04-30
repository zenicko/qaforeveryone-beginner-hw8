package com.example.task19;


public class Task19 {

    public static int randomIntegerSizeN(int n) { // (min; 0] [1; max]
        if (n <= 0) {
            throw new RuntimeException("The size(n) is less or equal 0!");
        }

        double a = Math.random(); // [0,1] a << 1 0.0000001
        int rez;             //0.00000000000013475697 => * 100 =>  01.3475697 * 10 = 13.475697

        for (; ; ) {
            a *= 10;
            rez = (int) a; // 1
            if (rez >= Math.pow(10, n - 1) && rez <= (Math.pow(10, n) - 1))
                break;
//            a *= 10;
        }
        return rez;
    }

    private static int randomIntegerSizeNBad(int n) {
        double a = Math.random(); // [0,1]
        double b = a * (10 * n); //0.0000013475697 => * 100 =>  0.0013.475697
        int c = (int) b;

        return (int) (Math.random() * (10 * n));
    }

    public int[] createRangeOfRandomIntegerNumbers(int lengthOfArray, int numbers) {
        int[] randomIntegerNumbers = new int[lengthOfArray];

        for (int i = 0; i < randomIntegerNumbers.length; i++) {
            randomIntegerNumbers[i] = randomIntegerSizeN(numbers);
        }

        return randomIntegerNumbers;
    }
}
