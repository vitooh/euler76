package countingSummations;

import java.util.*; 
import java.io.*; 


public class App 
{
    public static void main( String[] args )
    {
	int theNumber = 3;
	if (args.length > 0)  theNumber = Integer.parseInt(args[0]);
	System.out.println(Arrays.toString(args));
	int result=0;
	for (int i = theNumber; i>1; i--) {
		AppArray appArray = new AppArray(buildArray(theNumber,i));
		//System.out.println("for"+Arrays.toString(appArray.array)+"count: "+result);
		if (appArray.ballanced == false) {
			result++;
			System.out.println("for count++: "+result);
		}
		do {
			System.out.println("do-start"+Arrays.toString(appArray.array)+"count: "+result);
			result++;
			System.out.println("do count++: "+result);
			appArray = flatArray(appArray);
			System.out.println("do-end"+Arrays.toString(appArray.array)+"count: "+result);
		} while (!appArray.ballanced);

	}
	System.out.println("Result: "+result);
    }

    static boolean isBallanced(int[] table) {
	AppArray array = new AppArray(table);
	return array.ballanced;
    }

    static int[] buildArray(int total, int numberOfElements) {
	int[] result = new int[numberOfElements];
	int last = total - numberOfElements + 1;
	for (int i = 0; i < numberOfElements-1; i++) result[i]=1;
	result[numberOfElements-1] = last;
	return result;
    }

    static AppArray flatArray(AppArray before) {
	if (before.ballanced) return before;
	return before.flatten();
    }
}
