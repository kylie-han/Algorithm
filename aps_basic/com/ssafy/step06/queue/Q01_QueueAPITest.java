package com.ssafy.step06.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Q01_QueueAPITest {
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();
		queue.offer("������");
		queue.offer("�̵���");
		queue.offer("������");
		System.out.println(queue.isEmpty());
		System.out.println(queue.peek());
		System.out.println(queue);
	}

}
