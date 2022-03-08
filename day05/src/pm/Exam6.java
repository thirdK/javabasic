package pm;

public class Exam6 {
	public static void main(String[] args) {
		//문자열 관련 메서드 정리
		
		//.length	 			문자열 길이 -> 빈칸도 글자로 count된다.
		//.charAt(idx) 			index에 해당하는 문자 반환
		//.indexOf("s") 		해당 글자가 위치한 index반환
		//.lastIndexOf("s")		뒤에서 부터 해당 글자를 찾아내고 위치한 index반환(index번호는 정방향)
		//.concat(obj2)			두 문자열을 연결하여 반환
		//.toLowerCase()		소문자로  반환
		//.toUpperCase()		대문자로  반환
		//.replace("s1", "s2")	s1을 s2로 변환
		//.substring(i1, i2)	i1부터 i2미만까지 슬라이싱하여 복사함
		//.trim()				불필요한 여백 제거
		//.equals(str)			문자열(str)과 값이 동일한지 비교하여 boolean으로 반환	
		//.equalsIgnoreCase(str)대소문자 무시하고 동일한지 비교
		
		//String.valueOf(2.3);  어떤 타입이든 문자열로 변환시킨다.
		
		
//		int[] arr1= new int[] {1,2,3,4,5};
//		
//		for(int i : arr1) {
//			System.out.println(i);
//		}
		
//		int[][] b = new int[][] {{1,3,5},{7,9}};
//		
//		for(int i=0; i<b.length; i++) {
//			for(int j=0; j<b[i].length; j++) {
//				System.out.println(b[i][j]);
//			}
//		}
		
		String str = "내 이름은 [홍길동]입니다. 나이는 [15]살입니다.";
		
		String name = str.substring(str.indexOf("[")+1, str.indexOf("]"));
		int age = Integer.parseInt(str.substring(str.lastIndexOf("[")+1, str.lastIndexOf("]")));
		
		System.out.println(name+" "+age);
		
	}
}
