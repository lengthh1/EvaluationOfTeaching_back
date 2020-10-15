package org.wrrrrrrry.evaluationteaching.service.imply;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.wrrrrrrry.evaluationteaching.entity.*;
import org.wrrrrrrry.evaluationteaching.mapper.PublicMessageMapper;
import org.wrrrrrrry.evaluationteaching.service.PublicMessageService;

import java.util.List;
import java.util.Map;

@Service
@Transactional
public class PublicMessageServiceImpl implements PublicMessageService {
    @Autowired
    PublicMessageMapper publicMessageMapper;
    @Override
    public List<Clazz> queryStudentClass(String username) {

        return publicMessageMapper.selectStudentClassByCode(username);
    }

    @Override
    public List<Clazz> queryTeacherClass(String username) {
        return publicMessageMapper.selectTeacherClassByCode(username);
    }

    @Override
    public List<Course> queryStudentCourse(String username) {
        return publicMessageMapper.selectStudentCourseByCode(username);
    }

    @Override
    public List<Course> queryTeacherCourse(String username) {
        return publicMessageMapper.selectTeacherCourseByCode(username);
    }

    @Override
    public List<Power> queryPowerAll() {
        return publicMessageMapper.selectPowerAll();
    }

    @Override
    public List<Clazz> queryClassByName(String name) {
        return publicMessageMapper.selectClassByName("%"+name+"%");
    }

    @Override
    public List<User> queryStudentByCode(String code) {
        return publicMessageMapper.selectStudentByCode("%"+code+"%");
    }

    @Override
    public List<Course> queryCourseByName(String name) {
        return publicMessageMapper.selectCourseByName("%"+name+"%");
    }

    @Override
    public List<User> queryUserByCode(String code) {

        return publicMessageMapper.selectUserByCode("%"+code+"%");
    }

    @Override
    public List<Institute> queryInstitute(String name) {
        return publicMessageMapper.queryInstitute("%"+name+"%");
    }

    @Override
    public List<Map> queryCCT(String name) {
        return publicMessageMapper.queryCCT("%"+name+"%");
    }

    @Override
    public List<Map> getAllEByC(int cId) {
        return publicMessageMapper.queryALlEByC(cId);
    }

    @Override
    public List<Map> queryCCTByCoyurse(int id) {
        return publicMessageMapper.queryCCtByCourse(id);
    }
}
