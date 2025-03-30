// Problem 1: Minimum of an array
public class Main {
    public static int findMin(int[] arr) {
        int min =arr[0];
        for (int num : arr) {
            if (num<min) {
                min=num;
            }
        }
        return min;
    }
    // Problem 2: Average of an array
    public static double findAverage(int[] arr) {
        double sum=0;
        for (int num : arr) {
            sum+=num;
        }
        return sum / arr.length;
    }
    // Problem 3: Check if a number is prime
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    // Problem 4: Factorial using recursion
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }
    // Problem 5: Fibonacci sequence (recursive)
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    // Problem 6: Power function using recursion
    public static int power(int a, int n) {
        if (n == 0) {
            return 1;
        }
        return a * power(a, n - 1);
    }
    // Problem 7: Print all permutations of a string
    public static void printPermutations(String str) {
        permute(str, 0, str.length() - 1);
    }

    private static void permute(String str, int left, int right) {
        if (left == right) {
            System.out.println(str);
        } else {
            for (int i = left; i <= right; i++) {
                str = swap(str, left, i);
                permute(str, left + 1, right);
                str = swap(str, left, i); // Backtrack
            }
        }
    }

    private static String swap(String str, int i, int j) {
        char[] charArray = str.toCharArray();
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return new String(charArray);
    }
    // Problem 8: Check if string consists only of digits
    public static boolean isDigits(String s) {
        return s.matches("\\d+");
    }

    // Problem 9: Binomial coefficient C(n, k) using recursion
    public static int binomialCoefficient(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        }
        return binomialCoefficient(n - 1, k - 1) + binomialCoefficient(n - 1, k);
    }
    // Problem 10: GCD using recursion (Euclidean Algorithm)
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
    // Main function for testing
    public static void main(String[] args) {
        System.out.println(findMin(new int[]{10, 1, 32, 3, 45})); // 1
        System.out.println(findAverage(new int[]{3, 2, 4, 1})); // 2.5
        System.out.println(isPrime(7)); // true
        System.out.println(isPrime(10)); // false
        System.out.println(factorial(5)); // 120
        System.out.println(fibonacci(5)); // 5
        System.out.println(fibonacci(17)); // 1597
        System.out.println(power(2, 10)); // 1024
        printPermutations("IOX"); // Prints all permutations of IOX
        System.out.println(isDigits("123456")); // true
        System.out.println(isDigits("123a12")); // false
        System.out.println(binomialCoefficient(7, 3)); // 35
        System.out.println(gcd(32, 48)); // 16
    }
}
