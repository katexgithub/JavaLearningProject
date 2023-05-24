package com.katyat.methodstask;

public class ExecutionService {
    public static void main(String[] args) {

        int randomInt = DataGeneratorUtil.getRandomInt(150, 300);
        System.out.println("Variabila randomInt: " + randomInt);

        int randomInt1 = DataGeneratorUtil.getRandomInt(150);
        System.out.println("Variabila randomInt: " + randomInt1);

        double randomDouble = DataGeneratorUtil.getRandomDouble(1000.0);
        System.out.println("Variabila randomDouble; " + randomDouble);

        double randomDouble1 = DataGeneratorUtil.getRandomDouble(-1000.0);
        System.out.println("Variabila randomDouble; " + randomDouble1);

        System.out.println("Random boolean: " + DataGeneratorUtil.getRandomBoolean());

        System.out.println("Random Email 1: " + DataGeneratorUtil.getRandomEmail());
        System.out.println("Random Email 2: " + DataGeneratorUtil.getRandomEmail());

        System.out.println("Random Valid String de X chars:" + DataGeneratorUtil.generateValidRandomString(256));
        System.out.println("Random Valid String de X chars:" + DataGeneratorUtil.generateValidRandomString(257));
        System.out.println("Random Invalid String de X chars:" + DataGeneratorUtil.generateInvalidRandomString(5));

        Customer davidConsumer = new Customer("David Smith", 25, "david_s9@hotmail.com");

        System.out.println("Name obiect David: " + davidConsumer.getName());
        System.out.println("Age obiect David: " + davidConsumer.getAge());
        System.out.println("Email obiect David: " + davidConsumer.getEmail());

        davidConsumer.setName("David Taylor");
        davidConsumer.setAge(27);
        davidConsumer.setEmail("david_taylor@hotmail.com");

        System.out.println("Name obiect David: " + davidConsumer.getName());
        System.out.println("Age obiect David: " + davidConsumer.getAge());
        System.out.println("Email obiect David: " + davidConsumer.getEmail());

        Customer randomDataCustomer = new Customer(DataGeneratorUtil.generateValidRandomString(12),
                DataGeneratorUtil.getRandomInt(127), DataGeneratorUtil.getRandomEmail());

        System.out.println(randomDataCustomer.toString());

        randomDataCustomer.setName(DataGeneratorUtil.generateValidRandomString(6));
        randomDataCustomer.setAge(DataGeneratorUtil.getRandomInt(18, 64));
        randomDataCustomer.setEmail(DataGeneratorUtil.getRandomEmail());

        System.out.println(randomDataCustomer.toString());
    }
}
