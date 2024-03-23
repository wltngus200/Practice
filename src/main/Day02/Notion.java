import java.util.Scanner;

public class Notion {
    public static void main(String[] args){
        //-10~50사이의 랜덤값 출력
        for(int i=0; i<5; i++) {
            for (int j=0; j<10; j++) {
                int random = (int) (Math.random() * 61) - 10;
                System.out.print(random + " ");
            }System.out.println();
        }


        //구구단 표 세로로
        System.out.println("구구단을 외자, 구구단을 외자");
        for(int n=1;n<10;n++){
            for(int e=1;e<10;e++){
                System.out.print(e+" X "+n+" = "+(n*e)+" ");
            }System.out.println();
        }


        //별 찍기
        Scanner scan=new Scanner(System.in);
        System.out.print("몇 줄의 별을 찍을까요?");
        int star=scan.nextInt();
        for(int s=0;s<star;s++){
            for(int t=0;t<=s;t++){
                System.out.print("*");
            }System.out.println();
        }//scan.close(); 스캐너 닫기

        //별 찍기2
        System.out.print("몇 줄의 별을 찍을까요?");
        int star2=scan.nextInt();
        for(int a=star2;a>0;a--){
            for(int r=0;r<a;r++){
                System.out.print("*");
            }System.out.println();
        }


    }
}
