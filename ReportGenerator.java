class ReportGenerator {

    
    static void classAverage(GradeManager gm) {
        double total = 0;

        for (Student s : gm.students) {
            total += s.getAverage();
        }

        System.out.println("Class Average: " + (total / gm.students.size()));
    }

    
    static void topper(GradeManager gm) {
        Student top = gm.students.get(0);

        for (Student s : gm.students) {
            if (s.getAverage() > top.getAverage()) {
                top = s;
            }
        }

        System.out.println("Topper:");
        top.display();
    }
}