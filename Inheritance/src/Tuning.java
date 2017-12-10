/**
 * 	@author Tim Harrold
 *	Interface for guitar tuning, to be implemented into general guitar types, subjective to each guitar's tuning capability.
 */
public interface Tuning {

	public String getTuning();
	public void tuneTo(String tuning);
}
