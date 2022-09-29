package com.naver.myhome3.config;

import java.util.ArrayList;
import java.util.List;

//와일드 카드(?)
//제네릭 타입을 매개값이나 리턴 타입으로 사용할 때 구체적인 타입 대신 와일드 카드를 사용할 수 있다.
//1. <?>  => 타입 파라미터를 대치하는 구체적인 타입으로 모든 클래스나 인터페이스 타입이 올 수 있다.
//        => <? extends Object> 줄임 표현, Unbounded WildCard라고 함
//2. <? extendx 상위 타입> => 타입 파라미터를 대치하는 구체적인 타입으로 특정 클래스를 상속받은 클래스로 제한한다.
//3. <? super 하위 타입> => 타입 파라미터를 대치하는 구체적인 타입으로 특정 클래스와 그 클래스의 상위 클래스로만 제한한다.
public class WildTest {
	
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("test1");
		list.add("test2");
		list.add("test3");
		
		// Integer 자료형 list2 객체 생성
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(1);
		list2.add(2);
		list2.add(3);
		
		// Double list3 생성
		ArrayList<Double> list3 = new ArrayList<Double>();
		list3.add(10.1);
		list3.add(11.2);
		list3.add(12.3);
		
		// static 메소드 호출
		printData(list);
		printData(list2);
		printData(list3);
		
		/*
		 test1	test2	test3
		 1		2		3
		 10.1	11.2	12.3
		 */
	}

	// 리스트 출력 메소드
	private static void printData(List<?> list) {
		for (Object v : list) {
			System.out.println(v);
		}
		
	}

	
		


}
