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


        //****************************�¼��ж�**********************

        //���캯��  
   
        public  showselfUI()    //��������Ϊvoid!!!!!���򵯲����½���  
        {  
        	 first=JOptionPane.showInputDialog("Name:");
            
             second=JOptionPane.showInputDialog("changed Role:");
             name=first;
          
             role=second;
         
    			if (((role).equals("Browser")||(role).equals("Operator")||(role).equals("Operator")))
    			{
    				
    				//System.out.println("������ȷ");	
    	         if(	DateProcessing.update(name,role))
    	         {
    	        	 JOptionPane.showMessageDialog(null,"���½�ɫ���ɹ�","��ʾ��Ϣ",JOptionPane.WARNING_MESSAGE); 
    					// clear();         
    		             dispose(); 	
    		             DateProcessing.writeUser();
    	         }
    	         else
    	        	 JOptionPane.showMessageDialog(null,"�û��������ڣ�����ʧ��","��ʾ��Ϣ",JOptionPane.WARNING_MESSAGE); 
 				// clear();         
 	             dispose(); 	
    		
    		}//
    			else{   
    				 JOptionPane.showMessageDialog(null,"����Ľ�ɫ����","��ʾ��Ϣ",JOptionPane.WARNING_MESSAGE); 
    	 				// clear();         
    	 	             dispose(); 	
    			}//
    				
    			
    		
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
      
            //���ò��ֹ�����  
           /*this.setLayout(new GridLayout(6,3,50,0));  
            this.setTitle("�ı��û���Ϣ");  
            this.setSize(400,300);  
            this.setLocation(200, 200);       

            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
            this.setVisible(true); */
           

        }

      

  
} 






















