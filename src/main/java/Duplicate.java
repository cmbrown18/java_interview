import java.util.HashMap;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map.Entry;


public class Duplicate {

    public void findDuplicate(String toFind){
        HashMap<Character, Integer> charMap = new HashMap<>();

        for(int i = 0; i < toFind.length(); i++){
            char c = toFind.toLowerCase().charAt(i);

            if(charMap.containsKey(c)){
                charMap.put(c, charMap.get(c) + 1);
            }else{
                charMap.put(c, 1);
            }
        }

        ArrayList<Character> duplicates = new ArrayList<>();
        for(Character c : charMap.keySet()){
            if(charMap.get(c) > 1){
                System.out.println("Duplicate character: '" + c + "' shows up: " + charMap.get(c) + " times." );
                duplicates.add(c);
            }
        }
        if(duplicates.isEmpty()){
            System.out.println("No duplcaite characters in " + toFind);
        }
    }

    public Character findNonDuplicate(String toFind){
        LinkedHashMap<Character, Integer> hashMap = new LinkedHashMap<>();
        Character toReturn = null;
        for(int i = 0; i < toFind.length(); i++){
            Character c = toFind.toLowerCase().charAt(i);

            if(hashMap.containsKey(c)){
                hashMap.put(c, hashMap.get(c) + 1);
            }else{
                hashMap.put(c, 1);
            }
        }

        for(Entry<Character, Integer> e : hashMap.entrySet()){
            if(e.getValue() == 1){
                toReturn = e.getKey();
                break;
            }
        }
        return toReturn;
    }
}
