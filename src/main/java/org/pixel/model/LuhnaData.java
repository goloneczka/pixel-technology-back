package org.pixel.model;

public class LuhnaData {

    private String input;
    private int digit;

    public LuhnaData(String input, int digit) {
        this.input = input;
        this.digit = digit;
    }


    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public int getDigit() {
        return digit;
    }

    public void setDigit(int digit) {
        this.digit = digit;
    }

}
