package com.tictactoe.client.Controller;

import com.tictactoe.client.Model.Game;
import com.tictactoe.client.View.Printer;

import java.util.Scanner;
import java.io.*;
import java.net.Socket;

public class Main {
    public static void main(String [] args) {
        String serverName = "127.0.0.1";
        int port = 6666;

        try {
            System.out.println("Connecting to " + serverName + " on port " + port);
            Socket client = new Socket(serverName, port);

            System.out.println("Just connected to " + client.getRemoteSocketAddress());
            OutputStream outToServer = client.getOutputStream();
            DataOutputStream out = new DataOutputStream(outToServer);

            out.writeBytes("Hello from " + client.getLocalSocketAddress() + "\n");
            BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));

            System.out.println("Server says " + in.readLine());
            System.out.println("check fiels " +in.readLine());
            Game game = new Game();
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            sc.nextLine();
            int y = sc.nextInt();
            sc.nextLine();
            int p = sc.nextInt();
            sc.nextLine();
            out.writeBytes(game.makeMove(x,y,p) +"\n");
            System.out.println("");
            client.close();
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}


















        // printer.showTable(game.getField());
//        System.out.println();
//        System.out.println();
//        System.out.println("-----------------------");
        //game.putSomethingToTable();
//        System.out.println(game.getField()[0][0]);
//
//        System.out.println( game.makeMove(0,0,1));
//        System.out.println( game.makeMove(0,0,2));
//        System.out.println( game.makeMove(1,1,2));
//        printer.showTable(game.getField());

        //printer.printer();
//        printer.printer();




//        Printer printer = new Printer();
//        Game game = new  Game();
//
//        game.createField();
//        Scanner sc = new Scanner(System.in);
//        int option= 0;
//        while(option != 3) {
//            System.out.println("Welcome to our game! Please choose what you wanna do:");
//            System.out.println("1. Show game field 2. Make move 3. QUIT");
//            option = sc.nextInt();
//
//            switch (option) {
//                case 1:
//                    System.out.println("All fields are shown like that: X Y");
//                    printer.showTable(game.getField(), game.getX(), game.getY());
//                    option =0;
//                    break;
//                case 2:
//                    int x;
//                    int y;
//                    int player;
//                    System.out.println("Please type in where you wanna write a sign:");
//                    System.out.println("X:");
//
//
//                    x = sc.nextInt();
//                    sc.nextLine();
//                    System.out.println("Y:");
//                    y = sc.nextInt();
//                    sc.nextLine();
//                    System.out.println("What sign? 1 - X | 2 - O");
//                    player = sc.nextInt();
//                    sc.nextLine();
//                    System.out.println(game.makeMove(x, y, player));
//                    printer.showTable(game.getField(), game.getX(), game.getY());
//                    System.out.println("check if won" + game.seekForWinner());
//                    System.out.println("check for tie " +game.checkIfTie());
//                    if(game.seekForWinner() || game.checkIfTie()){
//                        option =3;
//                    }
//            }
//        }


//    }
//}