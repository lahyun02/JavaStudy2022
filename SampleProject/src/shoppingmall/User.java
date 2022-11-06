package shoppingmall;

public class User {
	public enum payType {CASH, CARD}	//enum은 세미콜론 안씀.
	private String name; 		// 사용자 이름
	private payType paytype;	// 결재 타입
	User(String name, payType paytype){
		this.name = name;
		this.paytype = paytype;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public payType getPaytype() {
		return paytype;
	}
	public void setPaytype(payType paytype) {
		this.paytype = paytype;
	}

	@Override
	public String toString() {
		return name + "(" + paytype + ")";
	}
	
	
}
