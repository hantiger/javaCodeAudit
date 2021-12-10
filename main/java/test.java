import java.util.Date;
import java.text.SimpleDateFormat;

public class test {
    public static void main(String[] args){

        Date d = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
        String f = ft.format(d);
        System.out.println(f);
    }
}
