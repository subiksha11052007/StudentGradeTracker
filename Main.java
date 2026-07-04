import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GradeManager gm = new GradeManager();

        while (true) {
            System.out.println("\n===== Student Grade Tracker =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Generate Report");
            System.out.println("6. Save to File");
            System.out.println("7. Exit");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    Student s = new Student(id, name);

                    System.out.print("Enter number of subjects: ");
                    int n = sc.nextInt();

                    for (int i = 0; i < n; i++) {
                        System.out.print("Enter mark " + (i + 1) + ": ");
                        s.addMark(sc.nextInt());
                    }

                    gm.addStudent(s);
                    break;

                case 2:
                    gm.viewStudents();
                    break;

                case 3:
                    System.out.print("Enter student ID: ");
                    Student found = gm.searchStudent(sc.nextInt());

                    if (found != null)
                        found.display();
                    else
                        System.out.println("Student not found.");
                    break;

                case 4:
                    System.out.print("Enter ID to delete: ");
                    gm.deleteStudent(sc.nextInt());
                    break;

                case 5:
                    ReportGenerator.classAverage(gm);
                    ReportGenerator.topper(gm);
                    break;

                case 6:
                    FileHandler.saveToFile(gm);
                    break;

                case 7:
                    System.out.println("Exiting...");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
