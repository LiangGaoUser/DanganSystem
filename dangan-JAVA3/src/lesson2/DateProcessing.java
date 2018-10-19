package lesson2;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
public class DateProcessing
{
	//static Hashtable<String, User> users;
	static final String USERFILE = "D:\\user.txt";
	static final String DOCFILE = "G:\\file.txt";
	private static final char[] Filename = null;
	
	static Hashtable<String, User> users;
	static Hashtable<String, Doc> docs;

	public static void Init() throws IOException ,DataException
	{
		
		users = new Hashtable<String, User>();
		String name, password, role;

		BufferedReader br = new BufferedReader(new FileReader("D:\\user.txt"));				
		while ((name = br.readLine()) != null)
		{
			password = br.readLine();
			role = br.readLine();			
			System.out.println(name+password+role);
			if (password == null || role == null || password.length() == 0 || role.length() == 0)
			{
				br.close();
				throw new DataException("���ݴ���67��");
			}

			if (role.equals("Operator"))
				users.put(name, new Operator(name, password, role));
			else if (role.equals("Browser"))
				users.put(name, new Browser(name, password, role));
			else if (role.equals("Administrator"))
				users.put(name, new Administrator(name, password, role));
			else
			{
				br.close();
				//System.out.println("��ƥ��jiaose");
				throw new DataException("���ݴ���87��");
			}
			//br.close();
		}
		
		
		
	
		
		
		
		
		
		
		
	br.close();
	
	// ���ļ�����ȡ�Ѿ��ϴ����ĵ�
	docs = new Hashtable<String, Doc>();
	String idFile, idUser, timestamp, fileDisc, fileName;

	BufferedReader brFile = new BufferedReader(new FileReader(DOCFILE));//��File��ȡ
	while ((idFile = brFile.readLine()) != null)
	{
		idUser = brFile.readLine();
		timestamp = brFile.readLine();
		fileDisc = brFile.readLine();
		fileName = brFile.readLine();

		if (idUser == null || timestamp == null || fileDisc == null || fileName == null||idUser.length()==0
		||timestamp.length()==0||fileDisc.length()==0||fileName.length()==0)
		{
			brFile.close();
			throw new DataException("ϵͳ�е������ݸ�ʽ����");
		}

		//long ts = Long.parseLong(timestamp);////////////////
		docs.put(idFile, new Doc(idFile, idUser, timestamp, fileDisc, fileName));
	}                                               //ts
	
	brFile.close();
}
	//////////////////////	
	// �����ǵ��������ܺ���
	
		public static Doc searchDoc(String ID)
		{
			if (docs.containsKey(ID))
			{
				Doc temp = docs.get(ID);
				return temp;
			}
			return null;
		}
		
		public static Enumeration<Doc> getAllDocs()
		{
			Enumeration<Doc> e = docs.elements();
			return e;
		}
                                                                    /////long
		public static boolean insertDoc(String ID, String creator, String timestamp, String description, String filename) throws IOException		
		{
			Doc doc;

			if (docs.containsKey(ID))
				return false;
			else
			{
				doc = new Doc(ID, creator, timestamp, description, filename);
				docs.put(ID, doc);
				return true;
			}
		}
		
	

	
		public static boolean FileList(){
			Enumeration<Doc> e=DateProcessing.getAllDocs();
			Doc doc;
			while(e.hasMoreElements())
			{
				doc=e.nextElement();
				System.out.println("\t ID:"+doc.getID()+"\t Creator:"+doc.getCreator()+"\t Timestamp:"+doc.getTimestamp()
						+"\t Description:"+doc.getDescription()+"\t Filename:"+doc.getFilename());      
				
			}
			
			return true;
			
		}
		
		
		
		
		
		public static  Doc searchID(String ID)
		{
			if (docs.containsKey(ID))
			{
				Doc temp = docs.get(ID);
		
				//System.out.println("\t ID:"+temp.getID()+"\t Creator:"+temp.getCreator()+"\t Timestamp:"+temp.getTimestamp()++
					//	+"\t Description:"+temp.getDescription()+"\t Filename:"+temp.getFilename());++
					return temp;
			}
			//System.out.println("û�иõ���");++
			return null;
		}
		
