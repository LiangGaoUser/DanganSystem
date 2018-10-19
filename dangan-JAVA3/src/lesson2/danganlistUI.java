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
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import lesson2.Doc;



public class danganlistUI
{

	public static void main(String[] args)
	{
		new DataTable1();

	}

}

class DataTable1 extends JFrame
{

	//private static final long serialVersionUID = 1L;
	
	private DefaultTableModel tableModel;
	JTable table;
	
	JButton btnSelect; 
	
	public DataTable1()
	{
		setLayout(new BorderLayout(5, 5));
		getContentPane().add(BorderLayout.NORTH, new JLabel("Table用法示例"));
		//btnSelect = new JButton("删除");
		//getContentPane().add(BorderLayout.SOUTH, btnSelect);

		
		//Object[][] cellData = {{"张三", "Administrator","123","s","a"},{"李四", "Operator","123","s","s"},{"王五", "Browser","123","s","s"}};
		Object[][] cellData = {};
		String[] columnNames = {"ID", "Creator","Timestamp","Description","Filename"};
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
		Enumeration<Doc> e=DateProcessing.getAllDocs();
		Doc doc;
		while(e.hasMoreElements())
		{
			doc=e.nextElement();
		
			//jt1[i]=new JTextField("\t ID:"+doc.getID()+"\t Creator:"+doc.getCreator()+"\t Timestamp:"+doc.getTimestamp()
			//+"\t Description:"+doc.getDescription()+"\t Filename:"+doc.getFilename());   
			String a=doc.getID();
			String b=doc.getCreator();
			String c=doc.getTimestamp();
			String d=doc.getDescription();
			String h=doc.getFilename();
			Object[] q= {a,b,c,d,h};
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
  				
  				if(JOptionPane.YES_OPTION == JOptionPane.showConfirmDialog(DataTable1.this, "是否退出？", "询问", JOptionPane.YES_NO_OPTION))
  				{
  					//WindowsAndMenu.this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  					DataTable1.this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
  				}
  				else
  				{
  					DataTable1.this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
  				}
  			}
  		});
  		
  		//setExtendedState(JFrame.MAXIMIZED_BOTH); 
  		//this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  		
  		this.setVisible(true);		
          
         
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}
	
}