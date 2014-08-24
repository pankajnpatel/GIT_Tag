package com.pnp.git.util;

/**
 *
 * @author Pankaj Patel
 * @version 1.0
 * @since 08/23/2014
 */
public class GITCommitDate extends GITBaseTag {

    @Override
    protected String getValue() {
        return getParentTag().getGitInfo().getCommitTime();
    }

    @Override
    protected String getDivId() {
        return "git_commit_date";
    }
}
