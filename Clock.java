package clock;

public class Clock {
	private String name;
	private int second;
	private int minute;
	private int hour;
	private int day;
	private int year;
	
	//getter
	String getName() {return this.name;}
	int getSecond() {return this.second;}
	int getMinute() {return this.minute;}
	int getHour() {return this.hour;}
	int getDay() {return this.day;}
	int getYear() {return this.year;}
	
	//setter
	void setName(String name) {this.name = name;}
	void setSecond(int second) {this.second = second;}
	void setMinute(int minute) {this.minute = minute;}
	void setHour(int hour) {this.hour = hour;}
	void setDay(int day) {this.day =day;}
	void setYear(int year) {this.year = year;}
	
	
	public int sectomin(int second) {
		for (int i = 0; i <= second ; i++) {
			if (second % 60 != 0) { // ���� ���ڸ� 60���� ������  ���� hour��,
				//�������� minute����
				minute = second / 60;
				second = second % 60;
			} else if (second % 60 == 0) {
				minute = second / 60;
			}
		}
		return hour;
	}
	
	
	
	public int mintohour(int minute) {
		for (int i = 0; i <= minute ; i++) {
			if (minute % 60 != 0) { // ���� ���ڸ� 60���� ������  ���� hour��,
				//�������� minute����
				hour = minute / 60;
				minute = minute % 60;
			} else if (minute % 60 == 0) {
				hour = minute / 60;
			}
			
		}
		return hour; // minute�� ���ΰ���? �׸��� �����ؾ� �Ǵµ�??
		//main���� �ϴ� ���� ��������? 
	}
		
	
	public int hourtoday(int hour) {
		for (int i = 0; i <= hour ; i++) {
			if (hour % 24 != 0) { // ���� ���ڸ� 60���� ������  ���� hour��,
				//�������� minute���� 
				day = hour / 24;
				hour = hour % 24;
			} else if (hour % 24 == 0) {
				day = hour / 24;
			}
		}
		return day;
	}
	
	
	
}
