package condition;

public class OnlyIf {
	public static void main(String[] args) {
		int x = 1, y = 2; // 지변 초기화
		if ((x==1) && (y==1)) { // && 엔퍼센트 읽으시고 and 연산자
			System.out.println("x 는 1 이면서, y도 2이다.");
		}
		if ((x==1)||(y==1)) { // || 컬럼 읽으시고 or 연산자
			System.out.println("x 는 1 이거나, y 는 2 이다.");
		}
		
	}
}
