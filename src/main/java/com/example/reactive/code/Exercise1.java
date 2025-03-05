package com.example.reactive.code;

import java.util.stream.Collectors;

public class Exercise1 {
	static public void main(String... exr1) {
		// Use StreamSources.intNumbersStream() and StreamSources.userStream()

		// Print all numbers in the intNumbersStream stream
		// TODO: Write code here
		StreamSources.intNumbersStream().forEach(System.out::println);

		// Print numbers from intNumbersStream that are less than 5
		// TODO: Write code here
		StreamSources.intNumbersStream().filter(num -> num < 5)
		.forEach(System.out::println);

		// Print the second and third numbers in intNumbersStream that's greater than 5
		// TODO: Write code here
		StreamSources.intNumbersStream().filter(num -> num > 5)
		.skip(1)
		.limit(2)
		.forEach(System.out::println);

		// Print the first number in intNumbersStream that's greater than 5.
		// If nothing is found, print -1
		// TODO: Write code here
      Integer result = StreamSources.intNumbersStream().filter(num -> num >5)
       .findFirst()
       .orElse(-1);
      System.out.println(result);
       
		// Print first names of all users in userStream
		// TODO: Write code here
       StreamSources.userStream().map(User::getFirstName).forEach(System.out::print);
       
		// Print first names in userStream for users that have IDs from number stream
		// TODO: Write code here
       StreamSources.userStream().filter(user -> StreamSources.intNumbersStream().collect(Collectors.toSet()).contains(user.getId()))
       .map(User::getFirstName)
       .forEach(System.out::println);
	}
}
