public class UniqueElementArray {
    public int findUniqueElementArray(int[] arr){
        int unique = 0;
        for (int number: arr){
            unique ^= number;
        }
        return unique;
    }
}
