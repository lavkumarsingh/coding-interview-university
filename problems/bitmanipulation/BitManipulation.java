package bitmanipulation;

public class BitManipulation {
    public static void main(String[] args) {
        System.out.println(setBit(5, 4));
        System.out.println(clearBit(5, 2));
        System.out.println(flipBit(5, 2));
        System.out.println(isBitSet(53, 4));
    }

    public static int setBit(int value, int bitPosition) {
        // value = 5 = 00101
        // bitPosition = 4 = 00100
        // mask = 00001 << 00100 = 10000
        // result = 00101 | 10000 = 10101
        int mask = 1 << bitPosition;
        return value | mask;
    }

    public static int clearBit(int value, int bitPosition) {
        // value = 5 = 101
        // bitPosition = 2 = 010
        // mask = 001 << 010 = 100
        // ~mask = ~100 = 011
        // result = 101 & 011 = 001
        int mask = 1 << bitPosition;
        return value & ~mask;
    }

    public static int flipBit(int value, int bitPosition) {
        // value = 5 = 101
        // bitPosition = 2 = 010
        // mask = 001 << 010 = 100
        // result = 101 ^ 100 = 001
        int mask = 1 << bitPosition;
        return value ^ mask;
    }

    public static int isBitSet(int value, int bitPosition) {
        // value = 53 = 110101
        // bitPosition = 4 = 100
        // shifted = 110101 >> 100 = 11
        // result = 11 & 01 = 01
        int shifted = value >> bitPosition;
        return shifted & 1;
    }
}