public class Rotation {

    public boolean checkRotation(String one, String two){
        String three = one + one;
        return three.contains(two);
    }
}
