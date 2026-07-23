package com.randomQuestion.java_programing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountFrequency {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter a String ");
		String str =sc.nextLine();
		HashMap<Character,Integer>map=new HashMap<>();
		for(char ch : str.toCharArray()) {
			if(map.containsKey(ch)) {
				map.put(ch,map.get(ch)+1);
			}else {
				map.put(ch,1);
			}
		}
		System.out.println("\nCharacter Frequency");
		for(Map.Entry<Character, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey()+" = " + entry.getValue());
		}
		sc.close();

	}

}
