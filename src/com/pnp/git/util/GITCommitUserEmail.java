package com.pnp.git.util;

/**
 *
 * @author Pankaj Patel
 * @version 1.0
 * @since 08/23/2014
 */
public class GITCommitUserEmail extends GITBaseTag {

    @Override
    protected String getValue() {
        return getParentTag().getGitInfo().getCommitEmail();
    }

    @Override
    protected String getDivId() {
        return "git_commit_email";
    }
}
