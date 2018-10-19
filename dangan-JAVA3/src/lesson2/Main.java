package lesson2;

import java.io.IOException;
import java.util.Scanner;
public class  Main{
		public static void main(String[]arges)throws IOException,DataException{
		try{
			
			DateProcessing.Init();
		}
		
		catch (IOException e)
		{
			System.out.println(" 数据错误IOException!");
		
		}
		catch (DataException e )
		{	
			System.out.println("数据错误DataException!");		
			
		}
		finally{	
			
		}
		
		
		
	
	
		
		
		
		
		String tip_menu=" 请选择操作";
		String tip_exit="系统退出 ";
		String infos=".........欢迎来到档案管理系统..............\n\t"+"1.登录\n\t"+"2.退出\n\t";
		String name,password;
		System.out.println(infos);
		System.out.println(tip_menu);
		String input=null;
		Scanner scan=new Scanner(System.in);
		while(true){
			input=scan.nextLine().trim();
			if((input).matches("1|2"))
			{
				
				int nextInt=Integer.parseInt(input);//字符转化为整形
				
				
				Scanner scan1=new Scanner(System.in);
				switch(nextInt)
				{
				case 1:
					System.out.println("输入用户名");
					name=scan1.nextLine().trim();
					System.out.println("请输入密码");
					password=scan1.nextLine().trim();
				
			User use=DateProcessing.search(name,password);
					if(use!=null)
						use.showMenu();
					//else
						
				//	System.out.println("该用户不存在！");
					break;
				case 2:
					System.out.println(tip_exit);
					scan1.close();
					System.exit(0);
					break;
						
					
				}
			}
			else
			{
				System.out.println("输入有误请重新输入");
				
			}
				System.out.println(infos);
				System.out.println(tip_menu);
			}
			
	}

		//private static void DataException() {
			// TODO Auto-generated method stub
			
		//}

}