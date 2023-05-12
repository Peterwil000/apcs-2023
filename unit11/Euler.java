import java.math.BigInteger;

public class Euler {

     private static int counters = 0;

    public static int problem6(){
        int sumOfSquares = 0;
        int squareOfSums = 0;

        for (int i = 1; i <= 100; i++){
            sumOfSquares += (i*i);
            squareOfSums += i;
        }
        System.out.println((squareOfSums * squareOfSums) - sumOfSquares);
        return squareOfSums;
    }

    public static int problem7(int limit){
          int counter = 1;
          int result = 0;

        for(int i = 2; counter <= limit; i++){
            if(isPrime(i)){
                result = i;
                counter++;
            }
        }
        return result;
    } 

    public static  boolean isPrime(long num){
        int counter = 0;
        int sqrt = (int) Math.sqrt(num);

        for (int i = 1; i <= sqrt; i++){
            if(num % i == 0){
                counter++;
            }
            if(counter > 1){
                return false;
            }
        }
        return true;
    }

    public static long problem8(){
        String Number = "73167176531330624919225119674426574742355349194934"+
        "96983520312774506326239578318016984801869478851843"+
        "85861560789112949495459501737958331952853208805511"+
        "12540698747158523863050715693290963295227443043557"+
        "66896648950445244523161731856403098711121722383113"+
        "62229893423380308135336276614282806444486645238749"+
        "30358907296290491560440772390713810515859307960866"+
        "70172427121883998797908792274921901699720888093776"+
        "65727333001053367881220235421809751254540594752243"+
        "52584907711670556013604839586446706324415722155397"+
        "53697817977846174064955149290862569321978468622482"+
        "83972241375657056057490261407972968652414535100474"+
        "82166370484403199890008895243450658541227588666881"+
        "16427171479924442928230863465674813919123162824586"+
        "17866458359124566529476545682848912883142607690042"+
        "24219022671055626321111109370544217506941658960408"+
        "07198403850962455444362981230987879927244284909188"+
        "84580156166097919133875499200524063689912560717606"+
        "05886116467109405077541002256983155200055935729725"+
        "71636269561882670428252483600823257530420752963450";

        long current = 1l;
        long highest = 0l;
        for (int i = 0; i < Number.length() - 13; i++){
            for (int j = 1; j <= 13; j++){
                current BigInteger ()ent *= Integer.parseInt(Number.substring(i + j - 1, i + j));
            }

            if(current > highest){
                highest = current;
            }

            current = 1;
        }
        System.out.println(highest);
        return highest;
    }

    public static long problem9(){
        long product = 1l;

        for(int a = 1; a < 1000; a++){
            for(int b = 1; b < 1000; b++){
                for(int c = 1; c < 1000; c++){

                    if((a * a) + (b * b) == (c * c) && a + b +c == 1000){
                        product = a * b * c;
                    }
                }
            }
        }
        System.out.println(product);
        return product;
    }
    
    public static BigInteger problem10(){
        BigInteger sum = BigInteger.valueOf(2);

        for(long i = 3; i < 2000000; i += 2){
            if(isPrime(i)){
                sum = sum.add(BigInteger.valueOf(i));
            }
        }
        return sum;
    }
    

    
    public static int triangleNumber(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++)
            sum += i;
        return sum;
    }

    public static int problem12() {
        
        int j = 0; 
        int n = 0; 
        int numberOfDivisors = 0;
        
        while (numberOfDivisors <= 500) {

            numberOfDivisors = 0;
            j++;
            n = triangleNumber(j);

            for (int i = 1; i <= Math.sqrt(n); i++){
                if (n % i == 0){
                    numberOfDivisors++;
                }
            }
            numberOfDivisors *= 2;
        }
        return n;
        
    }
    
    public static void main(String[] args) {
       System.out.println(problem11());
    }
}
