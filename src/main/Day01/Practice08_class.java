import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
import static java.util.GregorianCalendar.*;//뭔차인지는 모르겠다 상수 사용?이랬나

public class Practice08_class {
    public static void main(String[] args) {

        /*
        Account chulsoo=new Account("철수","123456", 1000);
        Account younghee=new Account("영희","654321", 200);
        //철수라는 개체 어카운드 클래스를 이용해서 선언, 생성자 호출해 초기값(괄호 안)

        chulsoo.withdraw(200);//200원 인출
        younghee.deposit(100);//100원 입금?

        System.out.println("철수의 계좌");
        System.out.println("계좌명의: "+chulsoo.getName());//메소드 호출
        System.out.println("계좌번호: "+chulsoo.getNo());
        System.out.println("예금잔고: "+chulsoo.getBalance());

        System.out.println("영희의 계좌");
        System.out.println("계좌명의: "+younghee.getName());
        System.out.println("계좌번호: "+younghee.getNo());
        System.out.println("예금잔고: "+younghee.getBalance());
    }*/


        Scanner scan = new Scanner(System.in);

        String[] wd = {"일", "월", "화", "수", "목", "금", "토"};

        /*
        System.out.println("생일을 양력으로 입력하십시오: ");
        System.out.print("년: ");
        int y = scan.nextInt();
        System.out.print("월: ");
        int m = scan.nextInt();
        System.out.print("일: ");
        int d = scan.nextInt();

        Day birthday = new Day(y, m, d);
        //Day 클래스에 birth 객체 = 생성자(값=초기값 세팅)
        //생성자=p.291

        System.out.println("당신의 생일은 " + birthday.getYear() + " " +
                birthday.getMonth() + "월 " + birthday.getDate() + "일 " + wd[birthday.dayOfWeek()] + "요일입니다.");

        */

        //클래스 안 값들 비교
        /*int y,m,d;
        System.out.println("날짜 1을 입력하세요");
        System.out.println("년: ");
        y=scan.nextInt();
        System.out.println("월: ");
        m=scan.nextInt();
        System.out.println("일: ");
        d=scan.nextInt();
        Day day1=new Day(y,m,d);
        //Day 클래스형 객체

        System.out.println("날짜 2를 입력하세요");
        System.out.println("년: ");
        y=scan.nextInt();
        System.out.println("월: ");
        m=scan.nextInt();
        System.out.println("일: ");
        d=scan.nextInt();
        Day day2=new Day(y,m,d);
        */

        //if(day1==day2) //객체와 객체를 바로 비교하기는 불가능
        //그 안의 값들을 일일히 비교해야 한다
        /*
        바로 아래의 메소드가 실행될 때 이 부분은 필요 없어짐
        if (day1.getYear()==day2.getYear()&&
                day1.getMonth()==day2.getMonth()&&
                day1.getDate()==day2.getDate())*/
            /*
            System.out.println("같습니다");

        } else {
            System.out.println("다릅니다");
        }
        */
        //클래스형 객체의 배열


        /*
        System.out.print("날짜는 몇 개?");
        int n = scan.nextInt();

        Day[] a = new Day[n];//Day 클래스형 배열로 //배열만 만들어짐
        //a 클래스형 객체의 배열
        for (int i = 0; i < a.length; i++) {
            a[i] = new Day(2017, 10, 15);//초기값 생성
            //객체를 생성하지 않고 요소에 바로 셋을 하면 에러
            //배열요소에 바로 셋 a[i].set(2017, 10, 20);//에러 발생
            //클래스형 인스턴스 배열을 만들 때에는 각각의 클래스 객체를 배열 요소에 생성 후 사용
            //뭔소리여??
        }
        for (int i = 0; i < a.length; i++) {//입력값 화면 표시
            System.out.print("a["+i+"]="+
                    a[i].getYear() + "년 " +
                    a[i].getMonth() + "월 " +
                    a[i].getDate() + "일(" +
                    wd[a[i].dayOfWeek()] + ")");

        }*/
        GregorianCalendar today=new GregorianCalendar();
        //현재 날짜를 구함 = 초기값은 오늘 날짜

        System.out.printf("%04d년 %02d월 %02d일입니다.\n",
                today.get(YEAR),today.get(MONTH)+1,today.get(DATE));
        //month는 0부터 시작하기 때문
        //맨 위에 import static이랑 .*추가

    }
        //위의 각 값을 비교하는 것을 메소드로
        static boolean compDay (Day d1, Day d2){ //Day=클래스 d1,2=객체
            //배열처럼 클래스 객체를 인수로서 받아왔다?
            //메소드 인수로 배열뿐만 아니라 클래스의 객체를 인수로 받기 가능
            return (d1.getYear() == d2.getYear() &&
                    d1.getMonth() == d2.getMonth() &&
                    d1.getDate() == d2.getDate());
        }
    }


    class Account {//왜 이렇게 되는 거지??//클래스가 2개 뜨네
        //배열을 활용해 같은 종류에 묶어 다룸 지금은 다른 종류의 데이터 하나의 클래스로 묶어 관리
        //계좌명 계좌번호 예금정보
        private String name;//이름
        private String no;//계좌번호
        private long balance;//예금잔고
        //멤버변수 선언
        //private로 외부 클래스에서 접근할 수 없다.

        //생성자=객체를 생성할때 초기값
        //어카운트 클래스
        Account(String n, String num, long z) {
            name = n;
            no = num;
            balance = z;
        }
        //멤버 변수에다가 사용자가 입력한 값을 초기값으로 생성자 선언

        String getName() {
            return name;
        }

        String getNo() {
            return no;//계좌번호를 가져오는 메소드
        }

        long getBalance() {
            return balance;
        }

        void deposit(long k) {//잔고
            balance += k;
        }

        void withdraw(long k) {//출금
            balance -= k;

        }
    }

    //데이 새로운 클래스
    class Day {//클래스
        private int year;//멤버변수
        private int month;
        private int date;

        Day(int year, int month, int date) {//생성자=멤버변수와 이름은 같으나 다름
            //year=year; 틀림 멤버변수가 이 인수를 넘겨받은 값을 어사인 하려고
            this.year = year;//멤버변수=인수
            this.month = month;
            this.date = date;//초기값을 설정하는 생성자
        }

        //메소드들
        int getYear() {
            return year;
        }

        int getMonth() {
            return month;
        }

        int getDate() {
            return date;
        }//여기까지 값을 내어주는 것

        //아래부터는 값을 입력받아 새로 입력
        void setYear(int year) {//
            this.year = year;//멤버변수=인수
        }

        void setMonth() {
            this.month = month;
        }

        void setdate() {
            this.date = date;
        }

        void set(int year, int month, int date) {//메소드 연월일을 한번에 바꿀 때
            this.year = year;
            this.month = month;
            this.date = date;
        }

        //요일 표기
        int dayOfWeek() {//메서드
            int y = year;
            int m = month;
            if (m == 1 || m == 2) {
                y--;
                m += 12;
            }
            return (y + y / 4 - y / 100 + y / 400 + (13 * m + 8) / 5 + date) % 7; //0=일요일~
        }

}
/*
요약: 클래스 선언, 그의 객체 선언, 초기값 세팅, 메소드 호출해서 그 안의 멤버변수의 값을 불러옴
바꿔온 값은 외부에 접근할 수 있는 메서드를 활용해서 값을 표시
 */