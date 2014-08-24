package com.pnp.git.util;

/**
 *
 * @author Pankaj Patel
 * @version 1.0
 * @since 08/23/2014
 */
public class GITCommitId extends GITBaseTag {

    private int displayLehgth;

    public int getDisplayLehgth() {
        return displayLehgth;
    }

    public void setDisplayLehgth(int displayLehgth) {
        this.displayLehgth = displayLehgth;
    }

    @Override
    protected String getValue() {
        GITTag gitTag = getParentTag();
        return (gitTag.getGitInfo().getCommit() != null && getDisplayLehgth() > 0 && gitTag.getGitInfo().getCommit().length() > getDisplayLehgth()) ? gitTag.getGitInfo().getCommit().substring(0, getDisplayLehgth()) + "..." : gitTag.getGitInfo().getCommit();
    }

    @Override
    protected String getDivId() {
        return "git_commit_id";

    }
}
