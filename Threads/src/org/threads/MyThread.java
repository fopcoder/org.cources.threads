package org.threads;

public class MyThread implements Runnable {
	private Thread t;
	private String name;
	private Resource res;

	public MyThread( Resource res, String name ) {
		this.res = res;
		this.name = name;
		this.t = new Thread( this, name );
		this.t.start();
	}

	public Thread getThread() {
		return t;
	}

	@Override
	public void run() {

		for( int i = 1; i < 5; i++ ) {
			System.out.println( Thread.currentThread().getName() + " " + i );
			// Thread.sleep( 1000 );
			System.out.println( this.res.getNum() );
		}

	}

}
