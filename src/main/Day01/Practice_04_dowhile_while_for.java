import java.util.Scanner;

public class Practice_04_dowhile_while_for {
    public static void main(String[] args){
        Scanner sunday= new Scanner(System.in);
        /*int retry=0;
        do{
            System.out.print("월을 입력해주세요.:");
            int month=sunday.nextInt();
                switch(month) {
                    case 1:
                    case 2:
                        System.out.println(month + "월은 겨울입니다.");
                        break;
                    case 3:
                    case 4:
                    case 5:
                        System.out.println(month + "월은 봄입니다.");
                        break;
                    case 6:
                    case 7:
                    case 8:
                        System.out.println(month + "월은 여름입니다.");
                        break;
                    case 9:
                    case 10:
                    case 11:
                        System.out.println(month + "월은 가을입니다.");
                        break;
                    case 12:
                        System.out.println(month + "월은 겨울입니다.");
                        break;
                    default:
                        System.out.println("당신은 \'카엘룸 사람\'입니까?");
                System.out.print("다시? (YES=1/NO=0)");//사람 눈에 안 보일 뿐 아래 코드 출력됨
                retry=sunday.nextInt();//그러니까 바로 투입 가능
                //if예시를 굳이 switch로 쓸 필요는 없다. 이상 범위일 경우 메세지를 출력하고 싶었어
                //case 범위지정이 안 되는 듯 월 같은 경우는 범위면 편한데 일일히 지정해줘야 함
                //그리고 디폴트에서 다시 시행 했을 때, retry값이 1로 고정 되었기 때문에 무한반복 됨

            }
        }while(retry==1);*/

        /*
        int hand;
        do {
            System.out.print("손을 선택하시오(0=가위,1=바위,2=보)");
            hand=sunday.nextInt();

        } while (hand<0||hand>2);//or='||' 여기 해당하면 반복
        switch(hand){
            case 0:
                System.out.println("가위");
                break;
            case 1:
                System.out.println("바위");
                break;
            case 2:
                System.out.print("보");
                break;
        }*/
        //헷갈리지 말자 while 괄호 안에는 미달성시 재입력을 바라는 범위
        //그러니까 이런 값이면 반려될만한 거 넣어야함

        /*
        Random rand=new Random();
        int no=rand.nextInt(100);//한 숫자가 대입됨

        System.out.println("숫자맞히기 게임 시작!!");
        System.out.println("0~99 사이의 수를 맞혀주세요.");

        int x;
        do {
            System.out.print("몇일까요?");
            x=sunday.nextInt();

            if (x>no) {
                System.out.println("더 작은 수입니다.");
            }else if (x<no){
                System.out.println("더 큰 수입니다.");
            }
        } while(x!=no);//같아지면 끝난다
        System.out.println("정답입니다.");*/

        /*
        //정수값을 입력 받고 점점 줄어가는 카운트다운
        System.out.println("카운트다운 합니다.");
        int y;
        do{
            System.out.print("양의 정수값:");
            y=sunday.nextInt();
        } while(y<=0);//양의 정수값만 들어가게
        while (y>=0) {
            System.out.println(y);
            y--;
        }
        */
        //do-while는 먼저 시행하고 조건비교(최소 1번 실행)
        //while는 조건 비교하고 시행

        //별을 출력
        /*
        System.out.print("몇 개의 *을 표시합니까?");
        int star=sunday.nextInt();

        int i=0;
        while (i < star) {
            System.out.print("*");
            i++;
            */
            //괄호 안의 조건에 수립하지 않으면 false

        //내가 입력한 숫자를 거꾸로 읽어줌
        /*
        System.out.println("양의 정수값을 역순으로 표시합니다.");
        int uTurn;
        do{
            System.out.print("양의 정수값을 입력하세요.:");
            uTurn=sunday.nextInt();
        } while(uTurn<=0);
        System.out.print("거꾸로 읽으면 ");
        while(uTurn>0){
            System.out.print(uTurn%10);//10으로 나눈 나머지
            uTurn/=10;//사용자가 입력한 값을 10으로 나눔(몫만 출력,소수점 X)
            // "/=" 복합대입연산자(p.133)

        }
        System.out.println("입니다.");
         */

        /*
        System.out.println("1부터 n까지의 합을 계산합니다.");

        int plave;
        do{
            System.out.println("n의 값:");
            plave=sunday.nextInt();
        } while(plave<=0);//양수 플레이브 값을 입력할 때까지 반복시킴
        int sum=0;
        int yejun=1;
        while(yejun<=plave){//예준이가 혼자서 플레이브 해 먹을 때까지
            sum+=yejun;//sum(=0)에 예준이(=1)를 계속 더해가라
            yejun++;//예준이는 차츰 커갈 것이다
        }
        System.out.println("1부터"+plave+"까지의 합은"+sum+"입니다");
        */

        //for문 별을 지정된 수만큼 출력

        /*
        System.out.print("몇개의 *을 출력합니까?");
        int n3=sunday.nextInt();

        for (int i2=0; i2<n3; i2++)//(시작값, 조건, 증가값)
            //세미콜론을 넣지 않게 주의!!
            System.out.print("*");//0에서 시작
        System.out.println();
        */


        //약수를 출력하는 코드
        /*
        System.out.print("정수값:");
        int num=sunday.nextInt();

        for(int v=1; v<=num; v++)
            if(num%v==0){//주어진 수로 나누었을 때 나머지가 0
                System.out.println(v);
                //반복되기 때문에 num의 약수는 v입니다까지 반복
                //약수들을 저장해서 저장한 후 한번에 출력하고 싶다.
        //이게 뭔 용돈지 모르겠네
        for (int x=1, y=num-1; x<=num;x++,y--)
            System.out.println(x+" "+y);
        */

        //구구단이다!
        for(int front=1; front<=9; front++){ //앞의 숫자 'n'단
            for(int back=1;back<=9;back++){ // *m을 담당
                if(front*back<10)
                    System.out.print("  "); //자리수 맞추기
                else
                    System.out.print(" "); //자리수 맞추기
                    System.out.print(front * back);//1단하고 끝
            }
            //if 구문 else 구문 각각 중괄호로 묶었을 때 에러
            //지웠더니 에러 없음 왜??
            System.out.println();//엔터를 치는 역할?
            }
    }
}
