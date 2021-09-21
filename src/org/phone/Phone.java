package org.phone;

public class Phone {
private void phoneInfo() {
System.out.println("my phoneis : realme X3");
}
private void phone(String realme,float display) {
System.out.println("my phone is:"+realme);
System.out.println("my phone display is:"+display);
}
private void phone(float price,String spec) {
System.out.println("my phone price is:"+price);
System.out.println("my phone spec is:"+spec);
}
public static void main(String[] args) {
	Phone p = new Phone();
	p.phone("Realme X3", 6.5f);
	p.phone(25.669f, "8GB RAM");
}
}
