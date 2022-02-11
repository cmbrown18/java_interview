public class Driver {


    public static void main(String[] args){
        StringReverse reversal = new StringReverse();

        String[] strings = new String[5];
        strings[0] = "Hannah";
        strings[1] = "Table";
        strings[2] = "Rusty";
        strings[3] = "Sage";
        strings[4] = "Random";

        for(int i = 0; i < strings.length; i++){
            System.out.println(reversal.reverse(strings[i]));
        }
    }
}
