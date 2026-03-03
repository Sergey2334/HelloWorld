package Exam2Tests.Exercises.WebsiteExercises.Exercise4;

import java.util.Arrays;

public class Exercise4Main {
    public static void main(String[] args) {
        magic();

        Bucket myBucket1 = new Bucket(7);
        Bucket myBucket2 = new Bucket(5);
        Bucket myBucket3 = new Bucket(12);

        Bucket[] myBucketArray = {myBucket1, myBucket2, myBucket3};
        for (int i = 0; i < myBucketArray.length; i++)
        {
            myBucketArray[i].fill();
        }

        System.out.println(reduceAmountInBuckets(myBucketArray, 60));
    }

    private static void magic() {
        // Methods Allowed: spill(), fill(), fill(Bucket other)
        Bucket b1 = new Bucket(7);
        Bucket b2 = new Bucket(5);

        System.out.println("Start");
        System.out.println(b1);
        System.out.println(b2);
        System.out.println();

        b2.fill();
        b1.fill(b2);
        b2.fill();
        b1.fill(b2);
        b1.spill();
        b1.fill(b2);
        b2.fill();
        b1.fill(b2);
        b1.spill();
        b1.fill(b2);
        b2.fill();
        b1.fill(b2);

        System.out.println("End");
        System.out.println(b1);
        System.out.println(b2);
        System.out.println();
    }

    private static Bucket reduceAmountInBuckets(Bucket[] buckets, float max)
    {
        Bucket newBucket =  new Bucket(0); // 0 Capacity For Now, We'll Set A New Capacity Later
        double sumOfFill = 0;

        for (int i = 0; i < buckets.length; i++)
        {
            double currentBucketPercent = buckets[i].percent();
            double currentBucketCapacity = buckets[i].getCapacity();
            if (currentBucketPercent > max)
            {
                double percentToFill = currentBucketPercent - max;
                double litersToFill = percentToLiters(percentToFill, currentBucketCapacity);

                buckets[i].spill((int) litersToFill);

                sumOfFill += litersToFill;
            }
        }

        newBucket.setCapacity((int) sumOfFill);
        newBucket.addLiters((int) sumOfFill);

        return newBucket;
    }

    private static double percentToLiters(double percent, double capacity)
    {
        return ((double) (percent * capacity)) / 100;
    }

    private static int[] fillExactAmount(Bucket[] buckets, int amount)
    {
        // I Tried For 2 Days Cant Get It To Work
        // I'm Sure Recursion Is Needed But I Can't Figure It Out :'(

        return new int[]{};
    }

    private static int getSumOfBuckets(Bucket[] buckets)
    {
        int sum = 0;

        for (int i = 0; i < buckets.length; i++)
        {
            sum += (int) buckets[i].getCurrent();
        }

        return sum;
    }

    private static int[] addNumberToNumbersArray(int[] array, int numberToAdd)
    {
        int[] newNumbersArray = new int[array.length + 1];

        for (int i = 0; i < array.length; i++)
        {
            newNumbersArray[i] = array[i];
        }

        newNumbersArray[array.length] = numberToAdd;

        return newNumbersArray;
    }

    private static int[] add2Arrays(int[] array1, int[] array2)
    {
        int combinedLength = array1.length + array2.length;
        int[] resultArray = new int[combinedLength];

        for (int i = 0; i < array1.length; i++)
        {
            resultArray[i] = array1[i];
        }

        for (int i = array1.length, j = 0; i < combinedLength; i++, j++)
        {
            resultArray[i] = array2[j];
        }

        return resultArray;
    }
}
