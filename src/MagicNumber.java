public class MagicNumber {
    public void magicNumber(){
        int n = 3;
        int answer = 0;
        int base = 5;

        while (n > 0){
            int last = n & 1;
            n = n >> 1;
            answer += last * base;
            base = base * 5;
        }
        System.out.println(answer);
    }

}
