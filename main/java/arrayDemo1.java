
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner; //java.util.Scanner 是 Java5 的新特征，我们可以通过 Scanner 类来获取用户的输入。

public class arrayDemo1 {

    public static void main(String[] args){

        //1、从终端获取用户输入的5个月份数
        int[] userInputData = new int[5];
        for (int i=0; i<userInputData.length; i++){
            int monthNum = i+1;
            System.out.println("请输入第" + monthNum + "个月");
            Scanner scanner = new Scanner(System.in);
            userInputData[i] = scanner.nextInt();
        }
        System.out.println("用户已输入第" + Arrays.toString(userInputData));

        //2、对数组中的5个月份从小到大进行排序，冒泡排序法
        for (int i=0; i<userInputData.length-1; i++){
            for (int j=0; j<userInputData.length-1-i; j++){
                if (userInputData[j] > userInputData[j+1]){
                    int temp = userInputData[j];
                    userInputData[j] = userInputData[j+1];
                    userInputData[j+1] = temp;
                }
            }
        }
        System.out.println("排序后的月份：" + Arrays.toString(userInputData));

        //3、分析计算5个月中的每天并存入二维数组中
        int[][] monthDay = new int[userInputData.length][];
        for (int monthNum=0; monthNum<userInputData.length; monthNum++){
            if(userInputData[monthNum]==1 || userInputData[monthNum]==3 || userInputData[monthNum]==5 || userInputData[monthNum]==7 || userInputData[monthNum]==8 || userInputData[monthNum]==10  || userInputData[monthNum]==12){
                int days[] = new int[31];
                for (int i=1; i<=days.length; i++){
                    days[i-1] = i;
                }
                monthDay[monthNum] = days;
            } else if (userInputData[monthNum]==2){
                int days[] = new int[28];
                for (int i=1; i<=days.length; i++){
                    days[i-1] = i;
                }
                monthDay[monthNum] = days;
            }else {
                int days[] = new int[30];
                for (int i=1; i<=days.length; i++){
                    days[i-1] = i;
                }
                monthDay[monthNum] = days;
            }
        }

        //4、输出每个月的每一天
        for (int i=0; i<monthDay.length; i++){
            for (int j=0; j<monthDay[i].length; j++){
                System.out.print(userInputData[i] + "月" + monthDay[i][j] + "日 ");
            }
            System.out.println();
        }
    }

}
