package test.java;

import static org.junit.Assert.*;

import main.java.Item;
import main.java.SortAlgos;

import org.junit.Test;

public class AlgoTest {

	@Test (expected=NullPointerException.class)
    public void forNullBubbleSort() throws Exception {
       Item [] array = null;
       SortAlgos.bubbleSort(array);
       assertNull(array);
    }
	@Test
	public void descendingInputArray() throws Exception {
       Item [] array = new Item[3];
       array[0] = new Item(12);
       array[1] = new Item(11);
       array[2] = new Item(10);
       SortAlgos.bubbleSort(array);

       assertTrue(array[0].key == 10);
       assertTrue(array[1].key == 11);
       assertTrue(array[2].key == 12);
    }
	@Test
	public void ascendingInputArray() throws Exception {
		Item [] array = new Item[4];
		array[0] = new Item(21);
		array[1] = new Item(19);
		array[2] = new Item(20);
		array[3] = new Item(22);
		SortAlgos.bubbleSort(array);
		
		assertTrue(array[0].key == 19);
		assertTrue(array[1].key == 20);
		assertTrue(array[2].key == 21);		
	}
 
	@Test
	public void singleElementArray() throws Exception {
		Item [] array = new Item[1];
		array[0] = new Item(3);
		SortAlgos.bubbleSort(array);
		
		assertTrue(array[0].key == 3);
	}
	
	@Test (expected=NullPointerException.class)
    
	public void forNullSelectionSort() throws Exception {
       Item [] array = null;
       SortAlgos.selectionSort(array);
       assertNull(array);
    }
	@Test
	public void descendingInputArray_2() throws Exception {
       Item [] array = new Item[3];
       array[0] = new Item(12);
       array[1] = new Item(11);
       array[2] = new Item(10);
       SortAlgos.selectionSort(array);

       assertTrue(array[0].key == 10);
       assertTrue(array[1].key == 11);
       assertTrue(array[2].key == 12);
    }
	@Test
	public void ascendingInputArray_2() throws Exception {
		Item [] array = new Item[4];
		array[0] = new Item(21);
		array[1] = new Item(19);
		array[2] = new Item(20);
		array[3] = new Item(22);
		SortAlgos.selectionSort(array);
		
		assertTrue(array[0].key == 19);
		assertTrue(array[1].key == 20);
		assertTrue(array[2].key == 21);		
	}
	@Test
	public void singleElementArray_2() throws Exception {
		Item [] array = new Item[1];
		array[0] = new Item(3);
		SortAlgos.selectionSort(array);
		
		assertTrue(array[0].key == 3);
	}
	
	@Test (expected=NullPointerException.class)
    public void forNullInsertionSort() throws Exception {
       Item [] array = null;
       SortAlgos.insertionSort(array);
       assertNull(array);
    }
	@Test
	public void descendingInputArray_3() throws Exception {
       Item [] array = new Item[3];
       array[0] = new Item(12);
       array[1] = new Item(11);
       array[2] = new Item(10);
       SortAlgos.insertionSort(array);

       assertTrue(array[0].key == 10);
       assertTrue(array[1].key == 11);
       assertTrue(array[2].key == 12);
    }
	@Test
	public void ascendingInputArray_3() throws Exception {
		Item [] array = new Item[4];
		array[0] = new Item(21);
		array[1] = new Item(19);
		array[2] = new Item(20);
		array[3] = new Item(22);
		SortAlgos.insertionSort(array);
		
		assertTrue(array[0].key == 19);
		assertTrue(array[1].key == 20);
		assertTrue(array[2].key == 21);		
	}
	@Test
	public void singleElementArray_3() throws Exception {
		Item [] array = new Item[1];
		array[0] = new Item(3);
		SortAlgos.insertionSort(array);
		
		assertTrue(array[0].key == 3);
	}
	@Test (expected=NullPointerException.class)
    public void forNullMergeSort() throws Exception {
       Item [] array = null;
       SortAlgos.mergeSort(array);
       assertNull(array);
    }

	@Test
	public void descendingInputArray_4() throws Exception {
       Item [] array = new Item[3];
       array[0] = new Item(12);
       array[1] = new Item(11);
       array[2] = new Item(10);
       SortAlgos.mergeSort(array);

       assertTrue(array[0].key == 10);
       assertTrue(array[1].key == 11);
       assertTrue(array[2].key == 12);
    }
	@Test
	public void ascendingInputArray_4() throws Exception {
		Item [] array = new Item[4];
		array[0] = new Item(21);
		array[1] = new Item(19);
		array[2] = new Item(20);
		array[3] = new Item(22);
		SortAlgos.mergeSort(array);
		
		assertTrue(array[0].key == 19);
		assertTrue(array[1].key == 20);
		assertTrue(array[2].key == 21);		
	}
	@Test
	public void singleElementArray_4() throws Exception {
		Item [] array = new Item[1];
		array[0] = new Item(3);
		SortAlgos.mergeSort(array);
		
		assertTrue(array[0].key == 3);
	}
	@Test (expected=NullPointerException.class)
    public void forNullQuickSort() throws Exception {
       Item [] array = null;
       SortAlgos.quickSort(array);
       assertNull(array);
    }

	@Test
	public void descendingInputArray_5() throws Exception {
       Item [] array = new Item[3];
       array[0] = new Item(12);
       array[1] = new Item(11);
       array[2] = new Item(10);
       SortAlgos.quickSort(array);

       assertTrue(array[0].key == 10);
       assertTrue(array[1].key == 11);
       assertTrue(array[2].key == 12);
    }
	@Test
	public void ascendingInputArray_5() throws Exception {
		Item [] array = new Item[4];
		array[0] = new Item(21);
		array[1] = new Item(19);
		array[2] = new Item(20);
		array[3] = new Item(22);
		SortAlgos.quickSort(array);
		
		assertTrue(array[0].key == 19);
		assertTrue(array[1].key == 20);
		assertTrue(array[2].key == 21);		
	}
	@Test
	public void singleElementArray_5() throws Exception {
		Item [] array = new Item[1];
		array[0] = new Item(3);
		SortAlgos.quickSort(array);
		
		assertTrue(array[0].key == 3);
	}

	@Test (expected=NullPointerException.class)
    public void forNullHeapSort() throws Exception {
       Item [] array = null;
       SortAlgos.heapSort(array);
       assertNull(array);
    }

	@Test
	public void descendingInputArray_6() throws Exception {
       Item [] array = new Item[3];
       array[0] = new Item(12);
       array[1] = new Item(11);
       array[2] = new Item(10);
       SortAlgos.heapSort(array);

       assertTrue(array[0].key == 10);
       assertTrue(array[1].key == 11);
       assertTrue(array[2].key == 12);
    }
	@Test
	public void ascendingInputArray_6() throws Exception {
		Item [] array = new Item[4];
		array[0] = new Item(21);
		array[1] = new Item(19);
		array[2] = new Item(20);
		array[3] = new Item(22);
		SortAlgos.heapSort(array);
		
		assertTrue(array[0].key == 19);
		assertTrue(array[1].key == 20);
		assertTrue(array[2].key == 21);		
	}
	@Test
	public void singleElementArray_6() throws Exception {
		Item [] array = new Item[1];
		array[0] = new Item(3);
		SortAlgos.heapSort(array);
		
		assertTrue(array[0].key == 3);
	}

}
