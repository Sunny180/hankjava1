package com.tom.PokerGame;

import java.util.Random;

public class Poker {
	Card[] cards = new Card[52];
	public Poker(){
		for(int i = 0;i < 52 ;i++){
			cards[i]= new Card(i);
		}
		
	}
	public void shuffle(){
		for(int i = 0;i < 52; i++){
			int r = new Random().nextInt(52);
			//a = cards[i]
			//b = cards[r]
			Card tmp = cards[i];
			cards[i]=cards[r];
			cards[r]=tmp;
		}
	}
	
	public void print(){
		for(int i = 0;i < 52; i++){
/*			int flower = cards[i]/13;
			char c = 0;
			switch (flower){
			case 0:
				c = 'C';
				break;
			case 1:
				c = 'D';
				break;
			case 2:
				c = 'H';
				break;
			case 3:
				c = 'S';
				break;
			}*/
			System.out.print(cards[i].get()+"");
			if(i%13==12){
				System.out.println();
			}
		}
	}
}
