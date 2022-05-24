package gr.upatras.rest.messenger;

public class Message {
	private int id;
	private String message_content;
	public Message(int id, String message_content) {
		super();
		this.id = id;
		this.message_content = message_content;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMessage_content() {
		return message_content;
	}
	public void setMessage_content(String message_content) {
		this.message_content = message_content;
	}

}
