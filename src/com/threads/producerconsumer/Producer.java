package com.threads.producerconsumer;


public class Producer extends Thread{

	private MessageBox messageBox;
	
	public Producer(MessageBox messageBox)
	{
		this.messageBox = messageBox; //Aggregation relationship 
	}
	
	public void run()
	{
	
		try {
			messageBox.produce("Hello");
			messageBox.produce("How are you?");
			messageBox.produce("Welcome to Codegnan!!");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
}