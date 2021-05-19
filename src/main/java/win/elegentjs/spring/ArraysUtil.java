package win.elegentjs.spring;

public class ArraysUtil {

    public static String toString(Object[] a) {
        if (a == null)
            return "null";
        int iMax = a.length - 1;
        if (iMax == -1)
            return "[]";

        StringBuilder b = new StringBuilder();
        b.append('\n').append('[');
        for (int i = 0; ; i++) {
            b.append(a[i]).append(", ").append("\n");
            if (i == iMax) {
                return b.append(']').toString();
            }
        }
    }
}
