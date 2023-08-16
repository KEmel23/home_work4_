import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String > listA = new ArrayList<>();
        List<String > listB = new ArrayList<>();
        List<String > listC = new ArrayList<>();
        System.out.println("ListA :");
        for (int i = 0; i < 5; i++) {
            String a = scanner.nextLine();
        listA.add(a);
        }
        System.out.println("ListB :");
        for (int i = 0; i < 5; i++) {
            String b = scanner.nextLine();
            listB.add(b);
        }
        Collections.reverse(listB);
        int index = 1;
        for (int i = 0; i < listA.size(); i++) {

            listC.addAll(i,Collections.singleton(listA.get(i)));

        }
        for (int j = 0; j < listB.size(); j++) {
            listC.addAll(index,Collections.singleton(listB.get(j)));
            index +=2;

        }
        System.out.println(listC);
        listC.sort(Comparator.comparing(String::length));
        System.out.println(listC);






    }
}