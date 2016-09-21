package countstrings;

public class CountStringsMain {

	public static void main(String[] args) {
		try  {
			CountStrings c1 = new CountStrings("34567");
			c1.printAllStrings();			
			
			c1 = new CountStrings("");
			c1.printAllStrings();	

			c1 = new CountStrings("134567");
			c1.printAllStrings();	

			c1 = new CountStrings("1234567");
			c1.printAllStrings();	

			c1 = new CountStrings("12111345617");
			c1.printAllStrings();	

			c1 = new CountStrings("1");
			c1.printAllStrings();	

			c1 = new CountStrings("2");
			c1.printAllStrings();	

			c1 = new CountStrings("341");
			c1.printAllStrings();	

			c1 = new CountStrings("342");
			c1.printAllStrings();	

			c1 = new CountStrings("3419");
			c1.printAllStrings();	

			c1 = new CountStrings("3429");
			c1.printAllStrings();	

			c1 = new CountStrings("3411");
			c1.printAllStrings();	

			c1 = new CountStrings("3422");
			c1.printAllStrings();	
}
		catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}
