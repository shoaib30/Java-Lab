import java.util.ArrayList;
import java.util.Scanner;

public class Cons_Prime {
	
	ArrayList<Integer> primes = new ArrayList<Integer>();
	ArrayList<Integer> conprimes = new ArrayList<Integer>();
	void findPrime(int n)	{
		boolean flag = false;
		for(int i = 3; i <= n; i++){
			flag = true;
			for(int j = 2; j <= Math.sqrt(i); j++)	{
				if(i%j == 0){
					flag = false;
					break;
				}
			}
			if(flag)	{
				primes.add(i);
			}
		}
	}
	int consecPrimes()	{
		int numberOfConsecPrimes = 0;
		int i = 0,sum = 2;
		while( i < primes.size()){
			//System.out.print("i:" + i + "  ");
			sum += primes.get(i);
			//System.out.println("Sum: "+sum);
			if(primes.contains(sum) && !conprimes.contains(sum))	{
				//System.out.println("Con: "+ sum);
				conprimes.add(sum);
				sum = 2;
				i = 0;
				continue;
			}
			i++;
		}
		numberOfConsecPrimes = conprimes.size();
		return numberOfConsecPrimes;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cons_Prime cp = new Cons_Prime();
		Scanner inp = new Scanner(System.in);
		int n = inp.nextInt();
		cp.findPrime(n);
		System.out.println(cp.consecPrimes());
		//System.out.println(cp.primes);
		//System.out.println("CoP: " + cp.consecPrimes() + ":" + cp.conprimes);
	}

}
