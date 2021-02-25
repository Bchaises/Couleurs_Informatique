package Bchaises;

import java.util.Arrays;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
	ColorManager test = new ColorManager(127,127,127);

	System.out.println(Arrays.toString(test.getDoubleValues()));

	System.out.println(test.padleft("11",8));
    }
}
