import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {
    public static void main(String[] args){
        System.out.println(getDate());
    }
    public static String getDate(){
        SimpleDateFormat format=new SimpleDateFormat("dd/MM/yyyy:hh:mm:ss");
        Date date=new Date();
        String strDate=format.format(date);
        return strDate;
    }
}
