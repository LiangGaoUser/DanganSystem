package lesson2;
import java.awt.*;  
import java.awt.event.*;
import java.io.IOException;

import javax.swing.*;

import lesson2.MainUI;  
public class BrowUI extends JFrame implements ActionListener  
{   
         //定义组件  
        JButton jb1,jb2,jb3,jb4,jb5=null;  
        JPanel jp1,jp2,jp3,jp4,jp5,jp6=null;  
        JLabel jlb1,jlb2,jlb3,jlb4,jlb5,jlb6=null;  

        public static void main(String[] args) {            
          BrowUI  ui=new BrowUI();  
        }    
        public  BrowUI()  
        {  
            //创建组件  
            jb1=new JButton("查询个人信息");
            jb1.setForeground(Color.BLUE);
            jb2=new JButton("修改个人信息"); 
            jb2.setForeground(Color.BLUE);
            jb3=new JButton("下载档案"); 
            jb3.setForeground(Color.BLUE);
            jb4=new JButton("浏览他人信息"); 
            jb4.setForeground(Color.BLUE);
            jb5=new JButton("浏览档案"); 
            jb5.setForeground(Color.BLUE);

            jp1=new JPanel();  
            jp2=new JPanel();  
            jp3=new JPanel();  
            jp4=new JPanel();  
            jp5=new JPanel();  
            jp6=new JPanel();  
            
           // jlb1=new JLabel("姓名：");  
            jlb2=new JLabel("角色：");  
     
           // jlb5=new JLabel   ("jack")       ;                    //(new MainUI().Administrator_name);
            jlb6=new JLabel ("Browser")     ;          //(new MainUI().Administrator_num);

          //  jp1.add(jlb1); 
          //  jp1.add(jlb5);
            jp1.add(jlb2);  
            jp1.add(jlb6);
            jp2.add(jb1);
            jp3.add(jb2);
            jp4.add(jb3);
            jp5.add(jb4);
            jp6.add(jb5);

            
            this.add(jp1);  
            this.add(jp2);  
            this.add(jp3);     
            this.add(jp4);   
            this.add(jp5);   
            this.add(jp6);   
            
            
            this.setLayout(new GridLayout(6,2,10,10));  //设置布局管理器  
            this.setTitle("学生成绩管理系统");  
            this.setSize(400,300);  
            this.setLocation(200, 200);       
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
            this.setVisible(true);            
          
            jb1.addActionListener(this);
            jb2.addActionListener(this);
            jb3.addActionListener(this);
            jb4.addActionListener(this);
            jb5.addActionListener(this);
           
            
            
            
            
            
}  
        public void actionPerformed(ActionEvent e) {  
             if(e.getSource() == jb1){     
            	 JOptionPane.showMessageDialog(null,MainUI.name+" "+MainUI.password+" "+MainUI.role,"提示消息",JOptionPane.WARNING_MESSAGE); 
            	 //System.out.println(getName()+" "+getPassword()+" "+getRole())
                 // dispose();  
                 // new KeChengGuanLiUI();                //创建一个新界面  
                }else if(e.getSource() == jb2){
                  //dispose();  
                  new BrowupdateselfUI();              //创建一个新界面  
                  DateProcessing.writeUser();
                }
                else if(e.getSource() == jb3){
                   // dispose();  
                    //new XueShengMingDanUI();              //创建一个新界面  
                   try {
					new AddownloadUI();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					//e1.printStackTrace();
			       	 JOptionPane.showMessageDialog(null,"exception","提示消息",JOptionPane.WARNING_MESSAGE); 
				}
                  }
                else if(e.getSource() == jb4){
                  // dispose();  
                    //new XueShengMingDanUI();              //创建一个新界面  
                	  new userlistUI();
                  }
                else if(e.getSource() == jb5){
                  //  dispose();  
                    //new XueShengMingDanUI();              //创建一个新界面  
                	new danganlistUI();
                  }

        }  
} 