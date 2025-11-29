import java.util.ArrayList;
import java.util.HashMap;



public class HashmapArrays {
    public static void main(String[] args) {
        HashMap <String, ArrayList<Double>> students = new HashMap<>();
        ArrayList <Double> bob = new ArrayList<>();
        bob.add(87.3);
        bob.add(91.3);
        bob.add(88.0);
        students.put("Bob", bob);
        double average = 0;
        for (Double key : students.get("Bob")) {
            average += key;
        } average = average / students.get("Bob").size();
        System.out.println("Средний показатель оценок Боба - " + average);


        ArrayList <Double> tom = new ArrayList<>();
        tom.add(89.3);
        tom.add(79.1);
        tom.add(90.5);
        students.put("Tom", tom);
        for (Double key : students.get("Tom")) {
            average += key;
        } average = average / students.get("Tom").size();
        System.out.println("Средний показатель оценок Тома - " + average);

        ArrayList <Double> sam = new ArrayList<>();
        sam.add(90.1);
        sam.add(96.1);
        sam.add(90.5);
        students.put("Sam", sam);
        for (Double key : students.get("Sam")) {
            average += key;
        } average = average / students.get("Sam").size();
        System.out.println("Средний показатель оценок Сэма - " + average);



        }

}

