package com.devs.honddoni.member.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import com.devs.honddoni.common.font.FontManager;
import com.devs.honddoni.common.mainframe.FrameManager;
import com.devs.honddoni.common.mainframe.MainFrame;
import com.devs.honddoni.common.mainframe.PopupFrame;
import com.devs.honddoni.common.sound.SoundManager;
import com.devs.honddoni.member.controller.MemberController;
import com.devs.honddoni.member.model.dto.ChangePwdDTO;
import com.devs.honddoni.member.model.dto.MemberInfoDTO;
import com.devs.honddoni.member.model.dto.MemberRegistDTO;
import com.devs.honddoni.memberLog.controller.GetLoginMember;
import com.devs.honddoni.memberLog.view.FirstView;
import com.devs.honddoni.memberLog.view.MemberLogView;
import com.devs.honddoni.search.view.MainBottomPanel;

public class MyPage extends JPanel {
	
	public MyPage myPage;
	private MainFrame frame;
	private MemberLogView memberLogView;
	
	private MemberController memberController = new MemberController();;
	private MemberRegistDTO memberRegistDTO;
	private ChangePwdDTO changePwdDTO;
	
	/* 비밀번호변경 */
	JLabel changePwdButton = new JLabel("");
	private JPanel changePwdPanel = new JPanel();
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
	JButton changeMemberinfo = new JButton("");
	JPanel changeMemberinfoPanel = new JPanel();
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
	private JLabel ciL3 = new JLabel();						//개인정보변경 생일 라벨
	private JLabel ciL4 = new JLabel();						//개인정보변경 성별 라벨
	private JLabel ciL5 = new JLabel();						//개인정보변경 성별 라벨
	private JLabel ciL6 = new JLabel();						//개인정보변경 성별 라벨
	private JLabel ciL7 = new JLabel();						//개인정보변경 성별 라벨
	private JLabel ciL8 = new JLabel();						//개인정보변경 성별 라벨
	private JLabel ciL9 = new JLabel();						//개인정보변경 입력창 라벨
	private JComboBox characterSelectCombo;
	
	private JPanel upPanel;									//상단 패널
	private JLabel backgroundImage;							//상단 패널 바탕이미지
	private JButton homeBtn;									//홈버튼
	private JButton myHonddoniBtn;							//MY혼또니 버튼
	private JButton searchHonddoniBtn;						//혼또니 찾기 버튼
	private JButton interestingBtn;							//관심글 찾기 버튼
	static JButton noticeBtn;								//공지사항 조회 버튼
	
	static JPanel bottomPanel = new JPanel();

	
	JButton resignMemberButton = new JButton("");
	JButton interestingPostButton = new JButton("");
	JButton rewardButton = new JButton("");
	JButton writtenPostButton = new JButton(""); /* 내글 모아보기 버튼 */
	JLabel menuNameLabel = new JLabel("");
	
	FontManager font = new FontManager();
	
	
//	static String 테스트아이디 = "user06";
//	static String 테스트아이디 = "sample01";
	String userId = GetLoginMember.getInstance().getLoginMemberId();
	
