package odev3;

public class InstructorManager extends User{
	public void courseInformation(Instructor instructor) {
		System.out.println(instructor.getName() + " tarafýndan " + instructor.getCourse() + " kursu verilmektedir." );
	}
}