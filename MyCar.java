package myfirstjava;

public class MyCar {
	public static void main(String[] args) {
		Cars obj = new Cars();
		obj.applyBreak();
		obj.switchOnAc();
		String applyAcclerate = obj.applyAcclerate();
		System.out.println(applyAcclerate);
		obj.applyGear();
		
		
		
	}

}
