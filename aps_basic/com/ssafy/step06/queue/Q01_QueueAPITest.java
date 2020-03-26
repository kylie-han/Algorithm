package com.ssafy.step06.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Q01_QueueAPITest {
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();
		queue.offer("김태희");
		queue.offer("이동욱");
		queue.offer("이지아");
		System.out.println(queue.isEmpty());
		System.out.println(queue.peek());
		System.out.println(queue);
	}

}
