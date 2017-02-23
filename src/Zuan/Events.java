package Zuan;



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
	
	public Events(String name, String description,String start_date,String end_date,String start_time,String end_time,String location, int attendance, int ref_num, String status, EventType type){
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
		this.setType(type);
		
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
}
