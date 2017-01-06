package org.livvy.reading.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.livvy.reading.domain.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by livvy (livvyguo@gmail.com) on 2017/1/5.
 */
@Mapper
@Repository
public interface UserMapper {

    List<User> selectUser();
}
