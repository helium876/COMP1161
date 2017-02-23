package Zuan;

import java.util.Random;
import java.util.Scanner;

public class MainMethod {
	
	public static void menu(){
		System.out.println("1: Add Event Type");
		System.out.println("2: Edit Event Type");
		System.out.println("3: Add Event");
		System.out.println("4: View Events");
		System.out.println("5: Exit");
	}
	
	public static int getRand(){
		Random rd = new Random();
		return 1001 + rd.nextInt((9999 - 1001) + 1);
	}
	
	public static void main(String[] args){
		String Tmp_name, Tmp_description, Tmp_start_date, Tmp_end_date, Tmp_start_time, Tmp_end_time, Tmp_location, Tmp_Status;
		int Tmp_attendance = 0;
		int Tmp_ref_num = 0; 
		EventType[] Tmp_type = new EventType[5]; 
		String Tmpcode, TmpETDesc;
		float tmpFee; 
		Scanner in = new Scanner(System.in); 
		Events[] evt = new Events[10];
		int option = 0; 
		int Ecount = -1;
		int ETcount = -1;
		int c = -1; 
		int p = -1;
		
		
		while(option != 5){
			menu();
			option = in.nextInt();
			switch(option){
				case 1: //Create Event Type
					ETcount++;
					System.out.println("Enter Unique Event Code");
					Tmpcode = in.next();
					System.out.println("Enter Description of Event Type: "); 
					TmpETDesc = in.nextLine();
					in.nextLine();
					System.out.print("Enter Stardard Fee: $");
					tmpFee = in.nextFloat();
					Tmp_type[ETcount] = new EventType(Tmpcode, TmpETDesc, tmpFee);
					System.out.println(Tmpcode + " has been Added");
					c++;
					
					break;
					
				case 2: //List And Edit
					try{
						for(int y=0; y <= c; y++){
							System.out.println("Event Types");
							System.out.println(y + ": " + Tmp_type[y].getCode());
						}
						System.out.println("Select Event Type to Edit");
						int edit = in.nextInt();
						
						System.out.println("Enter Unique Event Code");
						Tmp_type[edit].setCode(in.next());
						System.out.println("Enter Description of Event Type"); 
						Tmp_type[edit].setDescription(in.nextLine());
						in.nextLine();
						System.out.print("Enter Stardard Fee: $");
						Tmp_type[edit].setFee(in.nextFloat());
						System.out.println(Tmp_type[edit].getCode() + " has been Updated");
						
					}
					catch(Exception E){
						System.out.println(E);
					}
					
					break;
					
				case 3: //Add Events
					Ecount++;
					in.nextLine();
					System.out.println("Enter Event Name");
					Tmp_name =  in.nextLine();
					//in.nextLine();
					System.out.println("Enter Description");
					Tmp_description =  in.nextLine();
					//in.nextLine();
					System.out.println("Enter Start Date");
					Tmp_start_date =  in.nextLine();
					//in.nextLine();
					System.out.println("Enter End Date");
					Tmp_end_date =  in.nextLine();
					//in.nextLine();
					System.out.println("Enter Start Time");
					Tmp_start_time =  in.nextLine();
					//in.nextLine();
					System.out.println("Enter End Time");
					Tmp_end_time =  in.nextLine();
					//in.nextLine();
					System.out.println("Enter Event Location");
					Tmp_location = in.nextLine();
					//in.nextLine();
					System.out.println("Enter Expected Attendance");
					Tmp_attendance = in.nextInt();
					Tmp_ref_num = getRand(); 
					System.out.println("Enter Event Status[Applied, Approved, Rejected]");
					Tmp_Status = in.nextLine();
					in.nextLine();
					System.out.println("Select Event Type");
					for(int y=0; y <= c; y++){
						System.out.println(y + ": " + Tmp_type[y].getCode());
					}
					int eTypei = in.nextInt();
					evt[Ecount] = new Events(Tmp_name, Tmp_description, Tmp_start_date, Tmp_end_date, Tmp_start_time, Tmp_end_time, Tmp_location, Tmp_attendance, Tmp_ref_num, Tmp_Status,Tmp_type[eTypei]);
					System.out.println("EVENT CREATED, REF NUMBER: "  + Tmp_ref_num);
					p++;
					break;
					
				case 4: //View Events
					try{
						for(int x=0; x <= p; x++){

							System.out.println("Name: " + evt[x].getName());
							System.out.println("Description: "+evt[x].getDescription());
							System.out.println("From: "+evt[x].getStart_date() + " To: " + evt[x].getEnd_date());
							System.out.println("Time: "+evt[x].getStart_time() + " To: " + evt[x].getEnd_time());
							System.out.println("Location: " + evt[x].getLocation());
							System.out.println("*******************************************************************\n\n");
						}
					}
					catch(NullPointerException E){
						
					}
					break;

				default:
					System.out.println("INVALID OPTION");
					break;
			}
		}
		in.close();
	}

}
