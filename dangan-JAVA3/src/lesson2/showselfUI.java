package lesson2;
import java.awt.*;  
import java.awt.event.*;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Scanner;

import javax.swing.*;

import java.awt.color.*;

import lesson2.MainUI;  
public class showselfUI extends JFrame 
{  
	 String password;
     String role;
     String name;
     String first;
     String second;
    
        public static  void main(String[] args)
        {  
          showselfUI  ui=new showselfUI();  
        }  


        //****************************事件判断**********************

        //构造函数  
   
        public  showselfUI()    //不能申明为void!!!!!否则弹不出新界面  
        {  
        	 first=JOptionPane.showInputDialog("Name:");
            
             second=JOptionPane.showInputDialog("changed Role:");
             name=first;
          
             role=second;
         
    			if (((role).equals("Browser")||(role).equals("Operator")||(role).equals("Operator")))
    			{
    				
    				//System.out.println("输入正确");	
    	         if(	DateProcessing.update(name,role))
    	         {
    	        	 JOptionPane.showMessageDialog(null,"更新角色名成功","提示消息",JOptionPane.WARNING_MESSAGE); 
    					// clear();         
    		             dispose(); 	
    		             DateProcessing.writeUser();
    	         }
    	         else
    	        	 JOptionPane.showMessageDialog(null,"用户名不存在，更新失败","提示消息",JOptionPane.WARNING_MESSAGE); 
 				// clear();         
 	             dispose(); 	
    		
    		}//
    			else{   
    				 JOptionPane.showMessageDialog(null,"输入的角色错误","提示消息",JOptionPane.WARNING_MESSAGE); 
    	 				// clear();         
    	 	             dispose(); 	
    			}//
    				
    			
    		
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
      
            //设置布局管理器  
           /*this.setLayout(new GridLayout(6,3,50,0));  
            this.setTitle("改变用户信息");  
            this.setSize(400,300);  
            this.setLocation(200, 200);       

            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
            this.setVisible(true); */
           

        }

      

  
} 






















