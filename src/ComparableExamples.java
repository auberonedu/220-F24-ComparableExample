import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ComparableExamples {
    /**
     * Reads words from a file called "words.txt", filters words that are shorter than 4 characters,
     * and prints the number of such words along with the words themselves.
     *
     * @param args Command line arguments. Ignored.
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("words.txt"));
//
//        ArrayList<String> words = new ArrayList<>();
//
//        while (input.hasNext()) {
//            String word = input.next();
//            if (word.length() < 4) {
//                words.add(word);
//            }
//        }
//
//        System.out.println(words.size());
//
//        Collections.sort(words);
//
//        for (String word : words) {
//            System.out.println(word);
//        }
//
//        ArrayList<Integer> numbers = new ArrayList<>();
//        numbers.add(6);
//        numbers.add(22);
//        numbers.add(4);
//        numbers.add(-7);
//
//        Collections.sort(numbers);
////
////        System.out.println(numbers);
//
//        String a = "good";
//        String b = "goodbye";
//
//        System.out.println(a.compareTo(b));

        ArrayList<Person> people = new ArrayList<>();

        people.add(new Person("Auberon", 30, 74.5));
        people.add(new Person("Xinting", 29, 64.5));
        people.add(new Person("Nupur", 35, 84.5));

        Collections.sort(people);

        Person auberon = new Person("Auberon", 30, 74.5);
        Person xinting = new Person("Xinting", 29, 64.5);
        System.out.println(auberon.compareTo(xinting));

        System.out.println(people);

//        String[] words = new String[1000];
//        int wordCount = 0;
//
//        while (input.hasNext()) {
//            String word = input.next();
//            if (word.length() < 4) {
//                words[wordCount] = word;
//                wordCount++;
//            }
//            //System.out.println(word);
//        }
//
//        System.out.println(wordCount);
//
////        for(int i =0; i < wordCount; i++) {
////            System.out.println(words[i]);
////        }
//        System.out.println(words);
    }
}