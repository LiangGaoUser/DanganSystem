package lesson2;
import java.awt.*;  
import java.awt.event.*;
import java.io.IOException;

import javax.swing.*;  
import javax.swing.JButton;
import java.awt.color.*;
import javax.swing.JOptionPane;
import lesson2.MainUI;  
public class AdmiUI extends JFrame implements ActionListener  
{  

         //�������  
        JButton jb1=new JButton();
        JButton jb2=new JButton(); 
        JButton jb3=new JButton();
        JButton jb4=new JButton();
        JButton jb5=new JButton();
        JButton jb6=new JButton();
        JButton jb7=new JButton();
        
        JPanel jp1,jp2,jp3,jp4,jp5,jp6,jp7,jp8=null;  
        JLabel jlb1,jlb2,jlb3,jlb4,jlb5,jlb6=null;  

        public static void main(String[] args)
        {  
          AdmiUI  ui=new AdmiUI();  
        }  


        //****************************�¼��ж�**********************

        //���캯��  
        public  AdmiUI()    //��������Ϊvoid!!!!!���򵯲����½���  
        {  

            //�������  
            jb1=new JButton("�����û�");  
            jb1.setForeground(Color.BLUE);
            jb2=new JButton("ɾ���û�");  
            jb2.setForeground(Color.BLUE);
            jb3=new JButton("�û��б�");  
            jb3.setForeground(Color.BLUE);
            jb4=new JButton("�ı��û���ɫ");  
            jb4.setForeground(Color.BLUE);
            jb5=new JButton("�����б�");  
            jb5.setForeground(Color.BLUE);
            jb6=new JButton("���ص���");  
            jb6.setForeground(Color.BLUE);
            jb7=new JButton("�ϴ�����");  
            jb7.setForeground(Color.BLUE);
          
            jp1=new JPanel();  
            jp2=new JPanel();  
            jp3=new JPanel();  
            jp4=new JPanel();  
            jp5=new JPanel();  
            jp6=new JPanel();  
            jp7=new JPanel();  
            jp8=new JPanel();  
           


            
            //jlb1=new JLabel("������");  
            jlb2=new JLabel("��ɫ��");  
           // jlb5=new JLabel   ("kate") ;                  //(new MainUI().Operator_name);
            jlb6=new JLabel   ("Administrator");
            	//")    ;                          //(new MainUI().Operator_num);

          //  jp1.add(jlb1); 
           // jp1.add(jlb5);
            jp1.add(jlb2);  
            jp1.add(jlb6);


            jp2.add(jb1);  
            
            jp3.add(jb2);
            jp4.add(jb3); 
            jp5.add(jb4);
            jp6.add(jb5);
            jp7.add(jb6);
            jp8.add(jb7);
            this.add(jp1);  
            this.add(jp2);  
            this.add(jp3);
            
            this.add(jp4);  
            this.add(jp5);  
            this.add(jp6);  
            this.add(jp7);  
            this.add(jp8);

            //���ò��ֹ�����  
            this.setLayout(new GridLayout(8,3,50,0));  
            this.setTitle("��������ϵͳ");  
            this.setSize(400,300);  
            this.setLocation(200, 200);       

            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

            this.setVisible(true); 
            jb1.addActionListener(this);
            jb2.addActionListener(this);
            jb3.addActionListener(this);
            jb4.addActionListener(this);
            jb5.addActionListener(this);
            jb6.addActionListener(this);
            jb7.addActionListener(this);

        }

        public void actionPerformed(ActionEvent e) {  
           
        
        	
        	if(e.getSource() == jb1){
                //�رյ�ǰ����  
               //  dispose();  
                 new addUI();
                }
             else if(e.getSource() == jb2){
                    //�رյ�ǰ����  
                   // dispose();  
                    new deleteUI();
                }
            else if(e.getSource()==jb3)
            {
            	//dispose();
           //	new OperUI();
        //   new	userlistUI();
            	new DataTable();////////
             }
   
        else if(e.getSource()==jb4)
        {
        	//dispose();
       //	new OperUI();
       new	AdchangeUI();
         }
            else if(e.getSource()==jb5)
            {
            	//dispose();
           new	danganlistUI();

        }  
        	
            else if(e.getSource()==jb6)
            {
            	//dispose();
           try {
			new	AddownloadUI();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null,"exception","��ʾ��Ϣ",JOptionPane.WARNING_MESSAGE);
		}

        }  
        	
        	
        	
        	
            else if(e.getSource()==jb7)
            {
            	//dispose();
           try {
			new	AduploadUI();
		} catch (IOException e1) {
			JOptionPane.showMessageDialog(null,"exception","��ʾ��Ϣ",JOptionPane.WARNING_MESSAGE); //////////////////
		}

           
           
           
           
           
           
           
        }  	
        	
} 
        
  
}
        
        
        
        
        
        
        