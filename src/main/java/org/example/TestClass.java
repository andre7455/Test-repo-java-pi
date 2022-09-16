package org.example;

public class TestClass {
    public String test(String x){
        for(int i = 0; i < 5; i++){
            x = x + x;
        }
        return x;
    }
}
