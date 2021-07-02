package com.devs.honddoni.member.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import com.devs.honddoni.common.mainframe.MainFrame;
import com.devs.honddoni.member.controller.MemberController;
import com.devs.honddoni.member.model.dto.ChangePwdDTO;
import com.devs.honddoni.member.model.dto.MemberRegistDTO;

public class MyPage {
	
	MainFrame frame = new MainFrame();
	
	private MemberController memberController;
	private MemberRegistDTO memberRegistDTO;
	private ChangePwdDTO changePwdDTO;
	
	/* 비밀번호변경 */
	private JButton cpB1 = new JButton();					//비밀번호 변경 취소버튼
	private JButton cpB2 = new JButton();					//비밀번호 변경 변경버튼
	private JLabel cpL1 = new JLabel(); 					//비밀번호 변경 입력창 이미지
	private JPasswordField cpPF1 = new JPasswordField();	//비밀번호 변경 기존비번 입력창
	private JPasswordField cpPF2 = new JPasswordField();	//비밀번호 변경 새비번 입력창
	private JPasswordField cpPF3 = new JPasswordField();	//비밀번호 변경 새비번 확인창
	
	/* 회원 탈퇴 */
	private JButton rmB1 = new JButton();					//회원탈퇴 취소버튼
	private JButton rmB2 = new JButton();					//회원탈퇴 탈퇴버튼
	private JLabel rmL1 = new JLabel(); 					//회원탈퇴 비밀번호 입력창 이미지
	private JPasswordField rmPF1 = new JPasswordField();	//회원탈퇴 비밀번호 입력창
	
	/* 개인정보 변경 */
	private JButton ciB1 = new JButton();					//개인정보변경 프로필 사진 변경 버튼
	private JButton ciB2 = new JButton();					//개인정보변경
	private JRadioButton ciRb1 = new JRadioButton();		//개인정보변경 성별 선택 버튼
	private JTextField ciTp1 = new JTextField();			//개인정보변경 생일 입력창
	private JTextField ciTp2 = new JTextField();			//개인정보변경 닉네임 입력창
	private JTextField ciTp3 = new JTextField();			//개인정보변경 주소 입력창
	private JTextField ciTp4 = new JTextField();			//개인정보변경 휴대전화 입력창
	private JTextField ciTp5 = new JTextField();			//개인정보변경 이메일 입력창
	private JLabel ciL1 = new JLabel();						//개인정보변경 이름 라벨
	private JLabel ciL2 = new JLabel();						//개인정보변경 아이디 라벨
	private JLabel ciL3 = new JLabel();						//개인정보변경 입력창 라벨
	private JComboBox characterSelectCombo;
	
	
	public static JButton btnRemove(JButton jbtn) {
		jbtn.setBorderPainted(false);
		jbtn.setContentAreaFilled(false);
		return jbtn;
	}

