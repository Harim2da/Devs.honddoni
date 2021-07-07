package com.devs.honddoni.common;

import com.devs.honddoni.common.dto.PageInfoPostDTO;

public class PagenationPost {
   
	/* 게시글 페이징 */
   public PageInfoPostDTO getPostPageInfo(int pageNo, int totalCount, int limit, int buttonAmount) {
      
      int maxPage;         			//전체 페이지에서 가장 마지막 페이지
      int startPage;         		//한번에 표시될 페이지 버튼의 시작할 페이지
      int endPage;        		    //한번에 표시될 페이지 버튼의 끝나는 페이지
      int startRow;					//페이지에서 나타낼 첫번째 행
      int endRow;					//페이지에서 나타낼 마지막 행
 
      maxPage = (int)((double) totalCount / limit + 0.9);

      startPage = (((int)((double) pageNo / buttonAmount + 0.9)) - 1) * buttonAmount + 1;

      endPage = startPage + buttonAmount - 1;

      if(maxPage < endPage){
         endPage = maxPage;
      }
      
      if(maxPage == 0 && endPage == 0) {
         maxPage = startPage;
         endPage = startPage;
      }

      startRow = (pageNo - 1) * limit + 1;
      endRow = startRow + limit - 1;
      
      PageInfoPostDTO pageInfo = new PageInfoPostDTO(pageNo, totalCount, limit, buttonAmount ,maxPage, startPage, endPage, startRow, endRow);
      
      return pageInfo;
   }
}