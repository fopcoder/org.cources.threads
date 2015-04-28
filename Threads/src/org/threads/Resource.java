package org.threads;

public class Resource {
	private int num = 0;
	private boolean isSet = false;

	synchronized public int getNum() {
		try {
			while( !this.isSet )
				wait();
		}
		catch( InterruptedException e ) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		this.isSet = false;
		System.out.println( "number " + this.num + " get" );
		notify();
		return this.num;
	}

	synchronized public void setNum( int num ) {
		try {
			while( this.isSet )
				wait();
		}
		catch( InterruptedException e ) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		this.num = num;
		this.isSet = true;
		System.out.println( "number " + this.num + " set" );
		notify();
	}

	public boolean isSet() {
		return isSet;
	}

	public void setSet( boolean isSet ) {
		this.isSet = isSet;
	}

}
