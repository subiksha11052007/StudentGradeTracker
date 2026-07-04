import java.util.ArrayList;

class GradeManager {
    ArrayList<Student> students = new ArrayList<>();

    
    void addStudent(Student s) {
        students.add(s);
    }

   
    void viewStudents() {
        for (Student s : students) {
            s.display();
        }
    }

    Student searchStudent(int id) {
        for (Student s : students) {
            if (s.id == id) {
                return s;
            }
        }
        return null;
    }

   
    void deleteStudent(int id) {
        Student s = searchStudent(id);
        if (s != null) {
            students.remove(s);
            System.out.println("Student deleted.");
        } else {
            System.out.println("Student not found.");
        }
    }
}