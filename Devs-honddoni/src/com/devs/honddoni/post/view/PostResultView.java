package com.devs.honddoni.post.view;

import com.devs.honddoni.common.mainframe.PopupFrame;

public class PostResultView {


	public void displayResult(String code) {
		
		switch(code) {
		case "updateSuccess" : PopupFrame.popup("image/post/updateSuccess.png"); break;
		case "updatefail" : PopupFrame.popup("image/post/updatefail.png"); break;
		case "deleteSuccess" : PopupFrame.popup("image/post/ok.png"); break;
		}
	}
	
	
}