	public static JButton btnRemove(JButton jbtn) {
		jbtn.setBorderPainted(false);
		jbtn.setContentAreaFilled(false);
		return jbtn;
	}

				
	public MyPage(MainFrame frame) {
		
		this.frame = frame;
		this.myPage = this;
		
		
		
//		this.setBounds(0, 100, 500, 770);
//		this.setBackground(Color.white);
//		this.setLayout(null);
//		frame.add(this);
		
		
		bottomPanel.setBounds(0, 100, 500, 770);
		bottomPanel.setBackground(Color.WHITE);
		bottomPanel.setLayout(null);
		frame.add(bottomPanel);
		
		upPanel = new JPanel();
		upPanel.setBounds(0, 0, 500, 100);
		upPanel.setLayout(null);
		upPanel.setBackground(Color.WHITE);
		
		
		backgroundImage = new JLabel("");
		backgroundImage.setBounds(0, 0, 500, 100);
		backgroundImage.setIcon(new ImageIcon("image/common/toppanel/backgroundImage.png"));
		backgroundImage.setVisible(true); 	
		
		myHonddoniBtn = new JButton("");
		myHonddoniBtn.setBounds(171,23,56,56);
		myHonddoniBtn.setIcon(new ImageIcon("image/common/toppanel/myHonddoniBtn.png"));
		myHonddoniBtn.setBorderPainted(false);
		myHonddoniBtn.setContentAreaFilled(false);
		myHonddoniBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("my혼또니 버튼 클릭");
				
				frame.remove(bottomPanel);
				frame.remove(myPage);
				
				bottomPanel.remove(changePwdPanel);
				bottomPanel.removeAll();
				frame.repaint();
				frame.revalidate();
				bottomPanel.repaint();
				bottomPanel.revalidate();
				myPage.repaint();
				myPage.revalidate();
				
				frame.add(bottomPanel);
				bottomPanel.add(menuNameLabel);
//				bottomPanel.add(changePwdButton);
//				bottomPanel.add(changeMemberinfo);
//				bottomPanel.add(resignMemberButton);
//				bottomPanel.add(interestingPostButton);
//				bottomPanel.add(rewardButton);
//				bottomPanel.add(writtenPostButton);

			}
		});
		
		searchHonddoniBtn = new JButton("");
		searchHonddoniBtn.setBounds(234,23,56,56);
		searchHonddoniBtn.setIcon(new ImageIcon("image/common/toppanel/SearchHonddoniBtn.png"));
		searchHonddoniBtn.setBorderPainted(false);
		searchHonddoniBtn.setContentAreaFilled(false);
		searchHonddoniBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("혼또니 찾기 버튼 클릭");
				
				
			}
		});
		
		homeBtn = new JButton("");
		homeBtn.setBounds(298,23,56,56);
		homeBtn.setIcon(new ImageIcon("image/common/toppanel/HomeBtn.png"));
		homeBtn.setBorderPainted(false);
		homeBtn.setContentAreaFilled(false);
		homeBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("홈  버튼 클릭");
				frame.remove(bottomPanel);
				frame.remove(myPage);
				
				bottomPanel.remove(changePwdPanel);
				bottomPanel.removeAll();
				frame.repaint();
				frame.revalidate();
				bottomPanel.repaint();
				bottomPanel.revalidate();
				myPage.repaint();
				myPage.revalidate();

				new MainBottomPanel(frame);
			}
		});
		
		interestingBtn = new JButton("");
		interestingBtn.setBounds(362,23,56,56);
		interestingBtn.setIcon(new ImageIcon("image/common/toppanel/InterestingBtn.png"));
		interestingBtn.setBorderPainted(false);
		interestingBtn.setContentAreaFilled(false);
		interestingBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("관심글 목록 버튼 클릭");
				frame.remove(bottomPanel);
				frame.remove(myPage);
				
				bottomPanel.remove(changePwdPanel);
				bottomPanel.removeAll();
				frame.repaint();
				frame.revalidate();
				bottomPanel.repaint();
				bottomPanel.revalidate();
				myPage.repaint();
				myPage.revalidate();

				new MainBottomPanel(frame);
			}
		});
		
		noticeBtn = new JButton("");
		noticeBtn.setBounds(426,23,56,56);
		noticeBtn.setIcon(new ImageIcon("image/common/toppanel/NoticeBtn.png"));
		noticeBtn.setBorderPainted(false);
		noticeBtn.setContentAreaFilled(false);
		noticeBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("공지사항 버튼 클릭");
				
				
			}
		});
		upPanel.add(myHonddoniBtn);
		upPanel.add(searchHonddoniBtn);
		upPanel.add(homeBtn);
		upPanel.add(interestingBtn);
		upPanel.add(noticeBtn);
		upPanel.add(backgroundImage);
		frame.add(upPanel);
/*==================================  비밀번호 변경 버튼   ================================================== */		
			
		/* 비밀번호 변경 버튼 */
