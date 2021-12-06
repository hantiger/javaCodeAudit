public class array_test {
    public static void main(String[] args) {

        MyDate[] m;
        m = new MyDate[10];
        for (int i = 0; i < 10; i++) {
            m[i] = new MyDate(i+1, i+1, i+1990);
            m[i].display();
        }
    }
}

class MyDate{
    private int day;
    private int month;
    private int year;
    public MyDate(int d, int m, int y){
        this.day = d;
        this.month = m;
        this.year = y;
    }
    public void display(){
        System.out.println(day + "-" + month + "-" + year);
    }
}