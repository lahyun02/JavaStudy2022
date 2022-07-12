package chapter13;

public class MainThreadEx {

	public static void main(String[] args) {
		System.out.println("Thread ID : " + Thread.currentThread().getId());
		System.out.println("Thread Name : " + Thread.currentThread().getName());
		System.out.println("Thread Priority : " + Thread.currentThread().getPriority());
		System.out.println("Thread State : " + Thread.currentThread().getState());
	}

}
