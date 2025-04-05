// Copyright (c) 2023, 2025 William Arthur Hood
//
// Permission is hereby granted, free of charge, to any person obtaining a copy
// of this software and associated documentation files (the "Software"), to deal
// in the Software without restriction, including without limitation the rights to
// use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies
// of the Software, and to permit persons to whom the Software is furnished
// to do so, subject to the following conditions:
//
// The above copyright notice and this permission notice shall be included
// in all copies or substantial portions of the Software.
//
// THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
// EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES
// OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
// NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT
// HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
// WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
// FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR
// OTHER DEALINGS IN THE SOFTWARE.

package io.github.william_hood.koarse_grind_java;

import io.github.william_hood.boolog_java.Boolog;

/**
 * An Outfitter is used to provide a setup and cleanup for a whole category of tests. Leave the categoryPath field
 * as the default (empty string) value to assign it to the top-level category. IMPORTANT: Your outfitter must be a
 * CLASS and must use a default constructor with no parameters.
 */
public abstract class Outfitter extends io.github.william_hood.koarse_grind_kotlin.Outfitter {
    public Outfitter(String categoryPath) {
        super(categoryPath);
    }

    public Outfitter() {
        super(null);
    }

    public io.github.william_hood.boolog_java.Boolog log() {
        return new Boolog(getLog());
    }

    public io.github.william_hood.koarse_grind_kotlin.Enforcer assertion() {
        return super.getAssert();
    }

    public io.github.william_hood.koarse_grind_kotlin.Enforcer require() {
        return super.getRequire();
    }

    public io.github.william_hood.koarse_grind_kotlin.Enforcer consider() {
        return super.getConsider();
    }
}
