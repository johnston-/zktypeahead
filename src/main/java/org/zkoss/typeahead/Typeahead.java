package org.zkoss.typeahead;

import org.zkoss.zk.ui.sys.ContentRenderer;
import org.zkoss.zul.impl.XulElement;

import java.io.IOException;

/**
 * A <a href="https://github.com/corejavascript/typeahead.js">Typeahead.js</a> component.
 *
 * @author Sean Connolly
 */
public class Typeahead extends XulElement {

    private Boolean highlight = true;
    private Boolean hint = true;
    private int minLength = 1;

    public Boolean getHighlight() {
        return highlight;
    }

    public void setHighlight(Boolean highlight) {
        if (this.highlight != highlight) {
            this.highlight = highlight;
            smartUpdate("highlight", highlight);
        }
    }

    public boolean getHint() {
        return hint;
    }

    public void setHint(boolean hint) {
        if (this.hint != hint) {
            this.hint = hint;
            smartUpdate("hint", hint);
        }
    }

    public int getMinLength() {
        return minLength;
    }

    public void setMinLength(int minLength) {
        if (this.minLength != minLength) {
            this.minLength = minLength;
            smartUpdate("minLength", minLength);
        }
    }

    @Override
    protected void renderProperties(ContentRenderer renderer) throws IOException {
        super.renderProperties(renderer);
        render(renderer, "highlight", highlight);
        render(renderer, "hint", hint);
        render(renderer, "minLength", minLength);
    }

}