//		JLabel changePwdButton = new JLabel("");
//		changePwdButton.setContentAreaFilled(false);
//		changePwdButton.setBorderPainted(false);
		changePwdButton.setIcon(new ImageIcon("image/member/myPage/pwdchange.png"));
		changePwdButton.setBounds(92, 53, 137, 137);
		bottomPanel.add(changePwdButton);
		changePwdButton.addMouseListener(new MouseAdapter() {
			
			public void mousePressed(MouseEvent e) {
				/* 비밀번호 변경 창 패널 */
//				JPanel changePwdPanel = new JPanel();
				changePwdPanel.setLayout(null);
				changePwdButton.setEnabled(false);
				changePwdPanel.setBounds(0, 100, 500, 770);
				changePwdPanel.setBackground(Color.white);
				frame.remove(bottomPanel);
				frame.add(changePwdPanel);
				changePwdPanel.setVisible(true);
				
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
						changePwdPanel.setVisible(false);
						changePwdButton.setEnabled(true);
						bottomPanel.setVisible(true);
						frame.remove(changePwdPanel);
						frame.add(bottomPanel);
//						FrameManager.changePanel(frame, changePwdPanel, new MyPage(frame));
						
					}
			
		}); 
			
				changePwdPanel.add(cpB1);
				
		
				/* 변경 버튼 */
				MyPage.btnRemove(cpB2);
				cpB2.setVisible(true);
				cpB2.setBounds(264, 595, 178, 63);
				cpB2.setIcon(new ImageIcon("image/member/updatePwd/Group 879.png"));
				changePwdPanel.add(cpB2); 
				cpB2.addActionListener(new ActionListener() {
					
					@Override
					/* 입력한 비밀번호가 현재 비밀번호와 일치하는치 확인 */
					public void actionPerformed(ActionEvent e) {
						
						if(e.getSource() == cpB2) {
						
							 	String password = "";
							   char[] pass = cpPF1.getPassword();
							   for(int i = 0; i < pass.length; i++) {
							      password += pass[i];
							   }         
							   changePwdDTO = new ChangePwdDTO();
							   changePwdDTO.setMemberOldPassword(password);
							   boolean checkP = memberController.pwdCheck(changePwdDTO);		 //입력값 일치 확인
							   
							   /* 새로 입력한 비밀번호와 비밀번호 재확인이 일치한지 확인*/
							   if(checkP) {
								   String newPassword = "";
								   char[] newPass = cpPF2.getPassword();
								   for(int i = 0; i < newPass.length; i++) {
									   newPassword += newPass[i];
								   }         
								   
								   String newPasswordReCheck = "";
								   char[] newPassRc = cpPF3.getPassword();
								   for(int i = 0; i < newPassRc.length; i++) {
									   newPasswordReCheck += newPassRc[i];
								   }         
								   changePwdDTO.setMemberNewPassword(newPassword);
								   changePwdDTO.setMemberNewPasswordRecheck(newPasswordReCheck);
								   
								   memberController.newPwdEqualCheck(changePwdDTO);
								   
								   }
								   
							   }
							   
							   
						}
					}
				});
				
			}
		});
		
		
