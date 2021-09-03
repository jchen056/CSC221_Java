import java.security.SecureRandom;
//used to generate nondeterministic random numbers

public class RandomIntegers
{
	public static void main(String[] args) {
	    SecureRandom randomNumbers=new SecureRandom();//randomNumbers object that generate random randomNumbers
	    for(int i=1;i<=20;i++){
	        int face=1+randomNumbers.nextInt(6);//scaling(0-5)+shilfting(+1)
	        System.out.printf("%d ",face);
	        if(i%5==0){
	            System.out.print("\n");//5 numbers then start a new line
	        }
	    }
		
	}
}