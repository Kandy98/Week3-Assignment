package part2;

public class FigWords {
	
	String[] tensNames = {"", " ten", " twenty", " thirty",
		    " forty", " fifty", " sixty", 
		    " seventy", " eighty", " ninety"};

	String[] numNames = {"", " one", " two", 
			" three", " four", " five"," six",
		    " seven"," eight", " nine", " ten", 
		    " eleven", " twelve", " thirteen", 
			" fourteen", " fifteen", " sixteen", 
			" seventeen", " eighteen", " nineteen"};
	
	String[] power = {" hundred", " thousand"};
	
	public void figToWords(long fig) {
		
		if(fig==0) {
			System.out.println("zero");
			return;
		}
		
		else if(fig<20) {
			System.out.print(numNames[(int)fig]);
			return;
		}
		
		else if(fig<1000) {
			int temp = (int)fig;
			String word = "";
			word = numNames[temp/100] + power[0];
			temp %= 100;
			word = word + tensNames[temp/10];
			temp %= 10;
			word = word + numNames[temp];
			System.out.println(word);
			return;
		}
		
		else if(fig<20000) {
			int temp = (int)fig;
			String word = "";
			word = numNames[temp/1000] + power[1];
			temp %= 1000;
			word = word + numNames[temp/100] + power[0];
			temp %= 100;
			word = word + tensNames[temp/10];
			temp %= 10;
			word = word + numNames[temp];
			System.out.println(word);
			return;
		}
	}
	
}
