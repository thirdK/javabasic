package pm;

import java.util.HashSet;

public class Exam8 {
	public static void main(String[] args) {
		// Set 컬렉션
		// 동일한 타입의 묶음이라는 특징은 그대로 갖고 있지만 인덱스 정보를 포함하지 않는
		// 즉 집합의 개념과 같은 컬렉션이다. 인덱스가 없으므로 데이터를 중복해서 저장하면
		// 중복된 데이터 중 특정 데이터를 꺼낼 방법이 없다. 즉 set은 동일한 데이터의 중복을 
		// 사용하지 않는다.
		
		HashSet hSet1 = new HashSet();
		
		hSet1.add("가");
		hSet1.add("나");
		hSet1.add("다");
		
		System.out.println(hSet1);
		
		HashSet hSet2 = new HashSet();
		hSet2.add("나");
		hSet2.add("다");
		
		System.out.println(hSet2);
		
		hSet2.addAll(hSet1);
		
		System.out.println(hSet2);
		
		hSet2.remove("나");
		System.out.println(hSet2);
		
		hSet2.clear();
		System.out.println(hSet2);
		
		//HashSet은 데이터의 중복을 허용하지 않는다. 즉 같은 데이터를 2개 이상 포함할 수 없다.
		//여기서 생각해 볼것은 '데이터가 같다' 또는 '데이터가 다르다.' 의 기준을 무엇일까?
		//예를들면 3과 3은 같은 데이터이다. 즉 2개 이상을 저장할 수 없다.
		//A a1 = new A(3) 과   A a2 = new A(3) 생성자에 동일한 값을 넘겨서 객체를
		//생성 했으므로 두 객체는 완벽히 똑같다. 하지만 Set의 관점에서는 다른 객체이다.
		//즉 둘다 저장할 수 있다. 똑같은 예로 
		//String s1 = new String("hi");  String s2 = new String("hi");
		
		//해시코드의 개념 - 객체의 해시코드는 객체가 저장된 주소와 관련된 값으로 실제 번지 값은 아니다.
		//				객체가 저장된 번지를 기준으로 생성된 정수형 고유값이 바로 해시코드 이다.
		
		
		A a = new A(3);
		A b = new A(3);
		
		System.out.println(a==b);
		System.out.println(a.equals(b));
		
		String s = "";
		a.equals("");
	}
}

class A {
	int data;
	public A(int data) {
		this.data = data;
	}
}



























