
package project_05_18_24;

/**
 *
 * @author LOQ
 */
public class Fpb {
    public static int fpb(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        int x = 14;
        int y = 6;
        int fpb = fpb(x, y);
        System.out.println("FPB dari " + x + " dan " + y + " adalah: " + fpb);
    }
}

