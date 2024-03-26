import java.util.Scanner;

public class Practice09_classvar_classmath {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        //철수와 영희라는 클래스객체 소환
        Account chulsoo=new Account("철수","123456", 1000);
        Account younghee=new Account("영희", "654321",200);

        /*System.out.println("철수의 계좌");
        System.out.println("계좌명의: "+ chulsoo.getName());
        //철수라는 객체에서 getName라는 메소드
        System.out.println("계좌번호: "+chulsoo.getNo());
        System.out.println("예금잔고: "+chulsoo.getBalance());
        System.out.println("식별번호: "+chulsoo.getId());
        //인스턴스 변수의 값을 퍼블릭 메소드를 이용해 구해서 화면에 출력

        System.out.println();
        System.out.println("영희의 계좌");
        System.out.println("계좌명의: "+ younghee.getName());
        System.out.println("계좌번호: "+younghee.getNo());
        System.out.println("예금잔고: "+younghee.getBalance());
        System.out.println("식별번호: "+younghee.getId());//count=0; ++count해서
        */

        /*
        Id a=new Id();//Id클래스에 대한 a b 객체
        Id b=new Id();
        Id c=new Id();

        System.out.println("a의 식별번호: "+a.getId());
        System.out.println("b의 식별번호: "+b.getId());
        System.out.println("c의 식별번호: "+c.getId());

        System.out.println("Id.counter= "+Id.counter);
        //id클래스의 카운터 값=2=객체 a의 카운터 값=객체 b의 카운터 값
        System.out.println("a.counter= "+a.counter);
        System.out.println("b.counter= "+b.counter);
        System.out.println("c.counter= "+c.counter);//추가되면 바로 바뀜
         */

        //math클래스에서 사용되는 클래스 변수를 사용하는 법

    }
}

class Account{ //철수와 영희의 계좌정보 처리
    private static int counter=0; //클래스변수
    //Static=정적인 -> 정적인 필드
    private String name;
    private String no;
    private long balance;
    private int id;
    //네가지 모두 비정적인 필드 //인스턴스 변수


    //Account의 생성자 이름 계좌번호 잔액을 넘겨받아 그걸 이용해 해결
    public Account(String n,String num, long z){
        name=n;
        no=num;
        balance=z;
        //넘겨받은 값을 내부 인스턴스 변수에 저장
        id=++counter;
        //인스턴스 변수는 생성된 객체에 따라 다른 값 저장 가능
        //정적인 클래스 변수는 실제 그 클래스로 멤버변수를 호출하던, 객체로 호출을 하던 동일
    }
    public String getName(){
        return name;
    }//내부에 있는 인스턴스변수 name을 바깥으로 호출하는 매서드
    public String getNo(){
        return no;
    }
    public long getBalance(){
        return balance;
    }
    public int getId(){
        return id;
    }

    //입출금 기록

    public void deposit(long k){
        balance+=k;
    }
    public void withdraw(long k){
        balance-=k;
    }
}
//클래스 변수와 인스턴스 변수의 차이
class Id{
    static int counter=0;//퍼블릭형 클래스 변수
    private int id;//인스턴스변수
    public Id(){//인스턴스 변수의 생성자
        id=++counter;
    }
    public int getId(){
        return id;//저장된 id값을 외부에서 얻게
    }
}