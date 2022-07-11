package loanassistant;
import java.awt.*;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.text.*;
import javax.swing.*;
import java.awt.event.*;

public class LoanAssistant
{
    public static void main(String[] args) 
    {
        frameshow obj=new frameshow();
    }
}
class frameshow extends JFrame
{
    JTextField tlb,tir,tnp,tmp;
    JLabel lb,ir,np,mp,al;
    JTextArea la;
    Font myFont = new Font("Arial", Font.PLAIN, 16);
    Font myFont2 = new Font("Courier New", Font.PLAIN, 14);
    JPanel p;
    JButton cb,nb,mb,pb,eb;
    //int com;
    public frameshow()
    {
        
        JFrame f=new JFrame();
        f.setTitle("Loan Assistant");
        setSize(400, 400);
        lb= new JLabel("Loan Balance"); 
        lb.setFont(myFont);
        ir= new JLabel("Interest Rate");
        ir.setFont(myFont);
        np= new JLabel("Number of Payments");
        np.setFont(myFont);
        mp= new JLabel("Monthly Payment");
        mp.setFont(myFont);
        al= new JLabel("Loan Analysis");
        al.setFont(myFont);
        
        la=new JTextArea();
        la.setFont(myFont2);
        
        tlb=new JTextField(10);
        tir=new JTextField(10);
        tnp=new JTextField(10);
        tmp=new JTextField(10);
        
        cb=new JButton();
        nb=new JButton();
        mb=new JButton();
        pb=new JButton();
        eb=new JButton();
        
        p=new JPanel(new GridBagLayout());
        GridBagConstraints c=new GridBagConstraints();
        
        c.gridx=0;
        c.gridy=0;
        c.anchor=GridBagConstraints.WEST;
        c.insets=new Insets(10,10,0,0);
        p.add(lb,c);
        
        c.gridx=1;
        c.gridy=0;
        tlb.setPreferredSize(new Dimension(100, 25));
        tlb.setHorizontalAlignment(SwingConstants.RIGHT);
        c.anchor=GridBagConstraints.WEST;
        c.insets=new Insets(10,10,0,10);
        p.add(tlb,c);
        
        c.gridx=0;
        c.gridy=1;
        c.anchor=GridBagConstraints.WEST;
        c.insets=new Insets(10,10,0,0);
        p.add(ir,c);
        
        c.gridx=1;
        c.gridy=1;
        tir.setPreferredSize(new Dimension(100, 25));
        tir.setHorizontalAlignment(SwingConstants.RIGHT);
        c.anchor=GridBagConstraints.WEST;
        c.insets=new Insets(10,10,0,10);
        p.add(tir,c);
        
        c.gridx=0;
        c.gridy=2;
        c.anchor=GridBagConstraints.WEST;
        c.insets=new Insets(10,10,0,0);
        p.add(np,c);
        
        c.gridx=1;
        c.gridy=2;
        tnp.setPreferredSize(new Dimension(100, 25));
        tnp.setHorizontalAlignment(SwingConstants.RIGHT);;
        c.anchor=GridBagConstraints.WEST;
        c.insets=new Insets(10,10,0,10);
        p.add(tnp,c);
        
        c.gridx=0;
        c.gridy=3;
        c.anchor=GridBagConstraints.WEST;
        c.insets=new Insets(10,10,0,0);
        p.add(mp,c);
        
        c.gridx=1;
        c.gridy=3;
        tmp.setPreferredSize(new Dimension(100, 25));
        tmp.setHorizontalAlignment(SwingConstants.RIGHT);
        c.anchor=GridBagConstraints.WEST;
        c.insets=new Insets(10,10,0,10);
        p.add(tmp,c);
        
        cb.setText("Compute Monthly Payment");
        c.gridx = 0;
        c.gridy = 4;
        c.gridwidth = 2;
        c.insets = new Insets(10, 0, 0, 0);
        p.add(cb,c);
        
        nb.setText("New Loan Analysis");
        c.gridx = 0;
        c.gridy = 5;
        c.gridwidth = 2;
        c.insets = new Insets(10, 0, 10, 0);
        nb.setEnabled(false);
        p.add(nb,c);
        
        pb.setText("X");
        c.gridx = 2;
        c.gridy = 2;
        c.insets = new Insets(10, 0, 0, 0);
        p.add(pb,c);
        
        mb.setText("X");
        c.gridx = 2;
        c.gridy = 3;
        c.insets = new Insets(10, 0, 10, 0);
        p.add(mb,c);
        
        al.setText("Loan Analysis:");
        c.gridx = 4;
        c.gridy = 0;
        c.anchor = GridBagConstraints.WEST;
        c.insets = new Insets(0, 10, 0, 0);
        p.add(al,c);
        
        la.setPreferredSize(new Dimension(250, 150));
        la.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        la.setEditable(false);
        la.setBackground(Color.WHITE);
        c.gridx = 4;
        c.gridy = 1;
        c.gridheight = 4;
        c.insets = new Insets(0, 10, 0, 10);
        p.add(la,c);
        
        eb.setText("Exit");
        c.gridx = 4;
        c.gridy = 5;
        p.add(eb,c);
        
        mb.addActionListener(new ActionListener()
        {
           public void actionPerformed(ActionEvent e)
          {
               mbActionPerformed(e);
          }
        });
        
        pb.addActionListener(new ActionListener()
        {
           public void actionPerformed(ActionEvent e)
           {
                pbActionPerformed(e);
            }
        });
        
        cb.addActionListener(new ActionListener()
        {
           public void actionPerformed(ActionEvent e)
           {
                cbActionPerformed(e);
            }
        });
        
        eb.addActionListener(new ActionListener()
        {
           public void actionPerformed(ActionEvent e)
           {
                ebActionPerformed(e);
            }
        });
        
        nb.addActionListener(new ActionListener()
        {
           public void actionPerformed(ActionEvent e)
           {
                nbActionPerformed(e);
            }
        });
        
        tlb.addActionListener(new ActionListener()
        {
           public void actionPerformed(ActionEvent e)
           {
                tlbActionPerformed(e);
            }
        });
        
        tir.addActionListener(new ActionListener()
        {
           public void actionPerformed(ActionEvent e)
           {
                tirActionPerformed(e);
            }
        });
        
        tmp.addActionListener(new ActionListener()
        {
           public void actionPerformed(ActionEvent e)
           {
                tmpActionPerformed(e);
            }
        });
        
        tnp.addActionListener(new ActionListener()
        {
           public void actionPerformed(ActionEvent e)
           {
                tnpActionPerformed(e);
            }
        });

        f.add(p);
        f.setLayout(new GridBagLayout());
        f.setSize(700,600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    } 
    private void mbActionPerformed(ActionEvent e)
    {
        pb.setVisible(true);
        mb.setVisible(false);
        tmp.setText("");
        tmp.setEditable(false);
        tmp.setBackground(Color.YELLOW);
        tmp.setFocusable(false);
        tnp.setEditable(true);
        tnp.setFocusable(true);
        tnp.setBackground(Color.WHITE);
        cb.setText("Compute Monthly Payment");
        tlb.requestFocus();
    }
    
    private void pbActionPerformed(ActionEvent e)
   {
       pb.setVisible(false);
       mb.setVisible(true);
       tmp.setEditable(true);
       tmp.setBackground(Color.WHITE);
       tmp.setFocusable(true);
       tnp.setText("");
       tnp.setEditable(false);
       tnp.setFocusable(false);
       tnp.setBackground(Color.YELLOW);
       cb.setText("Compute Number of Payments");
       tlb.requestFocus();
    }
    
    private void cbActionPerformed(ActionEvent e)
    {
       double p, ti, payment,pay,total_payment,fp,interest_paid,minpay;
       int m,month;
       double i, n;
       if(checkvalid(tlb))
       {
            p =Double.valueOf(tlb.getText()).doubleValue();
       }
       else
       {
           JOptionPane.showConfirmDialog(null,"Invalid or empty Loan Balance entry\nPlease correct.","Balance Input Error",
           JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE);
           return;
       }
       if(checkvalid(tir))
       {
            ti = Double.valueOf(tir.getText()).doubleValue();
       }
       else
       {
           JOptionPane.showConfirmDialog(null,"Invalid or empty Interest Rate entry\nPlease correct.","Interest Input Error",
           JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE);
           return;
       }
       i = ti / 1200;
       if (tnp.isFocusable())
       {
         if(checkvalid(tnp))
         {
            m =Integer.valueOf(tnp.getText()).intValue();
         }
         else
         {
           JOptionPane.showConfirmDialog(null,"Invalid or empty Number of Payments entry\nPlease correct.","Number of Payments Input Error",
           JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE);
            return;
         }  
        if(ti==0)
        {
            payment=p/m;
        }
        else
        {
            n = Math.pow(1 + i, m);
            payment = p * i * n / (n - 1);
        }
        tmp.setText(new DecimalFormat("0.00").format(payment));
       }
       else
       {
        // Compute number of payments
          if(checkvalid(tmp))
         {
            payment =Double.valueOf(tmp.getText()).doubleValue();
            minpay=(p*i)+1.0;
            if(payment<=minpay)
            {
                int res;
                res=JOptionPane.showConfirmDialog(null,"Minimum payment must be $" +
                new DecimalFormat("0.00").format((int)(minpay)) + "\n" + "Do you want to use the minimum payment?", "Input Error", JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
                if (res == JOptionPane.YES_OPTION)
               {
                    tmp.setText(new DecimalFormat("0.00").format((int)(p * i + 1.0)));
                    payment =Double.valueOf(tmp.getText()).doubleValue();
               }
               else
               {
                    tmp.requestFocus();
                    return;
               }
            }
        }
        else
        {
             JOptionPane.showConfirmDialog(null,"Invalid or empty Monthly Payment entry\nPlease correct.","Monthly Payment Input Error",
             JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE);
             return;
        }   
        
        if(ti==0)
        {
            m=(int)(p/payment);
        }
        else
        {
            m = (int)((Math.log(payment) - Math.log(payment - p * i))/ Math.log(1 + i));
        }
        tnp.setText(String.valueOf(m+1));
       }
       pay=Double.valueOf(tmp.getText()).doubleValue();
       month=Integer.valueOf(tnp.getText()).intValue();
       la.setText("Loan Balance: $" + new DecimalFormat("0.00").format(p));
       la.append("\n"+"Interest Rate: " + new DecimalFormat("0.00").format(ti)+"%");
       la.append("\n\n"+ (month-1) + " Payments of $"+new DecimalFormat("0.00").format(pay));
       fp = p;
       for (int j = 1; j <= month - 1; j++)
       {
           fp += fp * i - pay;
       }
       if (fp > payment)
       {
         // apply one more payment
         fp += fp * i - pay;
         month++;
        }
       total_payment=(month - 1)*pay+fp;
       interest_paid=total_payment-p;
       la.append("\n" +"Final Payments of : $"+new DecimalFormat("0.00").format(fp));
       la.append("\n" +"Total Payments : $"+new DecimalFormat("0.00").format(total_payment));
       la.append("\n" +"Interest Paid: $"+new DecimalFormat("0.00").format(interest_paid));
       cb.setEnabled(false);
       nb.setEnabled(true);
       nb.requestFocus();
    }
    private void ebActionPerformed(ActionEvent e)
    {
       System.exit(0);
    }
    
    private void nbActionPerformed(ActionEvent e)
    {
       if(tnp.isFocusable())
       {
           tmp.setText("");
           la.setText("");
           cb.setEnabled(true);
           nb.setEnabled(false);
           tlb.requestFocus();
       }
       else
       {
           tnp.setText("");
           la.setText("");
           cb.setEnabled(true);
           nb.setEnabled(false);
           tlb.requestFocus();
       }
    }
    
    private void tlbActionPerformed(ActionEvent e)
    {
      tir.requestFocus();
    }
     
    private void tirActionPerformed(ActionEvent e)
    {
      tir.transferFocus();
    }
    
    private void tmpActionPerformed(ActionEvent e)
    {
      tmp.transferFocus();
    }
    
    private void tnpActionPerformed(ActionEvent e)
    {
      tnp.transferFocus();
    }
    
    public boolean checkvalid(JTextField text)
    {
        String s=text.getText().trim();
        boolean valid;
        if(s.length()==0)
        {
            valid=false;
        }
        else
        {
            int flag=0;
            for(int i=0;i<s.length();i++)
            {
                char ch=s.charAt(i);
                if((ch>='0'&& ch<='9')||ch=='.')
                {
                    flag+=flag;
                }
                else
                {
                    flag=1;
                }
            }
            if(flag>0)
            {
                valid=false;
            }
            else
            {
                valid=true;
            }
        }
        return valid;
    }
}

