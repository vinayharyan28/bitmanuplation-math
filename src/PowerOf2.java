public class PowerOf2 {
    public void calculatePowerOf2(int n){
        boolean ans = (n & (n-1)) == 0;
        System.out.println(ans);
    }
}
