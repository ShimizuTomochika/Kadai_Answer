/*
 
	下記がコンソールに出力されるように作成してください
	
		こんにちは！ここは日本です！
		この寿司はうまい
		寿司は和食です
		今の現在日時は2023/03/09 10:23:39です

	【条件】
		・JavaProjectを新規作成し、実行用のpackageと処理用のpackageを作成してください。
		・適切なファイルにフィールドで変数を必要な数作ってください。
		・thisを使って作成してください。
		・日時は今日の日付を取得してください。
		
  */
package curriculum_now.lesson1_22main; // 実行用パッケージ

import curriculum_now.lesson1_22execution.Answer22Ex;

public class Answer22main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Answer22Ex j = new Answer22Ex(); // インスタンスの生成
		j.greeting();
		j.appraise();
		j.categorize();
		j.create();
	}
}