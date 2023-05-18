package com.scaler.lld.designpatterns.decorator;

import com.scaler.lld.designpatterns.decorator.interfaces.Database;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DatabaseTest {

    private Database database = null;

    @Before
    public void setup() {
        database = new SimpleDatabase();
    }

    @Test
    public void testDatabase() {
        String value = database.read();
        Assert.assertEquals("if base decorator is called, read method returns base","base",value);
    }

    @Test
    public void testCompression() {
        Database compressed = new CompressionDecorator(database);
        String value = compressed.read();
        Assert.assertEquals("if base decorator is called, read method returns base","base-decompressed",value);
    }

    @Test
    public void testEncryption() {
        Database encrypted = new EncryptionDecorator(database);
        String value = encrypted.read();
        Assert.assertEquals("if base decorator is called, read method returns base","base-Decrypted",value);
    }

    @Test
    public void testCompressionAndEncryption() {
        Database compressed = new CompressionDecorator(database);

        Database encrypted = new EncryptionDecorator(compressed);
        String value = encrypted.read();
        Assert.assertEquals("if base decorator is called, read method returns base","base-decompressed-Decrypted",value);
    }
}
