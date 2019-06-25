package com.inspur.zqq.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Collector {
	public static void main(String[] args) {
		List<String>strings = Arrays.asList("efg", "", "abc", "bc", "ghij","", "lmn");
		List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
		System.out.println("Filtered List: " + filtered);
		String mergedString = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.joining(","));
		System.out.println("Merged String: " + mergedString);
	}

}
