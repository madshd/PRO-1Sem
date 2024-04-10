package Exam1;

import java.util.Arrays;

/*
tallene følger et mønster, hvor der tilføjes 3 til hvert tal, men med skift mellem at tilføje 1 og 2.

0 + 3 = 3
3 + 1 = 4
4 + 3 = 7
7 + 1 = 8
8 + 3 = 11
11 + 1 = 12
12 + 3 = 15
15 + 1 = 16
16 + 3 = 19
Så mønsteret synes at være at tilføje 3 til det foregående tal, men skiftevis at tilføje 1 og 2.
 */
public class Ex1h {
    public static void main(String[] args) {
        int[] h = new int[10];
        h[0] = 0;
        for (int i = 1; i < h.length; i++) {
            if (i % 2 == 0) {
                h[i] = i * 2 ;
            } else  {
                h[i] = i * 2 + 1;
            }
        }
        System.out.print(Arrays.toString(h));
    }
}

/*
        int[] h = new int[10];

        for (int i = 0; i < h.length; i++) {
            h[i] = 2 * i + i % 2;
            if (i % 2 == 0) {
                h[i] = 2 * i;
            } else
                h[i] = 2 * i + 1;
            }
        System.out.print(Arrays.toString(h));
        }

        for (int i = 1; i < 10; i++)

 */