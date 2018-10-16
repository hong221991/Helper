package com.hyc.helper.model;

import com.hyc.helper.bean.SecondHandBean;
import com.hyc.helper.helper.RequestHelper;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

public class SecondGoodsModel {

  public void getSecondMarketGoods(int page, Observer<SecondHandBean> observer) {
    RequestHelper.getRequestApi().getSecondHandMaker(page)
        .subscribeOn(Schedulers.io())
        .observeOn(AndroidSchedulers.mainThread())
        .subscribe(observer);
  }

  public void getPersonalMarket(String number,String code,int page,String userId,Observer<SecondHandBean> observer){
    RequestHelper.getRequestApi().getUserSecondMaker(number,code,page,userId)
        .subscribeOn(Schedulers.io())
        .observeOn(AndroidSchedulers.mainThread())
        .subscribe(observer);
  }
}
