package curriculum_now.lesson1_31;

//import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		Person person1 = new Person("鈴木", "太郎", 20, 1.7, 60.0);
		Person person2 = new Person("山田", "花子",22,1.5,50.0);
		
		Car car = new Car();
		Bicycle bicycle = new Bicycle();
		
		// ownerを設定
		car.setOwner(person1.fullName()); // 車の所有者
		bicycle.setOwner(person2.fullName()); // 自転車の所有者
		System.out.println(car.getOwner());
		System.out.println(bicycle.getOwner());
		
		// 乗り物の購入（buyメソッドの処理）
		person1.buy(car);
		person2.buy(bicycle);
		
//		person1.print();
//		person2.print();
		
//		Person.printCount();
	}

}
