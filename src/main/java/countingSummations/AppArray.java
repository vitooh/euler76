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
		min = 101; //just to simplify, if run above 101 may cause errors
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

	AppArray flatten() {
		System.out.print("Flatten: "+Arrays.toString(this.array));
		int[] temp = this.array;
		temp = decrementMax(temp);
		temp = incrementMin(temp);
		System.out.println("=>"+Arrays.toString(temp));
		return new AppArray(temp);
	}

	int[] decrementMax(int[] temp) {
		for (int i = 0; i < temp.length; i++) {
			if (temp[i] == this.max) {
				temp[i]--;
				return temp;
			}
		}
		return temp;
	}

       int[] incrementMin(int[] temp) {
                for (int i = temp.length-1; i >= 0; i--) {
                        if (temp[i] == this.min) {
                                temp[i]++;
				return temp;
                        }
                }
                return temp;
        }
}
