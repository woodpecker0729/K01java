import java.util.Scanner;

public class TicTacToe {
	
	static Scanner scanner = new Scanner(System.in);
	public static boolean end(char[][] arr) {
		for(int i=0;i<3;i++) {
			char first = arr[0][i];
			if(first==' ') continue;
			else if(first==arr[1][i]&&first==arr[2][i]) return false;
		} 
		for(int i=0;i<3;i++) {
			char first = arr[i][0];
			if(first==' ') continue;
			else if(first==arr[i][1]&&first==arr[i][2]) return false;
		}
		if(arr[0][0]!=' '&&arr[0][0]==arr[1][1]&&arr[1][1]==arr[2][2]) return false;
		if(arr[0][2]!=' '&&arr[0][2]==arr[1][1]&&arr[1][1]==arr[2][0]) return false;
		return true;
	}
	public static void show(char[][] arr) {
		System.out.println("-------------");
		System.out.println("|Tic Tac Toe|");
		System.out.println("-------------");
		for(int i=0;i<3;i++) {
			System.out.printf("| %c | %c | %c |\n",arr[i][0],arr[i][1],arr[i][2]);
			System.out.println("-------------");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int player=0;
		String str;
		int num1,num2;
		char[][] arr1 = {{' ',' ',' '},{' ',' ',' '},{' ',' ',' '}};
		show(arr1);
		while(true) {
			if(player==9) {
				System.out.println("비겼습니다."); 
				break;
			}
			System.out.print("[player"+(player%2+1)+"] 자리을 선택하세요. \n(X,Y로 입력|범위(0,0)~(2,2)): ");
			str=scanner.nextLine();
			if(str.length()!=3||
				(str.charAt(0)<'0'||str.charAt(0)>'2')||
				(str.charAt(2)<'0'||str.charAt(2)>'2')||
				str.charAt(1)!=',') System.out.println("제대로 입력하세요");
			else {
				num1 = str.charAt(0)-'0';
				num2 = str.charAt(2)-'0';
				if(arr1[num2][num1]!=' ') {
					System.out.println("이미 선택된 자리입니다. 다시 입력하세요.");
					player--;
				}
				else {
					if(player%2==0) arr1[num2][num1]='O';
					else arr1[num2][num1]='X';
					show(arr1);
					if(!end(arr1)) {
						System.out.println("[player"+(player%2+1)+"]의 승리");
						break;
					}
				}
				player++;
			}
		}
		
		
	}
}


