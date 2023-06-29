public class CountSetBit {
    public void countSetBit(int n){
        System.out.println(Integer.toBinaryString(n));
        int count = 0;
        while (n > 0){
            count++;
            n -= (n & -n);
        }
        System.out.println("Number of count set bit = " + count);
    }
}
