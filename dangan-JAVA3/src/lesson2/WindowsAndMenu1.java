package lesson2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;


/*public class WindowsAndMenutext
{

	public static void main(String[] args)
	{
	//	Brow1UI ui=new Brow1UI();
	
	WindowsAndMenu ui=new WindowsAndMenu("Browser");
		//WindowsAndMenu ui=new WindowsAndMenu();
		

	}

}*/

class WindowsAndMenu1 extends JFrame
{
	//private static final long serialVersionUID = -6177929343945351164L;
	private JMenuBar menuBar;
	private JMenu menuUser;
	private JMenuItem item1;
	private JMenuItem item2;
	private JMenuItem item3;
	private JMenuItem item4;
	private JMenuItem item5;
	
	private JMenuItem item6;
	private JMenuItem item7;
	
	
	
	
	public static void main(String[] args)
	{
	//	Brow1UI ui=new Brow1UI();
	
	WindowsAndMenu1 ui=new WindowsAndMenu1("Administrator");
		//WindowsAndMenu ui=new WindowsAndMenu();
		

	}
	
	
	
	
	
	public WindowsAndMenu1(String WinTiltle)
	{
		super(WinTiltle);
		
		// 使用Toolkit可以获得本机系统的屏幕的参数
		//Toolkit toolkit = this.getToolkit();
		
		//Dimension dim = toolkit.getScreenSize();
		//int screenH = dim.height;
		//int screenW = dim.width;
		//this.setSize(dim);
		//this.setSize(getMaximumSize());
		//this.setLocation(0, 0);
		
		menuBar = new JMenuBar();
		this.setJMenuBar(menuBar);
		
		menuUser = new JMenu("用户管理");
		menuBar.add(menuUser);
		
		item1 = new JMenuItem("增加用户");
		item2 = new JMenuItem("删除用户");
		item3 = new JMenuItem("用户列表");
		item4 = new JMenuItem("改变用户角色");
		item5 = new JMenuItem("档案列表");
		item6 = new JMenuItem("下载档案");
		item7 = new JMenuItem("上传档案");
		menuUser.add(item1);
		menuUser.add(item2);
		menuUser.add(item3);
		menuUser.add(item4);
		menuUser.add(item5);
		menuUser.add(item6);
		menuUser.add(item7);
		item1.addActionListener(new ActionListener()
		{			
		
			public void actionPerformed(ActionEvent arg0)
			{
				 //JOptionPane.showMessageDialog(null,MainUI.name+" "+MainUI.password+" "+MainUI.role,"提示消息",JOptionPane.WARNING_MESSAGE); 	
				//JOptionPane.showMessageDialog(WindowsAndMenu.this, "你选择了增加用户", "提示", JOptionPane.INFORMATION_MESSAGE);	
				 new addUI();
			}
		});
		 
		item2.addActionListener(new ActionListener()
		{			
		
			public void actionPerformed(ActionEvent arg0)
			{
				 //new BrowupdateselfUI();              //创建一个新界面  
                // DateProcessing.writeUser();
				 new deleteUI();
			}
		});
		
		item3.addActionListener(new ActionListener()
		{			
		
			public void actionPerformed(ActionEvent arg0)
			{
				// new	userlistUI();
			new	DataTable();
			}
		});
		
		item4.addActionListener(new ActionListener()
		{			
		
			public void actionPerformed(ActionEvent arg0)
			{
				new	AdchangeUI();
			}
		});
		item5.addActionListener(new ActionListener()
		{			
		
			public void actionPerformed(ActionEvent arg0)
			{
				//  new	danganlistUI();
                new DataTable1();
			}
		});
		item6.addActionListener(new ActionListener()
		{			
		
			public void actionPerformed(ActionEvent arg0)
			{
				  try {
						new	AddownloadUI();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						JOptionPane.showMessageDialog(null,"exception","提示消息",JOptionPane.WARNING_MESSAGE);
					}
			}
		});
		item7.addActionListener(new ActionListener()
		{			
		
			public void actionPerformed(ActionEvent arg0)
			{
			    try {
					new	AduploadUI();
				} catch (IOException e1) {
					JOptionPane.showMessageDialog(null,"exception","提示消息",JOptionPane.WARNING_MESSAGE); //////////////////
				}
			}
		});
		
		
		
		
		
		this.addWindowListener(new WindowAdapter()
		{
			@Override
			public void windowClosing(WindowEvent e)
			{
				// TODO Auto-generated method stub
				
				if(JOptionPane.YES_OPTION == JOptionPane.showConfirmDialog(WindowsAndMenu1.this, "是否退出？", "询问", JOptionPane.YES_NO_OPTION))
				{
					//WindowsAndMenu.this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					WindowsAndMenu1.this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
				}
				else
				{
					WindowsAndMenu1.this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
				}
			}
		});
		
		setExtendedState(JFrame.MAXIMIZED_BOTH); 
		//this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setVisible(true);		
		
	}
}