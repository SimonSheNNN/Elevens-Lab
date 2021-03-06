/**
 * This class provides a convenient way to test shuffling methods.
 */
public class Shuffler {

	/**
	 * The number of consecutive shuffle steps to be performed in each call
	 * to each sorting procedure.
	 */
	private static final int SHUFFLE_COUNT = 8;
	
	/**
	 * Tests shuffling methods.
	 * @param args is not used.
	 */
	public static void main(String[] args) {
		System.out.println("Results of " + SHUFFLE_COUNT +
								 " consecutive perfect shuffles:");
		int[] values1 = {0, 1, 2, 3};
		for (int j = 1; j <= SHUFFLE_COUNT; j++) {
			perfectShuffle(values1);
			System.out.print("  " + j + ":");
			for (int k = 0; k < values1.length; k++) {
				System.out.print(" " + values1[k]);
			}
			System.out.println();
		}
		System.out.println();

		System.out.println("Results of " + SHUFFLE_COUNT +
								 " consecutive efficient selection shuffles:");
		int[] values2 = {0, 1, 2, 3};
		for (int j = 1; j <= SHUFFLE_COUNT; j++) {
			selectionShuffle(values2);
			System.out.print("  " + j + ":");
			for (int k = 0; k < values2.length; k++) {
				System.out.print(" " + values2[k]);
			}
			System.out.println();
		}
		System.out.println();
	}


	/**
	 * Apply a "perfect shuffle" to the argument.
	 * The perfect shuffle algorithm splits the deck in half, then interleaves
	 * the cards in one half with the cards in the other.
	 * @param values is an array of integers simulating cards to be shuffled.
    */
	
	public static void perfectShuffle(int[] values) {
        int[] temp = new int[values.length];
        
      int  x=1;
        for( int i = 0; i < (values.length / 2); i++ ) {
            temp[x] = values[i];
            x=x+2;
        }
        
        x=0;
        for( int i = values.length / 2; i < values.length; i++ ) {
            temp[x] = values[ i];
            x=x+2;
        }
//TRANSFER
        for( int i = 0; i<values.length; i++ ) {
          values[i]=temp[i];
        }
    }

	
	
	public static void selectionShuffle(int[] values) {
		 for( int b = values.length - 1; b >= 0; b-- ) {
		        int a = (int)(Math.random() * b);
		        int store = values[a];
		        values[a] = values[b];
		        values[b] = store;
		 }
	}
}

