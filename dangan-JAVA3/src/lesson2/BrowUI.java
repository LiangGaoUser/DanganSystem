package lesson2;
import java.awt.*;  
import java.awt.event.*;
import java.io.IOException;

import javax.swing.*;

import lesson2.MainUI;  
public class BrowUI extends JFrame implements ActionListener  
{   
         //�������  
        JButton jb1,jb2,jb3,jb4,jb5=null;  
        JPanel jp1,jp2,jp3,jp4,jp5,jp6=null;  
        JLabel jlb1,jlb2,jlb3,jlb4,jlb5,jlb6=null;  

        public static void main(String[] args) {            
          BrowUI  ui=new BrowUI();  
        }    
        public  BrowUI()  
        {  
            //�������  
            jb1=new JButton("��ѯ������Ϣ");
            jb1.setForeground(Color.BLUE);
            jb2=new JButton("�޸ĸ�����Ϣ"); 
            jb2.setForeground(Color.BLUE);
            jb3=new JButton("���ص���"); 
            jb3.setForeground(Color.BLUE);
            jb4=new JButton("���������Ϣ"); 
            jb4.setForeground(Color.BLUE);
            jb5=new JButton("�������"); 
            jb5.setForeground(Color.BLUE);

            jp1=new JPanel();  
            jp2=new JPanel();  
            jp3=new JPanel();  
            jp4=new JPanel();  
            jp5=new JPanel();  
            jp6=new JPanel();  
            
           // jlb1=new JLabel("������");  
            jlb2=new JLabel("��ɫ��");  
     
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
            
            
            this.setLayout(new GridLayout(6,2,10,10));  //���ò��ֹ�����  
            this.setTitle("ѧ���ɼ�����ϵͳ");  
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
            	 JOptionPane.showMessageDialog(null,MainUI.name+" "+MainUI.password+" "+MainUI.role,"��ʾ��Ϣ",JOptionPane.WARNING_MESSAGE); 
            	 //System.out.println(getName()+" "+getPassword()+" "+getRole())
                 // dispose();  
                 // new KeChengGuanLiUI();                //����һ���½���  
                }else if(e.getSource() == jb2){
                  //dispose();  
                  new BrowupdateselfUI();              //����һ���½���  
                  DateProcessing.writeUser();
                }
                else if(e.getSource() == jb3){
                   // dispose();  
                    //new XueShengMingDanUI();              //����һ���½���  
                   try {
					new AddownloadUI();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					//e1.printStackTrace();
			       	 JOptionPane.showMessageDialog(null,"exception","��ʾ��Ϣ",JOptionPane.WARNING_MESSAGE); 
				}
                  }
                else if(e.getSource() == jb4){
                  // dispose();  
                    //new XueShengMingDanUI();              //����һ���½���  
                	  new userlistUI();
                  }
                else if(e.getSource() == jb5){
                  //  dispose();  
                    //new XueShengMingDanUI();              //����һ���½���  
                	new danganlistUI();
                  }

        }  
} 