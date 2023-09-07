package thivyashreepackage;


abstract class Bank{
	 abstract  float rateOfInterest();
	}

	class HdfcBank extends Bank{
	      float rateOfInterest(){
	             return 6.3f;
	      }
	      void calCompInterest() {
	    	  System.out.println("calCompInterest");
	      }//this method was hidden we cannot access with bank bob
	}

	class SbiBank extends Bank{
	      float rateOfInterest(){
	             return 7.5f;
	      }
	}
	class CitiBank extends Bank{
	      float rateOfInterest(){
	             return 8f;
	      }
	}
	public class BankMain{
	        public static void main(String args[]){
	        	HdfcBank hob = new HdfcBank();
	        	System.out.println("THE RATE OF INTEREST of HDFC bank "+hob.rateOfInterest());
	        	SbiBank sob=new SbiBank();
	        	System.out.println("THE RATE OF INTEREST of SBI bank "+sob.rateOfInterest());
	        	CitiBank cob=new CitiBank();
	        	System.out.println("THE RATE OF INTEREST of CITY bank"+cob.rateOfInterest());
	        	Bank bob; //only for abstract class.
	        	bob=new HdfcBank();
	        	System.out.println("THE RATE OF INTEREST of HDFC bank "+bob.rateOfInterest());
	        	bob=new SbiBank();
	        	System.out.println("THE RATE OF INTEREST of SBI bank "+bob.rateOfInterest());
	        	bob=new CitiBank();
	        	System.out.println("THE RATE OF INTEREST of SBI bank "+bob.rateOfInterest());
	        	
	      }
	}
