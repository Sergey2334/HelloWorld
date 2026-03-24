package Exam2Tests.Exercises.WebsiteExercises.Exercise7;

public class LiveShow extends VideoContent {
    private int hourStart;
    private int minuteStart;

    private int hourEndExpected;
    private int minuteEndExpected;

    private int hourEndActual;
    private int minuteEndActual;

    private final int MIN_HOURS_VAL = 0;
    private final int MAX_HOURS_VAL = 23;
    private final int MIN_MINUTES_VAL = 0;
    private final int MAX_MINUTES_VAL = 59;

    public LiveShow(String title, String genre, int minViewerAge,
                    int hourStart, int minuteStart,
                    int hourEndExpected, int minuteEndExpected,
                    int hourEndActual, int minuteEndActual)
    {
        super(title, genre, minViewerAge);

        this.hourStart = isValidRange(hourStart, MIN_HOURS_VAL, MAX_HOURS_VAL);
        this.minuteStart = isValidRange(minuteStart, MIN_MINUTES_VAL, MAX_MINUTES_VAL);

        this.hourEndExpected = isValidRange(hourEndExpected, MIN_HOURS_VAL, MAX_HOURS_VAL);
        this.minuteEndExpected = isValidRange(minuteEndExpected, MIN_MINUTES_VAL, MAX_MINUTES_VAL);

        this.hourEndActual = isValidRange(hourEndActual, MIN_HOURS_VAL, MAX_HOURS_VAL);
        this.minuteEndActual = isValidRange(minuteEndActual, MIN_MINUTES_VAL, MAX_MINUTES_VAL);
    }

    private int isValidRange(int number, int minRange, int maxRange)
    {
        int result = number;

        if (number < minRange)
        {
            result = minRange;
        }
        else if (number > maxRange)
        {
            result = maxRange;
        }

        return result;
    }

    public int expectedLength()
    {
        int minutesToAdd = this.minuteEndExpected + (this.MAX_MINUTES_VAL - this.minuteStart);
        int hoursToAdd = (this.hourEndExpected + (this.MAX_HOURS_VAL - this.hourStart)) * 60;

        return hoursToAdd + minutesToAdd;
    }

    public int actualLength()
    {
        int minutesToAdd = this.minuteEndActual + (this.MAX_MINUTES_VAL - this.minuteStart);
        int hoursToAdd = (this.hourEndActual + (this.MAX_HOURS_VAL - this.hourStart)) * 60;

        return hoursToAdd + minutesToAdd;
    }

    public boolean isLong()
    {
        return actualLength() > this.expectedLength();
    }

    public String toString()
    {
        return " \"" + super.getTitle() + "\" " +
                Helpers.addLeadingZero(this.hourStart) + ":" + Helpers.addLeadingZero(this.minuteStart) +
                Helpers.addLeadingZero(this.hourEndActual) + ":" + Helpers.addLeadingZero(this.minuteEndActual);
    }

    public boolean isForKids()
    {
        boolean result = true;

        if (!super.isForKids() || this.hourStart > 19 || (this.hourStart == 19 && this.minuteStart > 0))
        {
            result = false;
        }

        return result;
    }

    public void addScore(int score)
    {
        super.addRating(score);
    }

    public double calculateAverageScore()
    {
        return super.calculateAverageRating();
    }
}