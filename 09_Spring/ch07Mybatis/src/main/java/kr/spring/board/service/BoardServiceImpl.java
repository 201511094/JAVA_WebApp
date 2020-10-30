package kr.spring.board.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import kr.spring.board.dao.BoardDAO;
import kr.spring.board.vo.BoardCommand;

@Service("boardService")
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
	public List<BoardCommand> getBoardList(Map<String, Object> map) {
		return boardDAO.getBoardList(map);
	}

	@Override
	public BoardCommand getBoard(int num) {
		return boardDAO.getBoard(num);
	}

	@Override
	public void updateBoard(BoardCommand board) {
		boardDAO.updateBoard(board);
	}

	@Override
	public void deleteBoard(int num) {
		boardDAO.deleteBoard(num);
	}

}