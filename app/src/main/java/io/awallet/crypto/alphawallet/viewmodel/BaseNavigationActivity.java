package io.awallet.crypto.alphawallet.viewmodel;

import android.support.annotation.MenuRes;
import android.support.annotation.NonNull;
import android.view.MenuItem;

import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;
import io.awallet.crypto.alphawallet.R;
import io.awallet.crypto.alphawallet.ui.BaseActivity;

public abstract class BaseNavigationActivity extends BaseActivity implements BottomNavigationViewEx.OnNavigationItemSelectedListener {

    private BottomNavigationViewEx navigation;

    protected void initBottomNavigation()
    {
        navigation = findViewById(R.id.bottom_navigation_ex);
        navigation.setOnNavigationItemSelectedListener(this);
        navigation.setTextVisibility(false);
        navigation.setIconsMarginTop(10);
    }

    protected void setBottomMenu(@MenuRes int menuRes)
    {
        navigation.getMenu().clear();
        navigation.inflateMenu(menuRes);

        navigation.enableAnimation(false);
        navigation.enableShiftingMode(false);
        navigation.enableItemShiftingMode(false);
    }

    protected void selectNavigationItem(int position) {
        navigation.getMenu().getItem(position).setChecked(true);
    }

    protected int getSelectedNavigationItem() {
        return navigation.getCurrentItem();
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        return false;
    }
}