package ex20io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class E01ByteFileCopy {
	public static void main(String[] args) {
	InputStream in =null;
	OutputStream out = null;
	int copyByte = 0;
	try {
		in = new FileInputStream("src/ex20io/BANDIZIP6.EXE");
		out = new FileOutputStream("src/ex20io/BANDIZIP6_copy.EXE");
		int bData;
		
		while(true) {
			bData = in.read();
			if(bData==-1) {
				break;
			}
			out.write(bData);
			copyByte++;
		}
	}
	catch(FileNotFoundException e){
		System.out.println("파일이 존재하지 않습니다.");
	}
	catch(IOException e) {
		System.out.println("파일스트림 생성 시 오류발생됨");
	}
	finally {
		try {
			in.close();
			out.close();
			System.out.println("복사된 KByte 크기:"+(copyByte/1024));
		}
		catch(IOException e) {
			System.out.println("파일스트림닫기오류");
		}
	}
}
}