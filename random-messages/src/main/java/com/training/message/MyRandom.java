package com.training.message;

import java.util.Random;

public class MyRandom {
	public static int getRandomNumberUsingNextInt(int min, int max) {
	    Random random = new Random();
	    return random.nextInt(max - min) + min;
	}
}
