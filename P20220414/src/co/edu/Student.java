package co.edu;

public class Student {
	// 필드.
	String name;
	String studNo;
	int age;
	double height;
	
	// 생성자. => 인스턴스를 만들어줄때 처리 할 기능정의.
	// 매개값이 생성자를 기본생성자.
      public Student()	{
    	  System.out.println("Student() 생성자가 호출되었습니다.");
      }
    // 생성자는 필드의 값을 지정할 때.  
      public Student(String nm, String sn) {
    	  name = nm;
   	      studNo = sn;
    	  
     }
      public Student(String nm, String sn,int qwer,double qwe) {
    	  name = nm;
    	  studNo = sn;
    	  age = qwer;
    	  height = qwe;
      }
	// 생성자는 이름, 학번, 나이 채워주는 생성자.
   
  
      
      // 메소드.
    void study() {
    	System.out.println(name + "이 공부를 합니다.");
    
    
	}
	void eat() {
    	System.out.println(name + "이 식사를 합니다.");
    }
    
    void showInfo() {
    	System.out.println("이름은 " + name + "이고  학생번호는 " + studNo +"이고 나이는 " + age + "입니다." + "키는 " +height+"입니다.");
    }
    
    void height() {
    	System.out.println(name + "의 키는 " +height+"입니다.");
    }
}
