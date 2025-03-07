/*
 * Copyright (C) 2016 The Android Open Source Project
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

package com.google.android.deskclock.controller;

import android.support.annotation.StringRes;

import com.google.android.deskclock.events.EventTracker;

import java.util.ArrayList;
import java.util.Collection;

class EventController {

    private final Collection<EventTracker> mEventTrackers = new ArrayList<>();

    void addEventTracker(EventTracker eventTracker) {
        mEventTrackers.add(eventTracker);
    }

    void removeEventTracker(EventTracker eventTracker) {
        mEventTrackers.remove(eventTracker);
    }

    void sendEvent(@StringRes int category, @StringRes int action, @StringRes int label) {
        for (EventTracker eventTracker : mEventTrackers) {
            eventTracker.sendEvent(category, action, label);
        }
    }
}