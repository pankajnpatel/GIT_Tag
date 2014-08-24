package com.pnp.git.util;

import java.io.IOException;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;
import javax.servlet.jsp.tagext.TagSupport;

/**
 *
 * @author Pankaj Patel
 * @version 1.0
 * @since 08/23/2014
 */
public class GITTag extends TagSupport {

    private String cssClass;
    private String cssStyle;

    private static final GitInfo GIT_INFO = new GitInfo();

    public String getCssClass() {
        return cssClass;
    }

    public void setCssClass(String cssClass) {
        this.cssClass = cssClass;
    }

    public String getCssStyle() {
        return cssStyle;
    }

    public void setCssStyle(String cssStyle) {
        this.cssStyle = cssStyle;
    }

    public GitInfo getGitInfo() {
        return GIT_INFO;
    }

    @Override
    public int doStartTag() throws JspException {
        Tag tag = getParent();
        if (tag != null && (tag instanceof GITBaseTag || tag instanceof GITTag)) {
            throw new JspTagException("Tag 'commit' declered inside child tag");
        }
        try {
            pageContext.getOut().print("<div id='git_commit' class='" + getCssClass() + "' style='" + getCssStyle() + "'>");
        } catch (IOException ex) {
            throw new JspTagException("Error while rendaring GIT tag", ex);
        }
        return EVAL_BODY_INCLUDE;
    }

    @Override
    public int doEndTag() throws JspException {
        try {
            pageContext.getOut().print("</div>");
        } catch (IOException ex) {
            throw new JspTagException("Error while rendaring GITTag", ex);
        }
        return EVAL_PAGE;
    }
}
