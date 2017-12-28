package com.komoriwu.one.all.fragment.viewholder;

import android.view.View;

import com.komoriwu.one.R;
import com.komoriwu.one.widget.FZTextView;

/**
 * Created by KomoriWu
 * on 2017-12-26.
 */

public class BannerViewHolder extends BaseViewHolder {
    public FZTextView tvHeader;

    public BannerViewHolder(View itemView) {
        super(itemView);
        tvHeader = itemView.findViewById(R.id.tv_header);
    }
}