	public MyPage() {
		
		/* 하단 패널 */
		JPanel downsidePanel = new JPanel();
		downsidePanel.setBounds(0, 100, 500, 770);
		downsidePanel.setBackground(Color.white);
		downsidePanel.setLayout(null);
//		downsidePanel.setOpaque(false);	//배경 투명
		
		frame.add(downsidePanel);
		
		
/*==================================  비밀번호 변경 버튼   ================================================== */		
		
		/* 비밀번호 변경 버튼 */
		JButton changePwdButton = new JButton("");
		changePwdButton.setContentAreaFilled(false);
		changePwdButton.setBorderPainted(false);
		changePwdButton.setIcon(new ImageIcon("image/member/myPage/pwdchange.png"));
		changePwdButton.setBounds(92, 53, 137, 137);
		changePwdButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				/* 비밀번호 변경 창 패널 */
				JPanel changePwdPanel = new JPanel();
				changePwdPanel.setLayout(null);
				changePwdPanel.setBounds(0, 100, 500, 770);
				changePwdPanel.setVisible(true);
				changePwdPanel.setBackground(Color.white);
				downsidePanel.setVisible(false);
				frame.add(changePwdPanel);
				
				/* 기존 비밀번호 입력창 */
				cpPF1.setBorder(null);
				cpPF1.setOpaque(false);
				cpPF1.setBounds(195, 288, 270, 45);
				changePwdPanel.add(cpPF1);
				
				/* 새 비밀번호 입력창 */
				cpPF2.setBorder(null);
				cpPF2.setOpaque(false);
				cpPF2.setBounds(195, 366, 270, 45);
				changePwdPanel.add(cpPF2);
				
				/* 새 비밀번호 확인창 */
				cpPF3.setBorder(null);
				cpPF3.setOpaque(false);
				cpPF3.setBounds(195, 441, 270, 45);
				changePwdPanel.add(cpPF3);
				
				/* 입력창 라벨 */
				cpL1.setBounds(0, 0, 500, 770);
				cpL1.setVisible(true);
				cpL1.setIcon(new ImageIcon("image/member/updatePwd/Group 878.png"));
				changePwdPanel.add(cpL1);
				
				
				changePwdPanel.revalidate();
				changePwdPanel.repaint();

				/* 취소 버튼 */
				MyPage.btnRemove(cpB1);
				cpB1.setVisible(true);
				cpB1.setBounds(58, 595, 178, 63);
				cpB1.setIcon(new ImageIcon("image/member/updatePwd/Group 677.png"));
				cpB1.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						System.out.println("취소 버튼 클릭");
						
						/* 마이페이지로 돌아가기 */
//						FrameManager.changePanel(changePwdPanel, downsidePanel);
					}
				});
				changePwdPanel.add(cpB1);
				
				/* 변경 버튼 */
				MyPage.btnRemove(cpB2);
				cpB2.setVisible(true);
				cpB2.setBounds(264, 595, 178, 63);
				cpB2.setIcon(new ImageIcon("image/member/updatePwd/Group 879.png"));
				cpB2.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						if(e.getSource() == cpB2) {
							memberController = new MemberController();
							String password = "";
							   char[] pass = cpPF1.getPassword();
							   for(int i = 0; i < pass.length; i++) {
							      password += pass[i];
							   }         
							   memberController.pwdCheck(password);
						}
						
						/* 비밀번호 확인 후 다를 시 팝업*/
						
						/* 비밀번호 변경 완료 팝업*/
					}
				});
				changePwdPanel.add(cpB2); 
				
			}
		});
		downsidePanel.add(changePwdButton);
		
		
