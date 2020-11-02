package kr.spring.board.dao;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import kr.spring.board.vo.BoardCommand;

@Repository("boardDAO")
public class BoardDAOImpl implements BoardDAO {

	@Resource
	private SqlSessionTemplate sqlSession;	//주입됨
	
	@Override
	public void insertBoard(BoardCommand board) {
		sqlSession.insert("insertBoard", board);	//id, 데이터
	}

	@Override
	public int getBoardCount() {
		//하나 선택 -> selectOne
		Integer count = sqlSession.selectOne("getBoardCount");	//BoardMapper.xml에서 id값을 찾아 해당 sql문 수행
		
		return count;
	}

	@Override
	public List<BoardCommand> getBoardList(Map<String, Object> map) {
		//sql문장을 읽어와서 ?에 넣을 데이터를 세팅
		//여러 개 선택 -> selectList
		List<BoardCommand> list = sqlSession.selectList("getBoardList", map);	//id, 전달할 데이터
		
		return list;
	}

	//num은 식별자
	@Override
	public BoardCommand getBoard(int num) {
		BoardCommand boardCommand = sqlSession.selectOne("getBoard", num);
		
		return boardCommand;
	}

	@Override
	public void updateBoard(BoardCommand board) {
		sqlSession.update("updateBoard", board);
	}

	@Override
	public void deleteBoard(int num) {
		sqlSession.delete("deleteBoard", num);
	}
	
}