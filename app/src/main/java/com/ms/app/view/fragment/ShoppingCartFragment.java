package com.ms.app.view.fragment;

import android.os.Bundle;

import com.ms.app.R;

import org.ms.module.base.view.BaseFragment;

public class ShoppingCartFragment extends BaseFragment {
    @Override
    protected void initView() {

    }

    @Override
    protected int getLayout() {
        return R.layout.fragment_shopping_cart;
    }

    @Override
    public void showDialog() {

    }

    @Override
    public void hideDialog() {

    }

    public static ShoppingCartFragment newInstance() {
        
        Bundle args = new Bundle();
        
        ShoppingCartFragment fragment = new ShoppingCartFragment();
        fragment.setArguments(args);
        return fragment;
    }
}
