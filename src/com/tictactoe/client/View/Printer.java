package com.tictactoe.client.View;

/**
 * Created by RENT on 2017-06-22.
 */
public class Printer {


    public void showTable(String[][] table, int x, int y){



        //game.getField();
        //int i;
        int j = 0;
        while(j<x) {

            for (int k = 0; k < y; k++) {
                System.out.print(" " + table[j][k] + " ");
                if (k < y - 1) {
                    System.out.print(" | ");
                }
            }
            if(j<table.length-1){
            System.out.println();
            for (int k = 0; k < y-1 ; k++) {

                System.out.print("  - " + "  + ");

                if (k == y - 2) {
                   System.out.print(" - ");
                    System.out.println();
                }
            }}
            j++;
        }
//
//        for (int k = 0; k < table.length ; k++) {
//            System.out.print(" " + table[j][k] +" ");
//            if(k <table.length-1){
//                System.out.print(" | ");
//            }
//        }
//        System.out.println();
//        for (int k = 0; k < table.length -1 ; k++) {
//
//            System.out.print( "  - " + "  + ");
//
//            if(k==table.length-2){
//                System.out.print(" - ");
//                System.out.println();
//            }
//        }
//        j++;
//
//        for (int k = 0; k < table.length ; k++) {
//            System.out.print(" " + table[j][k] +" ");
//            if(k <table.length-1){
//                System.out.print(" | ");
//            }
//        }
        System.out.println();
        System.out.println();
    }

    public void stringsToTable(String s, int x, int y){


        String[] temp = s.split(" ");

        int j = 0;
        while(j<x) {

            for (int k = 0; k < y; k++) {
                System.out.print(" " + table[j][k] + " ");
                if (k < y - 1) {
                    System.out.print(" | ");
                }
            }
            if(j<table.length-1){
                System.out.println();
                for (int k = 0; k < y-1 ; k++) {

                    System.out.print("  - " + "  + ");

                    if (k == y - 2) {
                        System.out.print(" - ");
                        System.out.println();
                    }
                }}
            j++;

      return null;
    }


}
