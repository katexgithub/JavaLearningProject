package com.katyat.classesandobjects.autoservicetask;


public class Garage {

    String address;
    boolean hasComputerDiagnostics;
    int carCapacity;
    String numberId;
    String schedule;

    Garage(String adressaDataLaCreare) {
        this.address = adressaDataLaCreare;
        System.out.println("A fost creat un garaj");
    }

    Garage(int carCapacity) {
        this.carCapacity = carCapacity;
    }
}
