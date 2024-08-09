package kr.kh.app.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import kr.kh.app.model.vo.CommunityVO;
import kr.kh.app.model.vo.PostVO;

public interface PostDAO {

	List<CommunityVO> selectCommunityList();

	CommunityVO selectCommunityInfo(@Param("coNum")int coNum);

	List<PostVO> selectPostList(@Param("coNum")int coNum);


}
