package kr.spring.board.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import kr.spring.board.dao.BoardMapper;
import kr.spring.board.vo.BoardVO;

@Service("boardService")
public class BoardServiceImp implements BoardService {

	@Resource BoardMapper boardMapper;
	
	@Override
	public List<BoardVO> selectList(Map<String, Object> map) {
		return null;
	}

	@Override
	public int selectRowCount(Map<String, Object> map) {
		return 0;
	}

	@Override
	public void insertBoard(BoardVO board) {
		
	}

	@Override
	public BoardVO selectBoard(Integer board_num) {
		return null;
	}

	@Override
	public void updateHit(Integer board_num) {
		
	}

	@Override
	public void updateBoard(BoardVO board) {
		
	}

	@Override
	public void deleteBoard(Integer board_num) {
		
	}
	
}