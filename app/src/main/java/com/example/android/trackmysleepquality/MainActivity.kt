/*
 * Copyright 2019, The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.trackmysleepquality

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
    }
}

/**
 * Codelab : DiffUtil and data binding with RecyclerView
 * https://developer.android.com/codelabs/kotlin-android-training-diffutil-databinding/?hl=ko#10
 *
 * Q1. Which of the following are necessary to use DiffUtil? Select all that apply.
 *  > Override areItemsTheSame(), Override areContentsTheSame()
 * Q2. Which of the following are true about binding adapters?
 *  > A binding adapter is a function annotated with @BindingAdapter.
 *  > Using a binding adapter allows you to separate data formatting from the view holder.
 * Q3. When should you consider using Transformations instead of a binding adapter? Select all that apply.
 *  > Your data is simple, You are formatting a string.
 * */