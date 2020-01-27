package com.company;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.*;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.http.WebSocket;
import java.sql.Connection;
import java.util.Scanner;
import java.util.logging.*;

import static org.junit.Assert.*;

/**
 * @author Alex
 * @version 1.0
 */
public class Main {
      public static void main(String[] args) throws Exception {
          try(ServerSocket serverSocket = new ServerSocket(8189);
              Socket socket = serverSocket.accept())
          {
              Scanner input = new Scanner(socket.getInputStream());
              OutputStreamWriter write = new OutputStreamWriter(socket.getOutputStream());
              write.write("Hello bitch");

          }
      }
    }
