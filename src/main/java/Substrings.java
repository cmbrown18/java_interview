public class Substrings {

    public void findSubStrings(String toFind){

        for(int i = 0; i < toFind.length(); i++){
            for(int j = i+1; j <= toFind.length(); j++){
               System.out.println(toFind.substring(i, j));
            }
        }
    }
}
