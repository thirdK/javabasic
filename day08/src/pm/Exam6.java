package pm;

public class Exam6 {
	public static void main(String[] args) {
		Animal bird = new Bird();
		Animal cat = new Cat();
		Animal dog = new Dog();
		
//		Animal[] a = new Animal[10];
//		a[0] = bird;
//		a[1] = cat;
		
		Animal[] animals = {bird, cat, dog};
		for(Animal a : animals) {
			a.cry();
		}
	}
}

class Animal {
	void cry() {}
}

class Bird extends Animal {
	void cry() {
		System.out.println("짹짹");
	}
}

class Cat extends Animal{
	void cry() {
		System.out.println("야옹");
	}
}

class Dog extends Animal{
	void cry() {
		System.out.println("멍멍");
	}
}