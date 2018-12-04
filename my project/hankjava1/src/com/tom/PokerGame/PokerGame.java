package com.tom.PokerGame;

import java.util.Random;

public class PokerGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] n = new int[10];
		Card[] c = new Card[10];
		System.out.println(n[0]);
		c[0]= new Card(7);
		System.out.println(c[0].get());
		
		
		Poker poker = new Poker();
		poker.print();
		
//		int[] f ={0x2660,0x2653,0x2665,0x2666};
//		System.out.println(f);
		
/*		int[]nums = new int[5];
		nums[0] = 38;
		nums[4] = 3;
		System.out.println(nums[4]);
		System.out.println(nums.length);
		for(int i = 0;i < nums.length;i++){
			System.out.println(nums[i]);
		}
		
		Random random = new Random();
		int number = random.nextInt(13+1);
		int flower = random.nextInt(4);
		System.out.println(number);
		char c1 = 0;
		switch (flower){
		case 0:
			c1 = 'C';
			break;
		case 1:
			c1 = 'D';
			break;
		case 2:
			c1 = 'H';
			break;
		case 3:
			c1 = 'S';
			break;
		
		}
		System.out.println(c1);*/
	}

}
