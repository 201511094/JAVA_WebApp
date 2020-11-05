package kr.spring.board.dao;

import java.util.List;
import java.util.Map;

import kr.spring.board.vo.BoardVO;

public interface BoardMapper {
	//길이가 길어서 어노테이션이 아닌 xml에 명시
	public List<BoardVO> selectList(Map<String, Object> map);
	public int selectRowCount(Map<String, Object> map);	//목록 관련
	
	public void insertBoard(BoardVO board);
	public BoardVO selectBoard(Integer board_num);
	public void updateHit(Integer board_num);
	public void updateBoard(BoardVO board);
	public void deleteBoard(Integer board_num);
	
}