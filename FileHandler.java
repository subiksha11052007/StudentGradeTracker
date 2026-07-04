import java.io.*;

class FileHandler {

    static void saveToFile(GradeManager gm) {
        try {
            FileWriter fw = new FileWriter("students.txt");

            for (Student s : gm.students) {
                fw.write(s.id + "," + s.name + "," + s.marks + "\n");
            }

            fw.close();
            System.out.println("Data saved successfully.");

        } catch (Exception e) {
            System.out.println("Error saving file.");
        }
    }
}