	public static void updownload()	
	{	int a=0;
		System.out.println("���ص���")	;
		System.out.println("�����뵵��ID")	;
		String ID,Creator = null,Description = null,Filename = null;
		String Timestamp = null;
		Scanner scan=new Scanner(System.in);
		ID=scan.nextLine().trim();	
		DateProcessing.searchID(ID);
		if (docs.containsKey(ID))
		{
			Doc temp = docs.get(ID);
	         Creator=temp.getCreator();
	         Timestamp=temp.getTimestamp();
	         Description=temp.getDescription();
	         Filename=temp.getFilename();
	     FileInputStream input = null;
             FileOutputStream output = null ;
          try{
               input=new FileInputStream("G://"+Filename);
	           output=new FileOutputStream("D://"+Filename);
	          byte[] buf=new byte [1024];
	        int bytesRead;
	while
		
		((bytesRead=input.read(buf))>0)
		{
			output.write(buf,0,bytesRead);
		}
	//System.out.println("���سɹ�");
	input.close();
	output.close();
	
}
	catch(IOException e)
	{
		a=1;
		System.out.println("û�иõ����򵵰��ļ��Ѿ����ƻ�");
	}
finally {
	
	
}
	        
	    if(a==1)  {
	    	System.out.println("����ʧ��");
	    }
	    else
		try{
			BufferedReader stdin1=new BufferedReader (new InputStreamReader(System.in));//stdin ��ȡ������
   
			BufferedWriter fout=new BufferedWriter(new OutputStreamWriter(new FileOutputStream ("D:\\file.txt",true)));//fourд�������BufferWriteд
		fout.write(ID);
		fout.newLine();
		fout.write(Creator);
		fout.newLine();
		fout.write(Timestamp);
		fout.newLine();
		fout.write(Description);
		fout.newLine();
		fout.write(Filename);
		fout.newLine();
		fout.close();
		System.out.println("�������");
		}
		catch (Exception e1){
			System.out.println("I/O Exception");
		}
		
		return  ;

		
		}}
		

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static int updownload1(String ID)	
	{	int a=0;
		//System.out.println("���ص���")	;
		//System.out.println("�����뵵��ID")	;
		String Creator = null,Description = null,Filename = null;
		String Timestamp = null;
		//Scanner scan=new Scanner(System.in);
		//ID=scan.nextLine().trim();	
		DateProcessing.searchID(ID);
		if (docs.containsKey(ID))
		{
			Doc temp = docs.get(ID);
	         Creator=temp.getCreator();
	         Timestamp=temp.getTimestamp();
	         Description=temp.getDescription();
	         Filename=temp.getFilename();
	     FileInputStream input = null;
             FileOutputStream output = null ;
          try{
               input=new FileInputStream("G://"+Filename);
	           output=new FileOutputStream("D://"+Filename);
	          byte[] buf=new byte [1024];
	        int bytesRead;
	while
		
		((bytesRead=input.read(buf))>0)
		{
			output.write(buf,0,bytesRead);
		}
	a=3;
	//System.out.println("���سɹ�");
	input.close();
	output.close();
	
}
	catch(IOException e)
	{
		a=2;
		//System.out.println("û�иõ����򵵰��ļ��Ѿ����ƻ�");
	}
finally {
	
	
}
		}
          else///////////////////
          {
        	  a=4;
          }
	        //////////////////////////////
	    if(a==2||a==4)  {
	    ;	//System.out.println("����ʧ��");
	    }
	    else
		try{
			BufferedReader stdin1=new BufferedReader (new InputStreamReader(System.in));//stdin ��ȡ������
   
			BufferedWriter fout=new BufferedWriter(new OutputStreamWriter(new FileOutputStream ("D:\\file.txt",true)));//fourд�������BufferWriteд
		fout.write(ID);
		fout.newLine();
		fout.write(Creator);
		fout.newLine();
		fout.write(Timestamp);
		fout.newLine();
		fout.write(Description);
		fout.newLine();
		fout.write(Filename);
		fout.newLine();
		fout.close();
		
		//System.out.println("�������");
		}
		catch (Exception e1){
			//System.out.println("I/O Exception");
			
		}
		
		

		
	//	}
		return a;
		}	
	
	
	
	
	
	
	
	
	
	
	
	
		
		
		
		
	

public static boolean fileupload() throws IOException{//////////////////
	String ID;
	String Creator;
	String Timestamp;
	String Description;
	String Filename;//////////////////////////////////////////////////////////////
	int a=0;////////////////////////////////////////////
	System.out.println("�ϴ�����")	;
	System.out.println("�����뵵��ID")	;
	Scanner scan=new Scanner(System.in);
	ID=scan.nextLine().trim();	
	
	
	Doc doc;
		if (docs.containsKey(ID))
		{
			//Doc temp = docs.get(ID);
			System.out.println("�������ظ�����������");
			return false;
			
		}
		
		else

	System.out.println("�����뵵��Creator")	;
	Creator=scan.nextLine().trim();	
	
	System.out.println("�����뵵��Description")	;
	Description=scan.nextLine().trim();	
	System.out.println("�����뵵��Filename")	;///////////////////////
	
	Filename=scan.nextLine().trim();
	
FileInputStream input = null;
FileOutputStream output = null ;
try{
	 input=new FileInputStream("D://"+Filename);//�ļ����ϴ�
	 output=new FileOutputStream("G://"+Filename);
	byte[] buf=new byte [1024];
	int bytesRead;
	while
		
		((bytesRead=input.read(buf))>0)
		{
			output.write(buf,0,bytesRead);
		}
	System.out.println("�ϴ��ɹ�");
	input.close();
	output.close();
	
}
	catch(IOException e)
	{
		a=1;
		System.out.println("D��û��"+Filename+"�ļ�");
	}
finally {
	
	
}
	
	Date date=new Date();
	DateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	 Timestamp=format.format(date);
	System.out.println(Timestamp);
	
	if(a==1)
	{
	System.out.println("�ϴ�ʧ��");
	}
	else
		
		
		
		try{
			BufferedReader stdin1=new BufferedReader (new InputStreamReader(System.in));//stdin ��ȡ������
   
			BufferedWriter fout=new BufferedWriter(new OutputStreamWriter(new FileOutputStream ("G:\\file.txt",true)));//fourд�������BufferWriteд
		fout.write(ID);
		fout.newLine();
		fout.write(Creator);
		fout.newLine();
		fout.write(Timestamp);
		fout.newLine();
		fout.write(Description);
		fout.newLine();
		fout.write(Filename);/////////////////////////////
		fout.newLine();
		fout.close();
		System.out.println("�ϴ��ɹ�");
		docs = new Hashtable<String, Doc>();
		String idFile, idUser, timestamp, fileDisc, fileName;

		BufferedReader brFile = new BufferedReader(new FileReader(DOCFILE));//��File��ȡ
		while ((idFile = brFile.readLine()) != null)
		{
			idUser = brFile.readLine();
			timestamp = brFile.readLine();
			fileDisc = brFile.readLine();
			fileName = brFile.readLine();

			if (idUser == null || timestamp == null || fileDisc == null || fileName == null||idUser.length()==0
			||timestamp.length()==0||fileDisc.length()==0||fileName.length()==0)
			{
				brFile.close();
				throw new DataException("ϵͳ�е������ݸ�ʽ����");
			}

			//long ts = Long.parseLong(timestamp);////////////////
			docs.put(idFile, new Doc(idFile, idUser, timestamp, fileDisc, fileName));
		}                                               //ts
		
		brFile.close();
	
		}
		catch (Exception e1){
			System.out.println("I/O Exception");
		}

	
         return true;
	
}









public static int fileupload1(String ID,String Creator,String Description,String Filename) throws IOException{
	

int a=0;
	//Scanner scan=new Scanner(System.in);
	
	Doc doc;
		if (docs.containsKey(ID))
		{
			a=0;
			//return 0;
		}
		else
	// Filename=scan.nextLine().trim();
	//  FileInputStream  input = null;
    // FileOutputStream output = null ;
try{
	  FileInputStream  input=new FileInputStream("D://"+Filename);
	  FileOutputStream  output=new FileOutputStream("G://"+Filename);
	byte[] buf=new byte [1024];
	int bytesRead;
	while
		
		((bytesRead=input.read(buf))>0)
		{
			output.write(buf,0,bytesRead);
		}
	//System.out.println("�ϴ��ɹ�");
	input.close();
	output.close();
	a=1;
	//return a;
	
}
	catch(IOException e)
	{
		a=2;
		//System.out.println("D��û��"+Filename+"�ļ�");
		//return 2;
	}
finally {
	
	
}
//	
	Date date=new Date();
	DateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	String Timestamp=format.format(date);
	//System.out.println(Timestamp);
	
	if(a==0||a==2)
	{
	//System.out.println("�ϴ�ʧ��");
	}
	else
		
		
		
		try{
			BufferedReader stdin1=new BufferedReader (new InputStreamReader(System.in));//stdin ��ȡ������
   
			BufferedWriter fout=new BufferedWriter(new OutputStreamWriter(new FileOutputStream ("G:\\file.txt",true)));//fourд�������BufferWriteд
		fout.write(ID);
		fout.newLine();
		fout.write(Creator);
		fout.newLine();
		fout.write(Timestamp);
		fout.newLine();
		fout.write(Description);
		fout.newLine();
		fout.write(Filename);
		fout.newLine();
		fout.close();
		//System.out.println("�ϴ��ɹ�");
		docs = new Hashtable<String, Doc>();
		String idFile, idUser, timestamp, fileDisc, fileName;

		BufferedReader brFile = new BufferedReader(new FileReader(DOCFILE));//��File��ȡ
		
		while ((idFile = brFile.readLine()) != null)
		{
			idUser = brFile.readLine();
			timestamp = brFile.readLine();
			fileDisc = brFile.readLine();
			fileName = brFile.readLine();

			if (idUser == null || timestamp == null || fileDisc == null || fileName == null||idUser.length()==0
			||timestamp.length()==0||fileDisc.length()==0||fileName.length()==0)
			{
				brFile.close();
				a=3;
				//throw new DataException("ϵͳ�е������ݸ�ʽ����");
			}

			//long ts = Long.parseLong(timestamp);////////////////
			docs.put(idFile, new Doc(idFile, idUser, timestamp, fileDisc, fileName));
			a=4;
		}                                               //ts
		
		brFile.close();
	
		}
		catch (Exception e1){
			//System.out.println("I/O Exception");
		}
	return a;

	
        
	
}






























