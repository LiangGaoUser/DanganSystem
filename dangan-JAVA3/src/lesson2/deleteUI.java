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


        //****************************�¼��ж�**********************

        //���캯��  
   
        public  deleteUI()    //��������Ϊvoid!!!!!���򵯲����½���  
        {  
              
        	
        	
        	 first=JOptionPane.showInputDialog("Name:");
             name=first;       
             //JOptionPane.showMessageDialog(null,"  ɾ�����û���:"+name,"�Ѿ�ɾ�����û�",JOptionPane.PLAIN_MESSAGE);
        	if(name==null)
        	{
        ;	//	JOptionPane.showMessageDialog(null,"�������û�����","��ʾ��Ϣ",JOptionPane.WARNING_MESSAGE);
        	}
             
           
        	else
        	
        		
        		
         	if(!DateProcessing.delete(name))//////
         	{
         		JOptionPane.showMessageDialog(null,"û�и��û���ɾ��ʧ�ܣ�","��ʾ��Ϣ",JOptionPane.WARNING_MESSAGE); 
				// clear();         
	            // dispose(); 
         		JOptionPane.showInputDialog(null);
         	}
         	
         	
         	else
         	{
         		JOptionPane.showMessageDialog(null,"ɾ���ɹ���","��ʾ��Ϣ",JOptionPane.WARNING_MESSAGE); 
				// clear();         
	            // dispose(); 
         		JOptionPane.showInputDialog(null);
         	}
         	
         	
         	
         	
    		try {
    			DateProcessing.writeUser();
    			
    		} catch (Exception e) {
    			
    			e.printStackTrace();
    		}
        		
        		
        		
         
     		
        		
      
            //���ò��ֹ�����  
           /* this.setLayout(new GridLayout(6,3,50,0));  
            this.setTitle("�����û�");  
            this.setSize(400,300);  
            this.setLocation(200, 200);       

            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

            this.setVisible(true); */
            //jb1.addActionListener(this);
         //   jb2.addActionListener(this);


        }

       // public void actionPerformed(ActionEvent e) {  
            // if(e.getSource() == jb1){
                //�رյ�ǰ����  
               //  dispose();  
                 //new KeChengBiaoUI();
              //  }else if(e.getSource() == jb2){
                    //�رյ�ǰ����  
                 //   dispose();  
                   // new ChengJiBiaoUI();
              //  }

      //  }  
} 
