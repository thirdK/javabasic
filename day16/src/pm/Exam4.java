package pm;

import java.util.ArrayList;
import java.util.List;

public class Exam4 {
/*
컬렉션 프레임 워크

 컬렉션 - 여러 데이터를 수집해 놓은 자료구조, 컬렉션의 가장 큰 특징은 데이터 저장 공간의 크기가 동적으로 변화한다는 것이다.
 
 - 컬렉션의 개념과 구조
 - List<E> 컬렉션 인터페이스
 - Set<E> 컬렉션 인터페이스
 - Map<K,V> 컬렉션 인터페이스
 - Stack<E> 컬레션 인터페이스
 - Queue<E> 컬렉션 인터페이스
 
 - 컬렉션의 개념과 구조
 
 컬렉션은 collection은 동일한 타입을 묶어 관리하는 자료구조를 말한다.
 우표 수집 컬렉션에는 우표만 넣듯 한 컬렉션에는 동일한 타입의 데이터만 모아 둘 수 있다.
 배열도 동일한 타입의 데이터를 묶어 관리를 하지만 배열은 컬렉션이 아니다.
 배열과 컬렉션의 차이는 바로 데이터의 저장을 동적으로 관리할 수 있느냐는 것이다.
 배열은 생성 시점에 저장 공간의 크기를 확정해야하고 나중에 변경할 수 없는 반면
 컬렉션은 데이터의 개수에 따라 얼마든지 동적으로 변화할 수 있다.
 따라서 컬렉션은 메모리가 허용하는 한 저장 데이터의 개수에 제약이 없다.
 
 컬렉션 프레임워크란...
	 프레임워크 framework 일반적으로 단순히 연관된 클래스와 인터페이스들의 묶음을 라이브러리라고 한다.
	 그런데 프레임 워크는 클래스 또는 인터페이스를 생성하는 과정에서 설계의 원칙 또는 구조에 따라 클래스 또는 인터페이스를
	 설계하고 이렇게 설계된 클래스와 인터페이스를 묶어 놓은 개념이다.
	 
 	컬렉션 프레임워큰느 컬렉션과 프레임워크가 조합된 개념으로
 	리스트, 스택, 큐, 트리 등 자료구조에 정렬 탐색 등의 알고리즘을 구조화해 놓은 프레임 워크이다.
 	쉽게 말하면 여러 데이터 묶음 자료를 효과적으로 처리하기위해 구조화된 클래스 또는 인터페이스의 모음으로 이해하자
 	
 	컬렉션								프레임워크
 	동일한 타입을 묶어 관리하는 자료구조			클래스와 인터페이스의 모음
 	저장 용량을 동적으로 관리					클레스의 정의에 설계원칙 또는 구조(철학)
 			|										|
 			|										|
 			|---------------------------------------|
 								|
 						컬렉션 프레임워크
 			리스트, 스택, 큐, 트리 등의 자료구조에 정렬 탐색등의
 				알고리즘을 구조화해 놓은 프레임워크
 	
 	- List<E> 컬렉션 인터페이스
 	리스트는 배열과 가장 비슷한 구조를 가지고 잇는 자료구조이다.
 	배열과 리스트의 가장 큰 차이점이 저장공간이 크기가 고정이냐 동적이냐의 차이다.
 	
 	배열의 특징
 	String[] arr = new String[]{"a","b","c","d","e"};
 	arr[2] = null;
 	arr[4] = null;
 	System.out.println(arr.length); // 5
 	
 	크기가 5인 문자열 배열을 생성하고 생성과 동시에 초기화 했다.
 	그런데 2개가 필요 없어졌다고 가정해 보면 배열은 최초로 지정된 크기를 변경할 수 없으므로
 	따라서 null값을 입력하는 것 말고는 할 수 있는게 없다. null 로 입력해도 여전히 그 크기는 5가 된다.
 	
 	리스트의 특징
 	List<String> aList = new ArrayList<>();
 	aList.add("a");
 	aList.add("b");
 	aList.add("c");
 	aList.add("d");
 	aList.add("e");
 	System.out.println(aList.size()); //5
 	aList.remove("c");
 	aList.remove("e");
 	System.out.println(aList.size()); //3
 	
 	리스트 생성
 	List<E>는 인터페이스이기 때문에 객체를 스스로 생성할수 없다. 따라서 객체를 생성하기 위해서는
 	LIst<E>를 구현 해서 자식클래스를 생성하고 그 생성한 자식 클래스를 이용해서 객체를 생성해야한다.
 	하지만 컬렉션 프레임워크를 이용할때는 직접 인터페이스를 구현하지 않아도 된다.
 	컬렉션 프레임워크 안에 이미 각각의 특성 및 목적에 맞는 클래스가 구현되어 있다.
 	
 	List<E> 인터페이스를 구현한 대표적인 클래스로는 크게
 	ArrayList<E>
 	Vector<E>
 	LinkedList<E> 가 있다. 이미 구현된 클래스들을 이용하여 List<E>객체를 생성할 수 있다.
 	
 	List<E> 자체가 제네릭 인터페이스이므로 이를 구현한 클래스들도 제네릭 클래스이다. 즉, 객체를 생성할때
 	타입을 지정해야만한다.
 	
 */
	
	public static void main(String[] args) {
		String[] arr = new String[]{"a","b","c","d","e"};
		System.out.println(arr.length); // 5
	 	arr[2] = null;
	 	arr[4] = null;
	 	System.out.println(arr.length); // 5
	 	
	 	List<String> aList = new ArrayList<>();
	 	aList.add("a");
	 	aList.add("b");
	 	aList.add("c");
	 	aList.add("d");
	 	aList.add("e");
	 	System.out.println(aList.size()); //5
	 	aList.remove("c");
	 	aList.remove("e");
	 	System.out.println(aList.size()); //3
	}
}





























