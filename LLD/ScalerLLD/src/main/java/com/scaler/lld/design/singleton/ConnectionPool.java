package com.scaler.lld.design.singleton;

public class ConnectionPool {
    //step 3 - Instance variable
    private static ConnectionPool instance;

    //step 1 - Hide the constructor
    private ConnectionPool() {}

    //step 2 - Global access point
    public synchronized static ConnectionPool getInstance() {
        //step 4 - if present return, else create, set, return
        if(instance == null) {
            instance = new ConnectionPool();
        }
        return instance;
    }
}
