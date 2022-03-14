package pm;

class Human {
	String name;
	int age;
	void eat() {};
	void sleep() {};
}

class Student extends Human{
	int studentID;
	void goToSchool() {}
}

class Worker extends Human{
	int workerID;
	void goToWork() {}
}

public class Exam4_1 {
	public static void main(String[] args) {
		Human h = new Human();
		h.name = "홍길동";
		h.age = 13;
		h.eat();
		h.sleep();
		
		Student s = new Student();
		s.name = "ㅁ";
		s.age = 3;
		s.eat();
		s.sleep();
		s.goToSchool();
	}
}


