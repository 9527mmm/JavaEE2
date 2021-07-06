package com.zxk.factory;

import com.zxk.dao.BaseStudentDao;
import com.zxk.dao.OtherStudentDaoV2;
import com.zxk.dao.StudentDaoV1;
import com.zxk.po.Student;


/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/21/ 15:56
 * @Description:
 * @GitHup: 957kk
 */
public class StudentDaoFactory {

    public static BaseStudentDao getStudentDao() {
        //return new StudentDaoV1();
        return new OtherStudentDaoV2();
    }
}
