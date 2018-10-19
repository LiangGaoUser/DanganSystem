package lesson2;
import java.awt.*;  
import java.awt.event.*;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Scanner;

import javax.swing.*;

import java.awt.color.*;

import lesson2.MainUI;  
public class AdchangepassUI extends JFrame implements ActionListener
{  
	 String password;
     String name;
     String first;
     String second;
    
        
     
     JTextField jT1,jT2;
     JButton jb1,jb2;
     JLabel jl1,jl2,jl3;
     JPanel jp1,jp2,jp3,jp4,jp5=null;
     
     
     
     
     
     
     
      
        public static  void main(String[] args)
        {  
          AdchangepassUI  ui=new AdchangepassUI();  
        }  


        //****************************事件判断**********************

        //构造函数  
   
        public  AdchangepassUI()    //不能申明为void!!!!!否则弹不出新界面  
        {   
        	 //first=JOptionPane.showInputDialog("Name:");
            // 
            // second=JOptionPane.showInputDialog("New Password:");
            // name=first;
           // password=second;
        	
        	jT1=new JTextField(10);
        	jT2=new JTextField(10);
        	jl1=new JLabel("用户名:");
        	jl2=new JLabel("新密码:");
        	jb1=new JButton("确定");
        	jb2=new JButton("重置");
        	jp1=new JPanel();
        	jp2=new JPanel();
        	jp3=new JPanel();
        	jp1.add(jl1);
        	jp1.add(jT1);
        	jp2.add(jl2);
        	jp2.add(jT2);
        	jp3.add(jb1);
        	jp3.add(jb2);
        	this.add(jp1);
        
        	this.add(jp2);
        	
        	
        	this.add(jp3);
        	jb1.addActionListener(this);
        	jb2.addActionListener(this);
        	
        	
        	
        	

       	 this.setLayout(new GridLayout(6,2));            //选择GridLayout布局管理器        
            this.setTitle("更改密码");          
            this.setSize(300,200);         
            this.setLocation(400, 200);           
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    //设置当关闭窗口时，保证JVM也退出 
            this.setVisible(true);  
            this.setResizable(true);  
       	
        	
        	

       	 this.addWindowListener(new WindowAdapter()
    		{
    			@Override
    			public void windowClosing(WindowEvent e)
    			{
    				// TODO Auto-generated method stub
    				
    				if(JOptionPane.YES_OPTION == JOptionPane.showConfirmDialog(AdchangepassUI.this, "是否退出？", "询问", JOptionPane.YES_NO_OPTION))
    				{
    					//WindowsAndMenu.this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    					AdchangepassUI.this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    				}
    				else
    				{
    					AdchangepassUI.this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    				}
    			}
    		});
    		
    		//setExtendedState(JFrame.MAXIMIZED_BOTH); 
    		//this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    		
    		this.setVisible(true);		
       		
        	
        	
        	
        	
        }
        	
       
		public void actionPerformed(ActionEvent e) {
			
			if(e.getSource() == jb2){
              	 
                jT1.setText(null);
                jT2.setText(null);
             
                
                 }
                
               
                  
                 else   if(e.getSource() == jb1){
        	
                	 
                	
                	 
                	 
                	 	if(jT1.getText().isEmpty()||jT2.getText().isEmpty())  
                        {  
                            JOptionPane.showMessageDialog(null,"请填写完整用户名和密码！","提示消息",JOptionPane.WARNING_MESSAGE);  
                        }
                    
                   	 
                    	else
                    	{// 
                	 
                	 
                	 
                	 
                	 
                	 
                	 
                	 
                	 
                	 
                	 name=jT1.getText();
        	password=jT2.getText();
        	
        	
        	
        	
        	
        	
        	if(DateProcessing.updateName1(name, password))
        	{
        		DateProcessing.writeUser();
        		 JOptionPane.showMessageDialog(null,"更新密码成功","提示消息",JOptionPane.WARNING_MESSAGE); 
        		 

        		 jT1.setText(null);
        		 jT2.setText(null);
			// clear();         
             //dispose(); 	
        	}
        	else
        	{
        		 JOptionPane.showMessageDialog(null,"没有该用户，更新失败！","提示消息",JOptionPane.WARNING_MESSAGE); 
					// clear();         
		            // dispose(); 	
        		 
        		 jT1.setText(null);
        		 jT2.setText(null);
        	}
			
                    	} 
        
      
      

        }

      

  
} 


}



















