package clock;

public class ClockTest3 {
//	private String name;
//	private int second;
//	private int minute;
//	private int hour;
//	private int day;
	
			// second = 60�� �Ǹ� minute���� 1�� �Ѿ
			// minute�� 60�� �Ǹ� hour�� 1�� �Ѿ
			// hour�� 24�� �Ǹ� day�� 1�� �Ѿ
			// day�� 365�� �Ǹ� year�� 1�� �Ѿ	
	
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
		
	
		
		if (rdsec % 60 != 0) { //sec ������ minute���� �ѱ�� ������sec �״��
			check.setMinute(rdsec/60); //min���� �Ѿ�� ��
			check.setSecond(rdsec % 60);
		} else if (rdsec % 60 == 0) {
			check.setMinute(rdsec/60); //min���� �Ѿ�� ��
		}
		
		
		if (rdmin % 60 != 0) {//min ������ hour���� �ѱ�� ������min �״��
			check.setHour(rdmin / 60); // hour�� �Ѿ�� ��
			check.setMinute(check.getMinute() + (rdmin % 60)); //min�� ���� ��.(���� min�̶� �������� ��)
		} else if (rdmin % 60 == 0) {
			check.setHour(rdmin / 60); // hour�� �Ѿ�� ��
		}
		
		
		if (rdhour % 24 != 0) { //hour ������ day���� �ѱ�� ������hour �״��
			check.setDay(rdhour / 24);
			check.setHour(check.getHour() + (rdhour % 24));
		} else if (rdhour % 24 == 0) {
			check.setDay(rdhour / 24);
		}
		
		System.out.println(rdhour + "�ð� " + rdmin + "�� " + rdsec+ "��");
		String nowtime = check.getDay() + "��° " + check.getHour() + "�ð� " + check.getMinute() + "�� " + check.getSecond() + "��";
		System.out.println(nowtime);
		

	}

}
