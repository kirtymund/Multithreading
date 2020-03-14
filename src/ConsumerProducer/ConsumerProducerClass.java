package ConsumerProducer;

import java.util.Random;
import java.util.concurrent.*;

public class ConsumerProducerClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		BlockingQueue<Integer> q = new ArrayBlockingQueue<>(10);
		Thread th = new Thread(() ->  {
			try {
				producer(q);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		Thread th1 = new Thread(() ->  {
			try {
				consumer(q);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		th.start();
		th1.start();
		th.join();
		th1.join();
	}
	
private static void producer(BlockingQueue<Integer> queue) throws InterruptedException {
	Random random = new Random();
	while(true) {
	queue.put(random.nextInt(100));
	}
}
private static void consumer(BlockingQueue<Integer> queue) throws InterruptedException {
	Random random = new Random();
	while(true) {
		Thread.sleep(100);
		
	Integer i = queue.take();
	System.out.println("taken value : "+i +" Queue size :"+ queue.size());
	}
	
}
}
