public class Arrays {

    public int smallestOrLargest(int[] intArray, String flag){
        int returnInt = intArray[0];
        if(flag.equals("-l")){
            for(int i = 0; i < intArray.length; i++){
                for(int j = 0; j < intArray.length; j++){
                    if(returnInt < intArray[j]){
                        returnInt = intArray[j];
                    }
                }
            }
        }else if(flag.equals("-s")){
            for(int i = 0; i < intArray.length; i++){
                for(int j = 0; j < intArray.length; j++){
                    if(returnInt > intArray[j]){
                        returnInt = intArray[j];
                    }
                }
            }
        }else{
            System.out.println("Please give a proper flag");
        }
        return returnInt;
    }

    public int findMissing(int[] intArray){
        int missing = 1;
        for(int i = 0; i < intArray.length; i++){
            for(int j = 0; j < intArray.length; j++){
                if(intArray[j] == missing){
                    missing++;
                }
            }
        }
        return missing;
    }
}
