package com.valkov;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	int peopleCount=Integer.parseInt(scanner.nextLine());
	double entryFee=Double.parseDouble(scanner.nextLine());
	double pricePerSunchair=Double.parseDouble(scanner.nextLine());
	double pricePerUmbrella=Double.parseDouble(scanner.nextLine());
	double entryFeeForAll=peopleCount*entryFee;
	int peopleOnSunchairs=(int)Math.ceil(peopleCount*0.75);
	double pricePaidForSunchairs=(peopleOnSunchairs*pricePerSunchair);
	int peopleOnUmbrellas=(int)Math.ceil(peopleCount*0.50);
	double pricePaidForUmbrellas=(peopleOnUmbrellas*pricePerUmbrella);
	double finalSum=entryFeeForAll+pricePaidForSunchairs+pricePaidForUmbrellas;
		System.out.printf("%.2f lv.",finalSum);


    }
}
