package com.scaler.lld.designpatterns.builder;

import org.junit.Assert;
import org.junit.Test;

public class DatastoreTest {

    @Test
    public void testBuilder() {
        DataStore builder = DataStore
                .builder()
                .init("localhost",3306)
                .mysql()
                .build();
        Assert.assertEquals("if host is called, host should be localhost","localhost",builder.getHost());
        Assert.assertEquals("if type is called, type should be MYSQL",DatabaseType.MY_SQL,builder.getType());

    }

    @Test(expected = RuntimeException.class)
    public void testBuilderWithNoType() {
        DataStore.builder().build();

    }

}
