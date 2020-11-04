package ex20io;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class E13MyFriendDeserializable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("src/ex20io/friends_info.obj"));
			while(true) {
				Friend friend = (Friend)in.readObject();
				if(friend==null) break;
				friend.showAllData();
			}
		}
		catch(Exception e) {
			System.out.println("복원시 예외발생");
		}
	}

}
