package com.scaler.lld.design.decorator;

import com.scaler.lld.design.decorator.interfaces.Database;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CompressionDecorator implements Database {

    private Database database;
    @Override
    public String read() {
        String value = database.read();
        return decompress(value);
    }

    private String decompress(String value) {
        return value + "-decompressed";
    }

    @Override
    public void write(String value) {
        String compressed = compress(value);
        database.write(compressed);
    }

    private String compress(String value) {
        return value + "compressed";
    }

}
