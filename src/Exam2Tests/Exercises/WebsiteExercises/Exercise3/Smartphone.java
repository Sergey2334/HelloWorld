package Exam2Tests.Exercises.WebsiteExercises.Exercise3;

public class Smartphone {
    private int year;
    private double battery;
    private int chargingMinutes;

    final int CURRENT_YEAR = 2024;

    // {Waze, Gmail , Instagram , Other } - Apps
    // {0   , 0     , 0         , 0     } - Count
    int[] appsUsageCount = new int[4];


    public Smartphone(int year, double battery, int chargingMinutes)
    {
        this.year = year;

        if (battery < 0)
        {
            this.battery = 0;
        }

        else if (battery > 100)
        {
            this.battery = 100;
        }

        else
        {
            this.battery = battery;
        }

        this.chargingMinutes = chargingMinutes;
    }

    public String toString()
    {
        String result = "";

        String isNewStr = "";

        if (this.isNewPhone())
        {
            isNewStr = "The Phone is New, ";
        }

        else
        {
            isNewStr = "The Phone is Not New, ";
        }

        String chargedForStr = "The Phone Has Charged For " + this.chargingMinutes + " Minutes, ";
        String currentBatteryPercentageStr = "Current Battery Percentage: " + this.battery + "%";

        result = isNewStr + chargedForStr + currentBatteryPercentageStr;

        return result;
    }

    public void setYear(int year)
    {
        this.year = year;
    }

    public boolean needsCharging()
    {
        boolean result = false;

        if (this.battery <= 15)
        {
            result = true;
        }

        return result;
    }

    public boolean isBatteryFull()
    {
        boolean result = false;

        if (this.battery >= 100)
        {
            result = true;
        }

        return result;
    }

    public boolean isNewPhone()
    {
        boolean result = false;

        if (CURRENT_YEAR - this.year <= 3)
        {
            result = true;
        }

        return result;
    }

    public boolean charge(int minutes)
    {
        boolean result = true;

        if (this.isBatteryFull() || minutes < 0)
        {
            result = false;
        }

        double batteryChargePerMinute = getBatteryChargePerMinutes();

        for (int i = 0; i < minutes; i++)
        {
            this.battery += batteryChargePerMinute;
            this.chargingMinutes++;

            if (this.isBatteryFull())
            {
                this.battery = 100;
                break;
            }
        }

        return result;
    }

    private double getBatteryChargePerMinutes()
    {
        double batteryChargePerMinute = 0;

        if (this.year == CURRENT_YEAR)
        {
            batteryChargePerMinute = 1;
        }

        else if (this.isNewPhone())
        {
            batteryChargePerMinute = 0.75;
        }

        else
        {
            batteryChargePerMinute = 0.5;
        }

        return batteryChargePerMinute;
    }

    final String[] APPS_NAMES                               = {"Waze"   , "Gmail"   , "Instagram"   };
    final double[] BATTERY_PERCENTAGE_PER_MINUTE_FOR_APPS   = {1.2      , 0.3       , 0.5           };
    public boolean startApp(String app, int minutes)
    {
        boolean result = true;

        double batteryPercentageToBeUsedPerMinute = getBatteryPercentagePerMinuteForApp(app);
        double totalBatteryPercentageToBeUsed = batteryPercentageToBeUsedPerMinute * minutes;

        if (this.battery < totalBatteryPercentageToBeUsed)
        {
            result = false;
        }

        if (result)
        {
            // Counting Apps Usage Amount
            int indexOfApp = getIndexOfAppUsed(app);
            appsUsageCount[indexOfApp]++;

            for (int i = 0; i < minutes; i++)
            {
                this.battery -= batteryPercentageToBeUsedPerMinute;
            }
        }

        return result;
    }

    private double getBatteryPercentagePerMinuteForApp(String appName)
    {
        double batteryPercentagePerMinute = 1; // Default Value Is 1

        for (int i = 0; i < APPS_NAMES.length; i++)
        {
            if (appName.equals(APPS_NAMES[i]))
            {
                batteryPercentagePerMinute = BATTERY_PERCENTAGE_PER_MINUTE_FOR_APPS[i];
            }
        }

        return batteryPercentagePerMinute;
    }

    private int getIndexOfAppUsed(String appName)
    {
        int index = APPS_NAMES.length; // Default For "Other" App [Index 3, in This Case]

        for (int i = 0; i < APPS_NAMES.length; i++)
        {
            if (appName.equals(APPS_NAMES[i]))
            {
                index = i;
            }
        }

        return index;
    }

    public String mostPopularApp()
    {
        String result = "Other";

        int mostPopularAppIndex = getIndexOfMax(appsUsageCount);

        if (mostPopularAppIndex != APPS_NAMES.length) // Default For "Other" App
        {
            result = APPS_NAMES[mostPopularAppIndex];
        }

        return  result;
    }

    private int getIndexOfMax(int[] numbersArray)
    {
        int maxIndex = 0;
        int maxValue = numbersArray[0];

        for (int i = 0; i < numbersArray.length; i++)
        {
            if (numbersArray[i] > maxValue)
            {
                maxValue = numbersArray[i];
                maxIndex = i;
            }
        }

        return maxIndex;
    }

    public int minutesToFullCharge()
    {
        // currentBatteryPercentage(%) + (minutes(X, To Find) * batteryChargePerMinute(double)) = 100(%)
        // minutes(X, To Find) = (100(%) - currentBatteryPercentage(%) / batteryChargePerMinute(double))
        return (int) ((100 - this.battery) / getBatteryChargePerMinutes());
    }
}
