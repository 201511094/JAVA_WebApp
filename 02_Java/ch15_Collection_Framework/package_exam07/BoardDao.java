package package_exam07;

import java.util.*;

public class BoardDao {

	public List<Board> getBoardList() {
		// TODO Auto-generated method stub
		List<Board> list=new ArrayList<Board>();
		list.add(new Board("제목1", "내용1"));
		list.add(new Board("제목2", "내용2"));
		list.add(new Board("제목3", "내용3"));
		
		return list;
	}
	
}