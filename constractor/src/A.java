
public class A {

	int x;
	int u;
	String userId;
	String pass;

	A(int y) {

		x = y;
	}

	A(int a, int b) {

		x = a;
		u = b;
	}

	A(String s, String i) {

		userId = s;
		pass = i;

	}

	void m1() {

		System.out.println(x);
	}

	void m2() {

		System.out.println(x + u);
	}

	void logIn() {

		System.out.println(userId + pass);
	}

}
