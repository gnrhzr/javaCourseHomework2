public class Main {

    public static void main(String[] args) {

        Course javaCourse = new Course(1,"Java & React");
        Course csharpCourse = new Course(2,"C# & Angular");

        Course[] courses = {javaCourse,csharpCourse};
        for (Course course : courses) {
            System.out.println(course.name);
        }
        System.out.println(courses.length);

        Category category1 = new Category();
        category1.id = 1;
        category1.name = "Programlama";

        CourseManager courseManager = new CourseManager();
        courseManager.addToCourse(javaCourse);
        courseManager.addToCourse(csharpCourse);

        courseManager.removeCourse(javaCourse);
        courseManager.removeCourse(csharpCourse);

    }
}
