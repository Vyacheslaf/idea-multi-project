package org.example.api;

import org.example.core.Utils;

public class App {
    public static void main(String[] args) {
        System.out.println("Running org.example.api.App.main");
        System.out.println((Utils.isAllPositiveNumbers("12", "79") ? "A" : "Not a") + "ll numbers are positive!");
    }
}
