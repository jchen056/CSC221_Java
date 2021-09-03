import java.security.SecureRandom;
//used to generate nondeterministic random numbers

public class RollDie
{
	public static void main(String[] args) {
	    SecureRandom randomNumbers=new SecureRandom();//randomNumbers object that generate random randomNumbers
	    int frequency1=0;
	    int frequency2=0;
	    int frequency3=0;
	    int frequency4=0;
	    int frequency5=0;
	    int frequency6=0;
	    
	    for(int i=1;i<=6000;i++){
	        int face=1+randomNumbers.nextInt(6);//scaling(0-5)+shilfting(+1)
	        switch(face){
	            case 1:
	                frequency1++;
	                break;
	            case 2:
	                frequency2++;
	                break;
	            case 3:
	                frequency3++;
	                break;
	            case 4:
	                frequency4++;
	                break;
	            case 5:
	                frequency5++;
	                break;
	            case 6:
	                frequency6++;
	                break;
	        }
	       }
	   System.out.print("Face\tFrequency\n");
	   System.out.printf("1\t%d%n2\t%d%n3\t%d%n4\t%d%n5\t%d%n6\t%d%n",frequency1,frequency2,frequency3,frequency4,frequency5,frequency6);
	        
	        
	    
		
	}
}