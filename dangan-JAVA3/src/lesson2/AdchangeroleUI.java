package lesson2;
import java.awt.*;  
import java.awt.event.*;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Scanner;

import javax.swing.*;

import java.awt.color.*;

import lesson2.MainUI;  
public class AdchangeroleUI extends JFrame implements ActionListener, ItemListener 
{  
	 String password;
     String role;
    static String name;
     String first;
     String second;
       static String str;/////////////
     String [] ab=new String [20];/////
     static int j=-1;///
     
    
     JTextField jT1,jT2;
     JCheckBox c[]=new JCheckBox[3];
     ButtonGroup cg=new ButtonGroup();
     String Uni[]= {"Administrator","Operator","Browser"};
     JButton jb1,jb2;
     JLabel jl1,jl2,jl3;
     JPanel jp1,jp2,jp3,jp4,jp5=null;  
    List JL1;///////////////
     
     
     
     
     
     
        public static  void main(String[] args)
        {  
          AdchangeroleUI  ui=new AdchangeroleUI();  
        }  


        //****************************�¼��ж�**********************

        //���캯��  
   
        public  AdchangeroleUI()    //��������Ϊvoid!!!!!���򵯲����½���  
        {  
        	///
        	JL1=new List();////////////
        	int i=0;//
        	
        	
        	
        	Enumeration<User> e=DateProcessing.getAllUser();
        	User user;
        	while(e.hasMoreElements())
        	{
        		user=e.nextElement();
        			//jt1[i]=new JTextField("\t Name:"+user.getName()+"\t Password:"+user.getPassword()+"\t Role:"+user.getRole()
    		//	);   
    		String a=user.getName();
    		String c=user.getPassword();
    		String b=user.getRole();
    		JL1.add(a);
    		
    		ab[i]=a;//
    		i++;//
        	}
        	
        	
        	////
        	
        	
        	
        	
        	
        	
        	
        	jl1=new JLabel("�û���:");
        	jl2=new JLabel("���Ľ�ɫΪ:");
        	jT1=new JTextField(10);
        	jb1=new JButton("ȷ��");
        	jb2=new JButton("����");
        	c[0]=new JCheckBox(Uni[0]);
            
            c[1]=new JCheckBox(Uni[1]);
         
            c[2]=new JCheckBox(Uni[2]);
            cg.add(c[0]);
            cg.add(c[1]);
            cg.add(c[2]);
        	jp1=new JPanel();
        	jp2=new JPanel();
        	jp3=new JPanel();
        	jp4=new JPanel();
        	jp1.add(jl1);
        	//jp1.add(jT1);//////////////
        	
        	jp1.add(JL1);/////////
        	
        	jp2.add(jl2);
        	jp2.add(c[0]);
        	jp3.add(c[1]);
        	jp3.add(c[2]);
        	jp4.add(jb2);
        	jp4.add(jb1);
            this.add(jp1);
            this.add(jp2);
            this.add(jp3);
        	this.add(jp4);
        	
        	// first=JOptionPane.showInputDialog("Name:");
            
             //second=JOptionPane.showInputDialog("changed Role:");
            // name=first;
          
             //role=second;
        	
        	
        	
        	
        	
        	 this.setLayout(new GridLayout(6,2));            //ѡ��GridLayout���ֹ�����        
             this.setTitle("���Ľ�ɫ");          
             this.setSize(300,500);       ////300 200  
             this.setLocation(400, 200);           
             this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    //���õ��رմ���ʱ����֤JVMҲ�˳� 
             this.setVisible(true);  
             this.setResizable(true);  
        	
        	
        	
        	
        	
        	JL1.addItemListener(this);////////////
        	jb1.addActionListener(this);
        	jb2.addActionListener(this);
        	
        	
        	
        	
        	
        	
        	
        	
        	 this.addWindowListener(new WindowAdapter()
     		{
     			@Override
     			public void windowClosing(WindowEvent e)
     			{
     				// TODO Auto-generated method stub
     				
     				if(JOptionPane.YES_OPTION == JOptionPane.showConfirmDialog(AdchangeroleUI.this, "�Ƿ��˳���", "ѯ��", JOptionPane.YES_NO_OPTION))
     				{
     					//WindowsAndMenu.this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     					AdchangeroleUI.this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
     				}
     				else
     				{
     					AdchangeroleUI.this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
     				}
     			}
     		});
     		
     		//setExtendedState(JFrame.MAXIMIZED_BOTH); 
     		//this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     		
     		this.setVisible(true);		
        	
        	
        	
        	
        	
        	
        	
        }
        ////////////
       
        	 public void itemStateChanged(ItemEvent e)
             
             {
             	// str=(String)e.getItem();
             	//
             	//System.out.println(str);
              j=(int)e.getItem();
             name=ab[j];
            	//System.out.println(e.getItem());
             }
             
        ///	
        	
        
        
        
  
        
        
        
        
        
        
        
        
        
    		public void actionPerformed(ActionEvent e) {
    			
    		
        	
    			
        	
    			
    			
    			if(e.getSource() == jb2){
               	 
                    jT1.setText(null);
                    
                 
                    c[0].setSelected(false);
                    c[1].setSelected(false);
                    c[2].setSelected(false);
                     }
                    
                   
                      
                     else   if(e.getSource() == jb1){
                            //�رյ�ǰ����  
                         //   dispose();  
                           // new ChengJiBiaoUI();
                    	 
                    	 
                    	 
                    	 	if(j==-1||(!c[0].isSelected()&&!c[1].isSelected()&&!c[2].isSelected()))  
                            {  
                                JOptionPane.showMessageDialog(null,"��ѡ�������û����ͽ�ɫ��","��ʾ��Ϣ",JOptionPane.WARNING_MESSAGE);  
                            }
                        
                       	 
                        	else
                        	{//
                    	 
                    	 
                    	 
                    	//name="w";
                    	 
                    	 
                    ////  name=jT1.getText();
                     
                   
                      if(c[0].isSelected())
                      {
                       role="Administrator";
                      }
                      else if(c[1].isSelected())
                      {
                    	  role="Operator";
                      }
                      else if(c[2].isSelected())
                      {
                    	  role="Browser";
                      }
    			
                     
    			
    			
    			
    			
        	
        	
        	
        	
    			if (((role).equals("Administrator")||(role).equals("Operator")||(role).equals("Browser")))
    			{
    				
    				//System.out.println("������ȷ");	
    	         if(	DateProcessing.update(name,role))
    	         {
    	             DateProcessing.writeUser();
    	        	 JOptionPane.showMessageDialog(null,"���½�ɫ���ɹ�","��ʾ��Ϣ",JOptionPane.WARNING_MESSAGE); 
    					
    		             
    		             jT1.setText(null);
    	         }
    	         else
    	        	 JOptionPane.showMessageDialog(null,"�û��������ڣ�����ʧ��","��ʾ��Ϣ",JOptionPane.WARNING_MESSAGE); 
 				// clear();         
 	            // dispose(); 	
 	            jT1.setText(null);
    		}//
    			else{   
    				 JOptionPane.showMessageDialog(null,"����Ľ�ɫ����","��ʾ��Ϣ",JOptionPane.WARNING_MESSAGE); 
    	 				// clear();         
    	 	            // dispose(); 	
    				  jT1.setText(null);
    				 
    			}//
    				
    			
                        	}
    		}
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
      
           

        }


	

      

  
} 






















