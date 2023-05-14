package com.katyat.classesandobjects.autoservicetask;

public class Car {
    int km;
    int productionYear;
    double carPrice;
    String gearType;
    String make;
    String model;
    String fuelType;

    Car(String makeParametruDeIntrare, String modelFormalParameter, int productionYear, String fuelType) {
        make = makeParametruDeIntrare;
        this.model = modelFormalParameter;
        this.productionYear = productionYear;
        this.fuelType = fuelType;
        System.out.println("In urma executiei acestul constructor 4 parametri se creaza un nou obiect despre care nu cunoastem price, gearType, ka");
    }

     Car(String make, String model){
        this.make = make;
        this.model = model;
         System.out.println("A fost creata o masina despre care cunoastem doar marca si modelul ");
     }

}
