package odev3;

public class Main {

	public static void main(String[] args) {
	   

		User user = new User();
		user.setId(1);
		user.setName("Ceyda Saran");
		user.setPassword("weyw7q8n");
		user.setEmail("ornek@hotmail.com");
		
		UserManager userManager = new UserManager();
		userManager.login(user);
		userManager.logout(user);
		
		
		System.out.println("---------------------------");
		
		
		Instructor instructor = new Instructor();
		instructor.setId(2);
		instructor.setName("Engin Demiroğ");
		instructor.setEmail("engindemirog@hotmail.com");
		instructor.setInstructorNumber("12345");
		instructor.setCourse("Java");
		
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.courseInformation(instructor);
		
		System.out.println("---------------------------");
		
		
		Student student = new Student();
		student.setId(1);
		student.setName("Ceyda Saran");
		student.setPassword("fdsg2332");
		student.setEmail("ornek@hotmail.com");
		student.setStudentNumber(1);
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(student);
		studentManager.delete(student);
		studentManager.update(student);
		
	}
}
