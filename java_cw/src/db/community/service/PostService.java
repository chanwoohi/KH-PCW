package db.community.service;

import org.apache.ibatis.annotations.Param;

public interface PostService {

	boolean insertCommunity(@Param("community")String community);

	boolean updateCommunity(String oldName, String newName);

}
