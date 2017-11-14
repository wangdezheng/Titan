package db.mysql;

public class Test {
	public static void main(String[] args) {
		java.util.Date date=new java.util.Date();
		long l=date.getTime();
		java.sql.Timestamp sqlDate=new java.sql.Timestamp(l);
		System.out.println(sqlDate);
		date = sqlDate;
		System.out.println(date);
		
	}
}
