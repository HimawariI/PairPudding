package translate;

import java.util.Scanner;

public class IntToEng {

    // メインメソッド
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        System.out.println(translateEng(input));

    }

    // 数値を英訳する変換するメソッド
    public static String translateEng(int n) {
    	String english = "";
    	String[] numbers =
    		{"zero", "one", "two","three", "four", "five",
    				"six", "seven", "eight", "nine", "ten",
    				"eleven", "twelve","thirteen", "fourteen","fifteen",
    				"sixteen", "seventeen", "eighteen","nineteen"};
    	String[] prefixNumbers =
    		{"twenty","thirty","forty","fifty","sixty", "seventy",
    				"eighty", "ninety"
    		};
    	if(n>19 && n%10 !=0){
    		english = prefixNumbers[(n/10)-2]+"-"+numbers[n%10];
    	}else if(n>19 &&n%10==0){
    		if(n/10 != 10){
    			english = prefixNumbers[(n/10)-2];
    		}else{
    			return "hundred";
    		}
    	}else{
    		english = numbers[n];
    	}
        return english;
    }
}
