package translate;

import java.util.Scanner;

public class IntToEng {

	private static final String[] NUMBERS = {
			"zero",
			"one",
			"two",
			"three",
			"four",
			"five",
			"six",
			"seven",
			"eight",
			"nine",
			"ten",
			"eleven",
			"twelve",
			"thirteen",
			"fourteen",
			"fifteen",
			"sixteen",
			"seventeen",
			"eighteen",
			"nineteen" };

	private static final String[] PREFIXNUMBERS = {
			"twenty",
			"thirty", 
			"forty", 
			"fifty", 
			"sixty", 
			"seventy", 
			"eighty",
			"ninety" };

	// メインメソッド
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();

		System.out.println(translateEng(input));
	}

	// 数値を英訳する変換するメソッド
	public static String translateEng(int n) {
		if (n <= 100) {
			return Under100(n);
		} else if(100<= n && n <=1000){
			return hundreds(n);
		}else{ 
			return thousands(n);
		}
	}

	//100以下の数値を英訳するメソッド
	public static String Under100(int n) {
		if (n > 19 && n % 10 != 0) {
			return PREFIXNUMBERS[(n / 10) - 2] + "-" + NUMBERS[n % 10];
		} else if (n > 19 && n % 10 == 0) {
			if (n / 10 != 10) {
				return PREFIXNUMBERS[(n / 10) - 2];
			} else {
				return "hundred";
			}
		}
		return NUMBERS[n];
	}
	//100番台の数値を英訳するメソッド
	public static String hundreds(int n) {
		if(n%100 ==0){
			return NUMBERS[n / 100] + "-hundred";
		}else if(n%1000 == 0){
			return "thousand";
		}
		return NUMBERS[n/100]+"-hundred-"+ Under100(n%100);
	}
	public static String thousands(int n) {
		if(n%1000 ==0){
			return NUMBERS[n / 1000] + "-thousand";
		}	else if(n%1000 <100){
			return NUMBERS[n/1000] + "-thousand-"+Under100(n%1000);
		}
		return NUMBERS[n/1000]+"-thousand-"+ hundreds(n%1000);
	}

}
