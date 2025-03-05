public class SetClock {
	// Sets the clocks hour, minutes, seconds and state.
	public int hour;
	public int minutes;
	public int seconds;
	public static String state;
	
	// The constructor for the clock class.
	public SetClock(int hour, int minutes, int seconds, String state) {
		this.hour = hour;
		this.minutes = minutes;
		this.seconds = seconds;
		this.state = state;
	}
	
	// The getter methods for getting the time and state.
	public int getHour() {
		return hour;
	}
	
	public int getMinutes() {
		return minutes;
	}
	
	public int getSeconds() {
		return seconds;
	}
	
	public String getState() {
		return state;
	}
	
	// Gets timezone of the user
	public int getTimezone(SetUTF utfData) {
		return utfData.getUTF().getOrDefault(state, -1);
	}
	
	public static void main(String[] args) {
		SetClock clock = new SetClock(10, 30, 45, state);
		SetUTF setUtf = new SetUTF();
		
		System.out.println("Current Time: " + clock.getHour() + ":" + clock.getMinutes() + ":" + clock.getSeconds());
		System.out.println("Timezone of:" + clock.getState() + ": UTF-" + clock.getTimezone(setUtf));
	}
}
