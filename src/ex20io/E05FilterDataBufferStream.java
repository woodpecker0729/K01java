package ex20io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class E05FilterDataBufferStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String src = "src/ex20io/dataBufferStream.bin";
		
		try {
			OutputStream out = new FileOutputStream(src);
			BufferedOutputStream bufFilterOut = new BufferedOutputStream(out);
			DataOutputStream dataFilterOut = new DataOutputStream(bufFilterOut);
			
			dataFilterOut.writeInt(555);
			dataFilterOut.writeDouble(55.55);
			dataFilterOut.writeInt(999);
			dataFilterOut.writeDouble(99.99);
			dataFilterOut.close();
			
			DataInputStream dataFilterIn = new DataInputStream(new BufferedInputStream(new FileInputStream(src)));
			
			int num1 = dataFilterIn.readInt();
			double dNum1 = dataFilterIn.readDouble();
			int num2 = dataFilterIn.readInt();
			double dNum2 = dataFilterIn.readDouble();
			
			dataFilterIn.close();
			
			System.out.printf("저장된 정수는 %d, %d \n",num1,num2);
			System.out.printf("저장된 실수는 %.2f, %.2f \n",dNum1,dNum2);
		}
		catch(FileNotFoundException e) {
			System.out.println("해당파일없음");
		}
		catch(IOException e) {
			System.out.println("IO오류 발생");
		}
	}

}
