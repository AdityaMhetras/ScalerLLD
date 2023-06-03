package com.scaler.lld.designpatterns.builderpen;

import lombok.Getter;

@Getter
public class Kalam {
    private String refill;
    private String grip;
    private String cap;

    // step 1 make constructor private
    private Kalam() {}

    // create static initializer
    public static KalamBuilder builder() {
        return new KalamBuilder();
    }

    // step 2 create static inner builder class
    public static class KalamBuilder {
        //step 3 create private instance of Kalam
        private Kalam kalam;

        public KalamBuilder() {
            this.kalam = new Kalam();
        }

        //step 3 add fluent interfaces for setters
        public KalamBuilder withRefill(String refill) {
            kalam.refill = refill;
            return this;
        }

        public KalamBuilder withGrip(String grip) {
            kalam.grip = grip;
            return this;
        }

        public KalamBuilder withCap(String cap) {
            kalam.cap = cap;
            return this;
        }

        public boolean validate() {
            return kalam.refill != null;
        }

        //step 4 add a build hook
        public Kalam build() {
            if(!validate()) {
                throw new RuntimeException("refill cannot be null");
            }
            return this.kalam;
        }
    }
}
