package com.inspur.zqq.lambda;

import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class PredicateDemo {
	public static void main(String[] args) {
		Predicate<Integer> predicate = a->a>50;
		System.out.println(predicate.test(52));
		IntPredicate intpredicate = a->a>50;
		System.out.println(intpredicate.test(51));
		IntStream.of(10,11,44,59,46,55,99,88,50)
		.filter(intpredicate)
		.peek(System.out::println).count();
		
	}
}
