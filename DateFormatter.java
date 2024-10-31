import java.util.Scanner;

public class DateFormatter {
    static String month_feed_back(int data)
    {
        return switch (data) {
            case 1 -> "January ";
            case 2 -> "February ";
            case 3 -> "March ";
            case 4 -> "April ";
            case 5 -> "May ";
            case 6 -> "June ";
            case 7 -> "July ";
            case 8 -> "August ";
            case 9 -> "September ";
            case 10 -> "October ";
            case 11 -> "November ";
            case 12 -> "December ";
            default -> " ";
        };
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please put in the date in MM/DD/YYYY form!");
        String date = scanner.nextLine();

        String month = date.substring(0,2);
        String day = date.substring(3,5);
        String year =date.substring(6,10);
        int monthDate = Integer.parseInt(month);
        int dayDate = Integer.parseInt(day);
        int yearDate = Integer.parseInt(year);
        try {
            yearTest(yearDate);
        }catch (YearException e){
            System.out.println(e.getMessage());
        }
        try {
            monthTest(monthDate);
        }catch (MonthException e){
            System.out.println(e.getMessage());
        }
        try {
            dayTest(dayDate,monthDate,yearDate);
        }catch (DayException e){
            System.out.println(e.getMessage());
        }
        System.out.println(month_feed_back(monthDate)+" "+dayDate+", "+yearDate);
    }

    private static void dayTest(int dayDate,int monthDate,int yearDate) throws DayException {
        switch (monthDate){
            case 4,6,9,11:
                if (dayDate!=30){
                    throw new DayException();
                }
            case 2:
                if (yearDate%4==0 && yearDate%100!=0)
                {
                    if (dayDate!=29){
                        throw new DayException();
                    }
                }
                if (dayDate!=28){
                    throw new DayException();
                }


        }

    }

    private static void monthTest(int monthDate) throws MonthException {
        if(monthDate<=0||monthDate>12)
        {
            throw new MonthException();
        }

    }

    private static void yearTest(int yearDate) throws YearException {
        if(yearDate<1000||yearDate>3000)
        {
            throw new YearException();
        }
    }
}
