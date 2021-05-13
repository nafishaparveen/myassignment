package Question6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

class ChatRoom {
	String name;
	Map<String, String> usersDetails = new HashMap<String, String>();
	ArrayList<String> messages = new ArrayList<String>();
	public ChatRoom(String name){
		this.name = name;
	}
	public void addUser(String username, String password){
		usersDetails.put(username, password);
	}
	public void displayUser(){
		Set<String> userNames = usersDetails.keySet();
		//System.out.println(usersDetails.size());
		Iterator itr = (Iterator) userNames.iterator();
		for(int i=0;i<usersDetails.size();i++){
			System.out.println();
		}
	}
	public boolean checkCredentials(String username, String password) {
		if(password.equals(this.usersDetails.get(username))){
			return true;
		}
		else{
			return false;
		}
	}
	public void removeUser(String username) {
		usersDetails.remove(username);
	}
	public void addMessage(String message) {
		this.messages.add(message);
	}
	public void displayMessages() {
		for(int i=0;i<this.messages.size();i++){
			System.out.println(messages.get(i));
		}
	}
}
