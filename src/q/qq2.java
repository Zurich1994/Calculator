package q;
//package simplecalculator;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class qq2 extends JFrame
{
	public static void main(String[] args) {
		qq2 stest = new qq2();
		stest.addWindowListener(new WindowAdapter() {
	    	     public void windowClosing(WindowEvent e) 
			{ System.exit(0); }
		});
	     stest.setSize(300, 300); 
	     stest.setVisible(true);
	    }
     
JPanel contentPane;
JButton jButton1 = new JButton();
JButton jButton2 = new JButton();
JButton jButton3 = new JButton();
JButton jButton4 = new JButton();
JButton jButton5 = new JButton();
JButton jButton6 = new JButton();
JButton jButton7 = new JButton();
JButton jButton8 = new JButton();
JButton jButton9 = new JButton();
JButton jButton10 = new JButton();
JButton jButton11 = new JButton();
JButton jButton12 = new JButton();
JButton jButton13 = new JButton();
JButton jButton14 = new JButton();
JButton jButton15 = new JButton();
JButton jButton16 = new JButton();
JButton jButton17 = new JButton();
JButton jButton18 = new JButton();
JButton jButton19 = new JButton();

double num1, num2;
boolean add = false, sub = false, mul = false, div = false;
boolean end = false; //用来设定数据输入是否结束
String str;
JTextField jTextField1 = new JTextField();

//Construct the frame
public qq2()
{
  enableEvents(AWTEvent.WINDOW_EVENT_MASK);
  try
  {
    jbInit();
  }
  catch (Exception e)
  {
    e.printStackTrace();
  }
}

//Component initialization
private void jbInit() throws Exception
{
  contentPane = (JPanel)this.getContentPane();
  contentPane.setLayout(null);
  this.setLocale(java.util.Locale.getDefault());
  this.setSize(new Dimension(240, 230));
  this.setTitle("初级计算器");
  jButton1.setBounds(new Rectangle(18, 71, 41, 25));
  jButton1.setForeground(Color.black);
  jButton1.setText("9");
  jButton1.addActionListener(new simplecalculator_jButton1_actionAdapter(this));
  jButton2.setBounds(new Rectangle(68, 71, 41, 25));
  jButton2.setForeground(Color.black);
  jButton2.setText("8");
  jButton2.addActionListener(new simplecalculator_jButton2_actionAdapter(this));
  jButton3.setBounds(new Rectangle(118, 71, 41, 25));
  jButton3.setForeground(Color.black);
  jButton3.setText("7");
  jButton3.addActionListener(new simplecalculator_jButton3_actionAdapter(this));
  jButton4.setBounds(new Rectangle(168, 168, 45, 25));
  jButton4.setToolTipText("");
  jButton4.setText("+");
  jButton4.addActionListener(new simplecalculator_jButton4_actionAdapter(this));
  jButton5.setBounds(new Rectangle(18, 103, 41, 25));
  jButton5.setForeground(Color.black);
  jButton5.setText("6");
  jButton5.addActionListener(new simplecalculator_jButton5_actionAdapter(this));
  jButton6.setBounds(new Rectangle(68, 103, 41, 25));
  jButton6.setFont(new java.awt.Font("Dialog", 0, 11));
  jButton6.setForeground(Color.black);
  jButton6.setText("5");
  jButton6.addActionListener(new simplecalculator_jButton6_actionAdapter(this));
  jButton7.setBounds(new Rectangle(118, 103, 41, 25));
  jButton7.setForeground(Color.black);
  jButton7.setText("4");
  jButton7.addActionListener(new simplecalculator_jButton7_actionAdapter(this));
  jButton8.setBounds(new Rectangle(168, 136, 45, 25));
  jButton8.setForeground(Color.black);
  jButton8.setText("-");
  jButton8.addActionListener(new simplecalculator_jButton8_actionAdapter(this));
  jButton9.setBounds(new Rectangle(18, 136, 41, 25));
  jButton9.setForeground(Color.black);
  jButton9.setHorizontalAlignment(SwingConstants.CENTER);
  jButton9.setText("3");
  jButton9.addActionListener(new simplecalculator_jButton9_actionAdapter(this));
  jButton10.setBounds(new Rectangle(68, 136, 41, 25));
  jButton10.setForeground(Color.black);
  jButton10.setText("2");
  jButton10.addActionListener(new simplecalculator_jButton10_actionAdapter(this));
  jButton11.setBounds(new Rectangle(118, 136, 41, 25));
  jButton11.setForeground(Color.black);
  jButton11.setText("1");
  jButton11.addActionListener(new simplecalculator_jButton11_actionAdapter(this));
  jButton12.setBounds(new Rectangle(168, 103, 45, 25));
  jButton12.setForeground(Color.black);
  jButton12.setVerifyInputWhenFocusTarget(true);
  jButton12.setText("×");
  jButton12.addActionListener(new simplecalculator_jButton12_actionAdapter(this));
  jButton13.setBounds(new Rectangle(18, 168, 41, 25));
  jButton13.setForeground(Color.black);
  jButton13.setToolTipText("");
  jButton13.setText("0");
  jButton13.addActionListener(new simplecalculator_jButton13_actionAdapter(this));
  jButton14.setBounds(new Rectangle(68, 168, 41, 25));
  jButton14.setForeground(Color.black);
  jButton14.setToolTipText("");
  jButton14.setText("-");
  jButton14.addActionListener(new simplecalculator_jButton14_actionAdapter(this));
  jButton15.setBounds(new Rectangle(118, 168, 41, 25));
  jButton15.setForeground(Color.black);
  jButton15.setToolTipText("");
  jButton15.setText(".");
  jButton15.addActionListener(new simplecalculator_jButton15_actionAdapter(this));
  jButton16.setBounds(new Rectangle(168, 71, 45, 25));
  jButton16.setForeground(Color.black);
  jButton16.setText("/");
  jButton16.addActionListener(new simplecalculator_jButton16_actionAdapter(this));
  jButton17.setBounds(new Rectangle(18, 39, 57, 25));
  jButton17.setSelected(true);
  jButton17.setMargin(new Insets(0,0,0,0));
  jButton17.setText("清零");
  jButton17.addActionListener(new simplecalculator_jButton17_actionAdapter(this));
  jButton18.setBounds(new Rectangle(88, 39, 68, 25));
  jButton18.setVerifyInputWhenFocusTarget(true);
  jButton18.setText("重置");
  jButton18.addActionListener(new simplecalculator_jButton18_actionAdapter(this));
  jButton19.setBounds(new Rectangle(168, 39, 45, 25));
  jButton19.setText("=");
  jButton19.addActionListener(new simplecalculator_jButton19_actionAdapter(this));
  jTextField1.setText("0");
  jTextField1.setBounds(new Rectangle(18, 12, 195, 21));
  contentPane.setForeground(Color.black);
  contentPane.add(jButton2, null);
  contentPane.add(jTextField1, null);
  contentPane.add(jButton17, null);
  contentPane.add(jButton18, null);
  contentPane.add(jButton19, null);
  contentPane.add(jButton3, null);
  contentPane.add(jButton1, null);
  contentPane.add(jButton5, null);
  contentPane.add(jButton9, null);
  contentPane.add(jButton13, null);
  contentPane.add(jButton14, null);
  contentPane.add(jButton10, null);
  contentPane.add(jButton6, null);
  contentPane.add(jButton7, null);
  contentPane.add(jButton11, null);
  contentPane.add(jButton15, null);
  contentPane.add(jButton4, null);
  contentPane.add(jButton16, null);
  contentPane.add(jButton8, null);
  contentPane.add(jButton12, null);
}

//Overridden so we can exit when window is closed
protected void processWindowEvent(WindowEvent e)
{
  super.processWindowEvent(e);
  if (e.getID() == WindowEvent.WINDOW_CLOSING)
  {
    System.exit(0);
  }
}

void number(int i)
{
  String s = null;
  s = String.valueOf(i);
  if (end)
  { //如果数字输入结束，则将文本框置零，重新输入
    jTextField1.setText("0");
    end = false;
  }
  if ( (jTextField1.getText()).equals("0"))
  { //如果文本框的内容为零，则覆盖文本框的内容
    jTextField1.setText(s);
  }
  else
  { //如果文本框的内容不为零，则在文本框后添加数字
    str = jTextField1.getText() + s;
    jTextField1.setText(str);
  }
}

void sign(int s)
{
  if (s == 1)
  {
    add = true;
    sub = false;
    mul = false;
    div = false;
  }
  else if (s == 2)
  {
    add = false;
    sub = true;
    mul = false;
    div = false;
  }
  else if (s == 3)
  {
    add = false;
    sub = false;
    mul = true;
    div = false;
  }
  else
  {
    add = false;
    sub = false;
    mul = false;
    div = true;
  }
  num1 = Double.parseDouble(jTextField1.getText());
  end = true;
}

void jButton18_actionPerformed(ActionEvent e)
{
  jTextField1.setText("0");
  end = false;
  add = false;
  sub = false;
  mul = false;
  div = false;
}

void jButton1_actionPerformed(ActionEvent e)
{
  number(9);
}

void jButton2_actionPerformed(ActionEvent e)
{
  number(8);
}

void jButton3_actionPerformed(ActionEvent e)
{
  number(7);
}

void jButton5_actionPerformed(ActionEvent e)
{
  number(6);
}

void jButton6_actionPerformed(ActionEvent e)
{
  number(5);
}

void jButton7_actionPerformed(ActionEvent e)
{
  number(4);
}

void jButton9_actionPerformed(ActionEvent e)
{
  number(3);
}

void jButton10_actionPerformed(ActionEvent e)
{
  number(2);
}

void jButton11_actionPerformed(ActionEvent e)
{
  number(1);
}

void jButton13_actionPerformed(ActionEvent e)
{
  number(0);
}

void jButton15_actionPerformed(ActionEvent e)
{
  str = jTextField1.getText();
  if (str.indexOf(".") <= 1)
  {
    str += ".";
    jTextField1.setText(str);
  }
}

void jButton16_actionPerformed(ActionEvent e)
{
  sign(4);
}

void jButton12_actionPerformed(ActionEvent e)
{
  sign(3);
}

void jButton8_actionPerformed(ActionEvent e)
{
  sign(2);
}

void jButton4_actionPerformed(ActionEvent e)
{
  sign(1);
}

void jButton19_actionPerformed(ActionEvent e)
{
  num2 = Double.parseDouble(jTextField1.getText());
  if (add)
  {
    num1 = num1 + num2;
  }
  else if (sub)
  {
    num1 = num1 - num2;
  }
  else if (mul)
  {
    num1 = num1 * num2;
  }
  else if (div)
  {
    num1 = num1 / num2;
  }
  jTextField1.setText(String.valueOf(num1));
  end = true;
}

void jButton14_actionPerformed(ActionEvent e)
{
  if (end)
  {
    end = false;
    jTextField1.setText("-");
  }
}

void jButton17_actionPerformed(ActionEvent e)
{
  jTextField1.setText("0");
}
}

