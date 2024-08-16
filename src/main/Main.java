package main;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;


public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {
        Server server = ServerBuilder.forPort(8080)
                .addService(new GreetingServiceImp())
                .build();

        server.start();

        System.out.println("Server started");

        server.awaitTermination();
    }
}
