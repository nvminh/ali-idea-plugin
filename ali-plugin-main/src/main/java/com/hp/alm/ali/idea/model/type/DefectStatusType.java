/*
 * Copyright 2013 Hewlett-Packard Development Company, L.P
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

package com.hp.alm.ali.idea.model.type;

import com.hp.alm.ali.idea.entity.edit.DependentValue;
import com.hp.alm.ali.idea.ui.editor.EntityEditor;

import java.util.HashMap;
import java.util.Map;

public class DefectStatusType implements DependentValue {

    private static Map<String, String> map;
    static {
        map = new HashMap<String, String>();
        map.put("New", "New");
        map.put("Open", "In Progress");
        map.put("Fixed", "In Testing");
        map.put("Propose Close", "In Testing");
        map.put("Closed", "Done");
    }

    @Override
    public void valueChanged(EntityEditor editor, String value) {
        editor.setFieldValue("release-backlog-item.status", map.get(value), false);
    }
}
