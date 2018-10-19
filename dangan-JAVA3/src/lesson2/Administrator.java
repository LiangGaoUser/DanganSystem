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
		System.out.println("增加用户")	;
		String Name;
		String Password;
		String Role;
		Scanner scan=new Scanner(System.in);
		System.out.println("输入用户名");
			Name=scan.nextLine().trim();
			System.out.println("输入密码");
		Password=scan.nextLine().trim();
		System.out.println("输入角色");
		Role=scan.nextLine().trim();
		try{
		DateProcessing.insert(Name, Password, Role);
		}
		catch (DataException e){
			System.out.println("输入角色错误请重新输入");
		}
		DateProcessing.writeUser();/////////////////////////////////////
		
		return true;
	}
	public boolean deluser(String name) {
		
		System.out.println("删除用户")	;
		String Name;
		
		System.out.println("输入用户名");
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
		
		
		String tip_menu=" 请选择操作";
		//String tip_exit="系统退出 ";
		String infos="....................\n\t"+"1.改变用户角色\n\t"+"2.改变用户密码\n\t"+"0.返回";
		
		System.out.println(infos);
		System.out.println(tip_menu);
		String input=null;
		Scanner scan=new Scanner(System.in);
		while(true){
			input=scan.nextLine().trim();
			if((input).matches("0|1|2"))
			{
int nextInt=Integer.parseInt(input);//字符转化为整形
				Scanner scan1=new Scanner(System.in);
				switch(nextInt)
				{
				case 0:
					return ;
				case 1:
		System.out.println("更改用户角色");
		String Name;
		String Password;
		String Role;
		System.out.println("输入用户名");
		 Name=scan1.nextLine().trim();
		 System.out.println("输入想要更改成的角色");
			Role=scan1.nextLine().trim();
		
			if (DateProcessing.searchNAME(Name)!= null&&((Role).equals("Browser")||(Role).equals("Operator")||(Role).equals("Operator")))
			{
				
				System.out.println("输入正确");	
		DateProcessing.update(Name,Role);
		DateProcessing.writeUser();///////////////////////
		}//
			else{   
				System.out.println("不存在该用户名或者输入的角色名有误");
			return ;
			}//
			
			
		break;
		
		
		
				case 2:
					System.out.println("更改用户密码");		
					String name1;
					System.out.println("输入角色名");	
				name1=scan1.nextLine().trim();
					DateProcessing.updateName(name1);
					DateProcessing.writeUser();///////////////////////
				break;
				
				
				}	
				
			}
			else
			{
				System.out.println("输入有误请重新输入1");
			}
			System.out.println(tip_menu);
			System.out.println(infos);
		}
	}
	public	void Searchid()	{
		
		
		
		/*System.out.println("下载档案")	;
		System.out.println("请输入档案ID")	;
		String ID;
		Scanner scan=new Scanner(System.in);
		ID=scan.nextLine().trim();	
		DateProcessing.searchID(ID);*/
		
		DateProcessing.updownload();
		
		
		
		
		
		
		
	}
	public void showMenu()  {
		
		System.out.println("............\n\t"+"1.增加用户\n\t"+"2.删除用户\n\t"+"3.用户列表\n\t"+"4.改变用户角色\n\t"+
		"5.档案列表\n\t"+"6.下载档案\n\t"+"7.上传档案\n\t")	;
	  String input=null;
	   Scanner scan = new Scanner(System.in);
	  while(true){
	     input=scan.nextLine().trim();
	     if((input).matches("0|1|2|3|4|5|6|7"))
		 {
            int nextInt=Integer.parseInt(input);//字符转化为整形
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
			System.out.println("查询档案成功");
			 else
				 System.out.println("查询档案失败");
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
				System.out.println("输入错误请重新输入");
				
		}
	     System.out.println("............\n\t"+"1.增加用户\n\t"+"2.删除用户\n\t"+"3.用户列表\n\t"+"4.改变用户角色\n\t"+"5.档案列表\n\t"+"6.下载档案\n\t"+"7.上传档案\n\t")	;

	  }
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

