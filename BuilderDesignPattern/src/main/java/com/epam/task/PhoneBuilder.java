package com.epam.task;

public class PhoneBuilder {
	private String OS;
	private int ram;
	private String processor;
	private double screensize;
	private int battery;
	/**
	 * @return the oS
	 */
	public String getOS() {
		return OS;
	}
	/**
	 * @param oS the oS to set
	 */
	public PhoneBuilder setOS(String oS) {
		OS = oS;
		return this;
	}
	/**
	 * @return the ram
	 */
	public int getRam() {
		return ram;
	}
	/**
	 * @param ram the ram to set
	 */
	public PhoneBuilder setRam(int ram) {
		this.ram = ram;
		return this;
	}
	/**
	 * @return the processor
	 */
	public String getProcessor() {
		return processor;
	}
	/**
	 * @param processor the processor to set
	 */
	public PhoneBuilder setProcessor(String processor) {
		this.processor = processor;
		return this;
	}
	/**
	 * @return the screensize
	 */
	public double getScreensize() {
		return screensize;
	}
	/**
	 * @param screensize the screensize to set
	 */
	public PhoneBuilder setScreensize(double screensize) {
		this.screensize = screensize;
		return this;
	}
	/**
	 * @return the battery
	 */
	public int getBattery() {
		return battery;
	}
	/**
	 * @param battery the battery to set
	 */
	public PhoneBuilder setBattery(int battery) {
		this.battery = battery;
		return this;
	}
	public Phone getPhone(){
		return new Phone(OS, ram, processor, screensize, battery);
	}

}