/*================================== 개인정보 변경 버튼   ================================================== */			
		
		
		/* 개인정보 변경 버튼 */
		JButton changeMemberinfo = new JButton("");
		changeMemberinfo.setIcon(new ImageIcon("image/member/myPage/changeInfo.png"));
		changeMemberinfo.setContentAreaFilled(false);
		changeMemberinfo.setBorderPainted(false);
		changeMemberinfo.setBounds(272, 53, 137, 137);
		changeMemberinfo.addActionListener(new ActionListener() {
			
			@Override 	
			public void actionPerformed(ActionEvent e) {
				
				/* 개인정보 변경 호출 */
				JPanel changeMemberinfoPanel = new JPanel();
				changeMemberinfoPanel.setLayout(null);
				changeMemberinfoPanel.setBounds(0, 100, 500, 770);
				changeMemberinfoPanel.setVisible(true);
				changeMemberinfoPanel.setBackground(Color.white);
				downsidePanel.setVisible(false);
				frame.add(changeMemberinfoPanel);
				
				/* 취소 버튼 */
				btnRemove(cpB1);
				cpB1.setVisible(true);
				cpB1.setBounds(58, 670, 178, 63);
				cpB1.setIcon(new ImageIcon("image/member/updatePwd/Group 677.png"));
				cpB1.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						System.out.println("취소 버튼 클릭");
						
						/* 마이페이지로 돌아가기 */
						new MyPage();
					}
				});
				changeMemberinfoPanel.add(cpB1);
				
				/* 변경 버튼 */
				btnRemove(cpB2);
				cpB2.setVisible(true);
				cpB2.setBounds(264, 670, 178, 63);
				cpB2.setIcon(new ImageIcon("image/member/updatePwd/Group 879.png"));
				cpB2.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						System.out.println("변경 버튼 클릭");
						
					}
				});
				changeMemberinfoPanel.add(cpB2); 

				
				/* 프로필 변경 버튼 */
				btnRemove(ciB1);
				ciB1.setVisible(true);
				ciB1.setBounds(54, 10, 126, 129);
				ciB1.setIcon(new ImageIcon("image/member/updateinfo/Group 884.png"));
				changeMemberinfoPanel.add(ciB1);
				ciB1.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						System.out.println("프로필 변경 버튼 클릭"); 
						
					}
				});
				
				/* 성별 선택 라디오 버튼 (고정되나?) */
				JRadioButton genderMRb = new JRadioButton("남");
		        genderMRb.setBounds(345, 293, 55, 26);
		        genderMRb.setFont(new Font("font/NotoSansKR-Bold", Font.BOLD, 17));
		        genderMRb.setOpaque(false);
		        changeMemberinfoPanel.add(genderMRb);
		        /* DB에서 성별정보 받아서 고정 하기 */
		        
				JRadioButton genderFRb = new JRadioButton("여");
		        genderFRb.setBounds(400, 293, 55, 26);
		        genderFRb.setOpaque(false);
		        genderFRb.setFont(new Font("font/NotoSansKR-Bold", Font.BOLD, 17));
		        changeMemberinfoPanel.add(genderFRb);
		        
				/* 생일 입력창 */
				ciTp1.setBorder(null);
				ciTp1.setOpaque(false);
				ciTp1.setBounds(130, 283, 220, 45);
				changeMemberinfoPanel.add(ciTp1);
				
				/* 닉네임 입력창 */
				ciTp2.setBorder(null);
				ciTp2.setOpaque(false);
				ciTp2.setBounds(130, 348, 330, 45);
				changeMemberinfoPanel.add(ciTp2);
				
				/* 주소 입력창 */
				ciTp3.setBorder(null);
				ciTp3.setOpaque(false);
				ciTp3.setBounds(130, 411, 330, 45);
				changeMemberinfoPanel.add(ciTp3);
				
				/* 휴대전화 입력창 */
				ciTp4.setBorder(null);
				ciTp4.setOpaque(false);
				ciTp4.setBounds(130, 474, 330, 45);
				changeMemberinfoPanel.add(ciTp4);
				
				/* 이메일 입력창 */
				ciTp5.setBorder(null);
				ciTp5.setOpaque(false);
				ciTp5.setBounds(130, 538, 330, 45);
				changeMemberinfoPanel.add(ciTp5);
				
				/* DB에서 이름 불러와서 표시 */
				ciL1.setBounds(130, 153, 220, 45);
				ciL1.setText("이름");
				changeMemberinfoPanel.add(ciL1);
				
				/* DB에서 아이디 불러와서 표시 */
				ciL2.setBounds(130, 219, 220, 45);
				ciL2.setText("아이디");
				changeMemberinfoPanel.add(ciL2);
				
				/* 개인정보 변경 입력창 라벨 */
				ciL3.setBounds(0, 0, 500, 770);
				ciL3.setVisible(true);
				ciL3.setIcon(new ImageIcon("image/member/updateInfo/Group 1073.png"));
				changeMemberinfoPanel.add(ciL3);
				
				/* 본인 성향 선택 콤보박스 */
				String[] characterCategory = {"", "리더형", "팔로워형", "계획적", "즉흥적", "외향적", "내향적", "감성적", "이성적"};
				characterSelectCombo = new JComboBox(characterCategory);
				
				characterSelectCombo.setBounds(110, 600, 360, 47);
				characterSelectCombo.setSelectedIndex(0);
				characterSelectCombo.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						System.out.println("콤보박스 동작");				
					}
				});
				changeMemberinfoPanel.add(characterSelectCombo);
				
				changeMemberinfoPanel.revalidate();
				changeMemberinfoPanel.repaint();
			}
				
		});
		downsidePanel.add(changeMemberinfo);
		
		
		
