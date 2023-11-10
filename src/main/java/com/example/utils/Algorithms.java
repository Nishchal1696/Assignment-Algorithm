package com.example.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;


@Component
public class Algorithms {

	public static String checkPrime(int x) {
		if (x < 2) {
			return "Not a prime no";
		} else {
			for (int i = 2; i <= x / 2; i++) {// 2,3,4,5
				if (x % i == 0) {
					return "Not a prime no";
				}
			}
			return "Prime Number";
		}
	}

	public static boolean isPalindromeOrNot(String sample) {
		int length = sample.length();
		String reverese = "";
		for (int i = length - 1; i >= 0; --i) {
			reverese = reverese + sample.charAt(i);
		}
		System.out.println(reverese);
		if (sample.equalsIgnoreCase(reverese)) {
			return true;
		} else
			return false;
	}

	public static boolean isPalindromeNumber(Integer number) {
		int actualNumber = number;
		int reverse = 0; // 151
		for (; number != 0;) {
			int remainder = number % 10; // 1-5-1
			reverse = reverse * 10 + remainder; // 1 -15-151
			number = number / 10; // 15 -1 -0
		}
		System.out.println(reverse);
		if (actualNumber == reverse) {
			return true;
		} else
			return false;
	}

	public static int factorial(int a) {
		int res = 1, i;
		for (i = 2; i <= a; i++)
			res = res * i;
		return res;
	}

