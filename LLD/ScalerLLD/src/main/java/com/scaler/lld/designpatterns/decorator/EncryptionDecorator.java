package com.scaler.lld.designpatterns.decorator;

import com.scaler.lld.designpatterns.decorator.interfaces.Database;
import lombok.AllArgsConstructor;

// step 4 impl concrete decorators
@AllArgsConstructor
public class EncryptionDecorator implements Database {
    private Database database;
    @Override
    public String read() {
        String value = database.read();
        return decrypt(value);
    }

    @Override
    public void write(String value) {
        String encrypted = encrypt(value);
        database.write(encrypted);
    }

    private String decrypt(String value) {
        return value+"-Decrypted";
    }

    private String encrypt(String value) {
        return "Encrypted";
    }
}