/*==================================  탈퇴하기 버튼   ================================================== */			
		
		
		
		/* 탈퇴하기 버튼 */
		JButton resignMemberButton = new JButton("");
		resignMemberButton.setIcon(new ImageIcon("image/member/myPage/resign.png"));
		resignMemberButton.setContentAreaFilled(false);
		resignMemberButton.setBorderPainted(false);
		resignMemberButton.setBounds(92, 280, 137, 137);
		resignMemberButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				/* 회원 탈퇴 패널 */
				JPanel resignMemberPanel = new JPanel();
				resignMemberPanel.setLayout(null);
				resignMemberPanel.setBounds(0, 100, 500, 770);
				resignMemberPanel.setVisible(true);
				resignMemberPanel.setBackground(Color.white);
				downsidePanel.setVisible(false);
				frame.add(resignMemberPanel);
				
				/* 취소 버튼 */
				btnRemove(rmB1);
				rmB1.setVisible(true);
				rmB1.setBounds(58, 595, 178, 63);
				rmB1.setIcon(new ImageIcon("image/member/deleteMember/cancleButton.png"));
				rmB1.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						System.out.println("취소 버튼 클릭");
						
						/* 마이페이지로 돌아가기 */
						new MyPage();
					}
				});
				resignMemberPanel.add(rmB1);
				
				/* 탈퇴 버튼 */
				btnRemove(rmB2);
				rmB2.setVisible(true);
				rmB2.setBounds(264, 595, 178, 63);
				rmB2.setIcon(new ImageIcon("image/member/deleteMember/resign.png"));
				rmB2.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						System.out.println("탈퇴 버튼 클릭");
						
						/* 비밀번호 확인 후 다를 시 팝업*/
						
						/* 비밀번호 환인 후 일치시 탈퇴 완료 팝업*/
					}
				}); 
				resignMemberPanel.add(rmB2); 
				
				/* 비밀번호 입력창 */
				rmPF1.setBorder(null);
				rmPF1.setOpaque(false);
				rmPF1.setBounds(195, 300, 270, 45);
				resignMemberPanel.add(rmPF1);
				
				/* 회원탈퇴 비밀번호 입력창 라벨 */
				rmL1.setBounds(0, 0, 500, 770);
				rmL1.setVisible(true);
				rmL1.setIcon(new ImageIcon("image/member/deleteMember/delete.png"));
				resignMemberPanel.add(rmL1);
				
				
				resignMemberPanel.revalidate();
				resignMemberPanel.repaint();
			}
		});
		downsidePanel.add(resignMemberButton);
		
	
/*==================================  관심글 모아보기 버튼   ================================================== */
		
		
		/* 관심글 모아보기 버튼 */
		JButton interestingPostButton = new JButton("");
		interestingPostButton.setIcon(new ImageIcon("image/member/myPage/heart.png"));
		interestingPostButton.setContentAreaFilled(false);
		interestingPostButton.setBorderPainted(false);
		interestingPostButton.setBounds(272, 280, 137, 137);
		interestingPostButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				/* 관심글 모아보기  호출 */
				System.out.println("관심글 모아보기  호출");
				JPanel interestingPostPanel = new JPanel();
				interestingPostPanel.setLayout(null);
				interestingPostPanel.setBounds(0, 100, 500, 770);
				interestingPostPanel.setVisible(true);
				interestingPostPanel.setBackground(Color.white);
				downsidePanel.setVisible(false);
				frame.add(interestingPostPanel);  
				
				JLabel interestingPostLabel = new JLabel();
				interestingPostLabel.setBounds(0, 100, 500, 770);
				interestingPostLabel.setIcon(new ImageIcon("image/member/AllInteresting/qq.png"));
				interestingPostPanel.add(interestingPostLabel);
				
				JLabel qqqq = new JLabel();
				
				String[] qq = {"지역별(가나다)", "활동 카테고리별"};
				JComboBox qqq = new JComboBox(qq);
				qqq.setBounds(276, 140, 187, 36);
				qqq.setVisible(true);
				interestingPostPanel.add(qqq);
				
				
				JLabel asdasd = new JLabel();
				asdasd.setBounds(276, 40, 187, 36);
				asdasd.setIcon(new ImageIcon("image/member/AllInteresting/qqq.png"));
				interestingPostLabel.add(asdasd);
				
			}
		});
		downsidePanel.add(interestingPostButton);
		
		
