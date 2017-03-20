package solutions;

import java.util.Scanner;

/**
 * @author Dhawal.Verma
 *
 * If we list all the natural numbers below 10
 * that are multiples of 3 or 5, we get 3, 5, 6 and 9.
 * The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 for n
 *
 */
public class P1_SumOfMultiplesOf3AND5
{
	/*

	 */
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            System.out.println(sumThrees(n-1) + sumFives(n-1) - sumFifteens(n-1));          
        }
    }
    
    public static long sumThrees(int n)
    {
        long nth =  Math.floorDiv(n,3);
        long sum = (nth*(3+3*nth))/2; 
        //System.out.println("n in 3 series: "+nth);
        //System.out.println("Sum in 3 series: "+sum);
        return sum;
    }
    
    public static long sumFives(int n)
    {
        long nth =  Math.floorDiv(n,5);
        long sum = (nth*(5+5*nth))/2; 
        //System.out.println("n in 5 series: "+nth);
        //System.out.println("Sum in 5 series: "+sum);
        return sum;
    }
    
    public static long sumFifteens(int n)
    {
        long nth =  Math.floorDiv(n,15);
        long sum = (nth*(15+15*nth))/2; 
        //System.out.println("n in 15 series: "+nth);
        //System.out.println("Sum in 15 series: "+sum);
        return sum;
    }
}
