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
			System.out.println(" ���ݴ���IOException!");
		
		}
		catch (DataException e )
		{	
			System.out.println("���ݴ���DataException!");		
			
		}
		finally{	
			
		}
		
		
		
	
	
		
		
		
		
		String tip_menu=" ��ѡ�����";
		String tip_exit="ϵͳ�˳� ";
		String infos=".........��ӭ������������ϵͳ..............\n\t"+"1.��¼\n\t"+"2.�˳�\n\t";
		String name,password;
		System.out.println(infos);
		System.out.println(tip_menu);
		String input=null;
		Scanner scan=new Scanner(System.in);
		while(true){
			input=scan.nextLine().trim();
			if((input).matches("1|2"))
			{
				
				int nextInt=Integer.parseInt(input);//�ַ�ת��Ϊ����
				
				
				Scanner scan1=new Scanner(System.in);
				switch(nextInt)
				{
				case 1:
					System.out.println("�����û���");
					name=scan1.nextLine().trim();
					System.out.println("����������");
					password=scan1.nextLine().trim();
				
			User use=DateProcessing.search(name,password);
					if(use!=null)
						use.showMenu();
					//else
						
				//	System.out.println("���û������ڣ�");
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
				System.out.println("������������������");
				
			}
				System.out.println(infos);
				System.out.println(tip_menu);
			}
			
	}

		//private static void DataException() {
			// TODO Auto-generated method stub
			
		//}

}