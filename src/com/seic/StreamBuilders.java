package com.seic;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamBuilders {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();

		for (int i = 1; i < 10; i++) {
			list.add(i);
		}

		Stream<Integer> stream = list.stream();
		List<Integer> evenNumbersList = stream.filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.print(evenNumbersList);

		List<Integer> list1 = new ArrayList<Integer>();

		for (int i = 1; i < 10; i++) {
			list1.add(i);
		}

		Stream<Integer> stream1 = list1.stream();
		Integer[] evenNumbersArr = stream1.filter(i -> i % 2 == 0).toArray(Integer[]::new);
		System.out.print(evenNumbersArr);

	}
}
