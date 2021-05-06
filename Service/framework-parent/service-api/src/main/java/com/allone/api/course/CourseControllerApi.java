package com.allone.api.course;

import com.allone.framework.domain.course.ext.TeachplanNode;
import com.allone.framework.model.response.ResponseResult;
import com.allone.framework.domain.course.CourseBase;
import com.allone.framework.domain.course.Teachplan;
import com.allone.framework.domain.course.response.AddCourseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value = "课程管理接口",description = "提供课程的增删改查")
public interface CourseControllerApi {
    @ApiOperation("课程计划查询")
    public TeachplanNode findTeachplanList(String courseId);

    @ApiOperation("添加课程计划")
    public ResponseResult addTeachplan(Teachplan teachplan);

    @ApiOperation("添加课程基础信息")
    public AddCourseResult addCourseBase(CourseBase courseBase);
}
