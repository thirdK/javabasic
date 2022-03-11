package pm;

public class Exam4_1 {
	public static void main(String[] args) {
		C c = new C();
		c.averageScore(1);
		c.averageScore(1,2);
		c.averageScore(1,2,3);
		c.averageScore(1,2,3,4);
	}
	
	
}

class C{
	void averageScore(int...a) {
		double total=0;
		for(int i : a) {
			total += i;
		}
		System.out.println(total/a.length); 
	}
}
