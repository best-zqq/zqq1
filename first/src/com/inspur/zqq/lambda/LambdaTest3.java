package com.inspur.zqq.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.function.Predicate;

public class LambdaTest3 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,23,4,5,7,23,67,12);
		//这里用lamdba实现comparator接口
		Comparator<Integer> comparator=(Integer i1,Integer i2)->i1.compareTo(i2);
		//jdk1.8之后，list有sort方法，里面的参数为比较规则
		list.sort(comparator);
		System.out.println(list.get(0));
		List<Integer> list2 = new ArrayList<>();
		min(list,list2,n->list2.contains(n));
		IntSummaryStatistics stats = list2.stream().mapToInt(x->2*x).summaryStatistics();
		System.out.println(stats.getSum());
	}
	public static void min(List<Integer> list,List<Integer> list2,Predicate<Integer> predicate) {
		for(Integer n:list) {
			if(!predicate.test(n)) {
				list2.add(n);
			}
		}
	}}