		public static  User  searchNAME(String name)
		{
			if (users.containsKey(name))
			{
				User temp = users.get(name);
				//System.out.println("���ڸ��û�");
			
			return temp;
			}
			else
			//System.out.println("�����ڸ��û�");
			return null;
			
		}
	public static  User search(String name, String password)
	{
		if (users.containsKey(name))
		{
			User temp = users.get(name);
			if ((temp.getPassword()).equals(password))
				
				return temp;
			else
			{
			System.out.println("�������");
			return null;
			}
		}
		System.out.println("���û�������");
		return null;
	}

	public static Enumeration<User> getAllUser()
	{
		Enumeration<User> e = users.elements();
		return e;
	}

	public static boolean update(String name, String role) //Operator name->role
	{
		User user;
		String password;
			User temp = users.get(name);
    //password=temp.getPassword( );/////////////////////////////
		if (users.containsKey(name))
		{
			 password=temp.getPassword( );
			//ʵ��һ: ��Administrator��Operator��Browser������ɺ󣬴򿪴˴�����
			
			  if (role.equalsIgnoreCase("Administrator")) user = new
			  Administrator(name, password, "Administrator"); else if
			  (role.equalsIgnoreCase("Operator")) user = new Operator(name,
			 password, "Operator"); else user = new Browser(name, password, "Browser");
			  users.put(name, user);
			  return true;
		}
		else{
			//System.out.println("���û�������");++
			return false;//++
		}
		//return true;++
		
		
	}


