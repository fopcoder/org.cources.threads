package org.threads;

public class MultiSum implements Runnable {
	private int start, end, a[], sum = 0;
	Thread t;

	public MultiSum( int[] a, int start, int end ) {
		this.a = a;
		this.start = start;
		this.end = end;
		this.t = new Thread( this, "sort " + start + " - " + end );
		t.start();
	}

	public int getSum() {
		return sum;
	}

	@Override
	public void run() {
		for( int i = this.start; i < this.end; i++ ) {
			this.sum += this.a[i];
		}
	}
}
