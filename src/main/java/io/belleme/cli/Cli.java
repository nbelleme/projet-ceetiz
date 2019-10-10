package io.belleme.cli;

import java.util.Scanner;

public class Cli {

    public static void main(String... args){
        try(Scanner command = new Scanner(System.in)) {
            System.out.println("Enter command: ");
            boolean running = true;

            while(running){

                switch(command.nextLine()){
                    case "create":
                        System.out.println("Machine started!");
                        break;

                    case "stop":
                        System.out.println("Machine stopped.");
                        break;

                    case "exit":
                        System.out.println("Application Closed");
                        running = false;
                        break;

                    default:
                        System.out.println("Command not recognized!");
                        break;
                }
            }
        }
    }
}
