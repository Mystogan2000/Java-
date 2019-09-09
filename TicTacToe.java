package tictactoe;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class TicTacToe  implements ActionListener
{
    String Win;
    int i=2;
    int R[][] = new int[3][3];
    int count = 0;
    JFrame P;
    
    JButton B1,B2,B3,B4,B5,B6,B7,B8,B9;
    
    public TicTacToe()
    {
        
        P = new JFrame("Tic TAc Toe");
        P.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        P.setLayout(new GridLayout(3,3));
       
        B1=new JButton();
        B2=new JButton();B3=new JButton();B4=new JButton();B5=new JButton();B6=new JButton();B7=new JButton();B8=new JButton();B9=new JButton();
        P.add(B1);
        P.add(B2);
        P.add(B3);
        P.add(B4);
        P.add(B5);
        P.add(B6);
        P.add(B7);
        P.add(B8);
        P.add(B9);
        //JOptionPane.showMessageDialog(P,"Welcome,Press ok to start");
        B1.addActionListener(this);
        B2.addActionListener(this);
        B3.addActionListener(this);
        B4.addActionListener(this);
        B5.addActionListener(this);
        B6.addActionListener(this);
        B7.addActionListener(this);
        B8.addActionListener(this);
        B9.addActionListener(this);
       // F.add(P);
        P.setSize(500,500);
        P.setVisible(true);
        
    }
    void check()
    {
        count++;
        for(int k=0;k<3;k++)
        {
            if(R[k][0]==R[k][1] && R[k][2]==R[k][0] && R[k][0]!=0 )
            {
              if(R[k][0]==1)
                  Win="X Wins";
              else 
                  Win="O Wins";
              JOptionPane.showMessageDialog(P,Win); 
               P.dispose();
               break;
                //win in row
            }
        else
        if(R[0][k]==R[1][k] && R[2][k]==R[0][k] && R[0][k]!=0 )
            {
                if(R[0][k]==1)
                  Win="X Wins";
                else 
                  Win="O Wins";
                JOptionPane.showMessageDialog(P,Win);    
                P.dispose();
                break;
                //win in column
            }
        else if(R[0][0]==R[1][1] && R[2][2]==R[0][0] && R[0][0]!=0 )
            {
                if(R[0][0]==1)
                  Win="X Wins ";
                else 
                  Win="O Wins";
                JOptionPane.showMessageDialog(P,Win); 
                P.dispose();
                break;
                
                //win in diagonal
            }
        else if(R[0][2]==R[1][1] && R[0][2]==R[2][0] && R[0][2]!=0)
             {
                if(R[0][2]==1)
                  Win="X Wins ";
                else 
                  Win="O Wins";
                JOptionPane.showMessageDialog(P,Win); 
                P.dispose();
                break;
                
                //win in diagonal
            }
        
           if(count>7)
        {
            JOptionPane.showMessageDialog(P,"TIE");
             P.dispose();
             break;
        } 
        }
        
            
    }
        
        
     
    
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        
        if(e.getSource() == B1)
        {
            if(i%2==0)
            {
                 
                 
                 B1.setText("X");
                 
                 
            }
            else
            { 
                B1.setText("O");
                
                
            }
            B1.setEnabled(false);
            if(i%2==0)
                R[0][0]=1;
            else R[0][0]=2;
            i++;
            
            
           check();
        }
        if(e.getSource() == B2)
        {
            if(i%2==0)
            {B2.setText("X");
            R[0][1]=1;
            }else
            {   B2.setText("O");
                R[0][1]=2;
            } 
            i++;
            B2.setEnabled(false);
            check();
            
        }
        if(e.getSource() == B3)
        {
            if(i%2==0)
            { B3.setText("X");R[0][2]=1;
            }else
            {    B3.setText("O");R[0][2]=2;
            }//
            i++;
            B3.setEnabled(false);
            check();
            
        }
        if(e.getSource() == B4)
        {
            if(i%2==0)
            {   B4.setText("X");
            R[1][0]=1;
            }
            else
            {    B4.setText("O");
            R[1][0]=2;
            }
            B4.setEnabled(false);
           i++;
           
           check(); 
        }
        if(e.getSource() == B5)
        {
            if(i%2==0)
            { B5.setText("X");
            R[1][1]=1;
            }else
            {   B5.setText("O");
            R[1][1]=2;
            } 
            i++;B5.setEnabled(false);
            
            check();
        }
        if(e.getSource() == B6)
        {
            if(i%2==0)
            {    B6.setText("X");
            R[1][2]=1;
            }else
            {   B6.setText("O");
            R[1][2]=2;}
            i++;
            B6.setEnabled(false);
            check();
            
        }
        if(e.getSource() == B7)
        {
            if(i%2==0)
            {    B7.setText("X");
            R[2][0]=1;
            }else
            {      B7.setText("O");
           R[2][0]=2;
            }B7.setEnabled(false);
            i++;
           
           
           check();
        }
        if(e.getSource() == B8)
        {
            if(i%2==0)
            {     B8.setText("X");
                 R[2][1]=1;
            }else
            {   B8.setText("O");
             R[2][1]=2;
            }
            i++;B8.setEnabled(false);
            check();
            
        }
        if(e.getSource() == B9)
        {
            if(i%2==0)
            {B9.setText("X");
            R[2][2]=1;
            }else
            {   B9.setText("O");
            R[2][2]=2;} 
            i++;
            B9.setEnabled(false);
            check();
            
        }
        
        
        
    }
    

    
    public static void main(String[] args) 
    {
            new TicTacToe();
    }
    
}


        