package Revision;

import java.util.Arrays;

abstract class Section_2_1 {
public static void main(String[] args) {
	

	int ar1[][] = { { 10, 20, 30 }, { 40, 50, 60 }, { 40, 50, 60 }, { 10, 20, 30 } };

    for (int i = 0; i < ar1.length; i++) {

        for (int a = 0; a < ar1[i].length; a++) {
            System.out.print(ar1[i][a] + " ");
        }

        System.out.println();
    }
}
}