/*================================== 개인정보 변경 버튼   ================================================== */			
		
		
		/* 개인정보 변경 버튼 */
		
		changeMemberinfo.setIcon(new ImageIcon("image/member/myPage/changeInfo.png"));
		changeMemberinfo.setContentAreaFilled(false);
		changeMemberinfo.setBorderPainted(false);
		changeMemberinfo.setBounds(272, 53, 137, 137);
		bottomPanel.add(changeMemberinfo);
		changeMemberinfo.addActionListener(new ActionListener() {
			@Override 	
			public void actionPerformed(ActionEvent e) {
				
				/* 개인정보 변경 호출 */
				
				changeMemberinfoPanel.setLayout(null);
				changeMemberinfoPanel.setBounds(0, 100, 500, 770);
				changeMemberinfoPanel.setBackground(Color.white);
				
				changeMemberinfoPanel.setVisible(true);
				bottomPanel.setVisible(false);
				frame.remove(bottomPanel);
				frame.add(changeMemberinfoPanel);
				
				/* Singleton으로 접속자ID 보내기 */
				MemberInfoDTO memberInfo 
				= memberController.callMemberInfo(userId);
				
				String profile = memberInfo.getProfile();
				String name = memberInfo.getName();
				String id = memberInfo.getId();
				String birth = memberInfo.getBirth();
				String gender = memberInfo.getGender();
				String nickName = memberInfo.getNickName();
				String address = memberInfo.getAddress();
				String phone = memberInfo.getPhone();
				String email = memberInfo.getEmail();
				int characterCode = memberInfo.getCharacterCode();
				
				
				/* 취소 버튼 */
				btnRemove(cpB1);
				cpB1.setVisible(true);
				cpB1.setBounds(58, 670, 178, 63);
				cpB1.setIcon(new ImageIcon("image/member/updatePwd/Group 677.png"));
				cpB1.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						/* 마이페이지로 돌아가기 */
						changeMemberinfoPanel.setVisible(false);
						bottomPanel.setVisible(true);
						
					}
				});
				changeMemberinfoPanel.add(cpB1);
				
				/* 프로필 변경 버튼 */
				btnRemove(ciB1);
				ciB1.setVisible(true);
				ciB1.setBounds(54, 10, 126, 129);
				changeMemberinfoPanel.add(ciB1);
				
				/* 접속한 사용자의 프로필 사진을 셋팅 해줌 */
				switch(profile) {
					case "1" : ciB1.setIcon(new ImageIcon("image/member/updateInfo/pfb1.png")); break;
					case "2" : ciB1.setIcon(new ImageIcon("image/member/updateInfo/pfb2.png")); break;
					case "3" : ciB1.setIcon(new ImageIcon("image/member/updateInfo/pfb3.png")); break;
					case "4" : ciB1.setIcon(new ImageIcon("image/member/updateInfo/pfb4.png")); break;
					case "5" : ciB1.setIcon(new ImageIcon("image/member/updateInfo/pfb5.png")); break;
					default : System.out.println("프로필 없음");
				}
				
				ciB1.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						System.out.println("프로필 변경 버튼 클릭"); 
						
						/* 프로필 변경창 프레임 */
						JFrame popupFrame = new JFrame();
						popupFrame.setBounds(130,400,458,315);
						popupFrame.setVisible(true); 
						popupFrame.setLayout(null); 
						
						/* 프로필 변경창 패널 */
						JPanel popupPanel = new JPanel();
						popupPanel.setBounds(130,400,458,315);
						popupPanel.setVisible(true);
						popupPanel.setBackground(Color.white);
						
						/* 프로필 사진 1번 선택 */
						JLabel profile1 = new JLabel();
						profile1.setBounds(51,49,70,70);
						popupPanel.add(profile1);
						profile1.setIcon(new ImageIcon("image/member/updateInfo/pf1.png"));
						profile1.addMouseListener(new MouseAdapter() {
							@Override
							public void mouseClicked(MouseEvent e) {
								memberController.changeProfile("1");
								
								ciB1.setIcon(new ImageIcon("image/member/updateInfo/pfb1.png"));
							}
						});
						
						/* 프로필 사진 2번 선택 */
						JLabel profile2 = new JLabel();
						profile2.setBounds(190,49,70,70);
						popupPanel.add(profile2);
						profile2.setIcon(new ImageIcon("image/member/updateInfo/pf2.png"));
						profile2.addMouseListener(new MouseAdapter() {
							@Override
							public void mouseClicked(MouseEvent e) {
								memberController.changeProfile("2");
								
								ciB1.setIcon(new ImageIcon("image/member/updateInfo/pfb2.png"));
							}
						});
						
						/* 프로필 사진 3번 선택 */
						JLabel profile3 = new JLabel();
						profile3.setBounds(330,49,70,70);
						popupPanel.add(profile3);
						profile3.setIcon(new ImageIcon("image/member/updateInfo/pf3.png"));
						profile3.addMouseListener(new MouseAdapter() {
							@Override
							public void mouseClicked(MouseEvent e) {
								memberController.changeProfile("3");
								
								ciB1.setIcon(new ImageIcon("image/member/updateInfo/pfb3.png"));
							}
						});
						
						/* 프로필 사진 4번 선택 */
						JLabel profile4 = new JLabel();
						profile4.setBounds(115,139,70,70);
						popupPanel.add(profile4);
						profile4.setIcon(new ImageIcon("image/member/updateInfo/pf4.png"));
						profile4.addMouseListener(new MouseAdapter() {
							@Override
							public void mouseClicked(MouseEvent e) {
								memberController.changeProfile("4");
								
								ciB1.setIcon(new ImageIcon("image/member/updateInfo/pfb4.png"));
							}
						});
						
						/* 프로필 사진 5번 선택 */
						JLabel profile5 = new JLabel();
						profile5.setBounds(254,139,70,70);
						popupPanel.add(profile5);
						profile5.setIcon(new ImageIcon("image/member/updateInfo/pf5.png"));
						profile5.addMouseListener(new MouseAdapter() {
							@Override
							public void mouseClicked(MouseEvent e) {
								memberController.changeProfile("5");
								
								ciB1.setIcon(new ImageIcon("image/member/updateInfo/pfb5.png"));
							}
						});
						
						
						/* 프로필 사진 배경 이미지 */
						JLabel popupLabel = new JLabel();
						popupLabel.setSize(456,276);
						popupLabel.setIcon(new ImageIcon("image/member/updateInfo/backimage.png"));
						
						
						popupFrame.add(profile1);
						popupFrame.add(profile2);
						popupFrame.add(profile3);
						popupFrame.add(profile4);
						popupFrame.add(profile5);
						
						popupFrame.add(popupPanel);
						popupFrame.add(popupLabel);
						
					}
				});
				
				/* 기존 닉네임 보여주는 라벨 */
				JLabel oldNickName = new JLabel();
				oldNickName.setBounds(130, 348, 330, 45);
				oldNickName.setText(nickName);
				oldNickName.setFont(font.customFont12);
				changeMemberinfoPanel.add(oldNickName);
				oldNickName.addMouseListener(new MouseAdapter() {
					@Override
					public void mousePressed(MouseEvent e) {
						changeMemberinfoPanel.remove(oldNickName);
						changeMemberinfoPanel.repaint();
						changeMemberinfoPanel.revalidate();
					}
				});
				
				/* 닉네임 입력창 */
				ciTp2.setBorder(null);
				ciTp2.setOpaque(false);
				ciTp2.setBounds(130, 348, 330, 45);
				ciTp2.setFont(font.customFont1);
				changeMemberinfoPanel.add(ciTp2);
				
				
				
				/* 기존 주소 보여주는 라벨 */
				JLabel oldAddress = new JLabel();
				oldAddress.setBounds(130, 411, 330, 45);
				oldAddress.setText(address);
				oldAddress.setFont(font.customFont12);
				changeMemberinfoPanel.add(oldAddress);
				oldAddress.addMouseListener(new MouseAdapter() {
					@Override
					public void mousePressed(MouseEvent e) {
						changeMemberinfoPanel.remove(oldAddress);
						changeMemberinfoPanel.repaint();
						changeMemberinfoPanel.revalidate();
					}
				});
				
				/* 주소 입력창 */
				ciTp3.setBounds(130, 411, 330, 45);
				ciTp3.setBorder(null);
				ciTp3.setOpaque(false);
				ciTp3.setFont(font.customFont12);
				changeMemberinfoPanel.add(ciTp3);
				 
				
				/* 기존 휴대전화 보여주는 라벨 */
				JLabel oldPhone = new JLabel();
				oldPhone.setBounds(130, 474,  330, 45);
				oldPhone.setText(phone);
				oldPhone.setFont(font.customFont12);
				changeMemberinfoPanel.add(oldPhone);
				oldPhone.addMouseListener(new MouseAdapter() {
					@Override
					public void mousePressed(MouseEvent e) {
						changeMemberinfoPanel.remove(oldPhone);
						changeMemberinfoPanel.repaint();
						changeMemberinfoPanel.revalidate();
					}
				});
				
				/* 휴대전화 입력창 */
				ciTp4.setBorder(null);
				ciTp4.setOpaque(false);
				ciTp4.setBounds(130, 474, 330, 45);
				ciTp4.setFont(font.customFont1);
				changeMemberinfoPanel.add(ciTp4);
				
				/* 기존 이메일 보여주는 라벨 */
				JLabel oldEmail = new JLabel();
				oldEmail.setBounds(130, 538,  330, 45);
				oldEmail.setText(email);
				oldEmail.setFont(font.customFont12);
				changeMemberinfoPanel.add(oldEmail);
				oldEmail.addMouseListener(new MouseAdapter() {
					@Override
					public void mousePressed(MouseEvent e) {
						changeMemberinfoPanel.remove(oldEmail);
						changeMemberinfoPanel.repaint();
						changeMemberinfoPanel.revalidate();
					}
				});
				
				/* 이메일 입력창 */
				ciTp1.setBorder(null);
				ciTp1.setOpaque(false);
				ciTp1.setBounds(130, 538, 330, 45);
				ciTp1.setFont(font.customFont1);
				changeMemberinfoPanel.add(ciTp1);
				
				/* DB에서 이름 불러와서 표시 */
				ciL1.setBounds(130, 153, 220, 45);
				ciL1.setText(name);
				ciL1.setFont(font.customFont1);
				changeMemberinfoPanel.add(ciL1);
				
				/* DB에서 아이디 불러와서 표시 */
				ciL2.setBounds(130, 219, 220, 45);
				ciL2.setText(id);
				ciL2.setFont(font.customFont1);
				changeMemberinfoPanel.add(ciL2);
				
				/* DB에서 생일 불러와서 표시*/
				ciL3.setBounds(130, 283, 220, 45);
				ciL3.setText(birth);
				ciL3.setFont(font.customFont1);
				changeMemberinfoPanel.add(ciL3);
				
				/* DB에서 성별 불러와서 표시*/
				ciL4.setBounds(359, 290, 94, 26);
				if(gender.equals("남")) {
					ciL4.setIcon(new ImageIcon("image/member/updateInfo/genderM.png"));
				} else {
					ciL4.setIcon(new ImageIcon("image/member/updateInfo/genderF.png"));
				}
				changeMemberinfoPanel.add(ciL4);
				
				/* 본인 성향 선택 콤보박스 */
				
				String character = null ;
				switch(characterCode) {
				case 1: character = "리더형"; break;
				case 2: character = "팔로워형"; break;
				case 3: character = "계획적"; break;
				case 4: character = "즉흥적"; break;
				case 5: character = "외향적"; break;
				case 6: character = "내향적"; break;
				case 7: character = "감성적"; break;
				case 8: character = "이성적"; break;
				}
				
				String[] characterCategory = {"현재 " + nickName + "님이 선택하신 성향은 " + character + "입니다.", "리더형", "팔로워형", "계획적", "즉흥적", "외향적", "내향적", "감성적", "이성적"};
				characterSelectCombo = new JComboBox(characterCategory);
				
				characterSelectCombo.setBounds(110, 600, 360, 47);
				characterSelectCombo.setSelectedIndex(0); 	
				characterSelectCombo.setFont(font.customFont1);
				changeMemberinfoPanel.add(characterSelectCombo);
				characterSelectCombo.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						JComboBox<String> comboBox = (JComboBox<String>) e.getSource();
						String characterCategory = (String) comboBox.getSelectedItem();
						Integer newCharacterCode = null;
						switch(characterCategory) {
							case "리더형" : newCharacterCode = 1; break;
							case "팔로워형": newCharacterCode = 2; break;
							case "계획적" : newCharacterCode = 3; break;
							case "즉흥적" : newCharacterCode = 4; break;
							case "외향적" : newCharacterCode = 5; break;
							case "내향적" : newCharacterCode = 6; break;
							case "감성적" : newCharacterCode = 7; break;
							case "이성적" : newCharacterCode = 8; break;
							default : newCharacterCode = 1; break;
						}
						
						/* 콤보박스에서 선택한 것으로 성향 변경 */
						memberController.changeCharacter(newCharacterCode);
					}
				});
				
				/* 변경 버튼 */
				btnRemove(cpB2);
				cpB2.setVisible(true);
				cpB2.setBounds(264, 670, 178, 63);
				cpB2.setIcon(new ImageIcon("image/member/updatePwd/Group 879.png"));
				changeMemberinfoPanel.add(cpB2); 
				cpB2.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						String newNickName = ciTp2.getText();
						String newAddress = ciTp3.getText();
						String newPhone = ciTp4.getText();
						String newEmail = ciTp1.getText();
						memberInfo.setNickName(newNickName);
						memberInfo.setAddress(newAddress);
						memberInfo.setPhone(newPhone);
						memberInfo.setEmail(newEmail);
						memberController.changeInfo(memberInfo);
						
						
					}
				});
				/* 개인정보 변경 입력창 라벨 */
				ciL5.setBounds(0, 0, 500, 770);
				ciL5.setVisible(true); 
				ciL5.setIcon(new ImageIcon("image/member/updateInfo/changeInfoBackground.png"));
				changeMemberinfoPanel.add(ciL5);
				
				
				
				changeMemberinfoPanel.revalidate();
				changeMemberinfoPanel.repaint();
			}
				
		});

		
		
		
