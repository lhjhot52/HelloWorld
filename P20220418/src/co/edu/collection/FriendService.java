package co.edu.collection;

import java.util.ArrayList;

public interface FriendService {
	public int ADD = 1;
	public int MOD = 2;
	public int DEL = 3;
	public int SEARCH = 4;
	public int FIND_MEN = 5;
	// 추가,수정,삭제,조회
	public void addFriend(Friend friend);
	public void modFriend(Friend friend);
	//public void modFriend(String name, String phone);
	public void remFriend(String name);
	public Friend findFriend(String name);
	public ArrayList<Friend> findGender(Gender gender);
	

}
