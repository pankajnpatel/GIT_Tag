package com.pnp.git.util;

/**
 *
 * @author Pankaj Patel
 * @version 1.0
 * @since 08/23/2014
 */
public class GITBuildDate extends GITBaseTag {

    @Override
    protected String getValue() {
        return getParentTag().getGitInfo().getBuildTime();
    }

    @Override
    protected String getDivId() {
        return "git_build_date";
    }
}
