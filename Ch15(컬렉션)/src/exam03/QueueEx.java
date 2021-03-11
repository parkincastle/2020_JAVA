package exam03;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {

	public static void main(String[] args) {

		Queue<Message> queue = new LinkedList<>();
		
		queue.offer(new Message("Send Mail", "ȫ�浿"));
		queue.offer(new Message("Send SMS", "ȫ�浿"));
		queue.offer(new Message("Send KakaoTalk", "ȫ�浿"));
		queue.offer(new Message("Send FaceBook", "ȫ�浿"));
		
		while(!queue.isEmpty()) {
			Message message = queue.poll();
			System.out.println(message.getCommand() + " : " + message.getTo());
		}
		
		
		
		
	}

}
