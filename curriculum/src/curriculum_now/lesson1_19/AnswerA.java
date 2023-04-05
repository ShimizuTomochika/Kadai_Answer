package curriculum_now.lesson1_19;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
public class AnswerA {
	
	public static void main(String[] args) {
		// Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。
		AnswerD a = new AnswerD(null);
		System.out.println(a.animalName);
		
		// Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。
		AnswerD b = new AnswerD(10);
		System.out.println(b.animalCount);
		
		// 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください
		LocalDateTime nowDate = LocalDateTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd H:m:s");
		String formatNowDate = dtf.format(nowDate);
		System.out.println(formatNowDate);
		
		System.out.println("別表現");
		Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd H:m:s");
        System.out.println(sdf.format(cal.getTime()));
	}
}
