package ex20io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
class Circle implements Serializable{
	int xPos,yPos;
	double radian;
	public Circle(int x, int y, double r) {
		xPos = x;
		yPos = y;
		radian = r;
	}
	public void showCircleInfo() {
		System.out.printf("좌표[%d,%d]",xPos,yPos);
		System.out.println("반지름:"+radian);
	}
}
public class E11ObjectSerializable {
	
	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		try {
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("src/ex20io/circle.obj"));
		out.writeObject(new Circle(1,1,2.4));
		out.writeObject(new Circle(2,2,4.8));
		out.writeObject(new String("String타입의 오브젝트"));
		out.close();
		
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("src/ex20io/circle.obj"));
		Circle c1 = (Circle)in.readObject();
		Circle c2 = (Circle)in.readObject();
		String message = (String)in.readObject();
		in.close();
		
		c1.showCircleInfo();
		c2.showCircleInfo();
		System.out.println("String오브젝트:"+message);
		}
		catch(ClassNotFoundException e) {
			System.out.println("클래스없음");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
