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

        System.out.println("\n########## TESTING DUPLICATES ##########");
        for(String s : duplicates){
            System.out.println("The first non-repeated character in " + s + " is: " + test5.findNonDuplicate(s));
        }
    }
}
