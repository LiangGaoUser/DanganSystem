package lesson2;
import java.awt.*;  
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

import javax.swing.*;

import java.awt.color.*;

import lesson2.MainUI;  
public class AddownloadUI extends JFrame 
{  
	private static final int a = 0;
	String Description;
	String Filename;
	 String ID;
     String Creator;
     String  Timestamp;
     String first;
    
        public static  void main(String[] args) throws IOException
        {  
          AddownloadUI  ui=new AddownloadUI();  
        }  


        //****************************�¼��ж�**********************

        //���캯��  
   
        public  AddownloadUI() throws IOException    //��������Ϊvoid!!!!!���򵯲����½���  
        {  
        	
        	first=JOptionPane.showInputDialog("ID:");
            
            ID=first;
       	if(ID==null) {
       		;
       	}
       	else {
		int	b=DateProcessing.updownload1(ID);
				
		switch(b) {
        	case 2:
        	{
        		JOptionPane.showMessageDialog(null,"����ʧ�ܣ� �����ļ��Ѿ����ƻ�","��ʾ��Ϣ",JOptionPane.WARNING_MESSAGE); 
				// clear();         
	             dispose(); 	
	             break;
        	}
        	
        	case 3:
        	{
        		JOptionPane.showMessageDialog(null,"�������","��ʾ��Ϣ",JOptionPane.WARNING_MESSAGE); 
				// clear();         
	             //dispose(); 
        		JOptionPane.showInputDialog(null);
	            break;
        	}	
        	
        	
        	
        	case 4:
        	
        	{

        		JOptionPane.showMessageDialog(null,"����ʧ�ܣ�û�иõ�����","��ʾ��Ϣ",JOptionPane.WARNING_MESSAGE); 
				// clear();         
	           //  dispose(); 
        		JOptionPane.showInputDialog(null);
	             break;
        	}
        	
      
            //���ò��ֹ�����  
           /*this.setLayout(new GridLayout(6,3,50,0));  
            this.setTitle("�ı��û���Ϣ");  
            this.setSize(400,300);  
            this.setLocation(200, 200);       

            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
            this.setVisible(true); */
           

        }

      

  
} 

}

}


















