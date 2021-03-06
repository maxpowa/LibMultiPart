/*
 * Copyright (c) 2019 AlexIIL
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 */
package alexiil.mc.lib.multipart.api.event;

import alexiil.mc.lib.multipart.api.AbstractPart;
import alexiil.mc.lib.multipart.api.MultipartContainer;
import alexiil.mc.lib.multipart.api.MultipartContainer.MultipartCreator;

/** Fired whenever an {@link AbstractPart} is {@link MultipartContainer#offerNewPart(MultipartCreator, boolean) offered} or
 * {@link MultipartContainer#addNewPart(MultipartCreator) added} to a {@link MultipartContainer}. */
public final class PartOfferedEvent extends MultipartEvent {
    public final AbstractPart part;
    private boolean isAllowed = true;

    public PartOfferedEvent(AbstractPart part) {
        this.part = part;
    }

    public boolean isAllowed() {
        return isAllowed;
    }

    /** Disallows this part from being added to the container. */
    public void disallow() {
        isAllowed = false;
    }
}
