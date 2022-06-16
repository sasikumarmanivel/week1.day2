package myfirstjava;

public class Cars {
	public void applyBreak()
	{
		System.out.println("Apply break for control");
	}

	public String applyGear()
	{
		return("Apply gear to increase the speed");
		
		
	}

	public void switchOnAc()
	{
		System.out.println("Turn On Ac to get the chill climate");
	}
		
	public String applyAcclerate()
	{
		return("Apply acclerate to increase the speed");
		
	}
		
		
	public static void main(String[] args) 
	{
		Cars obj = new Cars();
		String applyGear = obj.applyGear();
		System.out.println(applyGear);
		obj.applyBreak();
		obj.switchOnAc();
		//obj.applyAcclerate();
		String applyAcclerate1 = obj.applyAcclerate();
		System.out.println(applyAcclerate1);
		
	}
	

	
}
