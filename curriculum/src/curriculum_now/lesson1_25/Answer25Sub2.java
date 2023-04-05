package curriculum_now.lesson1_25;

import java.util.Random;

public class Answer25Sub2 {
	public void sub2() {
		Answer25Sub sub = new Answer25Sub();
		Random rand = new Random();
		for(int i = 0;i < 5;i++) {
			int num = rand.nextInt(1000);
			switch(i){
			case 0:
				sub.setHp(num);
				break;
			case 1:
				sub.setMp(num);
				break;
			case 2:
				sub.setStr(num);
				break;
			case 3:
				sub.setAgi(num);
				break;
			case 4:
				sub.setDef(num);
				break;
			default :
				System.out.println("どれでもないよ！");
				break;
			}
		}
		sub.status();
	}

	public Answer25Sub2() {
		System.out.println("コンソールに名前を入力してください");
	}
}

