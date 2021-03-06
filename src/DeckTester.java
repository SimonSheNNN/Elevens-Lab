/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String[] rank1 = {"Jack", "Queen", "King"};
		String[] suit1 = {"Hearts", "Spades", "Diamonds"};
		int[] value1 = {11, 12, 13};
		Deck deck1 = new Deck(rank1, suit1, value1);
	    System.out.println("Deck1 size is: " + deck1.size());
			
	    String[] rank2 = {"1", "2", "3"};
		String[] suit2 = {"Hearts", "Spades", "Diamonds"};
		int[] value2 = {1, 2, 3};
		Deck deck2 = new Deck(rank2, suit2, value2);
		System.out.println("Is deck 2 empty? : " + deck2.isEmpty());
	    
	    String[] rank3 = {"5", "8", "king"};
		String[] suit3 = {"Hearts", "Spades", "Diamonds"};
		int[] value3 = {5, 8, 13};
		Deck deck3 = new Deck(rank3, suit3, value3);
		System.out.println("Deck3 dealt card is: " + deck3.deal());
		
		String[] rank4 = {"1","2","3","4","5","6","7"," 8","9","10","jack","queen","king"};
		String[] suit4 = {"Hearts", "Spades", "Diamonds","club"};
		int[] value4 = {1,2,3,4,5,6,7,8,9,10,11,12,13};
		Deck deck4 = new Deck(rank4, suit4, value4);
		deck4.shuffle();
		System.out.println("Deck3 dealt card is: " + deck4.deal());
		
		
		int[] value5 = {18, 14, 11, 13, 12};
		int[] value6 = {11, 12, 13, 14, 18};
		
		System.out.println(arePermutations(value5, value6));
		
	}
	
	public static boolean arePermutations(int[] a, int[] b){
	    for(int i = 0; i < a.length; i++){
	        boolean test1 = false;
	        for(int k = 0; k < b.length; k++){
	            if(a[i] == b[k]){
	                test1 = true;
	            }
	        }
	        if(test1){
	            return true;
	        }

	    }
	    return false;
	}
	
	
}

