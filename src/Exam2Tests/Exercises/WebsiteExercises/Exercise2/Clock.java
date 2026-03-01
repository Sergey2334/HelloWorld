package Exam2Tests.Exercises.WebsiteExercises.Exercise2;

public class Clock {
    private int hours;
    private int minutes;
    private int seconds;


    public Clock(int hours, int minutes, int seconds)
    {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public String toString()
    {
        String hoursStr = addLeadingZero(this.hours);
        String minutesStr = addLeadingZero(this.minutes);
        String secondsStr = addLeadingZero(this.seconds);

        return hoursStr + ":" + minutesStr + ":" + secondsStr;
    }

    private String addLeadingZero(int number)
    {
        String result = "" + number;

        if (number < 10)
        {
            result = "0" + result;
        }

        return result;
    }

    public boolean isValid()
    {
        boolean result = true;

        if (this.hours < 0 || this.hours > 23 ||
            this.minutes < 0 || this.minutes > 59 ||
            this.seconds < 0 || this.seconds > 59)
        {
            result = false;
        }

        return result;
    }

    public boolean isMorning()
    {
        boolean result = false;

        if (this.isValid() && (this.hours > 5 && this.hours < 12))
        {
            result = true;
        }

        return result;
    }

    public boolean isNight()
    {
        boolean result = false;

        if (this.isValid() && (this.hours < 6 || this.hours > 19))
        {
            result = true;
        }

        return result;
    }

    public void printAmPm()
    {
        int hours = this.hours;
        int minutes = this.minutes;
        int seconds = this.seconds;

        String amOrPmStr = "";

        if (!isAmTime())
        {
            amOrPmStr = "PM";
            hours %= 12;
        }

        else
        {
            amOrPmStr = "AM";
        }

        String hoursStr = addLeadingZero(hours);
        String minutesStr = addLeadingZero(minutes);
        String secondsStr = addLeadingZero(seconds);

        System.out.println(amOrPmStr + " " + hoursStr + ":" + minutesStr + ":" + secondsStr);
    }

    private boolean isAmTime()
    {
        boolean result = false;

        if (this.isValid() && (this.hours >= 0 && this.hours < 12))
        {
            result = true;
        }

        return result;
    }

    public boolean isEarlier(Clock other)
    {
        boolean result = false;

        if (this.getClockHourAsNumber() < other.getClockHourAsNumber())
        {
            result = true;
        }

        return result;
    }

    private int getClockHourAsNumber()
    {
        int minutesMultiplier = 100;
        int hoursMultiplier = 10000;

        return this.hours * hoursMultiplier + this.minutes * minutesMultiplier + this.seconds;
    }
}
