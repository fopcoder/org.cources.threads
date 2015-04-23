package org.threads;

import java.math.BigInteger;
import java.util.Random;

public class Main {

	public static void main( String[] args ) {
		// Thread t = Thread.currentThread();

		// Thread t1 = new Thread( new NT(), "fuck" );
		// Thread t2 = new Thread( new NT(), "shit" );
		// Thread t3 = new Thread( new NT(), "ass" );

		// t1.setDaemon( true );
		// t1.start();
		// t.interrupt();
		// System.out.println( t1.isDaemon() );

		Random rand = new Random();

		int arrSize = 10_000;
		int[] ar1 = new int[arrSize];
		// int[] ar2 = new int[arrSize];
		// int[] ar3 = new int[arrSize];

		for( int i = 0; i < arrSize; i++ ) {
			ar1[i] = rand.nextInt( 1000 );
		}

		long t = System.nanoTime();
		int s = sum( ar1 );
		System.out.println( System.nanoTime() - t );
		System.out.println( s );

		// try {
		//
		// // t2.start();
		// // t3.start();
		//
		// // t1.join();
		// // t2.join();
		// // t3.join();
		//
		// }
		// catch( InterruptedException e ) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }

		t = System.nanoTime();
		int f = fuckRec( 10 );
		System.out.println( f );
		System.out.println( "fuck rec : " + f + " - "
				+ ( System.nanoTime() - t ) );

		t = System.nanoTime();
		f = fuck( 10 );
		System.out.println( f );
		System.out.println( "fuck : " + f + " - " + ( System.nanoTime() - t ) );

		System.out.println( "fuck Big : " + fuckBig( 100 ) );

		System.out.println( "main end" );

	}

	static int sum( int[] a ) {
		int sum = 0;
		for( int i : a )
			sum += i;
		return sum;
	}

	static void sortir( int[] a ) {

	}

	static int fuck( int n ) {
		int m = n;
		while( --n > 0 )
			m *= n;
		return m;
	}

	static int fuckRec( int n ) {
		return ( n == 0 ) ? 1 : fuckRec( n - 1 ) * n;
	}

	static BigInteger fuckBig( int n ) {
		BigInteger b = BigInteger.valueOf( n );
		while( --n > 0 )
			b = b.multiply( BigInteger.valueOf( n ) );
		return b;
	}
}
