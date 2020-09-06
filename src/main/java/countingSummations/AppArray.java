package countingSummations;

import java.util.*; 
import java.io.*; 

public class AppArray 
{
	int[] array;
	boolean ballanced;
	int max;
	int min;

	AppArray(int[] newArray) {
		array = newArray;
		min = array.length;
        	max = 0;
        	for (int element: array) {
                	if (element < min) min = element;
                	if (element > max) max = element;
        	}
        	if ( !(max-min > 1) ) ballanced = true;
//		System.out.println(Arrays.toString(array));
	}

	boolean isEqual(AppArray another) {
		return Arrays.equals(this.array, another.array);
	}
}
