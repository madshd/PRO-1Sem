package opgaver.opg2;

public class Opg2a {
    public static void main(String[] args) {
        int expo = 0;
        int result = 1;
        printPowersOfTwo(expo, result);
    }
   public static void printPowersOfTwo(int expo, int result) {
        while (expo < 20) {
            result *= 2;
            expo++;
            System.out.println("2^" + expo + " = " + result);
        }
   }
}
