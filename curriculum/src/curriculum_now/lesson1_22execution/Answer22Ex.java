package curriculum_now.lesson1_22execution; // 処理用パッケージ

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Answer22Ex {
	// 適切なファイルにフィールドで変数を必要な数作ってください。
	public String hello;
	public String country;
	public String food;
	public String taste;
	public String category;
	
	// thisを使って作成してください。
	public void greeting() { // こんにちは！ここは日本です！
		this.hello = "こんにちは!";
		this.country = "日本";
		if(Objects.nonNull(hello) && Objects.nonNull(country)) { // 変数helloとcountryがnullでなけれ
			System.out.println(hello + "ここは" + country + "です！");
		}else {
			throw new IllegalArgumentException("挨拶または国名がnullです。処理中断");
		}
	}
	
	public void appraise(){ // この寿司はうまい
		this.food = "寿司";
		this.taste = "うまい";
		if(Objects.nonNull(food) && Objects.nonNull(taste)) { // 変数foodとtasteがnullでなけれ
			System.out.println("この" + food + "は" + taste);
		}else {
			throw new IllegalArgumentException("食品名または味の評価がnullです。処理中断");
		}
	}
	
	public void categorize() { // 寿司は和食です
		this.category = "和食";
		if(Objects.nonNull(food) && Objects.nonNull(category)) { // 変数foodとcategoryがnullでなけれ
			System.out.println(food + "は" + category + "です");
		}else {
			throw new IllegalArgumentException("食品名または食のカテゴリーがnullです。処理中断");
		}
	}
	
	// 日時は今日の日付を取得してください。
	public void create() { // 今の現在日時は2023/03/09 10:23:39です
		LocalDateTime nowDate = LocalDateTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd H:m:s");
		String formatNowDate = dtf.format(nowDate);
		System.out.println("今の現在日時は" + formatNowDate + "です");
	}
	
}
