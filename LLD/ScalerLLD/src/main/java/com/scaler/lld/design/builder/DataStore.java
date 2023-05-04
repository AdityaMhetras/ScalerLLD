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
        private DataStore dataStore;
        //fix duplicate fields in builder class
        public  DatastoreBuilder() {
            this.dataStore = new DataStore();
        }

        //step 4 add fluent interfaces for setters
        public DatastoreBuilder init(String host, Integer port) {
            dataStore.host = host;
            dataStore.port = port;
            return this;
        }

        public DatastoreBuilder mysql() {
            dataStore.type = DatabaseType.MY_SQL;
            return this;
        }

        //step 5 - add a build hook
        public DataStore build() {

            boolean isValid = validate();
            if (!isValid) {
                throw new RuntimeException("object is not valid");
            }

            DataStore instance = new DataStore();
            instance.host = dataStore.host;
            instance.port = dataStore.port;
            instance.type = dataStore.type;

            return dataStore;
        }

        private  boolean validate() {
            if(dataStore.type == null) {
                return false;
            }
            return true;
        }
    }
}
