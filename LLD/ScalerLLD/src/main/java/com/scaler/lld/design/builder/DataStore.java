package com.scaler.lld.design.builder;

import lombok.Getter;
import lombok.Setter;

@Getter
public class DataStore {
    private String host;
    private Integer port;
    private String username;
    private String password;
    private Long id;
    private DatabaseType type;

    //step 1 - Hide constructor
    private DataStore() {}

    //add a static initializer method to create builder instance
    public static DatastoreBuilder builder() {
        return new DatastoreBuilder();
    }
    //step2 - create inner static class
    @Setter
    public static class DatastoreBuilder {

        //step 3 - copy all fields from outer class
        private String host;
        private Integer port;
        private String username;
        private String password;
        private Long id;
        private DatabaseType type;

        //step 4 add fluent interfaces for setters
        public DatastoreBuilder init(String host, Integer port) {
            this.host = host;
            this.port = port;
            return this;
        }

        public DatastoreBuilder mysql() {
            this.type = DatabaseType.MY_SQL;
            return this;
        }

        //step 5 - add a build hook
        public DataStore build() {

            boolean isValid = validate();
            if (!isValid) {
                throw new RuntimeException("object is not valid");
            }

            DataStore dataStore = new DataStore();
            dataStore.host = host;
            dataStore.port = port;
            dataStore.type = type;

            return dataStore;
        }

        private  boolean validate() {
            if(type == null) {
                return false;
            }
            return true;
        }
    }
}
