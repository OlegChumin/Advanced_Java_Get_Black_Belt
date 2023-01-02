package Part_06_Lambda.Part_41;

import java.util.ArrayList;

public class StudentInfo {
    public static void main(String[] args) {
        Student student1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student student2 = new Student("Nikolay", 'm', 28, 2, 6.4);
        Student student3 = new Student("Elena", 'f', 19, 1, 8.9);
        Student student4 = new Student("Petr", 'm', 35, 4, 7);
        Student student5 = new Student("Maria", 'f', 23, 3, 9.1);
        Student student6 = new Student("Oleg", 'm', 47, 3, 10.0);

        ArrayList<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);

        FilterStudentsByMethods search = new FilterStudentsByMethods();
        search.printAnyListCollectionByElement(students);
        search.printStudentOverGrade(students, 8);
        search.printStudentUnderAge(students, 30);
        search.printStudentMixConditions(students, 20, 9.5, 'f');

        search.testStudents(students, new CheckOverGrade());
        search.testStudents(students, new CheckUnderAge());
        search.testStudents(students, new CheckMixConditions());

        search.testStudents(students, new StudentChecks() {
            @Override
            public boolean check(Student student) {
                return student.averageGrade > 8;
            }
        });
        search.testStudents(students, new StudentChecks() {
            @Override
            public boolean check(Student student) {
                return student.age < 30;
            }
        });
        search.testStudents(students, new StudentChecks() {
            @Override
            public boolean check(Student student) {
                return student.age > 20 && student.averageGrade < 9.5 && student.maleFemale == 'f';
            }
        });

        search.testStudents(students, (Student student) -> {
            return student.averageGrade > 8;
        });

        search.testStudents(students, (Student student) -> student.age < 30);

        search.testStudents(students, (Student student) -> {
            return student.age > 20 && student.averageGrade < 9.5 && student.maleFemale == 'f';
        });

        search.testStudents(students, student -> student.averageGrade > 8);
        search.testStudents(students, student -> student.age < 30);
        search.testStudents(students, student -> student.age > 20 && student.averageGrade < 9.5 && student.maleFemale == 'f');

        search.testStudents(students, student -> {
            System.out.println("Filtered by average grade");
            return student.averageGrade > 8;
        });

        StudentChecks studentChecks = student -> student.averageGrade > 8;
        search.testStudents(students, studentChecks);
    }
}
