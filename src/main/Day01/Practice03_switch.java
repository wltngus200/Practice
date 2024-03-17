import java.util.Scanner;

public class Practice03_switch {
    public static void main(String[] args){
        Scanner Rsp=new Scanner(System.in);
        /*
        System.out.print("가위바위보(가위=0,바위=1,보=2)");
        int vic=Rsp.nextInt();
        switch(vic){
            case 0:
                System.out.print("가위");
                break;
            case 1:
                System.out.print("바위");
                break;
            case 2:
                System.out.print("보");
                break;
        //else if문이 반복되는 것을 방지 2강+p.146
        }
         */
    System.out.print("정수를 입력하세요.:");
    int num=Rsp.nextInt();
    switch(num){
        case 0:
            System.out.print("A");
            System.out.print("B");
            //0이 들어오면 2가지 실행
            break;
        case 2:
            System.out.print("C");
            //C를 실행하고 브레이크가 없어 아래로 진행
        case 800:
            System.out.print("What");
            //이건 내 개인적 호기심 숫자 크키는 상관 없다.
        case 5:
            System.out.print("D");
            break;
        case 6:
            //역시 아무것도 없어 실행X
            // 브레이크가 없어 아래로 진행
        case 7:
            System.out.print("E");
            break;
            //아래가 디폴트라도 브레이크가 없으면 실행됨
        default:
            System.out.print("F");
            break;
            //그 외의 어떤 값을 주어도 디폴트값

            //else if문이 반복되는 것을 방지 2강+p.146
            //위에 써서 괜히 다시 목차 뒤졌네 ㅎ
            //else if가 나은 경우=범위에 따른 값을 출력할 때 인듯
            //왜냐면 내가 지금 04에서 스불재거든
    }
    }
}
