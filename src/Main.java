public class Main {
    public static void main(String[] args) {
        OddEven oddEven = new OddEven();
        oddEven.oddEven(23);

        // unique element
        int[] arr = {2, 3, 3, 4, 2, 6, 4};
        UniqueElementArray uniqueElementArray = new UniqueElementArray();
        System.out.println(uniqueElementArray.findUniqueElementArray(arr));

        // magic number
        MagicNumber magicNumber = new MagicNumber();
        magicNumber.magicNumber();

        // number of digits
        NoOfDigit noOfDigit = new NoOfDigit();
        noOfDigit.numberOfDigit();


    }
}