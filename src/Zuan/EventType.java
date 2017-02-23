package Zuan;

public class EventType {

	private String code;
	private String description;
	private float fee; 
	
	public EventType(){
		
	}
	
	public EventType(String code, String description, float fee){
		this.setCode(code);
		this.setDescription(description);
		this.setFee(fee);
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public float getFee() {
		return fee;
	}

	public void setFee(float fee) {
		this.fee = fee;
	}
	
	

}
