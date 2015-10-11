/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		
		Card fiveJack= new Card("5","jack",5);
		Card kingHeart1= new Card("king","heart",13);
		Card kingHeart2= new Card("king","heart",13);
		
		

		System.out.println("**** five of jack card test****");
		System.out.println("rank: " +fiveJack.rank());
		System.out.println("suit: "+fiveJack.suit());
		System.out.println("pointValue: "+fiveJack.pointValue());
		System.out.println("toString: "+fiveJack.toString());
		System.out.println("");
				
		System.out.println("**** king of heart 1 card test****");
		System.out.println("rank: " +kingHeart1.rank());
		System.out.println("suit: "+kingHeart1.suit());
		System.out.println("pointValue: "+kingHeart1.pointValue());
		System.out.println("toString: "+kingHeart1.toString());
		System.out.println("");
		
		System.out.println("**** king of heart 2 card test****");
		System.out.println("rank: " +kingHeart2.rank());
		System.out.println("suit: "+kingHeart2.suit());
		System.out.println("pointValue: "+kingHeart2.pointValue());
		System.out.println("toString: "+kingHeart2.toString());
		System.out.println("");
		
		System.out.println("**** card match test****");
		System.out.println("matching: " +kingHeart1.matches(kingHeart2));
		System.out.println("no matching: " +kingHeart1.matches(fiveJack));
		
	}
	
}
