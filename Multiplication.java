
public class Multiplication {
	
	void mul(int num, int from, int to) {
		for(int i=from; i<=to; i++) {
			System.out.printf("%d * %d = %d", num, i, num*i);
			System.out.println();
		}
	}
	void mul() {
		mul(5);
	}
	void mul(int a) {
		mul(a,1,10);
	}
}

