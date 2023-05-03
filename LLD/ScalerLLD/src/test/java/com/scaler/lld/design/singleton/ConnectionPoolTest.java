package com.scaler.lld.design.singleton;

import org.junit.Assert;
import org.junit.Test;

public class ConnectionPoolTest {

    @Test
    public void testSingleton() {
        ConnectionPool connectionPool = ConnectionPool.getInstance();
        Assert.assertNotNull("if instance is called, instance should not be null",connectionPool);

        ConnectionPool connectionPool2 = ConnectionPool.getInstance();
        Assert.assertEquals("if instance is called twice, it should return same instance",
                connectionPool,connectionPool2);
    }


}