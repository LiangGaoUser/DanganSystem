package lesson2;

import java.io.IOException;
import java.util.Scanner;
import lesson2.MainUI;
public class Operator extends User{
    Operator (String name,String password,String role){
		super(name,password,role);
		setName(name);
		setPassword(password);
		setRole(role);
	}
	public boolean updateuser( ){
		
			System.out.println("�����û���Ϣ");
			String Name;
			String Password;
			String Role;
			Scanner scan1=new Scanner(System.in);
			System.out.println("�����û���");
			 Name=scan1.nextLine().trim();
			System.out.println("������Ҫ���ĳɵĽ�ɫ");
			Role=scan1.nextLine().trim();
			if(DateProcessing.searchNAME(Name)!= null&&((Role).equals("Browser")||(Role).equals("Operator")||(Role).equals("Operator")))
			{
				System.out.println("������ȷ");
			DateProcessing.update(Name,Role);
			DateProcessing.writeUser();///////////////////////
			return true;
		}
		
			else
			{
				System.out.println("������û������ɫ����");
				return false;
			}
		
	}
		
	
	public void showMenu() {
		
		System.out.println("............\n\t"+"1.�û��б�\n\t"+"2.�����û���ɫ\n\t"+"3.���ص���\n\t"+"4.�����б�\n\t"+"5.�ϴ�����\n\t"+"0.�˳�\n\t");
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
				return;
			case 1:
				 if(DateProcessing.listUser())
				 System.out.println("�б�ɹ�");
				 else 
			     System.out.println("�б�ʧ��");
			break;
			
			case 2:
				 
				 if(updateuser())
				 System.out.println("���³ɹ�");
				 else
					 System.out.println("����ʧ��");	 
			 break;
			case 3:
				// String NAME=scan.nextLine().trim();
				 //if(downloadFile(NAME))
				 //System.out.println("���سɹ�");
				 //else
				 //System.out.println("����ʧ��");
				DateProcessing.updownload();
			 break;
			case 4:
				if(DateProcessing.FileList())
	            System.out.println("��ѯ�����ɹ�");
				else
					System.out.println("��ѯ����ʧ��");
				break;
			case 5:
				try {
					DateProcessing.fileupload();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();//////////////////////////////////////////////////////////
				}
			
			}}
		else 
		{
			System.out.println("�����������������");
			
		}
	 	System.out.println("............\n\t"+"1.�û��б�\n\t"+"2.�����û���ɫ\n\t"+"3.���ص���\n\t"+"4.�����б�\n\t"+"5.�ϴ�����\n\t"+"0.�˳�\n\t");
			
	     }
	
	
	}
}
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	



