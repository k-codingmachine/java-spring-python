class Ex6_10 {
	public static void main(String args[]) {
		MyMath3 mm = new MyMath3();
//		The method add(int, long) is ambiguous for the type MyMath3(모호하다)
//		System.out.println("mm.add(3, 3) 결과:"    + mm.add(3,3));
		System.out.println("mm.add(3L, 3) 결과: "  + mm.add(3L,3));
		System.out.println("mm.add(3, 3L) 결과: "  + mm.add(3,3L));
		System.out.println("mm.add(3L, 3L) 결과: " + mm.add(3L,3L));

		int[] a = {100, 200, 300}; // 배열 생성후 초기화까지!
		System.out.println("mm.add(a) 결과: " + mm.add(a));
   }
}

class MyMath3 { // 산술 클래스를 선언한다!
	int add(int a, int b) {
		System.out.print("int add(int a, int b) - ");
		return a+b;
	}
	int minus(int a, int b) {
		System.out.println("int minus(int a, int b");
		return a - b;
	}
	
	long add(int a, long b) {
		System.out.print("long add(int a, long b) - ");
		return a+b;
	}
	
	long add(long a, int b) {
		System.out.print("long add(long a, int b) - ");
		return a+b;
	}

	long add(long a, long b) {
		System.out.print("long add(long a, long b) - ");
		return a+b;
	}

	int add(int[] a) {	
		System.out.print("int add(int[] a) - ");
		int result = 0;
		for(int i=0; i < a.length;i++) 
			result += a[i];
		
		return result;
	}
}