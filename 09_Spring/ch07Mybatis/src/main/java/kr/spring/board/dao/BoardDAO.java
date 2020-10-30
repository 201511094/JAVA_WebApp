package kr.spring.board.dao;

import java.util.List;
import java.util.Map;

import kr.spring.board.vo.BoardCommand;

public interface BoardDAO {
	public void insertBoard(BoardCommand board);
	public int getBoardCount();
	public List<BoardCommand> getBoardList(Map<String, Object> map);
	public BoardCommand getBoard(int num);
	public void updateBoard(BoardCommand board);
	public void deleteBoard(int num);
	
}