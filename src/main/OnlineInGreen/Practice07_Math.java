import java.util.Random;
import java.util.Scanner;

public class Practice07_Math {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        /*
        System.out.println("우하면이 직각인 직각삼각형");
        System.out.print("몇 단:");
        int n2=scan.nextInt();

        for(int i=1; i<=n2;i++){
            putStars(' ',n2-i);
            //문자열(공백)을 몇번 반복하는가
            //i가 점점 커짐에 따라서 반복 회수가 줄어듦
            putStars('+',i);
            System.out.println();
        }
    }
    //오른쪽에 정렬된 직각 삼각형
    //문자와 정수를 받는 메소드를 추가 생성(putstar)연장선
    //오버로드 다중정리
    //같은 이름이라도 괄호 뒤 넣는 인수 따라서 다른 메소드 호출 가능
    //ex.print를 입력했을 때 뜨는 메소드 종류 다양
         */

        Random rand = new Random();

        /*System.out.println("암산 트레이닝!");
        do {
            int x = rand.nextInt(900) + 100;//0~899+100(무조건 세자리수)
            int y = rand.nextInt(900) + 100;
            int z = rand.nextInt(900) + 100;
            //랜덤 생성된 3가지 수 생성
            while (true) {//참인동안
                System.out.print(x + "+" + y + "+" + z + "=");
                int k = scan.nextInt();
                if (k == (x + y + z)) {
                    break;//while문을 깨고 나간다
                    //아래 출력은 시행하지 않음
                }
                System.out.println("틀렸습니다.");
            }
        } while (confirmRetry()); //이 메소드가 false일 때까지
        //다시 문제를 반복할 것인지 묻는 메소드

         */

        /*System.out.print("인원수는?");
        int person = scan.nextInt();

        int[] height2 = new int[person];
        int[] weight2 = new int[person];

        System.out.println(person + "명의 체중과 키를 입력하세요.");
        for (int i = 0; i < person; i++) {
            System.out.print(i + 1 + "번의 키를 입력하세요.");
            height2[i] = scan.nextInt();
            System.out.print(i + 1 + "번의 몸무게를 입력하세요.");
            weight2[i] = scan.nextInt();
        }
        System.out.println("입력이 모두 끝났습니다.");
        System.out.println("장신: " + maxOf(height2) + "cm");
        System.out.println("돼지: " + maxOf(weight2) + "kg");

    }*/

        /*
        //메소드를 이용한 선형검색:원하는 값이 나올때까지 계속 ㄱ검색
        System.out.print("요소 수는?");
        int num=scan.nextInt();
        int[] x=new int[num];//**아직 배열 정의법 못 외웠지
        for(int i=0;i<num;i++){
            System.out.print("x["+i+"]: ");
            x[i]=scan.nextInt();
        }
        System.out.print("검색할 값은?: ");
        int key=scan.nextInt();

        int idx=linerSeach(x,key);//배열과 검색값 투입
        //몇번째에 있는지 출력
        if(idx==-1){
            System.out.println("이 값은 요소 내에 존재하지 않습니다.");
        } else {
            System.out.println("이 값은 x["+idx+"]에 있습니다.");
        }*/

        //배열의 요소를 역순으로 정렬
        int[] x={2,5,7,5,1};
        reverse(x);

        System.out.println("요소를 역순으로 정렬하였습니다");
        for(int i=0; i<x.length;i++){
            System.out.println("x["+i+"]="+x[i]);
        }

    }

    static void putStars(char c, int n) {
        while (n-- > 0) {
            System.out.print(c);//지정한 문자가 출력
        }
    }

    static boolean confirmRetry() {
        Scanner scan = new Scanner(System.in);
        //메인 메소드에서 정의 된것과 다름
        int cont;
        do {
            System.out.print("다시? 1/0:");
            cont = scan.nextInt();
        } while (cont != 0 && cont != 1);
        return (cont == 1);//1이면 true값, 0이면 false, 그 외는 반복
    }

    //배열을 인수로 넘기는 것 배열로 최댓값
    static int maxOf(int[] a) {//배열임을 표현
        int im = 0;
        for (int s = 0; s < a.length; s++) {//메인 메소드 안의 변수 추출법//인수.length
            if (im < a[s]) {
                im = a[s];
            }
        }return im;//리턴값을 입력하는 위치 주의
    }
    static int linerSeach(int a[],int key){
        for(int i=0;i<a.length;i++){
            if(a[i]==key){
                return i; //if문 스코프 밖으로 나오는 리턴
            }
        } return -1;
    }

    static void reverse(int[] a){//배열을 인수로 두었지만 리턴 값은 없다.
        //첨자를 통해 실제로 대입되기때문에
        //그래서 2개를 하는 건가??
        System.out.print("배열을 역순으로 정렬합니다.");
        for(int i=0;i<a.length/2;i++){
            swap(a,i,a.length-i-1);//swap의 인수 배열의 첨자
        }
    }
    static void swap(int [] a, int idx1, int idx2){
        int t;
        t=a[idx1];
        a[idx1]=a[idx2];
        a[idx2]=t;//임시저장한 값
    }
}

