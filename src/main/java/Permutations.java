import java.util.HashSet;
import java.util.Set;

public class Permutations {

    public Set<String> permutationOfStrings(String string){
        Set<String> permutationSet = new HashSet<>();

        if(string.length() == 0){
            permutationSet.add("");
            return permutationSet;
        }

        char c = string.charAt(0);

        String remained = string.substring(1);

        Set<String> permutedRemaining = permutationOfStrings(remained);

        for(String permuted : permutedRemaining){
            for(int i = 0; i <= permuted.length(); i++){
                String permutation = insertInto(permuted, c, i);
                permutationSet.add(permutation);
            }
        }
        return permutationSet;
    }

    public String insertInto(String perm, char firstChar, int index){
        return perm.substring(0, index) + firstChar + perm.substring(index);
    }
}
