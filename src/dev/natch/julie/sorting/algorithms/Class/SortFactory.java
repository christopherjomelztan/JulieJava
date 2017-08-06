package dev.natch.julie.sorting.algorithms.Class;
import dev.natch.julie.sorting.algorithms.Interface.ISortFactory;
import dev.natch.julie.sorting.algorithms.Interface.ISortedList;
import java.lang.UnsupportedOperationException;

public class SortFactory implements ISortFactory {

	public ISortedList SortedList(String sortType) {
		// TODO Auto-generated method stub
		switch (sortType) { 
        case "Bubble Sort":
            return new BubbleSort();   
        default:
            throw new UnsupportedOperationException();
    }
	}

}
