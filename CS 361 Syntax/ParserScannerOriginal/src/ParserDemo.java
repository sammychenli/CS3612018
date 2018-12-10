public class ParserDemo {
	
	private static String moreParserTests = "/Users/sammychenli/eclipse-workspace/ParserScannerOriginal/src/moreParserTests.jay";
	private static String prog2 = "/Users/sammychenli/eclipse-workspace/ParserScannerTests/PARSER/prog2.jay";
	private static String prog3 = "/Users/sammychenli/eclipse-workspace/ParserScannerTests/PARSER/prog3.jay";
	private static String prog4 = "/Users/sammychenli/eclipse-workspace/ParserScannerTests/PARSER/prog4.jay";
	private static String prog5 = "/Users/sammychenli/eclipse-workspace/ParserScannerTests/PARSER/prog5.jay";
	private static String prog6 = "/Users/sammychenli/eclipse-workspace/ParserScannerTests/PARSER/prog6.jay";
	private static String prog7 = "/Users/sammychenli/eclipse-workspace/ParserScannerTests/PARSER/prog7.jay";
	
	
	public static void main(String[] args) {
		TokenStream tStream = new TokenStream(moreParserTests);
		ConcreteSyntax cSyntax = new ConcreteSyntax(tStream);
		Program p = cSyntax.program();
		System.out.println(p.display());
	}

}
