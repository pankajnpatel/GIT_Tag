package com.pnp.git.util;

import java.io.IOException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.BodyTagSupport;

/**
 *
 * @author Pankaj Patel
 * @version 1.0
 * @since 08/23/2014
 */
public abstract class GITBaseTag extends BodyTagSupport {

    private static final String EMPTY = "";
    private String label = EMPTY;
    private String labelCssClass = EMPTY;
    private String labelCssStyle = EMPTY;
    private String cssClass = EMPTY;
    private String cssStyle = EMPTY;

    public String getLabel() {
        return label;
    }

    /**
     * Method used to display label with value. Ex: Commit Id: 12323
     *
     * @param label Name/Value for label.
     */
    public void setLabel(String label) {
        this.label = label;
    }

    public String getCssClass() {
        return cssClass;
    }

    /**
     * Method used to set css class in HTML div.
     *
     * @param cssClass Name of css class.
     */
    public void setCssClass(String cssClass) {
        this.cssClass = cssClass;
    }

    public String getCssStyle() {
        return cssStyle;
    }

    /**
     * Method used to set css style in HTML div.
     *
     * @param cssStyle css style.
     */
    public void setCssStyle(String cssStyle) {
        this.cssStyle = cssStyle;
    }

    public String getLabelCssClass() {
        return labelCssClass;
    }

    /**
     * Method used to set css class for label attribute.
     *
     * @param labelCssClass Name of css class.
     */
    public void setLabelCssClass(String labelCssClass) {
        this.labelCssClass = labelCssClass;
    }

    public String getLabelCssStyle() {
        return labelCssStyle;
    }

    /**
     * Method used to set css style for label attribute.
     *
     * @param labelCssStyle css style.
     */
    public void setLabelCssStyle(String labelCssStyle) {
        this.labelCssStyle = labelCssStyle;
    }

    @Override
    public int doStartTag() throws JspTagException {
        GITTag gitTag = getParentTag();
        if (gitTag == null) {
            throw new JspTagException(getClass().getSimpleName() + " tag not defined inside the GITTag");
        }

        try {
            JspWriter out = pageContext.getOut();
            //Outer div
            out.print("<div id='" + getDivId() + "' class='" + getCssClass() + "' style='" + getCssStyle() + "'>");

            //div for label
            if (getLabel() != null && getLabel().length() > 0) {
                out.print("<div id='" + getDivId() + "_label' class='" + getLabelCssClass() + "' style='" + getLabelCssStyle() + "'>");
                out.print(getLabel());
                out.print("</div>");
            }
            //Commit info value.
            out.print(getValue());

            //End outer div
            out.print("</div>");

        } catch (IOException e) {
            throw new JspTagException("Error while rendaring " + getClass().getSimpleName() + " tag", e);
        }
        return (SKIP_BODY);
    }

    public GITTag getParentTag() {
        return (GITTag) findAncestorWithClass(this, GITTag.class);
    }

    protected abstract String getValue();

    protected abstract String getDivId();
}
