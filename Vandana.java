// import java.util.ArrayList;
// import java.util.Collections;
// import java.util.HashSet;
// import java.util.List;
// import java.util.Scanner;
// import java.util.Set;

// public class Vandana {
//     public static void main(String[] args) {
//         List<Integer> num = new ArrayList<>();
//         for (int i = 1; i <= 7; i++) {
//             num.add(i);
//         }
//         Collections.shuffle(num);
//         System.out.println("Shuffled array: " + num);

//         Scanner s1 = new Scanner(System.in);
//         System.out.print("Enter a Roman number: ");
//         String romanNumber = s1.nextLine().toUpperCase();
//         int res = romanToInteger(romanNumber);
//         System.out.println("Integer value: " + res);

//         System.out.print("Enter a sentence: ");
//         String input = s1.nextLine().toLowerCase();
//         boolean isPangram = checkIfPangram(input);

//         if (isPangram) {
//             System.out.println("The input is a pangram.");
//         } else {
//             System.out.println("The input is not a pangram.");
//         }
//     }

//     public static int romanToInteger(String s) {

//         int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
//         String[] romanSymbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
//         int res = 0;

//         for (int i = 0; i < romanSymbols.length; i++) {
//             while (s.startsWith(romanSymbols[i])) {
//                 res += values[i];
//                 s = s.substring(romanSymbols[i].length());
//             }
//         }

//         return res;
//     }

//     public static boolean checkIfPangram(String sentence) {
        
//         Set<Character> charSet = new HashSet<>();

//         for (char c : sentence.toCharArray()) {
//             if (Character.isLetter(c)) {
//                 charSet.add(c);
//             }
//         }

//         return charSet.size() == 26;
//     }
// }


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CustomShuffle {
    public static void main(String[] args) {
        List<Integer> num = new ArrayList<>();
        for (int i = 1; i <= 7; i++) {
            num.add(i);
        }
        customShuffle(num);
        System.out.println("Shuffled array: " + num);
    }

    public static void customShuffle(List<Integer> list) {
        int n = list.size();
        Random rand = new Random();

        for (int i = n - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);

            int temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);
        }
    }
}

