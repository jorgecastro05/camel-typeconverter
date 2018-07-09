/*
 * Copyright 2016 Red Hat, Inc.
 * <p>
 * Red Hat licenses this file to you under the Apache License, version
 * 2.0 (the "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied.  See the License for the specific language governing
 * permissions and limitations under the License.
 *
 */
package com.fuse;

import com.fuse.bean.MyArray;
import org.springframework.stereotype.Component;

/**
 * A sample transform
 */
@Component(value = "myTransformer")
public class MyTransformer {

    public MyArray transform() {
        MyArray array = new MyArray();
        array.add(0, "Hong");
        array.add(1, "Jeff");
        array.add(1, "Chad");
        return array;
    }


}
