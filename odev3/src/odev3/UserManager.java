package odev3;

public class UserManager {
	public void login(User user) {
		System.out.println(user.getName() + " sisteme giriþ yaptý!");
	}
	
	public void logout(User user) {
		System.out.println(user.getName() + " sistemden çýkýþ yaptý!");
	} 
	
}
