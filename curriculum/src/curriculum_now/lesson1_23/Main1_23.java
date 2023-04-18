package curriculum_now.lesson1_23;

public class Main1_23 {

	public static void main(String[] args) {
	    // インスタンスの生成
		Sub1_23 sub1_23 = new Sub1_23();
		// インスタンスフィールドの「name」に値を設定する。
		sub1_23.setName("ライオン");
	    // インスタンスフィールドの「height」に値を設定する。
		sub1_23.setHeight(2.1);
	    // インスタンスフィールドの「speed」に値を設定する。
		sub1_23.setSpeed(80);
	    // インスタンスメソッドの呼び出し
	    write(sub1_23); 
	}
	
	// コンソール出力メソッド
	public static void write(Sub1_23 sub1_23) {

		System.out.println("動物名：" + sub1_23.getName());
		System.out.println("体長：" + sub1_23.getHeight() + "m");
		System.out.println("速度：" + sub1_23.getSpeed() + "km/h");
	}

	//新規クラスを別ファイルで作成し下記作業をしてください
	//クラスを作成してください
	//条件 アクセス修飾子：public クラス名：TestSub

	//フィールドを3つ作成しましょう
	//条件 アクセス修飾子：public String型 フィールド名：name

	//条件 アクセス修飾子：public int型 フィールド名：speed

	//条件 アクセス修飾子：public double型 フィールド名：height

	//各フィールドのsetterとgetterを作成してください
	//条件 アクセス修飾子：public 
	//メソッド名：set○○とget○○の形で○○の先頭文字は大文字で命名すること
	//例：sushi→Sushi
	//thisを使うこと

	//メソッドを作成してください
	//条件 アクセス修飾子：public メソッド名：write 引数無し
	//thisを使いprintlnを下記が出力されるように3つ作成してください
	//動物名：ライオン
	//体長：2.1m
	//速度：80km/h
}
