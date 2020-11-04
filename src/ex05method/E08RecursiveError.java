package ex05method;

public class E08RecursiveError {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		showHi(3);
	}
	/*
	 * 오류코드
	 * 감소연산자로 인해 cnt의 값은 차감되지만
	 * 조건식의 위ㅣ치가 잘못되어 재귀호출을 하기전에 종료체크를 할 수 있도록 수정해야한다.
	
	 *	stackoverflow(스택오버플로우)
	 *	스택은 함수가 종료되기 전까지의 모든 정보를 저장하는 메모리로 유한한 공간이므로 무한루프에 빠지게 되면 저장 능력을 초과하여
	 *해당 에러가 발생하게 된다
	 */
	
	
	public static void showHi(int cnt) {
		System.out.println("Hi~!");
		System.out.println("cnt="+cnt);
		if(cnt==1) {
			return;
		}
		showHi(--cnt);
		/*
		 * 감소연산자가 뒤에 있으면 cnt의 값이 감소하기 전 함수를 호출하게 되므로 무한루프에 빠지게 된다.
		 */
	}
}
