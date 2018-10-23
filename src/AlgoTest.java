import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Test;

import main.java.Item;
import main.java.SortAlgos;
import main.java.SortDemoData;

/*
 * @author: Kanchan Wakchaure
 * @ASU ID: 1214610982
 * Description: Task2- White Box Testing for bubble sort
 */

class AlgoTest {
	
	SortDemoData sortDemoData = new SortDemoData();
	Item[] inputArray;
	String input;

/* Test Case 1: vec is equal to null that is no element in array
 * Test sequence: <21,22,36> 
 * Node coverage for <21,22,36>
 */
	
	@Test
	public void ifNoElementsToSort() {
		Assertions.assertThrows(NullPointerException.class, () -> sortDemoData.runAlgo(0));
	}

	
/* Test Case 2: array with only one element
   Test sequence: <21,24,25,26,27,36>   
*/
	
	@Test
	public void ifOneElementToSort() {
		input = "10";
		sortDemoData.initializeArray(input);
		inputArray = sortDemoData.myArray;
		SortAlgos.bubbleSort(sortDemoData.myArray);
		assertTrue(inputArray==sortDemoData.myArray);		
	}


/* Test Case 3: node coverage for below sequence
 * Test sequence: <21,24,25,26,27,28,29,30,31,32,33,34,28,35,27,36>
 */

	@Test
	public void nodeCoverageBubbleSort() {
		String output = "10 20 30 40 50 60";
		sortDemoData.initializeArray(output);
		Item[] outputArray = sortDemoData.myArray;

		input = "60 50 40 30 20 10";
		sortDemoData.initializeArray(input);
		SortAlgos.bubbleSort(sortDemoData.myArray);
		
		for(int i=0; i<6; i++) {
			assertTrue(outputArray[i].key == sortDemoData.myArray[i].key);
		}
		
	}

/* Test Case 3: Edge and Condition coverage for below sequence
 * Test sequence: <21,24,25,26,27,28,29,30,31,32,33,34,28,34,28,35,27,36>
 */

	@Test
	public void edgeCoverageBubbleSort() {
		String output = "10 20 50 80 90";
		sortDemoData.initializeArray(output);
		Item[] outputArray = sortDemoData.myArray;

		input = "80 50 90 10 20";
		sortDemoData.initializeArray(input);
		SortAlgos.bubbleSort(sortDemoData.myArray);
			
		for(int i=0; i<5; i++) {
			assertTrue(outputArray[i].key == sortDemoData.myArray[i].key);
		}
			
	}	
	
/* Test Case 4: already sorted elements
 * Test sequence: <21,24,25,26,27,28,34,28,34,28,35,27,36>
 */

	@Test
	public void alreadySortedElement() {
		String output = "15 18";
		sortDemoData.initializeArray(output);
		Item[] outputArray = sortDemoData.myArray;

		input = "15 18";
		sortDemoData.initializeArray(input);
		SortAlgos.bubbleSort(sortDemoData.myArray);
				
		for(int i=0; i<2; i++) {
			assertTrue(outputArray[i].key == sortDemoData.myArray[i].key);
		}
				
	}
	
/* Test Case 5: already sorted elements
 * Test sequence: <21,24,25,26,27,28,34,28,34,28,35,27,36>
*/

	@Test
	public void unsortedElements() {
		String output = "10 20 30 40 50";
		sortDemoData.initializeArray(output);
		Item[] outputArray = sortDemoData.myArray;

		input = "10 20 30 50 40";
		sortDemoData.initializeArray(input);
		SortAlgos.bubbleSort(sortDemoData.myArray);
					
		for(int i=0; i<5; i++) {
			assertTrue(outputArray[i].key == sortDemoData.myArray[i].key);
		}
					
	}
	
/* Test Case6: Selection sort */
	
	@Test
	public void noElementsSelectionSort() {
		Assertions.assertThrows(NullPointerException.class, () -> sortDemoData.runAlgo(1));				
	}	
	
/* Test Case7: Insertion sort */
	
	@Test
	public void noElementsInsertionSort() {
		Assertions.assertThrows(NullPointerException.class, () -> sortDemoData.runAlgo(2));				
	}
	
/* Test Case8: Merge sort */
	
	@Test
	public void noElementsMergeSort() {
		Assertions.assertThrows(NullPointerException.class, () -> sortDemoData.runAlgo(3));				
	}

/* Test Case9: Quick sort */
	
	@Test
	public void noElementsQuickSort() {
		Assertions.assertThrows(NullPointerException.class, () -> sortDemoData.runAlgo(4));				
	}	
	
/* Test Case10: Heap sort */
	
