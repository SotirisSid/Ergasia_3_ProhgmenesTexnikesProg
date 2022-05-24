package gr.upatras.rest.messenger;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;


@Service
public class MessageService implements IMessageService{
	List<Message> message = new ArrayList<Message>();
	int ix = 1000;
	/**
	* adding products to the List
	*/
	public MessageService() {
	super();
	
	message.add(new Message(101, "hellow world"));

	}

	@Override
	public Message addMessage(Message m) {
	ix = ix +1; 
	m.setId( ix );
	new MyMqttClient().runClient(m);
	message.add( m );
	return m;
	}
}

	
