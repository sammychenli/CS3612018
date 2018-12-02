/**
 * @author Christelle
 * 
 */
public class ScannerDemo {
	
	private static String prog1 = "/Users/sammychenli/Desktop/ParserScannerTests/SCANNER/prog1.jay";
	private static String prog2 = "/Users/sammychenli/Desktop/ParserScannerOriginal/src/prog2.jay";
	
	private static int counter = 1;

	public static void main(String args[]) {

		TokenStream ts = new TokenStream(prog2);

		System.out.println("The Path: "+prog2);

		while (!ts.isEndofFile()) {
			Token t = ts.nextToken();
			System.out.println(t.toString());
			counter++;
		}
	}
}
