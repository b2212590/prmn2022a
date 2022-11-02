package lecture01;

public class kadai5 {
    public static void main(String[] args) {
        int[] score = {41,85,72,38,80};
        int sum =0;
        for(int i = 0 ; i<5 ; i++){
            sum = sum + score[i];
            if(score[i]>=90){
                System.out.println(i + "番 " + score[i] +"点 秀");
            } else if (score[i]>=80) {
                System.out.println(i + "番 " + score[i] +"点 優");
            } else if (score[i]>=70) {
                System.out.println(i + "番 " + score[i] +"点 良");
            } else if (score[i]>=60) {
                System.out.println(i + "番 " + score[i] +"点 可");
            }else {
                System.out.println(i + "番 " + score[i] +"点 不可");
            }
        }
        calculator calc = new calculator();
        int min = calc.min(score);
        int max = calc.max(score);
        double ave = calc.ave(sum);

        System.out.println("最高点:" + max);
        System.out.println("最低点:" + min);
        System.out.println("平均点:" + ave);

    }
}

class calculator {
    int min(int[] score) {
        int min = score[0];
        for(int i = 1 ; i<5 ;i++){
            if(min > score[i]){
                min = score[i];
            }
        }
        return min;
    }
    int max(int[] score) {
        int max = score[0];
        for(int i = 1 ; i<5 ;i++){
            if(max < score[i]){
                max = score[i];
            }
        }
        return max;
    }
    double ave(int sum){
        return (double)sum/5;
    }
}
