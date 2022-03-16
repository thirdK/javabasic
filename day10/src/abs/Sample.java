package abs;

//interface BarkablePredator extends Predator, Barkable{
//	
//}

abstract class Predator extends Animal{
	abstract String getFood();
	
	void printFood() {
		System.out.printf("my food is %s\n", getFood());
	}
	
	static final int LEG_COUNT = 4;
	
	static int speed() {
		return LEG_COUNT * 30;
	}
}

interface Barkable{
	void bark();
}

class Animal{
	String name;
	
	void setName(String name) {
		this.name = name;
	}
}

class Tiger extends Predator implements  Barkable{
	@Override
	public String getFood() {
		return "apple";
	}
	@Override
	public void bark() {
		System.out.println("어흥");
	}
}

class Lion extends Predator implements Barkable{ 
	@Override
	public String getFood() {
		return "banana";
	}
	@Override
	public void bark() {
		System.out.println("으르렁");
	}
}





class ZooKeeper {
	void feed(Predator predator) {
		System.out.println("feed " + predator.getFood());
	}
	
//	void feed(Tiger tiger) {
//		System.out.println("feed apple");
//	}
//	void feed(Lion lion) {
//		System.out.println("feed banana");
//	}
//	
//	void feed(Crocodile crocodile) {
//		System.out.println("feed strawberry");
//	}
//	
//	void feed(Leopard leopard) {
//		System.out.println("feed orange");
//	}
}

class Bouncer {
	
	void barkAnimal(Barkable animal) {
		animal.bark();
	}
	
//	void barkAnimal(Animal animal) {
//		if(animal instanceof Tiger) {
//			System.out.println("어흥");
//		} else if(animal instanceof Lion) {
//			System.out.println("으르렁");
//		}
//	}
}

public class Sample {
	public static void main(String[] args) {
		ZooKeeper zooKeeper = new ZooKeeper();
		Tiger tiger = new Tiger();
		Lion lion = new Lion();
		tiger.printFood();
		zooKeeper.feed(tiger);
		lion.printFood();
		zooKeeper.feed(lion);
		
		System.out.println(Predator.speed());
		
		Bouncer bouncer = new Bouncer();
		bouncer.barkAnimal(tiger);
		bouncer.barkAnimal(lion);
	}
}
