	public static void updateName(String name)
	{
	
		User user ;
		if (users.containsKey(name))
		{
			User temp = users.get(name);
			
				System.out.println("�������µ�����");
				String Password;
				
				Scanner scan1=new Scanner(System.in);
				Password=scan1.nextLine().trim();
				temp.setPassword(Password);//
				String Role=temp.getRole();
			  if(Role.equals("Administrator"))
				user=new Administrator(name,Password,Role);
				//setPassword(Password);
			//	user = new Browser(name, Password, role);
			  else  if(Role.equals("Browser"))
					user=new Browser(name,Password,Role);
			  else 
			  {
					user=new Operator(name,Password,Role);
			     users.put(name, user);
			  } 
			     System.out.println("��������ɹ�");
				
			}
		
		else
		{
			System.out.println("û�и��û�");
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	public static boolean updateName1(String name,String Password)/////
	{
	
		User user ;
		if (users.containsKey(name))
		{
			User temp = users.get(name);
				temp.setPassword(Password);//
				String Role=temp.getRole();
			  if(Role.equals("Administrator"))
				user=new Administrator(name,Password,Role);
			
			  else  if(Role.equals("Browser"))
					user=new Browser(name,Password,Role);
			  else 
			  {
					user=new Operator(name,Password,Role);
			     users.put(name, user);
			  } 
			   
				return true;
			}
		
		else
		{
		return false;
		}
		
	}////////////
	
	
	
	
	
	
	
	
	
	public static void updateself(String name, String password)//selfpassword
	{
		User user ;
		if (users.containsKey(name))
		{
			User temp = users.get(name);
			if ((temp.getPassword()).equals(password))
			{
				System.out.println("�������µ�����");
				String Password;
				Scanner scan1=new Scanner(System.in);
				Password=scan1.nextLine().trim();
				String Role=temp.getRole();
				temp.setPassword(Password);//
			  if(Role.equals("Administrator"))
				user=new Administrator(name,Password,Role);
			
			  else  if(Role.equals("Browser"))
					user=new Browser(name,Password,Role);
			  else 
					user=new Operator(name,Password,Role);
			     users.put(name, user);
			     System.out.println("��������ɹ�");
				
			}
			
			else
			{
				System.out.println("��������������������ȷ������");
			}
		}
		else
		{
			System.out.println("û�и��û�");
		}
			
	}


	
	
	
	
	
	
	
	
	
	
	
	
	public static int updateself1(String name, String password,String Password)//selfpassword
	{
		int a;
		User user ;
		if (users.containsKey(name))
		{
			
			User temp = users.get(name);
			if ((temp.getPassword()).equals(password))
			{
				a=2;
				//System.out.println("�������µ�����");
				
				//Scanner scan1=new Scanner(System.in);
				//Password=scan1.nextLine().trim();
				String Role=temp.getRole();
				temp.setPassword(Password);//
			  if(Role.equals("Administrator"))
				user=new Administrator(name,Password,Role);
			
			  else  if(Role.equals("Browser"))
					user=new Browser(name,Password,Role);
			  else 
					user=new Operator(name,Password,Role);
			     users.put(name, user);
			    // System.out.println("��������ɹ�");
				
			}
			
			else
			{
				a=3;
				//System.out.println("��������������������ȷ������");
			}
		}
		else
		{
			a=4;
			//System.out.println("û�и��û�");
		}
			return a;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static boolean insert(String name, String password, String role)throws DataException
	{
		User user=null  ;

		if (users.containsKey(name))
		{
		//System.out.println("���˺��Ѿ����ڣ������û�ʧ��");+++
			return false;
		}
		else
		{
			//ʵ��һ: ��Administrator��Operator��Browser������ɺ󣬴򿪴˴�����
			
			  if (role.equals("Administrator")) 
			    user = new Administrator(name, password, "Administrator");
			  else if (role.equals("Operator")) 
			  user = new Operator(name, password, "Operator");
			  else  if(role.equals("Browser"))
			  	  user = new Browser(name, password, "Browser");
			  else
			  {
				  
			  throw new DataException("���ݴ���");
			  
			 
			  }
			 users.put(name, user);
			// System.out.println("��ӳɹ�");//+++++
			return true;
		}
	}

	public static boolean delete(String name)
	{
		if (users.containsKey(name))
		{
			users.remove(name);
			 //System.out.println("ɾ���ɹ�");++
			return true;
		}
		else
			//System.out.println("û�и��û�");++
			return false;
	}


public static boolean listUser(){
	Enumeration<User> e=DateProcessing.getAllUser();
	User user;
	while(e.hasMoreElements())
	{
		user=e.nextElement();
		System.out.println("\t Name:"+user.getName()+"\t Password:"+user.getPassword()+"\t Role:"+user.getRole());
		
	}
	
	return true;
	
}




///////////////////////////////////////////
/*
public static void Filewrite(String a,String b,String c) {   
   
        FileOutputStream out = null;   
        try {   

            out = new FileOutputStream(new File("d://user.txt"));     
            out.write(a.getBytes());
            out.write(b.getBytes());
            out.write(c.getBytes());
           
           // out.close();   
           // out.flush();   

            //out.close(); 
         System.out.println("д�����");   
        } catch (Exception e1) {   

            e1.printStackTrace();   

        }   

        finally {   

            try {   

               // out.close();   

            } catch (Exception e1) {   

                e1.printStackTrace();   

            }   

        }   

}



*/










public static boolean writeUser() {//////////////////
	Enumeration<User> e=DateProcessing.getAllUser();
	User user;
	
	
	
	try
	{
	File f=new File("d://user.txt");
	FileWriter fw=new FileWriter(f);
	fw.write("");
	fw.close();
	}
	catch (Exception e1){
		//System.out.println("I/O Exception");++
	}
	
	while(e.hasMoreElements())
	{
		user=e.nextElement();
		//System.out.println("\t Name:"+user.getName()+"\t Password:"+user.getPassword()+"\t Role:"+user.getRole());++
	
		try{
			BufferedReader stdin1=new BufferedReader (new InputStreamReader(System.in));//stdin ��ȡ������
   
			BufferedWriter fout=new BufferedWriter(new OutputStreamWriter(new FileOutputStream ("D:\\user.txt",true)));//fourд�������BufferWriteд
		fout.write(user.getName());
		fout.newLine();
		fout.write(user.getPassword());
		fout.newLine();
		fout.write(user.getRole());
		fout.newLine();
		fout.close();
		}
		catch (Exception e1){
			//System.out.println("I/O Exception");++
		}
}
	
         return true;
	
}






}








