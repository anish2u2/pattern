package org.pattern.design.impl.signal;

import org.pattern.design.contracts.signal.Signal;

public class SignalFactory implements org.pattern.design.contracts.signal.Signal {

	private Boolean signal = false;

	private SignalFactory() {

	}

	public static Signal getSignalInstance() {
		return new SignalFactory();
	}

	@Override
	public synchronized void on() {
		signal = true;
	}

	@Override
	public synchronized void off() {
		signal = false;
	}

	@Override
	public boolean getSignal() {
		return this.signal;
	}

}
