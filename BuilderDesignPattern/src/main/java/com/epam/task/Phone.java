package com.epam.task;
public class Phone {
	private String OS;
	private int ram;
	private String processor;
	private double screensize;
	private int battery;

	public Phone(String oS, int ram, String processor, double screensize, int battery) {
		super();
		OS = oS;
		this.ram = ram;
		this.processor = processor;
		this.screensize = screensize;
		this.battery = battery;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Phone [OS=" + OS + ", ram=" + ram + ", processor=" + processor + ", screensize=" + screensize
				+ ", battery=" + battery + "]";
	}
	
}
