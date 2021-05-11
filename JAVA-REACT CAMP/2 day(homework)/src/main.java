
public class main {

	public static void main(String[] args) {

		myCourses mycourses1 = new myCourses(1235979, "C# Angular", "Engin Demiroð");

		mycourses1.id = 1235979;
		mycourses1.name = "C# Angular";
		mycourses1.teacherName = "Engin Demiroð";

		myCourses mycourses2 = new myCourses(1332369, "Java React", "Engin Demiroð");

		mycourses2.id = 1332369;
		mycourses2.name = "Java React";
		mycourses2.teacherName = "Engin Demiroð";

		myCourses[] mycourses = { mycourses1, mycourses2 };

		for (myCourses courses : mycourses) {
			System.out.println(courses.id);
			System.out.println(courses.name);
			System.out.println(courses.teacherName);
		}
		System.out.println("---------------------");

		allCourses allcourses1 = new allCourses(1235979, "C# Angular", "Engin Demiroð");

		allcourses1.id = 1235979;
		allcourses1.name = "C# Angular";
		allcourses1.teacherName = "Engin Demiroð";

		allCourses allcourses2 = new allCourses(1332369, "Java React", "Engin Demiroð");

		allcourses2.id = 1332369;
		allcourses2.name = "Java React";
		allcourses2.teacherName = "Engin Demiroð";

		allCourses allcourses3 = new allCourses(1240541, "Programlamaya giriþ için temel kurs", "Engin Demiroð");

		allcourses3.id = 1240541;
		allcourses3.name = "Programlamaya giriþ için temel kurs";
		allcourses3.teacherName = "Engin Demiroð";

		allCourses[] allcourses = { allcourses1, allcourses2, allcourses3 };

		for (allCourses coursesAll : allcourses) {

			System.out.println(coursesAll.id);
			System.out.println(coursesAll.name);
			System.out.println(coursesAll.teacherName);
		}

	}

}
