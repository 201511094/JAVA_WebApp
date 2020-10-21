package kr.spring.ch09;

import java.util.List;

public class PerformanceMonitor {
	//프로퍼티
	private List<Double> deviations;

	public void setDeviations(List<Double> deviations) {
		this.deviations = deviations;
	}

	@Override
	public String toString() {
		return "PerformanceMonitor [deviations=" + deviations + "]";
	}
	
}