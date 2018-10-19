package lesson2;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Enumeration;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;



public class userlistUI
{

	public static void main(String[] args)
	{
		new DataTable();

	}

}

class DataTable extends JFrame
{

	//private static final long serialVersionUID = 1L;
	
	private DefaultTableModel tableModel;
	JTable table;
	
	JButton btnSelect; 
	
	public DataTable()
	{
		setLayout(new BorderLayout(5, 5));
		getContentPane().add(BorderLayout.NORTH, new JLabel("Table用法示例"));
		btnSelect = new JButton("删除");////////////
		getContentPane().add(BorderLayout.SOUTH, btnSelect);///////////////////

		
		//Object[][] cellData = {{"张三", "Administrator","123"},{"李四", "Operator","123"},{"王五", "Browser","123"}};
		Object[][] cellData = {};/////////////
		String[] columnNames = {"用户名", "角色","密码"};
		//Object[] q= {"d","y","s"};
		// 不让Edit
		tableModel = new DefaultTableModel(cellData, columnNames){
			private static final long serialVersionUID = 1L;

			public boolean isCellEditable(int row, int column)
            {
                return false;
            }			
		};
		
		table = new JTable();
		
		Enumeration<User> e=DateProcessing.getAllUser();
    	User user;
    	while(e.hasMoreElements())
    	{
    		user=e.nextElement();
    			//jt1[i]=new JTextField("\t Name:"+user.getName()+"\t Password:"+user.getPassword()+"\t Role:"+user.getRole()
		//	);   
		String a=user.getName();
		String c=user.getPassword();
		String b=user.getRole();
		Object[] q= {a,b,c};
		tableModel.addRow(q);
		
		
    	}
		

		table.setModel(tableModel);	
		table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		table.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportView(table);
		getContentPane().add(BorderLayout.CENTER, scrollPane);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 200);
		setVisible(true);
		setLocationRelativeTo(null);
		
		
		
		
		
		
		
		
	     
       
		
		
		  this.addWindowListener(new WindowAdapter()
  		{
  			@Override
  			public void windowClosing(WindowEvent e)
  			{
  				// TODO Auto-generated method stub
  				
  				if(JOptionPane.YES_OPTION == JOptionPane.showConfirmDialog(DataTable.this, "是否退出？", "询问", JOptionPane.YES_NO_OPTION))
  				{
  					//WindowsAndMenu.this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  					DataTable.this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
  				}
  				else
  				{
  					DataTable.this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
  				}
  			}
  		});
  		
  		//setExtendedState(JFrame.MAXIMIZED_BOTH); 
  		//this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  		
  		this.setVisible(true);		
          
         
		
		
		
		
		
		
		
		
		
		
		////////////////////
		btnSelect.addActionListener(new ActionListener()
		{
			
			@Override
			public void actionPerformed(ActionEvent e)
			{
				int currentRow = table.getSelectedRow();
				if(currentRow == -1)
				{
					JOptionPane.showMessageDialog(DataTable.this, "请先选择一行", "提示", JOptionPane.INFORMATION_MESSAGE);
					return;
				}
				Object object = tableModel.getValueAt(currentRow, 0);         
				String username = (String)object;      
				
				
			int n=JOptionPane.showConfirmDialog(null, "确定删除？", "提示",
						JOptionPane.YES_NO_CANCEL_OPTION
						);
			
				if (n==1||n==2)
				{
					
				}
				else {
				DateProcessing.delete(username);
				DateProcessing.writeUser();
				//System.out.println(username);
				
				DefaultTableModel tableModel = (DefaultTableModel) table.getModel();
				tableModel.removeRow(currentRow);	// currentRow是要删除的行序号
				}
			}
		});/////////////////
	}
	
}