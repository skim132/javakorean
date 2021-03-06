class Say {
    // 필드
    private String message = "안녕하세요."; // 필드 이니셜라이저
    // 생성자
    public Say() {
        this.message = "반갑습니다."; // 생성자를 사용한 필드 초기화
    }
    // 메서드
    public void Hi() {
        System.out.println(this.message);
    }
}

public class FieldInitializer {
    public static void main(String[] args) {
        Say say = new Say();
        say.Hi(); 
    }
}
