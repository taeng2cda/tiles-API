# tiles-API

네이버 스마트에디터
http://gnujava.com/board/article_view.jsp?board_no=3&article_no=7802
에디터2 : https://junesker.tistory.com/16

시큐리티 적용한 상태에서 스마트 에디터를 적용할 경우
https://okky.kr/article/351914
- 시큐리티.xml http 태그에 코드를 추가하여 csrf 방어를 사용하지 않게 설정을 하면 해결이 된다
- 	<sec:headers>
			<sec:frame-options disabled="true"/>
		</sec:headers> 
