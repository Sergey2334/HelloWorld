package Exam2Tests.Exercises.WebsiteExercises.Exercise2;

public class Exercise2Main {
    public static void main(String[] args) {
        Clock clock1 = new Clock(23, 59, 59);
        Clock clock2 = new Clock(0, 0, 0);
        Clock clock3 = new Clock(15, 55, 20);

        System.out.println("Print Clock");
        System.out.println(clock1);
        System.out.println(clock2);
        System.out.println(clock3);
        System.out.println();

        System.out.println("Print is Valid");
        System.out.println(clock1.isValid());
        System.out.println(clock2.isValid());
        System.out.println(clock3.isValid());
        System.out.println();

        System.out.println("Print is Morning");
        System.out.println(clock1.isMorning());
        System.out.println(clock2.isMorning());
        System.out.println(clock3.isMorning());
        System.out.println();

        System.out.println("Print is Night");
        System.out.println(clock1.isNight());
        System.out.println(clock2.isNight());
        System.out.println(clock3.isNight());
        System.out.println();

        System.out.println("Print AM PM");
        clock1.printAmPm();
        clock2.printAmPm();
        clock3.printAmPm();
        System.out.println();

        System.out.println("Print is Earlier");
        System.out.println(clock1.isEarlier(clock1));
        System.out.println(clock1.isEarlier(clock2));
        System.out.println(clock1.isEarlier(clock3));
        System.out.println(clock2.isEarlier(clock1));
        System.out.println(clock2.isEarlier(clock2));
        System.out.println(clock2.isEarlier(clock3));
        System.out.println(clock3.isEarlier(clock1));
        System.out.println(clock3.isEarlier(clock2));
        System.out.println(clock3.isEarlier(clock3));
    }
}
