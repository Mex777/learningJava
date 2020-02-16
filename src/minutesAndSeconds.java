
public class minutesAndSeconds {
	public static void main(String[] args) {
		System.out.println(getDurationString(80, 40));
		System.out.println(getDurationString(3800));
	}
	public static String getDurationString(int minutes, int seconds) {
		if (minutes < 0 || seconds < 0 || seconds >= 60)
			return "Invalid value";
		else { int XX=0, YY, ZZ = seconds;
			while (minutes>59) {
				XX++;
				minutes -= 60;
			}
			YY = minutes;
			String value = "" + XX +"h " + YY + "m " + ZZ + "s ";
			return value;
		}
	} 
	public static String getDurationString(int seconds) {
		if (seconds < 0)
			return "Invalid value";
		else { int minutes = 0;
			while (seconds >= 60) {
				minutes++;
				seconds -= 60;
			}
			return getDurationString(minutes, seconds);
		}
	}
}