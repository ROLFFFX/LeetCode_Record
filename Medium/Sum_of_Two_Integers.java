package Medium;

public class Sum_of_Two_Integers {
    public static void main(String[] args) {

    }

//    Given two integers a and b, return the sum of the two integers without using the operators + and -.
    public int getSum(int a, int b) {
        while (b != 0) {
            // carry now contains common set bits of a and b
            int carry = a & b;

            // Sum of bits of a and b where at least one of the bits is not set
            a = a ^ b;

            // Carry is shifted by one so that adding it to a gives the required sum
            b = carry << 1;
        }
        return a;
    }
}
