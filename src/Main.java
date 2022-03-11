import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
    static boolean isAnagram(String a, String b) {
        // Complete the function
        a = a.toLowerCase();
        b = b.toLowerCase();

        ArrayList<String> listA = new ArrayList<String>();
        ArrayList<String> listB = new ArrayList<String>();

        for (int j = 0; j < a.length(); j++) {
            listA.add(a.substring(j, j + 1));
        }
        for (int j = 0; j < b.length(); j++) {
            listB.add(b.substring(j, j + 1));
        }

        for (int i = 0; i < listA.size(); i++) {
            int count = 0;
            int count1 = 0;
            for (int j = 0; j < listA.size(); j++) {
                for (int c = 0; c < listA.size(); c++) {
                    if (listA.get(j).equals(listA.get(c))) {
                        count++;
                    }
                }
            }
            for (int j = 0; j < listB.size(); j++) {
                for (int c = 0; c < listB.size(); c++) {
                    if (listB.get(j).equals(listB.get(c))) {
                        count1++;
                    }
                }
            }
            if (count != count1) {
                return false;
            }
        }
        return true;
    }
}

