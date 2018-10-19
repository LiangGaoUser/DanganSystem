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


        //****************************事件判断**********************

        //构造函数  
   
        public  AddownloadUI() throws IOException    //不能申明为void!!!!!否则弹不出新界面  
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
        		JOptionPane.showMessageDialog(null,"下载失败！ 档案文件已经被破坏","提示消息",JOptionPane.WARNING_MESSAGE); 
				// clear();         
	             dispose(); 	
	             break;
        	}
        	
        	case 3:
        	{
        		JOptionPane.showMessageDialog(null,"下载完成","提示消息",JOptionPane.WARNING_MESSAGE); 
				// clear();         
	             //dispose(); 
        		JOptionPane.showInputDialog(null);
	            break;
        	}	
        	
        	
        	
        	case 4:
        	
        	{

        		JOptionPane.showMessageDialog(null,"下载失败！没有该档案名","提示消息",JOptionPane.WARNING_MESSAGE); 
				// clear();         
	           //  dispose(); 
        		JOptionPane.showInputDialog(null);
	             break;
        	}
        	
      
            //设置布局管理器  
           /*this.setLayout(new GridLayout(6,3,50,0));  
            this.setTitle("改变用户信息");  
            this.setSize(400,300);  
            this.setLocation(200, 200);       

            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
            this.setVisible(true); */
           

        }

      

  
} 

}

}


















