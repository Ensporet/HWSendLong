package com;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class HWClient {

    public static void begin() {

        System.out.println("Start client");
        try (
                Socket clientSocket = new Socket("localhost", 4004);
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(clientSocket.getOutputStream());
                BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
                Scanner scanner = new Scanner(System.in)
        ) {
            System.out.println("User entered a long number : ");
            bufferedWriter.write(enterLongNumber(scanner));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Client work is dan");
        }

    }

    private static String enterLongNumber(Scanner scanner) {
        String string;
        while (!(string = scanner.nextLine()).matches("[-\\+]?\\d+")) {
            System.out.println("Exception !!! Entered a correct number long!");
        }
        return string;

    }


}