class simplecalculator_jButton18_actionAdapter
  implements java.awt.event.ActionListener
{
qq2 adaptee;

simplecalculator_jButton18_actionAdapter(qq2 adaptee)
{
  this.adaptee = adaptee;
}

public void actionPerformed(ActionEvent e)
{
  adaptee.jButton18_actionPerformed(e);
}
}

class simplecalculator_jButton1_actionAdapter
  implements java.awt.event.ActionListener
{
qq2 adaptee;

simplecalculator_jButton1_actionAdapter(qq2 adaptee)
{
  this.adaptee = adaptee;
}

public void actionPerformed(ActionEvent e)
{
  adaptee.jButton1_actionPerformed(e);
}
}

class simplecalculator_jButton2_actionAdapter
  implements java.awt.event.ActionListener
{
qq2 adaptee;

simplecalculator_jButton2_actionAdapter(qq2 adaptee)
{
  this.adaptee = adaptee;
}

public void actionPerformed(ActionEvent e)
{
  adaptee.jButton2_actionPerformed(e);
}
}

class simplecalculator_jButton3_actionAdapter
  implements java.awt.event.ActionListener
{
qq2 adaptee;

simplecalculator_jButton3_actionAdapter(qq2 adaptee)
{
  this.adaptee = adaptee;
}

public void actionPerformed(ActionEvent e)
{
  adaptee.jButton3_actionPerformed(e);
}
}

