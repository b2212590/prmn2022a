package lecture01;

public class kadai4 {
    public static void main(String[] args) {
     int[] array;
     array = new int[100];
     int sum = 0 ;
     for(int i=0;i<100;i++){
         array[i]=i+1;
         if(i%2 == 0){
             sum = sum + i;
         }
     }
     System.out.println(sum);

    }
}
