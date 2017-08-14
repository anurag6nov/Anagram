import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.util.*;


class anagram {
    public static void main(String args[] )  {
        JFrame f = new JFrame();
        f.setSize(500,500);
        final JTextField text = new JTextField();
        final JTextField text1 = new JTextField();
        final JTextField text2 = new JTextField();
        final JTextField text3 = new JTextField();
        final JTextField text4 = new JTextField();
        JButton b = new JButton("Check");
        
        text.setBounds(100,100,150,20);
        text1.setBounds(100,150,150,20);
        text2.setBounds(100,200,150,20);
        text3.setBounds(100,250,150,20);
	b.setBounds(100,300,150,20);
        text4.setBounds(100,350,150,20);
        
        f.add(text2);
        f.add(text);
        f.add(text3);
        f.add(text1);
        f.add(b);
        f.add(text4);
	f.setLayout(null);
	f.setVisible(true);
	text.setText("Enter first String");
	text2.setText("Enter second string");
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
        String s,s1;
        int sum=0,sum1=0;
        s = text1.getText();
        s1 = text3.getText();
        String arr[] = s.split(" ");
        String arr1[] = s1.split(" ");
        Vector<String> vct1  = new Vector<String>();
        Vector<String> vct = new Vector<String>();
        vct1.addAll(Arrays.asList(arr1));
        vct.addAll((Arrays.asList(arr)));
        int n = vct.size();
        int n1 = vct1.size();
        for(int i=0;i<n;i++)
        {
           int p = vct.elementAt(i).length();
           StringBuffer l = new StringBuffer();
            l.append(vct.elementAt(i));
           for(int j=0;j<p;j++)
           {
             sum = sum + (int)l.charAt(j);
           }
        }
        for(int i=0;i<n1;i++)
        {
           int p = vct1.elementAt(i).length();
           StringBuffer l = new StringBuffer();
            l.append(vct1.elementAt(i));
           for(int j=0;j<p;j++)
           {
             sum1 = sum1 + (int)l.charAt(j);
           }
        }
        if(sum == sum1)
        {
            text4.setText("Anagram");
                       
        }
        else
            text4.setText("Not anagram");
                
            }
        });
    }
    
    
        
        
        
      

    }   