import java.util.*;
import javax.swing.*;
	 class Student{	
			int id,age;	
			String fatherName,name;
			public void setid(int id)
			{
				this.id= id;

			}
			public void setage(int age)
			{
				this.age= age;

			}
			public void setname(String name)
			{
				this.name= name;

			}
			public void setfatherName(String fatherName)
			{
				this.fatherName= fatherName;

			}
			public int getid()
			{
			return id;
			}
			public int getage()
			{
			return age;
			}
			public String getname()
			{
			return name;
			}
			public String getfatherName()
			{
			return fatherName;
			}
			}	
		
	class StudentDetails{	
			int idd=1;
			ArrayList<Student> alist = new ArrayList<Student>();
			Scanner sc = new Scanner(System.in);
			public  void addStudentDetails(){
						Student s = new Student();
						String name=null;
						s.setid(idd);	
						System.out.println("enter student details");
						System.out.println("enter student name");
						if(sc.hasNextLine()){
						name=sc.nextLine();
						}
						s.setname(name);
						System.out.println("enter father name");
						String fatherName=sc.nextLine();	
						s.setfatherName(fatherName);
						System.out.println("enter student Age");
						int age=0;
						if(sc.hasNextInt()) {
						 age=sc.nextInt();
						}
						sc.nextLine();
						s.setage(age);

						alist.add(s);
						idd++;
			}
			public  void display(){	
						int choice=0;
						System.out.println("enter 1 seching result through id");
						System.out.println("enter 2 dispaly all ");
						if(sc.hasNextInt()) {
						choice= sc.nextInt();
						}
						sc.nextLine();
						if(choice==1 || choice==2){
						
						switch (choice)
						{
							case 1: 
								System.out.println("enter student id");
								int idnumber = sc.nextInt();
								sc.nextLine();
								for(int i=0; i<alist.size(); i++){
				
								if(idnumber==alist.get(i).getid()){
								
								System.out.print(alist.get(i).getid()+"\t");
								System.out.print(alist.get(i).getname()+"\t");
						
								System.out.print(alist.get(i).getfatherName()+"\t");
								System.out.print(alist.get(i).getage()+"\t");
								System.out.println();	
								
								//System.out.println(i);
								}}
								break;
							case 2:							
								for(Student s : alist){
								System.out.print(s.getid()+"\t");
								System.out.print(s.getname()+"\t");
						
								System.out.print(s.getfatherName()+"\t");
								System.out.print(s.getage()+"\t");
								System.out.println();	
						}
						 }
						

						}
						else{
							System.out.println("please enter valid number");
							display();
						}
						}	
						
			public void nameUpdate(){
						Student s = new Student();
						for(int i=0; i<alist.size(); i++){
						System.out.println("enter student name for update");
							String name=sc.nextLine();
							String fatherName=alist.get(i).getfatherName();
							int age=alist.get(i).getage();
							int id=alist.get(i).getid();
							s.setname(name);
							s.setfatherName(fatherName);
							s.setage(age);
							s.setid(id);
							alist.set(i,s);	
						}}
			public void fatherNameUpdate(){
						Student s = new Student();
						for(int i=0; i<alist.size(); i++){
						System.out.println("enter father name for update");
							String fatherName=sc.nextLine();
							String name=alist.get(i).getname();
							int age=alist.get(i).getage();
							int id=alist.get(i).getid();
							s.setfatherName(fatherName);
							s.setname(name);
							s.setage(age);
							s.setid(id);
							alist.set(i,s);	
						}}
			public void ageUpdate(){
						int age=0;
						Student s = new Student();
						for(int i=0; i<alist.size(); i++){
						System.out.println("enter age for update");
							if(sc.hasNextInt()) {
							age=sc.nextInt();
							}
							sc.nextLine();
							String name=alist.get(i).getname();
							String fatherName=alist.get(i).getfatherName();
							int id=alist.get(i).getid();
							s.setage(age);
							s.setname(name);
							s.setfatherName(fatherName);
							s.setid(id);
							alist.set(i,s);	
						}}
		
			public void update(){
						int choice=0,idnumber=0;
						Student s = new Student();
						System.out.println("enter id for update");
						if(sc.hasNextInt()) {
						idnumber=sc.nextInt();
						}
						int n= alist.size();
						for(int i=0; i<n; i++){
						if(idnumber==alist.get(i).getid()){
						s.setid(idnumber);
						sc.nextLine();
						System.out.println("enter 1 for update name");
						System.out.println("enter 2 for update father name");
						System.out.println("enter 3 for update age");
						System.out.println("enter 4 for update all");
						if(sc.hasNextInt()) {
						choice= sc.nextInt();
						}
						sc.nextLine();
						switch(choice){
						case 1:
							nameUpdate();
							/*System.out.println("enter student name for update");
							String name=sc.nextLine();
							String fatherName=alist.get(i).getfatherName();
							int age=alist.get(i).getage();
							s.setname(name);
							s.setfatherName(fatherName);
							s.setage(age);
							alist.set(i,s);
							//System.out.println("1");*/
							break;
						case 2:
							fatherNameUpdate();
							break;
						case 3: 
							ageUpdate();
							break;
						case 4: 
						System.out.println("1");	
						System.out.println("enter student name for update");
						String name=sc.nextLine();
					
						s.setname(name);
						System.out.println("enter father name for update");
						String fatherName=sc.nextLine();
						s.setfatherName(fatherName);
						System.out.println("enter age for update");
						int age=0;
						if(sc.hasNextInt()) { age=sc.nextInt();
						}
						s.setage(age);
						alist.set(i,s);
						break;
						//System.out.println("validate");
						}
						/*else(idnumber!=alist.get(i).getid())
						{
							System.out.println("please enter vaild details");
						}*/
						}}
						
						}
				public void delete()
						{
						System.out.println("enter id for delete");
						int idnumber=sc.nextInt();
						int n= alist.size();
						for(int i=0; i<n; i++){
						if(idnumber==alist.get(i).getid()){
						alist.remove(i);
						}
						else{
							System.out.print("please enter vaild id");
						}
						}
						}
			public void swit()	
						{
				int choice=0;
				
				//while((choice>0)||(choice<6)){
				//if(choice==5)break;
				System.out.println("enter your choice");
				System.out.println("press 1:- for insert details");
				System.out.println("press 2:- for display details");
				System.out.println("press 3:- for update details");
				System.out.println("press 4:- for delete details");
				System.out.println("press 5:- for exit");
				System.out.println();
				System.out.print("your choice is:-   ");
				if(sc.hasNextInt()) {
					choice=sc.nextInt();
				}
				sc.nextLine();
				if(choice==1 || choice==2 || choice==3|| choice==4 ){
				

				switch (choice)
				
				{
					case 1:
						
						this.addStudentDetails();
						this.swit();
					break;
					case 2:
						this.display();
						this.swit();
					break;
					case 3:
						update();
						this.swit();
						//System.out.println("update");
					break;
					case 4:
						delete();
						this.swit();
					break;
					

					/*case 5:
						
						//System.out.println("exit");
					break;*/
 	
				//}
				}}
				else if(choice==5)
					{
					System.out.println("you press exit");}
				else{
					System.out.println("number not valid");	
					swit();
				}}}

			class StudentManagement extends StudentDetails
			{			

			public static void main(String args[])
			{

				StudentDetails sd = new StudentDetails();
				sd.swit();		


			}
		}



