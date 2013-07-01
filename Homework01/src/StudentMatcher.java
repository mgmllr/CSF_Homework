import java.util.ArrayList;
import java.util.Random;

public class StudentMatcher{

    public static void main(String[] args) {
        String[] studentsArray = {"Max", "Kevin", "Dustin", "Eddie", "Adrian", "Tim", "Katie", "Phill", "Derek"};
        ArrayList<String> students = makeArrayList(studentsArray);
        matchStudents(students);
    }

    public static void matchStudents(ArrayList<String> students) {
        if(isEven(students)){
            while(students.size() > 0) {
                makePair(students);
            }
        } else {
            while(students.size() > 3) {
                makePair(students);
            }
            System.out.println(students.get(0) + " + " + students.get(1) + " + " + students.get(2));
        }

    }

    public static boolean isEven(ArrayList<String> array) {
        if(array.size() % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void makePair(ArrayList<String> students) {
        Random randomGenerator = new Random();
        int index = randomGenerator.nextInt(students.size());
        String s1 = students.get(index);
        students.remove(index);
        index = randomGenerator.nextInt(students.size());
        String s2 = students.get(index);
        students.remove(index);
        System.out.println(s1 + " + " + s2);
    }

    public static ArrayList<String> makeArrayList(String[] array) {
        ArrayList<String> students = new ArrayList<String>();
        for(int i = 0; i < array.length; i++) {
            students.add(array[i]);
        }
        return students;
    }
}


