package co.edu;

public class TVExample {
	public static void main(String[] args) {
		int num = 10;
		String str = "Hello";
		
		Television tv = new Television(); // 
		tv.company = "삼성";
		tv.color = "검은색";
		tv.price = 300000;
		tv.model = "30Inch";
		tv.turnOn();
		tv.changeChanel(10);
		tv.turnOff();
		
		
		Television tv1 = new Television(); //
		tv.company = "삼성";
		tv.color = "검은색";
		tv.price = 300000;
		tv.model = "30Inch";
		tv.turnOn();
		
		System.out.println(tv == tv1);
		System.out.println(tv);
		System.out.println(tv1);
		
		Student stud1 = new Student();
		stud1.name = "홍길동";
		stud1.studNo = "22-1234567";
		stud1.age = 20;
		stud1.height = 174.5;
		
		Student stud2 = new Student();
		stud2.name = "이형진";
		stud2.studNo = "18-71015894";
		stud2.age =  25;
		stud2.height = 178.9;
		
		Student stud3 = new Student("이형진","22-1516");
	    stud3.height = 163.5;
		
		stud1.study();
		stud2.study();
		stud2.showInfo();
		stud3.showInfo();
		stud3.study();
		stud2.height();
//		tv != tv1;
	}

}
