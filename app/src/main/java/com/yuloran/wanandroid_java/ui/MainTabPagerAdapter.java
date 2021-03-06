/*
 * Copyright (C) 2018 Yuloran(https://github.com/Yuloran)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.yuloran.wanandroid_java.ui;

import java.util.List;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

/**
 * [主页ViewPager适配器]
 * <p>
 * Author: Yuloran
 * Date Added: 2018/12/14 17:29
 *
 * @since 1.0.0
 */
public class MainTabPagerAdapter extends FragmentPagerAdapter
{
    private List<TabConfig.Tab> mMainTabs;

    MainTabPagerAdapter(FragmentManager fm)
    {
        super(fm);
        mMainTabs = TabConfig.getMainTabs();
    }

    /**
     * This method may be called by the ViewPager to obtain a title string
     * to describe the specified page. This method may return null
     * indicating no title for this page. The default implementation returns
     * null.
     *
     * @param position The position of the title requested
     * @return A title for the requested page
     */
    @Nullable
    @Override
    public CharSequence getPageTitle(int position)
    {
        return mMainTabs.get(position).getTitle();
    }

    /**
     * Return the Fragment associated with a specified position.
     *
     * @param position position
     */
    @Override
    public Fragment getItem(int position)
    {
        return MainTabPageFactory.instantiate(mMainTabs.get(position));
    }

    /**
     * Return the number of views available.
     */
    @Override
    public int getCount()
    {
        return mMainTabs.size();
    }

}
