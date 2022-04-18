package co.edu.app;

import java.util.Scanner;

public class AccountApp {
	
	Account[] Account[] accountArray = new Account[100]; // 계좌정보를 저장하기 위한 배열.
	private static Scanner scanner = new Scanner(System.in);
	static int num = 0; 
	public static void main(String[]args) {
	boolean run = true;
		
		while(run) {
			System.out.println("----------------------------------");
			System.out.println("1.계좌생성 2.계좌목록 3.입금 4.출금 5.종료");
			System.out.println("----------------------------------");
			System.out.println("선택>> ");
			
			int menu = scanner.nextInt();
			
			if(menu == 1) {
				createAccount(); break;
			}else if(menu == 2) {
				accountList(); 
			}else if(menu == 3) {
				deposit();
			}else if(menu == 4) {
				withdraw();
			}else if(menu == 5) {
				System.exit(0);
			}else {
				
				System.out.println("프로그램을 종료합니다.");
			}
		}
	}
	//계좌생성시 실행할 메소드.
    private static void createAccount() {
    	String ano = null;
    	String owner = null;
    	int balance = 0;
    	System.out.println("------");
    	System.out.println("계좌 생성");
    	System.out.println("------");
    	System.out.println("계좌번호 : ");
    	String ano = scanner.next();
    	
    	System.out.println("계좌주 : ");
    	String owner = scanner.next();
    	
    	System.out.println("초기입금액 : ");
    	int balance = scanner.nextInt();
    
    	accountArray[cnt] = new Account(ano, owner, balance);
    	cnt++;
    	System.out.println("계좌가 생성되었습니다.");
    	
    }
          
    
    
    // 입금처리시 실행할 메소드.
    private static void deposit() {
    
    
    	
    }
    // 출금처리시 실행할 메소드.
    private static void withdraw() {
    
    	}
    	
    
    // 전체목록 실행 메소드.
    public void accountList() {
    	for(int i = 0; i < num; i++) {
    		System.out.println(accountArray[i].getAno()+"\t"+accountArray[i].getowner()+"\t"+accountArray[i].getBalance());
    }
   }	
}
