package co.edu;

import java.util.Scanner;

public class BoardExe {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		// BoardList에 정의해놓은 필드와 메소드를 활용해서 기능.
		BoardList boardList = new BoardList();
		boardList.init(5); // 배열의 크기지정.
		
		while (true) {
			
			System.out.println("1.추가 2.수정 3.목록 4.삭제 5.한건조회 6.작성자조회 9.종료");
			System.out.println("선택>> ");
			
			int menu = scn.nextInt();
			scn.nextLine();
			if(menu == 1) {
				System.out.print("글번호입력>> ");
				int bNo = Integer.parseInt(scn.nextLine());;
				System.out.println("제목입력>> ");
				String bTitle = scn.nextLine();
				System.out.println("내용입력>> ");
				String bContent = scn.nextLine();
				System.out.println("작성자입력>> ");
				String bWriter = scn.nextLine();
				Board newBod = new Board(bNo, bTitle, bContent, bWriter);
				int chk = boardList.addBoard(newBod);
				if(chk == 0) {
					System.out.println("정상입력되었습니다.");
				}else if(chk == -1){
					System.out.println("저장공간이 없습니다.");
				}else if(chk ==1) {
					System.out.println("이미 있는 번호 입니다.");
				}
			}else if(menu == 2) {
				System.out.print("수정할 글번호입력>>>>  ");
			    int bNo = Integer.parseInt(scn.nextLine());
	            System.out.println("변경할 제목입력>>> ");
	            String title = scn.nextLine();
	            System.out.println("변경할 내용입력>>> ");
	            String content = scn.nextLine();
	            Board cBoard = new Board(bNo, title, content, null);
	            
	            if (boardList.modifyBoard(cBoard)) {
	            	System.out.println("정상수정완료.");
	            } else {
	            	System.out.println("변경못했습니다.");
	            }
			}else if(menu == 3) {
				Board[] boards = boardList.boardList();
				System.out.println("게시글번호 제목         내용         사용자  조회수");
				System.out.println("============================================");
				for (Board board : boards) {
					if(board != null) {
					   board.getInfo();
					}
				}
				
			}else if(menu == 4) {
				System.out.print("삭제할 글번호>>> ");
				int bNo = Integer.parseInt(scn.nextLine());
				
				 if(boardList.removeBoard(bNo)){
					System.out.println("삭제가 되었습니다.");
				} else {
					System.out.println("삭제가 안됐습니다.");
				}
				
				
			}else if(menu == 5) {
				System.out.print("조회할 글번호>>> ");
				int bNo = Integer.parseInt(scn.nextLine());
				
				Board getBoard = boardList.searchBoard(bNo);
				if(getBoard == null) {
                   System.out.println("조회결과 없습니다."); 					
				}else {
					getBoard.getDetailInfo();
					
				}
			}else if(menu == 6) { // 작성자 
				System.out.println("검색할 작성자 입력>>> ");
				String sWriter = scn.nextLine();
				Board[] writerList = boardList.getWriterList(sWriter);
				// writerList 내용 출력.
				System.out.println("게시글번호 제목         내용         사용자  조회수");
				System.out.println("============================================");
				for (Board board : writerList) {
					if(board != null) {
					   board.getInfo();
					}
				}
			}else if(menu == 9) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}else {
				System.out.println("정확한 메뉴를 선택하세요.");
			}
			
		
		}
		System.out.println("end of prog.");
	    
	}
}
