package com.hyc.helper.helper;

import com.hyc.helper.bean.CourseInfoBean;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import java.util.List;

public class DbInsertHelper {

  public static Observable<Boolean> insertCourseInfo(List<CourseInfoBean> courseInfoBeans) {
    return Observable.create(emitter -> {
      DaoHelper.getDefault().getDaoSession().getCourseInfoBeanDao().insertInTx(courseInfoBeans);
      emitter.onNext(true);
      emitter.onComplete();
    });
  }
}
