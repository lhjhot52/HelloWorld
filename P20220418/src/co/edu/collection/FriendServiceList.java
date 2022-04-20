package co.edu.collection;

import java.util.ArrayList;

import co.edu.collection.Friend;

// 컬렉션 ArrayList
public class FriendServiceList implements FriendService{

	ArrayList<Friend> friends = new ArrayList<Friend>();
	
	@Override
	public void addFriend(Friend friend) {
		friends.add(friend);		
	}

	@Override
	public void modFriend(Friend friend) {
		for(int i =0 ; i <friends.size(); i++) {
		//	Friend findFriend = (Friend) friends.get(i);
			if (friends.get(i).getName().equals(friend.getName())) {
				friends.get(i).setPhone(friend.getPhone());
				break;
        
        	}
        }
	}

	@Override
	public void remFriend(String name) {
		for( int i =0 ; i < friends.size(); i++) {
			Friend findFriend = (Friend) friends.get(i);
			if (findFriend.getName().equals(name)) {
				friends.remove(i);
			}
		}

	}

	@Override
	public Friend findFriend(String name) {
		return null;
	}


@Override
public ArrayList<Friend> findGender (Gender gender){
	ArrayList<Friend> list = new ArrayList<Friend>();
	
	for(int i = 0; i < friends.size(); i++) {
		System.out.println(friends.get(i).getGender());
		
	//	if(friends.get(i).getGender() == gender) {
			// 열거형타입 클래스
			// 기본타입 == 비교연산자.
			// 열거형 == 비교연산자로 비교.
		//	list.add(friends.get(i));
		//}
	}
	return list;
}



}


