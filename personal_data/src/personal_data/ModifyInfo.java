package personal_data;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ModifyInfo extends JFrame{
	JButton b2 = new JButton("����");
	JButton b3 = new JButton("�ر�");
	public ModifyInfo() {
		init();
		setVisible(true);
	}
	void init() {
		setTitle("�༭����");
		setLayout(null);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(378,592);
		setLocationRelativeTo(null);
		Container c = getContentPane();
	    
		//
		
		JLabel l1 = new JLabel("�ǳ�");
		l1.setBounds(20,20,50,20);
		c.add(l1);
		JTextField t1= new JTextField();
		t1.setBounds(80,20,100,20);
		c.add(t1);
		
		JLabel l2 = new JLabel("�Ա�");
		l2.setBounds(200,20,50,20);
		c.add(l2);
		String sex[] = {"��","Ů"};
		JComboBox<String> combo1 = new JComboBox<>(sex);
		combo1.setBounds(260,20,100,20);
		c.add(combo1);
		
		JLabel l3 = new JLabel("����");
		l3.setBounds(20,50,50,20);
		c.add(l3);
		JTextField t3= new JTextField();
		t3.setBounds(80,50,100,20);
		c.add(t3);
		
		JLabel l4 = new JLabel("Ѫ��");
		l4.setBounds(200,50,50,20);
		c.add(l4);
		String bloodtype[] = {"A","B","AB","O"};
		JComboBox<String> combo2 = new JComboBox<>(bloodtype);
		combo2.setBounds(260,50,100,20);
		c.add(combo2);
		
		JLabel l5 = new JLabel("ְҵ");
		l5.setBounds(20,80,50,20);
		c.add(l5);
		JTextField t5= new JTextField();
		t5.setBounds(80,80,220,20);
		c.add(t5);
		
		JLabel l6 = new JLabel("����");
		l6.setBounds(20,110,50,20);
		c.add(l6);
		JTextField t6= new JTextField();
		t6.setBounds(80,110,220,20);
		c.add(t6);
		
		JLabel l7 = new JLabel("���ڵ�");
		l7.setBounds(20,140,50,20);
		c.add(l7);
		JTextField t7= new JTextField();
		t7.setBounds(80,140,220,20);
		c.add(t7);
		
		JLabel l8 = new JLabel("��˾");
		l8.setBounds(20,170,50,20);
		c.add(l8);
		JTextField t8= new JTextField();
		t8.setBounds(80,170,220,20);
		c.add(t8);
		
		JLabel l9 = new JLabel("����");
		l9.setBounds(20,200,50,20);
		c.add(l9);
		JTextField t9= new JTextField();
		t9.setBounds(80,200,220,20);
		c.add(t9);
		
		JLabel l10 = new JLabel("����ǩ��");
		l10.setBounds(20,230,80,20);
		c.add(l10);
		JTextField t10= new JTextField();
		t10.setBounds(80,230,220,60);
		c.add(t10);
		
		JButton b1 = new JButton("����ͷ��");
		b1.setBounds(20, 300, 100, 30);
		c.add(b1);
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// �����߼�������
				//System.out.println("�������¼�");
				new changeAvatar();
			}
		});
		
		
		b2.setBounds(220, 330, 60, 30);
		c.add(b2);
		b2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// �����߼�������
				//System.out.println("�������¼�");
				dispose();
			}
		});
		
		b3.setBounds(290, 330, 60, 30);
		c.add(b3);
		b3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// �����߼�������
				//System.out.println("�������¼�");
				dispose();
			}
		});
	}
}
