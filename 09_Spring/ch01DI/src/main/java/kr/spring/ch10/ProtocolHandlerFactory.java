package kr.spring.ch10;

import java.util.Map;

public class ProtocolHandlerFactory {
	private Map<String,Object> map;

	public void setMap(Map<String, Object> map) {
		this.map = map;
	}

	@Override
	public String toString() {
		return "ProtocolHandlerFactory [map=" + map + "]";
	}
	
}