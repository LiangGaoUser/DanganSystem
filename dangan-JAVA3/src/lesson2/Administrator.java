package lesson2;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Scanner;

public class Administrator extends User {

	Administrator (String name,String password,String role){
		super(name,password,role);
		setName(name);
		setPassword(password);
		setRole(role);
		
	}
	public boolean  addUser( ){
		System.out.println("�����û�")	;
		String Name;
		String Password;
		String Role;
		Scanner scan=new Scanner(System.in);
		System.out.println("�����û���");
			Name=scan.nextLine().trim();
			System.out.println("��������");
		Password=scan.nextLine().trim();
		System.out.println("�����ɫ");
		Role=scan.nextLine().trim();
		try{
		DateProcessing.insert(Name, Password, Role);
		}
		catch (DataException e){
			System.out.println("�����ɫ��������������");
		}
		DateProcessing.writeUser();/////////////////////////////////////
		
		return true;
	}
	public boolean deluser(String name) {
		
		System.out.println("ɾ���û�")	;
		String Name;
		
		System.out.println("�����û���");
		Scanner scan=new Scanner(System.in);
		Name=scan.nextLine().trim();
		
		DateProcessing.delete(Name);//////
		try {
			DateProcessing.writeUser();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}///////////////////////////
		return true;
	}
	public void changeUserRole( ){
		
		
		String tip_menu=" ��ѡ�����";
		//String tip_exit="ϵͳ�˳� ";
		String infos="....................\n\t"+"1.�ı��û���ɫ\n\t"+"2.�ı��û�����\n\t"+"0.����";
		
		System.out.println(infos);
		System.out.println(tip_menu);
		String input=null;
		Scanner scan=new Scanner(System.in);
		while(true){
			input=scan.nextLine().trim();
			if((input).matches("0|1|2"))
			{
int nextInt=Integer.parseInt(input);//�ַ�ת��Ϊ����
				Scanner scan1=new Scanner(System.in);
				switch(nextInt)
				{
				case 0:
					return ;
				case 1:
		System.out.println("�����û���ɫ");
		String Name;
		String Password;
		String Role;
		System.out.println("�����û���");
		 Name=scan1.nextLine().trim();
		 System.out.println("������Ҫ���ĳɵĽ�ɫ");
			Role=scan1.nextLine().trim();
		
			if (DateProcessing.searchNAME(Name)!= null&&((Role).equals("Browser")||(Role).equals("Operator")||(Role).equals("Operator")))
			{
				
				System.out.println("������ȷ");	
		DateProcessing.update(Name,Role);
		DateProcessing.writeUser();///////////////////////
		}//
			else{   
				System.out.println("�����ڸ��û�����������Ľ�ɫ������");
			return ;
			}//
			
			
		break;
		
		
		
				case 2:
					System.out.println("�����û�����");		
					String name1;
					System.out.println("�����ɫ��");	
				name1=scan1.nextLine().trim();
					DateProcessing.updateName(name1);
					DateProcessing.writeUser();///////////////////////
				break;
				
				
				}	
				
			}
			else
			{
				System.out.println("������������������1");
			}
			System.out.println(tip_menu);
			System.out.println(infos);
		}
	}
	public	void Searchid()	{
		
		
		
		/*System.out.println("���ص���")	;
		System.out.println("�����뵵��ID")	;
		String ID;
		Scanner scan=new Scanner(System.in);
		ID=scan.nextLine().trim();	
		DateProcessing.searchID(ID);*/
		
		DateProcessing.updownload();
		
		
		
		
		
		
		
	}
	public void showMenu()  {
		
		System.out.println("............\n\t"+"1.�����û�\n\t"+"2.ɾ���û�\n\t"+"3.�û��б�\n\t"+"4.�ı��û���ɫ\n\t"+
		"5.�����б�\n\t"+"6.���ص���\n\t"+"7.�ϴ�����\n\t")	;
	  String input=null;
	   Scanner scan = new Scanner(System.in);
	  while(true){
	     input=scan.nextLine().trim();
	     if((input).matches("0|1|2|3|4|5|6|7"))
		 {
            int nextInt=Integer.parseInt(input);//�ַ�ת��Ϊ����
			switch(nextInt)
			{
			case 0:
				System.out.println("exit");
				return;
			case 1:
				 addUser();
			break;
			
			case 2:
				 String Name=scan.nextLine().trim();
				 deluser(Name);
				 
			 break;
				
		 case 3:
			     DateProcessing.listUser();
			  
		     break;
		
		 case 4:
				
			 changeUserRole();
			 break;
		 case 5:
			 if(DateProcessing.FileList())
			System.out.println("��ѯ�����ɹ�");
			 else
				 System.out.println("��ѯ����ʧ��");
			 break;
			 
		 case 6:
			Searchid(); ///////////////
			break;
		 case 7:
				try {
					DateProcessing. fileupload();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();//////////////////////////////////////////////////
				}
			break;
			 }
			
		 }
		else 
		{
				System.out.println("�����������������");
				
		}
	     System.out.println("............\n\t"+"1.�����û�\n\t"+"2.ɾ���û�\n\t"+"3.�û��б�\n\t"+"4.�ı��û���ɫ\n\t"+"5.�����б�\n\t"+"6.���ص���\n\t"+"7.�ϴ�����\n\t")	;

	  }
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

