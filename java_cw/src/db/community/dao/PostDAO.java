package db.community.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import db.community.model.vo.CommunityVO;
import db.community.model.vo.PostVO;
import db.community.pagination.Criteria;

public interface PostDAO {

	boolean insertCommunity(@Param("co_name")String community);

	CommunityVO selectCommunity(@Param("co_name")String community);

	boolean updateCommunity(@Param("vo")CommunityVO oldVo);

	boolean deleteCommunity(@Param("co_name")String name);

	boolean insertPost(@Param("po")PostVO post);

	List<CommunityVO> selectCommunityList();

	List<PostVO> selectPostList(@Param("cri")Criteria cri);

	PostVO selectPost(@Param("po_num")int poNum);

	int selectPostListCount(@Param("cri")Criteria cri);

}
