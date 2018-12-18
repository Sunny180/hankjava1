package com.tom.PokerGame;

public class StringTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hello World";
		System.out.println(s.substring(5));
		System.out.println(s.substring(0, 7));
		
		for(int i = s.length()-1; i >= 0; i--){
			System.out.print(s.charAt(i));
		}
		
		String s2 = new String ("Jack Tom Eric");
		System.out.println(s2.indexOf("Tom"));
		/*String name = "Tom";
		name = name.replace("Tom", "boss");
		System.out.println(s2.substring(0, 5) + name+ s2.substring(8, 13));*/
		
		String name = "Tom";
		int index = s2.indexOf(name);
		System.out.println(index);
		System.out.println(s2.substring(0,index)+ "boss"+ s2.substring(index+ name.length()));
	}

}
