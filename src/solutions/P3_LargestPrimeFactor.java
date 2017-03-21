package solutions;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author Dhawal.Verma
 * 
 *         The prime factors of 13195 are 5, 7, 13 and 29. What is the largest
 *         prime factor of the number 600851475143 ?
 * 
 */
public class P3_LargestPrimeFactor
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++)
		{
			long n = in.nextLong();
			BigInteger bi = new BigInteger(String.valueOf(n));
			BigInteger TWO = new BigInteger("2");
			int largestPrimeFactor = 1;
			if (bi.isProbablePrime(10))
				System.out.println(n);
			else
			{
				int nextPrime = 2;
				while (nextPrime <= Math.sqrt(n))
				{
					BigInteger prime = new BigInteger(String.valueOf(nextPrime));
					nextPrime = prime.nextProbablePrime().intValueExact();
					if (n % nextPrime == 0)
						largestPrimeFactor = nextPrime;
				}
				System.out.println(largestPrimeFactor);
			}
		}
	}
}
