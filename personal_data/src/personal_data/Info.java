package personal_data;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Info extends JFrame{
	JPanel jp1 = new JPanel(),jp2 = new JPanel();
	JButton b1 = new JButton("编辑资料");
//	ActionEvent e;
//	public class listener implements ActionListener{
//
//		@Override
//		public void actionPerformed(ActionEvent e) {
//			// TODO Auto-generated method stub
//			//String buttonName = e.getActionCommand();
//			if(e.getSource()==b1)
//			{
//				System.out.println("进入事件");
//				dispose();
//				ModifyInfo m = new ModifyInfo();
//				m.init();
//				m.setVisible(true);
//			}
//		}
//		
//	}
	void createFrame() {
		//Container c = getContentPane();
		setTitle("个人资料");
		//c.setLayout(new BorderLayout());
		setLayout(new GridLayout(1,2));
		setSize(720, 522);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		//添加左右两个面板
		jp1.setSize(360, 522);
		jp2.setSize(360,522);
		//jp1.setBackground(Color.BLUE);
		
		add(jp1);
		add(jp2);
		
		//左面板添加元素
		jp1.setLayout(null);
		JLabel left1 = new JLabel("背景");
		left1.setBounds(0, 0, 360, 360);
		Icon icon = new ImageIcon("src/bg.jpg");
		left1.setIcon(icon);
		jp1.add(left1);
		left1.setOpaque(true);
		jp1.add(left1);
		
		JLabel left2 = new JLabel();
		//ImageIcon ico=new ImageIcon("src/bg.jpg");
		//ico.setImage(ico.getImage().getScaledInstance(50,20,Image.SCALE_DEFAULT));
		//left2.setIcon(ico);
		left2.setBounds(40,390,70,70);
		left2.setIcon(icon);
		jp1.add(left2);
		
		JLabel left3 = new JLabel("昵称");
		left3.setOpaque(true);
		left3.setBounds(150,410,100,30);
		//left3.setBackground(Color.LIGHT_GRAY);
		jp1.add(left3);
		
		//右面板添加元素
		jp2.setLayout(null);
		JLabel l1 = new JLabel("QQ");
		l1.setBounds(20,20,30, 30);//坐标位置，宽和高
		JTextField t1 = new JTextField(10);
		t1.setBounds(60, 20, 150, 30);
		jp2.add(l1);
		jp2.add(t1);
		//JButton b1 = new JButton("编辑资料");
		
		b1.setBounds(230,20,100,30);
		jp2.add(b1);
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// 进行逻辑处理即可
				//System.out.println("触发了事件");
				ModifyInfo m = new ModifyInfo();
//				m.init();
//				m.setVisible(true);
			}
		});
		
		JLabel l2 = new JLabel("info");
		l2.setBounds(20,60,30,30);
		JTextField t2_1 = new JTextField(5);
		t2_1.setBounds(60,60,30,30);
		JTextField t2_2 = new JTextField(5);
		t2_2.setBounds(100,60,30,30);
		JTextField t2_3 = new JTextField(5);
		t2_3.setBounds(140,60,60,30);
		JTextField t2_4 = new JTextField(5);
		t2_4.setBounds(210,60,50,30);
		JTextField t2_5 = new JTextField(5);
		t2_5.setBounds(270,60,50,30);
		jp2.add(l2);
		jp2.add(t2_1);jp2.add(t2_2);jp2.add(t2_3);jp2.add(t2_4);jp2.add(t2_5);
		
		JLabel l3 = new JLabel("家乡");
		l3.setBounds(20,100,30,30);
		JTextField t3 = new JTextField(10);
		t3.setBounds(60, 100, 200, 30);
		jp2.add(l3);
		jp2.add(t3);
		
		JLabel l4 = new JLabel("公司");
		l4.setBounds(20,140,30,30);
		JTextField t4 = new JTextField(10);
		t4.setBounds(60, 140, 200, 30);
		jp2.add(l4);
		jp2.add(t4);
		
		JLabel l5 = new JLabel("血型");
		l5.setBounds(20,180,30,30);
		JTextField t5 = new JTextField(10);
		t5.setBounds(60, 180, 50, 30);
		jp2.add(l5);
		jp2.add(t5);
		
		JLabel l6 = new JLabel("地址");
		l6.setBounds(20,220,30,30);
		JTextField t6 = new JTextField(10);
		t6.setBounds(60, 220, 200, 30);
		jp2.add(l6);
		jp2.add(t6);
		
		JLabel l7 = new JLabel("邮箱");
		l7.setBounds(20,260,30,30);
		JTextField t7 = new JTextField(10);
		t7.setBounds(60, 260, 200, 30);
		jp2.add(l7);
		jp2.add(t7);
	}
	public static void main(String[] args) {
		Info info = new Info();
		info.createFrame();
		info.setVisible(true);
	}
}
