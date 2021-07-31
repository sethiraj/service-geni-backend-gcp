/**
 * This is a Model For Respective Garage's Service Offerings.
 */
package com.mahelinc.servicegenie.model;


import org.springframework.validation.annotation.Validated;

/**
 * @author surendrane
 *
 */
@Validated
public class GarageServices {

	/** The general service. */
	private boolean gsAndOil;
	
	/** The paint booth. */
	private boolean pbAndT;
	
	/** The car wash. */
	private boolean carWash;
	
	/** The oil change. */
	private boolean acAndCL;
	
	/** The ac service. */
	private boolean wAndS;
	
	/** The alloy for wheels. */
	private boolean engAndEcu;
	
	/** The dent and damages. */
	private boolean acc;

	/**
	 * Checks if is gs and oil.
	 *
	 * @return true, if is gs and oil
	 */
	public boolean isGsAndOil() {
		return gsAndOil;
	}

	/**
	 * Sets the gs and oil.
	 *
	 * @param gsAndOil the new gs and oil
	 */
	public void setGsAndOil(boolean gsAndOil) {
		this.gsAndOil = gsAndOil;
	}

	/**
	 * Checks if is pb and T.
	 *
	 * @return true, if is pb and T
	 */
	public boolean isPbAndT() {
		return pbAndT;
	}

	/**
	 * Sets the pb and T.
	 *
	 * @param pbAndT the new pb and T
	 */
	public void setPbAndT(boolean pbAndT) {
		this.pbAndT = pbAndT;
	}

	/**
	 * Checks if is car wash.
	 *
	 * @return true, if is car wash
	 */
	public boolean isCarWash() {
		return carWash;
	}

	/**
	 * Sets the car wash.
	 *
	 * @param carWash the new car wash
	 */
	public void setCarWash(boolean carWash) {
		this.carWash = carWash;
	}

	/**
	 * Checks if is ac and CL.
	 *
	 * @return true, if is ac and CL
	 */
	public boolean isAcAndCL() {
		return acAndCL;
	}

	/**
	 * Sets the ac and CL.
	 *
	 * @param acAndCL the new ac and CL
	 */
	public void setAcAndCL(boolean acAndCL) {
		this.acAndCL = acAndCL;
	}

	/**
	 * Checks if is w and S.
	 *
	 * @return true, if is w and S
	 */
	public boolean iswAndS() {
		return wAndS;
	}

	/**
	 * Sets the w and S.
	 *
	 * @param wAndS the new w and S
	 */
	public void setwAndS(boolean wAndS) {
		this.wAndS = wAndS;
	}

	/**
	 * Checks if is eng and ecu.
	 *
	 * @return true, if is eng and ecu
	 */
	public boolean isEngAndEcu() {
		return engAndEcu;
	}

	/**
	 * Sets the eng and ecu.
	 *
	 * @param engAndEcu the new eng and ecu
	 */
	public void setEngAndEcu(boolean engAndEcu) {
		this.engAndEcu = engAndEcu;
	}

	/**
	 * Checks if is acc.
	 *
	 * @return true, if is acc
	 */
	public boolean isAcc() {
		return acc;
	}

	/**
	 * Sets the acc.
	 *
	 * @param acc the new acc
	 */
	public void setAcc(boolean acc) {
		this.acc = acc;
	}
}
