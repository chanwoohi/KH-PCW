/*
	input 태그 2개를 생성
	- 왼쪽 input 태그 : 쓰기가 가능
	- 오른쪽 input 태그 : 읽기만 가능
	왼쪽에 있는 input태그에 값을 입력하면 오른쪽에 있는 input 태그의 값이 변경되도록 작업
	1. state 변수 input, setInput을 추가
	2. 왼쪽 input태그의 내용이 변경되면 input 태그의 값을 가져와서 input 변수에 업데이트
	3. 오른쪽 input 태그의 value를 input 변수의 값으로 업데이트

	추가 기능
	input 태그 사이에 버튼을 추가
	버튼을 클릭하면 읽기 전용이 반대로 되도록 작성
	1. state 변수 flag를 추가 (초기값 true)
	2. 두 input 태그에 readOnly 속성을 추가
		- 오른쪽에는 flag가, 왼쪽에는 !flag가 적용되도록 작성
	3. 버튼에 클릭 이벤트를 등록
		- flag 값을 반대로 수정
*/

import { useState } from "react";

function Input1() {
	let [input, setInput] = useState("");
	let inputText = e => setInput(e.target.value);
	let [flag, setFlag] = useState(true);
	function btnClick() {
		setFlag(!flag);
	}
	return(
		<div>
			<input type="text" disabled={!flag} value={input} onChange={inputText} />
			<button onClick={btnClick}>전환</button>
			<input type="text" disabled={flag} value={input} onChange={inputText} />
		</div>
	)
}

export default Input1;