package clock;

public class ClockTest {
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
		
		int rdsec = (int)(Math.random()*500);
		int rdmin = (int)(Math.random()*500);
		int rdhour = (int)(Math.random()*500);
		
		int nsec = 0;
		int nmin = 0;
		int nhour = 0;
		int nday = 0;
		
		
		if (rdsec % 60 != 0) { //sec 랜덤을 minute으로 넘기고 나머지sec 그대로
			nmin = rdsec / 60;
			nsec = rdsec % 60;
		} else if (rdsec % 60 == 0) {
			nmin = rdsec / 60;
		}
		
		
	
		if (rdmin % 60 != 0) {//min 랜덤을 hour으로 넘기고 나머지min 그대로
			nhour = rdmin / 60;
			nmin = rdmin % 60;
		} else if (rdmin % 60 == 0) {
			nhour = rdmin / 60;
		}
		
		
		if (rdhour % 24 != 0) { //hour 랜덤을 day으로 넘기고 나머지hour 그대로
			nday = rdhour / 24;
			rdhour = rdhour % 24;
		} else if (rdhour % 24 == 0) {
			nday = rdhour / 24;
		}
		
		System.out.println(nday + "일째 " + nhour + "시간 " + nmin + "분 " + nsec + "초");
		
//		String nowday = check.getDay() + "일째, ";
//		String nowtime = "현재 시각은" + check.getHour() + "시" + check.getMinute() + "분 입니다.";
//		System.out.println(nowtime);
		

	}

}
