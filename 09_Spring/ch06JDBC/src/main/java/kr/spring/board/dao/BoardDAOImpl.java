package kr.spring.board.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import kr.spring.board.vo.BoardCommand;

@Repository("boardDAO")	//빈 이름
public class BoardDAOImpl implements BoardDAO {

	//전송하는 데이터의 보안을 위해 sql문에 ?를 사용, 보여지면 안되는 데이터를 감춤
	private static final String INSERT_SQL =
			"INSERT INTO zboard(num,writer,title,passwd,content,reg_date) VALUES (zboard_seq.nextval,?,?,?,?,SYSDATE)";
	private static final String SELECT_COUNT_SQL = "SELECT COUNT(*) FROM zboard";
	private static final String SELECT_LIST_SQL =
			"SELECT * FROM (SELECT a.*, rownum rnum FROM (SELECT * FROM zboard ORDER BY reg_date DESC) a) WHERE rnum >= ? AND rnum <= ?";
	private static final String SELECT_DETAIL_SQL = "SELECT * FROM zboard WHERE num=?";
	private static final String UPDATE_SQL = "UPDATE zboard SET writer=?,title=?,content=? WHERE num=?";
	private static final String DELETE_SQL = "DELETE FROM zboard WHERE num=?";
	
	@Resource
	private JdbcTemplate jdbcTemplate;
	
	//한 개의 레코드 정보를 처리하는 객체 -> 재활용성 증가
	private RowMapper<BoardCommand> rowMapper = new RowMapper<BoardCommand>() {
		public BoardCommand mapRow(ResultSet rs, int rowNum) throws SQLException {
			BoardCommand board = new BoardCommand();
			board.setNum(rs.getInt("num"));
			board.setWriter(rs.getString("writer"));
			board.setTitle(rs.getString("title"));
			board.setPasswd(rs.getString("passwd"));
			board.setContent(rs.getString("content"));
			board.setReg_date(rs.getDate("reg_date"));
			
			return board;
		}
	};

	//글 등록
	@Override
	public void insertBoard(BoardCommand board) {
		jdbcTemplate.update(INSERT_SQL, new Object[]{board.getWriter(), board.getTitle(), board.getPasswd(), board.getContent()});	
	}

	//총 레코드 수
	@Override
	public int getBoardCount() {
		return jdbcTemplate.queryForObject(SELECT_COUNT_SQL, Integer.class);
	}

	@Override
	public List<BoardCommand> getBoardList(int startRow, int endRow) {
		//rowMapper는 하나의 레코드를 자바빈에 넣어줌
		List<BoardCommand> list = jdbcTemplate.query(SELECT_LIST_SQL, new Object[] {startRow, endRow}, rowMapper);
		
		return list;
	}

	@Override
	public BoardCommand getBoard(int num) {
		BoardCommand board = (BoardCommand)jdbcTemplate.queryForObject(SELECT_DETAIL_SQL, new Object[] {num}, rowMapper);
		
		return board;
	}

	@Override
	public void updateBoard(BoardCommand board) {
		jdbcTemplate.update(UPDATE_SQL, new Object[] {board.getWriter(), board.getTitle(), board.getContent(), board.getNum()});
	}

	@Override
	public void deleteBoard(int num) {
		jdbcTemplate.update(DELETE_SQL, new Object[] {num});
	}

}