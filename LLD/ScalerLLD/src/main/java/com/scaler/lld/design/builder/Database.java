package com.scaler.lld.design.builder;

import lombok.Generated;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Map;

@NoArgsConstructor
@Setter
@Getter
public class Database {

    private String host;
    private Integer port;
    private String username;
    private String password;
    private Long id;
    private DatabaseType type;

    public Database(String host, Integer port, String username, String password, Long id, DatabaseType type) {
        this.host = host;

//        if (port > 20000) {
//            throw new RuntimeException("invalid port");
//        }
        this.port = port;
        this.username = username;
        this.password = password;
        this.id = id;
        this.type = type;
    }
//
//    public Database(String host, Integer port, DatabaseType type) {
//        new Database(host, port, null,null,null, type);
//    }
//
//    public Database(DatabaseType type) {
//        new Database(null, null, type);
//    }

    public Database(Map<String,Object> values) {
        this.host = (String) values.get("host");
        this.port = (Integer) values.get("port");
        this.type = (DatabaseType) values.get("type");
    }

}
