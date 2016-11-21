/**
 * Copyright (c) 2015-2017 Inria
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * <p>
 * Contributors:
 * - Christophe Gourdin <christophe.gourdin@inria.fr>
 */
package org.occiware.mart.server.servlet.facade;

import javax.ws.rs.core.Response;
import java.util.Map;

/**
 *
 * @author Christophe Gourdin
 */
interface IDeleteQuery extends IEntryPoint {

    /**
     * Remove an entity.
     *
     * @param path
     * @param attrs
     * @return
     */
    Response deleteEntity(String path, Map<String, String> attrs);

    /**
     * Remove an entire collection of entities with path = kind (ex: compute).
     *
     * @param path
     * @return
     */
    Response deleteEntityCollection(String path);

    /**
     * Remove mixin association and if mixin is a user tag, remove it from configuration.
     * @param mixinId
     * @param owner
     * @param isMixinTag
     * @return
     */
    Response deleteMixin(String mixinId, String owner, boolean isMixinTag);
}
