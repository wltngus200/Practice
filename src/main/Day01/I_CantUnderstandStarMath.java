public class I_CantUnderstandStarMath {
    public static void main(String[] args) {
        int n = 5;//해설에서는 스캐너를 통해 입력받음
        for (int i = 1; i <= n; i++) {
            putStars(i);//i의 대입
            System.out.println();
        }
    }//메소드를 활용하면 for 반복마다 i라는 변수가 새롭게 투입되어 오류 발생X
    static void putStars(int n) {//위의 i를 n으로 받아 변수로서 사용
        while (n-- > 0) {
            //입력받은 정수 n값을 하나씩 줄여가며 별을 출력
            System.out.print("*");
        }


    }
}