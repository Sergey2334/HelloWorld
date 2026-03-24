package Exam2Tests.Exercises.WebsiteExercises.Exercise7;

public class Helpers {
    public static String convertMinLengthToStrFormat(int minutesLength)
    {
        String result = "";

        int hours = minutesLength / 60;
        int minutes = minutesLength % 60;
        String hoursStr = addLeadingZero(hours);
        String minutesStr = addLeadingZero(minutes);

        result = hoursStr + ":" + minutesStr;

        return result;

        //return addLeadingZero(minutesLength / 60) + ":" + addLeadingZero(minutesLength % 60);
    }

    public static String addLeadingZero(int number)
    {
        String result = number + "";

        if (number < 10)
        {
            result = "0" + number;
        }

        return result;
    }
}
