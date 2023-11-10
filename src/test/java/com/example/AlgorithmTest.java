package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.stubbing.Answer;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.controller.MainController;
import com.example.utils.Algorithms;

@SpringBootTest
public class AlgorithmTest {
  
	@Mock
	MainController controller;
	
	Algorithms algorithms;
	
	List<Integer> listforFib=Arrays.asList(0, 1, 1 ,2 ,3 ,5 ,8 ,13, 21, 34);
	
	List<Integer> listForMinAndSecondMin=Arrays.asList(8,3,5,7,1,-1,6,2,7,8,1,2);
	
	List<Integer> listFirstAndLast=Arrays.asList(1,3,6,3,3,7,8,3);	
	
	int[][] numbers = { {2, 3}, {9, 8}, {6, 4},{6,20} };
	
	@Test
	public void checkPrimeTest() {
		when(controller.checkPrimeNo(3)).thenReturn("Prime Number");
	}
	
	@Test
	public void isPalindromeOrNotTest() {
		when(controller.isPalindrome("abcba")).thenReturn(true);
	}
	
	@Test
	public void isPalindromeNumberTest() {
		when(controller.isPalindromeNumber(1234)).thenReturn(false);
		assertEquals(false, algorithms.isPalindromeNumber(1234));
	}
	
	@Test
	public void factorialTest() {
		when(controller.factorial(4)).thenReturn(4);
		assertEquals(24, algorithms.factorial(4));
	}
	
	@Test
	public void getFibinacciTest() {
		when(controller.getFibinacci(4)).thenReturn(4);
		assertEquals(3, algorithms.getFibinacci(4));
	}
	
	@Test
	public void getFibinacciUptoIndexTest() {
		assertEquals(listforFib, algorithms.getFibinacciOfIndex(7));
	}
	
	@Test
	public void getfindDiffTest() {
		when(controller.findDiff(4)).thenReturn("No difference");
		assertEquals("You've Paid 30 Rs Extra", algorithms.findDiff(396));
	}
	
	@Test
	public void thirdLargest() {
		when(controller.thirdLargest(listforFib)).thenReturn("You have less tha 3 elements in the list");
		assertEquals("third largest no in array is 13", algorithms.thirdLargest(listforFib));
	}
	
	@Test
	public void calculateAreaTest() {
		when(controller.calculate_Area(numbers)).thenReturn(12);
		assertEquals(120, algorithms.calculate_Area(numbers));
	}
	
	@Test
	public void minAnd2ndMinTest() {
		when(controller.minAnd2ndMin(listforFib)).thenReturn("No more elemets");
		assertEquals("The min=-1 and the second min=1", algorithms.minAnd2ndMin(listForMinAndSecondMin));
	}
	
	@Test
	public void remAnagramTest() {	
		when(controller.remAnagram("eats","tea")).thenReturn("No more elemets");
		assertEquals("We need to remove[s]this from string 1", algorithms.remAnagram("eats","tea"));		
	}
	
	public void firstAndLastTest() {
		when(controller.firstAndLast(listFirstAndLast,3)).thenReturn("No more elemets");
		assertEquals("first occurence of X =3 is at index =1 and last occurence is at index = 7", algorithms.firstAndLast(listFirstAndLast,3));
	}
}
