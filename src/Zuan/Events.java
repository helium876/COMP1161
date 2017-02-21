package Zuan;

import java.util.Random;
import java.util.Scanner;

public class Events {
	
	private String name, description, start_date, end_date, start_time, end_time, location;
	private EventType type; 
	private int attendance;
	private int ref_num;
	private String status; 
	
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getRef_num() {
		return ref_num;
	}

	public void setRef_num(int ref_num) {
		this.ref_num = ref_num;
	}

	public int getAttendance() {
		return attendance;
	}

	public void setAttendance(int attendance) {
		this.attendance = attendance;
	}

	public Events(){
		
	}
	
	public Events(String name, String description,String start_date,String end_date,String start_time,String end_time,String location, int attendance, int ref_num, String status){
		this.name = name;
		this.setDescription(description); 
		this.setStart_date(start_date); 
		this.setEnd_date(end_date); 
		this.setStart_time(start_time); 
		this.setEnd_time(end_time);
		this.setLocation(location); 
		this.setAttendance(attendance);
		this.setRef_num(ref_num); 
		this.setStatus(status);
		
	}
	
	
	public EventType getType() {
		return type;
	}

	public void setType(EventType type) {
		this.type = type;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getEnd_time() {
		return end_time; 
	}

	public void setEnd_time(String end_time) {
		this.end_time = end_time;
	}

	public String getStart_time() {
		return start_time;
	}

	public void setStart_time(String start_time) {
		this.start_time = start_time;
	}

	public String getEnd_date() {
		return end_date;
	}

	public void setEnd_date(String end_date) {
		this.end_date = end_date;
	}

	public String getStart_date() {
		return start_date;
	}

	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	public static int getRand(){
		Random rd = new Random();
		return 1001 + rd.nextInt((9999 - 1001) + 1);
	}

	

	
	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		String Tmp_name, Tmp_description, Tmp_start_date, Tmp_end_date, Tmp_start_time, Tmp_end_time, Tmp_location, Tmp_Status;
		int Tmp_attendance = 0, Tmp_ref_num = 0; 
		EventType Tmp_type; 
		Scanner in = new Scanner(System.in); 
		Events[] evt = new Events[3];
		for(int i = 0; i < evt.length; i++){
			System.out.println("Enter Event Name");
			Tmp_name =  in.next();
			System.out.println("Enter Description");
			Tmp_description =  in.next();
			System.out.println("Enter Start Date");
			Tmp_start_date =  in.next();
			System.out.println("Enter End Date");
			Tmp_end_date =  in.next();
			System.out.println("Enter Start Time");
			Tmp_start_time =  in.next();
			System.out.println("Enter End Time");
			Tmp_end_time =  in.next();
			System.out.println("Enter Event Location");
			Tmp_location = in.next();
			System.out.println("Enter Expected Attendance");
			Tmp_attendance = in.nextInt();
			System.out.println("Enter Expected Attendance");
			Tmp_attendance = in.nextInt();
			Tmp_ref_num = getRand(); 
			System.out.println("Enter Event Status[Applied, Approved, Rejected]");
			Tmp_Status = in.next();
			evt[i] = new Events(Tmp_name, Tmp_description, Tmp_start_date, Tmp_end_date, Tmp_start_time, Tmp_end_time, Tmp_location, Tmp_attendance, Tmp_ref_num, Tmp_Status);
			System.out.println("EVENT CREATED, REF NUMBER: "  + Tmp_ref_num);
			
			
			
		}
		

	}


}
