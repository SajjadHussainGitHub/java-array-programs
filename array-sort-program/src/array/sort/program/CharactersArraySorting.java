package array.sort.program;

public class CharactersArraySorting {
	
	
	
	public static char[] sortingArray(char[] data){
		
		int lenght= data.length;
		for (int second_element_index = 1; second_element_index < lenght; second_element_index ++){ //start from 2nd element index
			char current_value= data[second_element_index]; //second index element 
			int start_element_indx = second_element_index -1; // first element index;
			while (start_element_indx >=0 && data[start_element_indx] > current_value){
				data[start_element_indx+1]=data[start_element_indx];
				start_element_indx--;
			}
			data[start_element_indx+1]=current_value;
		}
		return data;
	}
	
	
	public static char[] descendingOrder(char[] data){
			int length = data.length;
			for(int index= 1; index < length; index ++){
				char next_value = data[index];
				int start_value_index=index -1;
				while(start_value_index >=0 && data[start_value_index] < next_value){
					data[start_value_index+1]= data[start_value_index];
					start_value_index--;
				}
				data[start_value_index+1]=next_value;
			}
		return data;
	}
	
	public static void main(String arg[]){
		char[] chars={'b','a','d','c','l','m','e'};		
	//	System.out.println(sortCharsArray(chars));
		
		System.out.println(sortedArray(chars));
		
		
	}

	
	
	
	public static char[] sortedArray(char[] data){
		
		
		int length = data.length;
		for(int i=1; i < length; i++){
			
			char current_value= data[i];
			int j=i-1; //first index
			
			
			while(j >=0 && data[j]>data[i]){
				data[j+1]=data[j];
				j--;
				
			}
			
			data[j+1]=current_value;
		}
		
		return data;
		
	}
}
