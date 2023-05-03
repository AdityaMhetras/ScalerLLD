package com.scaler.lld.design.builder;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class DatabaseTest {

    @Test
    public void testConstructor() {
        Database database = new Database("localhost",4533,"password",
                "username", 1L, DatabaseType.MY_SQL);
        Assert.assertNotNull("if ctor not called, obj is not null", database);
    }

    @Test(expected = RuntimeException.class)
    public void testInvalidPort() {
//        Integer port = 20001;
//        if (port > 20000) {
//            throw new RuntimeException("invalid port");
//        }
        new Database("localhost",20001,"password","username", 1L, DatabaseType.MY_SQL);

    }

    @Test
    public void testSetters() {

        Database database = new Database();
        database.setHost("localhost");
        database.setPort(4553);

        Assert.assertEquals("if setter is called, host should be localhost","localhost",database.getHost());
    }

    @Test
    public void testHashMapCtor() {
        Map<String,Object> values = new HashMap<>();
        values.put("host","localhost");
        values.put("port","3306");
        values.put("type",DatabaseType.MY_SQL);
//        values.put("host","localhost");
//        values.put("host","localhost");

        Database database = new Database(values);
        Assert.assertEquals("if ctor is called, host should be localhost","localhost",database.getHost());
        Assert.assertEquals("if ctor is called, host should be localhost",DatabaseType.MY_SQL,database.getType());

    }
}
