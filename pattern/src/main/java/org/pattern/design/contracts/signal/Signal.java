package org.pattern.design.contracts.signal;

/**
 * This interface introduce signal design.
 * 
 * @author Anish Singh
 *
 */
public interface Signal {

	/**
	 * This method will set the signal as true means on.
	 */
	public void on();

	/**
	 * This method will set the signal as false means off.
	 */
	public void off();

	/**
	 * This method will return the signal
	 * 
	 * @return
	 */
	public boolean getSignal();

}
