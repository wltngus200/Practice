public class MakeAMat_Alone {
    public static void main(String[] args){
        int H = 5;
        for (int K = 0; K <= H; K++) {//1~사용자의 입력값 n까지
            while (H-- > 0) {//★n이 1씩 감소하고, 그게 0보다 큰 동안(이런 표기도 가능하네)
                //입력받은 정수 n값만큼 별을 출력
                System.out.print("*");
            }//while문이 끝남과 동시에 H가 0이 되어 for문이 순환하지 못 함
            System.out.println();
        }System.out.println("프로그램이 끝났습니다.");

        int n = 5;//(가정)입력받은 값
        //System.out.println(n--);
        for (int i = 1; i <= n; i++) {//1~사용자의 입력값 n까지 //다시 돌아온 i는 0
            while (--i > 0) {// i=1(먼저 읽어오고, 내린다) //0이기 때문에 while는 통과
                //여기서 i의 값은 0
                System.out.print("*");
                //0보다 큰 값이 아니기 때문에 while문을 탈출
            }//System.out.println();//이 부분이 반복
            //i가 14 15열에서 -1과 0을 반복해서 무한루프에 빠짐
        }
            //최종 해설:
            // for문의 i=1은 초기화일뿐 다시 for로 돌아가도 재설정 되는 것이 아님
            // while 문에서는 먼저 값을 불러온 뒤 내리기 때문에 해당 열에서 i 값은 1
            // 1개의 별을 출력하고 다시 while로 돌아감 값을 내려 0보다 작아져서 실행되지 않음
            // 다시 for문으로 돌아감 +1 과 while문에 대입됨 -1의 반복으로 인한 무한루프

            int m = 5;//해설에서는 스캐너를 통해 입력받음
            for (int i = 1; i <= n; i++) {
                putStars(i);//i의 대입
                System.out.println();
            }
        }
        //메소드를 활용하면 for 반복마다 i라는 변수가 새롭게 투입되어 오류 발생X
    static void putStars(int n) {//위의 i를 n으로 받아 변수로서 사용
        while (n-- > 0) {
            //입력받은 정수 n값을 하나씩 줄여가며 별을 출력
            System.out.print("*");
        }
    }
}
