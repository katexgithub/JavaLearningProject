package com.katyat.classesandobjects.autoservicetask;

public class ManageAutoService {
    public static void main(String[] args) {

        Garage garajulLuiAndrei = new Garage("Lunca Nistrului");
        System.out.println(" Adresa garajului lui Andrei este " + garajulLuiAndrei.address);
        garajulLuiAndrei.carCapacity = 342;
        garajulLuiAndrei.hasComputerDiagnostics = true;
        garajulLuiAndrei.numberId = "5454";
        garajulLuiAndrei.schedule = "uneori";


        System.out.println("Garajul lui Andrei are urmatoarele proprietati: Adresa" + garajulLuiAndrei.address +
                " CarCapacity:" + garajulLuiAndrei.carCapacity + " numberId: " + garajulLuiAndrei.numberId + ", Orarul" +
                " de lucru:" + garajulLuiAndrei.schedule + ", hasComputerDiagnostics: "
                + garajulLuiAndrei.hasComputerDiagnostics);


        Garage garajulLuiGheorghe = new Garage("Lunca Prutului");
        System.out.println(" Adresa garajului lui Andrei este " + garajulLuiGheorghe.address);
        garajulLuiGheorghe.carCapacity = 545;
        garajulLuiGheorghe.hasComputerDiagnostics = false;
        garajulLuiGheorghe.numberId = "5425334";
        garajulLuiGheorghe.schedule = "mai des";

        System.out.println("Garajul lui Gheorghe are urmatoarele proprietati: Adresa" + garajulLuiGheorghe.address +
                " CarCapacity:" + garajulLuiGheorghe.carCapacity + " numberId: " + garajulLuiGheorghe.numberId + ", Orarul" +
                " de lucru:" + garajulLuiAndrei.schedule + ", hasComputerDiagnostics: "
                + garajulLuiGheorghe.hasComputerDiagnostics);


        Garage garajulElenei = new Garage(345);
        garajulElenei.address = "Stefan 2";
        garajulElenei.hasComputerDiagnostics = false;
        garajulElenei.numberId = "5425334";
        garajulElenei.schedule = "mai des";

        System.out.println("Garajul Elenei are urmatoarele proprietati: Adresa" + garajulElenei.address +
                " CarCapacity:" + garajulElenei.carCapacity + " numberId: " + garajulElenei.numberId + ", Orarul" +
                " de lucru:" + garajulLuiAndrei.schedule + ", hasComputerDiagnostics: "
                + garajulElenei.hasComputerDiagnostics);


        Car masinaLuiLuilian = new Car("Mercedes", "GLE Class", 2022, "Disel");

        masinaLuiLuilian.carPrice = 45000;
        masinaLuiLuilian.km = 1000000;
        masinaLuiLuilian.gearType = "Automatical";

        System.out.println("Masina lui Lulian are probleme dar si proprietati: Make:" + masinaLuiLuilian.make + ", Model:" +
                masinaLuiLuilian.model + ", Production Year:" + masinaLuiLuilian.productionYear + ", FuelType:" + masinaLuiLuilian.fuelType +
                ", car Price:" + masinaLuiLuilian.carPrice + ", km:" + masinaLuiLuilian.km + ", gear type:" + masinaLuiLuilian.gearType);


        Tool elevatorTool = new Tool(23165465);
        elevatorTool.isElevator = true;
        elevatorTool.isUsed = true;
        elevatorTool.needsElectricity = true;

        System.out.println("Obiectul elevatortool are proprietatile" +
                " Cod Unic:" + elevatorTool.uniqueCode +
                " este Elevator:" + elevatorTool.isElevator +
                " foloseste electricitate:" + elevatorTool.needsElectricity +
                " este utilizat:" + elevatorTool.isUsed);

        Worker lucratorulGavril = new Worker();

        lucratorulGavril.name = "Gavril";
        lucratorulGavril.age = 40;
        lucratorulGavril.isExperienced = true;
        lucratorulGavril.sexType = "Masculin";
        lucratorulGavril.specialization = "Electric Auto";

        System.out.println("Obiectul lucratorulGavril  are proprietatile" +
                " Nume:" + lucratorulGavril.name +
                " Virsta:" + lucratorulGavril.age +
                " Experienta:" + lucratorulGavril.isExperienced +
                " SexType:" + lucratorulGavril.sexType +
                " specializare:" + lucratorulGavril.specialization);


    }
}
