//package com.devs.honddoni.member.view;
//
//import java.awt.Color;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//import javax.swing.ImageIcon;
//import javax.swing.JButton;
//import javax.swing.JLabel;
//import javax.swing.JPanel;
//import javax.swing.JPasswordField;
//
//import com.devs.honddoni.common.mainframe.MainFrame;
//
//
//public class ChangePwd {
//	
//	private static MainFrame frame = new MainFrame();
//	private static JPanel ChangePwdPanel = new JPanel();
//	
//	/* 비밀번호변경 */
//	private static JButton cpB1 = new JButton();					//비밀번호 변경 취소버튼
//	private static JButton cpB2 = new JButton();					//비밀번호 변경 변경버튼
//	private static JLabel cpL1 = new JLabel(); 					//비밀번호 변경 입력창 이미지
//	private static JPasswordField cpPF1 = new JPasswordField();	//비밀번호 변경 기존비번 입력창
//	private static JPasswordField cpPF2 = new JPasswordField();	//비밀번호 변경 새비번 입력창
//	private static JPasswordField cpPF3 = new JPasswordField();	//비밀번호 변경 새비번 확인창
//	
//	public static void ChangePwd1() {
//		
//	/* 비밀번호 변경 버튼 */
//	JButton changePwdButton = new JButton("");
//	changePwdButton.setContentAreaFilled(false);
//	changePwdButton.setBorderPainted(false);
//	changePwdButton.setIcon(new ImageIcon("image/member/myPage/pwdchange.png"));
//	changePwdButton.setBounds(92, 53, 137, 137);
//	changePwdButton.addActionListener(new ActionListener() {
//		
//		@Override
//		public void actionPerformed(ActionEvent e) {
//			/* 비밀번호 변경 창 패널 */
//			JPanel changePwdPanel = new JPanel();
//			changePwdPanel.setLayout(null);
//			changePwdPanel.setBounds(0, 100, 500, 770);
//			changePwdPanel.setVisible(true);
//			changePwdPanel.setBackground(Color.white);
//			ChangePwdPanel.setVisible(false);
//			frame.add(changePwdPanel);
//			
//			/* 취소 버튼 */
//			MyPage.btnRemove(cpB1);
//			cpB1.setVisible(true);
//			cpB1.setBounds(58, 595, 178, 63);
//			cpB1.setIcon(new ImageIcon("image/member/updatePwd/Group 677.png"));
//			cpB1.addActionListener(new ActionListener() {
//				
//				@Override
//				public void actionPerformed(ActionEvent e) {
//					System.out.println("취소 버튼 클릭");
//					
//					/* 마이페이지로 돌아가기 */
////					FrameManager.changePanel(changePwdPanel, downsidePanel);
//				}
//			});
//			changePwdPanel.add(cpB1);
//			
//			/* 변경 버튼 */
//			MyPage.btnRemove(cpB2);
//			cpB2.setVisible(true);
//			cpB2.setBounds(264, 595, 178, 63);
//			cpB2.setIcon(new ImageIcon("image/member/updatePwd/Group 879.png"));
//			cpB2.addActionListener(new ActionListener() {
//				
//				@Override
//				public void actionPerformed(ActionEvent e) {
//					System.out.println("변경 버튼 클릭");
//					
//					/* 비밀번호 확인 후 다를 시 팝업*/
//					
//					/* 비밀번호 변경 완료 팝업*/
//				}
//			});
//			changePwdPanel.add(cpB2); 
//			
//			/* 기존 비밀번호 입력창 */
//			cpPF1.setBorder(null);
//			cpPF1.setOpaque(false);
//			cpPF1.setBounds(195, 288, 270, 45);
//			changePwdPanel.add(cpPF1);
//			
//			/* 새 비밀번호 입력창 */
//			cpPF2.setBorder(null);
//			cpPF2.setOpaque(false);
//			cpPF2.setBounds(195, 366, 270, 45);
//			changePwdPanel.add(cpPF2);
//			
//			/* 새 비밀번호 확인창 */
//			cpPF3.setBorder(null);
//			cpPF3.setOpaque(false);
//			cpPF3.setBounds(195, 441, 270, 45);
//			changePwdPanel.add(cpPF3);
//			
//			/* 입력창 라벨 */
//			cpL1.setBounds(0, 0, 500, 770);
//			cpL1.setVisible(true);
//			cpL1.setIcon(new ImageIcon("image/member/updatePwd/Group 878.png"));
//			changePwdPanel.add(cpL1);
//			
//			
//			changePwdPanel.revalidate();
//			changePwdPanel.repaint();
//		}
//	});
//	ChangePwdPanel.add(changePwdButton);
//	
//	}
//	
//}
