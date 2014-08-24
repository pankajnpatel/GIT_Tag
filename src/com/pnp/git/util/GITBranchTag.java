package com.pnp.git.util;

/**
 *
 * @author Pankaj Patel
 * @version 1.0
 * @since 08/25/2014
 */
public class GITBranchTag extends GITBaseTag {

    @Override
    protected String getValue() {
        return getParentTag().getGitInfo().getBuildBranch();
    }

    @Override
    protected String getDivId() {
        return "git_branch";
    }
}
