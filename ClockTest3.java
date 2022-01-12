package clock;

public class ClockTest3 {
//	private String name;
//	private int second;
//	private int minute;
//	private int hour;
//	private int day;
	
			// second = 60이 되면 minute으로 1이 넘어감
			// minute이 60이 되면 hour로 1이 넘어감
			// hour이 24가 되면 day가 1이 넘어감
			// day가 365가 되면 year가 1이 넘어감	
	
//	check.sectomin(rdsec);
//	check.mintohour(rdmin);
//	check.hourtoday(rdhour);
	

	public static void main(String[] args) {
		Clock check = new Clock();
		
//		int seond = check.setSecond(0);
		
		check.setSecond((int)(Math.random()*500));
		check.setMinute((int)(Math.random()*500));
		check.setHour((int)(Math.random()*500));
		
		int rdsec = check.getSecond();
		int rdmin = check.getMinute();
		int rdhour = check.getHour();
		
		int nsec = 0;
		int nmin = 0;
		int nhour = 0;
		int nday = 0;
		
	
		
		if (rdsec % 60 != 0) { //sec 랜덤을 minute으로 넘기고 나머지sec 그대로
			check.setMinute(rdsec/60); //min으로 넘어가는 것
			check.setSecond(rdsec % 60);
		} else if (rdsec % 60 == 0) {
			check.setMinute(rdsec/60); //min으로 넘어가는 것
		}
		
		
		if (rdmin % 60 != 0) {//min 랜덤을 hour으로 넘기고 나머지min 그대로
			check.setHour(rdmin / 60); // hour로 넘어가는 것
			check.setMinute(check.getMinute() + (rdmin % 60)); //min에 남는 것.(기존 min이랑 합쳐져야 함)
		} else if (rdmin % 60 == 0) {
			check.setHour(rdmin / 60); // hour로 넘어가는 것
		}
		
		
		if (rdhour % 24 != 0) { //hour 랜덤을 day으로 넘기고 나머지hour 그대로
			check.setDay(rdhour / 24);
			check.setHour(check.getHour() + (rdhour % 24));
		} else if (rdhour % 24 == 0) {
			check.setDay(rdhour / 24);
		}
		
		System.out.println(rdhour + "시간 " + rdmin + "분 " + rdsec+ "초");
		String nowtime = check.getDay() + "일째 " + check.getHour() + "시간 " + check.getMinute() + "분 " + check.getSecond() + "초";
		System.out.println(nowtime);
		

	}

}
