package co.edu;

public class Member {
	// 필드 => 회원아이디, 회원이름, 회원연락처, 회원나이.
	private String memberId;
	private String memberName;
	private String memberPhone;
	private int memberAge; // -14
	// 생성자
	public Member(String MemberId, String MemberName, String MemberPhone, int MemberAge) {
		super();
		this.memberId = MemberId;
		this.memberName = MemberName;
		this.memberPhone = MemberPhone;
		this.memberAge = MemberAge;
	}
	
	
	// 메소드
	void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	
	String getMemberId() {
		return memberId;
	}
	
	void setMemberAge(int age) {
		if(age < 0) {
			memberAge = 10;
		}else {
			memberAge = age;
		}
	}
	int getMemberAge(){
		return memberAge;
	}
	
	
	void showinfo() {
		System.out.printf("회원이름 %4s\n 연락처 %13s\n 나이 %2d\n",memberName,memberPhone,memberAge);
	}

	

}