/*==================================  탈퇴하기 버튼   ================================================== */			
		
		
		
		/* 탈퇴하기 버튼 */
//		JButton resignMemberButton = new JButton("");
		resignMemberButton.setIcon(new ImageIcon("image/member/myPage/resign.png"));
		resignMemberButton.setContentAreaFilled(false);
		resignMemberButton.setBorderPainted(false);
		resignMemberButton.setBounds(92, 280, 137, 137);
		bottomPanel.add(resignMemberButton);
		resignMemberButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				/* 회원 탈퇴 패널 */
				JPanel resignMemberPanel = new JPanel();
				resignMemberPanel.setLayout(null);
				resignMemberPanel.setBounds(0, 100, 500, 770);
				resignMemberPanel.setVisible(true);
				resignMemberPanel.setBackground(Color.white);
				bottomPanel.setVisible(false);
				frame.add(resignMemberPanel);
				
				
				
				/* 비밀번호 입력창 */
				rmPF1.setBorder(null);
				rmPF1.setOpaque(false);
				rmPF1.setBounds(195, 300, 270, 45);
				resignMemberPanel.add(rmPF1);
				
				
				/* 취소 버튼 */
				btnRemove(rmB1);
				rmB1.setVisible(true);
				rmB1.setBounds(58, 595, 178, 63);
				rmB1.setIcon(new ImageIcon("image/member/deleteMember/cancleButton.png"));
				resignMemberPanel.add(rmB1);
				rmB1.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						System.out.println("취소 버튼 클릭");
						/* 마이페이지로 돌아가기 */
						resignMemberPanel.setVisible(false);
						bottomPanel.setVisible(true);
						
					}
				});
				
				/* 탈퇴 버튼 */
				btnRemove(rmB2);
				rmB2.setVisible(true);
				rmB2.setBounds(264, 595, 178, 63);
				rmB2.setIcon(new ImageIcon("image/member/deleteMember/resign.png"));
				resignMemberPanel.add(rmB2); 
				rmB2.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						System.out.println("탈퇴 버튼 클릭");
						/* 입력받은 비밀번호가 사용자의 비밀번호와 일치하는지 체크 (비밀번호 변경 재활용)*/
						if(e.getSource() == rmB2) {
							memberController = new MemberController();
							 	String password = "";
							   char[] pass = rmPF1.getPassword();
							   for(int i = 0; i < pass.length; i++) {
							      password += pass[i];
							   }         
							   changePwdDTO = new ChangePwdDTO();
							   changePwdDTO.setMemberOldPassword(password);
							   boolean checkP = memberController.pwdCheck(changePwdDTO);
							   
							   if(checkP) {
								   memberController.deleteMember(userId);
							   } 
							   
							   
						}
						
					}
				}); 
				/* 회원탈퇴 비밀번호 입력창 라벨 */
				rmL1.setBounds(0, 0, 500, 770);
				rmL1.setVisible(true);
				rmL1.setIcon(new ImageIcon("image/member/deleteMember/delete.png"));
				resignMemberPanel.add(rmL1);
				
				resignMemberPanel.revalidate();
				resignMemberPanel.repaint();
				
			}
		});
		
