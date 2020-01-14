package com.valkov;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
	// write your code here
        printMegaBytesAndKiloBytes(2500);
    }
    public static void  printMegaBytesAndKiloBytes(int KiloBytes){
        if(KiloBytes<0) {
            System.out.println("Invalid Value");
        }
        else{
            int MegaBytes = KiloBytes / 1024;
            int Remainder = KiloBytes % 1024;
            System.out.println(KiloBytes + " KB = " + MegaBytes + " MB and " + Remainder + " KB");
        }

    }
}
