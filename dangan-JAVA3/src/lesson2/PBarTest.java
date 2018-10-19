package lesson2;
import java.awt.*;  
import java.awt.event.*;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Scanner;

import javax.swing.*;

import java.awt.color.*;

import lesson2.MainUI;  
public class PBarTest extends JFrame   
{  

        
             int i=0;
             int j=0;
             String password;
             String role;
             String name;
             JTextField jT1,jT2;
             Checkbox c[]=new Checkbox[3];
             String Uni[]= {"Administrator","Operator","Browser"};
             JButton Jb1;
             JLabel jl1,jl2,jl3;
             JPanel jp1,jp2,jp3,jp4,jp5,jp6,jp7;
             public static  void main(String[] args)
              {  
                 addUI  ui=new addUI();  
              }
        public  void PBarTest()//addUI()    //不能申明为void!!!!!否则弹不出新界面  
        {  
              
        	
        	setLayout(new GridLayout(5,2));
        	jl1=new JLabel("姓名");
        	jl2=new JLabel("密码");
        	jl3=new JLabel("请选择角色");
        	Jb1=new JButton("确定");
           jT1=new JTextField(null,30);
            jT2=new JTextField(null,30);
           
            add(jl1);
            add(jT1);
            add(jl2);
            add(jT2);
            add(jl3);
         
          c[0]=new Checkbox(Uni[0]);
 
          c[1]=new Checkbox(Uni[1]);
  
          c[2]=new Checkbox(Uni[2]);
          add(c[0]);
          add(c[1]);
          add(c[2]);
     
        }

        }

