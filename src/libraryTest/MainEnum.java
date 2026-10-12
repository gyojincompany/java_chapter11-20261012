package libraryTest;

public class MainEnum {

	public static void main(String[] args) {
		
//		Grade.ADMIN
//		Grade.NORMAL
//		Grade.VIP
		//enum으로 선택할 수 있는 값의 종류를 미리 정해놓으면 다른 값이 입력되는
		//경우의 수를 방지할 수 있음!
		String grade = "advanced";
		
//		Color.RED
		Day day = Day.MONDAY;
//		String datStr = Day.FRIDAY;
		
		Object object = new Member();
		
		Member member = new Member();
		member.dayOutput(1000);
		
		

	}

}
