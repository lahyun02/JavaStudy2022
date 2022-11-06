package chapter00;

class TV {
	private int channel;
	private int volume;
	private boolean onOff;
	
	public TV() {}

	public TV(int channel, int volume, boolean onOff) {
		this.channel = channel;
		this.volume = volume;
		this.onOff = onOff;
	}

	@Override
	public String toString() {
		return "TV [channel=" + channel + ", volume=" + volume + ", onOff=" + onOff + "]";
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public boolean isOnOff() {
		return onOff;
	}

	public void setOnOff(boolean onOff) {
		this.onOff = onOff;
	}
}

class ColorTV extends TV {
	private String color;
	
	ColorTV(String color, int channel, int volume, boolean onOff) {
		super(channel, volume, onOff);
		this.color = color;
	}
	
	@Override
	public String toString() {
		return "ColorTV [channel=" + getChannel() + ", volume=" + getVolume() + ", onOff=" + isOnOff() + "]";
	}
	
}

public class Ex01 {

	public static void main(String[] args) {
		TV tv = new TV(5, 7, true);
		System.out.println(tv); 
		System.out.println(tv.toString()); 
	}

}
