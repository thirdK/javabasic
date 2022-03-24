package pm;

import java.util.LinkedList;
import java.util.List;

public class Exam6 {
/*
Linked List 연결리스트
List<E>의 모든 공통 특징을 다 가지고 있다.
(동질 자료, 동적 할당, 추가/변경/삭제 동일한 메서드사용)

1. LinkedList<E>는 객체를 생성할때 저장 용량을 지정할 수 없다.
2. 내부적으로 데이터를 저장하는 방식이 좀 다르다.
 */
	
	public static void main(String[] args) {
		List<Integer> linkedList1 = new LinkedList<>();
		
	}
/*
만약 7개의 데이터를 가진 ArrayList에서 2번 인덱스에 데이터를 추가하고자 한다면 기존 2번 이후의 모든 데이터가 한칸씩
뒤로 밀려나게 된다. 그러면 밀려나는 모든 데이터의 위치 정보가 모두 수정되야한다.
LinkedList는 각 원소 앞뒤 정보를 저장하고 있으므로 어딘가에 값이 추가되면 값이 추가된 위치의 앞뒤 데이터만 수정하면된다.
따라서 추가 삭제에 속도가 빠르다.

단, 각 원소가 자신의 인덱스 정보를 갖고 있지는 않다. 특정 인덱스 위치의 값을 가져오기 위해서는 앞에서부터 차례로 번호를
세어가면서 인덱스의 위치를 찾아야한다. 반면 ArrayList는 데이터 자체에 인덱스 번호를 갖고 있으므로 특정 인덱스 위치의
데이터를 빠르게 찾을 수 있다.

데이터 추가 삭제는 LinkedList 가 빠름
찾을때는 ArrayList 가 빠름
 */
}
