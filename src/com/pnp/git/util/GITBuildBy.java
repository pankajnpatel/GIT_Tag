package com.pnp.git.util;

/**
 *
 * @author Pankaj Patel
 * @version 1.0
 * @since 08/23/2014
 */
public class GITBuildBy extends GITBaseTag {

    @Override
    protected String getValue() {
        return getParentTag().getGitInfo().getBuildBy();
    }

    @Override
    protected String getDivId() {
        return "git_build_by";

    }
}
