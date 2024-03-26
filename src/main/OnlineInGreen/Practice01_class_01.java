import java.util.Random;

public class Practice01_class_01 {
    public static void main(String[] args){
        /*
        Scanner stuId=new Scanner(System.in);
        int x=stuId.nextInt();
        System.out.println("x의 값"+x);
        int y=stuId.nextInt();
        System.out.println("y의 값"+y);
        //스캐너를 활용해 사용자에게 값을 입력받아 사용
        //패키지 리포트(import)가 필요함
        //객체 선언은 값을 받을 때도 똑같이 기입해야 하는 듯(위는 stuId)
        //학원 동영상 강의 1강 + p.510
        */


        Random ok=new Random();
        int lucky=ok.nextInt(999-100); //bound??
        System.out.print("당신의 행운의 숫자는"+lucky+"입니다");
        //범위를 지정하여 랜덤한 값을 넣음
        //패키지 리포트(import)가 필요함
        //클래스명(젤 처음이 이름) 뒤의 객체는 뒤의 변수의 매소드(?)와 일치(위는 ok)
        //학원 동영상 강의 1강 + p.500

    }
}
