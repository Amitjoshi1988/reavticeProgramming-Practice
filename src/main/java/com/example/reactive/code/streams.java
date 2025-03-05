package com.example.reactive.code;

import java.util.Arrays;
import java.util.List;

public class streams {
	
	static public void main(String... jj)
	{
		List<Integer> intList = Arrays.asList(1,2,3,4,5,6,7,8,9);
		intList.stream().forEach(num -> System.out.println(num));
	}

}
