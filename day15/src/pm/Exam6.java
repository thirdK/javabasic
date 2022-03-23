package pm;

public class Exam6 {
	public static void main(String[] args) {
		System.out.println("a");
		Goods goods1 = new Goods();
		goods1.setObject(new Apple2());
		Apple2 apple = (Apple2)goods1.getObject();
		
		Goods goods2 = new Goods();
		goods2.setObject(new Pencil2());
		Pencil2 pencil = (Pencil2)goods2.getObject();
		
		
		
		Goods goods3 = new Goods();
		goods3.setObject(new Apple());
		Pencil2 pencil2 = (Pencil2)goods3.getObject(); //컴파일 오류는 안나지만 런타임 오류가 발생한다.
		//이렇게 꺼내올 때마다 각각 타입에 맞는 형변환을 해줘야하고 잘못된 캐스팅을 할 경우 런타임 에러가 발생함
		//이러한 문제점을 해결해주는 것이 제네릭이다.(제네릭의 한가지 예일뿐 이 외에 다른 역할도 한다.)
		
	}
}
class Apple2{}
class Pencil2{}
class Goods{
	Object object = new Object();

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}
	
}


/*
class Goods{
	Object object = new Object();

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}
	
}
Object은 모든 타입의 객체 저장 가능하지만 이때 주의해야 할 점이 있다.
데이터를 저장할 때는 상관없지만 저장된 데이터를 각각의 타입으로 꺼내기 위해서는 저장된 형태로 캐스팅해야한다.
필드 자체가 Object 타입이기 때문에 get() 메서드로 가져오는 타입 또한 항성 Object타입이다.
따라서 Apple객체를 저장했을 때는 get() 메서드로 가져온 Object를 Apple타입 혹은 Pencil객체를 저장했을때는
가져온 Object 타입을 Pencil타입으로 각각 캐스팅 해야 한다.

하지만 실수로 Apple객체를 가져와서 Pencil객체로 캐스팅을 하게되면 잘못 캐스팅했을 때 발생하는 예외인 
ClassCastException 이 발생하고 실행 예외이기 때문에 문법오류는 발생이 되지 않는다.
잘못된 케스팅으로 실행 중에 예외가 발생되어 프로그램이 강제 종료될것이다.

 */


