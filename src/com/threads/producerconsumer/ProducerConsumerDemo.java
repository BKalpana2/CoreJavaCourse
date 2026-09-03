package com.threads.producerconsumer;
public class ProducerConsumerDemo {

	public static void main(String[] args) {
		
		//Create messagebox object
		//the same object must be given to Producer and Consumer
		MessageBox mb = new MessageBox();
		
		//Create a producer thread
		Producer producer = new Producer(mb);
		producer.setName("Producer Thread");  //Optional
		
		//Create a consumer thread
		Consumer consumer = new Consumer(mb);
		consumer.setName("Consumer Thread");
		
		//Start consumer thread
		consumer.start();
		
		//Start Producer thread
		producer.start();

	}

}
