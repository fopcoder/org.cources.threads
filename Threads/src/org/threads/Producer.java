package org.threads;

public class Producer implements Runnable {
	private Thread t;
	private Resource res;
	private String name;

	public Producer( Resource res, String name ) {
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
		for( int i = 0; i < 100; i += 10 ) {
			this.res.setNum( i );
		}
		this.t.interrupt();
	}

}
