package ex20io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class E02ByteBufferFileCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			InputStream in = new FileInputStream("src/ex20io/eCiN.eXe");
			OutputStream out = new FileOutputStream("src/ex20io/ecin_copy.ExE");
			int copyByte = 0;
			int readLen ;
			
			byte buffer[] = new byte[1024];
			
			while(true) {
				readLen = in.read(buffer);
				if(readLen==-1) {
					break;
				}
				out.write(buffer, 0, readLen);
				copyByte+=readLen;
			}
				if(in!=null) in.close();
				if(out!=null) out.close();
				System.out.println("복사된 파일크기:"+copyByte+"byte");
				System.out.println("복사된 파일크기:"+(copyByte/1024)+"Kbyte");
				System.out.println("복사된 파일크기:"+(copyByte/(1024*1024))+"Mbyte");
			
		}
		catch(FileNotFoundException e){
			System.out.println("파일이 존재하지 않습니다.");
		}
		catch(IOException e) {
			System.out.println("IO작업 중 예외 발생");
		}
		catch(Exception e) {
			System.out.println("알 수 없는 예외 발생");
		}
	}

}
