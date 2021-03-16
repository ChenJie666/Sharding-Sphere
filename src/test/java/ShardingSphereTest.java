import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.iotmars.mcook.entities.Course;
import com.iotmars.mcook.mapper.CourseMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @Description:
 * @Author: CJ
 * @Data: 2021/3/15 16:10
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {com.iotmars.mcook.ShardingSphereApplication.class})
public class ShardingSphereTest {

    @Resource
    private CourseMapper courseMapper;

    @Test
    public void addCourse(){
        for (int i = 0; i < 10; i++) {
            Course course = new Course(null, "zhangsan", (long) i, "Normal");
            courseMapper.insert(course);
        }
    }

    @Test
    public void findCourse(){
        QueryWrapper<Course> wrapper = new QueryWrapper<Course>();
        wrapper.eq("cid", 578512878756167681L);
        wrapper.eq("user_id", 8L);
        Course course = courseMapper.selectOne(wrapper);
        System.out.println(course);
    }


}
