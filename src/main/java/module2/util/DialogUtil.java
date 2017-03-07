package module2.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DialogUtil {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static String readString() {
        try {
            return reader.readLine();
        } catch (IOException e) {
            throw new RuntimeException("Cannot read String", e);
        }
    }

    public static Long readLong() {
        try {
            return Long.parseLong(reader.readLine());
        } catch (IOException e) {
            throw new RuntimeException("Cannot read Long", e);
        }
    }

    public static int readInt() {
        try {
            return Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            throw new RuntimeException("Cannot read Integer", e);
        }
    }

    public static void closeReader() {
        try {
            reader.close();
        } catch (IOException e) {
            throw new RuntimeException("Cannot get reader", e);
        }
    }
}
