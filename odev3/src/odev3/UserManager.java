package odev3;

public class UserManager {
	public void login(User user) {
		System.out.println(user.getName() + " sisteme giri� yapt�!");
	}
	
	public void logout(User user) {
		System.out.println(user.getName() + " sistemden ��k�� yapt�!");
	} 
}
