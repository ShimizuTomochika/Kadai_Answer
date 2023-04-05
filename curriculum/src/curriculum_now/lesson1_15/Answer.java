/*
①配列int test[][]に以下の成績を格納し、表示してください。
	出力結果：生徒1：国語64点、数学73点、英語69点
			  生徒2：国語58点、数学81点、英語75点
			  生徒3：国語86点、数学68点、英語79点
			  生徒4：国語72点、数学55点、英語80点
	
②それぞれの教科の平均点を表示してください。
	出力結果：国語の平均点は○○点です。
			  数学の平均点は○○点です。
			  英語の平均点は○○点です。
*/
package curriculum_now.lesson1_15;

public class Answer {

	public static void main(String[] args) {
		int test[][] = {{64, 73,69},{58,81,75},{86,68,79},{72,55,80}};
		System.out.println("生徒1:国語" + test[0][0] + "点、数学" + test[0][1] + "点、英語" + test[0][2] + "点");
		System.out.println("生徒2:国語" + test[1][0] + "点、数学" + test[1][1] + "点、英語" + test[1][2] + "点");
		System.out.println("生徒3:国語" + test[2][0] + "点、数学" + test[2][1] + "点、英語" + test[2][2] + "点");
		System.out.println("生徒4:国語" + test[3][0] + "点、数学" + test[3][1] + "点、英語" + test[3][2] + "点");
		// 平均値を求める処理
		int japanese = (test[0][0] + test[1][0] + test[2][0] + test[3][0])/test.length;
		int math = (test[0][1] + test[1][1] + test[2][1] + test[3][1])/test.length;
		int english = (test[0][2] + test[1][2] + test[2][2] + test[3][2])/test.length;
		System.out.println("国語の平均点は" + japanese + "点です。");
		System.out.println("算数の平均点は" + math + "点です。");
		System.out.println("英語の平均点は" + english + "点です。");
		
		System.out.print("\n");	
		System.out.println("別解答");
		//各生徒の成績を格納する配列
				int test1[][] = {
						{64, 73, 69}, {58, 81, 75}, {86, 68, 79}, {72, 55, 80}
				};
				//合計点を格納する配列
				int total[] = {0, 0, 0};
				
				//各生徒の点数表示
				for(int i = 0; i<test1.length; i++) {
					System.out.print("生徒" + (i+1) + ":");
					for(int j = 0; j< test1[i].length; j++) {
						switch(j) {
							case 0:
								System.out.print("国語");
								break;
							case 1:
								System.out.print("数学");
								break;
							case 2:
								System.out.print("英語");
								break;
							}
						System.out.print(test1[i][j] + "点、");
						
						//平均点のために合計点を算出
						total[j] += test1[i][j];
					}
				System.out.print("\n");	
				}
				//各教科の平均点
				System.out.println("国語の平均点は" + (total[0] / test1.length)+ "点です。" );
				System.out.println("算数の平均点は" + (total[1] / test1.length) + "点です。");
				System.out.println("英語の平均点は" + (total[2] / test1.length) + "点です。");
			
	}

}
