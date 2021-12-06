public class switch_test {
    public static void main(String[] args){

        int a = 3;
        int x = 100;
        switch (a){
            case 1:
                x = x + 5;
            case 2:
                x = x + 10;
            case 3:
                x = x + 16;
            case 4:
                x = x + 34;
            default:
                x = x + 100;
        }
        System.out.println(x);
    }
}
