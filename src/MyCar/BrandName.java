package MyCar;

public class BrandName {
	
	    String brandName = "BMW";
	    int year = 2019;
	    String model = "x5";
	    boolean redColor = false;
	    int maxSpeed = 200;
	    
	    //object
	    public void brandName(){
	    	System.out.println(brandName + " "+model +" "+ year +" "+ maxSpeed);
	    }
	    
        public void year() {
        	System.out.println(year);
        	
       //constructor 
       
	    }
        public BrandName(String x,int y,String z) {
        	this.brandName=x;
        	this.maxSpeed=y;
        	this.model=z;
        	System.out.println("my car name is"+" "+ x+ "maximum is"+" "+ y+ "model is"+" "+ z);
        	
        }
	    
}
