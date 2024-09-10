/*
	select 태그를 이용해서 과일을 선택할 수 있는 창을 만들고, 
	과일을 선택하면 h1태그에 선택한 과일이 출력되도록 작성
	- 선택안함, 사과, 바나나, 오렌지
*/

import { useState } from "react";

function Select() {
	let list = ['선택안함', '사과', '바나나', '오렌지'];
	let [fruit, setFruit] = useState("");
	function choice(e) {
		if(e.target.value == '선택안함'){
			setFruit("");
		} else {
			setFruit(e.target.value);
		}
	}
	return(
		<div>
			<label>
				<select onChange={e => setFruit(e.target.value)}>
					{
						list.map((value) => {
							return <option>{value}</option>
						})
					}
				</select>
			</label>
			<h1>{fruit}</h1>
		</div>
	)
}

export default Select;