package array.sort.program;

import java.util.Arrays;

public class StringArraySorting {
	
	
	public static String[] sortingValues(String[] data,boolean asc){
		
		int length = data.length;

        for (int i = 1; i < length; i++) {
            String current_value = data[i];
            int j = i - 1;

            if (asc) {
                // Sort in ascending order
                while (j >= 0 && data[j].compareTo(current_value) > 0) {
                    data[j + 1] = data[j];
                    j--;
                }
            } else {
                // Sort in descending order
                while (j >= 0 && data[j].compareTo(current_value) < 0) {
                    data[j + 1] = data[j];
                    j--;
                }
            }

            data[j + 1] = current_value;
        }

        return data;
		
		
	}
	
	
	public static void main(String arg[]){
		 // Sample array of strings
        String[] fruits = {"Banana", "Apple", "Mango", "Cherry", "Blueberry"};
        String[] sorted = sortingValues(fruits, true); // true for ascending
        System.out.println(Arrays.toString(sorted));
        
	}

}
