package lesson2;

import java.util.Scanner;

public  class Browser extends User {
	  Browser(){}
      Browser(String name, String password,String role)
	  {
    	    super(name,password,role);
		    setName(name);
		    setPassword(password);	
		    setRole(role);
	 } 
	  public boolean showSelfInfo ()
	  {
		     System.out.println(getName()+" "+getPassword()+" "+getRole());
		     return true;
	  }
	  public boolean updateself( ){
			String Password;
			String Name;
			Scanner scan=new Scanner(System.in);
			System.out.println("�����û���");
			Name=scan.nextLine().trim();
			System.out.println("��������");
			Password=scan.nextLine().trim();
		   DateProcessing.updateself(Name,Password);
		   DateProcessing.writeUser();///////////////////////
		return true;
		  
		  
	  }
      public  void showMenu()
		 
	   {
		     System.out.println("............\n\t"+"1.��ѯ������Ϣ\n\t"+"2.�޸ĸ�����Ϣ\n\t"+"3.���ص���\n\t"+"4.��������˵���Ϣ\n\t"+"5.�������\n\t"+"0.�˳�\n\t")	;	
          String input=null;
		  Scanner scan=new Scanner(System.in);{
		  while(true){
		     input=scan.nextLine().trim();
		     if((input).matches("0|1|2|3|4|5"))
			 {
                int nextInt=Integer.parseInt(input);//�ַ�ת��Ϊ����
				switch(nextInt)
				{
				case 0:
					System.out.println("exit");
					return ;
				case 1:
					 if(showSelfInfo())
					 { System.out.println("��ѯ�ɹ�");
					}//////
					 else 
				     System.out.println("��ѯʧ��");
				break;
				
				case 2:
					updateself();
					
				 break;
				case 3:
					//String ID=scan.nextLine().trim();
				//	if(downloadFile(ID))
					//System.out.	println("���سɹ�");
					//else
					//System.out.println("����ʧ��");
					DateProcessing.updownload();
				 break;
				case 4:
					if(  DateProcessing.listUser())
					 System.out.println("�б�ɹ�");
					 else
					 System.out.println("�б�ʧ��");
				 break;
				
				case 5:
					if(DateProcessing.FileList())
				  System.out.println("��ѯ�����ɹ�");
					else
						System.out.println("��ѯ����ʧ��");
				}
				
				
			}
			else 
			{
					System.out.println("�����������������");
					
			}
		     System.out.println("............\n\t"+"1.��ѯ������Ϣ\n\t"+"2.�޸ĸ�����Ϣ\n\t"+"3.���ص���\n\t"+"4.��������˵���Ϣ\n\t"+"5.�������\n\t"+"0.�˳�\n\t")	;
				
		  }
		  
		  }   
	   }
}
