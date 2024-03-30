/*
 * Copyright 2024-2024 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.yizlan.gelato.core.protocol;

import com.yizlan.gelato.core.bundle.BusinessCode;

import java.io.Serializable;

/**
 * Provide fields which named code and message with the different type for result.
 * This is the two-arity specialization of {@link BusinessCode}.
 *
 * @param <T> the type of the filed which named code
 * @param <U> the type of the filed which named message
 * @author Zen Gershon
 * @see BusinessCode
 * @since 1.0
 */
public interface BiResult<T extends Serializable, U extends Serializable> extends BusinessCode<T> {

    /**
     * Get message
     *
     * @return message
     */
    U getMessage();
}