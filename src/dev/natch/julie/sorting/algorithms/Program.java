package dev.natch.julie.sorting.algorithms;
import dev.natch.julie.sorting.algorithms.Class.Constants;
import dev.natch.julie.sorting.algorithms.Class.SortFactory;
import dev.natch.julie.sorting.algorithms.Interface.ISortFactory;
import dev.natch.julie.sorting.algorithms.Interface.ISortedList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		System.out.println(Constants.programName + " " + Constants.programVersion);
		Process();
	}
	
	public static void Process()
    {
		try (Scanner scanner = new Scanner(System.in)) {
	        String input = "";
	        String sortType = "";
	        System.out.println("Please enter your input numbers separated by comma: ");
	        input = scanner.nextLine();
	        System.out.println("Thank you. Please enter mode of sorting\n1. Quick Sort\n2. Merge Sort\n3. Heap Sort\n4. Bubble Sort");
	        sortType = scanner.nextLine();
	        
	        
	        List<String> unsortedString = Arrays.asList(input.split(","));
	        ISortFactory sortFactory = new SortFactory();
	        ISortedList sortedList = sortFactory.SortedList(sortType);
	        List<Integer> unsortedInt = new ArrayList<Integer>();
	        
	        for (Integer x = 0; x < unsortedString.size(); x++) {
	        	unsortedInt.add(Integer.parseInt(unsortedString.get(x)));
	        }
	        
	        for(Integer element : sortedList.Sort(unsortedInt)) {
	        	System.out.println(element);
	        }
	        
	        
	
	        System.out.println("Do you want to continue...");
	
	        switch(scanner.nextLine())
	        {
	            case "Y":
	                Process();
	                break;
	        }
		}
    }

}
