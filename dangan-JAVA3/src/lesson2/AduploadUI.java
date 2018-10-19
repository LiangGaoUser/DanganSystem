package lesson2;

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

import java.awt.GridLayout;
import java.awt.color.*;

import lesson2.MainUI;  
public class AduploadUI extends JFrame implements ActionListener
{  
	//private static final int a = 0;
	 int b = 0;
	String Description;
	 String Filename;
	 String ID;
     String Creator;
     String  Timestamp;
     String first;
     String second;
     String third;
    String four;
    
    
    
    JTextField jT1,jT2,jT3,jT4;
  //  JCheckBox c[]=new JCheckBox[3];
    //ButtonGroup cg=new ButtonGroup();
  //  String Uni[]= {"Administrator","Operator","Browser"};
    JButton jb1,jb2,jb3;
    JLabel jl1,jl2,jl3,jl4;
    JPanel jp1,jp2,jp3,jp4,jp5=null;  
    
    
    
    
    
    
        public static  void main(String[] args) throws IOException
        {  
        	
        	
        	
        		 AduploadUI  ui=new AduploadUI();
        	
         
        	
       
        	
        }
        //****************************�¼��ж�**********************

        //���캯��  
   
        public  AduploadUI() throws IOException    //��������Ϊvoid!!!!!���򵯲����½���  
        {  
        	
        
        	
        	
        	jl1=new JLabel("ID");
        	jl2=new JLabel("Creator");
        	jl3=new JLabel("Description");
        	jl4=new JLabel("Filename");
        	jT1=new JTextField(null,10);
        	jT2=new JTextField(null,10);
        	jT3=new JTextField(null,10);
        	jT4=new JTextField(null,10);
        	jb1=new JButton("ȷ��");
        	jb2=new JButton("����");
        	jb3=new JButton("ѡ���ļ�");
        	jp1=new JPanel();
        	jp2=new JPanel();
        	jp3=new JPanel();
        	jp4=new JPanel();
        	jp5=new JPanel();
        	jp1.add(jl1);
        	jp1.add(jT1);
        	jp2.add(jl2);
        	jp2.add(jT2);
        	jp3.add(jl3);
        	jp3.add(jT3);
        	jp4.add(jl4);
        	jp4.add(jT4);
        	jp4.add(jb3);
        	jp5.add(jb1);
        	jp5.add(jb2);
        	this.add(jp1);
         	this.add(jp2);
         	this.add(jp3);
         	this.add(jp4);
         	this.add(jp5);
   
         	jb1.addActionListener(this);
         	jb2.addActionListener(this);
         	jb3.addActionListener(this);
         	
         	//���ò��ֹ�����  
            this.setLayout(new GridLayout(5,2,0,0));  
             this.setTitle("��ӵ���");  
             this.setSize(400,300);  
             this.setLocation(200, 200);       

             this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
             this.setVisible(true); 
             
             
             
             
             
             
             
             
             
             this.addWindowListener(new WindowAdapter()
     		{
     			@Override
     			public void windowClosing(WindowEvent e)
     			{
     				// TODO Auto-generated method stub
     				
     				if(JOptionPane.YES_OPTION == JOptionPane.showConfirmDialog(AduploadUI.this, "�Ƿ��˳���", "ѯ��", JOptionPane.YES_NO_OPTION))
     				{
     					//WindowsAndMenu.this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     					AduploadUI.this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
     				}
     				else
     				{
     					AduploadUI.this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
     				}
     			}
     		});
     		
     		//setExtendedState(JFrame.MAXIMIZED_BOTH); 
     		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     		
     		this.setVisible(true);		
             
             
             
             
             
             
             
             
         	
         	
        }
        public void actionPerformed(ActionEvent e) {
        	
        	if(e.getSource()==jb2) {
        		jT1.setText(null);
        		jT2.setText(null);
        		jT3.setText(null);
        		jT4.setText(null);
        	}
        	else if(e.getSource()==jb3)
        	{
        	dlg ui=	new dlg();
        		Filename=ui.a;
        		jT4.setText(Filename);
        		//JOptionPane.showMessageDialog(null,b,"��ʾ��Ϣ",JOptionPane.WARNING_MESSAGE); 
        	}
        	else if(e.getSource()==jb1)
        	{
        		
        	
        		
        		
        		
        	 	if(jT1.getText().isEmpty()||jT2.getText().isEmpty()||jT3.getText().isEmpty()||jT4.getText().isEmpty())  
                {  
                    JOptionPane.showMessageDialog(null,"����д�����ϴ���Ϣ��","��ʾ��Ϣ",JOptionPane.WARNING_MESSAGE);  
                }
            
           	 
            	else
            	{//
        		
        		
        		
        		
        		
        	
        	
        			 try {
        				 ID=jT1.getText();
        				 Creator=jT2.getText();
        				 Description=jT3.getText();
        				 Filename=jT4.getText();
						b=DateProcessing.fileupload1(ID,Creator,Description,Filename);
						
					} catch (IOException e1) {
						// TODO Auto-generated catch block

						JOptionPane.showMessageDialog(null,"������������������","��ʾ��Ϣ",JOptionPane.WARNING_MESSAGE); 
					}	
	
        			 
        			 
        			 
        			 
        			 switch(b) {
        	case 0:
        	{
        		JOptionPane.showMessageDialog(null,"�������ظ�����������","��ʾ��Ϣ",JOptionPane.WARNING_MESSAGE); 
				     
        		jT1.setText(null);
        		
	     
	            
	             break;
        	}
        	
        	case 1:
        	{
        		JOptionPane.showMessageDialog(null,"�ϴ��ɹ�","��ʾ��Ϣ",JOptionPane.WARNING_MESSAGE); 
				 	
	             DateProcessing.writeUser();
	             break;
        	}	
        	case 2:
        	{
        		JOptionPane.showMessageDialog(null,"D��û�и��ļ�","��ʾ��Ϣ",JOptionPane.WARNING_MESSAGE); 
			        
        		jT4.setText(null);
	             break;
        	}
        	
        	case 3:
        	{
        		JOptionPane.showMessageDialog(null,"ϵͳ�е������ݸ�ʽ����!","��ʾ��Ϣ",JOptionPane.WARNING_MESSAGE); 
				// clear();         
	             dispose(); 
	             break;
        	}
        	
        	case 4:
        	
        	{

        		JOptionPane.showMessageDialog(null,"�ϴ��ɹ�","��ʾ��Ϣ",JOptionPane.WARNING_MESSAGE); 
				// clear();         
	          //   dispose(); 
        		
        		
        		
        		jT1.setText(null);
        		jT2.setText(null);
        		jT3.setText(null);
        		jT4.setText(null);
	             break;
        	}
		}//++
      
            
           

        }

      

        	}
} 




}

















