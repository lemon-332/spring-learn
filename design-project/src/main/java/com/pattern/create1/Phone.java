package com.pattern.create1;

public class Phone {
    private String frame;
    private String screen;
    private String keyboard;

    private Phone(Builder builder) {
        this.frame = builder.frame;
        this.screen = builder.screen;
        this.keyboard = builder.keyboard;
    }

    @Override
    public String toString() {
        return this.frame + this.keyboard + this.screen;
    }

    public static class Builder {
        private String frame;
        private String screen;
        private String keyboard;

        public Builder frame(String frame) {
            this.frame = frame;
            return this;
        }

        public Builder screen(String screen) {
            this.screen = screen;
            return this;
        }

        public Builder keyboard(String keyboard) {
            this.keyboard = keyboard;
            return this;
        }

        public Phone build() {
            return new Phone(this);
        }
    }
}