class simplecalculator_jButton5_actionAdapter
  implements java.awt.event.ActionListener
{
qq2 adaptee;

simplecalculator_jButton5_actionAdapter(qq2 adaptee)
{
  this.adaptee = adaptee;
}

public void actionPerformed(ActionEvent e)
{
  adaptee.jButton5_actionPerformed(e);
}
}

class simplecalculator_jButton6_actionAdapter
  implements java.awt.event.ActionListener
{
qq2 adaptee;

simplecalculator_jButton6_actionAdapter(qq2 adaptee)
{
  this.adaptee = adaptee;
}

public void actionPerformed(ActionEvent e)
{
  adaptee.jButton6_actionPerformed(e);
}
}

class simplecalculator_jButton7_actionAdapter
  implements java.awt.event.ActionListener
{
qq2 adaptee;

simplecalculator_jButton7_actionAdapter(qq2 adaptee)
{
  this.adaptee = adaptee;
}

public void actionPerformed(ActionEvent e)
{
  adaptee.jButton7_actionPerformed(e);
}
}

class simplecalculator_jButton9_actionAdapter
  implements java.awt.event.ActionListener
{
qq2 adaptee;

simplecalculator_jButton9_actionAdapter(qq2 adaptee)
{
  this.adaptee = adaptee;
}

public void actionPerformed(ActionEvent e)
{
  adaptee.jButton9_actionPerformed(e);
}
}

