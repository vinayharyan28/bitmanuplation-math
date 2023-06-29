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

        // power of two
        PowerOf2 powerOf2 = new PowerOf2();
        powerOf2.calculatePowerOf2(1);

        // power
        Power power = new Power();
        power.calculatePower(2, 4);

        // Count set bit
        CountSetBit countSetBit = new CountSetBit();
        countSetBit.countSetBit(45);

        // range xor for a,b = xor(b) ^ xor(a-1)
        RangeOfXor rangeOfXor = new RangeOfXor();
        int a = 3;
        int b = 9;
        int ans = rangeOfXor.xor(b) ^ rangeOfXor.xor(a-1);
        System.out.println("xor " + ans);
    }
}