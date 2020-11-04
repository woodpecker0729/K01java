package ex16exception;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

class WrongNumberException extends Exception {
	public WrongNumberException(String error) {
		super(error);
	}
}

public class QuRockPaperScissorsException {
	public static void rpsGame() {
		int cnt = 0;
		Random random = new Random();
		
		while (true) {
			if (cnt == 5) {
				int quit;
				System.out.print("5번의 게임이 끝났습니다. 게임을 계속하시겠습니까? 재시작(1), 종료(0) :");
				try {
					quit = getNum("QUIT");
					if (quit == 1) {
						cnt = 0;
					} 
					else if (quit == 0) {
						System.out.println("게임종료");
						return;
					} 
				}
				catch(WrongNumberException e) {
					System.out.println(e.getMessage());
					continue;
				}
			}

			System.out.print("무엇을 내겠습니까?(1: 가위, 2:바위, 3:보) : ");
			int user = 0;
			try{
				user = getNum("RPS");
			}
			catch(WrongNumberException e) {
				System.out.println(e.getMessage());
				continue;
			}
			int com = random.nextInt(3) + 1;
			System.out.println("사용자:" + getString(user) + ", 컴퓨터:" + getString(com));
			if (user == com) {
				System.out.println("비겼습니다.");
			} else if ((user == 1 && com == 3) || (user == 2 && com == 1) || (user == 3 && com == 2)) {
				System.out.println("이겼습니다.");
			} else
				System.out.println("졌습니다.");
			cnt++;
		}
	}

	public static String getString(int rps) {
		String a = new String();
		switch (rps) {
		case 1:
			a = "가위";
			break;
		case 2:
			a = "바위";
			break;
		case 3:
			a = "보";
			break;
		}
		return a;
	}
	public static int getNum(String mode) throws WrongNumberException {
		Scanner scanner = new Scanner(System.in);
		int num=-1;
		try {
			num=scanner.nextInt();
		}
		catch(InputMismatchException e) {
		}
		switch(mode) {
		case "RPS":
			if(!(num >= 1 && num < 4)) {
				WrongNumberException e = new WrongNumberException("가위바위보 할줄 모르세요? 제대로 내세요^^;");
				throw e;
			}
			break;
		case "QUIT":
			if(!(num == 0 || num == 1)) {
				WrongNumberException e = new WrongNumberException("잘못입력하셨습니다. 재시작(1), 종료(0)중에 입력하세요");
				throw e;
			}
			break;
		}
		
		return num;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rpsGame();
	}
}
