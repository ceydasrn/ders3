package odev3;

public class StudentManager extends UserManager{
	
	public void add(User user) {
		System.out.println("��renci " + user.getName() + " sisteme eklendi.");
	}
	
	public void delete(User user) {
		System.out.println("��renci " + user.getName() + " sistemden silindi.");
	}
	
	public void update(User user) {
		System.out.println("��renci " + user.getName() + " sistemde g�ncellendi.");
	}
	
}
