import java.util.Random;
import java.util.Scanner;


public class Imshi_2nd_isnt_running {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        Random rand=new Random();

        //배열의 값을 복사(스스로 해본 결과= 좋았음)
        System.out.print("요소 수");
        int num=scan.nextInt();
        int[] a=new int[num];//배열 생성공식 기억하자!
        int[] b=new int[num];

        for(int i=0;i<num;i++){
            a[i]=rand.nextInt(50);//영상에서는 직접 입력받음
            //직접 입력받을거면 한방에 넣으면 안되나??
        }
        for(int j=0;j<num;j++){
            b[j]=a[j];
        }
        for(int k=0;k<num;k++) {
            System.out.println("a[" + k + "]=" + a[k]);
        }
        for(int k=0;k<num;k++) {
            System.out.println("b[" + k + "]=" + b[k]);
        }
        System.out.println("**************");

        //영상 풀이 보고 의문인 점 입력 받을거면 같이 받으면 안되나?
        System.out.print("요소 수");
        int num2=scan.nextInt();//뭐 틀렸나?
        int[] c=new int[num2];//배열 생성공식 기억하자!
        int[] d=new int[num2];

        for(int i=0;i<num2;i++){//c배열에 수를 넣는 과정
            c[i]=scan.nextInt();
            d[i]=c[i];
            //직접입력받을거면 한방에 넣으면 안되나??라는 의문에서 시작
            //okok c=d=입력 같은 함수가 안됨 그렇다고 또 넥스트 넣으면 다른값 들어감
        }
        for(int k=0;k<num2;k++) {
            System.out.println("c[" + k + "]=" + c[k]);
        }
        for(int k=0;k<num2;k++) {
            System.out.println("d[" + k + "]=" + d[k]);
        }

    }
}

