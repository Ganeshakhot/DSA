package Math;

public class DayOfYear {

    public static int dayYear(String str){
        String [] date = str.split("-");
        int y = Integer.parseInt(date[0]);
        int m = Integer.parseInt(date[1]);
        int day = Integer.parseInt(date[2]);

        int [] months = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        if(isLeap(y)) months[1] = 29;
        int sum = 0;
        if(m == 1){
            return day;
        }
        for (int i = 0; i < m - 1; i++) {
            sum = sum + months[i];
        }
        return sum+day;
    }

    public static boolean isLeap(int y){
        return (((y % 4 == 0) && (y % 100 != 0)) || (y % 400 == 0));
    }

    public static void main(String[] args) {
        String str = "2019-01-01";

    }
}
