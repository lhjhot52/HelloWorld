package homework;

import java.util.ArrayList;

import co.edu.collection.Friend;

public class BoardApp implements BoardService{
	
	ArrayList<Board> boards = new ArrayList<Board>();

	@Override
	public void addBoard(Board board) {
		boards.add(board);
		
	}

	@Override
	public void modBoard(Board board) {
		for(int i = 0; i < boards.size(); i++) {
			if(boards.get(i).getWriter().equals(board.getWriter())) {
				boards.get(i).setTitle(board.getTitle());{
				 boards.get(i).setContent(board.getContent());	
				}
				break;
			}
					
		}
}
		
		
	

	@Override
	public void remBoard(String writer) {
	    for( int i = 0 ; i < boards.size(); i++) {
	    	Board findBoard = (Board) boards.get(i);
	    	if(findBoard.getWriter().equals(writer)) {
	    		boards.remove(i);
	    	}
	    }
		
	}

	@Override
	public Board findBoard(int boardNo) {
		for( int i = 0; i <boards.size();i++) {
			Board findBoard = (Board)boards.get(i);
			if(findBoard.getBoardNo() == boardNo && findBoard != null) {
				
			}
		}
	
		
		
		return null;
	}

	@Override
	public ArrayList<Board> findBoard(Board board) {
		ArrayList<Board> list = new ArrayList<Board>();
		
		for(int i = 0; i < boards.size();i++) {
			System.out.println(boards.get(i).getBoardNo());
		}
		
		return null;
	}
	
	

}