class simplecalculator_jButton10_actionAdapter
  implements java.awt.event.ActionListener
{
qq2 adaptee;

simplecalculator_jButton10_actionAdapter(qq2 adaptee)
{
  this.adaptee = adaptee;
}

public void actionPerformed(ActionEvent e)
{
  adaptee.jButton10_actionPerformed(e);
}
}

class simplecalculator_jButton11_actionAdapter
  implements java.awt.event.ActionListener
{
qq2 adaptee;

simplecalculator_jButton11_actionAdapter(qq2 adaptee)
{
  this.adaptee = adaptee;
}

public void actionPerformed(ActionEvent e)
{
  adaptee.jButton11_actionPerformed(e);
}
}

class simplecalculator_jButton13_actionAdapter
  implements java.awt.event.ActionListener
{
qq2 adaptee;

simplecalculator_jButton13_actionAdapter(qq2 adaptee)
{
  this.adaptee = adaptee;
}

public void actionPerformed(ActionEvent e)
{
  adaptee.jButton13_actionPerformed(e);
}
}

class simplecalculator_jButton15_actionAdapter
  implements java.awt.event.ActionListener
{
qq2 adaptee;

simplecalculator_jButton15_actionAdapter(qq2 adaptee)
{
  this.adaptee = adaptee;
}

public void actionPerformed(ActionEvent e)
{
  adaptee.jButton15_actionPerformed(e);
}
}

class simplecalculator_jButton16_actionAdapter
  implements java.awt.event.ActionListener
{
qq2 adaptee;

simplecalculator_jButton16_actionAdapter(qq2 adaptee)
{
  this.adaptee = adaptee;
}

public void actionPerformed(ActionEvent e)
{
  adaptee.jButton16_actionPerformed(e);
}
}

class simplecalculator_jButton12_actionAdapter
  implements java.awt.event.ActionListener
{
qq2 adaptee;

simplecalculator_jButton12_actionAdapter(qq2 adaptee)
{
  this.adaptee = adaptee;
}

public void actionPerformed(ActionEvent e)
{
  adaptee.jButton12_actionPerformed(e);
}
}

class simplecalculator_jButton8_actionAdapter
  implements java.awt.event.ActionListener
{
qq2 adaptee;

simplecalculator_jButton8_actionAdapter(qq2 adaptee)
{
  this.adaptee = adaptee;
}

public void actionPerformed(ActionEvent e)
{
  adaptee.jButton8_actionPerformed(e);
}
}

class simplecalculator_jButton4_actionAdapter
  implements java.awt.event.ActionListener
{
qq2 adaptee;

simplecalculator_jButton4_actionAdapter(qq2 adaptee)
{
  this.adaptee = adaptee;
}

public void actionPerformed(ActionEvent e)
{
  adaptee.jButton4_actionPerformed(e);
}
}

class simplecalculator_jButton19_actionAdapter
  implements java.awt.event.ActionListener
{
qq2 adaptee;

simplecalculator_jButton19_actionAdapter(qq2 adaptee)
{
  this.adaptee = adaptee;
}

public void actionPerformed(ActionEvent e)
{
  adaptee.jButton19_actionPerformed(e);
}
}

class simplecalculator_jButton14_actionAdapter
  implements java.awt.event.ActionListener
{
qq2 adaptee;

simplecalculator_jButton14_actionAdapter(qq2 adaptee)
{
  this.adaptee = adaptee;
}

public void actionPerformed(ActionEvent e)
{
  adaptee.jButton14_actionPerformed(e);
}
}

class simplecalculator_jButton17_actionAdapter
  implements java.awt.event.ActionListener
{
qq2 adaptee;

simplecalculator_jButton17_actionAdapter(qq2 adaptee)
{
  this.adaptee = adaptee;
}

public void actionPerformed(ActionEvent e)
{
  adaptee.jButton17_actionPerformed(e);
}
}
