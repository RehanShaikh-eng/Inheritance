package Robot;

public class RobotApp {

	public static void main (String[] args)
	{
		ChefRobot cr = new ChefRobot();
		DoctorRobot dr = new DoctorRobot();
		TeacherRobot tr = new TeacherRobot();
		
		cr.talk();
		cr.walk();
		cr.charge();
		cr.cooking();
		
		dr.talk();
		dr.walk();
		dr.charge();
		dr.surgery();
		
		tr.walk();
		tr.talk();
		tr.charge();
		tr.teaching();
	}

}
