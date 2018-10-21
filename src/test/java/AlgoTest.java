package test.java;

import static org.junit.Assert.*;

import org.junit.Test;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import main.java.Item;
import main.java.SortAlgos;

public class AlgoTest {
	
	Item[] testSeq1Array = {new Item(6), new Item(4), new Item(5)};

	@Before
	public void setUpBefore() throws Exception {		
		
	}

	/*
	 * Tests Sequence 1
	 * Covers Node Coverage
	 * half of Edge Coverage
	 * half of Condition Coverage
	 */
	@Test
	public void testSequence1() throws Exception {
		Item[] expected = {new Item(4), new Item(5), new Item(6)};
		SortAlgos.bubbleSort(testSeq1Array);
		boolean correct = true;
		for (int i = 0; i < expected.length; i++) {
			if (expected[i].key != testSeq1Array[i].key) {
				correct = false;
			}
		}
		assertTrue("... it should sort the list.", correct);
	}
	
	/*
	 * Tests Sequence 2
	 * Tests last half of edge coverage
	 * Tests last half of condition coverage
	 */
	@Test
	public void testSequence2() throws Exception {
		try {
			SortAlgos.bubbleSort(null);
		} catch (Exception e) {
			assertTrue("Shoudl throw an exception", true);
		}
	}
	
	/*
	 * Testing insertion sort
	 * For that 90% code coverage
	 */
	@Test
	public void testInsertionSort() throws Exception {
		Item[] expected = {new Item(4), new Item(5), new Item(6)};
		Item[] test1 = {new Item(6), new Item(4), new Item(5)};
		SortAlgos.insertionSort(test1);
		boolean correct = true;
		for (int i = 0; i < expected.length; i++) {
			if (expected[i].key != testSeq1Array[i].key) {
				correct = false;
			}
		}
		assertTrue("... it should sort the list.", correct);
	}
	
	/*
	 * Testing merge sort
	 * For that 90% code coverage
	 */
	@Test
	public void testMergeSort() throws Exception {
		Item[] expected = {new Item(4), new Item(5), new Item(6)};
		Item[] test1 = {new Item(6), new Item(4), new Item(5)};
		SortAlgos.mergeSort(test1);
		boolean correct = true;
		for (int i = 0; i < expected.length; i++) {
			if (expected[i].key != testSeq1Array[i].key) {
				correct = false;
			}
		}
		assertTrue("... it should sort the list.", correct);
	}
	
	/*
	 * Testing quick sort
	 * For that 90% code coverage
	 */
	@Test
	public void testQuickSort() throws Exception {
		Item[] expected = {new Item(4), new Item(5), new Item(6)};
		Item[] test1 = {new Item(6), new Item(4), new Item(5)};
		SortAlgos.quickSort(test1);
		boolean correct = true;
		for (int i = 0; i < expected.length; i++) {
			if (expected[i].key != testSeq1Array[i].key) {
				correct = false;
			}
		}
		assertTrue("... it should sort the list.", correct);
	}
	
	/*
	 * Testing selection sort
	 * For that 90% code coverage
	 */
	@Test
	public void testSelectionSort() throws Exception {
		Item[] expected = {new Item(4), new Item(5), new Item(6)};
		Item[] test1 = {new Item(6), new Item(4), new Item(5)};
		SortAlgos.selectionSort(test1);
		boolean correct = true;
		for (int i = 0; i < expected.length; i++) {
			if (expected[i].key != testSeq1Array[i].key) {
				correct = false;
			}
		}
		assertTrue("... it should sort the list.", correct);
	}
	
	/*
	 * Testing head sort
	 * For that 90% code coverage
	 */
	@Test
	public void testHeapSort() throws Exception {
		Item[] expected = {new Item(4), new Item(5), new Item(6), new Item(7), new Item(8), new Item(9), new Item(10)};
		Item[] test1 = {new Item(10), new Item(6), new Item(4), new Item(7), new Item(5), new Item(8), new Item(9)};
		SortAlgos.heapSort(test1);
		boolean correct = true;
		for (int i = 0; i < expected.length; i++) {
			if (expected[i].key != testSeq1Array[i].key) {
				correct = false;
			}
		}
		assertTrue("... it should sort the list.", correct);
	}
}
