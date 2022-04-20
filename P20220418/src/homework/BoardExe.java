package homework;

import java.util.Scanner;

public class BoardExe {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		BoardService service = new BoardApp();
		
		while(true) {
			System.out.println("1.글등록 2.글수정 3.글삭제 4.글상세조회(글번호) 5.전체목록 6.종료");
			System.out.println("선택>");
			int menu = scn.nextInt();
			if (menu == BoardService.ADD) {
				System.out.println("게시글 번호 입력>>");
				int boardNo = scn.nextInt();
				System.out.println("작성할 글 제목 입력>>");
				String title = scn.next();
				System.out.println("글 내용입력>>");
				String content = scn.next();
				System.out.println("작성자 이름 입력>>");
				String writer = scn.next();
				System.out.println("작성일시 입력>>");
				String day = scn.next();
				Board board = new Board( boardNo,title,content,writer,day );
				service.addBoard(board);
			}else if(menu == BoardService.MOD) {
				System.out.println("변경할 작성자 이름 입력");
				String writer = scn.next();
				System.out.println("변경할 글 제목 입력");
				String title = scn.next();
				System.out.println("변경할 글 내용 입력");
				String content = scn.next();
				Board board = new Board(writer,title,content);
				service.modBoard(board);
			}else if (menu == BoardService.DEL) {
				System.out.println("삭제 작성자이름");
				String writer = scn.next();
				service.remBoard(writer);
			}else if(menu == BoardService.SEARCH) {
				System.out.println("조회할 게시글의 번호를 입력하세요.");
				int boardNo = scn.nextInt();
				Board searchBoard = service.findBoard(boardNo);
				System.out.println(searchBoard.toString());
			}
		}
	}

}
