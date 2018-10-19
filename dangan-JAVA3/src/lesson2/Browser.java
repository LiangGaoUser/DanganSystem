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
			System.out.println("输入用户名");
			Name=scan.nextLine().trim();
			System.out.println("输入密码");
			Password=scan.nextLine().trim();
		   DateProcessing.updateself(Name,Password);
		   DateProcessing.writeUser();///////////////////////
		return true;
		  
		  
	  }
      public  void showMenu()
		 
	   {
		     System.out.println("............\n\t"+"1.查询个人信息\n\t"+"2.修改个人信息\n\t"+"3.下载档案\n\t"+"4.浏览其他人的信息\n\t"+"5.浏览档案\n\t"+"0.退出\n\t")	;	
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
					return ;
				case 1:
					 if(showSelfInfo())
					 { System.out.println("查询成功");
					}//////
					 else 
				     System.out.println("查询失败");
				break;
				
				case 2:
					updateself();
					
				 break;
				case 3:
					//String ID=scan.nextLine().trim();
				//	if(downloadFile(ID))
					//System.out.	println("下载成功");
					//else
					//System.out.println("下载失败");
					DateProcessing.updownload();
				 break;
				case 4:
					if(  DateProcessing.listUser())
					 System.out.println("列表成功");
					 else
					 System.out.println("列表失败");
				 break;
				
				case 5:
					if(DateProcessing.FileList())
				  System.out.println("查询档案成功");
					else
						System.out.println("查询档案失败");
				}
				
				
			}
			else 
			{
					System.out.println("输入错误请重新输入");
					
			}
		     System.out.println("............\n\t"+"1.查询个人信息\n\t"+"2.修改个人信息\n\t"+"3.下载档案\n\t"+"4.浏览其他人的信息\n\t"+"5.浏览档案\n\t"+"0.退出\n\t")	;
				
		  }
		  
		  }   
	   }
}
