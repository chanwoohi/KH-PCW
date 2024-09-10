import { useState } from "react"

/*
다음과 같은 배열이 있을 때 배열을 이용해서 checkbox와 label 태그로 된 화면을 구성하세요.
*/
function List1(){
	let list = ['축구', '야구', '농구', '배구', '음악감상'];
	let [checkList, setCheckList] = useState([]);
	function checkedList(e) {
		let{value, checked} = e.target;
		// value = e.target.value;
		// checked = e.target.checked;
		let tmp = [...checkList];

		//checkbox가 체크된 상태이면 배열에 추가하고
		if(checked && checkList.length < 3){
			tmp.push(value);
		} else if(!checked){
			//chenckbox가 체크가 해제된 상태이면 배열에서 제거
			// let index = tmp.indexOf(value);
			// tmp.splice(index, 1);
			// value와 같지 않은 요소들만 이용해서 배열을 새로 만듬
			tmp = tmp.filter( item => item != value );
		} else {
			alert('최대 3개까지만 선택할 수 있습니다.')
		}

		setCheckList(tmp);
	}
	let isDisabled = (value) => {
		return checkList.length == 3 && !checkList.includes(value);
	}
	return(
		<div>
			<h1>당신의 취미는?(최대 3개 선택)</h1>
			{
				list.map((value) => {
					return( 
					<label>
						<input type="checkbox" onClick={checkedList} disabled={isDisabled(value)} value={value}/>{value} 
					</label>
					)
				})
			}
			<ul>
				{
					checkList.map((value) => {
						return <li>{value}</li>;
					})
				}
			</ul>
		</div>
	)
}

export default List1;