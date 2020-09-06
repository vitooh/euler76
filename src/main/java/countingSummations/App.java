package countingSummations;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
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
	return new AppArray(new int[]{1});
    }
}
