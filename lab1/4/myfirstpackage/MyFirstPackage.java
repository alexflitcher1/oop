package myfirstpackage;

public class MyFirstPackage {
    private int a;
    private int b;

    public MyFirstPackage(int a, int b) {
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
