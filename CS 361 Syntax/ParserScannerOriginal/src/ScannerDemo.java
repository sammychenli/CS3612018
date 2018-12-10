/**
 * @author Christelle
 * 
 */
public class ScannerDemo {
	
	private static String prog1 = "/Users/sammychenli/eclipse-workspace/ParserScannerTests/SCANNER/prog1.jay";
	private static String prog2 = "/Users/sammychenli/eclipse-workspace/ParserScannerOriginal/src/prog2.jay";
	private static String prog3 = "/Users/sammychenli/eclipse-workspace/ParserScannerOriginal/src/moreScannerTests.jay";
	
	private static int counter = 1;

	public static void main(String args[]) {

		TokenStream ts = new TokenStream(prog3);

		System.out.println("The Path: "+prog3);

		while (!ts.isEndofFile()) {
			Token t = ts.nextToken();
			System.out.println("Counter:" + counter + " | " + t.toString());
//			System.out.println(t.toString());
			counter++;
		}
	}
}
