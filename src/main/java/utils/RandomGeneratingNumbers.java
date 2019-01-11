package utils;

import java.util.Random;

public class RandomGeneratingNumbers {
    public static int randomNumber() {

        Random random = new Random();
        return random.nextInt(10000);


    }
}
