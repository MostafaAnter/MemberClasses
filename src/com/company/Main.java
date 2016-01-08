package com.company;


import olives.OliveJar;


//Member class
public class Main {

    public static void main(String[] args) {

        OliveJar oliveJar = new OliveJar();
        oliveJar.addOlive("Kalamata", 0x00000);
        oliveJar.addOlive("Kalamata", 0x00000);
        oliveJar.addOlive("Kalamata", 0x00000);
        oliveJar.addOlive("Kalamata", 0x00000);
        oliveJar.reportOlives();
    }
}
