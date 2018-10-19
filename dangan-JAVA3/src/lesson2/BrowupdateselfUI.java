package lesson2;
import java.awt.*;  
import java.awt.event.*;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Scanner;

import javax.swing.*;

import java.awt.color.*;

import lesson2.MainUI;  
public class BrowupdateselfUI extends JFrame implements ActionListener  
{  
	 String password;
     String name;
     String Password;
   
    JTextField jT1,jT2,jT3;
    JButton jb1,jb2;
    JLabel jl1,jl2,jl3;
    JPanel jp1,jp2,jp3,jp4=null;
    
   
    
    
        public static  void main(String[] args)
        {  
        	BrowupdateselfUI  ui=new BrowupdateselfUI();  
        }  


        //****************************事件判断**********************

        //构造函数  
   
        public  BrowupdateselfUI()    //不能申明为void!!!!!否则弹不出新界面  
        {   
        	 
            
            
            
            
        	jT1=new JTextField(10);
        	jT2=new JTextField(10);
        	jT3=new JTextField(10);
        	jl1=new JLabel("用户名:");
        	jl2=new JLabel("旧密码:");
        	jl3=new JLabel("新密码");
        	jb1=new JButton("确定");
        	jb2=new JButton("重置");
        	jp1=new JPanel();
        	jp2=new JPanel();
        	jp3=new JPanel();
        	jp4=new JPanel();
        	jp1.add(jl1);
        	jp1.add(jT1);
        	jp2.add(jl2);
        	jp2.add(jT2);
        	jp3.add(jl3);
        	jp3.add(jT3);
        	jp4.add(jb1);
        	jp4.add(jb2);
        	this.add(jp1);
        
        	this.add(jp2);
        	
        	
        	this.add(jp3);
        	this.add(jp4);
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
       				
       				if(JOptionPane.YES_OPTION == JOptionPane.showConfirmDialog(BrowupdateselfUI.this, "是否退出？", "询问", JOptionPane.YES_NO_OPTION))
       				{
       					//WindowsAndMenu.this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       					BrowupdateselfUI.this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
       				}
       				else
       				{
       					BrowupdateselfUI.this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
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
                jT3.setText(null);
                
                 }
                
               
                  
                 else   if(e.getSource() == jb1){
        		
		

             	 	if(jT1.getText().isEmpty()||jT2.getText().isEmpty()||jT3.getText().isEmpty())  
                     {  
                         JOptionPane.showMessageDialog(null,"请填写完整用户名和密码！","提示消息",JOptionPane.WARNING_MESSAGE);  
                     }
                 
                	 
                 	else
                 	{// 
        
                   name=jT1.getText();
                   password=jT2.getText();
                   Password=jT3.getText();
            
            
            int	b=DateProcessing.updateself1(name,password,Password);
			
    		switch(b) {
            	case 2:
            	{
            		MainUI.password=jT2.getText();
            		JOptionPane.showMessageDialog(null,"更新密码成功","提示消息",JOptionPane.WARNING_MESSAGE); 
    				// clear();         
    	             //dispose(); 
            		jT1.setText(null);
            		jT2.setText(null);
            		jT3.setText(null);
    	             break;
            	}
            	
            	case 3:
            	{
            		JOptionPane.showMessageDialog(null,"输入的密码错误请重新输入","提示消息",JOptionPane.WARNING_MESSAGE); 
    				// clear();         
    	            // dispose();
            		jT1.setText(null);
            		jT2.setText(null);
            		jT3.setText(null);
    	            break;
            	}	
            	
            	
            	
            	case 4:
            	
            	{

            		JOptionPane.showMessageDialog(null,"没有该用户请重新输入用户名","提示消息",JOptionPane.WARNING_MESSAGE); 
    				// clear();         
    	             //dispose(); 
            		jT1.setText(null);
            		jT2.setText(null);
            		jT3.setText(null);
    	             break;
            	}
            	
        	
            	
            	
            	
            	
            	
            	
            	
            	

        }

      

  
}


	
}

		}
}



















