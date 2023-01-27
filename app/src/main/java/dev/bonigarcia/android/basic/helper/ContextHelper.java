/*
 * (C) Copyright 2023 Boni Garcia (https://bonigarcia.github.io/)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package dev.bonigarcia.android.basic.helper;

import android.content.Context;

import dev.bonigarcia.android.basic.R;

public class ContextHelper {
    private final Context context;

    public ContextHelper(Context context) {
        this.context = context;
    }

    public String getGreetings(String name) {
        return StringHelper.format(context.getResources().getString(R.string.hello), name);
    }

}