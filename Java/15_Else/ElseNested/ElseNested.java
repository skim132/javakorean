// 하나의 입력된 문자에 따라서 'y'이면 "Yes"를, 'n'이면 "No"를, 나머지는 모두 "Cancel"을 출력하는 프로그램
public class ElseNested {
    public static void main(String[] args) {
        char input = 'y';
        if (input == 'y') {
            System.out.println("Yes");
        }
        else {
            if (input == 'n') {
                System.out.println("No");
            }
            else {
                System.out.println("Cancel");
            }
        }
    }
}
