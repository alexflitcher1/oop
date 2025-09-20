class MyFirstClass {
    public static void main(String[] s) {
        MySecondClass o = new MySecondClass(0, 0);
	System.out.println(o.xor());

	for (int i = 1; i <= 8; i++) {
	    for (int j = 1; j <= 8; j++) {
	        o.setA(i);
		o.setA(j);
		System.out.print(o.xor());
		System.out.print(" ");
	    }
	    System.out.println();
	}
    }
}

class MySecondClass {
    private int a;
    private int b;

    MySecondClass(int a, int b) {
        this.a = a;
	this.b = b;
    }

    public int getA() {
        return this.a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return this.b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int xor() {
        return this.a ^ this.b;
    }
}
