import java.math.BigInteger;
import java.util.ArrayList;

public class Euler {

     //private static int counters = 0;
     //private static long i = 0;

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
                 //BigInteger ()ent *= Integer.parseInt(Number.substring(i + j - 1, i + j));
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

    public static String problem13(){

        int length = 100;
            
            BigInteger[] seany = { new BigInteger("37107287533902102798797998220837590246510135740250"),
                new BigInteger("46376937677490009712648124896970078050417018260538"),
                new BigInteger("74324986199524741059474233309513058123726617309629"),
                new BigInteger("91942213363574161572522430563301811072406154908250"),
                new BigInteger("23067588207539346171171980310421047513778063246676"),
                new BigInteger("89261670696623633820136378418383684178734361726757"),
                new BigInteger("28112879812849979408065481931592621691275889832738"),
                new BigInteger("44274228917432520321923589422876796487670272189318"),
                new BigInteger("47451445736001306439091167216856844588711603153276"),
                new BigInteger("70386486105843025439939619828917593665686757934951"),
                new BigInteger("62176457141856560629502157223196586755079324193331"),
                new BigInteger("64906352462741904929101432445813822663347944758178"),
                new BigInteger("92575867718337217661963751590579239728245598838407"),
                new BigInteger("58203565325359399008402633568948830189458628227828"),
                new BigInteger("80181199384826282014278194139940567587151170094390"),
                new BigInteger("35398664372827112653829987240784473053190104293586"),
                new BigInteger("86515506006295864861532075273371959191420517255829"),
                new BigInteger("71693888707715466499115593487603532921714970056938"),
                new BigInteger("54370070576826684624621495650076471787294438377604"),
                new BigInteger("53282654108756828443191190634694037855217779295145"),
                new BigInteger("36123272525000296071075082563815656710885258350721"),
                new BigInteger("45876576172410976447339110607218265236877223636045"),
                new BigInteger("17423706905851860660448207621209813287860733969412"),
                new BigInteger("81142660418086830619328460811191061556940512689692"),
                new BigInteger("51934325451728388641918047049293215058642563049483"),
                new BigInteger("62467221648435076201727918039944693004732956340691"),
                new BigInteger("15732444386908125794514089057706229429197107928209"),
                new BigInteger("55037687525678773091862540744969844508330393682126"),
                new BigInteger("18336384825330154686196124348767681297534375946515"),
                new BigInteger("80386287592878490201521685554828717201219257766954"),
                new BigInteger("78182833757993103614740356856449095527097864797581"),
                new BigInteger("16726320100436897842553539920931837441497806860984"),
                new BigInteger("48403098129077791799088218795327364475675590848030"),
                new BigInteger("87086987551392711854517078544161852424320693150332"),
                new BigInteger("59959406895756536782107074926966537676326235447210"),
                new BigInteger("69793950679652694742597709739166693763042633987085"),
                new BigInteger("41052684708299085211399427365734116182760315001271"),
                new BigInteger("65378607361501080857009149939512557028198746004375"),
                new BigInteger("35829035317434717326932123578154982629742552737307"),
                new BigInteger("94953759765105305946966067683156574377167401875275"),
                new BigInteger("88902802571733229619176668713819931811048770190271"),
                new BigInteger("25267680276078003013678680992525463401061632866526"),
                new BigInteger("36270218540497705585629946580636237993140746255962"),
                new BigInteger("24074486908231174977792365466257246923322810917141"),
                new BigInteger("91430288197103288597806669760892938638285025333403"),
                new BigInteger("34413065578016127815921815005561868836468420090470"),
                new BigInteger("23053081172816430487623791969842487255036638784583"),
                new BigInteger("11487696932154902810424020138335124462181441773470"),
                new BigInteger("63783299490636259666498587618221225225512486764533"),
                new BigInteger("67720186971698544312419572409913959008952310058822"),
                new BigInteger("95548255300263520781532296796249481641953868218774"),
                new BigInteger("76085327132285723110424803456124867697064507995236"),
                new BigInteger("37774242535411291684276865538926205024910326572967"),
                new BigInteger("23701913275725675285653248258265463092207058596522"),
                new BigInteger("29798860272258331913126375147341994889534765745501"),
                new BigInteger("18495701454879288984856827726077713721403798879715"),
                new BigInteger("38298203783031473527721580348144513491373226651381"),
                new BigInteger("34829543829199918180278916522431027392251122869539"),
                new BigInteger("40957953066405232632538044100059654939159879593635"),
                new BigInteger("29746152185502371307642255121183693803580388584903"),
                new BigInteger("41698116222072977186158236678424689157993532961922"),
                new BigInteger("62467957194401269043877107275048102390895523597457"),
                new BigInteger("23189706772547915061505504953922979530901129967519"),
                new BigInteger("86188088225875314529584099251203829009407770775672"),
                new BigInteger("11306739708304724483816533873502340845647058077308"),
                new BigInteger("82959174767140363198008187129011875491310547126581"),
                new BigInteger("97623331044818386269515456334926366572897563400500"),
                new BigInteger("42846280183517070527831839425882145521227251250327"),
                new BigInteger("55121603546981200581762165212827652751691296897789"),
                new BigInteger("32238195734329339946437501907836945765883352399886"),
                new BigInteger("75506164965184775180738168837861091527357929701337"),
                new BigInteger("62177842752192623401942399639168044983993173312731"),
                new BigInteger("32924185707147349566916674687634660915035914677504"),
                new BigInteger("99518671430235219628894890102423325116913619626622"),
                new BigInteger("73267460800591547471830798392868535206946944540724"),
                new BigInteger("76841822524674417161514036427982273348055556214818"),
                new BigInteger("97142617910342598647204516893989422179826088076852"),
                new BigInteger("87783646182799346313767754307809363333018982642090"),
                new BigInteger("10848802521674670883215120185883543223812876952786"),
                new BigInteger("71329612474782464538636993009049310363619763878039"),
                new BigInteger("62184073572399794223406235393808339651327408011116"),
                new BigInteger("66627891981488087797941876876144230030984490851411"),
                new BigInteger("60661826293682836764744779239180335110989069790714"),
                new BigInteger("85786944089552990653640447425576083659976645795096"),
                new BigInteger("66024396409905389607120198219976047599490197230297"),
                new BigInteger("64913982680032973156037120041377903785566085089252"),
                new BigInteger("16730939319872750275468906903707539413042652315011"),
                new BigInteger("94809377245048795150954100921645863754710598436791"),
                new BigInteger("78639167021187492431995700641917969777599028300699"),
                new BigInteger("15368713711936614952811305876380278410754449733078"),
                new BigInteger("40789923115535562561142322423255033685442488917353"),
                new BigInteger("44889911501440648020369068063960672322193204149535"),
                new BigInteger("41503128880339536053299340368006977710650566631954"),
                new BigInteger("81234880673210146739058568557934581403627822703280"),
                new BigInteger("82616570773948327592232845941706525094512325230608"),
                new BigInteger("22918802058777319719839450180888072429661980811197"),
                new BigInteger("77158542502016545090413245809786882778948721859617"),
                new BigInteger("72107838435069186155435662884062257473692284509516"),
                new BigInteger("20849603980134001723930671666823555245252804609722"),
                new BigInteger("53503534226472524250874054075591789781264330331690") };

            BigInteger sum = BigInteger.ZERO;
            for (int i = 0; i < length; i++) {
                
                sum = sum.add(seany[i]);
            }
            
            String result = String.valueOf(sum);

            result = result.substring(0, 10);
            
            return result;
    }

