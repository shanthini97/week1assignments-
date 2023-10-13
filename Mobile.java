package week1;

public class Mobile {

   public void makecall()
   {
	  String mobileModel="vivo";
	  Float mobileWeight=0.98f;
	  
	  System.out.print("MoblieModel:\n"+mobileModel);
	  System.out.print("\nmobileWeight:\n"+mobileWeight);
	}

   
   public void sendMsg()
   {
	  boolean isFullCharged=true;
	  int mobileCost = 100000;
	  System.out.print("\nisFullCharged:\n"+isFullCharged);
	  System.out.print("\nmobileCost:\n"+mobileCost);
	}
   public static void main(String[] args) {
		// TODO Auto-generated method stub
	   
	   Mobile Mob=new Mobile();
	     Mob.makecall();
		 Mob.sendMsg();
	   
		System.out.print("\n This is my mobile");

	}

}
