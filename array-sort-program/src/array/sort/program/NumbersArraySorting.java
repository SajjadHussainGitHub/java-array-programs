package array.sort.program;

public class NumbersArraySorting {
	
	
	public static int[] sortingValues(int[] data,boolean asc){
	
			int length = data.length;
			
			if(length!=0){

				for(int i=1; i <length; i ++){
					
					int current_value=data[i];
					int firstValueIndex= i-1;
				
				if(asc){
				
					while(firstValueIndex>=0 && data[firstValueIndex] > data[firstValueIndex+1]){
						data[firstValueIndex+1]=data[firstValueIndex];
						firstValueIndex--;
					}
					
				}else if(!asc){
					
					while(firstValueIndex>=0 && data[firstValueIndex] < data[firstValueIndex+1]){
						data[firstValueIndex+1]=data[firstValueIndex];
						firstValueIndex--;
					}
				}
				
				data[firstValueIndex+1]= current_value;
				
				}
			}
		
		return data;
		
	}
	
	public static void main(String arg[]){
		
		
		int[] data={10,30,20};
		int[] sortedValues=sortingValues(data, false);
		for(int i=0; i < sortedValues.length; i++){
			System.out.print(sortedValues[i]+" ,");
		}
		
		
	}

}
