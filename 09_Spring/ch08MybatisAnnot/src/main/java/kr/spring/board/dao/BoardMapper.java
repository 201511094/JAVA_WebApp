package kr.spring.board.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import kr.spring.board.vo.BoardCommand;

public interface BoardMapper {
	public void insertBoard(BoardCommand board);
	@Select("SELECT COUNT(*) FROM zboard")
	public int getBoardCount();
	public List<BoardCommand> getBoardList(Map<String, Object> map);
	@Select("SELECT * FROM zboard WHERE num=#{num}")
	public BoardCommand getBoard(int num);
	@Update("UPDATE zboard SET writer=#{writer}, title=#{title}, content=#{content} WHERE num=#{num}")
	public void updateBoard(BoardCommand board);
	public void deleteBoard(int num);
	
}
/*
	BoardMapper.java와 BoardMapper.xml의 파일명이 동일해야 매핑 가능
	.java의 메소드 이름과 .xml의 아이디 값이 일치해야 함
*/
/*
	어노테이션 방식
	짧은 sql문일 경우 어노테이션 방식이 편리
	sql이 긴 문장일 경우 xml파일에 명시
	ex) @Select(sql문), @Update(sql문)
*/