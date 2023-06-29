package math;


public class Prime {
    public static void main(String[] args){
        for (int i=1; i<=20; i++){
            System.out.println(i + " " + isPrime(i));
        }

        // optimization prime number
        int n = 40;
        boolean[] primes = new boolean[n+1];
        sieve(primes, n);
    }

    static boolean isPrime(int n){
        if (n <= 1){
            return false;
        }
        int c = 2;
        while (c * c <= n){
            if (n%c == 0){
                return false;
            }
            c++;
        }
        return true;
    }

    static void sieve(boolean[] primes, int n){
        // false in array number is prime
        for (int i=2; i*i <= n; i++){
            if (!primes[i]){
                for (int j=i*2; j<=n; j+=i){
                    primes[j] = true;
                }
            }
        }

        for (int i=2; i<=n; i++){
            if (!primes[i]){
                System.out.print(i + " ");
            }
        }
    }
}
