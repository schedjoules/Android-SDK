/*
 * Copyright 2017 SchedJoules
 *
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

package org.dmfs.webcal.utils.color;

import android.content.Context;

import org.dmfs.webcal.R;


/**
 * {@link Color} for <code>colorAccent</code> theme attribute.
 *
 * @author Gabor Keszthelyi
 */
// TODO Remove when available from dmfs android tools library
public final class AccentColor extends DelegatingColor
{

    public AccentColor(Context context)
    {
        super(new AttributeColor(context, R.attr.colorAccent));
    }

}
