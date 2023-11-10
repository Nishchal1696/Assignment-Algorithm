package com.example.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import com.example.utils.Algorithms;

@RestController
public class MainController {

	public String checkPrimeNo(int x) {
		return Algorithms.checkPrime(x);
	}

	public Boolean isPalindrome(String sample) {
		return Algorithms.isPalindromeOrNot(sample);
	}

	public Boolean isPalindromeNumber(Integer number) {
		return Algorithms.isPalindromeNumber(number);
	}

	public int factorial(int a) {
		return Algorithms.factorial(a);
	}

	public int getFibinacci(int index) {
		return Algorithms.getFibinacci(index);
	}

	public List<Integer> getFibinacciUptoIndex(int index) {
		return Algorithms.getFibinacciOfIndex(index);
	}

	public String findDiff(Integer amount) {
		return Algorithms.findDiff(amount);
	}

	public String thirdLargest(List<Integer> list) {
		return Algorithms.thirdLargest(list);
	}

	public Integer calculate_Area(int arr[][]) {
		return Algorithms.calculate_Area(arr);
	}

	public String minAnd2ndMin(List<Integer> list) {
		return Algorithms.minAnd2ndMin(list);
	}
    
	public String remAnagram(String str1, String str2) {
		return Algorithms.remAnagram(str1, str2);
	}
	
	public String firstAndLast(List<Integer> list,int find) {
		return Algorithms.firstAndLast(list, find);
	}
}
