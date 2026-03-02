package Exam2Tests.Exercises.WebsiteExercises.Exercise3;

public class Exercise3Main {
    public static void main(String[] args) {
        Smartphone mySmartphone1 = new Smartphone(2024, 101, 0);
        Smartphone mySmartphone2 = new Smartphone(2019, 75, 1000);
        Smartphone mySmartphone3 = new Smartphone(2022, 15, 541);

        System.out.println("Print Smartphones - toSting()");
        System.out.println(mySmartphone1);
        System.out.println(mySmartphone2);
        System.out.println(mySmartphone3);
        System.out.println();

        System.out.println("Print Smartphones - setYear()");
        mySmartphone1.setYear(2022);
        mySmartphone2.setYear(2024);
        mySmartphone3.setYear(2019);
        System.out.println(mySmartphone1);
        System.out.println(mySmartphone2);
        System.out.println(mySmartphone3);
        System.out.println();

        System.out.println("Print Smartphones - needsCharging()");
        System.out.println(mySmartphone1.needsCharging());
        System.out.println(mySmartphone2.needsCharging());
        System.out.println(mySmartphone3.needsCharging());
        System.out.println();

        System.out.println("Print Smartphones - isBatteryFull()");
        System.out.println(mySmartphone1.isBatteryFull());
        System.out.println(mySmartphone2.isBatteryFull());
        System.out.println(mySmartphone3.isBatteryFull());
        System.out.println();

        System.out.println("Print Smartphones - charge()");
        System.out.println(mySmartphone1);
        System.out.println(mySmartphone2);
        System.out.println(mySmartphone3);
        System.out.println(mySmartphone1.charge(20));
        System.out.println(mySmartphone2.charge(20));
        System.out.println(mySmartphone3.charge(20));
        System.out.println(mySmartphone1);
        System.out.println(mySmartphone2);
        System.out.println(mySmartphone3);
        System.out.println();

        System.out.println("Print Smartphones - startApp(Waze, 15)");
        System.out.println(mySmartphone1);
        System.out.println(mySmartphone2);
        System.out.println(mySmartphone3);
        System.out.println(mySmartphone1.startApp("Waze", 15));
        System.out.println(mySmartphone2.startApp("Waze", 15));
        System.out.println(mySmartphone3.startApp("Waze", 15));
        System.out.println(mySmartphone1);
        System.out.println(mySmartphone2);
        System.out.println(mySmartphone3);
        System.out.println();

        System.out.println("Print Smartphones - startApp(Gmail, 5)");
        System.out.println(mySmartphone1);
        System.out.println(mySmartphone2);
        System.out.println(mySmartphone3);
        System.out.println(mySmartphone1.startApp("Gmail", 5));
        System.out.println(mySmartphone2.startApp("Gmail", 5));
        System.out.println(mySmartphone3.startApp("Gmail", 5));
        System.out.println(mySmartphone1);
        System.out.println(mySmartphone2);
        System.out.println(mySmartphone3);
        System.out.println();

        System.out.println("Print Smartphones - startApp(Instagram, 5)");
        System.out.println(mySmartphone1);
        System.out.println(mySmartphone2);
        System.out.println(mySmartphone3);
        System.out.println(mySmartphone1.startApp("Instagram", 5));
        System.out.println(mySmartphone2.startApp("Instagram", 5));
        System.out.println(mySmartphone3.startApp("Instagram", 5));
        System.out.println(mySmartphone1);
        System.out.println(mySmartphone2);
        System.out.println(mySmartphone3);
        System.out.println();

        System.out.println("Print Smartphones - startApp(Other, 20)");
        System.out.println(mySmartphone1);
        System.out.println(mySmartphone2);
        System.out.println(mySmartphone3);
        System.out.println(mySmartphone1.startApp("Other", 20));
        System.out.println(mySmartphone2.startApp("Other", 20));
        System.out.println(mySmartphone3.startApp("Other", 20));
        System.out.println(mySmartphone1);
        System.out.println(mySmartphone2);
        System.out.println(mySmartphone3);
        System.out.println();

        System.out.println("Print Smartphones - startApp(Other, 20)");
        System.out.println(mySmartphone1);
        System.out.println(mySmartphone2);
        System.out.println(mySmartphone3);
        System.out.println(mySmartphone1.startApp("Other", 20));
        System.out.println(mySmartphone2.startApp("Other", 20));
        System.out.println(mySmartphone3.startApp("Other", 20));
        System.out.println(mySmartphone1);
        System.out.println(mySmartphone2);
        System.out.println(mySmartphone3);
        System.out.println();

        System.out.println("Print Smartphones - mostPopularApp()");
        System.out.println(mySmartphone1.mostPopularApp());
        System.out.println(mySmartphone2.mostPopularApp());
        System.out.println(mySmartphone3.mostPopularApp());
        System.out.println();

        System.out.println("Print Smartphones - minutesToFullCharge()");
        System.out.println(mySmartphone1.minutesToFullCharge());
        System.out.println(mySmartphone2.minutesToFullCharge());
        System.out.println(mySmartphone3.minutesToFullCharge());
        System.out.println();
    }
}