/*==================================  관심글 버튼   ================================================== */	
		
		/* 관심글 모아보기 버튼 */
//		JButton interestingPostButton = new JButton("");
		interestingPostButton.setIcon(new ImageIcon("image/member/myPage/heart.png"));
		interestingPostButton.setContentAreaFilled(false);
		interestingPostButton.setBorderPainted(false);
		interestingPostButton.setBounds(272, 280, 137, 137);
		bottomPanel.add(interestingPostButton);
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
				bottomPanel.setVisible(false);
				frame.add(interestingPostPanel);  
				
				/* 관심을 패널에 올릴 이미지 */
				JLabel interestingPostLabel = new JLabel();
				interestingPostLabel.setBounds(0, 100, 500, 770);
				interestingPostLabel.setIcon(new ImageIcon("image/member/AllInteresting/qq.png"));
				interestingPostPanel.add(interestingPostLabel);
				
				
				/* 분류 구분 콤보박스 위에 이미지라벨 덧씌우기 (고민중) */
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
		
		
/*==================================  업적 & 포인트 버튼   ================================================== */		
		
		/* 업적 & 포인트 버튼 */
//		JButton rewardButton = new JButton("");
		rewardButton.setIcon(new ImageIcon("image/member/myPage/medal.png"));
		rewardButton.setContentAreaFilled(false);
		rewardButton.setBorderPainted(false);
		rewardButton.setBounds(92, 501, 137, 137);
		bottomPanel.add(rewardButton);
		rewardButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				/* 업적 & 포인트 호출 */
				System.out.println("업적 & 포인트 호출");
				SoundManager.playSound("image/member/wind.wav");
				JPanel rewardPanel = new JPanel();
				rewardPanel.setLayout(null);
				rewardPanel.setBounds(0, 100, 500, 770);
				rewardPanel.setVisible(true);
				rewardPanel.setBackground(Color.white);
				bottomPanel.setVisible(false);
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
						rewardManageLabel.addMouseListener(new MouseAdapter() {
							@Override
							public void mouseClicked(MouseEvent e) {
								rewardManagerPanel.setVisible(false);
								rewardPanel.setVisible(true);
								
							}
							
						});
							
				
					}
				});
				/* 포인트 관리 버튼 */
				JButton pointManageBtn = new JButton();
				btnRemove(pointManageBtn);
				pointManageBtn.setBounds(35, 371, 431, 322);
				pointManageBtn.setIcon(new ImageIcon("image/member/reward/pointManageBtn.png"));
				rewardPanel.add(pointManageBtn);
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
						pointManageLabel.addMouseListener(new MouseAdapter() {
							@Override
							public void mouseClicked(MouseEvent e) {
								pointManagePanel.setVisible(false);
								rewardPanel.setVisible(true);
							}
							
						});
					}
				});
			}
		});
		
		

