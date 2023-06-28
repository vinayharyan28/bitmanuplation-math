public class OddEven {
    public void oddEven(int number){
        if ((number & 1) == 1)
            System.out.println("ODD");
        else
            System.out.println("Even");
    }
}
