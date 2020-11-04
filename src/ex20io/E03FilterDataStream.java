package ex20io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class E03FilterDataStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String src = "src/ex20io/FilterdataStream.bin";
		
		try {
			OutputStream out = new FileOutputStream(src);
			DataOutputStream filterOut = new DataOutputStream(out);
			
			filterOut.writeInt(123);
			filterOut.writeDouble(12.34);
			filterOut.writeInt(456);
			filterOut.writeDouble(56.78);
			
			DataInputStream filterin = new DataInputStream(new FileInputStream(src));
			
			int num1 = filterin.readInt();
			double dNum1 = filterin.readDouble();
			int num2 = filterin.readInt();
			double dNum2 = filterin.readDouble();
			
			System.out.println("num1="+num1);
			System.out.println("dNum1="+dNum1);
			System.out.println("num2="+num2);
			System.out.println("dNum2="+dNum2);
			
			if(filterOut!=null) filterOut.close();
			if(filterin!=null) filterin.close();
		}
		catch(FileNotFoundException e) {
			System.out.println("해당파일없음");
		}
		catch(IOException e) {
			System.out.println("IO오류 발생");
		}
	}

}
