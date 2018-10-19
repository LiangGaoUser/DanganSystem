package lesson2;
import java.awt.*;  
import java.awt.event.*;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Scanner;

import javax.swing.*;

import java.awt.color.*;

import lesson2.MainUI;  
public class AdchangeUI extends JFrame implements ActionListener  
{  

        
        JPanel jp1=new JPanel();
        JPanel jp2=new JPanel();
        JPanel jp3=new JPanel();
             JButton j1,j2;
            JLabel jl1;
        public static  void main(String[] args)
        {  
          AdchangeUI  ui=new AdchangeUI();  
        }  


        //****************************事件判断**********************

        //构造函数  
   
        public  AdchangeUI()    //不能申明为void!!!!!否则弹不出新界面  
        {  
             
           
        	jl1=new JLabel ("选择操作");
        	j1=new JButton("改变用户角色");
        	j2=new JButton("改变用户密码");
        	jp1.add(jl1);
        	jp2.add(j1)	;
        	jp3.add(j2);
        	
        		this.add(jp1);
        		this.add(jp2);
        		this.add(jp3);
             
         	
      
            //设置布局管理器  
           this.setLayout(new GridLayout(6,3,50,0));  
            this.setTitle("改变用户信息");  
            this.setSize(400,300);  
            this.setLocation(200, 200);       

            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
            this.setVisible(true); 
            j1.addActionListener(this);
           j2.addActionListener(this);
           
           
           
           
           
           
           this.addWindowListener(new WindowAdapter()
     		{
     			@Override
     			public void windowClosing(WindowEvent e)
     			{
     				// TODO Auto-generated method stub
     				
     				if(JOptionPane.YES_OPTION == JOptionPane.showConfirmDialog(AdchangeUI.this, "是否退出？", "询问", JOptionPane.YES_NO_OPTION))
     				{
     					//WindowsAndMenu.this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     					AdchangeUI.this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
     				}
     				else
     				{
     					AdchangeUI.this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
     				}
     			}
     		});
     		
     		//setExtendedState(JFrame.MAXIMIZED_BOTH); 
     		//this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     		
     		this.setVisible(true);		
             
           
           
           
           


        }

        public void actionPerformed(ActionEvent e) {  
             if(e.getSource() == j1){
                //关闭当前界面  
                 dispose();  
                 new AdchangeroleUI();
               }else if(e.getSource() == j2){
                    //关闭当前界面  
                    dispose();  
                    new AdchangepassUI();
               }

       }  
} 






















