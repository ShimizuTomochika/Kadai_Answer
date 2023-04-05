package curriculum_now.lesson1_27;
/*

	コンソールに下記が入力されたときにコンソール出力結果がコンソールに表示されるように作ってください
	ライオン:2.1:80,ゾウ:3.2:40,パンダ:1.9:30,チンパンジー:0.94:25,シマウマ:2.4:65,インコ:0.1:50
	
	コンソール出力結果
	
	コンソールに文字を入力してください
	動物名：ライオン
体長：2.1m
速度：80km/h
学名：パンテラ レオ

動物名：ゾウ
体長：3.2m
速度：40km/h
学名：ロキソドンタ・サイクロティス

動物名：パンダ
体長：1.9m
速度：30km/h
学名：アイルロポダ・メラノレウカ

動物名：チンパンジー
体長：0.94m
速度：25km/h
学名：パン・トゥログロディテス

動物名：シマウマ
体長：2.4m
速度：65km/h
学名：チャップマンシマウマ

動物名：インコ
体長：0.1m
速度：50km/h
学名：不明


*/

public class AnimalBean {
	//フィールド宣言

	// 名前
	private  String name;

	//体長
	private double height;

	//速度
	private int speed;

	// 名前を設定するメソッド
	public void setName(String na) {
		this.name = na;
	}

	// 名前を取得するメソッド
	public String getName() {
		return this.name;
	}

	// 体長を設定するメソッド
	public void setHeight(double he) {
		this.height = he;
	}

	// 体長を取得するメソッド
	public double getHeight() {
		return this.height;	
	}

	// 速度を設定するメソッド
	public void setSpeed(int sp) {
		this.speed = sp;
	}

	// 速度を取得するメソッド
	public int getSpeed() {
		return this.speed;
	}

}
