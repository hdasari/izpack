/*
 * Copyright  2002-2004 The Apache Software Foundation
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */

package com.izforge.izpack.util.file.types.selectors;

import com.izforge.izpack.util.file.types.Parameterizable;

/**
 * This is the interface to be used by all custom selectors, those that are
 * called through the &lt;custom&gt; tag. It is the amalgamation of two
 * interfaces, the FileSelector and the Paramterizable interface. Note that
 * you will almost certainly want the default behaviour for handling
 * Parameters, so you probably want to use the BaseExtendSelector class
 * as the base class for your custom selector rather than implementing
 * this interface from scratch.
 */
public interface ExtendFileSelector extends FileSelector, Parameterizable
{

    // No further methods necessary. This is just an amalgamation of two other
    // interfaces.
}
