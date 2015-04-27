package org.threads;

import java.math.BigInteger;

public class Factorial implements Runnable {
	private Thread t;
	private long i;

	public Factorial( long i ) {
		this.i = i;
		this.t = new Thread( this );
		t.start();
	}

	public Thread getThread() {
		return t;
	}

	@Override
	public void run() {
		System.out.println( this.factorial( i ) );
	}

	public BigInteger factorial( long i ) {
		BigInteger res = BigInteger.valueOf( i-- );

		while( i > 0 ) {
			res = res.multiply( BigInteger.valueOf( i-- ) );
		}

		return res;
	}
}
