package translate;

import java.util.Scanner;

public class IntToEng {
	
	
	private static final String[] NUMBERS=
	{"zero", "one", "two","three", "four", "five",
		"six", "seven", "eight", "nine", "ten",
		"eleven", "twelve","thirteen", "fourteen","fifteen",
		"sixteen", "seventeen", "eighteen","nineteen"
		};
	
	private static final String[]PREFIXNUMBERS={
			"twenty","thirty","forty","fifty","sixty", "seventy",
			"eighty", "ninety"};

    // メインメソッド
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        System.out.println(translateEng(input));

    }

    // 数値を英訳する変換するメソッド
    public static String translateEng(int n) {
    	/*String[] numbers =
    		{"zero", "one", "two","three", "four", "five",
    				"six", "seven", "eight", "nine", "ten",
    				"eleven", "twelve","thirteen", "fourteen","fifteen",
    				"sixteen", "seventeen", "eighteen","nineteen"};
    	String[] prefixNumbers =
    		{"twenty","thirty","forty","fifty","sixty", "seventy",
    				"eighty", "ninety"
    		};*/
    		if(n<=100){
    			return Under100(n);
    		}else{
    			return Over100(n);
    		}
    	
    	
    	}
    	public static String Under100(int n){
    		
    	
    	
    	if(n>19 && n%10 !=0){
    		return PREFIXNUMBERS[(n/10)-2]+"-"+NUMBERS[n%10];
    	}else if(n>19 &&n%10==0){
    		if(n/10 != 10){
    			return PREFIXNUMBERS[(n/10)-2];
    		}else{
    			return "hundred";
    		}
    	}
    		return NUMBERS[n];
    }
    	public static String Over100(int n){
    		
    		
    		return "";
    		
    	}
    	
}
