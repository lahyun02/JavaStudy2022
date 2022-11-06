package exercise;

// 인터페이스 -> 설계목적으로 사용
public interface CalcInterface {
	public static final int a = 0;  //static, final, public (모두가 공통적으로 사용해야 함)
	public static final int b = 0;  //static, final, public (모두가 공통적으로 사용해야 함)
	void setValue(int a, int b);
	int calculate();
}
