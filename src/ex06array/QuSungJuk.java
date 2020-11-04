package ex06array;

import java.util.Scanner;

public class QuSungJuk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("학생수를 입력하세요?");
		int num = scanner.nextInt();
		System.out.println("학생수:"+num);
		int[][] score = new int[num][3];
		for(int i=0;i<num;i++) {
			System.out.println("["+(i+1)+"번째 학생의 점수 입력]");
			for(int j=0;j<3;j++) {
				if(j==0) System.out.print("국어");
				else if(j==1) System.out.print("영어");
				else if(j==2) System.out.print("수학");
				System.out.print("점수 입력?");
				score[i][j]=scanner.nextInt();
			}
		}
		System.out.println("===============================");
		System.out.println("NO  KOR  ENG  MAT  TOT  AVG");
		System.out.println("===============================");
		for(int i=0;i<num;i++) {
			System.out.printf("%d   %3d  %2d  %2d  %3d  %.2f \n",
					i+1,score[i][0],score[i][1],score[i][2],
					score[i][0]+score[i][1]+score[i][2],
					(double)(score[i][0]+score[i][1]+score[i][2])/3);
		}
		System.out.println("===============================");
	}

}
