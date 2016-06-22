import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTime{
public static void main(String args[]){
 Date date = new Date();
   //printing date and time
  SimpleDateFormat ft = new SimpleDateFormat ("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
  
  System.out.println(date);
  //printing date
  System.out.println("Current Date: " + ft.format(date));
}
}
