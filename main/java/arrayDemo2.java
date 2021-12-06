import java.util.Arrays;
import java.util.Scanner;

/*
* 整体思路
* 1、从终端获取用户输入的5个月份数
* 2、对数组中的5个月份从小到大进行排序，冒泡排序法
* 3、分析计算5个月中的每天并存入二维数组中
* 4、输出每个月的每一天
*/
public class arrayDemo2 {
    public static void main(String[] args) {

        //1、从终端获取用户输入的5个月份数
        int[] userInputData = new int[5];
        for (int i = 0; i < userInputData.length; i++) {
            int monthNum = i + 1;
            System.out.println("请输入第" + monthNum + "个月");
            Scanner scanner = new Scanner(System.in);
            //优化1，判断月份输入边界
            while (true){
                userInputData[i] = scanner.nextInt();
                if (userInputData[i] >0 && userInputData[i] < 13){
                    break;
                }else {
                    System.out.println("月份非法输入，请重新输入！");
                }
            }


        }
        System.out.println("用户已输入第" + Arrays.toString(userInputData));
        // 优化2，增加数据的年份
        System.out.println("请输入年份：");
        Scanner scanner = new Scanner(System.in);
        int year;
        while (true){
            year = scanner.nextInt();
            if (year >1999 && year < 2050){
                break;
            }else {
                System.out.println("年份非法输入，请重新输入！");
            }
        }

        //2、对数组中的5个月份从小到大进行排序，冒泡排序法
        for (int i = 0; i < userInputData.length - 1; i++) {
            for (int j = 0; j < userInputData.length - 1 - i; j++) {
                if (userInputData[j] > userInputData[j + 1]) {
                    int temp = userInputData[j];
                    userInputData[j] = userInputData[j + 1];
                    userInputData[j + 1] = temp;
                }
            }
        }
        System.out.println("排序后的月份：" + Arrays.toString(userInputData));

        //3、分析计算5个月中的每天并存入二维数组中
        int[][] monthDay = new int[userInputData.length][];
        for (int monthNum = 0; monthNum < userInputData.length; monthNum++) {
            if (userInputData[monthNum] == 1 || userInputData[monthNum] == 3 || userInputData[monthNum] == 5 || userInputData[monthNum] == 7 || userInputData[monthNum] == 8 || userInputData[monthNum] == 10 || userInputData[monthNum] == 12) {
                int days[] = new int[31];
                for (int i = 1; i <= days.length; i++) {
                    days[i - 1] = i;
                }
                monthDay[monthNum] = days;
            } else if (userInputData[monthNum] == 2) {
                //优化2，判断闰年
                int day;
                if ((year % 100 != 0 && year % 4 ==0) || (year % 400 == 0)){
                    day = 29;
                }
                else{
                    day = 28;
                }
                int days[] = new int[day];
                for (int i = 1; i <= days.length; i++) {
                    days[i - 1] = i;
                }
                monthDay[monthNum] = days;
            } else {
                int days[] = new int[30];
                for (int i = 1; i <= days.length; i++) {
                    days[i - 1] = i;
                }
                monthDay[monthNum] = days;
            }
        }

        //4、输出每个月的每一天
        for (int i = 0; i < monthDay.length; i++) {
            for (int j = 0; j < monthDay[i].length; j++) {
                System.out.print(userInputData[i] + "月" + monthDay[i][j] + "日 ");
            }
            System.out.println();
        }
    }
}
