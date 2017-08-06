/*
 * Copyright 2017-2017 the original author or authors.
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
package org.hellojavaer.ddal.ddr.expression.range;

/**
 *
 * @author <a href="mailto:hellojavaer@gmail.com">Kaiming Zou</a>,created on 02/08/2017.
 */
enum TokenKind {

    LITERAL_INT,

    LITERAL_DOUBLE,

    LITERAL_STRING,

    LITERAL_LOWER_CHAR,

    LITERAL_UPPER_CHAR,

    COMMA(","),

    RSQUARE("]"),

    LSQUARE("["),

    TO("..");

    final String tokenString;

    private TokenKind(String tokenString) {
        this.tokenString = tokenString;
    }

    private TokenKind() {
        this("");
    }

    @Override
    public String toString() {
        return (name() + (this.tokenString.length() != 0 ? "(" + this.tokenString + ")" : ""));
    }
}
