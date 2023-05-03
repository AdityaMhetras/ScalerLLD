package com.scaler.lld.design.singleton;

public class ConnectionPool {
    //step 3 - Instance variable
    //eager creation
    private static ConnectionPool instance = new ConnectionPool();

    //step 1 - Hide the constructor
    private ConnectionPool() {}

    //step 2 - Global access point
    public static ConnectionPool getInstance() {
        return instance;
    }
}
