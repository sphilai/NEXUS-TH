/*
 * $Id: ResourcesFactory.java 5759 2014-06-27 08:14:53Z 10088DS01586 $
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.globaldenso.gscm.framework.util;

import org.apache.struts.util.MessageResources;
import org.apache.struts.util.MessageResourcesFactory;

/**
 * Factory for <code>Resources</code> instances. The configuration paramter
 * for such instances is the base Java package name of the resources entries
 * from which our keys and values will be loaded. <br>
 * このクラスは<code>org.apache.struts.util.PropertyMessageResourcesFactory</code>をベースに作成しています。
 * This class is created of <code>org.apache.struts.util.PropertyMessageResourcesFactory</code>
 * <p>
 * <i><code>org.apache.struts.util.PropertyMessageResourcesFactory</code>からの変更点</i>
 * <i>Modification from <code>org.apache.struts.util.PropertyMessageResourcesFactory</code></i>
 * <ul>
 * <li> {@link ResourcesFactory#createResources(String)}が呼ばれた時に、
 * 新しいインスタンスを生成して返すのではなく、生成したインスタンスをstaticフィールドとして保持しています。 これは、任意のタイミングで{@link Resources}が保持しているリソース情報をクリアできるようにするためです。
 * {@link ResourcesFactory#createResources(String)}呼び出しの度にインスタンスを新規に生成すると、
 * strutsが参照しているResourcesインスタンスへの参照を取得できないため、内容のクリアもできないからです。 </li>
 * <li> {@link ResourcesFactory#getResources()}が追加されています。 保持している{@link Resources}インスタンスが保持しているリソース情報クリアのために
 * 外部から{@link Resources}インスタンスへの参照を取得する必要があるから<br>
 * です。
 * <li> When invoke {@link ResourcesFactory#createResources(String)},
 * not return new instance which is created but maintain creating instance as static field.This is for clear resource information which is maintained at {@link Resources} at optional timing.
 * If create instance newly all the time invoked,not get reference of Resource instance which struts refers and not clear contents.</li>
 * <li> {@link ResourcesFactory#getResources()} is added. It is necessary to get reference to {@link Resources} instance from external
 * for clearing resource information which is maintained at {@link Resources} instance<br>
 * 
 * @see ResourcesFactory#getResources() </li>
 *      </ul>
 *      </p>
 * @see Resources
 */
public final class ResourcesFactory extends MessageResourcesFactory {

    /**
     * Serial Version ID
     */
    private static final long serialVersionUID = 1L;

    /**
     * リソースインスタンス。シングルトン
     * Resource instance. singleton
     */
    private static Resources resources = null;

    /**
     * Default Constructor
     */
    public ResourcesFactory() {
        super();
    }

    /**
     * Create and return a newly instansiated <code>Resources</code>. This
     * method must be implemented by concrete subclasses.
     * 
     * @param config Configuration parameter(s) for the requested bundle
     * @return MessageResources
     */
    public synchronized MessageResources createResources(String config) {
        if (resources != null) {
            return resources;
        }

        resources = new Resources(this, config, this.returnNull);

        String mode = null;
        if (getConfig() != null) {
            mode = getConfig().getProperty("mode");
        }
        resources.setMode(mode);
        return resources;
    }

    /**
     * MessageResourceを取得します。
     * Get MessageResource
     * <p>
     * 保持しているMessageResourceのシングルトンインスタンスを返します。
     * Return singleton instance of MessageResource which is maintained
     * </p>
     * 
     * @return 唯一のMessageResourcesインスタンス
     * @return Only MessageResources instance
     */
    public static MessageResources getResources() {
        return resources;
    }
}
