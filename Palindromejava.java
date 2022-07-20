
public class Palindromejava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int reverse = 0 ;
		int num =1221 ;
		int reminder ;
		int orignal =num ;
		
		while(num!=0) {
			reminder=num%10 ;
			reverse=reverse*10+reminder;
			num = num/10 ;
		}
		if(reverse==orignal) {
			System.out.println("  it is a Palindrome Number "+orignal);
		}
		else {
			System.out.println("Itis not Palindrome Number "+orignal);
		}

	}

}
