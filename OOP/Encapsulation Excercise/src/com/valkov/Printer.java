package com.valkov;

public class Printer {
    private int tonerLevelPercentage=100;
    private int pagesPrinted=0;
    private boolean isDuplex;

    public Printer(int tonerLevelPercentage, int pagesPrinted, boolean isDuplex) {
        if(tonerLevelPercentage>0 && tonerLevelPercentage<=100){
            this.tonerLevelPercentage = tonerLevelPercentage;
        }
        this.pagesPrinted = pagesPrinted;
        this.isDuplex = isDuplex;
    }
    public void fillToner(int amountFilled){
        this.tonerLevelPercentage+=amountFilled;
        System.out.println("You've filled the toner,"+this.tonerLevelPercentage+"% left.");
    }
    public void printPage(int tonerUsed) {
        this.tonerLevelPercentage -= tonerUsed;
        if(tonerLevelPercentage > 0) {
            pagesPrinted++;
            System.out.println(pagesPrinted + " pages were printed");
        }
           else if (tonerLevelPercentage < 0) {
                System.out.println("Not enough toner!");
                System.out.println("No pages were printed");
                tonerLevelPercentage = 0;


        }

            System.out.println(this.tonerLevelPercentage + "% of the toner left.");




    }
    public int getTonerLevelPercentage() {
        return tonerLevelPercentage;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public boolean isDuplex() {
        return isDuplex;
    }
}
