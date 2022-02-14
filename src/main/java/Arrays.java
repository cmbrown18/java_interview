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
        //Most optimum solution
        //int n=arr.length+1;
        //int entSum=n*(n+1)/2
        //int actSum = 0;
        //for(int i = 0; i < arr.length; i++){
        //  entSum+=arr[i];
        //}
        //int missing = entSum-actSum;
        return missing;
    }

    /**
     * Finds the element in a rotated sorted array
     */
    public int findElement(int[] array, int low, int high, int numToFind) {
        int mid;
        while (low <= high) {
            mid = low + ((high - low) / 2);
            if (array[mid] == numToFind) {
                return mid;
            }

            if (array[mid] <= array[high]) {
                //Right part is sorted
                if (numToFind > array[mid] && numToFind <= array[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            } else {
                //Left part is sorted
                if (array[low] <= numToFind && numToFind < array[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
        }
        return -1;
    }

    public int findMinimum(int[] array, int low, int high){
        int mid;
        while(low<high) {
            mid = low + ((high - low) / 2);

            if (array[mid] > array[high]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return array[low];
        }

    public int findSecondLargest(int[] array){
        int highest = Integer.MIN_VALUE;
        int secondHigh = Integer.MIN_VALUE;

        for(int i = 0; i < array.length; i++){
            if(array[i] > highest){
                secondHigh = highest;
                highest = array[i];

            }else if(array[i] > secondHigh && array[i] != highest){
                secondHigh = array[i];
            }
        }
        return secondHigh;
    }
}
