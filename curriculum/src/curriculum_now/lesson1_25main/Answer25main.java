package curriculum_now.lesson1_25main;

import java.util.Scanner;

import curriculum_now.lesson1_25.Answer25Sub;
import curriculum_now.lesson1_25.Answer25Sub2;

public class Answer25main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Answer25Sub sub = new Answer25Sub();
		Answer25Sub2 sub2 = new Answer25Sub2();
		Scanner scan = new Scanner(System.in);
		String line = scan.nextLine(); 
		sub.hello(line);
		sub2.sub2();
	}
}
