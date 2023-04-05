package curriculum_now.lesson1_30;

public class Person {
	String name;
	int age;
	double height;
	double weight;
	public static int count = 0;
	
	Person(String name,int age,double height,double weight){
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		count += 1;
	}
	
	public double bmi() {
		double bmi = weight / (height * height);
		return bmi;
	}
	
	public void print() {
		System.out.println("名前は" + name + "です");
		System.out.println("BMIは" + Math.floor(bmi()) + "です");
		System.out.println("年は" + age);
		System.out.println("");
	}
	
	public static void printCount() {
		System.out.println("合計" + count + "人です");
	}
	
} // public class Person 
