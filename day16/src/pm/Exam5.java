package pm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Exam5 {
/*
객체 생성 방법

	Arraqys.asList() 메서드를 사용한 정적 컬렉션 객체 생성은 내부적으로는 배열을 먼저 생성하고 이것을 List<E>로
	래핑 wrapping 즉 포장만 해 놓는다. 따라서 내부 구조는 배열과 동일하므로 컬렉션 객체인데도 크기 변경이 불가능하다.
	구현 클래스로 객체를 생성했을 때와 달리 데이터의 추가 삭제가 불가능해진다.
	단 크기를 변경하지 않는 데이터의 변경은 가능하다.
 */
	
	public static void main(String[] args) {
//		List<Integer> aList = new ArrayList<>(Arrays.asList(1,2,3,4));
//		
//		List<Integer> aList1 = Arrays.asList(1,2,3,4);
//		
//		aList.add(5); //추가 삭제 자유롭게 가능
//		aList1.set(1, 7); //수정은 되지만 추가 삭제는 불가능
//		//aList1.remove(2); 오류
//		
//		System.out.println(aList);
//		System.out.println(aList1);
//		========================================================================
//		List<Integer> aList1 = new ArrayList<>();
//		List<Integer> aList2 = new ArrayList<>(30);
//		List<Integer> aList3 = new Vector<>();
//		List<Integer> aList4 = new Vector<>(30);
//		List<Integer> aList5 = new LinkedList<>();
//		//List<Integer> aList6 = new LinkedList<>(30); 저장용량 지정 불가
//		=========================================================================
		List<Integer> aList1 = new ArrayList<>();
		//1. add - 끝에 계속 추가
		aList1.add(3);
		aList1.add(4);
		aList1.add(5);
		
		System.out.println(aList1.toString());
		
		//2. add - 위치 지정 삽입
		aList1.add(1, 6); // index, value
		System.out.println(aList1);
		
		//3.addAll - 다른 리스트를 통째로 넣기
		List<Integer> aList2 = new ArrayList<>();
		aList2.add(1);
		aList2.add(2);
		aList2.addAll(aList1);
		System.out.println(aList2);
		
		//4.addAll - 다른 리스트를 위치 지정하여 통째로 넣기
		List<Integer> aList3 = new ArrayList<>();
		aList3.add(1);
		aList3.add(2);
		aList3.addAll(1,aList2);
		System.out.println(aList3);
		
		//5.set
		aList3.set(1,5); //index, value
		System.out.println(aList3);
		
		//6.remove
		aList3.remove(1); //index
		System.out.println(aList3);
		
		aList3.remove(new Integer(2)); //value
		System.out.println(aList3);
		
		//7.clear
		aList3.clear();
		System.out.println(aList3);
		
		//8.isEmpty
		System.out.println(aList3.isEmpty());
		
		//9.size
		System.out.println(aList3.size());
		
		//10.get
		System.out.println(aList2.get(2));
		
		for(int i=0; i<aList2.size(); i++) {
			System.out.println(i + "번째 : " + aList2.get(i));
		}
	}
}





















