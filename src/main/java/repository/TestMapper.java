package repository;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface TestMapper {
    @Select(value = "SELECT NOW()")
    public String getNowTime();

    public String getTime();
}
