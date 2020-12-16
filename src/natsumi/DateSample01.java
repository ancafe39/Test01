package natsumi;

import java.util.Calendar;

public class DateSample01 {
  public static void main(String[] args) {

    Calendar cal = Calendar.getInstance();
    cal.set(2009, Calendar.APRIL, 25, 6, 44, 0);
    int day = 100;
    System.out.print( String.format(
      "%1$tY年 %1$tB %1$te日 %1$ta曜日の%2$d日後は、",cal,day));
    cal.add(Calendar.DAY_OF_YEAR, day);
    System.out.println( String.format(
        "%1$tY年 %1$tB %1$te日 %1$ta曜日です。", cal));
  }
}