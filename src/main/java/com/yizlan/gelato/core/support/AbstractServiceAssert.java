/*
 * Copyright (C) 2024 the original author or authors.
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

package com.yizlan.gelato.core.support;

import com.yizlan.gelato.core.exception.BinaryException;
import com.yizlan.gelato.core.fluent.CodeAssert;
import com.yizlan.gelato.core.fluent.EnumAssert;
import com.yizlan.gelato.core.panic.ServiceException;

/**
 * abstract service assert
 *
 * @author Zen Gershon
 * @since 1.0
 */
public abstract class AbstractServiceAssert {

    /**
     * assert func with code
     *
     * @param condition boolean
     * @return CodeAssert
     */
    protected static CodeAssert codeAssert(final boolean condition) {
        return (code, args) -> {
            if (condition) {
                throwException(code, args);
            }
        };
    }

    /**
     * assert func with enum
     *
     * @param condition boolean
     * @return EnumAssert
     */
    protected static EnumAssert enumAssert(final boolean condition) {
        return (exception, args) -> {
            if (condition) {
                throwException(exception, args);
            }
        };
    }

    /**
     * throw service exception
     *
     * @param code error code
     * @param args reserved parameters
     */
    public static void throwException(final String code, Object... args) {
        throw new ServiceException(code, args);
    }

    /**
     * throw service exception
     *
     * @param exception error enum
     * @param args      reserved parameters
     */
    public static void throwException(final BinaryException<String> exception, Object... args) {
        throw new ServiceException(exception, args);
    }
}
