package package_exam09;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		
		String name = null;	//최고점수를 받은 아이디 저장
		int maxScore = 0;	//최고점수 저장
		int totalScore = 0;	//점수 합계 저장
		
		Set<Map.Entry<String,Integer>> entrySet = map.entrySet();
		for (Map.Entry<String,Integer> entry : entrySet) {
			if (entry.getValue()>maxScore) {
				name = entry.getKey();
				maxScore = entry.getValue();
			}
			totalScore += entry.getValue();
		}
		
		int avgScore = totalScore / map.size();
		System.out.println("평균점수: " + avgScore);
		
		System.out.println("최고점수: " + maxScore);
		System.out.println("최고점수를 받은 아이디: " + name);
		
	}
	//HashMap에 String아이디와 Integer점수가 저장되어 있음
	//평균 점수를 출력하고 최고 점수와 최고 점수를 받은 아이디를 출력하는 문제
}
