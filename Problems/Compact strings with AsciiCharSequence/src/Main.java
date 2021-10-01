import java.util.*;

class AsciiCharSequence implements CharSequence {

    byte[] ascii;

    public AsciiCharSequence(byte[] byteArray) {
        this.ascii = byteArray;
    }

    private char[] toCharArray(byte[] bytesArr) {
        char[] chars = new char[bytesArr.length];

        for (int i = 0; i < chars.length; i++) {
            chars[i] = (char) ascii[i];
        }

        return chars;
    }

    private char[] toCharArray() {
        return toCharArray(ascii);
    }

    @Override
    public int length() {
        return ascii.length; // /2
    }

    @Override
    public char charAt(int i) {
        return (char) ascii[i];
    }

    @Override
    public CharSequence subSequence(int i, int i1) {
        byte[] subArr = Arrays.copyOfRange(ascii, i, i1);
        return new AsciiCharSequence(subArr);
    }

    @Override
    public String toString() {
        return new String(toCharArray());
    }
}
