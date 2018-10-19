package lesson2;
import java.awt.*;  
import java.awt.event.*;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Scanner;

import javax.swing.*;

import java.awt.color.*;

import lesson2.MainUI;  
    
        
        
        //package write;
        import java.applet.Applet;
        
        //import javax.swing.*;

     
        public class addUI extends JFrame implements ActionListener  
        {  

                
                     
                     String password;
                     String role;
                     String name;
                     JTextField jT1,jT2;
                     JCheckBox c[]=new JCheckBox[3];
                     ButtonGroup cg=new ButtonGroup();
                     String Uni[]= {"Administrator","Operator","Browser"};
                     JButton jb1,jb2;
                     JLabel jl1,jl2,jl3;
                     JPanel jp1,jp2,jp3,jp4,jp5=null;  
                    
                    
           public static  void main(String[] args)
                {  
                addUI  ui=new addUI();  
                }  
//

                //****************************事件判断**********************

                //构造函数  
           
                public   addUI()//addUI()    //不能申明为void!!!!!否则弹不出新界面  
                {  
                	jp1=new JPanel();  
                    jp2=new JPanel();  
                    jp3=new JPanel();  
                    jp4=new JPanel();
                    jp5=new JPanel();
                	//setLayout(new GridLayout(5,2));
                	jl1=new JLabel("姓名");
                	jl2=new JLabel("密码");
                	jl3=new JLabel("请选择角色");
                	jb1=new JButton("确定");
                	jb2=new JButton("重置");
                   jT1=new JTextField(null,10);
                    jT2=new JTextField(null,10);
                    
                  // this.add(jl1);
                  // this.add(jT1);
                 //  this.add(jl2);
                 //  this.add(jT2);
                 // this.add(jl3);
                  jp1.add(jl1);
                 jp1.add(jT1);
                 jp2.add(jl2);
                jp2.add(jT2);
                 jp3.add(jl3);
                  
                  c[0]=new JCheckBox(Uni[0]);
               
                  c[1]=new JCheckBox(Uni[1]);
               
                  c[2]=new JCheckBox(Uni[2]);
                  cg.add(c[0]);
                  cg.add(c[1]);
                  cg.add(c[2]);
                 //this.add(c[0]);
                 //this.add(c[1]);
                // this.add(c[2]);
                // this.add(jb1);
                // this.add(jb2);
                jp3.add(c[0]);
               jp4.add(c[1]);
                jp4.add(c[2]);
                 jp5.add(jb1);
                 jp5.add(jb2);
                 jb1.addActionListener(this);
                jb2.addActionListener(this);
                
                this.add(jp1);
                this.add(jp2);
                this.add(jp3);
                this.add(jp4);
                this.add(jp5);
               //this.setBound(5,5);
                this.setLayout(new GridLayout(6,2));            //选择GridLayout布局管理器        
                this.setTitle("档案管理系统");          
                this.setSize(300,200);         
                this.setLocation(400, 200);           
                this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    //设置当关闭窗口时，保证JVM也退出 
                this.setVisible(true);  
                this.setResizable(true);          
                		
                
                
                
                
                
                this.addWindowListener(new WindowAdapter()
        		{
        			@Override
        			public void windowClosing(WindowEvent e)
        			{
        				// TODO Auto-generated method stub
        				
        				if(JOptionPane.YES_OPTION == JOptionPane.showConfirmDialog(addUI.this, "是否退出？", "询问", JOptionPane.YES_NO_OPTION))
        				{
        					//WindowsAndMenu.this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        					addUI.this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        				}
        				else
        				{
        					addUI.this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        				}
        			}
        		});
        		
        		//setExtendedState(JFrame.MAXIMIZED_BOTH); 
        		//this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        		
        		this.setVisible(true);		
                
               
                
                
                
                
                
                
                
                
                
                
                }
             		
                	

                public void actionPerformed(ActionEvent e) {  
                     if(e.getSource() == jb2){
                    	 
                    jT1.setText(null);
                    jT2.setText(null); 
                 
                    c[0].setSelected(false);
                    c[1].setSelected(false);
                    c[2].setSelected(false);
                     }
                    
                   
                      
                     else   if(e.getSource() == jb1){
                            //关闭当前界面  
                         //   dispose();  
                           // new ChengJiBiaoUI();
                    	 
                    	 
                    	
                    	 

                     	if(jT1.getText().isEmpty()||jT2.getText().isEmpty()||(!c[0].isSelected()&&!c[1].isSelected()&&!c[2].isSelected()))  
                         {  
                             JOptionPane.showMessageDialog(null,"请填写完整用户名，密码和角色！","提示消息",JOptionPane.WARNING_MESSAGE);  
                         }
                     
                    	 
                     	else
                     	{//
                    	 
                    	 
                    	 
                    	 
                    	 
                    	 
                    	 
                    	 
                    	 
                      String name=jT1.getText();
                      String password=jT2.getText();
                      String role = null;
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
                      
                      
                      
                      
                      
                      
                      try{
           			
               		if(!DateProcessing.insert(name,password , role))
               		{
               			JOptionPane.showMessageDialog(null,"用户名已经存在请重新输入用户名","提示消息",JOptionPane.WARNING_MESSAGE); 
          				// clear();         
          	             //dispose();
               		 jT1.setText(null);
                     
                  
                    
               			
               			
               		}
               		else
               		{
               			DateProcessing.writeUser();
               		 jT1.setText(null);
                     jT2.setText(null); 
                  
                     c[0].setSelected(false);
                     c[1].setSelected(false);
                     c[2].setSelected(false);
               			 JOptionPane.showMessageDialog(null,"  Name:"+name+"\r\n Password: "+password+"\r\n Role: "+role,"新增用户",JOptionPane.PLAIN_MESSAGE);
               		}
               		
               		}
               		catch (DataException e1){
               			//System.out.println("输入角色错误请重新输入");
               			 JOptionPane.showMessageDialog(null,"输入角色错误请重新输入","提示消息",JOptionPane.WARNING_MESSAGE); 
          				//clear();         
          	             //dispose(); 
               			c[0].setSelected(false);
                        c[1].setSelected(false);
                        c[2].setSelected(false);
               			
        
               		}
                     }
                }
        }
        }////
        
