package CNumber;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextPane;

public class zy extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField txtEwq;
    String a="player1";
    long[] startTime = {0};
	int[] ran= {0};
	
	
	/*
	 * Launch the application.
	 */
	public static void main(String[] args) {
		 
		
		EventQueue.invokeLater(new Runnable() {
			
			 public void run() {
				try {
					
					
					zy frame = new zy();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public zy() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 679, 339);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		
		JLabel lblNewLabel = new JLabel(a);
		lblNewLabel.setBounds(81, 48, 72, 26);
		lblNewLabel.setBackground(Color.LIGHT_GRAY);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("player2:");
		lblNewLabel_1.setBounds(81, 137, 72, 18);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(151, 49, 86, 24);
		contentPane.add(textField);
		textField.setColumns(10);
		
		txtEwq = new JTextField();
		txtEwq.setBounds(151, 137, 86, 24);
		contentPane.add(txtEwq);
		txtEwq.setColumns(10);
		
		JButton button = new JButton("\u63D0\u4EA4");
		button.setBounds(358, 250, 113, 27);
		contentPane.add(button);
		
		JLabel lblNewLabel_2 = new JLabel("������ֵ(1-99,����������1000)");
		lblNewLabel_2.setBounds(281, 32, 300, 50);
		contentPane.add(lblNewLabel_2);
		JLabel lblNewLabel_3 = new JLabel("������ֵ(1-99,����������1000)");
		lblNewLabel_3.setBounds(281, 120, 300, 50);
		contentPane.add(lblNewLabel_3);
		
		JButton button_1 = new JButton("\u5F00\u59CB\u6E38\u620F");
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				random ra=new random();
				ran[0]=ra.raInt();
				jishi js=new jishi();
				startTime[0] =js.start();
				System.out.println(startTime[0]);
				
			}
		});
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
//				jishi js=new jishi();
//				long startTime =js.start();
				System.out.println(132);
				jishi js=new jishi();
				
				long endTime=js.end();
				
				System.out.println(startTime[0]);
				
				String p1_value=textField.getText();
				String p2_value=txtEwq.getText();
				
				player p1=new player("player1", 0);
				player p2=new player("player2", 0);
				String player1_name= " player1_name";
				String player2_name="player2_name";
				for(int i=0;true;i++) {
				int flag=p1.playerpanduan( Integer.parseInt(p1_value), ran[0]);
				int flag2=p2.playerpanduan( Integer.parseInt(p2_value), ran[0]);
				System.out.println(ran[0]);
				System.out.println(p1_value+"-----"+flag);
				System.out.println(p2_value+"-----"+flag2);
				if(flag==1) {
					lblNewLabel_2.setText(player1_name+"WIN!"+"\n"+"������ǣ�"+ran[0]+"\n"+"��Ϸ��ʱ��"+(endTime-startTime[0])/1000+"��");
					
					break;
				}else if(flag==2) {
					
					lblNewLabel_2.setText("1����Ҵ���");
				}else if(flag==3) {
					
					lblNewLabel_2.setText("1�����С��");
				}else if(flag==4) {
					lblNewLabel_2.setText("1��������� GAME OVER"+"\n"+"������ǣ�"+ran[0]+"\n"+"��Ϸ��ʱ��"+(endTime-startTime[0])/1000+"��");
					
					break;
				}
				
				if(flag2==1) {
					lblNewLabel_3.setText(player2_name+"WIN!"+"\n"+"������ǣ�"+ran[0]+"\n"+"��Ϸ��ʱ��"+(endTime-startTime[0])/1000+"��");
					
					break;
				}else if(flag2==2) {
					
					lblNewLabel_3.setText("2����Ҵ���");
					break;
				}else if(flag2==3) {
					lblNewLabel_3.setText("2�����С��");
					break;
				}else if(flag2==4) {
					lblNewLabel_3.setText("2��������� GAME OVER"+"\n"+"������ǣ�"+ran[0]+"\n"+"��Ϸ��ʱ��"+(endTime-startTime[0])/1000+"��");
					break;
				}
				}
				
				
				
				
				
				
				
				
			
			
			}
		});
		
		button_1.setBounds(125, 250, 113, 27);
		contentPane.add(button_1);
		
		JLabel lblNewLabel_4 = new JLabel("��Ϸ���������������������µ�ֵ����˫��������Ϻ����ύ��"+"�����¿�ʼ������ʼ��Ϸ");
		lblNewLabel_4.setBounds(0, 187, 655, 50);
		contentPane.add(lblNewLabel_4);
		
		
//		button_1.addActionListener(new mybtn1());
//	  button.addActionListener(new mybtn());
		 
		
	} 
	
	
//class mybtn1 implements ActionListener{
//
//		
//		int ran;
//		public long[] startTime= {0};
//		@Override
//		public void actionPerformed(ActionEvent e) {
//			// TODO Auto-generated method stub
//			jishi js=new jishi();
//			random ra=new random();
//			ran=ra.raInt();
//			this.startTime[0] =js.start();
//			System.out.println(startTime[0]);
//		}
//		
////		public long getStartTime() {
////			return this.startTime;
////		}
////		public int getran() {
////			return ran;
////		}
//	}
//	class mybtn implements ActionListener{
//           
//		@Override
//		public void actionPerformed(ActionEvent e) {
//			// TODO Auto-generated method stub
//			
//		
//		mybtn1 mb1=new mybtn1();
//		long startTime =mb1.startTime[0];
//		
//		System.out.println("11"+startTime);
//		
//		jishi js=new jishi();
//		
//		long endTime=js.end();
////		int ran=mb1.getran();
////		System.out.println(ran);
//		System.out.println(endTime);
//		System.out.println((endTime-startTime)/1000+"��");
//		
//		String p1_value=txtEwq.getText();
//		String p2_value=txtEwq.getText();
//		System.out.println(p2_value);
//		System.out.println(p1_value);
//		System.out.println();
//		}
//		
//	}
//	
public	class random{
		  public int raInt() {
			Random r = new Random();
		    int ran1 = r.nextInt(100);
		    return ran1;
		}
		
	}


public	 class jishi {
		public long start() {
			/** ��ȡ��ǰϵͳʱ��*/
		    long startTime =  System.currentTimeMillis();
		    /** �������� processRun();*/
		    return startTime;
		    /** ��ȡ��ǰ��ϵͳʱ�䣬���ʼʱ��������ǳ������еĺ�����������1000��������*/
//       long endTime =  System.currentTimeMillis();
//		long usedTime = (endTime-startTime)/1000;
		    
		}
		public long end() {
			long endTime =  System.currentTimeMillis();
	    return endTime;
		}
}
	


class player{
		
			String name;
			Scanner sc=new Scanner(System.in);
			int ex;
		  @Override
			public String toString() {
				return "player [name=" + name + " ex=" + ex + "]";
			}
			public player(String name, int ex) {
				this.name=name;
			
				this.ex=ex;
			}
		  public void getimage() {
			  System.out.println("�������:"+this.name+"��Ҿ���:"+this.ex);
		}
		  public int platersc() {
		  
			  int playmessage=sc.nextInt();
			  return playmessage;			  
		  }
		  public int playerpanduan(int playmessage,int ran2) {
		  
			  if(ran2==playmessage) {
				  return 1;
				 }else if(ran2<playmessage)
				 {
					 return 2;			 
			  }else if(ran2>playmessage) 
			  {
				  return 3;
				 		  }
			  else if(playmessage==1000) {
				 return 4;
				 }else {
					 return 5;
			 }
			  }
			  
		  
		}
}
