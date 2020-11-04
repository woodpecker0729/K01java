package ex10accessmodifier;
class Rectangle
{
	//멤버변수
   	int ulx, uly;//좌상단(upper left x, upper left y)
   	int lrx, lry;//우하단(lower right x, lower right y)
   	boolean a=true;
   	//생성자
   	public Rectangle(int ulx, int uly, int lrx, int lry) {
   		/* 
		좌표값이 정상범위안에 있는지 판단하여 초기화한다.
		*/
   		
   		if(ulx<0||ulx>100||uly<0||uly>100) {
   			System.out.println("좌상단 좌표 범위가 잘못되었습니다.");
   			a=false;
   		}
   		if(lrx<0||lrx>100||lry<0||lry>100) {
   			System.out.println("우하단 좌표 범위가 잘못되었습니다.");
   			a=false;
   		}
   		if(lrx<=ulx||lry<=uly) {
   			System.out.println("좌측 우측 좌표지정이 잘못되었습니다");
   			a=false;
   		}
   		if(a) {
   			this.ulx = ulx;
   			this.uly = uly;
   			this.lrx = lrx;
   			this.lry = lry;
   		}
   	}   	   	
   	public void showArea()
   	{
   		
   		if(a) {
   			System.out.println("넓이:"+(lrx-ulx)*(lry-uly));
   			System.out.println("=========================");
   		}
   		
   		else {
   			System.out.println("좌표값 오류로 넓이를 계산할 수 없습니다.");
   			System.out.println("=========================");
   		}
   		
   	}  	
}

public class QuRectangle {
	public static void main(String[] args)
   	{
		/*여기부터
     		Rectangle rec = new Rectangle();
     		rec.ulx=22;
     		rec.uly=22;
     		rec.lrx=10;
     		rec.lry=10;
		여기까지는 정보은닉후 실행되지 않게 해야한다....
		 */
		//아래 생성자로만 객체생성후 초기화 되도록 처리한다...
		Rectangle rec1 = new Rectangle(1,1,10,10);
		rec1.showArea();
		
		Rectangle rec2 = new Rectangle(-2,-2,101,101);
		rec2.showArea();
		
		Rectangle rec3 = new Rectangle(10,10,1,1);
		rec3.showArea();
   	}
}
