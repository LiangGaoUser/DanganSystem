package lesson2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class dlg extends Frame

{
	String a;
	Frame fe;
	
	
	
	
	
//public static void main(String args[])
	
	//	{
			//Frame fe=new dlg("MyFileDialogDemo");
			//return a;
//	new dlg("MyFileDialogDemo");
	//	}

	
	
	
	
	
	
	public dlg (){
		
		setLayout(new FlowLayout());
		setSize(200,180);
		
		setVisible(false);
	
		
		fe=new Frame();
		
		
		 FileDialog fd1=new FileDialog(fe,"обть", FileDialog.LOAD);
		 fd1.show();
		 //System.out.println(fd1);
		// System.out.println(fd1.getFile());
		 a= fd1.getFile();	
		
		
		
		
		
		
		
	}

	
	
	
}
	
	



























