import java.util.Scanner;

public class Practice02_if {//같은 이름의 클래스 정의
    public static void main(String[] args){
        //메인 메서드 지정(프로그램 구동할 수 있게)
        Scanner wtf=new Scanner(System.in);
        //객체 선언 및 초기화 키보드로 입력 가능
        /*
        System.out.print("정수값:");
        int n=wtf.nextInt();
        //다음에 오는 값은 인트이고 n에 대입됨
        //키보드로 입력을 가능하게 하는 wtf이라는 명령어를 불러냈다?

        boolean x;
        int i;

        //for(i=0,x==true,i++);
        //양수가 나올때까지 계속, 근데 이건 break에 가까운가
            if (n > 0)
                System.out.println("이 값은 양수입니다.");
            else if (n == 0)
                System.out.println("0입니다");
            else
                System.out.println("이 값은 음수입니다.");
         // 중괄호가 없어도 되네?
        */

        /*
        int a=4;
        if(a>5 || a%2==0)
            System.out.println("이 기호가 맞습니다");
        // ||(or)기호는 원 기호 위의 기호
        */


        //3가지 수를 비교하는 if문
        System.out.print("a:");
        int a=wtf.nextInt();
        System.out.print("b:");
        int b=wtf.nextInt();
        System.out.print("c:");
        int c=wtf.nextInt();
        int max=a; //a가 가장 크다고 가정
        if(a<b){ //b가 a보다 크면 최대값을 b로
            max=b;} //아니라면 아무 일도 안 일어남 즉, a가 max인 채
        if (a<c){
            max=c;}
        System.out.print("가장 큰 수는"+max+"입니다.");

        }

}
