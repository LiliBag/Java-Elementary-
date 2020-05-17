
/**
 * Pull time then change it to PST or 
 * whichever time zone you need to change it to.
 *
 * @author (Lili Bagramyan)
 */
import java.util.*;
public class PullTimeForPST
{
    public static void main(String args[]) {
        //Jan 1 1970 is when it starts counting 
      long totalMilliseconds=System.currentTimeMillis();
      long totalSeconds=totalMilliseconds/1000;//total seconds
      long currentSeconds= (int)(totalSeconds%60);
      long totalMinutes=totalSeconds/60;
      long currentMinute=(int)(totalMinutes%60);
      long totalHours= totalMinutes/60;
      long currentHour= (int)(totalHours%24);
      long pacificHour=(int)((totalHours%24)-7);

      System.out.println("Time rn is "+ currentHour+":"+currentMinute+":"+ currentSeconds+ " GMT"+ 
      "And it is " + pacificHour+":"+currentMinute+ ":"+ currentSeconds+ " for PST which is your time zone ");
    }
}
