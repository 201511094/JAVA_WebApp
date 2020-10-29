package kr.spring.board.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import kr.spring.board.dao.BoardDAO;
import kr.spring.board.vo.BoardCommand;

@Service("boardService")//빈 이름
public class BoardServiceImpl implements BoardService {

	@Resource
	private BoardDAO boardDAO;
	
	@Override
	public void insertBoard(BoardCommand board) {
		boardDAO.insertBoard(board);
	}

	@Override
	public int getBoardCount() {
		return boardDAO.getBoardCount();
	}

	@Override
	public List<BoardCommand> getBoardList(int startRow, int endRow) {
		return boardDAO.getBoardList(startRow, endRow);
	}

	@Override
	public BoardCommand getBoard(int num) {
		return boardDAO.getBoard(num);
	}

	@Override
	public void updateBoard(BoardCommand board) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteBoard(int num) {
		// TODO Auto-generated method stub
		
	}

}
