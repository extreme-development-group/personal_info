package personal_data;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class changeAvatar extends JFrame{
	public changeAvatar() {
		init();
		setVisible(true);
	}
	public void init() {
		setTitle("����ͷ��");
		setLayout(null);
		setSize(386, 500);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		Container c = getContentPane();
		
		JButton b1 = new JButton("�ϴ�������Ƭ");
		b1.setBounds(20, 20, 100, 30);
		c.add(b1);
		JLabel l1 = new JLabel();
		l1.setBounds(40,50,300,300);
		Icon icon = new ImageIcon("src/bg.jpg");
		l1.setIcon(icon);
		c.add(l1);
		
		JButton b2 = new JButton("����");
		JButton b3 = new JButton("�ر�");
		b2.setBounds(220, 400, 60, 30);
		c.add(b2);
		b2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// �����߼�������
				//System.out.println("�������¼�");
				dispose();
			}
		});
		
		b3.setBounds(290, 400, 60, 30);
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
