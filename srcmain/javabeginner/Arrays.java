package javabeginner;

public class Arrays {
	public Arrays() {

		int[] intArray = new int[10];  
		intArray[0] = 10; 
		intArray[1] = 3; 
		intArray[2] = 7; 
		intArray[3] = 1; 
		intArray[4] = 12; 
		intArray[5] = 17; 
		intArray[6] = 16; 
		intArray[7] = 15; 
		intArray[8] = 13; 
		intArray[9] = 11; 
		
	        for(int i : intArray) {
	            for(int j = 0; j < intArray.length; j++) {
	                if(intArray[j] == i) {
	                    System.out.println("i:" + i + " j:" + j + " i and j match");
		
	}	
}
}}
}
