package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    double pi = 3.14;
        double alfa=50;
        double yariCap;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Yarı çapı girin = ");
        yariCap = scanner.nextDouble();
        double daireAlan = pi*yariCap*yariCap;
        double daireCevre = (pi*(yariCap*yariCap)*alfa)/360;

        System.out.println("Alan = "+daireAlan);
        System.out.println("Dairenin dilim alanı = "+daireCevre);

    }
}
