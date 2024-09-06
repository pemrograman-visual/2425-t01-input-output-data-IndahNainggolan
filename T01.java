// 12S24046 - INDAH ELSADAI NAINGGOLAN
// 12S24053 - DEA ANGGREANY HUTAPEA

import java.util.*;
import java.lang.Math;

public class T01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String iSBN, jUDUL, pENULIS, pENERBIT, fORMAT;
        int tAHUNTERBIT, sTOK;
        double hARGA, mINIMUMMARGIN, rATING;

        iSBN = input.nextLine();
        jUDUL = input.nextLine();
        pENULIS = input.nextLine();
        tAHUNTERBIT = Integer.parseInt(input.nextLine());
        pENERBIT = input.nextLine();
        fORMAT = input.nextLine();
        hARGA = Double.parseDouble(input.nextLine());
        mINIMUMMARGIN = Double.parseDouble(input.nextLine());
        sTOK = Integer.parseInt(input.nextLine());
        rATING = Double.parseDouble(input.nextLine());
        System.out.println(iSBN + "|" + jUDUL + "|" + pENULIS + "|" + tAHUNTERBIT + "|" + pENERBIT + "|" + fORMAT + "|" + hARGA + "|" + mINIMUMMARGIN + "|" + sTOK + "|" + rATING);
    }
}
