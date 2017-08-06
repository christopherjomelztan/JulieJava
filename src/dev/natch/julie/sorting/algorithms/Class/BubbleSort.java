package dev.natch.julie.sorting.algorithms.Class;

import java.util.List;

import dev.natch.julie.sorting.algorithms.Interface.ISortedList;

public class BubbleSort implements ISortedList {
	
	public List<Integer> Sort(List<Integer> unsorted) {
        int temp;

        for (int i = 1; i <= unsorted.size(); i++)
            for (int j = 0; j < unsorted.size() - i; j++)
                if (unsorted.get(j) > unsorted.get(j + 1))
                {
                    temp = unsorted.get(j);
                    unsorted.set(j,unsorted.get(j + 1));
                    unsorted.set(j + 1, temp);
                }
        return unsorted;
        
	}

}
