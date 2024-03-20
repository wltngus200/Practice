import com.sun.tools.attach.AgentInitializationException;

import java.util.Scanner;

public class Practice06_Math {
    public static void main(String[] args) {
        //매서드
        //근데 메서드 맨 밑에 있어도 위로 불러올 수 있네

        //배열 활용해 사용자에게 키 몸무게 나이를 입력받아 가장 큰 값
        Scanner scan = new Scanner(System.in);

        /*
        int[] height = new int[3];
        int[] weight = new int[3];
        int[] age = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("[" + (i + 1) + "]");
            System.out.print("신장:");
            height[i] = scan.nextInt();

            System.out.print("체중:");
            weight[i] = scan.nextInt();

            System.out.print("나이:");
            age[i] = scan.nextInt();
        }
        /*
        int maxHeight = height[0];
        for (int h = 0; h < 3; h++) {
            //0으로 시작해도 상관은 없지만 0으로 세팅 되어있으니 낭비 ㄴㄴ
            if (height[h] > maxHeight) {
                maxHeight = height[h];
            }
        }//아무리 첨자가 3이라지만 굳이 2번을 따로 쓴다고?

        int maxWeight = weight[0];
        for (int w = 0; w < 3; w++) {
            if (weight[w] > maxWeight) {
                maxWeight = weight[w];
            }
        }

        int maxAge = age[0];
        for (int a = 0; a < 3; a++) {
            if (age[a] > maxAge) {
                maxAge = age[a];
            }
        }*/

        /*
        int maxHeight=max(height[0],height[1],height[2]);
        int maxWeight=max(weight[0],weight[1],weight[2]);
        int maxAge=max(age[0],age[1],age[2]);
        //max()메소드 명과 함수값으로 호출 메소드는 괄호!

        System.out.printf("신장의 최대값은 %d입니다.\n", maxHeight);
        System.out.printf("체중의 최대값은 %d입니다.\n", maxWeight);
        System.out.printf("나이의 최대값은 %d입니다.\n", maxAge);
        //졸릴때 코딩은 해롭다.. 함수명 안 바꾸기와 부등호 틀리기의 연속
        */

    /*
    System.out.println("a의 b 제곱을 시작합니다.");
    System.out.print("실수 a:");
    double a=scan.nextDouble();
    System.out.print("실수 b:");
    int b=scan.nextInt();

    System.out.println("a의 b승은"+ power(a,b) +"입니다.");

    */

    System.out.println("좌하변이 직각인 직각삼각형을 표시합니다.");
    System.out.print("몇단:");
    int n=scan.nextInt();

    for(int i=1;i<=n;i++){
        putStars(i);
        //아 여태까지 메소드 먼저 했잖아요 사람헷갈리게
        //그것도 그건데 왜 for은 한번 깔아요
        //메소드도 복잡한데 이걸 이케 한다고??
        //여기 n이랑 메소드 안의 n이랑 다르잖아.. 여기 n이 i잖아..
        //내거랑 비교하려고 했는데 차마 너무 달라서 비교도 못하겠다.
        System.out.println();
    }

    }







    //-------[메소드 라인]--------------------------------
    //새로운 메서드
    static int max(int a,int b,int c){
            //-----메서드 명과 함수값------
        int max=a;
        if(b>max){max=b;}//세미콜론 위치도 까먹네
        if(c>max){max=c;}
        return max;
    }//메서드 완성! 최대값 찾는 메서드!


    //메소드를 이용한 거듭제곱
    static double power(double x,int n){
        //리턴값 power=더블, 입력받은 x의 값이 실수형, 제곱=정수n //세미콜론은?
        double t=1.0;//결과값을 넘겨받기 위해 + 초기값 투입
        for(int i=1;i<=n;i++){
            t*=x;//t=x*x(x의 n승)// (제곱을 해서 t라는 빈 박스에 넣음)
        }
        return t;//x의 n승
        }
        //제곱 메서드의 실제 구현


    //별을 출력하는 메서드 직각 삼각형

    /*static int star(int star){//void도 빼먹었네..는 위에도 없네?
        //가벼운 마음으로 일단 별을 찍는다고 상상해보자.
        star=7;
        for(int i=0;i<star;i++){
            for(int j=0;j<=i;j++) {
                System.out.print("*");
            }System.out.println()//오늘자 수현이가 까먹은 거
            return star;
        }
    }*///혼자 만들어본 별찍기 개같이 실팽! int i,j도 설정했어야하나?

    //별찍기 찐
    static void putStars(int n){
        //리턴하는 값이 있으면 해당 값. 없으면 void형
        while (n-->0){//n이 1씩 감소하고, 그게 0보다 큰 동안(이런 표기도 가능하네)
            //입력받은 정수 n값만큼 별을 출력
            System.out.print("*");
            //5강 ~16분


        }
    }
}
