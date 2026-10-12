package libraryTest;

//import java.util.ArrayList;

public class LibraryTest01 {

	public static void main(String[] args) {
		
		Member member = new Member();
		member.name = "홍길동";
		member.memberId = "tiger";
		member.memberPw = "12345";
		member.age = 27;
		
		String str = member.toString();
		System.out.println(str);
		
		
		String name1 = "홍길동";
		String name2 = "홍길동";
		
		String name3 = new String("홍길동");
		
		if(name1 == name2) {
			System.out.println("두 문자열은 같습니다!");
		} else {
			System.out.println("두 문자열은 다릅니다!");
		}
		
		if(name1.equals(name3)) {
			System.out.println("두 문자열은 같습니다!");
		} else {
			System.out.println("두 문자열은 다릅니다!");
		}
		
		//문자열은 반드시 equals() 메서드로 비교하여야 한다!!!
		
		String name4 ="korea";
		System.out.println(name4.length()); //문자열의 길이 메서드
	}

}
