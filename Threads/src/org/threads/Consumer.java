package org.threads;

public class Consumer implements Runnable {
	private Thread t;
	private Resource res;
	private String name;

	public Consumer( Resource res, String name ) {
		this.res = res;
		this.name = name;

		this.t = new Thread( this, this.name );
		this.t.start();
	}

	public Thread getThread() {
		return t;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for( int i = 0; i < 100; i += 10 ) {
			// System.out.println( this.res.getNum() );
			this.res.getNum();
		}

	}

}
