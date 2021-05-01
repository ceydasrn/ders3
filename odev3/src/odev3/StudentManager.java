package odev3;

public class StudentManager extends UserManager{
	
	public void add(User user) {
		System.out.println("Öðrenci " + user.getName() + " sisteme eklendi.");
	}
	
	public void delete(User user) {
		System.out.println("Öðrenci " + user.getName() + " sistemden silindi.");
	}
	
	public void update(User user) {
		System.out.println("Öðrenci " + user.getName() + " sistemde güncellendi.");
	}
	
}
