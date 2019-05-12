package com;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class HWServer {


    public static void begin() {

        System.out.println("Starting server");
        try (
                ServerSocket serverSocket = new ServerSocket(4004);
                Socket clientSocket = serverSocket.accept();
                InputStreamReader inputStream = new InputStreamReader(clientSocket.getInputStream());
                BufferedReader bufferedReader = new BufferedReader(inputStream)
        ) {
            System.out.println("Server connecting in user");
            System.out.println("Server read number of client : " + bufferedReader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Server work is dan");
        }
    }
}
