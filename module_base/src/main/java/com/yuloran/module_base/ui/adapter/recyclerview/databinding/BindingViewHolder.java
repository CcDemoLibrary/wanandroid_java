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
package com.yuloran.module_base.ui.adapter.recyclerview.databinding;

import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/**
 * [ViewHolder for DataBinding]
 * <p>
 * Author: Yuloran
 * Date Added: 2018/12/17 16:18
 *
 * @since 1.0.0
 */
public class BindingViewHolder<T extends ViewDataBinding> extends RecyclerView.ViewHolder
{
    @NonNull
    private final T mBinding;

    BindingViewHolder(@NonNull T binding)
    {
        super(binding.getRoot());
        mBinding = binding;
    }

    @NonNull
    public T getBinding()
    {
        return mBinding;
    }
}