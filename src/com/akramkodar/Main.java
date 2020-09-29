package com.akramkodar;

public class Main {

    public static void main(String[] args) {
	for(var floor = 1; floor <= 220; floor++) {
        System.out.println("floor: " + floor);
        var fakeFloor = Skyscraper.toFakeFloor(floor);
        System.out.println(" fake floor: " + fakeFloor);
        var backToRealFloor = Skyscraper.toRealFloor(fakeFloor);
        System.out.println(" back to real: " + backToRealFloor);
    }
    }
}
