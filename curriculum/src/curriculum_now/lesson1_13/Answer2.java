//①配列aを作成し、1～5を格納してください。
//②参照型配列bを作成し、3を表示してください。
//③配列a[3]を10で上書きし表示してください。
//④配列aの要素数を「配列aの要素数は、○です。」という形で表示してください。
package curriculum_now.lesson1_13;

public class Answer2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int a[] = {1, 2, 3, 4, 5};
		int b[];
		
		b = a;
		
		System.out.println(b[2]);
		
		a[3] = 10;
		System.out.println(a[3]);
		
		System.out.println("配列aの要素数は" + a.length + "です。");
	}

}
