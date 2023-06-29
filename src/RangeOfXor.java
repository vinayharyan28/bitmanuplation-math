public class RangeOfXor {
    public int xor(int a){
        if (a % 4 == 0){
            return a;
        } else if (a % 4 == 1)  {
            return 1;
        } else if (a % 4 == 2) {
            return a + 1;
        }else {
            return 0;
        }
    }
}
