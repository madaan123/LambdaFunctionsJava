package org.studyeasy;

// Functional Interface
interface Lambda {
	void demo();
}

public class Lambda_Demo {

	public static void main(String[] args) {
//		Lambda lambda = new Lambda() {
//			
//			@Override
//			public void demo() {
//				System.out.println("statement1");
//			}
//		};

		// Lambda expression in java to simplify function declaration over previous
		// statements
		Lambda lambda = () -> System.out.println("statement1");
		lambda.demo();

		// Runnable is also a functional interface
		Thread thread1 = new Thread(() -> System.out.println("Hello"));
		thread1.start();

		new Thread(() -> {
			System.out.println("Hello");
		}).start();

	}

}
