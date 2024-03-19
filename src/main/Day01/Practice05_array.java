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
//
    }
}
