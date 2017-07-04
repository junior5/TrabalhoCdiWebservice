package br.univel;

import javax.enterprise.context.Dependent;
import javax.inject.Named;

@Named
@Dependent
public class MessageBean {

	public MessageBean() {
		
	}
	
	public void sendMessage(){
	
	}
	
	public String getMessage(){
		return "Hello Message Server Bean!";		
	}

	
}
