package org;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EvenNumber {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();

		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);

		System.out.println(sum(list));
		}

		public static int sum(List<Integer> list)
		{
		return list.stream()
		.filter(i -> i % 2==0)
		.mapToInt(i -> i)
		.sum();
		}
		}