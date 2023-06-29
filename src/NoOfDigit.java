import javax.imageio.ImageTranscoder;

public class NoOfDigit {
    public void numberOfDigit(){
        int n=10, b=2;
        int ans = (int)(Math.log(n) / Math.log(b)) + 1;
        System.out.println("Number of digit = " +  ans);
    }
}
