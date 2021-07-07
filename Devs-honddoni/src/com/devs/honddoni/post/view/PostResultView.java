package com.devs.honddoni.post.view;

import com.devs.honddoni.common.mainframe.PopupFrame;

public class PostResultView {

	PopupFrame popup;
	
	public void displayResult(String code) {
		
		switch(code) {
		case "updateSuccess" : popup.popup("image/post/updateSuccess.png"); break;
		case "updatefail" : popup.popup("image/post/updatefail.png"); break;
		case "deleteSuccess" : popup.popup("image/post/ok.png"); break;
		}
	}
	
	
}
