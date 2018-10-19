package lesson2;
import java.awt.*;  
import java.awt.event.*;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Scanner;

import javax.swing.*;

import java.awt.color.*;

import lesson2.MainUI;  
public class deleteUI extends JFrame// implements ActionListener  
{  

        JTextField jt1[]=new JTextField[20];
        JPanel jp[]=new JPanel[20];
             int i=0;
             int j=0;
             
             String name;
             String first;
             
            
        public static  void main(String[] args)
        {  
          addUI  ui=new addUI();  
        }  


        //****************************事件判断**********************

        //构造函数  
   
        public  deleteUI()    //不能申明为void!!!!!否则弹不出新界面  
        {  
              
        	
        	
        	 first=JOptionPane.showInputDialog("Name:");
             name=first;       
             //JOptionPane.showMessageDialog(null,"  删除的用户名:"+name,"已经删除该用户",JOptionPane.PLAIN_MESSAGE);
        	if(name==null)
        	{
        ;	//	JOptionPane.showMessageDialog(null,"请输入用户名！","提示消息",JOptionPane.WARNING_MESSAGE);
        	}
             
           
        	else
        	
        		
        		
         	if(!DateProcessing.delete(name))//////
         	{
         		JOptionPane.showMessageDialog(null,"没有该用户，删除失败！","提示消息",JOptionPane.WARNING_MESSAGE); 
				// clear();         
	            // dispose(); 
         		JOptionPane.showInputDialog(null);
         	}
         	
         	
         	else
         	{
         		JOptionPane.showMessageDialog(null,"删除成功！","提示消息",JOptionPane.WARNING_MESSAGE); 
				// clear();         
	            // dispose(); 
         		JOptionPane.showInputDialog(null);
         	}
         	
         	
         	
         	
    		try {
    			DateProcessing.writeUser();
    			
    		} catch (Exception e) {
    			
    			e.printStackTrace();
    		}
        		
        		
        		
         
     		
        		
      
            //设置布局管理器  
           /* this.setLayout(new GridLayout(6,3,50,0));  
            this.setTitle("增加用户");  
            this.setSize(400,300);  
            this.setLocation(200, 200);       

            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

            this.setVisible(true); */
            //jb1.addActionListener(this);
         //   jb2.addActionListener(this);


        }

       // public void actionPerformed(ActionEvent e) {  
            // if(e.getSource() == jb1){
                //关闭当前界面  
               //  dispose();  
                 //new KeChengBiaoUI();
              //  }else if(e.getSource() == jb2){
                    //关闭当前界面  
                 //   dispose();  
                   // new ChengJiBiaoUI();
              //  }

      //  }  
} 
