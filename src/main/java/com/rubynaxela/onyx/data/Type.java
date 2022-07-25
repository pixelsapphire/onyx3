package com.rubynaxela.onyx.data;

import com.rubynaxela.onyx.gui.MaterialIcons;
import com.rubynaxela.onyx.io.I18n;
import jiconfont.IconCode;
import org.jetbrains.annotations.NotNull;

public enum Type {

    OTHER(MaterialIcons.GRID_VIEW);

    public final IconCode icon;

    Type(@NotNull IconCode icon) {
        this.icon = icon;
    }

    public String wGetName() {
        return I18n.getString("type." + toString().toLowerCase());
    }
}