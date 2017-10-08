package Assignment.RegistrationSytemDriver;

import java.util.ArrayList;
import org.joda.time.LocalDate;

import Assignment.RegSystem.Module;
import Assignment.RegSystem.Programme;
import Assignment.RegSystem.Student;

class DriverTest {

	public static void main(String[] args) {
		
		LocalDate dateDOB1 = new LocalDate(1991, 01, 11);
		LocalDate dateDOB2 = new LocalDate(1992, 02, 12);
		LocalDate dateDOB3 = new LocalDate(1993, 03, 13);
		LocalDate dateDOB4 = new LocalDate(1994, 04, 14);
		LocalDate dateDOB5 = new LocalDate(1995, 05, 15);
		LocalDate dateDOB6 = new LocalDate(1996, 06, 16);
		
		Student student1 = new Student("Aimee Smith", 21, dateDOB1, "1411111");
		Student student2 = new Student("Lisa Winner", 22, dateDOB2, "1422222");
		Student student3 = new Student("Cheyr Laner", 23, dateDOB3, "1433333");
		Student student4 = new Student("Wendy Cahel", 24, dateDOB4, "1444444");
		Student student5 = new Student("Jack Byrnes", 25, dateDOB5, "1455555");
		Student student6 = new Student("Henry Davis", 26, dateDOB6, "1466666");

		ArrayList<Student> csAndITStudents = new ArrayList<Student>();
		csAndITStudents.add(student1);
		csAndITStudents.add(student2);
		csAndITStudents.add(student3);

		ArrayList<Student> eCEstudent = new ArrayList<Student>();
		eCEstudent.add(student4);
		eCEstudent.add(student5);
		eCEstudent.add(student6);

		Module softwareEngineringIII = new Module("modelling", "1433586");
		Module modelling = new Module("Modelling", "MOD");
		Module databaseII = new Module("Database II", "DBII");
		Module ProfessionalSkills = new Module("Professional Skills", "PROFF");
		Module graphics = new Module("Graphics", "1433586");
		Module securityForesnics = new Module("Security Foresnics", "SEC");
		Module programming = new Module("Programming", "PROG");
		Module math = new Module("Math", "MAT");

		ArrayList<Module> csModules = new ArrayList<Module>();
		csModules.add(securityForesnics);
		csModules.add(ProfessionalSkills);
		csModules.add(databaseII);
		csModules.add(softwareEngineringIII);
		csModules.add(programming);

		ArrayList<Module> eceModules = new ArrayList<Module>();
		eceModules.add(graphics);
		eceModules.add(modelling);
		eceModules.add(math);
		eceModules.add(softwareEngineringIII);
		eceModules.add(programming);

		Programme CsAndITProgramme = new Programme("Computer Science and Information Technology", csModules,
				new LocalDate(2017, 01, 01), new LocalDate(2017, 05, 11));

		Programme ECEProgramme = new Programme("Electronic and Computer Engineering", eceModules,
				new LocalDate(2017, 10, 01), new LocalDate(2018, 05, 12));

		registeredStudents(csAndITStudents, CsAndITProgramme, csModules);
		registeredStudents(eCEstudent, ECEProgramme, eceModules);

		System.out.println("----------------Student Details-------------------");
		printDetails(csAndITStudents);
		printDetails(eCEstudent);
	}

	public static void registeredStudents(ArrayList<Student> allStudents, Programme course, ArrayList<Module> allModules) {
		for (Module module : allModules) {
			module.addStudents(allStudents);
		}
		for (Student student : allStudents) {
			student.register(course);
		}
	}

	public static void printDetails(ArrayList<Student> allStudents) {
		for (Student student : allStudents) {
			
			
			System.out.println("\nStudent Name: " + student.getName() + 
								"\nStudent Age: " + student.getAge() + 
								"\nStudent DOB: " + student.getdOB() + 
								"\nStudent ID: " + student.getiD() + 
								"\nStudent Username: " + student.getUsername() +
								"\nStudent Course: " +  student.getCourse().getCourseName() + 
								"\nStudent Modules:" +  student.getCourse().getModules());
		}
	}
}