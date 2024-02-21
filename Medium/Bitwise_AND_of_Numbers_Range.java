package Medium;

public class Bitwise_AND_of_Numbers_Range {
    public int rangeBitwiseAnd(int left, int right) {
        while (right > left) right &= right - 1;
        return right;
    }
}
