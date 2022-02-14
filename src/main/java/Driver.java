import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class Driver {


    public static void main(String[] args) {

        //Reverse a String without using the builtins
        StringReverse reversal = new StringReverse();
        String[] strings = new String[5];
        strings[0] = "Hannah";
        strings[1] = "Table";
        strings[2] = "Rusty";
        strings[3] = "Sage";
        strings[4] = "Random";

        System.out.println("########## TESTING REVERSAL ##########");
        for (int i = 0; i < strings.length; i++) {
            System.out.println("Original: " + strings[i] + " Reverse: " + reversal.reverse(strings[i]));
        }

        //Check if a string is a palindrome, using the reverse method above, not case-sensitive
        String[] strings2 = new String[6];
        strings2[0] = "hannah";
        strings2[1] = "table";
        strings2[2] = "madam";
        strings2[3] = "refer";
        strings2[4] = "Racecar";
        strings2[5] = "random";

        System.out.println("\n########## TESTING PALINDROME ##########");
        for (int i = 0; i < strings2.length; i++) {
            System.out.println("Original: " + strings2[i] + " Reverse: " + reversal.reverse(strings2[i]));
            System.out.println("Is a palindrome: " + strings2[i].equalsIgnoreCase(reversal.reverse(strings2[i])));
        }

        //Checking if two strings are anagrams of each other
        String[] anagram1 = new String[5];
        String[] anagram2 = new String[5];
        anagram1[0] = "Angel";
        anagram1[1] = "Oh";
        anagram1[2] = "Arc";
        anagram1[3] = "Bar";
        anagram1[4] = "Who";
        anagram2[0] = "Angel";
        anagram2[1] = "No";
        anagram2[2] = "Car";
        anagram2[3] = "Something";
        anagram2[4] = "How";
        Anagrams test2 = new Anagrams();

        System.out.println("\n########## TESTING ANAGRAMS ##########");
        for (int i = 0; i < anagram1.length; i++) {
            System.out.println(anagram1[i] + " and " + anagram2[i] + " are anagrams? " +
                    test2.checkAnagram(anagram1[i], anagram2[i]));

        }


        //Checking if a string has all unique characters
        String[] unique = new String[5];
        unique[0] = "Chris";
        unique[1] = "Christopher";
        unique[2] = "Rusty";
        unique[3] = "Hannah";
        unique[4] = "Thisisachecktoseehowlongitruns";
        Uniqueness test3 = new Uniqueness();

        System.out.println("\n########## TESTING UNIQUENESS ##########");
        for (String s : unique) {
            System.out.println("Is " + s + " unique? " + test3.unique(s));
        }

        //Checking if one string is a rotation of the other one
        String[] rotate1 = new String[3];
        String[] rotate2 = new String[3];

        rotate1[0] = "ChrisBrown";
        rotate1[1] = "RustyandSage";
        rotate1[2] = "Comingupwiththesearehard";
        rotate2[0] = "BrownChris";
        rotate2[1] = "SageandRusty";
        rotate2[2] = "hardComingupwith";
        Rotation test4 = new Rotation();
        System.out.println("\n########## TESTING ROTATION ##########");

        for(int i = 0; i < rotate1.length; i++){
            System.out.println("Are " + rotate1[1] + " and " + rotate2[i] +
                    " rotations of each other? " + test4.checkRotation(rotate1[i], rotate2[i]));
        }

        //Checking for duplicate characters

        String[] duplicates = new String[4];
        duplicates[0] = "Chris";
        duplicates[1] = "Check";
        duplicates[2] = "Sage";
        duplicates[3] = "Christopher";

        Duplicate test5 = new Duplicate();
        System.out.println("\n########## TESTING DUPLICATES ##########");
        for(String s : duplicates ){
            test5.findDuplicate(s);
        }

        System.out.println("\n########## TESTING NON DUPLICATE ##########");
        for(String s : duplicates){
            System.out.println("The first non-repeated character in " + s + " is: " + test5.findNonDuplicate(s));
        }

        System.out.println("\n########## TESTING SUBSTRINGS ##########");
        String[] subStrings = new String[4];
        subStrings[0] = "abbc";
        subStrings[1] = "ababa";
        subStrings[2] = "abcabc";
        subStrings[3] = "asa";

        Substrings test6 = new Substrings();
        for(String s : subStrings){
            test6.findSubStrings(s);
            System.out.println("\n");
        }

        System.out.println("\n########## TESTING STRING LENGTH ##########");
        StringLength test7 = new StringLength();
        for(String s : subStrings){
            System.out.println("Length of " + s + " is " + test7.counting(s));
        }

        System.out.println("\n########## TESTING PERMUTATIONS ###########");

        String[] permutations = new String[3];
        permutations[0] = "ABC";
        permutations[1] = "DEF";
        permutations[2] = "GHI";

        Permutations test8 = new Permutations();

        for(String s : permutations) {
            Set<String> returned = test8.permutationOfStrings(s);
            for(Iterator iterator = returned.iterator(); iterator.hasNext();){
                String returnedString = (String)iterator.next();
                System.out.println(returnedString);
            }
        }

        System.out.println("\n\n########## NOW TESTING ARRAYS ##########\n\n\n");

        System.out.println("\n########## LARGEST OR SMALLEST ##########");

        Random random = new Random();
        Arrays test9 = new Arrays();
        int[] ints = new int[10];
        int count = 10;
        for(int i = 0; i < count; i++){
            for(int j = 0; j < 10; j++){
                ints[j] = random.nextInt(100);
            }
            System.out.print("The array is: ");
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println("\nThe largest number: " + test9.smallestOrLargest(ints, "-l"));
        }

        for(int i = 0; i < count; i++){
            for(int j = 0; j < 10; j++){
                ints[j] = random.nextInt(100);
            }
            System.out.print("The array is: ");
            for(int anInt : ints){
                System.out.print(anInt + " ");
            }
            System.out.println("\nThe smallest number: " + test9.smallestOrLargest(ints, "-s"));
        }

        System.out.println("\n########## FINDING MISSING NUMBER ###########\n");
        int[] ints1 = new int[10000];
        int counter = 0;
        while(counter < 10000){
            ints1[counter] = counter;
            counter++;
        }

        ints1[9579] = 10001;
        System.out.println("The missing number is: " + test9.findMissing(ints1));

        System.out.println("\n########## FIND ELEMENT IN ROTATED SORTED ARRAY");

        int[] array = {16,19,21,25,3,5,8,10};
        int[] array1 = {4,10,13,17,19,22};

        System.out.println("Index of Element 5 : " + test9.findElement(array, 0, array.length-1, 16));
        System.out.println("Index of Element 5 : " + test9.findElement(array1, 0, array1.length-1, 22));

        System.out.println("\n########## FIND MINIMUM ELEMENT IN ROTATED SORTED ARRAY ###########");

        System.out.println("Minimum element in the array: " + test9.findMinimum(array, 0, array.length-1));
        System.out.println("Minimum element in the array: " + test9.findMinimum(array1, 0, array1.length-1));

        System.out.println("\n########## FIND SECOND HIGHEST NUMBER ###########");

        System.out.println("Minimum element in the array: " + test9.findSecondLargest(array));
        System.out.println("Minimum element in the array: " + test9.findSecondLargest(array1));
    }
}
