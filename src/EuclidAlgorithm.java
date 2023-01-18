// GCD(a,b) = GCD(b,a mod b)  a>b and stop when (a mod b) = 0
public class EuclidAlgorithm {

    // Basic Euclid algorithm
    static int findGCD(int a, int b) {
        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        return a;
    }

    //Optimized Euclid Algorithm
    static int find(int a, int b) {
        if (b == 0)
            return a;
        return find(b, a % b);
    }

    public static void main(String[] args) {
        int a = 9;
        int b = 2;
        System.out.println(findGCD(a, b));
        System.out.println(find(a, b));
    }
}

/*
 * (a*b) = gcd(a,b) * lcm(a*b)
 * */