	public static int getFibinacci(int index) {
		int n1 = 0, n2 = 1;
		int n3 = 0;
		List<Integer> list = new ArrayList<Integer>();
		list.add(n1);
		list.add(n2);
		for (int i = 0; i <= 200; ++i) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			list.add(n3);
		}
		return list.get(index);
	}

	public static List<Integer> getFibinacciOfIndex(int index) {
		int n1 = 0, n2 = 1;
		int n3 = 0;
		List<Integer> list = new ArrayList<Integer>();
		list.add(n1);
		list.add(n2);
		for (int i = 0; i <= index; ++i) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			list.add(n3);
		}
		return list;
	}

	public static String findDiff(Integer amount) {

		String actualAmount = amount.toString();
		if (actualAmount.contains("9")) {
			String modifiedAmount = actualAmount.replace("9", "6");
			Integer differnce = Integer.parseInt(modifiedAmount);
			Integer differnceAmmount = amount - differnce;
			return "You've Paid " + differnceAmmount + " Rs Extra";
		} else
			return "No difference";

	}

	public static String thirdLargest(List<Integer> list) {
		if (list.size() > 3) {
			Collections.sort(list);
			list.forEach(i -> System.out.println(i));
			return "third largest no in array is " + list.get(list.size() - 3);
		} else
			return "You have less tha 3 elements in the list";
	}

	public static List<Integer> immediateSmaller(int[] arr) {
		List<Integer> list = new ArrayList<Integer>();
		// 12,3,4,11,7,5,6,11
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				list.add(arr[i + 1]);
			} else
				list.add(-1);
		}
		return list;
	}

	public static Integer calculate_Area(int arr[][]) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i <= arr.length - 1; i++) { // {2, 3}, {9, 8}, {6, 4}
			list.add(arr[i][0] * arr[i][1]);
		}
		return Collections.max(list);
	}

	public static String minAnd2ndMin(List<Integer> list) {
		Set<Integer> list2 = new HashSet<Integer>();

		list2 = list.stream().sorted().collect(Collectors.toSet());
		ArrayList<Integer> updatedList = new ArrayList<Integer>(list2);
		System.out.println(updatedList);

		if (list2.size() > 1) {
			return "The min=" + updatedList.get(0) + " and the second min=" + updatedList.get(1);
		} else
			return "No more elemets ";

	}

	public static String remAnagram(String str1, String str2) { // 12
		Set<Character> charList = new HashSet<Character>();

		for (char i : str1.toCharArray()) {
			charList.add(i);
		}
		for (char i : str2.toCharArray()) {
			charList.add(i);
		}

		System.out.println(charList);
		for (int j = 0; j < str2.length(); j++) {
			charList.remove(str2.charAt(j));
		}

		return "We need to remove" + charList + "this from string 1";

	}

	public static Boolean isPrime(int x) {
		if (x < 2) {
			return false;
		} else {
			for (int i = 2; i < x; i++) {// 2,3,4,5
				if (x % i == 0) {
					return false;
				}
			}
			return true;
		}
	}

	public static void sieveOfEratosthenes(int prime) {// 13
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < prime; i++) {
			if (isPrime(i)) {
				list.add(i);
			}
		}
		System.out.println(list);
	}

	public static boolean isSubsequence(String str1, String str2) { // 14
		int m = str1.length();
		int n = str2.length();
		int j = 0;
		for (int i = 0; i < n && j < m; i++) {
			if (str1.charAt(j) == str2.charAt(i)) {
				j++;
			}
		}

		return (j == m);
	}

	public static String firstAndLast(List<Integer> list, int find) { //15

		return " first occurence of X =" + find + " is at index =" + list.indexOf(3)
				+ " and last occurence is at index = " + list.lastIndexOf(3);

	}
	public static String merge(String str1, String str2) {//16

		String latest = "";
		int j = 0;
		for (int i = 0; i < str1.length(); i++) {
			latest = latest + str1.charAt(i);

			if (j < str2.length()) {
				latest = latest + str2.charAt(j);
				j += 1;
			}
		}
		return latest;
	}
	public static void isGoodorBad(String str) {//17
		 String regexforConsonants = ".*[bcdfghjklmnpqrstvwxyz]{4,}.*";
		 String regexVowels=".*[aeiou]{6,}.*";
	  if(str.matches(regexforConsonants)||str.matches(regexVowels)) {
		  System.out.println("it's a BAD string");
	  }else System.out.println("its GOOD string");
	}
	
	public static boolean isFrequencyUnique(int arr[], int n)//18
	{	 
		HashMap<Integer, Integer> freq = new HashMap<Integer, Integer>();
		for (int i = 0; i < n; i++) {
			if (freq.containsKey(arr[i])) {
				freq.put(arr[i], freq.get(arr[i]) + 1);
			} else {
				freq.put(arr[i], 1);
			}
		}
		HashSet<Integer> uniqueFreq = new HashSet<Integer>();
		for (Map.Entry<Integer, Integer> i : freq.entrySet()) {
			if (uniqueFreq.contains(i.getValue()))
				return false;
			else
				uniqueFreq.add(i.getValue());
		}
		return true;
	}
	public static void  stockBuySell(Integer []arr) {  // {100r,180r,260,310r,40r,535r,695r}  {0=5, 1=3, 4=6}
		List<Integer> list=new ArrayList<Integer>();
		List<Integer> copyList=new ArrayList<Integer>();
		Map<Integer, Integer> hmap=new LinkedHashMap<>();
		int lowest=0;
		int highest=0;
		for(Integer i:arr) {
			list.add(i);
			copyList.add(i);
		}		
		do {
			 lowest=Collections.min(list);
			 highest=Collections.max(list);
			
		if(highest==lowest) {
			list.remove(list.indexOf(lowest));
		}else {
			list.remove(list.indexOf(lowest));
			list.remove(list.indexOf(highest));
			hmap.put(copyList.indexOf(lowest), copyList.indexOf(highest));
		}
			
		} while (lowest!=highest);
		System.out.println(hmap);
	}
	public static void addMinChar(String str) {//21  //nishchal
		int count=0;
		StringBuilder builder=new StringBuilder(str);
		String reverseString=builder.deleteCharAt(count).reverse().toString();
	
		for(int i=0;i<reverseString.length();i++) {
			count++;
		}
		str=reverseString.concat(str);
		System.out.println(reverseString +" "+count);
		System.out.println(str);
		
	}
	public static void missingNumber(Integer []arr) {//22
		List<Integer> list=new ArrayList<Integer>();
		int count=0;
		Boolean flag=false;
		for(Integer i:arr) {
			list.add(i);
		}
		int lowerLimit=Collections.min(list);
		int upperLimit=Collections.max(list);
		for(int i=0;i<list.size();i++) {
			if(list.contains(lowerLimit)&&lowerLimit<upperLimit) {
				lowerLimit+=1;
				flag=true;
			}else {
				flag=false;
				break;
			}
		}
		if(!flag) {
			count=lowerLimit;
		}
		System.out.println("Missing number is "+count);
	}
	public static void kthSmallest(List<Integer> list,Integer elementToFind) {//23
		
		list.sort(Comparator.naturalOrder());      //[1, 2, 3, 4, 5, 6, 8, 11, 23, 24]
		System.out.println(list.get(elementToFind-1));
	}
	public static void equilibriumPoint(List<Integer> integers) {//24     {1,3,3,2,7}
		int left=0;
		int right=0;
		int equilibrium=0;
		for(int i=1;i<integers.size();i++) {
			for(int j=0;j<i;j++) {
				left=left+integers.get(j);
			}
			for(int k=i+1;k<integers.size();k++) {
				right=right+integers.get(k);
			}
			if(left==right) {
				equilibrium=integers.get(i);
				break;
			}
			left=0;
			right=0;
		}
		System.out.println("equilibrium at-"+equilibrium);
	}
	public static void print2largest(List<Integer> list) {//25
		Set<Integer> setList= list.stream().sorted().collect(Collectors.toSet());
		if(setList.size()<1) {
			System.out.println("-1");
		}else {
			List<Integer> updated=setList.stream().sorted().collect(Collectors.toList());
			System.out.println(updated.get(updated.size()-2));
		}
		
	}
	public static void getPairsCount(Integer []arr,Integer sum) {//26  //{1, 5, 7, 1
		Map<Integer, Integer> hmap=new HashMap<Integer, Integer>();
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				Integer count=arr[i]+arr[j];
				if(sum==count) {
					hmap.put(arr[i], arr[j]);
				}
			}
		}
		if(hmap.isEmpty()) {
			System.out.println("Not found");
		}else {
			hmap.forEach((k,v)->{
				System.out.println(k.intValue() +"+"+v.intValue());
			});
		}
	}
	
	public static void maxProduct(Integer []arr) {//27
		List<Integer> list=new ArrayList<Integer>();
		for(Integer i:arr) {
			list.add(i);
		}
		Collections.sort(list, Comparator.reverseOrder());
		System.out.println(list);
		int product=list.get(0);   //[4, 3, 1, 0]
		for(int j=1;j<list.size();j++) {
			if(list.get(j)!=0) {
				product*=list.get(j);
			}
		}
		if(product<0) {
			System.out.println(Math.abs(product));
		}
		else System.out.println(product);
	}
}
