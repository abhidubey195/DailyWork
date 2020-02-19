package cts;

public class Qw {

	public static void main(String[] args)
	{
		Teacher t = new Teacher();
		t.does();
		
		student p=new student();
		p.does();
		
		Teacher parent = new student();
		parent.does();
	}
}
