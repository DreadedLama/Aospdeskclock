/*
 * Copyright (C) 2008 The Android Open Source Project
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

package com.google.android.deskclock.widget.toast;

import android.widget.Toast;

public final class ToastManager {

    private static Toast sToast = null;

    private ToastManager() {

    }

    public static void setToast(Toast toast) {
        if (sToast != null)
            sToast.cancel();
        sToast = toast;
    }

    public static void cancelToast() {
        if (sToast != null)
            sToast.cancel();
        sToast = null;
    }

}
