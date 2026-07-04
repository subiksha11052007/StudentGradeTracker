import java.util.ArrayList;

class Student {
    int id;
    String name;
    ArrayList<Integer> marks;

    
    Student(int id, String name) {
        this.id = id;
        this.name = name;
        marks = new ArrayList<>();
    }

    
    void addMark(int mark) {
        marks.add(mark);
    }

 
    double getAverage() {
        int sum = 0;
        for (int m : marks) {
            sum += m;
        }
        return (double) sum / marks.size();
    }

    
    int getHighest() {
        int high = marks.get(0);
        for (int m : marks) {
            if (m > high) {
                high = m;
            }
        }
        return high;
    }

    // Find lowest mark
    int getLowest() {
        int low = marks.get(0);
        for (int m : marks) {
            if (m < low) {
                low = m;
            }
        }
        return low;
    }

    String getGrade() {
        double avg = getAverage();

        if (avg >= 90)
            return "A";
        else if (avg >= 80)
            return "B";
        else if (avg >= 70)
            return "C";
        else if (avg >= 60)
            return "D";
        else
            return "F";
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("Average: " + getAverage());
        System.out.println("Highest: " + getHighest());
        System.out.println("Lowest: " + getLowest());
        System.out.println("Grade: " + getGrade());
        System.out.println("---------------------------");
    }
}