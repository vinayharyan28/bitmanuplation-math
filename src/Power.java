public class Power {
    public void calculatePower(int base, int power){
        int ans = 1;
        while (power > 0){
            if ((power & 1) == 1){
                ans *= base;
            }
            base *= base;
            power = power >> 1;
        }
        System.out.println("Power: "+ ans);
    }
}