/* 내글 모아보기 */
		
		
//		JButton writtenPostButton = new JButton(""); /* 내글 모아보기 버튼 */
		writtenPostButton.setIcon(new ImageIcon("image/member/myPage/moabogi.png"));
		writtenPostButton.setContentAreaFilled(false);
		writtenPostButton.setBorderPainted(false);
		writtenPostButton.setBounds(272, 501, 137, 137);
		bottomPanel.add(writtenPostButton);
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
				bottomPanel.setVisible(false);
				frame.add(myPostPanel);  
				
				JLabel myPostLabel = new JLabel();
				myPostLabel.setBounds(0, 100, 500, 770);
				myPostLabel.setIcon(new ImageIcon("image/member/selectMyPost/myPostLabel.png"));
				myPostPanel.add(myPostLabel);
				
			}
		});
		
		
		
/*==================================  마이페이지에 있는 버튼 밑에 글씨들   ================================================== */
		
		/* 마이페이지에 있는 버튼 밑에 글씨들 */
//		JLabel menuNameLabel = new JLabel("");
		menuNameLabel.setIcon(new ImageIcon("image/member/myPage/myPageName.png"));
		menuNameLabel.setBounds(111, 10, 500, 870);
		bottomPanel.add(menuNameLabel);
		


		
			
		
		/* 새로고침 */
		frame.repaint();
		frame.revalidate();
		
		
		
		
	}
	
	
	

	
}
