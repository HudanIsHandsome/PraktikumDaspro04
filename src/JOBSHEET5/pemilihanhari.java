package JOBSHEET5;
import java.util.Scanner;

public class pemilihanhari {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String day_name,day_type;

        System.out.println("DAY NAME ");
        day_name=sc.nextLine();

        switch(day_name.toLowerCase()){
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursday":
            case "friday":
                day_type="WEEKDAY";
                break;
            case "saturday":
            case "sunday":
                day_type="WEEKEND";
                break;
                default:
                    day_type="INVALID";
                    break;
        }
     System.out.println(day_name +"IS A" + day_type );


             
            




        }

    }

