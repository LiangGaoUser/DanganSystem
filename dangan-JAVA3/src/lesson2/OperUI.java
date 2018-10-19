package lesson2;
import java.awt.*;  
import java.awt.event.*;
import java.io.IOException;

import javax.swing.*;  
import javax.swing.JButton;
import java.awt.color.*;
import javax.swing.JOptionPane;
import lesson2.MainUI;  
public class OperUI extends JFrame implements ActionListener  
{  

         //定义组件  
        JButton jb1=new JButton();
        JButton jb2=new JButton(); 
        JButton jb3=new JButton();
        JButton jb4=new JButton();
        JButton jb5=new JButton();
        
        JPanel jp1,jp2,jp3,jp4,jp5,jp6=null;  
        JLabel jlb1,jlb2,jlb3,jlb4,jlb5,jlb6=null;  

        public static void main(String[] args)
        {  
          OperUI  ui=new OperUI();  
        }  


        //****************************事件判断**********************

        //构造函数  
        public  OperUI()    //不能申明为void!!!!!否则弹不出新界面  
        {  

            //创建组件  
            jb1=new JButton("用户列表");  
            jb1.setForeground(Color.BLUE);
            jb2=new JButton("更改用户角色");  
            jb2.setForeground(Color.BLUE);
            jb3=new JButton("下载档案");  
            jb3.setForeground(Color.BLUE);
            jb4=new JButton("上传档案");  
            jb4.setForeground(Color.BLUE);
            jb5=new JButton("档案列表");  
            jb5.setForeground(Color.BLUE);

            jp1=new JPanel();  
            jp2=new JPanel();  
            jp3=new JPanel();  
            jp4=new JPanel();  
            jp5=new JPanel();  
            jp6=new JPanel();  
           


            
           // jlb1=new JLabel("姓名：");  
            jlb2=new JLabel("角色：");  
          //  jlb5=new JLabel   ("rose") ;                  //(new MainUI().Operator_name);
            jlb6=new JLabel   ("Operator");
            	//")    ;                          //(new MainUI().Operator_num);

           // jp1.add(jlb1); 
           // jp1.add(jlb5);
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
       

            //设置布局管理器  
            this.setLayout(new GridLayout(6,3,50,0));  
            this.setTitle("档案管理系统");  
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
                //关闭当前界面  
                 //dispose();  
                 new userlistUI();
                }else if(e.getSource() == jb2){
                    //关闭当前界面  
                  //  dispose();  
                    new AdchangeroleUI();
                }
                else if(e.getSource() == jb3){
                    //关闭当前界面  
                  //  dispose();  
                    try {
						new AddownloadUI();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						 JOptionPane.showMessageDialog(null,"exception","提示消息",JOptionPane.WARNING_MESSAGE); 
					}
                }
                else if(e.getSource() == jb4){
                    //关闭当前界面  
                  //  dispose();  
                    try {
						new AduploadUI();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						//e1.printStackTrace();
						 JOptionPane.showMessageDialog(null,"exception","提示消息",JOptionPane.WARNING_MESSAGE);
						
					}
                }
                else if(e.getSource() == jb5){
                    //关闭当前界面  
                  //  dispose();  
                    new danganlistUI();
                }

        }  
} 