package Exam1;

public class Ex12a {
    public static void main(String[] args) {
        int sum = 1;
        for (int i = 0; i <= 20; i++) {
            System.out.println("2^" + i + " = " + sum);
            sum *= 2;
        }
    }
}