    public static long problem14(){

        int length = 1000000; 
		int size = 0;
        int max = 1;
        int n = 0;

		for (int i = 2; i < length; i++) {
			size = evenOdd(i);
			if (size > max) {
				max = size;
				n = i;
			}
		}
		return n;
	}

	public static int evenOdd(int n) {

		long num = n;
		ArrayList<Long> sean = new ArrayList<>();
		int size = 0;
		while (num != 1) {
			sean.add(num);
			
			if (num % 2 == 0) {
				num = num / 2;
			} else {
				num = 3 * num + 1;
			}
		}
		size = sean.size();
		return size;
	}

    public static int problem15(){
        int counter = 0;
        return counter;

        seany = new int[20][20];
        for(int i = 0; i <= seany.length; i++){
            for(int j = 0; j <= seany[0].length; j++){

            }
        }
    }

    public static long problem16(){
        long count = 0;
        long val = (long)Math.pow(2, 1000);
        long vals = 9223372036854775807l;

        char[] digits = String.valueOf(vals).toCharArray();

        // for(int i = 0; i < digits.length; i++){
        //     count += digits[i];
        // }

        for (char c : digits) {
            count += Integer.parseInt(c + "");
        }
        return count;
    }
    public static void main(String[] args) {
       System.out.println(problem16());
    }
}


