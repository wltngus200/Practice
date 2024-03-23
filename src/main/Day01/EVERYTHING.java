public class EVERYTHING {
    public static void main(String[] args){
        String name="홍길동";
        int age=22;
        double height=178.2;
        char bloodtype='A';
        boolean isSingle=true; //t:싱글입니다. f:싱글이 아닙니다.
        System.out.printf("저의 이름은 %s입니다. 나이는 %s살, 키는 %scm, 혈액형은 %s형, %s\n"
                , name, age, height, bloodtype,isSingle?"싱글입니다":"싱글이 아닙니다.");
        //삼항식의 투입
        System.out.printf("저는 %b입니다.",isSingle);//true
        System.out.printf("저는 %b입니다.",isSingle);//true
        //전부 %s도 가능 앞서 한 것처럼 반올림내림 자리수 정렬 등을 하려면 나머지
        //21 모든 값은 스트링으로 변할 수 있음(but.%f %d때 기능은 사용할 수 없다

    }
}
