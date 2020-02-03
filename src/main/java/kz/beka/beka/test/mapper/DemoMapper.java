package kz.beka.beka.test.mapper;
import kz.beka.beka.test.domain.DemoModel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
@Component
@Mapper
public interface DemoMapper {
    @Select("select data from demo_table where id = 0")
    public String getOne();
}