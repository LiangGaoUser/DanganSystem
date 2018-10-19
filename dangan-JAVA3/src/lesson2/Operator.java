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
		
			System.out.println("更改用户信息");
			String Name;
			String Password;
			String Role;
			Scanner scan1=new Scanner(System.in);
			System.out.println("输入用户名");
			 Name=scan1.nextLine().trim();
			System.out.println("输入想要更改成的角色");
			Role=scan1.nextLine().trim();
			if(DateProcessing.searchNAME(Name)!= null&&((Role).equals("Browser")||(Role).equals("Operator")||(Role).equals("Operator")))
			{
				System.out.println("输入正确");
			DateProcessing.update(Name,Role);
			DateProcessing.writeUser();///////////////////////
			return true;
		}
		
			else
			{
				System.out.println("输入的用户名或角色错误");
				return false;
			}
		
	}
		
	
	public void showMenu() {
		
		System.out.println("............\n\t"+"1.用户列表\n\t"+"2.更新用户角色\n\t"+"3.下载档案\n\t"+"4.档案列表\n\t"+"5.上传档案\n\t"+"0.退出\n\t");
	     String input=null;
	     Scanner scan=new Scanner(System.in);{
	     while(true){
	     input=scan.nextLine().trim();
	     if((input).matches("0|1|2|3|4|5"))
		 {
            int nextInt=Integer.parseInt(input);//字符转化为整形
			switch(nextInt)
			{
			case 0:
				System.out.println("exit");
				return;
			case 1:
				 if(DateProcessing.listUser())
				 System.out.println("列表成功");
				 else 
			     System.out.println("列表失败");
			break;
			
			case 2:
				 
				 if(updateuser())
				 System.out.println("更新成功");
				 else
					 System.out.println("更新失败");	 
			 break;
			case 3:
				// String NAME=scan.nextLine().trim();
				 //if(downloadFile(NAME))
				 //System.out.println("下载成功");
				 //else
				 //System.out.println("下载失败");
				DateProcessing.updownload();
			 break;
			case 4:
				if(DateProcessing.FileList())
	            System.out.println("查询档案成功");
				else
					System.out.println("查询档案失败");
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
			System.out.println("输入错误请重新输入");
			
		}
	 	System.out.println("............\n\t"+"1.用户列表\n\t"+"2.更新用户角色\n\t"+"3.下载档案\n\t"+"4.档案列表\n\t"+"5.上传档案\n\t"+"0.退出\n\t");
			
	     }
	
	
	}
}
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	



