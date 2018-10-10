package com.hyc.helper.adapter.viewholder;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.hyc.helper.R;
import com.hyc.helper.base.adapter.viewholder.BaseViewHolder;
import com.hyc.helper.bean.SecondHandBean;
import com.hyc.helper.helper.ImageRequestHelper;

public class SecondGoodsViewHolder extends BaseViewHolder<SecondHandBean.GoodsBean> {

  @BindView(R.id.iv_second_goods)
  ImageView ivSecondGoods;
  @BindView(R.id.tv_second_title)
  TextView tvSecondTitle;
  @BindView(R.id.tv_second_price)
  TextView tvSecondPrice;
  @BindView(R.id.tv_date)
  TextView tvDate;

  public SecondGoodsViewHolder(@NonNull View itemView) {
    super(itemView);
    ButterKnife.bind(this, itemView);
  }

  @Override
  protected void initItemView(View view) {

  }

  @Override
  public void loadItemData(Context context, SecondHandBean.GoodsBean data, int position) {
    ImageRequestHelper.loadImage(context, data.getImage(), ivSecondGoods);
    tvSecondTitle.setText(data.getTit());
    String price = "¥" + data.getPrize();
    tvSecondPrice.setText(price);
    tvDate.setText(data.getCreated_on());
  }
}
