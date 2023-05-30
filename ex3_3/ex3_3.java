public class ex3_3{
    public static void main(String[]args){
        int i,j,k = 1,count = 0,number = 1,row = 9; 
        for (i = 1; i <= row; i++) {
            for (j = row - i; j >= 0; j--) {
                System.out.print("  ");
            }
            count = i*2-1;
            while (k <= count) {
                if(number < 10){
                    System.out.print(number+"  ");//ปรับความสวยงาม
                }else{
                    System.out.print(number+" ");
                }
                k++;
                number++;
            }
            System.out.println();
            k = 1;
        }
    }
}
