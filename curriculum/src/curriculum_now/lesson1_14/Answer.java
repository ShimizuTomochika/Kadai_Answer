//string型の配列を作成し、アルファベットa～jまでを格納してください。
//break文を使用し、a～dまで表示してください。
//cotinue文を使用し、i以外を表示してください。
package curriculum_now.lesson1_14;

public class Answer {

	public static void main(String[] args) {
		System.out.println("a～ｄまでの表示");
		String[]list = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
		for(int i = 0; i < list.length; i++ ) {
			if(i == 4) {
				break;
			}
			System.out.println(list[i]);
		}
		System.out.println("i以外の表示");
		for(int i = 0; i < list.length; i++ ) {
			if(i == 8) {
				continue;
			}
			System.out.println(list[i]);
		}
	}

}
