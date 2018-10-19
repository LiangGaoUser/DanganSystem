
package lesson2;

public abstract class User
{
	protected String name;
	protected  String password;
	protected String role;

	User()
	{
	}
	
	User(String name, String password, String role)
	{
		this.name = name;
		this.password = password;
		this.role = role;
	}

	public boolean changeUserInfo(String password)
	{
		// д�û���Ϣ���洢
		if (DateProcessing.update(name,  role))
		{
			//this.password = password;
			System.out.println("�޸ĳɹ�");
			return true;
		}
		else
			return false;
	}

	public boolean downloadFile(String filename)
	{
		System.out.println("�����ļ�... ...");
		return true;
	}

	public boolean showFileList()
	{
		System.out.println("�б�... ...");
//	DateProcessing.putout();
		return true;
	}

	public abstract void showMenu();

	public void exitSystem()
	{
		System.out.println("ϵͳ�˳�, ллʹ�� ! ");
		System.exit(0);
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public  String getPassword()
	{
		return password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}

	public String getRole()
	{
		return role;
	}

	public void setRole(String role)
	{
		this.role = role;
	}

}
