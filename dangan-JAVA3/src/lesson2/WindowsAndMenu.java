package lesson2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.util.Enumeration;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;


/*public class WindowsAndMenutext
{

	public static void main(String[] args)
	{
	//	Brow1UI ui=new Brow1UI();
	
	WindowsAndMenu ui=new WindowsAndMenu("Browser");
		//WindowsAndMenu ui=new WindowsAndMenu();
		

	}

}*/

class WindowsAndMenu extends JFrame
{
	private static final long serialVersionUID = -6177929343945351164L;
	protected static final String NAME = null;
	private JMenuBar menuBar;
	private JMenu menuUser;
	private JMenuItem item1;
	private JMenuItem item2;
	private JMenuItem item3;
	private JMenuItem item4;
	private JMenuItem item5;
	
	
	
	
	
	
	public static void main(String[] args)
	{
	//	Brow1UI ui=new Brow1UI();
	
	WindowsAndMenu ui=new WindowsAndMenu("Browser");
		//WindowsAndMenu ui=new WindowsAndMenu();
		

	}
	
	
	
	
	
	public WindowsAndMenu(String WinTiltle)
	{
		super(WinTiltle);
		
		// ʹ��Toolkit���Ի�ñ���ϵͳ����Ļ�Ĳ���
		//Toolkit toolkit = this.getToolkit();
		
		//Dimension dim = toolkit.getScreenSize();
		//int screenH = dim.height;
		//int screenW = dim.width;
		//this.setSize(dim);
		//this.setSize(getMaximumSize());
		//this.setLocation(0, 0);
		
		menuBar = new JMenuBar();
		this.setJMenuBar(menuBar);
		
		menuUser = new JMenu("�û�����");
		menuBar.add(menuUser);
		
		item1 = new JMenuItem("��ѯ������Ϣ");
		item2 = new JMenuItem("�޸ĸ�����Ϣ");
		item3 = new JMenuItem("���ص���");
		item4 = new JMenuItem("���������Ϣ");
		item5 = new JMenuItem("�������");
		
		menuUser.add(item1);
		menuUser.add(item2);
		menuUser.add(item3);
		menuUser.add(item4);
		menuUser.add(item5);
		
		//item1.addActionListener(new ActionListener()
		//{			
		//
			//public void actionPerformed(ActionEvent arg0)
		//	{
				// JOptionPane.showMessageDialog(null,MainUI.name+" "+MainUI.password+" "+MainUI.role,"��ʾ��Ϣ",JOptionPane.WARNING_MESSAGE); 	
				//JOptionPane.showMessageDialog(WindowsAndMenu.this, "��ѡ���������û�", "��ʾ", JOptionPane.INFORMATION_MESSAGE);	
				 
			String NAME= MainUI.name;
				 
				item1.addActionListener(new ActionListener()
					{			
					
						public void actionPerformed(ActionEvent arg0)
						{
							 
							//JOptionPane.showMessageDialog(null,"exception","��ʾ��Ϣ",JOptionPane.WARNING_MESSAGE); 
						
						    	
						    	if(DateProcessing.searchNAME(NAME)!=null)
						    	
						    	{	
						    	   
								String a=DateProcessing.searchNAME(NAME).getName();
								String b=DateProcessing.searchNAME(NAME).getPassword();
								String c=DateProcessing.searchNAME(NAME).getRole();
								JOptionPane.showMessageDialog(null,"\t Name:"+a+"\t Password:"+b+"\t Role:"+c,"��ʾ��Ϣ",JOptionPane.WARNING_MESSAGE); 
						    	}
						    	else
						    	{
						    		;
						    	}
						}
					});
			
				 
				 
				 
				 
				 
				
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
	
		 
		item2.addActionListener(new ActionListener()
		{			
		
			public void actionPerformed(ActionEvent arg0)
			{
				 new BrowupdateselfUI();              //����һ���½���  
                 DateProcessing.writeUser();
			}
		});
		
		item3.addActionListener(new ActionListener()
		{			
		
			public void actionPerformed(ActionEvent arg0)
			{
				 try {
						new AddownloadUI();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						//e1.printStackTrace();
				       	 JOptionPane.showMessageDialog(null,"exception","��ʾ��Ϣ",JOptionPane.WARNING_MESSAGE); 
					}
			}
		});
		
		item4.addActionListener(new ActionListener()
		{			
		
			public void actionPerformed(ActionEvent arg0)
			{
				 // new userlistUI();
				new DataTable3();
			}
		});
		item5.addActionListener(new ActionListener()
		{			
		
			public void actionPerformed(ActionEvent arg0)
			{
				//new danganlistUI();
				new DataTable1();
			}
		});
		
		
		
		
		
		
		this.addWindowListener(new WindowAdapter()
		{
			@Override
			public void windowClosing(WindowEvent e)
			{
				// TODO Auto-generated method stub
				
				if(JOptionPane.YES_OPTION == JOptionPane.showConfirmDialog(WindowsAndMenu.this, "�Ƿ��˳���", "ѯ��", JOptionPane.YES_NO_OPTION))
				{
					//WindowsAndMenu.this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					WindowsAndMenu.this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
				}
				else
				{
					WindowsAndMenu.this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
				}
			}
		});
		
		setExtendedState(JFrame.MAXIMIZED_BOTH); 
		//this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setVisible(true);		
		
	}
}