/*==================================  업적 & 포인트 버튼   ================================================== */		
		
		/* 업적 & 포인트 버튼 */
		JButton rewardButton = new JButton("");
		rewardButton.setIcon(new ImageIcon("image/member/myPage/medal.png"));
		rewardButton.setContentAreaFilled(false);
		rewardButton.setBorderPainted(false);
		rewardButton.setBounds(92, 501, 137, 137);
		rewardButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				/* 업적 & 포인트 호출 */
				System.out.println("업적 & 포인트 호출");
				JPanel rewardPanel = new JPanel();
				rewardPanel.setLayout(null);
				rewardPanel.setBounds(0, 100, 500, 770);
				rewardPanel.setVisible(true);
				rewardPanel.setBackground(Color.white);
				downsidePanel.setVisible(false);
				frame.add(rewardPanel);
				
				/* 업적 관리 버튼*/
				JButton rewardManageBtn = new JButton();
				btnRemove(rewardManageBtn);
				rewardManageBtn.setBounds(35, 24, 431, 322);
				rewardManageBtn.setIcon(new ImageIcon("image/member/reward/rewarManagerBtn.png"));
				rewardPanel.add(rewardManageBtn);
				rewardManageBtn.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						/* 업적관리 준비중 */
						JPanel rewardManagerPanel = new JPanel();
						rewardManagerPanel.setLayout(null);
						rewardManagerPanel.setBounds(0, 0, 500, 770);
						rewardManagerPanel.setVisible(true);
						rewardManagerPanel.setBackground(Color.white);
						rewardPanel.setVisible(false);
						frame.add(rewardManagerPanel);
						
						JLabel rewardManageLabel = new JLabel();
						rewardManageLabel.setBounds(0, 100, 500, 770);
						rewardManageLabel.setIcon(new ImageIcon("image/member/reward/rewardManageLabel.png"));
						rewardManagerPanel.add(rewardManageLabel);
					}
				});
				
				/* 포인트 관리 버튼 */
				JButton pointManageBtn = new JButton();
				btnRemove(pointManageBtn);
				pointManageBtn.setBounds(35, 371, 431, 322);
				pointManageBtn.setIcon(new ImageIcon("image/member/reward/pointManageBtn.png"));
				pointManageBtn.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						/* 포인트 관리 준비중 */
						JPanel pointManagePanel = new JPanel();
						pointManagePanel.setLayout(null);
						pointManagePanel.setBounds(0, 0, 500, 770);
						pointManagePanel.setVisible(true);
						pointManagePanel.setBackground(Color.white);
						rewardPanel.setVisible(false);
						frame.add(pointManagePanel);
						
						JLabel pointManageLabel = new JLabel();
						pointManageLabel.setBounds(0, 100, 500, 770);
						pointManageLabel.setIcon(new ImageIcon("image/member/reward/pointManageLabel.png"));
						pointManagePanel.add(pointManageLabel);
					}
				});
				rewardPanel.add(pointManageBtn);
			}
		});
		downsidePanel.add(rewardButton);
		
		
/*==================================  내글 모아보기 버튼   ================================================== */
		
		
		/* 내글 모아보기 버튼 */
		JButton writtenPostButton = new JButton("");
		writtenPostButton.setIcon(new ImageIcon("image/member/myPage/moabogi.png"));
		writtenPostButton.setContentAreaFilled(false);
		writtenPostButton.setBorderPainted(false);
		writtenPostButton.setBounds(272, 501, 137, 137);
		writtenPostButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				/* 내글 모아보기 호출 */
				System.out.println("내글 모아보기 호출");
				JPanel myPostPanel = new JPanel();
				myPostPanel.setLayout(null);
				myPostPanel.setBounds(0, 100, 500, 770);
				myPostPanel.setVisible(true);
				myPostPanel.setBackground(Color.white);
				downsidePanel.setVisible(false);
				frame.add(myPostPanel);  
				
				JLabel myPostLabel = new JLabel();
				myPostLabel.setBounds(0, 100, 500, 770);
				myPostLabel.setIcon(new ImageIcon("image/member/selectMyPost/myPostLabel.png"));
				myPostPanel.add(myPostLabel);
				
			}
		});
		downsidePanel.add(writtenPostButton);
		
		
/*==================================  마이페이지에 있는 버튼 밑에 글씨들   ================================================== */
		
		/* 마이페이지에 있는 버튼 밑에 글씨들 */
		JLabel menuNameLabel = new JLabel("");
		menuNameLabel.setIcon(new ImageIcon("image/member/myPage/myPageName.png"));
		menuNameLabel.setBounds(111, 10, 500, 870);
		downsidePanel.add(menuNameLabel);
		


			
		
		/* 새로고침 */
		frame.repaint();
		frame.revalidate();
		
		
		
	}
	
}
