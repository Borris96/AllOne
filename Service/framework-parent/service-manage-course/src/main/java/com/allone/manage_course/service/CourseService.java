package com.allone.manage_course.service;

import com.allone.framework.domain.course.CourseBase;
import com.allone.framework.domain.course.response.AddCourseResult;
import com.allone.framework.model.response.CommonCode;
import com.allone.manage_course.dao.CourseBaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

public class CourseService {
    @Autowired
    CourseBaseRepository courseBaseRepository;

    @Transactional
    public AddCourseResult addCourseBase(CourseBase courseBase) {
        // 课程状态默认未发布
        courseBase.setStatus("202001");
        courseBaseRepository.save(courseBase);
        return new AddCourseResult(CommonCode.SUCCESS,courseBase.getId());
    }
}
