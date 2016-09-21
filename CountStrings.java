package countstrings;
import java.util.ArrayList;
import java.util.Collections;

/* 
 * Class CountStrings
 * 
 * Assume a=1, b=2, ..., z=26,  Given an input String containing only integers, find all possible character codes 
 * that the string can translate to.  Print a count as well as the translated strings.
 */
public class CountStrings {
	
	private ArrayList<String> allStrings = new ArrayList<String>();
	private String originalIntStr;	

	/*
	 * The constructor builds the list of allStrings that can be translated from the input string. 
	 * 
	 * inInt - The input string of integers to be translated. 	 *  
	 */
	public CountStrings(String inInt) throws Exception {
		this.originalIntStr = inInt; 
		convertIntToString(inInt, "");
		return;
	}

	/*
	 * Recursively convert String of integers to String of translated characters. 
	 * The string of outLetters is incrementally built as the string of integers diminishes.  
	 * If the next integer has 2 possible conversions, recursively call this routine twice.
	 * 
	 * 	inInt - The input string of integers.  
	 * 	outLetters - The output string of translated letters, which is added to the list of AllStrings when complete. 
	 *  
	 */
	private void convertIntToString(String inInt, String outLetters) throws Exception {
		
		if (inInt.length() == 0) {
			allStrings.add(outLetters);
			return;
		}
		
		char char1 = inInt.charAt(0);
		switch (char1) {
		case '1': 
			if (inInt.length() == 1) {
				convertIntToString("", outLetters+"a");
				return;
			}
			else {
				// We know length of inInt is at least 2
				char char2 = inInt.charAt(1); 
				switch (char2) {
				case '0': 
					convertIntToString(inInt.substring(2), outLetters+"j");
					break;
				case '1': 
					convertIntToString(inInt.substring(2), outLetters+"k");
					convertIntToString(inInt.substring(1), outLetters+"a");
					break;
				case '2': 
					convertIntToString(inInt.substring(2), outLetters+"l");
					convertIntToString(inInt.substring(1), outLetters+"a");
					break;
				case '3': 
					convertIntToString(inInt.substring(2), outLetters+"m");
					convertIntToString(inInt.substring(1), outLetters+"a");
					break;
				case '4': 
					convertIntToString(inInt.substring(2), outLetters+"n");
					convertIntToString(inInt.substring(1), outLetters+"a");
					break;
				case '5': 
					convertIntToString(inInt.substring(2), outLetters+"o");
					convertIntToString(inInt.substring(1), outLetters+"a");
					break;
				case '6': 
					convertIntToString(inInt.substring(2), outLetters+"p");
					convertIntToString(inInt.substring(1), outLetters+"a");
					break;
				case '7':
					convertIntToString(inInt.substring(2), outLetters+"q");
					convertIntToString(inInt.substring(1), outLetters+"a");
					break;
				case '8':
					convertIntToString(inInt.substring(2), outLetters+"r");
					convertIntToString(inInt.substring(1), outLetters+"a");
					break;
				case '9': 
					convertIntToString(inInt.substring(2), outLetters+"s");
					convertIntToString(inInt.substring(1), outLetters+"a");
					break;
				default: 
					if (char2 == ' ') {
						throw new Exception("Invalid Input Character: Blanks not allowed!");
					}
					else
					{
						throw new Exception("Invalid Input Character: " + char2);
					}
				}		
			}
			break;
			
		case '2': 
			if (inInt.length() == 1) {
				convertIntToString("", outLetters+"b");
				return;
			}
			else {
				// We know lengthe of inInt is at least 2
				char char2 = inInt.charAt(1); 
				switch (char2) {
				case '0': 
					convertIntToString(inInt.substring(2), outLetters+"t");
					break;
				case '1': 
					convertIntToString(inInt.substring(2), outLetters+"u");
					convertIntToString(inInt.substring(1), outLetters+"b");
					break;
				case '2': 
					convertIntToString(inInt.substring(2), outLetters+"v");
					convertIntToString(inInt.substring(1), outLetters+"b");
					break;
				case '3': 
					convertIntToString(inInt.substring(1), outLetters+"w");
					break;
				case '4': 
					convertIntToString(inInt.substring(1), outLetters+"x");
					break;
				case '5': 
					convertIntToString(inInt.substring(1), outLetters+"y");
					break;
				case '6': 
					convertIntToString(inInt.substring(1), outLetters+"z");
					break;
				case '7':
				case '8':
				case '9': 
					convertIntToString(inInt.substring(1), outLetters+"b");
					break; 
				default: 
					if (char2 == ' ') {
						throw new Exception("Invalid Input Character: Blanks not allowed!");
					}
					else
					{
						throw new Exception("Invalid Input Character: " + char2);
					}
				}		
			}
			break;
			
		case '3': 
			convertIntToString(inInt.substring(1), outLetters+"c");
			break;
		case '4': 
			convertIntToString(inInt.substring(1), outLetters+"d");
			break;
		case '5': 
			convertIntToString(inInt.substring(1), outLetters+"e");
			break;
		case '6': 
			convertIntToString(inInt.substring(1), outLetters+"f");
			break;
		case '7': 
			convertIntToString(inInt.substring(1), outLetters+"g");
			break;
		case '8': 
			convertIntToString(inInt.substring(1), outLetters+"h");
			break;
		case '9': 
			convertIntToString(inInt.substring(1), outLetters+"i");
			break;		
		default: 
			if (char1 == ' ') {
				throw new Exception("Invalid Input Character: Blanks not allowed!");
			}
			else
			{
				throw new Exception("Invalid Input Character: " + char1);
			}
		}	
	}

	public void printAllStrings() {
		Collections.sort(allStrings);
		System.out.println("");
		System.out.println("Input String = " + originalIntStr);
		System.out.println("Total # of strings: " + allStrings.size());
		for (String outStr : allStrings) {
			System.out.println(outStr);
		}
		return;
	}
}