	@Test
	public void noElementsHeapSort() {
		Assertions.assertThrows(NullPointerException.class, () -> sortDemoData.runAlgo(5));				
	}
	
/* Test Case11: Selection sort */
	@Test
	public void selectionSort1() {
		String output = "10 20 30 40";
		sortDemoData.initializeArray(output);
		Item[] outputArray = sortDemoData.myArray;

		input = "40 30 20 10";
		sortDemoData.initializeArray(input);
		SortAlgos.selectionSort(sortDemoData.myArray);
					
		for(int i=0; i<4; i++) {
			assertTrue(outputArray[i].key == sortDemoData.myArray[i].key);
		}
					
	}
	
/* Test Case12: Insertion sort */
	@Test
	public void insertionSort1() {
		String output = "10 20 30 40";
		sortDemoData.initializeArray(output);
		Item[] outputArray = sortDemoData.myArray;

		input = "40 30 20 10";
		sortDemoData.initializeArray(input);
		SortAlgos.insertionSort(sortDemoData.myArray);
					
		for(int i=0; i<4; i++) {
			assertTrue(outputArray[i].key == sortDemoData.myArray[i].key);
		}
					
	}	
	
/* Test Case13: Merge sort */
	@Test
	public void mergeSort1() {
		String output = "10 20 30 40";
		sortDemoData.initializeArray(output);
		Item[] outputArray = sortDemoData.myArray;

		input = "40 30 20 10";
		sortDemoData.initializeArray(input);
		SortAlgos.mergeSort(sortDemoData.myArray);
					
		for(int i=0; i<4; i++) {
			assertTrue(outputArray[i].key == sortDemoData.myArray[i].key);
		}
					
	}	
	
/* Test Case14: Quick sort */
	@Test
	public void quickSort1() {
		String output = "10 20 30 40";
		sortDemoData.initializeArray(output);
		Item[] outputArray = sortDemoData.myArray;

		input = "40 30 20 10";
		sortDemoData.initializeArray(input);
		SortAlgos.quickSort(sortDemoData.myArray);
					
		for(int i=0; i<4; i++) {
			assertTrue(outputArray[i].key == sortDemoData.myArray[i].key);
		}
					
	}	
/* Test Case15: Heap sort */	
	@Test
	public void heapSort1() {
		String output = "10 20 30 40";
		sortDemoData.initializeArray(output);
		Item[] outputArray = sortDemoData.myArray;

		input = "40 30 20 10";
		sortDemoData.initializeArray(input);
		SortAlgos.heapSort(sortDemoData.myArray);
					
		for(int i=0; i<4; i++) {
			assertTrue(outputArray[i].key == sortDemoData.myArray[i].key);
		}
					
	}
	
/* Test Case16: Insertion sort */
	@Test
	public void insertionSort2() {
		String output = "10 20 30 40";
		sortDemoData.initializeArray(output);
		Item[] outputArray = sortDemoData.myArray;

		input = "10 20 30 40";
		sortDemoData.initializeArray(input);
		SortAlgos.insertionSort(sortDemoData.myArray);
					
		for(int i=0; i<4; i++) {
			assertTrue(outputArray[i].key == sortDemoData.myArray[i].key);
		}
					
	}	
	
/* Test Case17: Merge sort */
	@Test
	public void mergeSort2() {
		String output = "10 20 30 40";
		sortDemoData.initializeArray(output);
		Item[] outputArray = sortDemoData.myArray;

		input = "10 20 30 40";
		sortDemoData.initializeArray(input);
		SortAlgos.mergeSort(sortDemoData.myArray);
					
		for(int i=0; i<4; i++) {
			assertTrue(outputArray[i].key == sortDemoData.myArray[i].key);
		}
					
	}
	
	/* Test Case18: Quick sort */
	@Test
	public void quickSort2() {
		String output = "10 20 30 40";
		sortDemoData.initializeArray(output);
		Item[] outputArray = sortDemoData.myArray;

		input = "10 20 30 40";
		sortDemoData.initializeArray(input);
		SortAlgos.quickSort(sortDemoData.myArray);
					
		for(int i=0; i<4; i++) {
			assertTrue(outputArray[i].key == sortDemoData.myArray[i].key);
		}
					
	}	

	/* Test Case19: Heap sort */
	@Test
	public void heapSort2() {
		String output = "10 20 30 40";
		sortDemoData.initializeArray(output);
		Item[] outputArray = sortDemoData.myArray;

		input = "10 20 30 40";
		sortDemoData.initializeArray(input);
		SortAlgos.heapSort(sortDemoData.myArray);
					
		for(int i=0; i<4; i++) {
			assertTrue(outputArray[i].key == sortDemoData.myArray[i].key);
		}
					
	}
}
