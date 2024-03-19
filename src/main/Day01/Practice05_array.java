import java.util.Random;
import java.util.Scanner;

public class Practice05_array {
    public static void main(String[] asgs) {
        //배열 여러개의 값을 한꺼번에 처리하기 위해 필요
        Scanner scan = new Scanner(System.in);

        /*
        int sum=0;
        System.out.println("5명의 점수를 입력하시오.");

        System.out.print("1번 점수:");
        int lee = scan.nextInt();
        sum+=lee;

        System.out.print("2번 점수:");
        int kim = scan.nextInt();
        sum+=kim;

        System.out.print("3번 점수:");
        int park = scan.nextInt();
        sum+=park;

        System.out.print("4번 점수:");
        int hong = scan.nextInt();
        sum+=hong;

        System.out.print("5번 점수:");
        int jung =scan.nextInt();
        sum+=jung;

        System.out.println("합계는"+sum+"점입니다.");
        System.out.println("평균은"+(double)sum/5+"점입니다.");//실수 doubble
        */

        /*
        int[] a=new int[5];//5개 0,1,2,3,4
        a[1]=37;
        a[2]=51;
        a[4]=a[1]*2;
        */


        /*System.out.println("a["+0+"]="+a[0]);//초기값
        System.out.println("a["+1+"]="+a[1]);
        System.out.println("a["+2+"]="+a[2]);
        System.out.println("a["+3+"]="+a[3]);//초기값
        System.out.println("a["+4+"]="+a[4]);

        for(int i=0; i<5; i++){
            System.out.println("a["+i+"]="+a[i]);} //위에 거 한번에
        */
        //위와 같음
        /*
        int[] arw=new int[5];
        for(int i=0;i<arw.length;i++){
            System.out.println("a["+i+"]="+a[i]);
            }
         */

        /*
        int[] a2=new int[5];//요소 5개를 가지는 배열2
        for (int i=0;i<a2.length;i++){//a2.length=길이 여기선 5
            a2[i]=i+1;//12345 요소를 갖는 배열
        }
        for(int i=0;i<a2.length;i++){
            System.out.println("a["+i+"]="+a2[i]);//그걸 출력하는 함수
        }
        */

        //이걸 사용자에게 입력받게하기

        /*
        System.out.print("요소 수");
        int n=scan.nextInt();
        int[] a3=new int[n];

        for(int i=0;i<n;i++){
            System.out.print("a["+i+"]=");//무슨 값인지 표시
            a3[i]=scan.nextInt();//n-1(0부터니까)번째 값은 여기에
        }
        */

        /*
        //정의하는 두가지 방법
        //=int[] a4={1,2,3,4,5};
        int[] a4;
        a4=new int[]{1,2,3,4,5};

        for(int i=0;i<a4.length;i++){
            System.out.println("a["+i+"]="+a4[i])}
        */

        /*
        //상대에게 입력을 받아 성적 처리 하는 배열
        int sum2 = 0;
        final int person = 5;//학생이 5명
        int[] point = new int[person];//학생수도 입력 받아도 되지 않나

        System.out.println(person + "명의 점수를 입력하시오.");
        for (int i = 0; i < person; i++) {
            System.out.print((i + 1) + "번의 점수:");
            point[i] = scan.nextInt();
            sum2 += point[i];
        }
        System.out.println("합계는" + sum2 + "점입니다.");
        System.out.println("평균은" + (double) sum2 / person + "점입니다.");
        //맨 위에 8번 라인부터의 함수보단 훨씬 간결해짐
        // 1번학생 2번학생이 없고, 배열을 생성해 i번째.
        int max = point[0];
        int k=1;
        for (k = 1; k<point.length; k++) {//사람 수가 아니라 배열 길이
            if (max < point[k]) {//max함수
                max = point[k];
            }

        }
        System.out.println("최고 점수는" + max + "점입니다.");
        //시도는 좋았으나 for문 바깥에 쓰지 않아 반복됨
        //그리고 아직 리턴값 안 배워서 k를 재설정함
        //max함수 활용할 줄을 모름 ㅋㅋㅋㅋㅋ
        */

        //배열 값 검색 선형검색:
        //직선 모양으로 늘어선 배열에서 원하는 키 값을 갖는 요소를 만날 때까지
        // 맨 앞부터 순서대로 요소를 검색하는 방식

        /*
        final int n2=12;*/
        Random rand = new Random();
        /*int[] a5=new int[n2];//12개의 인자를 갖는 배열
        for(int j=0;j<n2;j++){
            a5[j]=rand.nextInt(10);//10까지의 수 중에 랜덤
        }//10까지 수를 임의로 배열에 넣음

        System.out.print("배열 a의 모든 요소의 값:\n{");
        for(int j=0;j<n2;j++) {
            System.out.print(a5[j] + " ");//요소를 각각 출력해서 나열
        }
        System.out.println("}");

        System.out.print("검색할 수치:");
        int key=scan.nextInt();//입력받음

        int i;
        for (i=0;i<n2;i++) {
            if (a5[i] == key) {
                break; //키를 배열에서 있는지 검색. 있으면 브레이크
            }
        }
        if(i<n2){//위의 for문에서 중간에 break가 걸렸다=검색한게 key안에 있었다.
            System.out.println("이것은 a["+i+"]에 있습니다.");
        } else {
            System.out.println("이것은 없습니다.");
        }

        //break를 활용해 배열안에 있는지 찾는법인데....
        //검색이긴한데 첫번째 만나는 애만 알 수 있다 아쉽네
         */


        //배열을 역순으로 정렬하는 함수
        /*
        System.out.print("요소 수:");
        int n3=scan.nextInt();
        int[] a6=new int[n3];//참가자가 원하는 수만큼의 배열

        for(int i2=0;i2<n3;i2++){//hy=su-1(여기서만 이용)
            a6[i2]=10+rand.nextInt(90);//+10이 왜 필요하지...?
            System.out.println("a["+i2+"]="+a6[i2]);//~90랜덤값을 넣고 출력.
        }
        for(int i2=0;i2<n3/2;i2++){//새로운 변수 전체를 돌면 안되니까 ★ n/2
            int t=a6[i2];//두 개의 값을 교환할 수 없어서 잠시 저장하는 임시변수
            a6[i2]=a6[n3-i2-1];//강의는 "su-hy-1"이라고 나오는데 저게 보기 편하지
            // 0부터 시작하니 -1 해당 변수로 반복을 거듭할 수록 hy가 커지며 중간값으로
            a6[n3-i2-1]=t;//임시값에 있던걸 다시 대입
        }
        System.out.println("요소를 거꾸로 정렬했습니다.");
        for(int i2=0;i2<n3;i2++){
            System.out.println("a6["+i2+"]:"+a6[i2]);
        }
        */

        //배열의 값을 복사(스스로 해본 결과= 좋았음)
        /*System.out.print("요소 수");
        int num=scan.nextInt();
        int[] a=new int[num];//배열 생성공식 기억하자!
        int[] b=new int[num];

        for(int i=0;i<num;i++){
            a[i]=rand.nextInt(50);//영상에서는 직접 입력받음
            //직접입력받을거면 한방에 넣으면 안되나??
        }
        for(int j=0;j<num;j++){
            b[j]=a[j];
        }
        for(int k=0;k<num;k++) {
            System.out.println("a[" + k + "]=" + a[k]);
        }
        for(int k=0;k<num;k++) {
            System.out.println("b[" + k + "]=" + b[k]);
        }*/
        /* 아래를 하면 번갈아 나오고 위를 하면 한방에 나옴
        for(int k=0;k<num;k++) {
            System.out.println("a[" + k + "]=" + a[k]);
            System.out.println("b[" + k + "]=" + b[k]);
        }
         */

        //영상 풀이 보고 의문인 점 입력 받을거면 같이 받으면 안되나?
        /*
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
        }*/

        //문자열배열 String

        String[] monthString = {
                "1월", "2월", "3월", "4월", "5월 ", "6월", "7월",
                "8월", "9월", "10월", "11월", "12월"};
        int month = rand.nextInt(12);//0~11까지=12미만
        System.out.println("문제는 " + monthString[month]);
        //monthString[month]은 글자

        while(true){//무한함수 주의 do while 대신 while if
            System.out.print("월을 입력하세요.");
            int answer=scan.nextInt();
            if(answer==month+1){//수치와 수치비교 == month는 0에서 시작 +1
                break;
            } else {
                System.out.println("아닙니다.");
            }
        }System.out.println("정답입니다.");
        //영상에서는 영어로 월이 나와서 멋있었는데 내건 바보한테 묻는거 같다 ㅋㅋㅋㅋ

    }
}
