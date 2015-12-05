package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int cyfra,suma=0,i=0,j=0;
        double sp=0,sn=0;
        Scanner odczyt = new Scanner(System.in);
        System.out.println("Podaj liczbe calkowita");
        cyfra = odczyt.nextInt();
        odczyt.close();
        while (cyfra> 0) {
            System.out.println(cyfra % 10);
            suma= suma+(cyfra % 10);
            if ((cyfra % 2)==0){
                i++;
                sp=sp+(cyfra % 10);
            }
            else
            {
                j++;
                sn=sn+(cyfra % 10);
            }
            cyfra = cyfra / 10;
        }
        System.out.println("Suma cyfr to "+suma);
        System.out.println("Srednia parzysta"+sp/i);
        System.out.println("Srednia nieparzysta"+sn/j);
        System.out.println("Stosunek wynosi "+sp/sn);
    }
}
