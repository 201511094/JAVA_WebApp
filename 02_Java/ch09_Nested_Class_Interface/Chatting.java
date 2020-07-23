
public class Chatting {
	void startChat(String chatId) {
		//nickName은 중첩 클래스 안에서 사용되므로 final특성을 가짐
		//null로 정의된 nickName을 다시 chatId로 재정의했기때문에 컴파일 에러 발생
//		String nickName=null;
//		nickName=chatId;
		
		String nickName = chatId;	//수정
		
		Chat chat = new Chat() {
			@Override
			public void start() {
				while(true) {
					String inputData="안녕하세요";
					String message="["+nickName+"]"+inputData;
					sendMessage(message);
				}
			}
		};
		chat.start();
	}
	
	class Chat {
		void start() {}
		void sendMessage(String message) {}
	}
}