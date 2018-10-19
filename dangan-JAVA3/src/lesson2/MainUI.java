package lesson2;
 
import javax.swing.*;

import lesson2.DateProcessing;
import lesson2.User;

import java.awt.*;  
import java.awt.event.ActionEvent;  
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;            
import java.io.IOException;  

public class MainUI extends JFrame implements ActionListener {  
	static   String name ,password,role;
    //�������   
    JButton jb1,jb2,jb3=null;  
    JRadioButton jrb1,jrb2,jrb3=null;  
    JPanel jp1,jp2,jp3,jp4=null;  
    JTextField jtf=null;  
    JLabel jlb1,jlb2,jlb3=null;  
    JTextField jpf=null;  
    ButtonGroup bg=null;  
public String getName()
{
	return name;
}
public String getpassword()
{
	return password;
}
public String getRole()
{
	return role;
}

    public static void main(String[] args) {  

    	
    
    	
        MainUI ui=new MainUI();  
    }  
    public MainUI()  
    {  
    	try {
			DateProcessing.Init() ;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DataException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	
         //�������  
        jb1=new JButton("��¼");  
        jb2=new JButton("����"); 
        jb3=new JButton("�˳�");

        //���ü���  
        jb1.addActionListener(this);  
        jb2.addActionListener(this);  
        jb3.addActionListener(this);  

      
        bg=new ButtonGroup();  
        bg.add(jrb1);  
        bg.add(jrb2);  
        bg.add(jrb3);
        jp1=new JPanel();  
        jp2=new JPanel();  
        jp3=new JPanel();  
        jp4=new JPanel();                 

        jlb1=new JLabel("�û�����");  
        jlb2=new JLabel("��    �룺");  
       
        jtf=new JTextField(10);  
        jpf=new JTextField(10);  
        //���뵽JPanel��  
        jp1.add(jlb1);  
        jp1.add(jtf);  

        jp2.add(jlb2);  
        jp2.add(jpf);  

      
        jp4.add(jb1);       //��Ӱ�ť
        jp4.add(jb2);  
        jp4.add(jb3);

        //����JFrame��  
        this.add(jp1);  
        this.add(jp2);  
        this.add(jp3);  
        this.add(jp4);  

        this.setLayout(new GridLayout(4,1));            //ѡ��GridLayout���ֹ�����        
        this.setTitle("��������ϵͳ");          
        this.setSize(300,200);         
        this.setLocation(400, 200);           
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    //���õ��رմ���ʱ����֤JVMҲ�˳� 
        this.setVisible(true);  
        this.setResizable(true);  

    }  

    public void actionPerformed(ActionEvent e) {            //�¼��ж�

        if(e.getActionCommand()=="��¼")  /////////////////////
        {  
          
          
        	 name=jtf.getText();
    		 password=jpf.getText();
    		//String role;
    		
    	User use=DateProcessing.search(name,password);
    	 
    			if(use!=null)////
    			{
    				role=use.getRole();
    				 JOptionPane.showMessageDialog(null,"��¼�ɹ���","��ʾ��Ϣ",JOptionPane.WARNING_MESSAGE); 
    				 clear();         
    	             //dispose(); 
    	            switch(role) {
    	            case "Browser"://
    	             {
    	            	 //BrowUI ui=new BrowUI();
    	            	 WindowsAndMenu ui=new WindowsAndMenu("Browser");
    	            	 break;
    	              //����һ���½��� 
    			      }
    	            case "Administrator":
    	             {
    	            	 //AdmiUI ui=new AdmiUI();
    	            	WindowsAndMenu1 ui=new WindowsAndMenu1("Administrator");
    	            	
    	            	 break;
    	             }
    	            case "Operator" :
    	             {
    	            		WindowsAndMenu2 ui=new WindowsAndMenu2("Operator");
    	            	 //OperUI ui=new OperUI();
    	            	 break;
    	             }
    	           
    	             
        	
    			}
    			}
        
        else////
        {
        
        	
        	
        	
        	
        	if(jtf.getText().isEmpty()&&jpf.getText().isEmpty())  
            {  
                JOptionPane.showMessageDialog(null,"�������û��������룡","��ʾ��Ϣ",JOptionPane.WARNING_MESSAGE);  
            }
        	else if(jtf.getText().isEmpty())  
            {  
                JOptionPane.showMessageDialog(null,"�������û�����","��ʾ��Ϣ",JOptionPane.WARNING_MESSAGE);  
            }
        	else  if(jpf.getText().isEmpty())
            {  
                JOptionPane.showMessageDialog(null,"���������룡","��ʾ��Ϣ",JOptionPane.WARNING_MESSAGE);  
            
            }
        	else
        		JOptionPane.showMessageDialog(null,"��¼ʧ��,�������","��ʾ��Ϣ",JOptionPane.WARNING_MESSAGE); 
			 clear();         
            //dispose(); 

        }
    }

    else if (e.getActionCommand()=="����")  ////////////////
        {  
                  clear();  
        }             

    else if (e.getActionCommand()=="�˳�")  ////////////////
    {  
             System.exit(0); 
    
  
    }                                             

        
    }  
        
      /* this.addWindowListener(new WindowAdapter()
    	{
    		@Override
    		public void windowClosing(WindowEvent e)
    		{
    			// TODO Auto-generated method stub
    			
    			if(JOptionPane.YES_OPTION == JOptionPane.showConfirmDialog(MainUI.this, "�Ƿ��˳���", "ѯ��", JOptionPane.YES_NO_OPTION))
    			{
    				//WindowsAndMenu.this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    				MainUI.this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    			}
    			else
    			{
    			MainUI.this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    			}
    		}
    	});
    	
    	setExtendedState(JFrame.MAXIMIZED_BOTH); 
    	//this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	
    	this.setVisible(true);		
       
    
    }*/
    
    
    
    //����ı���������  
    public  void clear()  
    {  
        jtf.setText("");  
        jpf.setText("");  
    }  

} 
